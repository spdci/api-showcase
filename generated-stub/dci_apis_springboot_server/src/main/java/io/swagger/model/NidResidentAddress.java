package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Address of the Resident in English Language
 */
@Schema(description = "Address of the Resident in English Language")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class NidResidentAddress   {
  @JsonProperty("care_of")
  private String careOf = null;

  @JsonProperty("building")
  private String building = null;

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("landmark")
  private String landmark = null;

  @JsonProperty("pincode")
  private String pincode = null;

  @JsonProperty("po-name")
  private String poName = null;

  @JsonProperty("vtc")
  private String vtc = null;

  @JsonProperty("vtc-name")
  private String vtcName = null;

  @JsonProperty("sub-district-name")
  private String subDistrictName = null;

  @JsonProperty("district-name")
  private String districtName = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("country")
  private String country = null;

  public NidResidentAddress careOf(String careOf) {
    this.careOf = careOf;
    return this;
  }

  /**
   * Care of information
   * @return careOf
   **/
  @Schema(description = "Care of information")
  
    public String getCareOf() {
    return careOf;
  }

  public void setCareOf(String careOf) {
    this.careOf = careOf;
  }

  public NidResidentAddress building(String building) {
    this.building = building;
    return this;
  }

  /**
   * Building identity
   * @return building
   **/
  @Schema(description = "Building identity")
  
    public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public NidResidentAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Street details
   * @return street
   **/
  @Schema(description = "Street details")
  
    public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public NidResidentAddress landmark(String landmark) {
    this.landmark = landmark;
    return this;
  }

  /**
   * Landmark details
   * @return landmark
   **/
  @Schema(description = "Landmark details")
  
    public String getLandmark() {
    return landmark;
  }

  public void setLandmark(String landmark) {
    this.landmark = landmark;
  }

  public NidResidentAddress pincode(String pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * Pincode
   * @return pincode
   **/
  @Schema(description = "Pincode")
  
    public String getPincode() {
    return pincode;
  }

  public void setPincode(String pincode) {
    this.pincode = pincode;
  }

  public NidResidentAddress poName(String poName) {
    this.poName = poName;
    return this;
  }

  /**
   * Post office name
   * @return poName
   **/
  @Schema(description = "Post office name")
  
    public String getPoName() {
    return poName;
  }

  public void setPoName(String poName) {
    this.poName = poName;
  }

  public NidResidentAddress vtc(String vtc) {
    this.vtc = vtc;
    return this;
  }

  /**
   * Village Town City Code
   * @return vtc
   **/
  @Schema(description = "Village Town City Code")
  
    public String getVtc() {
    return vtc;
  }

  public void setVtc(String vtc) {
    this.vtc = vtc;
  }

  public NidResidentAddress vtcName(String vtcName) {
    this.vtcName = vtcName;
    return this;
  }

  /**
   * Village/Town/City Name
   * @return vtcName
   **/
  @Schema(description = "Village/Town/City Name")
  
    public String getVtcName() {
    return vtcName;
  }

  public void setVtcName(String vtcName) {
    this.vtcName = vtcName;
  }

  public NidResidentAddress subDistrictName(String subDistrictName) {
    this.subDistrictName = subDistrictName;
    return this;
  }

  /**
   * Sub District Name
   * @return subDistrictName
   **/
  @Schema(description = "Sub District Name")
  
    public String getSubDistrictName() {
    return subDistrictName;
  }

  public void setSubDistrictName(String subDistrictName) {
    this.subDistrictName = subDistrictName;
  }

  public NidResidentAddress districtName(String districtName) {
    this.districtName = districtName;
    return this;
  }

  /**
   * District Name
   * @return districtName
   **/
  @Schema(description = "District Name")
  
    public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public NidResidentAddress state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State Name
   * @return state
   **/
  @Schema(description = "State Name")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public NidResidentAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country Name
   * @return country
   **/
  @Schema(description = "Country Name")
  
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NidResidentAddress nidResidentAddress = (NidResidentAddress) o;
    return Objects.equals(this.careOf, nidResidentAddress.careOf) &&
        Objects.equals(this.building, nidResidentAddress.building) &&
        Objects.equals(this.street, nidResidentAddress.street) &&
        Objects.equals(this.landmark, nidResidentAddress.landmark) &&
        Objects.equals(this.pincode, nidResidentAddress.pincode) &&
        Objects.equals(this.poName, nidResidentAddress.poName) &&
        Objects.equals(this.vtc, nidResidentAddress.vtc) &&
        Objects.equals(this.vtcName, nidResidentAddress.vtcName) &&
        Objects.equals(this.subDistrictName, nidResidentAddress.subDistrictName) &&
        Objects.equals(this.districtName, nidResidentAddress.districtName) &&
        Objects.equals(this.state, nidResidentAddress.state) &&
        Objects.equals(this.country, nidResidentAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(careOf, building, street, landmark, pincode, poName, vtc, vtcName, subDistrictName, districtName, state, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NidResidentAddress {\n");
    
    sb.append("    careOf: ").append(toIndentedString(careOf)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    landmark: ").append(toIndentedString(landmark)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    poName: ").append(toIndentedString(poName)).append("\n");
    sb.append("    vtc: ").append(toIndentedString(vtc)).append("\n");
    sb.append("    vtcName: ").append(toIndentedString(vtcName)).append("\n");
    sb.append("    subDistrictName: ").append(toIndentedString(subDistrictName)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
