package io.swagger.repo;

import io.swagger.pojo.BirthRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BirthRegRepository extends JpaRepository<BirthRegistry, Long>, JpaSpecificationExecutor<BirthRegistry> {

    public BirthRegistry findByRegistrationNumber(String registration_number);

}