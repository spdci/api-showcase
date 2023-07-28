package com.ahi.sbl.services;

import com.ahi.sbl.pojo.CrvsToken;
import lombok.extern.slf4j.Slf4j;
import org.spdci.common.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class CrvsSearchServiceImpl {
    @Autowired
    RestTemplate restTemplate;

    public void statusRequest(Payload payload) throws Exception {
        String mosipRegProcAuth = "https://auth.farajaland-demo.opencrvs.org/authenticateSystemClient";
        String credentials = "{\n" + "    \"client_id\": \"ebe491d5-ca62-4282-9290-79f350be2d58\",\n"
                + "    \"client_secret\": \"c551302d-af94-40fe-a347-145f166559ce\"\n" + "}";

        log.info("credentials {} " + credentials);

        HttpHeaders headersRegProc = getHttpHeaders();
        HttpEntity<String> httpEntity = new HttpEntity<>(credentials, headersRegProc);

        ResponseEntity<CrvsToken> authCall = restTemplate.postForEntity(mosipRegProcAuth, httpEntity, CrvsToken.class);

        String graphqlurl = "https://gateway.farajaland-demo.opencrvs.org/graphql";
        headersRegProc.add("Authorization", "Bearer " + authCall.getBody().getToken());



    }
    private static HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        // headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Accept", "*/*");
        headers.add("Accept-Encoding", "gzip, deflate, br");
        return headers;
    }

}
