package com.ahi.sbl.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "crvs")
@Getter
@Setter
@Entity
public class CRVSinfoPojo {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "uin")
	private Long uin;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "dob")
	private String dob;

	@Column(name = "father_uin")
	private Integer fatherUin;

	@Column(name = "mother_uin")
	private Integer motherUin;

	@Column(name = "marital_status")
	private String maritalStatus;

	@Column(name = "spouse_uin")
	private Integer spouseUin;

	@Column(name = "spouse_name")
	private String spouseName;

	@Column(name = "date_of_death")
	private String dateOfDeath;

	@Column(name = "gender")
	private String gender;

	@Column(name = "brn")
	private String brn;

	@Column(name = "mrn")
	private String mrn;

	@Column(name = "drn")
	private String drn;


}