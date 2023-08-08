package org.spdci.services;

import org.spdci.pojo.request.SubscribeRequestPayload;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubscribeRequest extends CrudRepository<SubscribeRequestPayload, UUID> {
}
