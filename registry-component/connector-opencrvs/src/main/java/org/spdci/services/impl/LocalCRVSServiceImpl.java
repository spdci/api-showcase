package org.spdci.services.impl;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.spdci.common.*;
import org.spdci.enums.*;
import org.spdci.pojo.BirthRegistry;
import org.spdci.pojo.DeathRegistry;
import org.spdci.pojo.MarriageRegistry;
import org.spdci.pojo.RequestResponse;
import org.spdci.repo.BirthRegRepository;
import org.spdci.repo.DeathRegRepository;
import org.spdci.repo.MarriageRegRepository;
import org.spdci.request.SearchCriteria;
import org.spdci.response.SearchResponse;
import org.spdci.response.SearchResponseObject;
import org.spdci.services.LocalCRVSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class LocalCRVSServiceImpl implements LocalCRVSService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ObjectMapper objectMapper;


    @Autowired
    BirthRegRepository birthRegRepository;

    @Autowired
    DeathRegRepository deathRegRepository;

    @Autowired
    MarriageRegRepository marriageRegRepository;

    @Override
    public Mono<Payload> search(Payload payload) throws JsonProcessingException {

        List<RequestResponse> e = new ArrayList<>();

        SearchCriteria searchCriteria = payload.getMessage().getSearchRequest().getData().get(0).getSearchCriteria();
        CREventType eventType = payload.getMessage().getSearchRequest().getData().get(0).getEventType();
        int totalcount = 0;
        List<CRRecord> cRRecord = new ArrayList<>();

        if (searchCriteria != null && searchCriteria.getQuery() != null) {

            switch (eventType) {
                case BIRTH:
                    birthEvent(cRRecord, searchCriteria);
                    break;
                case DEATH:
                    deathEvent(cRRecord, searchCriteria);
                    break;
                case MARRIAGE:
                    marriageEvent(cRRecord, searchCriteria);
                    break;
                default:
                    log.info("Default");

                    break;
            }
        }
        totalcount = cRRecord.size();

        log.info(" payload. {} ", payload.getMessage().getSearchRequest().getData().get(0).getReferenceId());

        SearchResponse searchResponse = new SearchResponse();

        SearchResponseObject data = getSearchResponseObject(payload, cRRecord);

        List<SearchResponseObject> dataList = new ArrayList<>();
        dataList.add(data);

        searchResponse.setData(dataList);

        payload.getMessage().setSearchResponse(searchResponse);

        payload.getHeaders().setCompletedCount(totalcount);

        payload.getMessage().getSearchResponse().getData().get(0).getPagination().setTotalRecord(totalcount);

        Payload s = new Payload(payload.getSignature(), payload.getHeaders(), payload.getMessage());
        s.getMessage().setSearchRequest(null);

        return Mono.just(s);

    }

    private SearchResponseObject getSearchResponseObject(Payload payload, List<CRRecord> cRRecord) {
        SearchResponseObject data = new SearchResponseObject();

        data.setReferenceId(payload.getMessage().getSearchRequest().getData().get(0).getReferenceId());
        data.setTimestamp(payload.getMessage().getSearchRequest().getData().get(0).getTimestamp());
        data.setStatus(RequestStatus.SUCC);
        data.setStatusReasonCode(SearchStatusReasonCode.RJCT_SIGNATURE_KEY_MISSING);
        data.setStatusReasonMessage("--");
        data.setRegistryType(payload.getMessage().getSearchRequest().getData().get(0).getRegistryType());
        data.setEventType(payload.getMessage().getSearchRequest().getData().get(0).getEventType());
        data.setPagination(payload.getMessage().getSearchRequest().getData().get(0).getPagination());
        data.setLocale(payload.getMessage().getSearchRequest().getData().get(0).getLocale());

        data.setRegistryData(cRRecord);
        return data;
    }

    private void birthEvent(List<CRRecord> cRRecord, SearchCriteria searchCriteria) {

        CRRecord registryRecord = searchCriteria.getQuery();
        BirthRegistry birthRegistry = new BirthRegistry();
        for (org.spdci.common.Identifier identifier : registryRecord.getIdentifier()) {
            if (identifier.getIdentifierType().equalsIgnoreCase("brn")) {
                birthRegistry = birthRegRepository.findByRegistrationNumber(identifier.getIdentifierValue());

            } else if (identifier.getIdentifierType().equalsIgnoreCase("national_id")) {
                birthRegistry = birthRegRepository.findByRegistrationNumber(identifier.getIdentifierValue());
            }
        }

        org.spdci.common.Identifier identifierObj = new Identifier();
        identifierObj.setIdentifierType("BRN");
        identifierObj.setIdentifierValue(birthRegistry.getRegistrationNumber());

        HumanName humanName = getHumanName(birthRegistry.getFirstName(),birthRegistry.getFamilyName());

        org.spdci.common.Sex sex = Sex.builder().displayText(getGender(birthRegistry.getChildGender())).build();

        CRRecord person = CRRecord.builder().identifier(Collections.singletonList(identifierObj))//
                .name(humanName)//
                .sex(sex)//
                .birthDate(getStringToDate(birthRegistry.getDateOfBirth())).build();

        cRRecord.add(person);
    }

    private void deathEvent(List<CRRecord> cRRecord, SearchCriteria searchCriteria) {

        CRRecord registryRecord = searchCriteria.getQuery();
        DeathRegistry deathRegistry = new DeathRegistry();
        for (org.spdci.common.Identifier identifier : registryRecord.getIdentifier()) {
            if (identifier.getIdentifierType().equalsIgnoreCase("drn")) {
                deathRegistry = deathRegRepository.findByRegistrationNumber(identifier.getIdentifierValue());

            } else if (identifier.getIdentifierType().equalsIgnoreCase("national_id")) {
                deathRegistry = deathRegRepository.findByNationalId(identifier.getIdentifierValue());
            }
        }

        org.spdci.common.Identifier identifierObj = new Identifier();
        identifierObj.setIdentifierType("DRN");
        identifierObj.setIdentifierValue(deathRegistry.getRegistrationNumber());

        HumanName humanName = getHumanName(deathRegistry.getFirstName(),deathRegistry.getFamilyName());
//        SexDisplayText getSexDisplayText = eventResult.getDeceasedGender().equalsIgnoreCase("male")
//                ? SexDisplayText.Male
//                : eventResult.getDeceasedGender().equalsIgnoreCase("female") ? SexDisplayText.Female
//                : SexDisplayText.Unknown;
//        org.spdci.common.Sex sex = Sex.builder().displayText(getSexDisplayText).build();

        CRRecord person = CRRecord.builder().identifier(Collections.singletonList(identifierObj))//
                .name(humanName)//
                 // .sex(sex)//
                .deathDate(getStringToDate(deathRegistry.getDateOfDeath())).build();

        cRRecord.add(person);

        cRRecord.add(person);
    }



    private void marriageEvent(List<CRRecord> cRRecord, SearchCriteria searchCriteria) {

        CRRecord registryRecord = searchCriteria.getQuery();
        MarriageRegistry marriageRegistry = new MarriageRegistry();
        for (org.spdci.common.Identifier identifier : registryRecord.getIdentifier()) {
            if (identifier.getIdentifierType().equalsIgnoreCase("mrn")) {
                marriageRegistry = marriageRegRepository.findByRegistrationNumber(identifier.getIdentifierValue());

            } else if (identifier.getIdentifierType().equalsIgnoreCase("national_id")) {

                marriageRegistry = marriageRegRepository.findByBrideNationalId(identifier.getIdentifierValue());

                log.info(" marriageRegistry ", marriageRegistry.toString());
                if( marriageRegistry.getId()!=null){
                    marriageRegistry = marriageRegRepository.findByGroomNationalId(identifier.getIdentifierValue());
                    log.info(" marriageRegistry findByGroomNationalId ", marriageRegistry.toString());
                }

            }
        }

        org.spdci.common.Identifier identifierObj = new Identifier();
        identifierObj.setIdentifierType("MRN");
        identifierObj.setIdentifierValue(marriageRegistry.getRegistrationNumber());

        List<CRRelatedPerson> relatedPersons = new ArrayList<>();

        CRRelatedPerson groom = new CRRelatedPerson();
        HumanName groomhumanName = getHumanName(marriageRegistry.getGroomFirstName(),marriageRegistry.getGroomFamilyName());
        org.spdci.common.Identifier groomidentifierObj = new Identifier();
        groomidentifierObj.setIdentifierType("NATIONAL_ID");
        groomidentifierObj.setIdentifierValue(marriageRegistry.getGroomNationalId());

        groom.setRelationship(Relationship.GROOM);
        groom.setName(groomhumanName);
        groom.setIdentifiers(Collections.singletonList(groomidentifierObj));

        relatedPersons.add(groom);

        CRRelatedPerson bride = new CRRelatedPerson();
        HumanName bridehumanName = getHumanName(marriageRegistry.getBrideFirstName(),marriageRegistry.getBrideFamilyName());
        org.spdci.common.Identifier brideIdentifierObj = new Identifier();
        brideIdentifierObj.setIdentifierType("NATIONAL_ID");
        brideIdentifierObj.setIdentifierValue(marriageRegistry.getBrideNationalId());

        bride.setRelationship(Relationship.BRIDE);
        bride.setName(bridehumanName);
        bride.setIdentifiers(Collections.singletonList(brideIdentifierObj));

        relatedPersons.add(bride);

        CRRecord person = CRRecord.builder().identifier(Collections.singletonList(identifierObj))//
                .maritalStatus("Married")//
                .marriageDate(getStringToDate(marriageRegistry.getDateOfMarriage()))//
                .registrationDate(null)//
                .relatedPerson(relatedPersons)//
                .build();

        cRRecord.add(person);
    }

    public HumanName getHumanName(String firstname, String familyname) {

        HumanName humanName = new HumanName();
        humanName.setGivenName(firstname);
        humanName.setSurName(familyname);

        return humanName;
    }

    private SexDisplayText getGender(String childgender) {
        return childgender.equalsIgnoreCase("male") ? SexDisplayText.Male
                : childgender.equalsIgnoreCase("female") ? SexDisplayText.Female
                : SexDisplayText.Unknown;
    }

    public LocalDateTime getStringToDate(String dateString) {
        LocalDate date = LocalDate.parse(dateString);
        return date.atStartOfDay();
    }

    private Object castToRequiredType(Class fieldType, String value) {
        if (fieldType.isAssignableFrom(Double.class)) {
            return Double.valueOf(value);
        } else if (fieldType.isAssignableFrom(Integer.class)) {
            return Integer.valueOf(value);
        } else if (Enum.class.isAssignableFrom(fieldType)) {
            return Enum.valueOf(fieldType, value);
        }
        return value;
    }

    private Object castToRequiredType(Class fieldType, List<String> value) {
        List<Object> lists = new ArrayList<>();
        for (String s : value) {
            lists.add(castToRequiredType(fieldType, s));
        }
        return lists;
    }


}
