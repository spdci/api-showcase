package obg.spdci.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import org.spdci.common.Payload;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import obg.spdci.services.NationalGatewayConnectorService;
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
		log.info("/on-search received request");
		String msg = new String(requestBody);
		System.out.println("Request body============== "+msg);
		return null;
	}



}
