package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Resident Local Address
 */
@Schema(description = "Resident Local Address")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class NidResidentLocalAddress   {
  @JsonProperty("local-careof")
  private String localCareof = null;

  @JsonProperty("local-building")
  private String localBuilding = null;

  @JsonProperty("local-street")
  private String localStreet = null;

  @JsonProperty("local-landmark")
  private String localLandmark = null;

  @JsonProperty("local-locality")
  private String localLocality = null;

  @JsonProperty("pincode")
  private String pincode = null;

  @JsonProperty("po-name-local")
  private String poNameLocal = null;

  @JsonProperty("local-vtc")
  private String localVtc = null;

  @JsonProperty("local-subdistrict")
  private String localSubdistrict = null;

  @JsonProperty("local-district")
  private String localDistrict = null;

  @JsonProperty("local-state")
  private String localState = null;

  @JsonProperty("local-country")
  private String localCountry = null;

  public NidResidentLocalAddress localCareof(String localCareof) {
    this.localCareof = localCareof;
    return this;
  }

  /**
   * Care of information in local language
   * @return localCareof
   **/
  @Schema(description = "Care of information in local language")
  
    public String getLocalCareof() {
    return localCareof;
  }

  public void setLocalCareof(String localCareof) {
    this.localCareof = localCareof;
  }

  public NidResidentLocalAddress localBuilding(String localBuilding) {
    this.localBuilding = localBuilding;
    return this;
  }

  /**
   * Building information in local language
   * @return localBuilding
   **/
  @Schema(description = "Building information in local language")
  
    public String getLocalBuilding() {
    return localBuilding;
  }

  public void setLocalBuilding(String localBuilding) {
    this.localBuilding = localBuilding;
  }

  public NidResidentLocalAddress localStreet(String localStreet) {
    this.localStreet = localStreet;
    return this;
  }

  /**
   * Street information in local language
   * @return localStreet
   **/
  @Schema(description = "Street information in local language")
  
    public String getLocalStreet() {
    return localStreet;
  }

  public void setLocalStreet(String localStreet) {
    this.localStreet = localStreet;
  }

  public NidResidentLocalAddress localLandmark(String localLandmark) {
    this.localLandmark = localLandmark;
    return this;
  }

  /**
   * Landmark information in local language
   * @return localLandmark
   **/
  @Schema(description = "Landmark information in local language")
  
    public String getLocalLandmark() {
    return localLandmark;
  }

  public void setLocalLandmark(String localLandmark) {
    this.localLandmark = localLandmark;
  }

  public NidResidentLocalAddress localLocality(String localLocality) {
    this.localLocality = localLocality;
    return this;
  }

  /**
   * locality information in local language
   * @return localLocality
   **/
  @Schema(description = "locality information in local language")
  
    public String getLocalLocality() {
    return localLocality;
  }

  public void setLocalLocality(String localLocality) {
    this.localLocality = localLocality;
  }

  public NidResidentLocalAddress pincode(String pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * pincode
   * @return pincode
   **/
  @Schema(description = "pincode")
  
    public String getPincode() {
    return pincode;
  }

  public void setPincode(String pincode) {
    this.pincode = pincode;
  }

  public NidResidentLocalAddress poNameLocal(String poNameLocal) {
    this.poNameLocal = poNameLocal;
    return this;
  }

  /**
   * Post office name in local
   * @return poNameLocal
   **/
  @Schema(description = "Post office name in local")
  
    public String getPoNameLocal() {
    return poNameLocal;
  }

  public void setPoNameLocal(String poNameLocal) {
    this.poNameLocal = poNameLocal;
  }

  public NidResidentLocalAddress localVtc(String localVtc) {
    this.localVtc = localVtc;
    return this;
  }

  /**
   * vtc information in local language
   * @return localVtc
   **/
  @Schema(description = "vtc information in local language")
  
    public String getLocalVtc() {
    return localVtc;
  }

  public void setLocalVtc(String localVtc) {
    this.localVtc = localVtc;
  }

  public NidResidentLocalAddress localSubdistrict(String localSubdistrict) {
    this.localSubdistrict = localSubdistrict;
    return this;
  }

  /**
   * Sub district information in local language
   * @return localSubdistrict
   **/
  @Schema(description = "Sub district information in local language")
  
    public String getLocalSubdistrict() {
    return localSubdistrict;
  }

  public void setLocalSubdistrict(String localSubdistrict) {
    this.localSubdistrict = localSubdistrict;
  }

  public NidResidentLocalAddress localDistrict(String localDistrict) {
    this.localDistrict = localDistrict;
    return this;
  }

  /**
   * district information in local language
   * @return localDistrict
   **/
  @Schema(description = "district information in local language")
  
    public String getLocalDistrict() {
    return localDistrict;
  }

  public void setLocalDistrict(String localDistrict) {
    this.localDistrict = localDistrict;
  }

  public NidResidentLocalAddress localState(String localState) {
    this.localState = localState;
    return this;
  }

  /**
   * State information in local language
   * @return localState
   **/
  @Schema(description = "State information in local language")
  
    public String getLocalState() {
    return localState;
  }

  public void setLocalState(String localState) {
    this.localState = localState;
  }

  public NidResidentLocalAddress localCountry(String localCountry) {
    this.localCountry = localCountry;
    return this;
  }

  /**
   * Country information in local language
   * @return localCountry
   **/
  @Schema(description = "Country information in local language")
  
    public String getLocalCountry() {
    return localCountry;
  }

  public void setLocalCountry(String localCountry) {
    this.localCountry = localCountry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NidResidentLocalAddress nidResidentLocalAddress = (NidResidentLocalAddress) o;
    return Objects.equals(this.localCareof, nidResidentLocalAddress.localCareof) &&
        Objects.equals(this.localBuilding, nidResidentLocalAddress.localBuilding) &&
        Objects.equals(this.localStreet, nidResidentLocalAddress.localStreet) &&
        Objects.equals(this.localLandmark, nidResidentLocalAddress.localLandmark) &&
        Objects.equals(this.localLocality, nidResidentLocalAddress.localLocality) &&
        Objects.equals(this.pincode, nidResidentLocalAddress.pincode) &&
        Objects.equals(this.poNameLocal, nidResidentLocalAddress.poNameLocal) &&
        Objects.equals(this.localVtc, nidResidentLocalAddress.localVtc) &&
        Objects.equals(this.localSubdistrict, nidResidentLocalAddress.localSubdistrict) &&
        Objects.equals(this.localDistrict, nidResidentLocalAddress.localDistrict) &&
        Objects.equals(this.localState, nidResidentLocalAddress.localState) &&
        Objects.equals(this.localCountry, nidResidentLocalAddress.localCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localCareof, localBuilding, localStreet, localLandmark, localLocality, pincode, poNameLocal, localVtc, localSubdistrict, localDistrict, localState, localCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NidResidentLocalAddress {\n");
    
    sb.append("    localCareof: ").append(toIndentedString(localCareof)).append("\n");
    sb.append("    localBuilding: ").append(toIndentedString(localBuilding)).append("\n");
    sb.append("    localStreet: ").append(toIndentedString(localStreet)).append("\n");
    sb.append("    localLandmark: ").append(toIndentedString(localLandmark)).append("\n");
    sb.append("    localLocality: ").append(toIndentedString(localLocality)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    poNameLocal: ").append(toIndentedString(poNameLocal)).append("\n");
    sb.append("    localVtc: ").append(toIndentedString(localVtc)).append("\n");
    sb.append("    localSubdistrict: ").append(toIndentedString(localSubdistrict)).append("\n");
    sb.append("    localDistrict: ").append(toIndentedString(localDistrict)).append("\n");
    sb.append("    localState: ").append(toIndentedString(localState)).append("\n");
    sb.append("    localCountry: ").append(toIndentedString(localCountry)).append("\n");
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
