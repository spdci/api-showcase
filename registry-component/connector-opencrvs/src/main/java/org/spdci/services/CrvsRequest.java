package org.spdci.services;

import org.spdci.common.Payload;
import org.spdci.pojo.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CrvsRequest extends CrudRepository<Request, UUID> {

}
