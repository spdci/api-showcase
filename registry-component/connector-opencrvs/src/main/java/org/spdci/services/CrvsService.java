package org.spdci.services;

import org.spdci.common.Payload;
import reactor.core.publisher.Mono;

public interface CrvsService {
	  Mono<Payload> proActiveSearch(Payload searchData) throws Exception;
}
