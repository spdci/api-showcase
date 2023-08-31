package org.spdci.repo;

import org.spdci.pojo.BirthRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BirthRegRepository extends JpaRepository<BirthRegistry, Long>, JpaSpecificationExecutor<BirthRegistry> {

    public BirthRegistry findByRegistrationNumber(String registration_number);

}