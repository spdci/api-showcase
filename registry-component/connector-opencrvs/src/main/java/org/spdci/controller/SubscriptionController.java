
package org.spdci.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.spdci.common.Payload;
import org.spdci.pojo.request.SubscribePayload;
import org.spdci.services.CrvsRequestResponse;
import org.spdci.services.CrvsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.UUID;

@RestController
@Slf4j
public class SubscriptionController {

	final String BAD_REQUEST = String.valueOf(HttpStatus.BAD_REQUEST.value());
	final String INTERNAL_SERVER_ERROR = String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value());

	@Autowired
	CrvsService crvsSearchService;

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	@Qualifier("subscribe_service")
	CrvsRequestResponse requestResponse;

	@PostMapping(value = "/subscribe", produces = MediaType.APPLICATION_JSON_VALUE)
	public UUID subscribe(@RequestHeader Map<String, String> headers, @RequestBody String requestBody)
			throws Exception {
		SubscribePayload payload = objectMapper.readValue(requestBody, SubscribePayload.class);

		log.info("Subscribe request: "+payload);
		UUID subId = requestResponse.saveSubscribeRequestData(payload);
		return subId;
	}

	@PostMapping(value = "/unsubscribe", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Payload> unsubscribe(@RequestHeader Map<String, String> headers, @RequestBody String requestBody)
			throws Exception {
		SubscribePayload payload = objectMapper.readValue(requestBody, SubscribePayload.class);

		log.info("UnSubscribe request: "+payload);
		requestResponse.saveSubscribeRequestData(payload);
		return null;
	}

}
