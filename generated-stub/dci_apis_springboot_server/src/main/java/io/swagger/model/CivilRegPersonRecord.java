package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AttributeNameValueList;
import io.swagger.model.CivilRegEventType;
import io.swagger.model.CivilRegRelatedPerson;
import io.swagger.model.OpenidAddress;
import io.swagger.model.OpenidPersonRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 1. A sample person record to identity an individual or civil regisration event in a typical civil registry 2, This is an indicative list as reference and every country, organisation, system shall customise to local requirements as extensions 
 */
@Schema(description = "1. A sample person record to identity an individual or civil regisration event in a typical civil registry 2, This is an indicative list as reference and every country, organisation, system shall customise to local requirements as extensions ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class CivilRegPersonRecord extends OpenidPersonRecord implements CoreRegAllRecords {
  @JsonProperty("issue_date")
  private OffsetDateTime issueDate = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("registration_type")
  private CivilRegEventType registrationType = null;

  @JsonProperty("registration_number")
  private String registrationNumber = null;

  @JsonProperty("registration_date")
  private String registrationDate = null;

  @JsonProperty("link_registration_number")
  private String linkRegistrationNumber = null;

  @JsonProperty("related_persons")
  @Valid
  private List<CivilRegRelatedPerson> relatedPersons = null;

  public CivilRegPersonRecord issueDate(OffsetDateTime issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Get issueDate
   * @return issueDate
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(OffsetDateTime issueDate) {
    this.issueDate = issueDate;
  }

  public CivilRegPersonRecord status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Civil registry status
   * @return status
   **/
  @Schema(description = "Civil registry status")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CivilRegPersonRecord registrationType(CivilRegEventType registrationType) {
    this.registrationType = registrationType;
    return this;
  }

  /**
   * Get registrationType
   * @return registrationType
   **/
  @Schema(description = "")
  
    @Valid
    public CivilRegEventType getRegistrationType() {
    return registrationType;
  }

  public void setRegistrationType(CivilRegEventType registrationType) {
    this.registrationType = registrationType;
  }

  public CivilRegPersonRecord registrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

  /**
   * Registration number
   * @return registrationNumber
   **/
  @Schema(description = "Registration number")
  
    public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public CivilRegPersonRecord registrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * Registration date
   * @return registrationDate
   **/
  @Schema(description = "Registration date")
  
    public String getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
  }

  public CivilRegPersonRecord linkRegistrationNumber(String linkRegistrationNumber) {
    this.linkRegistrationNumber = linkRegistrationNumber;
    return this;
  }

  /**
   * Registration number to related record. e.g birth registration no for death, marriage registration no for divorce/annulment, etc.,
   * @return linkRegistrationNumber
   **/
  @Schema(description = "Registration number to related record. e.g birth registration no for death, marriage registration no for divorce/annulment, etc.,")
  
    public String getLinkRegistrationNumber() {
    return linkRegistrationNumber;
  }

  public void setLinkRegistrationNumber(String linkRegistrationNumber) {
    this.linkRegistrationNumber = linkRegistrationNumber;
  }

  public CivilRegPersonRecord relatedPersons(List<CivilRegRelatedPerson> relatedPersons) {
    this.relatedPersons = relatedPersons;
    return this;
  }

  public CivilRegPersonRecord addRelatedPersonsItem(CivilRegRelatedPerson relatedPersonsItem) {
    if (this.relatedPersons == null) {
      this.relatedPersons = new ArrayList<CivilRegRelatedPerson>();
    }
    this.relatedPersons.add(relatedPersonsItem);
    return this;
  }

  /**
   * Get relatedPersons
   * @return relatedPersons
   **/
  @Schema(description = "")
      @Valid
    public List<CivilRegRelatedPerson> getRelatedPersons() {
    return relatedPersons;
  }

  public void setRelatedPersons(List<CivilRegRelatedPerson> relatedPersons) {
    this.relatedPersons = relatedPersons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CivilRegPersonRecord civilRegPersonRecord = (CivilRegPersonRecord) o;
    return Objects.equals(this.issueDate, civilRegPersonRecord.issueDate) &&
        Objects.equals(this.status, civilRegPersonRecord.status) &&
        Objects.equals(this.registrationType, civilRegPersonRecord.registrationType) &&
        Objects.equals(this.registrationNumber, civilRegPersonRecord.registrationNumber) &&
        Objects.equals(this.registrationDate, civilRegPersonRecord.registrationDate) &&
        Objects.equals(this.linkRegistrationNumber, civilRegPersonRecord.linkRegistrationNumber) &&
        Objects.equals(this.relatedPersons, civilRegPersonRecord.relatedPersons) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueDate, status, registrationType, registrationNumber, registrationDate, linkRegistrationNumber, relatedPersons, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CivilRegPersonRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    registrationType: ").append(toIndentedString(registrationType)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    linkRegistrationNumber: ").append(toIndentedString(linkRegistrationNumber)).append("\n");
    sb.append("    relatedPersons: ").append(toIndentedString(relatedPersons)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
