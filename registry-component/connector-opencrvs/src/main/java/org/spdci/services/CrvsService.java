package org.spdci.services;

import org.spdci.common.Payload;
import reactor.core.publisher.Mono;

public interface CrvsService {
	  Mono<Payload> search(Payload searchData) throws Exception;
}
