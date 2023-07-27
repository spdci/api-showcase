package com.ahi.sbl.services;

import com.ahi.sbl.pojo.Request;
import com.ahi.sbl.pojo.Response;
import org.spdci.common.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrvsRequestResponseImpl {

    @Autowired
    private CrvsRequest crvsRequest;

    @Autowired
    private CrvsResponse crvsResponse;
    public void saveRequestData(Payload payload) {

        Request data  = new Request();
        data.setTransactionId(payload.getMessage().getTransactionId());
        data.setRequestPayload(payload.getMessage().getData());
        data.setStatus("Received");
        data.setReasonCode("something");
//        data.setErrorCode();
//        data.setErrorMessage();
        crvsRequest.save(data);

    }

    public void saveResponseData(Payload payload) {

        Response resData = new Response();
        resData.setTransactionId(payload.getMessage().getTransactionId());
        resData.setResponsePayload("Response data");
        crvsResponse.save(resData);

    }
}
