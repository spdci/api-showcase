package com.ahi.sbl.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import com.ahi.sbl.pojo.Credential;
import com.google.gson.JsonObject;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class NationalGatewayConnectorService {

	@Autowired
	private WebClient.Builder webClientBuilder;

	@Value("${spmis.national-gateway}")
	private String nationalGateway;

	@Value("${spmis.token-server}")
	private String sblTokenServer;

	@Value("${spmis.client.id}")
	private String spmisClientId;

	@Value("${spmis.client.secret}")
	private String spmisClientSecret;

	@Autowired
	RestTemplate restTemplate;

	public Mono<String> processPostRequest(String requestBody, Map<String, String> headersFromSpmis, String path) {

		Mono<String> payload = webClientBuilder.baseUrl(nationalGateway).build()//
				.post()//
				.uri(path)//
				.headers(headers -> {
					headersFromSpmis.forEach((key, value) -> {
						if (!key.equalsIgnoreCase("Authorization")) {
							headers.add(key, value);
						}
					});
					headers.add("Authorization", "Bearer " + getTokenWithSecrets());
				}).bodyValue(requestBody)//
				.retrieve()//
				.bodyToMono(String.class).doFinally(t -> {
					log.info("Request served : {}", requestBody);
				});
		return payload;

	}

	public Mono<String> handleErrors(ClientResponse clientResponse) {
		log.error("Status Code " + clientResponse.statusCode() + " Message : ");
		log.error("Error : 500 while connecting with service");
		if (clientResponse.statusCode().is4xxClientError()) {
			return Mono.just(org.spdci.errors.HttpStatus.builder().error_code("400")
					.error_message(String.valueOf(clientResponse.statusCode())).build().toString());

		}
		Mono<String> errorResponse = clientResponse.bodyToMono(String.class);
		return errorResponse.flatMap((message) -> {
			log.error("Error : 500 while connecting with service");
			return Mono.just(org.spdci.errors.HttpStatus.builder().error_code("500")
					.error_message(String.valueOf(clientResponse.statusCode())).build().toString());
		});

	}

	public String getTokenWithSecrets() {

		try {
			HttpHeaders headers = new HttpHeaders();
			// headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.add("Accept", "*/*");
			headers.add("Accept-Encoding", "gzip, deflate, br");
			headers.add("Connection", "keep-alive");
			headers.add("Content-Type", "application/json");
			headers.add("Connection", "keep-alive");
			JsonObject personJsonObject = new JsonObject();
			personJsonObject.addProperty("spMisId", spmisClientId);
			personJsonObject.addProperty("clientId", spmisClientId);
			personJsonObject.addProperty("clientSecret", spmisClientSecret);

			System.out.println("spMisId" + spmisClientId);
			System.out.println("clientId" + spmisClientId);
			System.out.println("clientSecret" + spmisClientSecret);
			System.out.println("sblTokenServer" + sblTokenServer);

			HttpEntity<String> request = new HttpEntity<String>(personJsonObject.toString(), headers);
			ResponseEntity<Credential> response = restTemplate.exchange(sblTokenServer, HttpMethod.POST, request,
					Credential.class);

			String token = (String) response.getBody().getTokenInfo().get("access_token");
			// System.out.println("Token " + token);
			return token;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	Mono<org.spdci.errors.HttpStatus> unAuthError = Mono
			.just(org.spdci.errors.HttpStatus.builder().error_code("401").error_message("Not authorized").build());

	Mono<org.spdci.errors.HttpStatus> notFound = Mono.just(org.spdci.errors.HttpStatus.builder().error_code("404")
			.error_message("Not found - check headers starts with x-*").build());
}
