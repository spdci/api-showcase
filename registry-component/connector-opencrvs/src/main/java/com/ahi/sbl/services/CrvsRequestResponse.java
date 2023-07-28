package com.ahi.sbl.services;

import org.spdci.common.Payload;
import reactor.core.publisher.Mono;

public interface CrvsRequestResponse {

    void saveRequestData(Payload payload) throws Exception;
    void saveResponseData(Mono<Payload> payload) throws Exception;
}
