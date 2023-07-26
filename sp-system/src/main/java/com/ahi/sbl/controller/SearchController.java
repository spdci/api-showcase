package com.ahi.sbl.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.ahi.common.Payload;
import com.ahi.sbl.services.NationalGatewayConnectorService;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class SearchController {

	@Autowired
	NationalGatewayConnectorService nationalGatewayConnector;

	@Autowired
	ObjectMapper objectMapper;

	@PostMapping(value = "/on-search", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Payload> searchCRVSData(@RequestHeader Map<String, String> headers, @RequestBody String requestBody) {
		return null;
	}



}
