package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Birth Registration record to sync with MOSIP. [Reference](https://github.com/mosip/mosip-opencrvs/blob/develop/mediator/src/main/java/io/mosip/opencrvs/dto/SyncDto.java)
 */
@Schema(description = "Birth Registration record to sync with MOSIP. [Reference](https://github.com/mosip/mosip-opencrvs/blob/develop/mediator/src/main/java/io/mosip/opencrvs/dto/SyncDto.java)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class MosipRegistrationRecord  implements CoreRegAllRecords {
  @JsonProperty("registrationId")
  private String registrationId = null;

  @JsonProperty("packetId")
  private String packetId = null;

  @JsonProperty("additionalInfoReqId")
  private String additionalInfoReqId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("registrationType")
  private String registrationType = null;

  @JsonProperty("packetHashValue")
  private String packetHashValue = null;

  @JsonProperty("packetSize")
  private Integer packetSize = null;

  @JsonProperty("supervisorStatus")
  private String supervisorStatus = null;

  @JsonProperty("supervisorComment")
  private String supervisorComment = null;

  @JsonProperty("opentionalValues")
  @Valid
  private List<String> opentionalValues = null;

  @JsonProperty("langCode")
  private String langCode = null;

  @JsonProperty("createDateTime")
  private OffsetDateTime createDateTime = null;

  @JsonProperty("updateDateTime")
  private OffsetDateTime updateDateTime = null;

  @JsonProperty("deletedDateTime")
  private OffsetDateTime deletedDateTime = null;

  @JsonProperty("isActive")
  private Boolean isActive = null;

  @JsonProperty("isDeleted")
  private Boolean isDeleted = null;

  public MosipRegistrationRecord registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

  /**
   * Get registrationId
   * @return registrationId
   **/
  @Schema(description = "")
  
    public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public MosipRegistrationRecord packetId(String packetId) {
    this.packetId = packetId;
    return this;
  }

  /**
   * Get packetId
   * @return packetId
   **/
  @Schema(description = "")
  
    public String getPacketId() {
    return packetId;
  }

  public void setPacketId(String packetId) {
    this.packetId = packetId;
  }

  public MosipRegistrationRecord additionalInfoReqId(String additionalInfoReqId) {
    this.additionalInfoReqId = additionalInfoReqId;
    return this;
  }

  /**
   * Get additionalInfoReqId
   * @return additionalInfoReqId
   **/
  @Schema(description = "")
  
    public String getAdditionalInfoReqId() {
    return additionalInfoReqId;
  }

  public void setAdditionalInfoReqId(String additionalInfoReqId) {
    this.additionalInfoReqId = additionalInfoReqId;
  }

  public MosipRegistrationRecord name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MosipRegistrationRecord email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(description = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public MosipRegistrationRecord phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   **/
  @Schema(description = "")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public MosipRegistrationRecord registrationType(String registrationType) {
    this.registrationType = registrationType;
    return this;
  }

  /**
   * Get registrationType
   * @return registrationType
   **/
  @Schema(description = "")
  
    public String getRegistrationType() {
    return registrationType;
  }

  public void setRegistrationType(String registrationType) {
    this.registrationType = registrationType;
  }

  public MosipRegistrationRecord packetHashValue(String packetHashValue) {
    this.packetHashValue = packetHashValue;
    return this;
  }

  /**
   * Get packetHashValue
   * @return packetHashValue
   **/
  @Schema(description = "")
  
    public String getPacketHashValue() {
    return packetHashValue;
  }

  public void setPacketHashValue(String packetHashValue) {
    this.packetHashValue = packetHashValue;
  }

  public MosipRegistrationRecord packetSize(Integer packetSize) {
    this.packetSize = packetSize;
    return this;
  }

  /**
   * Get packetSize
   * @return packetSize
   **/
  @Schema(description = "")
  
    public Integer getPacketSize() {
    return packetSize;
  }

  public void setPacketSize(Integer packetSize) {
    this.packetSize = packetSize;
  }

  public MosipRegistrationRecord supervisorStatus(String supervisorStatus) {
    this.supervisorStatus = supervisorStatus;
    return this;
  }

  /**
   * Get supervisorStatus
   * @return supervisorStatus
   **/
  @Schema(description = "")
  
    public String getSupervisorStatus() {
    return supervisorStatus;
  }

  public void setSupervisorStatus(String supervisorStatus) {
    this.supervisorStatus = supervisorStatus;
  }

  public MosipRegistrationRecord supervisorComment(String supervisorComment) {
    this.supervisorComment = supervisorComment;
    return this;
  }

  /**
   * Get supervisorComment
   * @return supervisorComment
   **/
  @Schema(description = "")
  
    public String getSupervisorComment() {
    return supervisorComment;
  }

  public void setSupervisorComment(String supervisorComment) {
    this.supervisorComment = supervisorComment;
  }

  public MosipRegistrationRecord opentionalValues(List<String> opentionalValues) {
    this.opentionalValues = opentionalValues;
    return this;
  }

  public MosipRegistrationRecord addOpentionalValuesItem(String opentionalValuesItem) {
    if (this.opentionalValues == null) {
      this.opentionalValues = new ArrayList<String>();
    }
    this.opentionalValues.add(opentionalValuesItem);
    return this;
  }

  /**
   * Get opentionalValues
   * @return opentionalValues
   **/
  @Schema(description = "")
  
    public List<String> getOpentionalValues() {
    return opentionalValues;
  }

  public void setOpentionalValues(List<String> opentionalValues) {
    this.opentionalValues = opentionalValues;
  }

  public MosipRegistrationRecord langCode(String langCode) {
    this.langCode = langCode;
    return this;
  }

  /**
   * Get langCode
   * @return langCode
   **/
  @Schema(description = "")
  
    public String getLangCode() {
    return langCode;
  }

  public void setLangCode(String langCode) {
    this.langCode = langCode;
  }

  public MosipRegistrationRecord createDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  /**
   * 1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. 
   * @return createDateTime
   **/
  @Schema(description = "1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. ")
  
    @Valid
    public OffsetDateTime getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
  }

  public MosipRegistrationRecord updateDateTime(OffsetDateTime updateDateTime) {
    this.updateDateTime = updateDateTime;
    return this;
  }

  /**
   * 1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. 
   * @return updateDateTime
   **/
  @Schema(description = "1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. ")
  
    @Valid
    public OffsetDateTime getUpdateDateTime() {
    return updateDateTime;
  }

  public void setUpdateDateTime(OffsetDateTime updateDateTime) {
    this.updateDateTime = updateDateTime;
  }

  public MosipRegistrationRecord deletedDateTime(OffsetDateTime deletedDateTime) {
    this.deletedDateTime = deletedDateTime;
    return this;
  }

  /**
   * 1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. 
   * @return deletedDateTime
   **/
  @Schema(description = "1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. ")
  
    @Valid
    public OffsetDateTime getDeletedDateTime() {
    return deletedDateTime;
  }

  public void setDeletedDateTime(OffsetDateTime deletedDateTime) {
    this.deletedDateTime = deletedDateTime;
  }

  public MosipRegistrationRecord isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
   **/
  @Schema(description = "")
  
    public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public MosipRegistrationRecord isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
   **/
  @Schema(description = "")
  
    public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MosipRegistrationRecord mosipRegistrationRecord = (MosipRegistrationRecord) o;
    return Objects.equals(this.registrationId, mosipRegistrationRecord.registrationId) &&
        Objects.equals(this.packetId, mosipRegistrationRecord.packetId) &&
        Objects.equals(this.additionalInfoReqId, mosipRegistrationRecord.additionalInfoReqId) &&
        Objects.equals(this.name, mosipRegistrationRecord.name) &&
        Objects.equals(this.email, mosipRegistrationRecord.email) &&
        Objects.equals(this.phone, mosipRegistrationRecord.phone) &&
        Objects.equals(this.registrationType, mosipRegistrationRecord.registrationType) &&
        Objects.equals(this.packetHashValue, mosipRegistrationRecord.packetHashValue) &&
        Objects.equals(this.packetSize, mosipRegistrationRecord.packetSize) &&
        Objects.equals(this.supervisorStatus, mosipRegistrationRecord.supervisorStatus) &&
        Objects.equals(this.supervisorComment, mosipRegistrationRecord.supervisorComment) &&
        Objects.equals(this.opentionalValues, mosipRegistrationRecord.opentionalValues) &&
        Objects.equals(this.langCode, mosipRegistrationRecord.langCode) &&
        Objects.equals(this.createDateTime, mosipRegistrationRecord.createDateTime) &&
        Objects.equals(this.updateDateTime, mosipRegistrationRecord.updateDateTime) &&
        Objects.equals(this.deletedDateTime, mosipRegistrationRecord.deletedDateTime) &&
        Objects.equals(this.isActive, mosipRegistrationRecord.isActive) &&
        Objects.equals(this.isDeleted, mosipRegistrationRecord.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationId, packetId, additionalInfoReqId, name, email, phone, registrationType, packetHashValue, packetSize, supervisorStatus, supervisorComment, opentionalValues, langCode, createDateTime, updateDateTime, deletedDateTime, isActive, isDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MosipRegistrationRecord {\n");
    
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    packetId: ").append(toIndentedString(packetId)).append("\n");
    sb.append("    additionalInfoReqId: ").append(toIndentedString(additionalInfoReqId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    registrationType: ").append(toIndentedString(registrationType)).append("\n");
    sb.append("    packetHashValue: ").append(toIndentedString(packetHashValue)).append("\n");
    sb.append("    packetSize: ").append(toIndentedString(packetSize)).append("\n");
    sb.append("    supervisorStatus: ").append(toIndentedString(supervisorStatus)).append("\n");
    sb.append("    supervisorComment: ").append(toIndentedString(supervisorComment)).append("\n");
    sb.append("    opentionalValues: ").append(toIndentedString(opentionalValues)).append("\n");
    sb.append("    langCode: ").append(toIndentedString(langCode)).append("\n");
    sb.append("    createDateTime: ").append(toIndentedString(createDateTime)).append("\n");
    sb.append("    updateDateTime: ").append(toIndentedString(updateDateTime)).append("\n");
    sb.append("    deletedDateTime: ").append(toIndentedString(deletedDateTime)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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
