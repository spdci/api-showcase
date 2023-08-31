package io.swagger.services;


import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.model.RegistryOnsearchBody;
import io.swagger.model.RegistrySearchBody;


public interface LocalCRVSService {

    public RegistryOnsearchBody search(RegistrySearchBody payload) throws JsonProcessingException;
}
