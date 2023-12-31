package org.spdci.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.spdci.common.Payload;
import org.spdci.services.CrvsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@Slf4j
public class StatusController {

    final String BAD_REQUEST = String.valueOf(HttpStatus.BAD_REQUEST.value());
    final String INTERNAL_SERVER_ERROR = String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value());

    @Autowired
    CrvsService crvsSearchService;

    @Autowired
    ObjectMapper objectMapper;


    @PostMapping(value = "/status", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Payload> status(@RequestHeader Map<String, String> headers, @RequestBody String requestBody)
            throws Exception {
        Payload payload = objectMapper.readValue(requestBody, Payload.class);
        log.info("Payload-- ", payload.getMessage());
        return null;
    }

}
