package com.ahi.sbl.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ca.uhn.fhir.rest.client.interceptor.BearerTokenAuthInterceptor;
import com.ahi.proto.common.*;
import com.ahi.proto.common.Identifier;
import com.ahi.proto.enums.SearchRequestStatusEnum;
import com.ahi.proto.enums.SearchStatusReasonCodeEnum;
import com.ahi.proto.enums.SexDisplayTextEnum;
import com.ahi.proto.request.ResponseMessage;
import com.ahi.proto.request.SearchCriteriaRequest;
import com.ahi.proto.request.SearchRequest;
import com.ahi.proto.response.*;
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
	public Mono<SearchResponse> proActiveSearch(SearchRequest payload) {


		//
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



		List<RegistryDataResponse> registryDataResponses = new ArrayList<>();

		SearchCriteriaRequest searchCriteria = payload.getRequestMessage().getRequestMessage().getSearchRequest().getRequestData(0).getSearchCriteria();
		if(searchCriteria.hasRegistryRecord()){
			RegistryRecord registryRecord = searchCriteria.getRegistryRecord();
			for(com.ahi.proto.common.Identifier i : registryRecord.getIdentifierList()){

				if(i.getType().equalsIgnoreCase("brn")){

					RequestResponse e1 = getBirthRecord(graphqlurl,headersRegProc,i.getValue());
					e.add(e1);
					CrvsResponse.CrvsData.SearchEvents.EventResult eventResult = e1.getBirthData().getData().getSearchEvents().getResults().get(0) ;

					CrvsResponse.CrvsData.SearchEvents.EventResult.Name childname = eventResult.getChildName().get(0);


					Identifier identifier = Identifier.newBuilder().setValue(eventResult.getRegistration().getRegistrationNumber())
							.setType(eventResult.getType().equalsIgnoreCase("Birth")?"brn":"drn").build();
					Person p = Person.newBuilder()
							.setGivenName(childname.getFirstNames())
							.setFamilyName(childname.getFamilyName())
							.build();

					Sex sex = Sex.newBuilder()
							.setCode(eventResult.getChildGender().equalsIgnoreCase("male")?"m"
								:eventResult.getChildGender().equalsIgnoreCase("female")?"F" :"O")
							.setDisplayText(eventResult.getChildGender().equalsIgnoreCase("male")?SexDisplayTextEnum.MALE
								:eventResult.getChildGender().equalsIgnoreCase("female")?SexDisplayTextEnum.FEMALE
								:SexDisplayTextEnum.UNKNOWN)
							.build();
					PersonRecord person = PersonRecord.newBuilder().setName(p).setSex(sex).build();
					registryDataResponses.add(RegistryDataResponse.newBuilder().setPersonData(person).build());
				}

			}

		}else if(searchCriteria.hasBirthRecord()){

		}else if(searchCriteria.hasDeathRecord()){

		}else if(searchCriteria.hasUnionRecord()){

		}


		SearchResponseHeader searchResponseHeader = SearchResponseHeader.newBuilder()
				.setVersion(payload.getHeader().getVersion())
				.setMessageId(payload.getHeader().getMessageId())
				.setMessageTs(payload.getHeader().getMessageTs())
				.setSenderId(payload.getHeader().getSenderId())
				.setReceiverId(payload.getHeader().getReceiverId())
				.setAction(payload.getHeader().getAction())
				.setTotalCount(payload.getHeader().getTotalCount())
				.setIsEncrypted(payload.getHeader().getIsEncrypted())
				.setEncryptionAlgorithm(payload.getHeader().getEncryptionAlgorithm())
				.setAsync(payload.getHeader().getAsync())
				.setCallbackEndpoint(payload.getHeader().getCallbackEndpoint())
				.setCompletedCount(0)
				.build();



		List<SearchResponseData> searchResponseDataList = new ArrayList<>();



		PaginationInfoResponse paginationRequest = PaginationInfoResponse.newBuilder()
				.setPageSize(0)
				.setPageNumber(0)
				.setTotalRecords(0)
				.build();

		SearchResponseData searchResponseData = SearchResponseData.newBuilder()
				.setReferenceId(payload.getMessage().getRequestMessage().getSearchRequest().getRequestData(0).getReferenceId())
				.setTimestamp(payload.getMessage().getRequestMessage().getSearchRequest().getRequestData(0).getTimestamp())
				.setStatus(SearchRequestStatusEnum.SUCC)
				.setStatusReasonCode(SearchStatusReasonCodeEnum.RJCT_SIGNATURE_KEY_MISSING)
				.setStatusReasonMessage("--")
				.setRegistryType(payload.getMessage().getRequestMessage().getSearchRequest().getRequestData(0).getRegistryType())
				.setEventType(payload.getMessage().getRequestMessage().getSearchRequest().getRequestData(0).getEventType())

		//		.set(payload.getRequestMessage().getRequestMessage().getSearchRequest().getRequestData(0).get)
				.setPagination(paginationRequest)
				.setLocale(payload.getMessage().getRequestMessage().getSearchRequest().getRequestData(0).getLocale())
				.addAllRegistryData(registryDataResponses)

				.build();

		searchResponseDataList.add(searchResponseData);

		SearchResponseObject searchResponseObject = SearchResponseObject.newBuilder()
				.setVersion(payload.getRequestMessage().getRequestMessage().getSearchRequest().getVersion())
				.addAllResponseData(searchResponseDataList)
				.build();

		ResponseMessage responseMessage = ResponseMessage.newBuilder()
				.setTransactionId(payload.getRequestMessage().getRequestMessage().getTransactionId())
				.setSearchRequest(searchResponseObject)
				.build();


		SearchResponseMessageObject searchResponseMessageObject = SearchResponseMessageObject.newBuilder()
				.setResponseMessage(responseMessage)
				//.setEncryptedRequest(encryptedRequest)
				.build();

		SearchResponse s = SearchResponse.newBuilder()
				.setSignature(payload.getSignature())
				.setResponseHeader(searchResponseHeader)
				.setResponseMessage(searchResponseMessageObject)
				.build();



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
