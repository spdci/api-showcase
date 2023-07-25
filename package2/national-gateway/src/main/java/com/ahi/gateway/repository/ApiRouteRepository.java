package com.ahi.gateway.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.ahi.gateway.pojo.ApiRoute;

public interface ApiRouteRepository extends ReactiveCrudRepository<ApiRoute, Long> {

}
