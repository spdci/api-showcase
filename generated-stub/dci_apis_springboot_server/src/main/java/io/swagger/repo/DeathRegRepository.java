package io.swagger.repo;


import io.swagger.pojo.DeathRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DeathRegRepository extends JpaRepository<DeathRegistry, Long>, JpaSpecificationExecutor<DeathRegistry> {

    public DeathRegistry findByRegistrationNumber(String registration_number);
    public DeathRegistry findByNationalId(String national_id);
}