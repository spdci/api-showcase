package com.ahi.sbl.controller;


import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import org.spdci.common.Payload;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class NotifyController {
	@PostMapping(value = "/notify", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Payload> notify(@RequestHeader Map<String, String> headers, @RequestBody String requestBody) {
		return null;
	}


}
