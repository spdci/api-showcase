package org.spdci.services;

import org.spdci.common.Payload;
import org.spdci.pojo.ResponseWrapper;
import org.spdci.pojo.request.SubscribePayload;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface CrvsRequestResponse {

    void saveRequestData(Payload payload) throws Exception;

    void saveResponseData(Mono<ResponseWrapper> payload) throws Exception;

    UUID saveSubscribeRequestData(SubscribePayload payload) throws Exception;

}
