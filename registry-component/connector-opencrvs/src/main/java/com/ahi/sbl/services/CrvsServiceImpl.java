package com.ahi.sbl.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ca.uhn.fhir.rest.client.interceptor.BearerTokenAuthInterceptor;

import com.ahi.common.*;
import com.ahi.common.HumanName;
import com.ahi.common.Identifier;
import com.ahi.enums.RequestStatus;
import com.ahi.enums.SearchStatusReasonCode;
import com.ahi.enums.SexDisplayText;
import com.ahi.request.SearchCriteria;
import com.ahi.response.SearchResponse;
import com.ahi.response.SearchResponseObject;
import com.ahi.sbl.pojo.*;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.dstu3.model.Composition;
import org.hl7.fhir.dstu3.model.Composition.SectionComponent;
import org.hl7.fhir.dstu3.model.Extension;
import org.hl7.fhir.dstu3.model.Task;
import org.hl7.fhir.instance.model.api.IBaseBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.IQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;


@Service
@Slf4j
public class CrvsServiceImpl implements CrvsService {
	private final String contactUrl = "http://opencrvs.org/specs/extension/contact-person-phone-number";
	private final String FATHER = "father";
	private final String MOTHER = "mother";
	private final String BIRTH_REGISTRATION_NUMBER = "BIRTH_REGISTRATION_NUMBER";
	private final String DEATH_REGISTRATION_NUMBER = "DEATH_REGISTRATION_NUMBER";
	private final String NATIONAL_ID = "NATIONAL_ID";

	@Autowired
	IGenericClient iGenericClient;

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	RestTemplate restTemplate;


