package org.spdci.services;

import java.util.Map;

import org.spdci.pojo.Credential;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class LoginService {

	@Value("${keycloak.endpoint}")
	private String keyCloakEndpoint;
 
	@Autowired
	RestTemplate restTemplate;

	public Credential getToken(Credential credential) {

		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
			headers.add("Accept", "*/*");
			headers.add("Accept-Encoding", "gzip, deflate, br");
			headers.add("Connection", "keep-alive");


			MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
			map.add("client_id", credential.getClientId());
			map.add("grant_type", "password");
			map.add("client_secret", credential.getClientSecret());
			map.add("username", credential.getUserName());
			map.add("password", credential.getPassword());
			System.out.println(credential.getClientId() + " - "+ credential.getClientSecret());
			System.out.println(credential.getUserName() + " - "+ credential.getPassword());


			HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map,headers);

			ResponseEntity<Map> response = restTemplate.exchange(keyCloakEndpoint.concat("/realms/" + credential.getSpMisId() + "/protocol/openid-connect/token"),
					HttpMethod.POST, entity, Map.class);

			credential.setTokenInfo(response.getBody());

		} catch (Exception e) {
			e.printStackTrace();
			credential.setErrorInfo(e.getMessage());
		}

		return credential;
	}
	
	public Credential getTokenWithSecrets(Credential credential) {

		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
			headers.add("Accept", "*/*");
			headers.add("Accept-Encoding", "gzip, deflate, br");
			headers.add("Connection", "keep-alive");


			MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
			map.add("client_id", credential.getClientId());
			map.add("grant_type", "client_credentials");
			map.add("client_secret", credential.getClientSecret());

                        System.out.println(credential.getClientId() + " - "+ credential.getClientSecret()+" -- "+ credential.getSpMisId());

			HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map,headers);

			ResponseEntity<Map> response = restTemplate.exchange(keyCloakEndpoint.concat("/realms/" + credential.getSpMisId() + "/protocol/openid-connect/token"),
					HttpMethod.POST, entity, Map.class);

			credential.setTokenInfo(response.getBody());

		} catch (Exception e) {
			e.printStackTrace();
			credential.setErrorInfo(e.getMessage());
		}

		return credential;
	}
}
