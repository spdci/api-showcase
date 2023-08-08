package org.spdci.services;

import org.spdci.common.Payload;

import java.util.UUID;

public interface CrvsRequestResponse {

    void saveRequestData(Payload payload) throws Exception;

    void saveResponseData(Object payload, String id) throws Exception;

    UUID saveSubscribeRequestData(Payload payload) throws Exception;

}