	public String getContactNo(String brnDrn) {

		try {
			Bundle response = iGenericClient.search().forResource("Task").where(Task.IDENTIFIER.exactly().code(brnDrn)).returnBundle(Bundle.class).execute();

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

	String authToken = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJyZWNvcmRzZWFyY2giLCJkZW1vIl0sImlhdCI6MTY4MzcwMjk4MiwiZXhwIjoxNjgzNzAzNTgyLCJhdWQiOlsib3BlbmNydnM6YXV0aC11c2VyIiwib3BlbmNydnM6dXNlci1tZ250LXVzZXIiLCJvcGVuY3J2czpoZWFydGgtdXNlciIsIm9wZW5jcnZzOmdhdGV3YXktdXNlciIsIm9wZW5jcnZzOm5vdGlmaWNhdGlvbi11c2VyIiwib3BlbmNydnM6d29ya2Zsb3ctdXNlciIsIm9wZW5jcnZzOnNlYXJjaC11c2VyIiwib3BlbmNydnM6bWV0cmljcy11c2VyIiwib3BlbmNydnM6Y291bnRyeWNvbmZpZy11c2VyIiwib3BlbmNydnM6d2ViaG9va3MtdXNlciIsIm9wZW5jcnZzOmNvbmZpZy11c2VyIiwib3BlbmNydnM6ZG9jdW1lbnRzLXVzZXIiXSwiaXNzIjoib3BlbmNydnM6YXV0aC1zZXJ2aWNlIiwic3ViIjoiNjQyZWM1ODU3NjA5ZTMyZmJhODA5YTE4In0.RnJMu7XxCq17BTdhTixlZQbQ9NA7OCy5VqQJB9CkRPbeVYgniO3ZPE5_Jj8_RBAnafO82PM3-ckki97sfiggJxvRwt0Dkj732h3FETvBikh74DZ70GysbI6MyMMFYhGL1lOV8VQVMnRsNIYc5qJhgj9syArTUgsNzEFkFTFXZFP9fAS3IzTE7b41VQvkxqN05SWx132apBVOQOPPp2ZSqkSsyoixBJ5nICZkZkeePaWW1fvzuPEp68Gfn8cwkpKJwpUX2UiQ_CCNjLJnbm9aPJDa77BvOOOvBfWJCGFhySyAj3cf273evykVMqMoZBMlyIYy4f-teEwTO3nzt8BpcA";
	public Mono<Payload> proActiveSearch(Payload payload) {

		List<RequestResponse> e = new ArrayList<>();

		String mosipRegProcAuth = "https://auth.farajaland-demo.opencrvs.org/authenticateSystemClient";
		String RegProcAuthData =    "{\n" +
				"    \"client_id\": \"ebe491d5-ca62-4282-9290-79f350be2d58\",\n" +
				"    \"client_secret\": \"c551302d-af94-40fe-a347-145f166559ce\"\n" +
				"}";

		log.info("RegProcAuthData {} " + RegProcAuthData);
		HttpHeaders headersRegProc = getHttpHeaders();
		ResponseEntity<CrvsToken> sendmosipRegProcAuthTemplate = restTemplate.postForEntity(mosipRegProcAuth, new HttpEntity<>(RegProcAuthData, headersRegProc), CrvsToken.class);


		String graphqlurl = "https://gateway.farajaland-demo.opencrvs.org/graphql";
		headersRegProc.add("Authorization", "Bearer "+sendmosipRegProcAuthTemplate.getBody().getToken());


		int totalcount =0;
		List<CRRecord> cRRecord = new ArrayList<>();

		SearchCriteria searchCriteria = payload.getMessage().getSearchRequest().getData().get(0).getSearchCriteria();
		if(searchCriteria.getQuery()!=null) {
			CRRecord registryRecord = searchCriteria.getQuery();
			for (com.ahi.common.Identifier i : registryRecord.getIdentifier()) {
				totalcount++;

				if (i.getIdentifierType().equalsIgnoreCase("brn")) {

					RequestResponse e1 = getBirthRecord(graphqlurl, headersRegProc, i.getIdentifierValue());
					e.add(e1);
					CrvsResponse.CrvsData.SearchEvents.EventResult eventResult = e1.getBirthData().getData().getSearchEvents().getResults().get(0);

					CrvsResponse.CrvsData.SearchEvents.EventResult.Name childname = eventResult.getChildName().get(0);

					com.ahi.common.Identifier identifier = new Identifier();
					identifier.setIdentifierType(eventResult.getType().equalsIgnoreCase("Birth") ? "brn" : "drn");
					identifier.setIdentifierValue(eventResult.getRegistration().getRegistrationNumber());

					HumanName p = new HumanName();
					p.setGivenName(childname.getFirstNames());
					p.setSurName(childname.getFamilyName());

					com.ahi.common.Sex sex = new Sex();
					sex.setDisplayText(eventResult.getChildGender().equalsIgnoreCase("male") ? SexDisplayText.Male
									: eventResult.getChildGender().equalsIgnoreCase("female") ? SexDisplayText.Female
									: SexDisplayText.Unknown);

					CRRecord person = new CRRecord();

					List<com.ahi.common.Identifier> identifiers = new ArrayList<>();
					identifiers.add(identifier);
					person.setIdentifier(identifiers);
					person.setName(p);
					person.setSex(sex);
					cRRecord.add(person);
				}

			}
		}


	//	Header searchResponseHeader = payload.getHeaders();

//		searchResponseHeader.setVersion(payload.getHeaders().getVersion());
//		searchResponseHeader.setMessageId(payload.getHeaders().getMessageId());
//		searchResponseHeader.setMessageTs(payload.getHeaders().getMessageTs());
//		searchResponseHeader.setSenderId(payload.getHeaders().getSenderId());
//		searchResponseHeader.setReceiverId(payload.getHeaders().getReceiverId());
//		searchResponseHeader.setAction(payload.getHeaders().getAction());
//		searchResponseHeader.setTotalCount(payload.getHeaders().getTotalCount());
//		searchResponseHeader.setIsEncrypted(payload.getHeaders().getIsEncrypted());
//		searchResponseHeader.setEncryptionAlgorithm(payload.getHeaders().getEncryptionAlgorithm());
//		searchResponseHeader.setAsync(payload.getHeaders().getAsync());
//		searchResponseHeader.setCallbackEndpoint(payload.getHeaders().getCallbackEndpoint());
//		searchResponseHeader.setCompletedCount(0);




		log.info(" payload. {} " ,payload.getMessage().getSearchRequest().getData().get(0).getReferenceId());


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

		Payload s = new Payload(payload.getSignature(),payload.getHeaders(),payload.getMessage());
		s.getMessage().setSearchRequest(null);

//		String Marriagegraphqldata =
//				"{\"query\":\"query searchEvents($advancedSearchParameters: AdvancedSearchParametersInput!, $sort: String, $count: Int, $skip: Int) {\\r\\n  searchEvents(\\r\\n    advancedSearchParameters: $advancedSearchParameters\\r\\n    sort: $sort\\r\\n    count: $count\\r\\n    skip: $skip\\r\\n  ) {\\r\\n    totalItems\\r\\n    results {\\r\\n      id\\r\\n      type\\r\\n      registration {\\r\\n        eventLocationId # Place of marriage\\r\\n        registrationNumber # Registration number\\r\\n      }\\r\\n      ... on MarriageEventSearchSet {\\r\\n        dateOfMarriage # Date of marriage \\r\\n        brideName {\\r\\n          firstNames # First name(s) of bride\\r\\n          familyName # Last name of bride\\r\\n          use\\r\\n        }\\r\\n        brideIdentifier\\r\\n        groomName {\\r\\n          firstNames # First name(s) of groom\\r\\n          familyName # Last name of groom\\r\\n          use\\r\\n        }\\r\\n        groomIdentifier\\r\\n      } \\r\\n    }\\r\\n  }\\r\\n}\",\"variables\":{\n" +
//						"    \"advancedSearchParameters\": {\n" +
//						"        \"event\": \"marriage\",\n" +
//						"        \"nationalId\": \""+payload.getNatioanlid()+"\"\n" +
//						"      \n" +
//						"    },\n" +
//						"    \"sort\":\"DESC\"\n" +
//						"} }";
//
//		ResponseEntity<String> sMarriageResponse = restTemplate.postForEntity(graphqlurl, new HttpEntity<>(Marriagegraphqldata, headersRegProc), String.class);
//		System.out.println(sMarriageResponse.toString());
//		System.out.println(sMarriageResponse.getBody().toString());
//		ResponseEntity<CrvsResponse> MarriageResponse = restTemplate.postForEntity(graphqlurl, new HttpEntity<>(Marriagegraphqldata, headersRegProc), CrvsResponse.class);
//
//
//		e.setMarriageData(MarriageResponse.getBody());
//		if(MarriageResponse!=null && MarriageResponse.getBody()!=null
//		&& MarriageResponse.getBody().getData()!=null && MarriageResponse.getBody().getData().getSearchEvents()!=null
//				&& MarriageResponse.getBody().getData().getSearchEvents().getResults()!=null
//				&& MarriageResponse.getBody().getData().getSearchEvents().getResults().get(0)!=null
//				&& MarriageResponse.getBody().getData().getSearchEvents().getResults().get(0).getGroomIdentifier()!=null){
//			String Deathgraphqldata =    "{\"query\":\"query searchEvents($advancedSearchParameters: AdvancedSearchParametersInput!, $sort: String, $count: Int, $skip: Int) {\\r\\n  searchEvents(\\r\\n    advancedSearchParameters: $advancedSearchParameters\\r\\n    sort: $sort\\r\\n    count: $count\\r\\n    skip: $skip\\r\\n  ) {\\r\\n    totalItems\\r\\n    results {\\r\\n      id\\r\\n      type\\r\\n      registration {\\r\\n        eventLocationId # Place of death\\r\\n        registrationNumber # Registration number\\r\\n      }\\r\\n      ... on DeathEventSearchSet {\\r\\n        dateOfDeath # Date of death \\r\\n        deceasedName {\\r\\n          firstNames # First name(s)\\r\\n          familyName # Last name\\r\\n          use\\r\\n        }\\r\\n      }\\r\\n    }\\r\\n  }\\r\\n}\\r\\n\",\"variables\":{\n" +
//					"    \"advancedSearchParameters\": {\n" +
//					"        \"nationalId\": \""+MarriageResponse.getBody().getData().getSearchEvents().getResults().get(0).getGroomIdentifier()+"\",\n" +
//				//	"        \"nationalId\": \"2187516526\",\n" +
// 					"        \"event\": \"death\"\n" +
//					"    },\n" +
//					"    \"sort\":\"DESC\"\n" +
//					"} }";
//
//			ResponseEntity<CrvsResponse> DeathResponse = restTemplate.postForEntity(graphqlurl, new HttpEntity<>(Deathgraphqldata, headersRegProc), CrvsResponse.class);
//
//			e.setDeathData(DeathResponse.getBody());
//		}





	return Mono.just(s);
	}

	public RequestResponse getBirthRecord(String graphqlurl, HttpHeaders headersRegProc, String brn){

		RequestResponse e = new RequestResponse();

		String Birthgraphqldata =    "{\"query\":\"query searchEvents($advancedSearchParameters: AdvancedSearchParametersInput!, $sort: String, $count: Int, $skip: Int) {\\r\\n  searchEvents(\\r\\n    advancedSearchParameters: $advancedSearchParameters\\r\\n    sort: $sort\\r\\n    count: $count\\r\\n    skip: $skip\\r\\n  ) {\\r\\n    totalItems\\r\\n    results {\\r\\n      type\\r\\n      registration {\\r\\n        registrationNumber # BRN\\r\\n        eventLocationId # Place of birth\\r\\n        registeredLocationId\\r\\n        createdAt\\r\\n      }\\r\\n      ... on BirthEventSearchSet {\\r\\n        childGender # Sex\\r\\n        dateOfBirth # Date of birth\\r\\n        childName {\\r\\n          firstNames # First name (s)\\r\\n          familyName # Last name\\r\\n          use\\r\\n        }\\r\\n      }\\r\\n    }\\r\\n  }\\r\\n}\\r\\n\",\"variables\":{\n" +
				"    \"advancedSearchParameters\": {\n" +
				"        \"event\": \"birth\",\n" +
				(brn!=null && !brn.isEmpty() ? "  \"registrationNumber\": \""+brn+"\"\n":"")+
//						:
//				(payload.getFirstname()!=null && !payload.getFirstname().isEmpty() ? "  \"name\": \""+payload.getFirstname()+" "+payload.getLastname()+"\",\n":"") +
//				(payload.getBirthdate()!=null && !payload.getBirthdate().isEmpty() ? "   \"childDoB\": \""+payload.getBirthdate()+"\"\n":"")
				//) +

				"    },\n" +
				"    \"sort\":\"DESC\"\n" +
				"}\n" +
				"\n" +
				" }";
		System.out.println("Birthgraphqldata :"  +Birthgraphqldata);
		ResponseEntity<CrvsResponse> BirthResponse = restTemplate.postForEntity(graphqlurl, new HttpEntity<>(Birthgraphqldata, headersRegProc), CrvsResponse.class);
		System.out.println(BirthResponse.toString());

		e.setBirthData(BirthResponse.getBody());

		System.out.println(" -- " +e.toString());
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
