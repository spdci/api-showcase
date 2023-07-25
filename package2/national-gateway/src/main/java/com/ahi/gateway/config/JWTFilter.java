package com.ahi.gateway.config;

import java.util.Base64;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Configuration
@Slf4j
public class JWTFilter implements WebFilter {
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
		
		String first = exchange.getRequest().getHeaders().getFirst("Authorization");
		
		if (first != null) {
			/*  && StringUtils.hasText(token) && StringUtils.hasText(serviceName)
			 * String token = first.substring(7);
			 * String serviceName = exchange.getRequest().getHeaders().getFirst("x-service-url");
			 * String[] parts = token.split("\\."); JSONObject header = new
			 * JSONObject(decode(parts[0])); JSONObject payload = new
			 * JSONObject(decode(parts[1]));
			 * 
			 * JSONArray jsonArray = payload.getJSONObject("resource_access")
			 * .getJSONObject(String.valueOf(payload.get("clientId"))).getJSONArray("roles")
			 * ; String signature = decode(parts[2]);
			 * 
			 * if (jsonArray.toList().contains(serviceName)) {
			 * exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED); return
			 * exchange.getResponse().writeWith( Mono.just(new
			 * AhiException("false","No access to "+serviceName,"401"))); return
			 * exchange.getResponse().writeWith( Mono.just( new
			 * AhiException("false","No access to "+serviceName,"401")); }
			 * 
			 */}
		return chain.filter(exchange);
	}

	private static String decode(String encodedString) {
		return new String(Base64.getUrlDecoder().decode(encodedString));
	}

}