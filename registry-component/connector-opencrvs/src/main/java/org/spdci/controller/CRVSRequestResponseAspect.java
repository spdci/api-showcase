package org.spdci.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.spdci.common.Payload;
import org.spdci.services.CrvsRequestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Map;

@Aspect
@Component
public class CRVSRequestResponseAspect {

    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    private CrvsRequestResponse crvsRequestResponse;

    @Pointcut("execution(* org.spdci.controller.SearchController.searchCRVSData(..)) || execution(* org.spdci.controller.StatusController.status(..)) || execution(* org.spdci.controller.SubscriptionController.subscribe(..)) || execution(* org.spdci.controller.SubscriptionController.unsubscribe(..)) ")
    public void controllerPointCut() {
    }

    @Around("controllerPointCut()  && args(headers, requestBody)")
    public Mono<Payload> saveRequestDataAndProceed(ProceedingJoinPoint joinPoint,
                                                   Map<String, String> headers,
                                                   String requestBody) throws Throwable {
        Payload payload = objectMapper.readValue(requestBody, Payload.class);
        crvsRequestResponse.saveRequestData(payload);

        Mono<Payload> payloadData = (Mono<Payload>) joinPoint.proceed();

        crvsRequestResponse.saveResponseData(payloadData);

        return payloadData;
    }


}
