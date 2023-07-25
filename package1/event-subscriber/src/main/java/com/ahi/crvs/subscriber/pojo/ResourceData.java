package com.ahi.crvs.subscriber.pojo;

import java.util.List;

import lombok.Data;

@Data
public class ResourceData {
	private String resourceType;
	private String status;
	private Code code;
	private Focus focus;
	private List<Identifier> identifier;
	private List<Extension> extension;
	private String lastModified;
	private BusinessStatus businessStatus;
	private Meta meta;
	private String id;
	
	/// extra fields in patients
	private Boolean active;
	private List<Name> name;
	private String gender;
	private String birthDate;
	private Integer multipleBirthInteger;
	private Identifier masterIdentifier;
	private Subject subject;
}
