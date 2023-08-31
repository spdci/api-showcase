package org.spdci.pojo;

import lombok.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "marriage_registry")
@Getter
@Setter
@Entity
public class MarriageRegistry {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "date_of_marriage")
    private String dateOfMarriage;

    @Column(name = "bride_first_name")
    private String brideFirstName;

    @Column(name = "bride_family_name")
    private String brideFamilyName;

    @Column(name = "bride_national_id")
    private String brideNationalId;

    @Column(name = "groom_first_name")
    private String groomFirstName;

    @Column(name = "groom_family_name")
    private String groomFamilyName;

    @Column(name = "groom_national_id")
    private String groomNationalId;


}
