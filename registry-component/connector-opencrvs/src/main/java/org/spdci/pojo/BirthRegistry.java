package org.spdci.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;



@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "birth_registry")
@Getter
@Setter
@Entity
public class BirthRegistry {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "child_gender")
    private String childGender;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "family_name")
    private String familyName;



}
