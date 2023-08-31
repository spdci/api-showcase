package org.spdci.services;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.spdci.common.Payload;
import reactor.core.publisher.Mono;

public interface LocalCRVSService {

    public Mono<Payload> search(Payload payload) throws JsonProcessingException;
}
