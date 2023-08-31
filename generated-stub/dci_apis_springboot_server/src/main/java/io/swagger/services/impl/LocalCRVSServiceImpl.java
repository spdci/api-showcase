package io.swagger.services.impl;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.*;
import io.swagger.pojo.BirthRegistry;
import io.swagger.pojo.DeathRegistry;
import io.swagger.pojo.MarriageRegistry;
import io.swagger.repo.BirthRegRepository;
import io.swagger.repo.DeathRegRepository;
import io.swagger.repo.MarriageRegRepository;
import io.swagger.services.LocalCRVSService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.format.DateTimeFormatter;

import java.util.ArrayList;
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
    public RegistryOnsearchBody search(RegistrySearchBody payload) throws JsonProcessingException {

        int totalcount = 0;
        List<SearchResponseDataSearchResponse> searchResponseList = new ArrayList<SearchResponseDataSearchResponse>();

        SearchRequest searchRequest = ((SearchRequest) payload.getMessage());

        List<SearchRequestDataSearchRequest> searchRequestDataSearchRequests = searchRequest.getData().getSearchRequest();


        for (SearchRequestDataSearchRequest searchRequestDataSearchRequest : searchRequestDataSearchRequests) {

            SearchRequestDataSearchCriteria searchCriteria = searchRequestDataSearchRequest.getSearchCriteria();
            String eventType = searchRequestDataSearchRequest.getEventType();
            DciPersonRecord dciPersonRecord = new DciPersonRecord();
            if (searchCriteria != null && searchCriteria.getQuery() != null) {

                switch (eventType) {
                    case "1":
                        birthEvent(dciPersonRecord, searchCriteria);
                        break;
                    case "2":
                        deathEvent(dciPersonRecord, searchCriteria);
                        break;
                    case "3":
                       marriageEvent(dciPersonRecord, searchCriteria);
                        break;
                    default:
                        // log.info("Default");

                        break;
                }
            }
            totalcount++;
            System.out.println(" dciPersonRecord " + dciPersonRecord.toString());
            SearchResponseDataSearchResponse searchResponseDataSearchResponse = new SearchResponseDataSearchResponse();

            searchResponseDataSearchResponse.setReferenceId(searchRequestDataSearchRequest.getReferenceId());
            searchResponseDataSearchResponse.setTimestamp(searchRequestDataSearchRequest.getTimestamp());
            searchResponseDataSearchResponse.setStatus(RequestStatus.SUCC);
            searchResponseDataSearchResponse.setStatusReasonCode(SearchStatusReasonCode.REFERENCE_ID_INVALID);
            searchResponseDataSearchResponse.setStatusReasonMessage("");
            searchResponseDataSearchResponse.setRegistryType(searchRequestDataSearchRequest.getRegistryType());
            searchResponseDataSearchResponse.setEventType(searchRequestDataSearchRequest.getEventType());

            NotifyEventRequestDataRegistryData notifyEventRequestDataRegistryData = new NotifyEventRequestDataRegistryData();
            notifyEventRequestDataRegistryData.setRecord(dciPersonRecord);

            searchResponseDataSearchResponse.setRegistryData(notifyEventRequestDataRegistryData);
            // searchResponseDataSearchResponse.setPagination(searchRequestDataSearchRequest.get);
            searchResponseDataSearchResponse.setLocale(searchRequestDataSearchRequest.getLocale());

            searchResponseList.add(searchResponseDataSearchResponse);
        }


        RegistryOnsearchBody registryOnsearchBody = new RegistryOnsearchBody();
        registryOnsearchBody.setSignature(payload.getSignature());

        AllOfregistryOnsearchBodyHeader allOfregistryOnsearchBodyHeader = new AllOfregistryOnsearchBodyHeader();
        allOfregistryOnsearchBodyHeader.setVersion(payload.getHeader().getVersion());
        allOfregistryOnsearchBodyHeader.setMessageId(payload.getHeader().getMessageId());
        // allOfregistryOnsearchBodyHeader.setMessageTs(payload.getHeader().getMessageId());
        // message_ts
        //        sender_uri
        allOfregistryOnsearchBodyHeader.setAction(payload.getHeader().getAction());
        allOfregistryOnsearchBodyHeader.setSenderId(payload.getHeader().getSenderId());
        allOfregistryOnsearchBodyHeader.setReceiverId(payload.getHeader().getReceiverId());
        allOfregistryOnsearchBodyHeader.setTotalCount(totalcount);
        allOfregistryOnsearchBodyHeader.setEncryptionAlgo(payload.getHeader().getEncryptionAlgo());

        registryOnsearchBody.setHeader(allOfregistryOnsearchBodyHeader);

        SearchResponse searchBodyMessage = new SearchResponse();
        searchBodyMessage.setVersion(searchRequest.getVersion());

        SearchResponseData searchResponseData = new SearchResponseData();

        searchResponseData.setTransactionId(searchRequest.getData().getTransactionId());
        searchResponseData.setSearchResponse(searchResponseList);

        searchBodyMessage.setData(searchResponseData);
        registryOnsearchBody.setMessage(searchBodyMessage);

        return registryOnsearchBody;

    }


    private void birthEvent(DciPersonRecord dciPersonRecord, SearchRequestDataSearchCriteria searchCriteria) {


        BirthRegistry birth_data = new BirthRegistry();
        DciIdentifierTypeValue dciIdentifierTypeValue = ((DciIdentifierTypeValue) searchCriteria.getQuery());

        if (dciIdentifierTypeValue.getIdentifierType() == DciIdentifierType.BRN) {
            birth_data = birthRegRepository.findByRegistrationNumber(dciIdentifierTypeValue.getIdentifierValue());

        } else if (dciIdentifierTypeValue.getIdentifierType() == DciIdentifierType.UIN) {
            birth_data = birthRegRepository.findByRegistrationNumber(dciIdentifierTypeValue.getIdentifierValue());
        }


        dciPersonRecord.setIdentifierType(DciIdentifierType.BRN);
        dciPersonRecord.setIdentifier(birth_data.getRegistrationNumber());
        dciPersonRecord.setBirthdate(birth_data.getDateOfBirth());
        dciPersonRecord.sex(getGender(birth_data.getChildGender()));
        DciName humanName = getHumanName(birth_data.getFirstName(), birth_data.getFamilyName());
        dciPersonRecord.setName(humanName);


    }

    private void deathEvent(DciPersonRecord dciPersonRecord, SearchRequestDataSearchCriteria searchCriteria) {
        DeathRegistry deathRegistry = new DeathRegistry();
        DciIdentifierTypeValue dciIdentifierTypeValue = ((DciIdentifierTypeValue) searchCriteria.getQuery());

        if (dciIdentifierTypeValue.getIdentifierType() == DciIdentifierType.DRN) {
            deathRegistry = deathRegRepository.findByRegistrationNumber(dciIdentifierTypeValue.getIdentifierValue());

        } else if (dciIdentifierTypeValue.getIdentifierType() == DciIdentifierType.UIN) {
            deathRegistry = deathRegRepository.findByRegistrationNumber(dciIdentifierTypeValue.getIdentifierValue());
        }


        dciPersonRecord.setIdentifierType(DciIdentifierType.DRN);
        dciPersonRecord.setIdentifier(deathRegistry.getRegistrationNumber());
        dciPersonRecord.setDeathdate(getStringToDate(deathRegistry.getDateOfDeath()));
        dciPersonRecord.sex(DciSex._1);
        DciName humanName = getHumanName(deathRegistry.getFirstName(), deathRegistry.getFamilyName());
        dciPersonRecord.setName(humanName);
    }

    private void marriageEvent(DciPersonRecord dciPersonRecord, SearchRequestDataSearchCriteria searchCriteria) {

        MarriageRegistry marriageRegistry = new MarriageRegistry();

        DciIdentifierTypeValue dciIdentifierTypeValue = ((DciIdentifierTypeValue) searchCriteria.getQuery());

        if (dciIdentifierTypeValue.getIdentifierType() == DciIdentifierType.MRN) {
            marriageRegistry = marriageRegRepository.findByRegistrationNumber(dciIdentifierTypeValue.getIdentifierValue());

        } else if (dciIdentifierTypeValue.getIdentifierType() == DciIdentifierType.UIN) {

            marriageRegistry = marriageRegRepository.findByBrideNationalId(dciIdentifierTypeValue.getIdentifierValue());

          //  log.info(" marriageRegistry ", marriageRegistry.toString());
            if (marriageRegistry.getId() != null) {
                marriageRegistry = marriageRegRepository.findByGroomNationalId(dciIdentifierTypeValue.getIdentifierValue());
             //x   log.info(" marriageRegistry findByGroomNationalId ", marriageRegistry.toString());
            }
        }
        dciPersonRecord.setIdentifierType(DciIdentifierType.DRN);
        dciPersonRecord.setIdentifier(marriageRegistry.getRegistrationNumber());


        //        CRRelatedPerson groom = new CRRelatedPerson();
        //        HumanName groomhumanName = getHumanName(marriageRegistry.getGroomFirstName(),marriageRegistry.getGroomFamilyName());
        //        org.spdci.common.Identifier groomidentifierObj = new Identifier();
        //        groomidentifierObj.setIdentifierType("NATIONAL_ID");
        //        groomidentifierObj.setIdentifierValue(marriageRegistry.getGroomNationalId());
        //
        //        groom.setRelationship(Relationship.GROOM);
        //        groom.setName(groomhumanName);
        //        groom.setIdentifiers(Collections.singletonList(groomidentifierObj));
        //
        //        relatedPersons.add(groom);
        //
        //        CRRelatedPerson bride = new CRRelatedPerson();
        //        HumanName bridehumanName = getHumanName(marriageRegistry.getBrideFirstName(),marriageRegistry.getBrideFamilyName());
        //        org.spdci.common.Identifier brideIdentifierObj = new Identifier();
        //        brideIdentifierObj.setIdentifierType("NATIONAL_ID");
        //        brideIdentifierObj.setIdentifierValue(marriageRegistry.getBrideNationalId());
        //
        //        bride.setRelationship(Relationship.BRIDE);
        //        bride.setName(bridehumanName);
        //        bride.setIdentifiers(Collections.singletonList(brideIdentifierObj));
        //
        //        relatedPersons.add(bride);

    }


    public DciName getHumanName(String firstname, String familyname) {

        DciName humanName = new DciName();
        humanName.setGivenName(firstname);
        humanName.setSurName(familyname);

        return humanName;
    }

    private DciSex getGender(String childgender) {
        return childgender.equalsIgnoreCase("male") ? DciSex._1
                : childgender.equalsIgnoreCase("female") ? DciSex._2
                : DciSex._3;
    }

    public OffsetDateTime getStringToDate(String dateString) {
        LocalDate localDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return localDate.atStartOfDay().atOffset(ZoneOffset.UTC);
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
