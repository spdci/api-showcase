package io.swagger.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@ToString
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
