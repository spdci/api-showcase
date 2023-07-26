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
public class OtpController {

	@Autowired
	NationalGatewayConnectorService nationalGatewayConnector;

	@Autowired
	ObjectMapper objectMapper;

	private final ResponseEntity<Mono<String>> error = ResponseEntity.of(Optional.ofNullable(Mono.just(
			new JsonFormat().printToString(SearchResponse.newBuilder().setErrorCode(HttpStatus.BAD_REQUEST.toString())
					.setReturnMessage("Error while processing request").build()))));

//	// Get mapping req old
//	@GetMapping(value = "/api/generateOTP/{mobileNo}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Mono<String>> generateOtp(@PathVariable
//	Map<String, String> pathVarsMap, @RequestHeader
//	Map<String, String> headers, ServerHttpRequest request) {
//
//		log.info("Request-GET received at interoperatibility layer :: " + request.getPath());
//		try {
//			return ResponseEntity
//					.ok(nationalGatewayConnector.processGetRequest(headers, pathVarsMap, request.getPath().toString()));
//		}
//		catch (Exception e) {
//			log.info("Error processing GET Request", headers);
//			return error;
//		}
//	}

	@PostMapping(value = "/v1/sendotp", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Mono<String>> sendOtp(//
			@RequestHeader Map<String, String> headers, //
			@RequestBody String requestBody//
			, ServerHttpRequest request) {
 
		try {
			return ResponseEntity.ok(
					nationalGatewayConnector.processPostRequest(requestBody, headers, request.getPath().toString()));
		}
		catch (Exception e) {
			log.info("Error processing POST Request data {}", requestBody);
			return error;
		}
	}

	@PostMapping(value = "/v1/validateOTP", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Mono<String>> searchCRVSData(//
			@RequestHeader Map<String, String> headers, //
			@RequestBody String requestBody//
			, ServerHttpRequest request) {

		log.info("Request-POST received at interoperatibility layer");
		try {
			return ResponseEntity.ok(
					nationalGatewayConnector.processPostRequest(requestBody, headers, request.getPath().toString()));
		}
		catch (Exception e) {
			log.info("Error processing POST Request data {}", requestBody);
			return error;
		}
	}

	@PostMapping(value = "/v1/validateKYCOTP", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Mono<String>> validateKYCOTP(//
													   @RequestHeader Map<String, String> headers, //
													   @RequestBody String requestBody//
			, ServerHttpRequest request) {

		log.info("Request-POST received at interoperatibility layer");
		try {
			return ResponseEntity.ok(
					nationalGatewayConnector.processPostRequest(requestBody, headers, request.getPath().toString()));
		}
		catch (Exception e) {
			log.info("Error processing POST Request data {}", requestBody);
			return error;
		}
	}

}
