package org.spdci.services.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.spdci.common.Payload;
import org.spdci.pojo.Request;
import org.spdci.pojo.Response;
import org.spdci.pojo.SubscribeStatus;
import org.spdci.pojo.SubscribeRequestPayload;
import org.spdci.services.CrvsRequest;
import org.spdci.services.CrvsRequestResponse;
import org.spdci.services.CrvsResponse;
import org.spdci.services.SubscribeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Service("req_res_impl")
@Slf4j
public class CrvsRequestResponseImpl implements CrvsRequestResponse {

    @Autowired
    SubscribeRequest subscribeRequest;
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
        data.setCreatedDtm(new Date());
        crvsRequest.save(data);
    }

    public void saveResponseData(Object payload, String id) {

        Response resData = new Response();
        String payloadData = jsonToString(payload);

        log.info("Payload Response: " + payload);
        resData.setTransactionId(id);
        resData.setResponsePayload(payloadData);
        resData.setCreatedDtm(new Date());
        crvsResponse.save(resData);

    }

    @Override
    public UUID saveSubscribeRequestData(Payload payload) {
        SubscribeRequestPayload req = new SubscribeRequestPayload();

        req.setTransactionId(payload.getMessage().getTransactionId());
        String query = jsonToString(payload);
        req.setQuery(query);
        req.setCreatedDtm(new Date());
        Optional<SubscribeRequestPayload> id = subscribeRequest.findById(UUID.fromString(payload.getMessage().getTransactionId()));
        if (id.isPresent()) {
            req.setIsSubscribe(SubscribeStatus.ACTIVE);
        } else {
            req.setIsSubscribe(SubscribeStatus.INACTIVE);
        }
        req.setFrequency(payload.getMessage().getSubscribeRequest().getFrequency());
        subscribeRequest.save(req);

        return req.getSubscribeId();
    }

}
