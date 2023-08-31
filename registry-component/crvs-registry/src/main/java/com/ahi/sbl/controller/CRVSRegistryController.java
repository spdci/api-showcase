package com.ahi.sbl.controller;

import java.util.Map;

import com.ahi.proto.request.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.ahi.sbl.pojo.ApiResponse;
import com.ahi.sbl.pojo.ErrorResponse;
import com.ahi.sbl.services.DataSystemService;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class CRVSRegistryController {

	final String SUCCESS_TRUE = "true";
	final String SUCCESS_FALSE = "false";

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	DataSystemService dataServiceService;

	@PostMapping(value = "/v1/search", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<ApiResponse> searchCRVS(@RequestHeader Map<String, String> headers, @RequestBody String requestBody) {

		try {
//			SearchRequest requestObj = objectMapper.readValue(requestBody, SearchRequest.class);
			//SearchRequest requestObj = null;

			SearchRequest requestObj = objectMapper.readValue(requestBody, SearchRequest.class);

			log.info("Request Data {} ", requestBody);

			return dataServiceService.personInfo(requestObj);
		} catch (Exception e) {
			e.printStackTrace();

			return Mono.just(new ErrorResponse(SUCCESS_FALSE, "", "Error while processing request"));
		}
	}

 
}