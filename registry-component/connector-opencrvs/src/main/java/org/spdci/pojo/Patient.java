package org.spdci.pojo;

import java.util.List;

import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.dstu3.model.ContactPoint;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.DateType;
import org.hl7.fhir.dstu3.model.DomainResource; 
import org.hl7.fhir.dstu3.model.Patient.ContactComponent;
import org.hl7.fhir.dstu3.model.ResourceType;
import org.hl7.fhir.dstu3.model.Type;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import lombok.Data;

@ResourceDef(name = "Patient", profile = "http://hl7.org/fhir/StructureDefinition/Patient")
@Data
public class Patient extends DomainResource {
	private static final long serialVersionUID = 1L;

	@Child(name = "name", type = { HumanName.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
	@Description(shortDefinition = "A name associated with the contact person", formalDefinition = "A name associated with the contact person.")
	private HumanName name;

	/**
	 * The date of birth for the individual.
	 */
	@Child(name = "birthDate", type = { DateType.class }, order = 5, min = 0, max = 1, modifier = false, summary = true)
	@Description(shortDefinition = "The date of birth for the individual", formalDefinition = "The date of birth for the individual.")
	protected DateType birthDate;

	/**
	 * A contact detail (e.g. a telephone number or an email address) by which the
	 * individual may be contacted.
	 */
	@Child(name = "telecom", type = {
			ContactPoint.class }, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
	@Description(shortDefinition = "A contact detail for the individual", formalDefinition = "A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.")
	protected List<ContactPoint> telecom;

	/**
	 * Indicates if the individual is deceased or not.
	 */
	@Child(name = "deceased", type = { BooleanType.class,
			DateTimeType.class }, order = 6, min = 0, max = 1, modifier = true, summary = true)
	@Description(shortDefinition = "Indicates if the individual is deceased or not", formalDefinition = "Indicates if the individual is deceased or not.")
	protected Type deceased;

	/**
	 * A contact party (e.g. guardian, partner, friend) for the patient.
	 */
	@Child(name = "contact", type = {}, order = 11, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
	@Description(shortDefinition = "A contact party (e.g. guardian, partner, friend) for the patient", formalDefinition = "A contact party (e.g. guardian, partner, friend) for the patient.")
	protected List<ContactComponent> contact;

	/**
	 * An identifier for this patient.
	 */
	@Child(name = "identifier", type = {
			Identifier.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
	@Description(shortDefinition = "An identifier for this patient", formalDefinition = "An identifier for this patient.")
	protected List<Identifier> identifier;
	
	/**
	 * Search parameter: <b>name</b>
	 * <p>
	 * Description: <b>A server defined search that may match any of the string
	 * fields in the HumanName, including family, give, prefix, suffix, suffix,
	 * and/or text</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name = "name", path = "Patient.name", description = "A server defined search that may match any of the string fields in the HumanName, including family, give, prefix, suffix, suffix, and/or text", type = "string")
	public static final String SP_NAME = "name";
	/**
	 * <b>Fluent Client</b> search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>A server defined search that may match any of the string
	 * fields in the HumanName, including family, give, prefix, suffix, suffix,
	 * and/or text</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.name</b><br>
	 * </p>
	 */
	public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(
			SP_NAME);

	@SearchParamDefinition(name = "given", path = "Patient.name.given", description = "A portion of the given name of the patient", type = "string")
	public static final String SP_GIVEN = "given";
	/**
	 * <b>Fluent Client</b> search parameter constant for <b>given</b>
	 * <p>
	 * Description: <b>A portion of the given name of the patient</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.name.given</b><br>
	 * </p>
	 */
	public static final ca.uhn.fhir.rest.gclient.StringClientParam GIVEN = new ca.uhn.fhir.rest.gclient.StringClientParam(
			SP_GIVEN);

	/**
	 * Search parameter: <b>family</b>
	 * <p>
	 * Description: <b>A portion of the family name of the patient</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.name.family</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name = "family", path = "Patient.name.family", description = "A portion of the family name of the patient", type = "string")
	public static final String SP_FAMILY = "family";
	/**
	 * <b>Fluent Client</b> search parameter constant for <b>family</b>
	 * <p>
	 * Description: <b>A portion of the family name of the patient</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.name.family</b><br>
	 * </p>
	 */
	public static final ca.uhn.fhir.rest.gclient.StringClientParam FAMILY = new ca.uhn.fhir.rest.gclient.StringClientParam(
			SP_FAMILY);

	/**
	 * Search parameter: <b>birthdate</b>
	 * <p>
	 * Description: <b>The patient's date of birth</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Patient.birthDate</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name = "birthdate", path = "Patient.birthDate", description = "The patient's date of birth", type = "date")
	public static final String SP_BIRTHDATE = "birthdate";
	/**
	 * <b>Fluent Client</b> search parameter constant for <b>birthdate</b>
	 * <p>
	 * Description: <b>The patient's date of birth</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Patient.birthDate</b><br>
	 * </p>
	 */
	public static final ca.uhn.fhir.rest.gclient.DateClientParam BIRTHDATE = new ca.uhn.fhir.rest.gclient.DateClientParam(
			SP_BIRTHDATE);

	/**
	 * Search parameter: <b>death-date</b>
	 * <p>
	 * Description: <b>The date of death has been provided and satisfies this search
	 * value</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Patient.deceasedDateTime</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name = "death-date", path = "Patient.deceased.as(DateTime)", description = "The date of death has been provided and satisfies this search value", type = "date")
	public static final String SP_DEATH_DATE = "death-date";
	/**
	 * <b>Fluent Client</b> search parameter constant for <b>death-date</b>
	 * <p>
	 * Description: <b>The date of death has been provided and satisfies this search
	 * value</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Patient.deceasedDateTime</b><br>
	 * </p>
	 */
	public static final ca.uhn.fhir.rest.gclient.DateClientParam DEATH_DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(
			SP_DEATH_DATE);

	/**
	 * Search parameter: <b>phone</b>
	 * <p>
	 * Description: <b>A value in a phone contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.telecom(system=phone)</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name = "phone", path = "Patient.telecom.where(system='phone')", description = "A value in a phone contact", type = "token")
	public static final String SP_PHONE = "phone";
	/**
	 * <b>Fluent Client</b> search parameter constant for <b>phone</b>
	 * <p>
	 * Description: <b>A value in a phone contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.telecom(system=phone)</b><br>
	 * </p>
	 */
	public static final ca.uhn.fhir.rest.gclient.TokenClientParam PHONE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
			SP_PHONE);

	@Override
	public ResourceType getResourceType() {
		return ResourceType.Patient;
	}

	@Override
	public DomainResource copy() {
		// TODO Auto-generated method stub
		return null;
	}
}
