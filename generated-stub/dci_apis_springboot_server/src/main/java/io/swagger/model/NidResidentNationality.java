package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Resident Nationality Information,Nationality information of the Resident
 */
@Schema(description = "Resident Nationality Information,Nationality information of the Resident")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class NidResidentNationality   {
  @JsonProperty("nationality")
  private String nationality = null;

  @JsonProperty("passport_number")
  private String passportNumber = null;

  @JsonProperty("passport_valid_upto")
  private String passportValidUpto = null;

  @JsonProperty("visa_number")
  private String visaNumber = null;

  @JsonProperty("visa_vald_upto")
  private String visaValdUpto = null;

  @JsonProperty("oci_number")
  private String ociNumber = null;

  @JsonProperty("oci_valid_upto")
  private String ociValidUpto = null;

  public NidResidentNationality nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Nationality information of the Resident
   * @return nationality
   **/
  @Schema(description = "Nationality information of the Resident")
  
    public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public NidResidentNationality passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * Passport number of the Resident
   * @return passportNumber
   **/
  @Schema(description = "Passport number of the Resident")
  
    public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public NidResidentNationality passportValidUpto(String passportValidUpto) {
    this.passportValidUpto = passportValidUpto;
    return this;
  }

  /**
   * Passport validity date in DDMMYYYY format
   * @return passportValidUpto
   **/
  @Schema(description = "Passport validity date in DDMMYYYY format")
  
    public String getPassportValidUpto() {
    return passportValidUpto;
  }

  public void setPassportValidUpto(String passportValidUpto) {
    this.passportValidUpto = passportValidUpto;
  }

  public NidResidentNationality visaNumber(String visaNumber) {
    this.visaNumber = visaNumber;
    return this;
  }

  /**
   * Visa number of the Resident
   * @return visaNumber
   **/
  @Schema(description = "Visa number of the Resident")
  
    public String getVisaNumber() {
    return visaNumber;
  }

  public void setVisaNumber(String visaNumber) {
    this.visaNumber = visaNumber;
  }

  public NidResidentNationality visaValdUpto(String visaValdUpto) {
    this.visaValdUpto = visaValdUpto;
    return this;
  }

  /**
   * Visa validity details
   * @return visaValdUpto
   **/
  @Schema(description = "Visa validity details")
  
    public String getVisaValdUpto() {
    return visaValdUpto;
  }

  public void setVisaValdUpto(String visaValdUpto) {
    this.visaValdUpto = visaValdUpto;
  }

  public NidResidentNationality ociNumber(String ociNumber) {
    this.ociNumber = ociNumber;
    return this;
  }

  /**
   * OCI card deatils
   * @return ociNumber
   **/
  @Schema(description = "OCI card deatils")
  
    public String getOciNumber() {
    return ociNumber;
  }

  public void setOciNumber(String ociNumber) {
    this.ociNumber = ociNumber;
  }

  public NidResidentNationality ociValidUpto(String ociValidUpto) {
    this.ociValidUpto = ociValidUpto;
    return this;
  }

  /**
   * OCI Validity date in DDMMYYYY format
   * @return ociValidUpto
   **/
  @Schema(description = "OCI Validity date in DDMMYYYY format")
  
    public String getOciValidUpto() {
    return ociValidUpto;
  }

  public void setOciValidUpto(String ociValidUpto) {
    this.ociValidUpto = ociValidUpto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NidResidentNationality nidResidentNationality = (NidResidentNationality) o;
    return Objects.equals(this.nationality, nidResidentNationality.nationality) &&
        Objects.equals(this.passportNumber, nidResidentNationality.passportNumber) &&
        Objects.equals(this.passportValidUpto, nidResidentNationality.passportValidUpto) &&
        Objects.equals(this.visaNumber, nidResidentNationality.visaNumber) &&
        Objects.equals(this.visaValdUpto, nidResidentNationality.visaValdUpto) &&
        Objects.equals(this.ociNumber, nidResidentNationality.ociNumber) &&
        Objects.equals(this.ociValidUpto, nidResidentNationality.ociValidUpto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nationality, passportNumber, passportValidUpto, visaNumber, visaValdUpto, ociNumber, ociValidUpto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NidResidentNationality {\n");
    
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    passportValidUpto: ").append(toIndentedString(passportValidUpto)).append("\n");
    sb.append("    visaNumber: ").append(toIndentedString(visaNumber)).append("\n");
    sb.append("    visaValdUpto: ").append(toIndentedString(visaValdUpto)).append("\n");
    sb.append("    ociNumber: ").append(toIndentedString(ociNumber)).append("\n");
    sb.append("    ociValidUpto: ").append(toIndentedString(ociValidUpto)).append("\n");
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
