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
