package com.ahi.gateway.service;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.BooleanSpec;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

import com.ahi.gateway.pojo.ApiRoute;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

@AllArgsConstructor
public class ApiPathRouteLocatorImpl implements RouteLocator {

	private final ApiRouteService apiRouteService;

	private final RouteLocatorBuilder routeLocatorBuilder;

	@Override
	public Flux<Route> getRoutes() {
		RouteLocatorBuilder.Builder routesBuilder = routeLocatorBuilder.routes();
		System.out.println("Called get routes");
		return apiRouteService.findApiRoutes()
				.map(apiRoute -> routesBuilder.route(String.valueOf(apiRoute.getId()),
						predicateSpec -> setPredicateSpec(apiRoute, predicateSpec)))
				.collectList().flatMapMany(builders -> routesBuilder.build().getRoutes());
	}

	private Buildable<Route> setPredicateSpec(ApiRoute apiRoute, PredicateSpec predicateSpec) {
		System.out.println("apiRoute.getHeader() >> " + apiRoute.getHeader() + " URI :: "+apiRoute.getUri());
		return predicateSpec.header("x-service-url", apiRoute.getHeader()).uri(apiRoute.getUri());
		//BooleanSpec booleanSpec = predicateSpec.header(apiRoute.getHeader());
		//return booleanSpec.uri(apiRoute.getUri());
	}
}