package org.spdci.repo;
 
import org.spdci.pojo.BirthRegistry;
import org.spdci.pojo.MarriageRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MarriageRegRepository extends JpaRepository<MarriageRegistry, Long>, JpaSpecificationExecutor<MarriageRegistry> {

    public MarriageRegistry findByRegistrationNumber(String registration_number);
    public MarriageRegistry findByBrideNationalId(String bride_national_id);
    public MarriageRegistry findByGroomNationalId(String groom_national_id);

}