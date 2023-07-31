package org.spdci.services;

import org.spdci.pojo.Response;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CrvsResponse extends CrudRepository<Response, UUID> {

}
