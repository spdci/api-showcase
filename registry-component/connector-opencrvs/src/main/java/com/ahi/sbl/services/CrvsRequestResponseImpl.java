package com.ahi.sbl.services;

import com.ahi.sbl.pojo.Request;
import com.ahi.sbl.pojo.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.apache.hc.core5.http.HttpStatus;
import org.spdci.common.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class CrvsRequestResponseImpl implements CrvsRequestResponse {

    @Autowired
    private CrvsRequest crvsRequest;

    @Autowired
    private CrvsResponse crvsResponse;

    public static String jsonToString(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        String data = null;
        try {
            data = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void saveRequestData(Payload payload) {

        Request data = new Request();
        String payloadData = jsonToString(payload);
        data.setTransactionId(payload.getMessage().getTransactionId());
        data.setRequestPayload(payloadData);
        data.setStatus("");
        data.setReasonCode("");
        data.setErrorCode("");
        data.setErrorMessage("");
        crvsRequest.save(data);
    }

    public void saveResponseData(Mono<Payload> payload) {

        Response resData = new Response();
        payload.subscribe(
                payload1 -> {
                    String payloadData = jsonToString(payload1);

                    log.info("Payload Response: " + payloadData);
                    resData.setTransactionId(payload1.getMessage().getTransactionId());
                    resData.setResponsePayload(payloadData);
                    crvsResponse.save(resData);
                },
                error -> {
                    resData.setErrorCode("Error");
                    resData.setErrorMessage(error.getMessage());

                    if (error instanceof WebClientResponseException) {
                        WebClientResponseException webClientError = (WebClientResponseException) error;
                        resData.setErrorCode(webClientError.getStatusCode().toString());
                    } else if (error instanceof IllegalArgumentException) {
                        resData.setErrorCode(String.valueOf(HttpStatus.SC_BAD_REQUEST));
                    } else {
                        resData.setErrorCode(String.valueOf(HttpStatus.SC_SERVER_ERROR));
                    }
                    crvsResponse.save(resData);
                });

    }
}
