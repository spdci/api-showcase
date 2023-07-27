package com.ahi.sbl.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import org.spdci.common.Payload;
import com.ahi.sbl.services.CrvsService;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class CRVSController {

	final String BAD_REQUEST = String.valueOf(HttpStatus.BAD_REQUEST.value());
	final String INTERNAL_SERVER_ERROR = String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value());

	@Autowired
	CrvsService crvsSearchService;

	@Autowired
	ObjectMapper objectMapper;

//	@PostMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
//	public Mono<Payload> searchCRVSData(@RequestHeader Map<String, String> headers, @RequestBody String requestBody)
//			throws Exception {
//		Payload payload1 = objectMapper.readValue(requestBody, Payload.class);
//		log.info("payload  1- ", payload1.getMessage().getSearchRequest().getData().get(0).getSearchCriteria()
//				.getQuery().getIdentifier().get(0).getIdentifierType());
//		return crvsSearchService.proActiveSearch(payload1);
//	}
//
//	@PostMapping(value = "/subscribe", produces = MediaType.APPLICATION_JSON_VALUE)
//	public Mono<Payload> subscribe(@RequestHeader Map<String, String> headers, @RequestBody String requestBody)
//			throws Exception {
//		return null;
//	}
//
//	@PostMapping(value = "/unsubscribe", produces = MediaType.APPLICATION_JSON_VALUE)
//	public Mono<Payload> unsubscribe(@RequestHeader Map<String, String> headers, @RequestBody String requestBody)
//			throws Exception {
//		return null;
//	}
//
//	@PostMapping(value = "/status", produces = MediaType.APPLICATION_JSON_VALUE)
//	public Mono<Payload> status(@RequestHeader Map<String, String> headers, @RequestBody String requestBody)
//			throws Exception {
//		return null;
//	}

}
