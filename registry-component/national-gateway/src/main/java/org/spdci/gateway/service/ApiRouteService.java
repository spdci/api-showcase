package org.spdci.gateway.service;

import org.spdci.gateway.pojo.ApiRoute;
import org.spdci.gateway.pojo.CreateOrUpdateApiRouteRequest;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ApiRouteService {

	Flux<ApiRoute> findApiRoutes();

	Mono<ApiRoute> findApiRoute(Long id);

	Mono<Void> createApiRoute(CreateOrUpdateApiRouteRequest createOrUpdateApiRouteRequest);

	Mono<Void> updateApiRoute(Long id, CreateOrUpdateApiRouteRequest createOrUpdateApiRouteRequest);

	Mono<Void> deleteApiRoute(Long id);
}
