package org.spdci.gateway.config;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.ReactiveAuthenticationManagerResolver;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoders;
import org.springframework.security.oauth2.server.resource.authentication.JwtReactiveAuthenticationManager;

import reactor.core.publisher.Mono;

public class IssuerResolver implements ReactiveAuthenticationManagerResolver<String> {

	private final Map<String, Mono<ReactiveAuthenticationManager>> authenticationManagers = new ConcurrentHashMap<>();

	@Override
	public Mono<ReactiveAuthenticationManager> resolve(String issuer) {
		return this.authenticationManagers.computeIfAbsent(issuer, this::fromTenant);
	}

	private Mono<ReactiveAuthenticationManager> fromTenant(String issuer) {
		return Mono.just(new JwtReactiveAuthenticationManager(ReactiveJwtDecoders.fromIssuerLocation(issuer)));
	}

}