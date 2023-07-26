package com.ahi.sbl.controller;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.ahi.common.Payload;
import com.ahi.request.SearchRequest;
import com.ahi.response.SearchMessage;
import com.ahi.sbl.pojo.CrvsToken;
import com.ahi.sbl.pojo.RequestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


import com.ahi.sbl.services.CrvsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class SearchController {

	final String SUCCESS_TRUE = "true";
	final String SUCCESS_FALSE = "false";
	final String BAD_REQUEST = String.valueOf(HttpStatus.BAD_REQUEST.value());
	final String INTERNAL_SERVER_ERROR = String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value());

	@Autowired
	CrvsService crvsSearchService;

	@Autowired
	ObjectMapper objectMapper;

//	Mono<SearchResponse> invalidHeadersearchBy = Mono.just(SearchResponse.newBuilder().setSuccess("false").setErrorCode(BAD_REQUEST).setReturnMessage("Invalid header value : searchBy").build());
//	Mono<SearchResponse> invalidCredentialsSearchBy = Mono.just(SearchResponse.newBuilder().setSuccess("false").setErrorCode(BAD_REQUEST).setReturnMessage("Invalid header value : searchBy").build());
//	Mono<SearchResponse> invalidSearchData = Mono.just(SearchResponse.newBuilder().setSuccess("false").setErrorCode(HttpStatus.BAD_REQUEST.toString()).setReturnMessage("Invalid search data").build());
//	Mono<SearchResponse> errorWhileSearch = Mono.just(SearchResponse.newBuilder().setSuccess("false").setErrorCode(INTERNAL_SERVER_ERROR).setReturnMessage("Error while searching").build());

//	Function<List<ResponseData>, Mono<SearchResponse>> successResponse = (data) -> {
//
//		return Mono.just(SearchResponse.newBuilder()//
//				.setSuccess(SUCCESS_TRUE)//
//				// .setErrorCode(null)//
//				.addAllData(data)//
//				.setReturnMessage("success").build());
//	};

	@PostMapping(value = "/v1/searchCRVSData", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Payload> searchCRVSData(@RequestHeader Map<String, String> headers, @RequestBody String requestBody) throws Exception {

		Payload payload1 = objectMapper.readValue(requestBody, Payload.class);



		log.info("payload  1- ",  payload1.getMessage().getSearchRequest().getData().get(0).getSearchCriteria().getQuery().getIdentifier().get(0).getIdentifierType() );


		//String AuthorizationToken = headers.getOrDefault("Authorization", "");

		//	if(AuthorizationToken==null || AuthorizationToken.isEmpty()){
				//return invalidHeadersearchBy;
		//	}else{
				//return biFunSearchByNationalId.apply(requestBody,AuthorizationToken);
		//	}
		return crvsSearchService.proActiveSearch(payload1);

	}

 //BiFunction<String,String, Mono<SearchResponse>> biFunSearchByNationalId = (searchData, AuthorizationToken) -> {
//		try {
//			SearchByIdentification payload = objectMapper.readValue(searchData, SearchByIdentification.class);
//			List<SearchResponse> findDataByBrn = crvsSearchService.searchByNationalId(payload.getIdentificationValue(),AuthorizationToken);
//			return findDataByBrn.apply(findDataByBrn);
//
//		} catch (JsonProcessingException | NoSuchMethodError e) {
//			log.info("Request Data {} || Error :Invalid search data ", searchData);
	//		return invalidSearchData;
//		} catch (Exception e) {
//			log.info("Request Data {} || Error :Error while searching ", searchData);
	//		return errorWhileSearch;
//		}
 //	};
//
//	Function<String, Mono<SearchResponse>> biFunSearchByDemographic = (searchData) -> {
//		try {
//			SearchByDemographic payload = objectMapper.readValue(searchData, SearchByDemographic.class);
//
//			return successResponse.apply(findDataByBrn);
//
//		} catch (JsonProcessingException | NoSuchMethodError e) {
//			log.info("Request Data {} || Error :Invalid search data ", searchData);
//			return invalidSearchData;
//		} catch (Exception e) {
//			e.printStackTrace();
//			log.info("Request Data {} || Error :Error while searching ", searchData);
//			return errorWhileSearch;
//		}
//	};





}
