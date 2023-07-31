package org.spdci.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import org.spdci.common.Payload;
import org.spdci.services.CrvsRequestResponse;
import org.spdci.services.CrvsRequestResponseImpl;
import org.spdci.services.CrvsService;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class SearchController {

	final String BAD_REQUEST = String.valueOf(HttpStatus.BAD_REQUEST.value());
	final String INTERNAL_SERVER_ERROR = String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value());

	@Autowired
	CrvsService crvsSearchService;

	@Autowired
	CrvsRequestResponse crvsRequestResponse;

	@Autowired
	ObjectMapper objectMapper;

	@PostMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Payload> searchCRVSData(@RequestHeader Map<String, String> headers, @RequestBody String requestBody)
			throws Exception {
		Payload payload1 = objectMapper.readValue(requestBody, Payload.class);
		log.info("payload  1- ", payload1.getMessage().getSearchRequest().getData().get(0).getSearchCriteria()
				.getQuery().getIdentifier().get(0).getIdentifierType());
		Mono<Payload> payloadData = crvsSearchService.proActiveSearch(payload1);
		crvsRequestResponse.saveRequestData(payload1);
		crvsRequestResponse.saveResponseData(payloadData);
		return payloadData;
	}

	

}