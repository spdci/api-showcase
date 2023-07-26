package com.ahi.sbl.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.ahi.proto.response.SearchResponse;
import com.ahi.sbl.services.NationalGatewayConnectorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.googlecode.protobuf.format.JsonFormat;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class SearchController {

	@Autowired
	NationalGatewayConnectorService nationalGatewayConnector;

	@Autowired
	ObjectMapper objectMapper;

	@PostMapping(value = "/v1/searchCRVSData", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Mono<String>> searchCRVSData(//
			@RequestHeader Map<String, String> headers, //
			@RequestBody String requestBody, ServerHttpRequest request) {

		try {
			return ResponseEntity.ok(
					nationalGatewayConnector.processPostRequest(requestBody, headers, request.getPath().toString()));
		} catch (Exception e) {
			log.info("Request Data {} || Error :Error while searching ", requestBody);
			return error;
		}
	}

	@PostMapping(value = "/v1/search", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Mono<String>> search(//
			@RequestHeader Map<String, String> headers, //
			@RequestBody String requestBody, ServerHttpRequest request) {

		try {
			return ResponseEntity.ok(
					nationalGatewayConnector.processPostRequest(requestBody, headers, request.getPath().toString()));
		} catch (Exception e) {
			log.info("Request Data {} || Error :Error while searching ", requestBody);
			return error;
		}
	}

	private final ResponseEntity<Mono<String>> error = ResponseEntity.of(Optional.ofNullable(Mono.just(
			new JsonFormat().printToString(SearchResponse.newBuilder().setErrorCode(HttpStatus.BAD_REQUEST.toString())
					.setReturnMessage("Error while processing request").build()))));
}
