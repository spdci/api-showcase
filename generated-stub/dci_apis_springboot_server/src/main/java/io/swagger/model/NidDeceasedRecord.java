package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.NidDocument;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Deceased record obtainable from registries
 */
@Schema(description = "Deceased record obtainable from registries")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class NidDeceasedRecord  implements CoreRegAllRecords {
  @JsonProperty("reference_number")
  private String referenceNumber = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("dob")
  private String dob = null;

  @JsonProperty("dod")
  private String dod = null;

  @JsonProperty("reported_date")
  private String reportedDate = null;

  @JsonProperty("demo_check_status")
  private Boolean demoCheckStatus = null;

  @JsonProperty("demo_check_date")
  private String demoCheckDate = null;

  @JsonProperty("document")
  private NidDocument document = null;

  public NidDeceasedRecord referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * unique reference number mantained in the registry for recording death record or 
   * @return referenceNumber
   **/
  @Schema(description = "unique reference number mantained in the registry for recording death record or ")
  
    public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public NidDeceasedRecord name(String name) {
    this.name = name;
    return this;
  }

  /**
   * End-User's full name in displayable form including all name parts, possibly including titles and suffixes, ordered according to the End-User's locale and preferences.
   * @return name
   **/
  @Schema(description = "End-User's full name in displayable form including all name parts, possibly including titles and suffixes, ordered according to the End-User's locale and preferences.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NidDeceasedRecord gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * End-User's gender. Values defined by this specification are female, male, transgender.
   * @return gender
   **/
  @Schema(description = "End-User's gender. Values defined by this specification are female, male, transgender.")
  
    public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public NidDeceasedRecord dob(String dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Date of Birth in DDMMYYYY format
   * @return dob
   **/
  @Schema(description = "Date of Birth in DDMMYYYY format")
  
    public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public NidDeceasedRecord dod(String dod) {
    this.dod = dod;
    return this;
  }

  /**
   * Date of Death in DDMMYYYY format
   * @return dod
   **/
  @Schema(description = "Date of Death in DDMMYYYY format")
  
    public String getDod() {
    return dod;
  }

  public void setDod(String dod) {
    this.dod = dod;
  }

  public NidDeceasedRecord reportedDate(String reportedDate) {
    this.reportedDate = reportedDate;
    return this;
  }

  /**
   * Date in DDMMYYYY format to record on which the death incident reported
   * @return reportedDate
   **/
  @Schema(description = "Date in DDMMYYYY format to record on which the death incident reported")
  
    public String getReportedDate() {
    return reportedDate;
  }

  public void setReportedDate(String reportedDate) {
    this.reportedDate = reportedDate;
  }

  public NidDeceasedRecord demoCheckStatus(Boolean demoCheckStatus) {
    this.demoCheckStatus = demoCheckStatus;
    return this;
  }

  /**
   * whether demo check has been undertaken or not
   * @return demoCheckStatus
   **/
  @Schema(description = "whether demo check has been undertaken or not")
  
    public Boolean isDemoCheckStatus() {
    return demoCheckStatus;
  }

  public void setDemoCheckStatus(Boolean demoCheckStatus) {
    this.demoCheckStatus = demoCheckStatus;
  }

  public NidDeceasedRecord demoCheckDate(String demoCheckDate) {
    this.demoCheckDate = demoCheckDate;
    return this;
  }

  /**
   * Date in DDMMYYYY format to capture the Demo Check Date
   * @return demoCheckDate
   **/
  @Schema(description = "Date in DDMMYYYY format to capture the Demo Check Date")
  
    public String getDemoCheckDate() {
    return demoCheckDate;
  }

  public void setDemoCheckDate(String demoCheckDate) {
    this.demoCheckDate = demoCheckDate;
  }

  public NidDeceasedRecord document(NidDocument document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
   **/
  @Schema(description = "")
  
    @Valid
    public NidDocument getDocument() {
    return document;
  }

  public void setDocument(NidDocument document) {
    this.document = document;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NidDeceasedRecord nidDeceasedRecord = (NidDeceasedRecord) o;
    return Objects.equals(this.referenceNumber, nidDeceasedRecord.referenceNumber) &&
        Objects.equals(this.name, nidDeceasedRecord.name) &&
        Objects.equals(this.gender, nidDeceasedRecord.gender) &&
        Objects.equals(this.dob, nidDeceasedRecord.dob) &&
        Objects.equals(this.dod, nidDeceasedRecord.dod) &&
        Objects.equals(this.reportedDate, nidDeceasedRecord.reportedDate) &&
        Objects.equals(this.demoCheckStatus, nidDeceasedRecord.demoCheckStatus) &&
        Objects.equals(this.demoCheckDate, nidDeceasedRecord.demoCheckDate) &&
        Objects.equals(this.document, nidDeceasedRecord.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceNumber, name, gender, dob, dod, reportedDate, demoCheckStatus, demoCheckDate, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NidDeceasedRecord {\n");
    
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    dod: ").append(toIndentedString(dod)).append("\n");
    sb.append("    reportedDate: ").append(toIndentedString(reportedDate)).append("\n");
    sb.append("    demoCheckStatus: ").append(toIndentedString(demoCheckStatus)).append("\n");
    sb.append("    demoCheckDate: ").append(toIndentedString(demoCheckDate)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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
