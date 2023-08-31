package com.ahi.sbl.repo;

import com.ahi.sbl.dto.CRVSinfoPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CRVSRegInfoRepository extends JpaRepository<CRVSinfoPojo, Long>, JpaSpecificationExecutor<CRVSinfoPojo> {

//    @Query("SELECT new com.ahi.sbl.dto.SocialInfoPojo(S.uin, S.firstName, S.lastName, S.gender, S.age, S.householdId, " +
//            "S1.uin as householdHeadUin, S1.firstName as householdHeadFirstname, S1.lastName as householdHeadLastname, " +
//            "S1.gender as householdHeadGender, S1.location as householdHeadLocation, S1.povertyscore, " +
//            "S1.age as householdHeadAge, S1.noOfPeople, S1.noOfChild, S1.ishouseholdhead) " +
//            "FROM socialinfo S " +
//            "LEFT JOIN socialinfo S1 ON S1.householdId = S.householdId AND S1.ishouseholdhead = true " +
//            "WHERE S.uin = :uin")
//    List<SocialInfoPojo> getByUIn(@Param("uin") String uin);

}