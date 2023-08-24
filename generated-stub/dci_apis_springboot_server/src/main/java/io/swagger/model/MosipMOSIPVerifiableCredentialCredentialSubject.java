package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MosipLanguageValueList;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MOSIP Verifiable Credential for Proof of identity
 */
@Schema(description = "MOSIP Verifiable Credential for Proof of identity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class MosipMOSIPVerifiableCredentialCredentialSubject   {
  @JsonProperty("gender")
  private MosipLanguageValueList gender = null;

  @JsonProperty("city")
  private MosipLanguageValueList city = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("dateOfBirth")
  private String dateOfBirth = null;

  @JsonProperty("province")
  private MosipLanguageValueList province = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("addressLine1")
  private MosipLanguageValueList addressLine1 = null;

  @JsonProperty("addressLine2")
  private MosipLanguageValueList addressLine2 = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("UIN")
  private String UIN = null;

  @JsonProperty("region")
  private MosipLanguageValueList region = null;

  @JsonProperty("email")
  private String email = null;

  public MosipMOSIPVerifiableCredentialCredentialSubject gender(MosipLanguageValueList gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   **/
  @Schema(description = "")
  
    @Valid
    public MosipLanguageValueList getGender() {
    return gender;
  }

  public void setGender(MosipLanguageValueList gender) {
    this.gender = gender;
  }

  public MosipMOSIPVerifiableCredentialCredentialSubject city(MosipLanguageValueList city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   **/
  @Schema(description = "")
  
    @Valid
    public MosipLanguageValueList getCity() {
    return city;
  }

  public void setCity(MosipLanguageValueList city) {
    this.city = city;
  }

  public MosipMOSIPVerifiableCredentialCredentialSubject postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
   **/
  @Schema(example = "14022", description = "")
  
    public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public MosipMOSIPVerifiableCredentialCredentialSubject fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
   **/
  @Schema(example = "Thirteen Mosip", description = "")
  
    public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public MosipMOSIPVerifiableCredentialCredentialSubject dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
   **/
  @Schema(example = "2022", description = "")
  
    public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public MosipMOSIPVerifiableCredentialCredentialSubject province(MosipLanguageValueList province) {
    this.province = province;
    return this;
  }

  /**
   * Get province
   * @return province
   **/
  @Schema(description = "")
  
    @Valid
    public MosipLanguageValueList getProvince() {
    return province;
  }

  public void setProvince(MosipLanguageValueList province) {
    this.province = province;
  }

  public MosipMOSIPVerifiableCredentialCredentialSubject phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   **/
  @Schema(example = "9898989898", description = "")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public MosipMOSIPVerifiableCredentialCredentialSubject addressLine1(MosipLanguageValueList addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Get addressLine1
   * @return addressLine1
   **/
  @Schema(description = "")
  
    @Valid
    public MosipLanguageValueList getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(MosipLanguageValueList addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public MosipMOSIPVerifiableCredentialCredentialSubject addressLine2(MosipLanguageValueList addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Get addressLine2
   * @return addressLine2
   **/
  @Schema(description = "")
  
    @Valid
    public MosipLanguageValueList getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(MosipLanguageValueList addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public MosipMOSIPVerifiableCredentialCredentialSubject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "2835824850916304", description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MosipMOSIPVerifiableCredentialCredentialSubject UIN(String UIN) {
    this.UIN = UIN;
    return this;
  }

  /**
   * Get UIN
   * @return UIN
   **/
  @Schema(example = "7346597054", description = "")
  
    public String getUIN() {
    return UIN;
  }

  public void setUIN(String UIN) {
    this.UIN = UIN;
  }

  public MosipMOSIPVerifiableCredentialCredentialSubject region(MosipLanguageValueList region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   **/
  @Schema(description = "")
  
    @Valid
    public MosipLanguageValueList getRegion() {
    return region;
  }

  public void setRegion(MosipLanguageValueList region) {
    this.region = region;
  }

  public MosipMOSIPVerifiableCredentialCredentialSubject email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(example = "thirteen.mosip.123@mailinator.com", description = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MosipMOSIPVerifiableCredentialCredentialSubject mosipMOSIPVerifiableCredentialCredentialSubject = (MosipMOSIPVerifiableCredentialCredentialSubject) o;
    return Objects.equals(this.gender, mosipMOSIPVerifiableCredentialCredentialSubject.gender) &&
        Objects.equals(this.city, mosipMOSIPVerifiableCredentialCredentialSubject.city) &&
        Objects.equals(this.postalCode, mosipMOSIPVerifiableCredentialCredentialSubject.postalCode) &&
        Objects.equals(this.fullName, mosipMOSIPVerifiableCredentialCredentialSubject.fullName) &&
        Objects.equals(this.dateOfBirth, mosipMOSIPVerifiableCredentialCredentialSubject.dateOfBirth) &&
        Objects.equals(this.province, mosipMOSIPVerifiableCredentialCredentialSubject.province) &&
        Objects.equals(this.phone, mosipMOSIPVerifiableCredentialCredentialSubject.phone) &&
        Objects.equals(this.addressLine1, mosipMOSIPVerifiableCredentialCredentialSubject.addressLine1) &&
        Objects.equals(this.addressLine2, mosipMOSIPVerifiableCredentialCredentialSubject.addressLine2) &&
        Objects.equals(this.id, mosipMOSIPVerifiableCredentialCredentialSubject.id) &&
        Objects.equals(this.UIN, mosipMOSIPVerifiableCredentialCredentialSubject.UIN) &&
        Objects.equals(this.region, mosipMOSIPVerifiableCredentialCredentialSubject.region) &&
        Objects.equals(this.email, mosipMOSIPVerifiableCredentialCredentialSubject.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, city, postalCode, fullName, dateOfBirth, province, phone, addressLine1, addressLine2, id, UIN, region, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MosipMOSIPVerifiableCredentialCredentialSubject {\n");
    
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    UIN: ").append(toIndentedString(UIN)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
