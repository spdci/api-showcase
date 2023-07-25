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
import com.googlecode.protobuf.format.JsonFormat;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class DataSystemController {

	@Autowired
	NationalGatewayConnectorService nationalGatewayConnector;

	@PostMapping(value = "/v1/registerbeneficiary", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Mono<String>> registerbeneficiary(//
			@RequestHeader Map<String, String> headers, //
			@RequestBody String requestBody//
			, ServerHttpRequest request) {

		log.info("Request-validateOTP received at interoperatibility layer");
		try {
			return ResponseEntity.ok(
					nationalGatewayConnector.processPostRequest(requestBody, headers, request.getPath().toString()));
		}
		catch (Exception e) {
			log.info("Error processing POST Request data {}", requestBody);
			return error;
		}
	}

	@PostMapping(value = "/v1/register", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Mono<String>> register(//
												 @RequestHeader Map<String, String> headers, //
												 @RequestBody String requestBody//
			, ServerHttpRequest request) {

		log.info("Request-validateOTP received at interoperatibility layer");
		try {
			return ResponseEntity.ok(
					nationalGatewayConnector.processPostRequest(requestBody, headers, request.getPath().toString()));
		}
		catch (Exception e) {
			log.info("Error processing POST Request data {}", requestBody);
			return error;
		}
	}

	@PostMapping(value = "/v1/deduplicaton", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Mono<String>> deduplicaton(//
			@RequestHeader Map<String, String> headers, //
			@RequestBody String requestBody//
			, ServerHttpRequest request) {

		log.info("Request-de-duplicaton received at interoperability layer");
		try {
			return ResponseEntity.ok(
					nationalGatewayConnector.processPostRequest(requestBody, headers, request.getPath().toString()));
		}
		catch (Exception e) {
			log.info("Error processing POST Request data {}", requestBody);
			return error;
		}
	}

	@PostMapping(value = "/v1/getBeneficiary", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Mono<String>> getBeneficiary(//
													 @RequestHeader Map<String, String> headers, //
													 @RequestBody String requestBody//
			, ServerHttpRequest request) {

		log.info("Request-get Beneficiary received at interoperability layer");
		try {
			return ResponseEntity.ok(
					nationalGatewayConnector.processPostRequest(requestBody, headers, request.getPath().toString()));
		}
		catch (Exception e) {
			log.info("Error processing POST Request data {}", requestBody);
			return error;
		}
	}

	private final ResponseEntity<Mono<String>> error = ResponseEntity.of(Optional.ofNullable(Mono.just(
			new JsonFormat().printToString(SearchResponse.newBuilder().setErrorCode(HttpStatus.BAD_REQUEST.toString())
					.setReturnMessage("Error while processing request").build()))));

}
