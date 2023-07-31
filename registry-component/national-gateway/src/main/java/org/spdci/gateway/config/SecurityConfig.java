package org.spdci.gateway.config;

import java.util.List;

import org.spdci.gateway.service.ApiPathRouteLocatorImpl;
import org.spdci.gateway.service.ApiRouteService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.server.resource.authentication.JwtIssuerReactiveAuthenticationManagerResolver;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Configuration
@EnableWebFluxSecurity
@Slf4j
public class SecurityConfig {

	@Value("${openPaths}")
	private String[] openPath;

	@Bean
	ObjectMapper objectMapper() {
		ObjectMapper mapper = new ObjectMapper()//
				.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
				.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		;
		mapper.findAndRegisterModules();

		return mapper;
	}

	@Bean
	public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {

		http.authorizeExchange().pathMatchers(openPath).permitAll();
		http.cors();

		http.csrf().disable();
		http.authorizeExchange().anyExchange().authenticated();//
		http.oauth2ResourceServer(oauth2 -> oauth2.authenticationManagerResolver(
				new JwtIssuerReactiveAuthenticationManagerResolver(new IssuerResolver())));

		return http.build();

	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration corsConfig = new CorsConfiguration();
		corsConfig.setAllowedOrigins(List.of("*"));
		corsConfig.setMaxAge(3600L);
		corsConfig.addAllowedMethod("*");
		corsConfig.addAllowedHeader("*");

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", corsConfig);
		return source;
	}

	@Bean
	public RouteLocator routeLocator(ApiRouteService apiRouteService, RouteLocatorBuilder routeLocatorBuilder) {
		return new ApiPathRouteLocatorImpl(apiRouteService, routeLocatorBuilder);
	}

	@Bean
	public GlobalFilter postGlobalFilter() {
		return (exchange, chain) -> {
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				log.info("Global Post Filter executed");
			}));
		};
	}
}
