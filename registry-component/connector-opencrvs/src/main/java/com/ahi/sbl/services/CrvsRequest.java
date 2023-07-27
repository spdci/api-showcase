package com.ahi.sbl.services;

import com.ahi.sbl.pojo.Request;
import org.spdci.common.Payload;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CrvsRequest extends CrudRepository<Request, UUID> {

    void saveRequestData(Payload payload);
}
