package com.ahi.sbl.services;

import com.ahi.sbl.pojo.Response;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CrvsResponse extends CrudRepository<Response, UUID> {

}
