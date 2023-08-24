package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.DciIdentifierType;
import io.swagger.model.DciMaritalStatus;
import io.swagger.model.DciName;
import io.swagger.model.DciPersonRecordParent1Identifier;
import io.swagger.model.DciSex;
import io.swagger.model.OpenidAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 1. Attributes of a person to create fetch records, create verifiable credentials or use in search criteria. 3. Allowes Country/Registry specific implementation extensions using Attribute Name/Value pairs. 
 */
@Schema(description = "1. Attributes of a person to create fetch records, create verifiable credentials or use in search criteria. 3. Allowes Country/Registry specific implementation extensions using Attribute Name/Value pairs. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class DciPersonRecord  implements CoreRegAllRecords {
  @JsonProperty("identifier_type")
  private DciIdentifierType identifierType = null;

  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("name")
  private DciName name = null;

  @JsonProperty("phone_number")
  private String phoneNumber = null;

  @JsonProperty("phone_number_verified")
  private String phoneNumberVerified = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("email_verified")
  private Boolean emailVerified = null;

  @JsonProperty("sex")
  private DciSex sex = null;

  @JsonProperty("birthdate")
  private String birthdate = null;

  @JsonProperty("birthplace")
  private OpenidAddress birthplace = null;

  @JsonProperty("deathdate")
  private OffsetDateTime deathdate = null;

  @JsonProperty("deathplace")
  private OpenidAddress deathplace = null;

  @JsonProperty("address")
  private OpenidAddress address = null;

  @JsonProperty("marital_status")
  private DciMaritalStatus maritalStatus = null;

  @JsonProperty("marriagedate")
  private OffsetDateTime marriagedate = null;

  @JsonProperty("divorcedate")
  private OffsetDateTime divorcedate = null;

  @JsonProperty("parent1_identifier")
  private DciPersonRecordParent1Identifier parent1Identifier = null;

  @JsonProperty("parent2_identifier")
  private DciPersonRecordParent1Identifier parent2Identifier = null;

  public DciPersonRecord identifierType(DciIdentifierType identifierType) {
    this.identifierType = identifierType;
    return this;
  }

  /**
   * Get identifierType
   * @return identifierType
   **/
  @Schema(description = "")
  
    @Valid
    public DciIdentifierType getIdentifierType() {
    return identifierType;
  }

  public void setIdentifierType(DciIdentifierType identifierType) {
    this.identifierType = identifierType;
  }

  public DciPersonRecord identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Value of the identifier
   * @return identifier
   **/
  @Schema(description = "Value of the identifier")
  
    public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public DciPersonRecord name(DciName name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    @Valid
    public DciName getName() {
    return name;
  }

  public void setName(DciName name) {
    this.name = name;
  }

  public DciPersonRecord phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Applicant preferred phone number as in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I/en)
   * @return phoneNumber
   **/
  @Schema(description = "Applicant preferred phone number as in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I/en)")
  
    public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public DciPersonRecord phoneNumberVerified(String phoneNumberVerified) {
    this.phoneNumberVerified = phoneNumberVerified;
    return this;
  }

  /**
   * True if the End-User's phone number has been verified; otherwise false.
   * @return phoneNumberVerified
   **/
  @Schema(description = "True if the End-User's phone number has been verified; otherwise false.")
  
    public String getPhoneNumberVerified() {
    return phoneNumberVerified;
  }

  public void setPhoneNumberVerified(String phoneNumberVerified) {
    this.phoneNumberVerified = phoneNumberVerified;
  }

  public DciPersonRecord email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Applicant preferred e-mail address as in [RFC 5322](https://datatracker.ietf.org/doc/html/rfc5322) [addr-spec](https://datatracker.ietf.org/doc/html/rfc5322#section-3.4.1) [specification](https://datatracker.ietf.org/doc/html/rfc5322#section-3.4.1)
   * @return email
   **/
  @Schema(description = "Applicant preferred e-mail address as in [RFC 5322](https://datatracker.ietf.org/doc/html/rfc5322) [addr-spec](https://datatracker.ietf.org/doc/html/rfc5322#section-3.4.1) [specification](https://datatracker.ietf.org/doc/html/rfc5322#section-3.4.1)")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DciPersonRecord emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

  /**
   * Email address was controlled by the End-User at the time the verification was performed. The means by which an e-mail address is verified is context-specific, and dependent upon the trust framework or contractual agreements within which the parties are operating.
   * @return emailVerified
   **/
  @Schema(description = "Email address was controlled by the End-User at the time the verification was performed. The means by which an e-mail address is verified is context-specific, and dependent upon the trust framework or contractual agreements within which the parties are operating.")
  
    public Boolean isEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public DciPersonRecord sex(DciSex sex) {
    this.sex = sex;
    return this;
  }

  /**
   * Get sex
   * @return sex
   **/
  @Schema(description = "")
  
    @Valid
    public DciSex getSex() {
    return sex;
  }

  public void setSex(DciSex sex) {
    this.sex = sex;
  }

  public DciPersonRecord birthdate(String birthdate) {
    this.birthdate = birthdate;
    return this;
  }

  /**
   * Represents Date and time of the applicant's birth as in [ISO 8601](https://www.iso.org/standard/40874.html)
   * @return birthdate
   **/
  @Schema(description = "Represents Date and time of the applicant's birth as in [ISO 8601](https://www.iso.org/standard/40874.html)")
  
    public String getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }

  public DciPersonRecord birthplace(OpenidAddress birthplace) {
    this.birthplace = birthplace;
    return this;
  }

  /**
   * Get birthplace
   * @return birthplace
   **/
  @Schema(description = "")
  
    @Valid
    public OpenidAddress getBirthplace() {
    return birthplace;
  }

  public void setBirthplace(OpenidAddress birthplace) {
    this.birthplace = birthplace;
  }

  public DciPersonRecord deathdate(OffsetDateTime deathdate) {
    this.deathdate = deathdate;
    return this;
  }

  /**
   * 1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. 
   * @return deathdate
   **/
  @Schema(description = "1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. ")
  
    @Valid
    public OffsetDateTime getDeathdate() {
    return deathdate;
  }

  public void setDeathdate(OffsetDateTime deathdate) {
    this.deathdate = deathdate;
  }

  public DciPersonRecord deathplace(OpenidAddress deathplace) {
    this.deathplace = deathplace;
    return this;
  }

  /**
   * Get deathplace
   * @return deathplace
   **/
  @Schema(description = "")
  
    @Valid
    public OpenidAddress getDeathplace() {
    return deathplace;
  }

  public void setDeathplace(OpenidAddress deathplace) {
    this.deathplace = deathplace;
  }

  public DciPersonRecord address(OpenidAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(description = "")
  
    @Valid
    public OpenidAddress getAddress() {
    return address;
  }

  public void setAddress(OpenidAddress address) {
    this.address = address;
  }

  public DciPersonRecord maritalStatus(DciMaritalStatus maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Get maritalStatus
   * @return maritalStatus
   **/
  @Schema(description = "")
  
    @Valid
    public DciMaritalStatus getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(DciMaritalStatus maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public DciPersonRecord marriagedate(OffsetDateTime marriagedate) {
    this.marriagedate = marriagedate;
    return this;
  }

  /**
   * 1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. 
   * @return marriagedate
   **/
  @Schema(description = "1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. ")
  
    @Valid
    public OffsetDateTime getMarriagedate() {
    return marriagedate;
  }

  public void setMarriagedate(OffsetDateTime marriagedate) {
    this.marriagedate = marriagedate;
  }

  public DciPersonRecord divorcedate(OffsetDateTime divorcedate) {
    this.divorcedate = divorcedate;
    return this;
  }

  /**
   * 1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. 
   * @return divorcedate
   **/
  @Schema(description = "1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. ")
  
    @Valid
    public OffsetDateTime getDivorcedate() {
    return divorcedate;
  }

  public void setDivorcedate(OffsetDateTime divorcedate) {
    this.divorcedate = divorcedate;
  }

  public DciPersonRecord parent1Identifier(DciPersonRecordParent1Identifier parent1Identifier) {
    this.parent1Identifier = parent1Identifier;
    return this;
  }

  /**
   * Get parent1Identifier
   * @return parent1Identifier
   **/
  @Schema(description = "")
  
    @Valid
    public DciPersonRecordParent1Identifier getParent1Identifier() {
    return parent1Identifier;
  }

  public void setParent1Identifier(DciPersonRecordParent1Identifier parent1Identifier) {
    this.parent1Identifier = parent1Identifier;
  }

  public DciPersonRecord parent2Identifier(DciPersonRecordParent1Identifier parent2Identifier) {
    this.parent2Identifier = parent2Identifier;
    return this;
  }

  /**
   * Get parent2Identifier
   * @return parent2Identifier
   **/
  @Schema(description = "")
  
    @Valid
    public DciPersonRecordParent1Identifier getParent2Identifier() {
    return parent2Identifier;
  }

  public void setParent2Identifier(DciPersonRecordParent1Identifier parent2Identifier) {
    this.parent2Identifier = parent2Identifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DciPersonRecord dciPersonRecord = (DciPersonRecord) o;
    return Objects.equals(this.identifierType, dciPersonRecord.identifierType) &&
        Objects.equals(this.identifier, dciPersonRecord.identifier) &&
        Objects.equals(this.name, dciPersonRecord.name) &&
        Objects.equals(this.phoneNumber, dciPersonRecord.phoneNumber) &&
        Objects.equals(this.phoneNumberVerified, dciPersonRecord.phoneNumberVerified) &&
        Objects.equals(this.email, dciPersonRecord.email) &&
        Objects.equals(this.emailVerified, dciPersonRecord.emailVerified) &&
        Objects.equals(this.sex, dciPersonRecord.sex) &&
        Objects.equals(this.birthdate, dciPersonRecord.birthdate) &&
        Objects.equals(this.birthplace, dciPersonRecord.birthplace) &&
        Objects.equals(this.deathdate, dciPersonRecord.deathdate) &&
        Objects.equals(this.deathplace, dciPersonRecord.deathplace) &&
        Objects.equals(this.address, dciPersonRecord.address) &&
        Objects.equals(this.maritalStatus, dciPersonRecord.maritalStatus) &&
        Objects.equals(this.marriagedate, dciPersonRecord.marriagedate) &&
        Objects.equals(this.divorcedate, dciPersonRecord.divorcedate) &&
        Objects.equals(this.parent1Identifier, dciPersonRecord.parent1Identifier) &&
        Objects.equals(this.parent2Identifier, dciPersonRecord.parent2Identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifierType, identifier, name, phoneNumber, phoneNumberVerified, email, emailVerified, sex, birthdate, birthplace, deathdate, deathplace, address, maritalStatus, marriagedate, divorcedate, parent1Identifier, parent2Identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DciPersonRecord {\n");
    
    sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberVerified: ").append(toIndentedString(phoneNumberVerified)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    birthplace: ").append(toIndentedString(birthplace)).append("\n");
    sb.append("    deathdate: ").append(toIndentedString(deathdate)).append("\n");
    sb.append("    deathplace: ").append(toIndentedString(deathplace)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    marriagedate: ").append(toIndentedString(marriagedate)).append("\n");
    sb.append("    divorcedate: ").append(toIndentedString(divorcedate)).append("\n");
    sb.append("    parent1Identifier: ").append(toIndentedString(parent1Identifier)).append("\n");
    sb.append("    parent2Identifier: ").append(toIndentedString(parent2Identifier)).append("\n");
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
