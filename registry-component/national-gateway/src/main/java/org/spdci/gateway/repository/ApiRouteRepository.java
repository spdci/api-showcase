package org.spdci.gateway.repository;

import org.spdci.gateway.pojo.ApiRoute;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ApiRouteRepository extends ReactiveCrudRepository<ApiRoute, Long> {

}
