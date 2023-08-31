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
@Table(name = "death_registry")
@Getter
@Setter
@Entity
public class DeathRegistry {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "date_of_death")
    private String dateOfDeath;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "family_name")
    private String familyName;



}
