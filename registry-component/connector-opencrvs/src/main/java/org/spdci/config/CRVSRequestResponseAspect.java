package org.spdci.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.spdci.common.Payload;
import org.spdci.pojo.ResponseWrapper;
import org.spdci.response.AcknowledgementResponse;
import org.spdci.services.CrvsRequestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Map;

@Aspect
@Component
public class CRVSRequestResponseAspect {

    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    @Qualifier("req_res_impl")
    private CrvsRequestResponse crvsRequestResponse;

    @Pointcut("execution(* org.spdci.controller.SearchController.searchCRVSData(..)) || execution(* org.spdci.controller.StatusController.status(..)) || execution(* org.spdci.controller.SubscriptionController.subscribe(..)) || execution(* org.spdci.controller.SubscriptionController.unsubscribe(..)) ")
    public void controllerPointCut() {
    }

    @Around("controllerPointCut()  && args(headers, requestBody)")
    public Object saveRequestDataAndProceed(ProceedingJoinPoint joinPoint,
                                            Map<String, String> headers,
                                            String requestBody) throws Throwable {
        Payload payload = objectMapper.readValue(requestBody, Payload.class);
        crvsRequestResponse.saveRequestData(payload);
        Object payloadData = joinPoint.proceed();

        if (payload.getHeaders().getAsync()) {
            new ResponseWrapper(AcknowledgementResponse.getAck());
        }

        String transactionId = payload.getMessage().getTransactionId();

        if (payloadData instanceof Mono) {
            Mono<?> monoPayload = (Mono<?>) payloadData;
            return monoPayload.flatMap(resp -> {
                try {
                    crvsRequestResponse.saveResponseData(resp, transactionId);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return Mono.just(resp);
            });
        } else {
            crvsRequestResponse.saveResponseData(payloadData, transactionId);
            return payloadData;
        }
    }


}
