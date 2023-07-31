package org.spdci.config;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactoryBuilder;
import org.apache.hc.client5.http.ssl.TrustAllStrategy;
import org.apache.hc.core5.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;

@Configuration
public class PluginConfig {

	@Value("${crvs.endpoint}")
	private String crvsEndPoint;

	@Bean
	ObjectMapper objectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.findAndRegisterModules();
		mapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		return mapper;
	}

	@Bean
	public WebClient webClient() {
		return WebClient.builder().baseUrl("http://your-graphql-api-url")
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
	}

	@Bean
	RestTemplate restTemplate() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
		CloseableHttpClient httpClient = HttpClients.custom()
				.setConnectionManager(PoolingHttpClientConnectionManagerBuilder.create()
						.setSSLSocketFactory(SSLConnectionSocketFactoryBuilder.create()
								.setSslContext(
										SSLContextBuilder.create().loadTrustMaterial(TrustAllStrategy.INSTANCE).build())
								.setHostnameVerifier(NoopHostnameVerifier.INSTANCE).build())
						.build())
				.build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);// this method is not accepting the CloseableHttpClient object
		requestFactory.setConnectTimeout(30000);
		requestFactory.setConnectionRequestTimeout(30000);
		return new RestTemplate(requestFactory);
	}

	@Bean
	IGenericClient iGenericClient() {
		FhirContext fhirContext = FhirContext.forDstu3();
		IGenericClient client = fhirContext.newRestfulGenericClient(crvsEndPoint);
		// client.registerInterceptor(new DjInterceptor());

		return client;
	}
}
