package com.ahi.sbl.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.dstu3.model.Extension;
import org.hl7.fhir.dstu3.model.Task;
import org.spdci.common.*;
import org.spdci.enums.*;
import org.spdci.response.SearchResponse;
import org.spdci.response.SearchResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import org.spdci.request.SearchCriteria;
import com.ahi.sbl.pojo.CrvsResponse;
import com.ahi.sbl.pojo.CrvsToken;
import com.ahi.sbl.pojo.RequestResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import ca.uhn.fhir.rest.client.api.IGenericClient;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class CrvsServiceImpl implements CrvsService {

	private final String contactUrl = "http://opencrvs.org/specs/extension/contact-person-phone-number";

	@Autowired
	IGenericClient iGenericClient;

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	RestTemplate restTemplate;

	public String getContactNo(String brnDrn) {

		try {
			Bundle response = iGenericClient.search().forResource("Task").where(Task.IDENTIFIER.exactly().code(brnDrn))
					.returnBundle(Bundle.class).execute();

			List<BundleEntryComponent> dataFromCrvs = response.getEntry();

			if (!CollectionUtils.isEmpty(dataFromCrvs)) {
				for (BundleEntryComponent val : dataFromCrvs) {
					Task task = (Task) val.getResource();
					for (Extension ext : task.getExtension()) {

						if (ext.getUrl().equalsIgnoreCase(contactUrl)) {
							return ext.getValue().toString();
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public Mono<Payload> proActiveSearch(Payload payload) {

		List<RequestResponse> e = new ArrayList<>();

		String mosipRegProcAuth = "https://auth.farajaland-demo.opencrvs.org/authenticateSystemClient";
		String credentials = "{\n" + "    \"client_id\": \"ebe491d5-ca62-4282-9290-79f350be2d58\",\n"
				+ "    \"client_secret\": \"c551302d-af94-40fe-a347-145f166559ce\"\n" + "}";

		log.info("credentials {} " + credentials);

		HttpHeaders headersRegProc = getHttpHeaders();
		HttpEntity<String> httpEntity = new HttpEntity<>(credentials, headersRegProc);

		ResponseEntity<CrvsToken> authCall = restTemplate.postForEntity(mosipRegProcAuth, httpEntity, CrvsToken.class);

		String graphqlurl = "https://gateway.farajaland-demo.opencrvs.org/graphql";
		headersRegProc.add("Authorization", "Bearer " + authCall.getBody().getToken());

		int totalcount = 0;
		List<CRRecord> cRRecord = new ArrayList<>();

		SearchCriteria searchCriteria = payload.getMessage().getSearchRequest().getData().get(0).getSearchCriteria();
		if ( searchCriteria!=null && searchCriteria.getQuery() != null) {

			if ( payload.getMessage().getSearchRequest().getData().get(0).getEventType()!=null &&
			payload.getMessage().getSearchRequest().getData().get(0).getEventType().equals(CREventType.BIRTH)) {

				CRRecord registryRecord = searchCriteria.getQuery();

				RequestResponse e1 = getBirthRecord(graphqlurl, headersRegProc, registryRecord.getIdentifier());
				e.add(e1);
				CrvsResponse.CrvsData.SearchEvents.EventResult eventResult = e1.getBirthData().getData()
						.getSearchEvents().getResults().get(0);

				org.spdci.common.Identifier identifierObj = new Identifier();
				identifierObj.setIdentifierType("BRN");
				identifierObj.setIdentifierValue(eventResult.getRegistration().getRegistrationNumber());

				HumanName humanName =  getEnName(eventResult.getChildName());

				org.spdci.common.Sex sex = new Sex();
				sex.setDisplayText(eventResult.getChildGender().equalsIgnoreCase("male") ? SexDisplayText.Male
						: eventResult.getChildGender().equalsIgnoreCase("female") ? SexDisplayText.Female
						: SexDisplayText.Unknown);

				CRRecord person = new CRRecord();
				person.setIdentifier(Collections.singletonList(identifierObj));
				person.setName(humanName);
				person.setSex(sex);
				person.setBirthDate(getStringToDate(eventResult.getDateOfBirth()));
				cRRecord.add(person);
			}else if ( payload.getMessage().getSearchRequest().getData().get(0).getEventType()!=null &&
					payload.getMessage().getSearchRequest().getData().get(0).getEventType().equals(CREventType.DEATH)) {

				CRRecord registryRecord = searchCriteria.getQuery();

				RequestResponse e1 = getDeathRecord(graphqlurl, headersRegProc, registryRecord.getIdentifier());
				e.add(e1);
				CrvsResponse.CrvsData.SearchEvents.EventResult eventResult = e1.getDeathData().getData()
						.getSearchEvents().getResults().get(0);

				org.spdci.common.Identifier identifierObj = new Identifier();
				identifierObj.setIdentifierType( "DRN" );
				identifierObj.setIdentifierValue(eventResult.getRegistration().getRegistrationNumber());

				HumanName humanName =  getEnName(eventResult.getDeceasedName());

				org.spdci.common.Sex sex = new Sex();
				sex.setDisplayText(eventResult.getDeceasedGender().equalsIgnoreCase("male") ? SexDisplayText.Male
						: eventResult.getDeceasedGender().equalsIgnoreCase("female") ? SexDisplayText.Female
						: SexDisplayText.Unknown);

				CRRecord person = new CRRecord();

				person.setIdentifier(Collections.singletonList(identifierObj));
				person.setName(humanName);
				person.setSex(sex);
				person.setDeathDate(getStringToDate(eventResult.getDateOfDeath()));
				cRRecord.add(person);


			}else if ( payload.getMessage().getSearchRequest().getData().get(0).getEventType()!=null &&
					payload.getMessage().getSearchRequest().getData().get(0).getEventType().equals(CREventType.MARRIAGE)) {

				CRRecord registryRecord = searchCriteria.getQuery();

				RequestResponse e1 = getMarriageRecord(graphqlurl, headersRegProc, registryRecord.getIdentifier());
				e.add(e1);
				CrvsResponse.CrvsData.SearchEvents.EventResult eventResult = e1.getMarriageData().getData().getSearchEvents().getResults().get(0);


				org.spdci.common.Identifier identifierObj = new Identifier();
				identifierObj.setIdentifierType( "MRN" );
				identifierObj.setIdentifierValue(eventResult.getRegistration().getRegistrationNumber());

				List<CRRelatedPerson> relatedPersons = new ArrayList<>();

				CRRelatedPerson groom = new CRRelatedPerson();
				HumanName groomhumanName = getEnName(eventResult.getGroomName());
				org.spdci.common.Identifier groomidentifierObj = new Identifier();
				groomidentifierObj.setIdentifierType("NATIONAL_ID");
				groomidentifierObj.setIdentifierValue(eventResult.getGroomIdentifier());

				groom.setRelationship(Relationship.GROOM);
				groom.setName(groomhumanName);
				groom.setIdentifiers(Collections.singletonList(groomidentifierObj));

				relatedPersons.add(groom);


				CRRelatedPerson bride = new CRRelatedPerson();
				HumanName bridehumanName = getEnName(eventResult.getBrideName());
				org.spdci.common.Identifier brideIdentifierObj = new Identifier();
				brideIdentifierObj.setIdentifierType("NATIONAL_ID");
				brideIdentifierObj.setIdentifierValue(eventResult.getBrideIdentifier());

				bride.setRelationship(Relationship.BRIDE);
				bride.setName(bridehumanName);
				bride.setIdentifiers(Collections.singletonList(brideIdentifierObj));

				relatedPersons.add(bride);

				CRRecord person = new CRRecord();

				person.setIdentifier(Collections.singletonList(identifierObj));
				person.setMaritalStatus("Married");
				person.setMarriageDate(getStringToDate(eventResult.getDateOfMarriage()));
				person.setRegistrationDate(null);
				person.setRelatedPerson(relatedPersons);
				cRRecord.add(person);

			}

		}

		totalcount =cRRecord.size();

		log.info(" payload. {} ", payload.getMessage().getSearchRequest().getData().get(0).getReferenceId());

		SearchResponse searchResponse = new SearchResponse();

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

		List<SearchResponseObject> datas = new ArrayList<>();
		datas.add(data);

 		searchResponse.setData(datas);

 		payload.getMessage().setSearchResponse(searchResponse);

		payload.getHeaders().setCompletedCount(totalcount);

		payload.getMessage().getSearchResponse().getData().get(0).getPagination().setTotalRecord(totalcount);

		Payload s = new Payload(payload.getSignature(), payload.getHeaders(), payload.getMessage());
		s.getMessage().setSearchRequest(null);



		return Mono.just(s);
	}

	public HumanName getEnName(List<CrvsResponse.CrvsData.SearchEvents.EventResult.Name> humananmes) {

		HumanName humanName = new HumanName();

		CrvsResponse.CrvsData.SearchEvents.EventResult.Name humanname = null;

		for (CrvsResponse.CrvsData.SearchEvents.EventResult.Name name : humananmes) {
			if ("en".equals(name.getUse())) {
				 humanName.setGivenName(name.getFirstNames());
				humanName.setSurName(name.getFamilyName());
				break;
			}
		}
		return humanName;
	}

	public LocalDateTime getStringToDate(String dateString){
		LocalDate date = LocalDate.parse(dateString);
		return date.atStartOfDay();
	}

	public RequestResponse getBirthRecord(String graphqlurl, HttpHeaders headersRegProc,  List<org.spdci.common.Identifier> identifiers ) {

		RequestResponse e = new RequestResponse();

		String Birthgraphqldata = "{\"query\":\"query searchEvents($advancedSearchParameters: AdvancedSearchParametersInput!, $sort: String, $count: Int, $skip: Int) {\\r\\n  searchEvents(\\r\\n    advancedSearchParameters: $advancedSearchParameters\\r\\n    sort: $sort\\r\\n    count: $count\\r\\n    skip: $skip\\r\\n  ) {\\r\\n    totalItems\\r\\n    results {\\r\\n      type\\r\\n      registration {\\r\\n        registrationNumber # BRN\\r\\n        eventLocationId # Place of birth\\r\\n        registeredLocationId\\r\\n        createdAt\\r\\n      }\\r\\n      ... on BirthEventSearchSet {\\r\\n        childGender # Sex\\r\\n        dateOfBirth # Date of birth\\r\\n        childName {\\r\\n          firstNames # First name (s)\\r\\n          familyName # Last name\\r\\n          use\\r\\n        }\\r\\n      }\\r\\n    }\\r\\n  }\\r\\n}\\r\\n\",\"variables\":{\n"
				+ "    \"advancedSearchParameters\": {\n" + "        \"event\": \"birth\" \n";
				//+ (brn != null && !brn.isEmpty() ? "  \"registrationNumber\": \"" + brn + "\"\n" : "") +

		for (org.spdci.common.Identifier identifier : identifiers) {

			if (identifier.getIdentifierType().equalsIgnoreCase("brn")) {
				Birthgraphqldata = Birthgraphqldata + ",  \"registrationNumber\": \"" + identifier.getIdentifierValue() + "\" \n";
			}else if (identifier.getIdentifierType().equalsIgnoreCase("national_id")) {
				Birthgraphqldata = Birthgraphqldata + ",   \"nationalId\": \""+identifier.getIdentifierValue()+"\" \n" ;
			}
		}


//						:
//				(payload.getFirstname()!=null && !payload.getFirstname().isEmpty() ? "  \"name\": \""+payload.getFirstname()+" "+payload.getLastname()+"\",\n":"") +
//				(payload.getBirthdate()!=null && !payload.getBirthdate().isEmpty() ? "   \"childDoB\": \""+payload.getBirthdate()+"\"\n":"")
				// ) +

		Birthgraphqldata = Birthgraphqldata +"    },\n" + "    \"sort\":\"DESC\"\n" + "}\n" + "\n" + " }";
		System.out.println("Birthgraphqldata :" + Birthgraphqldata);
		ResponseEntity<CrvsResponse> BirthResponse = restTemplate.postForEntity(graphqlurl,
				new HttpEntity<>(Birthgraphqldata, headersRegProc), CrvsResponse.class);
		System.out.println(BirthResponse.toString());

		e.setBirthData(BirthResponse.getBody());

		System.out.println(" -- " + e.toString());
		return e;
	}

	public RequestResponse getDeathRecord(String graphqlurl, HttpHeaders headersRegProc,  List<org.spdci.common.Identifier> identifiers) {

		RequestResponse e = new RequestResponse();

		String Deathgraphqldata =    "{\"query\":\"query searchEvents($advancedSearchParameters: AdvancedSearchParametersInput!, $sort: String, $count: Int, $skip: Int) {\\r\\n  searchEvents(\\r\\n    advancedSearchParameters: $advancedSearchParameters\\r\\n    sort: $sort\\r\\n    count: $count\\r\\n    skip: $skip\\r\\n  ) {\\r\\n    totalItems\\r\\n    results {\\r\\n      id\\r\\n      type\\r\\n      registration {\\r\\n        eventLocationId # Place of death\\r\\n        registrationNumber # Registration number\\r\\n      }\\r\\n      ... on DeathEventSearchSet {\\r\\n   deceasedGender \\r\\n     dateOfDeath # Date of death \\r\\n        deceasedName {\\r\\n          firstNames # First name(s)\\r\\n          familyName # Last name\\r\\n          use\\r\\n        }\\r\\n      }\\r\\n    }\\r\\n  }\\r\\n}\\r\\n\",\"variables\":{\n" +
				"    \"advancedSearchParameters\": {\n" +
				"      \"event\": \"death\"" ;


		for (org.spdci.common.Identifier identifier : identifiers) {

			if (identifier.getIdentifierType().equalsIgnoreCase("drn")) {
				Deathgraphqldata = Deathgraphqldata + ",  \"registrationNumber\": \"" + identifier.getIdentifierValue() + "\" \n";
			}else if (identifier.getIdentifierType().equalsIgnoreCase("national_id")) {
				Deathgraphqldata = Deathgraphqldata + ",   \"nationalId\": \""+identifier.getIdentifierValue()+"\" \n" ;
			}
		}

		Deathgraphqldata = Deathgraphqldata +	"   },\n" +
				"    \"sort\":\"DESC\"\n" +
				"} }";

		ResponseEntity<CrvsResponse> DeathResponse = restTemplate.postForEntity(graphqlurl, new HttpEntity<>(Deathgraphqldata, headersRegProc), CrvsResponse.class);

		e.setDeathData(DeathResponse.getBody());

		System.out.println(" -- " + e.toString());
		return e;
	}

	public RequestResponse getMarriageRecord(String graphqlurl, HttpHeaders headersRegProc, List<org.spdci.common.Identifier> identifiers) {

		RequestResponse e = new RequestResponse();

		String Marriagegraphqldata =
				"{\"query\":\"query searchEvents($advancedSearchParameters: AdvancedSearchParametersInput!, $sort: String, $count: Int, $skip: Int) {\\r\\n  searchEvents(\\r\\n    advancedSearchParameters: $advancedSearchParameters\\r\\n    sort: $sort\\r\\n    count: $count\\r\\n    skip: $skip\\r\\n  ) {\\r\\n    totalItems\\r\\n    results {\\r\\n      id\\r\\n      type\\r\\n      registration {\\r\\n        eventLocationId # Place of marriage\\r\\n        registrationNumber # Registration number\\r\\n      }\\r\\n      ... on MarriageEventSearchSet {\\r\\n        dateOfMarriage # Date of marriage \\r\\n        brideName {\\r\\n          firstNames # First name(s) of bride\\r\\n          familyName # Last name of bride\\r\\n          use\\r\\n        }\\r\\n        brideIdentifier\\r\\n        groomName {\\r\\n          firstNames # First name(s) of groom\\r\\n          familyName # Last name of groom\\r\\n          use\\r\\n        }\\r\\n        groomIdentifier\\r\\n      } \\r\\n    }\\r\\n  }\\r\\n}\",\"variables\":{\n" +
						"    \"advancedSearchParameters\": {\n" +
						"        \"event\": \"marriage\"  \n" ;

		for (org.spdci.common.Identifier identifier : identifiers) {

			if (identifier.getIdentifierType().equalsIgnoreCase("mrn")) {
				Marriagegraphqldata = Marriagegraphqldata + ",  \"registrationNumber\": \"" + identifier.getIdentifierValue() + "\" \n";
			}else if (identifier.getIdentifierType().equalsIgnoreCase("national_id")) {
				Marriagegraphqldata = Marriagegraphqldata + ",   \"nationalId\": \""+identifier.getIdentifierValue()+"\" \n" ;
			}
		}

		Marriagegraphqldata = Marriagegraphqldata+"       },\n" +
						"    \"sort\":\"DESC\"\n" +
						"} }";
		ResponseEntity<CrvsResponse> MarriageResponse = restTemplate.postForEntity(graphqlurl, new HttpEntity<>(Marriagegraphqldata, headersRegProc), CrvsResponse.class);

		e.setMarriageData(MarriageResponse.getBody());
		System.out.println(" -- " + e.toString());
		return e;
	}

	private static HttpHeaders getHttpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		// headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", "*/*");
		headers.add("Accept-Encoding", "gzip, deflate, br");
		return headers;
	}
}
