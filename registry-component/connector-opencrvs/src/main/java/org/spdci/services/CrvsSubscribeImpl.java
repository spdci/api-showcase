package org.spdci.services;

import org.spdci.common.Payload;
import org.spdci.pojo.ResponseWrapper;
import org.spdci.pojo.enums.SubscribeStatus;
import org.spdci.pojo.request.SubscribePayload;
import org.spdci.pojo.request.SubscribeRequestPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import static org.spdci.services.CrvsRequestResponseImpl.jsonToString;

@Service("subscribe_service")
public class CrvsSubscribeImpl implements CrvsRequestResponse {

    @Autowired
    SubscribeRequest subscribeRequest;

    @Override
    public UUID saveSubscribeRequestData(SubscribePayload payload) throws Exception {
        SubscribeRequestPayload req = new SubscribeRequestPayload();

        req.setTransactionId(payload.getMessage().getTransactionId());
        String query = jsonToString(payload);
        req.setQuery(query);
        req.setCreatedDtm(new Date());
        Optional<SubscribeRequestPayload> id = subscribeRequest.findById(UUID.fromString(payload.getMessage().getTransactionId()));
        if (id.isPresent()) {
            req.setIsSubscribe(SubscribeStatus.ACTIVE);
        }
        req.setIsSubscribe(SubscribeStatus.INACTIVE);
        req.setFrequency(payload.getMessage().getSubscribeRequest().getFrequency());
        subscribeRequest.save(req);

        return req.getSubscribeId();
    }

    @Override
    public void saveRequestData(Payload payload) throws Exception {
        return;
    }

    @Override
    public void saveResponseData(Mono<ResponseWrapper> payload) throws Exception {

    }

}
