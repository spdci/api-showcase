package org.spdci.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.spdci.common.Payload;
import org.spdci.pojo.ResponseWrapper;
import org.spdci.response.AcknowledgementResponse;
import org.spdci.services.CrvsService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
public class SearchController {

    final String BAD_REQUEST = String.valueOf(HttpStatus.BAD_REQUEST.value());
    final String INTERNAL_SERVER_ERROR = String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value());

    @Autowired
    CrvsService crvsSearchService;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    private RabbitTemplate template;

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    @PostMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseWrapper> searchCRVSData(@RequestHeader Map<String, String> headers, @RequestBody String requestBody)
            throws Exception {
        Payload payload = objectMapper.readValue(requestBody, Payload.class);
        if (payload.getHeaders().getAsync()) {
            template.convertAndSend(exchange, routingKey, payload);
            return Mono.just(new ResponseWrapper(AcknowledgementResponse.getAck()));
        }
        String identifierType = payload.getMessage().getSearchRequest().getData().get(0)
                .getSearchCriteria().getQuery().getIdentifier().get(0).getIdentifierType();
        log.info("search_request_received ", requestBody);
        log.info("search_request_received - identifierType : ", identifierType);
        return crvsSearchService.search(payload)
                .flatMap(responsePayload -> {
                    ResponseWrapper responseWrapper = new ResponseWrapper(responsePayload);
                    return Mono.just(responseWrapper);
                });

    }


}
