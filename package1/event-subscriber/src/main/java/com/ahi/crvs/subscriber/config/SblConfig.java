package com.ahi.crvs.subscriber.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.http.codec.protobuf.ProtobufEncoder;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.config.WebFluxConfigurerComposite;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import reactor.netty.http.client.HttpClient;

@Configuration
@EnableWebFlux
public class SblConfig implements WebFluxConfigurer {

	@Override
	public void configureHttpMessageCodecs(ServerCodecConfigurer configurer) {
		configurer.customCodecs().register(new ProtobufEncoder());
	}

	@Bean
	@LoadBalanced
	public WebClient.Builder loadBalancedWebClientBuilder() {
		HttpClient httpClient = HttpClient.create().compress(true);
		ReactorClientHttpConnector connector = new ReactorClientHttpConnector(httpClient);
		return WebClient.builder().clientConnector(connector);
	}

	@Bean
	ProtobufHttpMessageConverter protobufHttpMessageConverter() {
		return new ProtobufHttpMessageConverter();
	}

	@Bean
	ObjectMapper objectMapper() {
		ObjectMapper mapper = new ObjectMapper()//
				.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
				.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		mapper.findAndRegisterModules();
		// mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
		return mapper;
	}

	@Bean
	public WebFluxConfigurer webFluxConfigurer() {

		return new WebFluxConfigurer() {
			@Override
			public void configureHttpMessageCodecs(ServerCodecConfigurer configurer) {
				configurer.customCodecs().register(new Jackson2JsonEncoder(objectMapper()));
				configurer.customCodecs().register(new Jackson2JsonDecoder(objectMapper()));
			}
		};

	}

	@Bean
	public WebFluxConfigurer corsConfigurer() {
		return new WebFluxConfigurerComposite() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
			}
		};
	}
}