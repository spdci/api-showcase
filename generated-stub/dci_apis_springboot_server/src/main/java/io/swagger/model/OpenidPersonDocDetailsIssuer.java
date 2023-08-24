package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OpenidAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON object containing information about the issuer of this document. This object consists of the following properties
 */
@Schema(description = "JSON object containing information about the issuer of this document. This object consists of the following properties")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class OpenidPersonDocDetailsIssuer   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private OpenidAddress address = null;

  @JsonProperty("country_code")
  private String countryCode = null;

  @JsonProperty("jurisdiction")
  private String jurisdiction = null;

  public OpenidPersonDocDetailsIssuer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Designation of the issuer of the document
   * @return name
   **/
  @Schema(description = "Designation of the issuer of the document")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OpenidPersonDocDetailsIssuer address(OpenidAddress address) {
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

  public OpenidPersonDocDetailsIssuer countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * String denoting the country or supranational organization that issued the document as ISO 3166/ICAO 3-letter codes [ICAO-Doc9303], e.g., \"USA\" or \"JPN\". 2-letter ICAO codes MAY be used in some circumstances for compatibility reasons.
   * @return countryCode
   **/
  @Schema(description = "String denoting the country or supranational organization that issued the document as ISO 3166/ICAO 3-letter codes [ICAO-Doc9303], e.g., \"USA\" or \"JPN\". 2-letter ICAO codes MAY be used in some circumstances for compatibility reasons.")
  
    public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public OpenidPersonDocDetailsIssuer jurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

  /**
   * String containing the name of the region(s)/state(s)/province(s)/municipality(ies) that issuer has jurisdiction over (if this information is not common knowledge or derivable from the address).
   * @return jurisdiction
   **/
  @Schema(description = "String containing the name of the region(s)/state(s)/province(s)/municipality(ies) that issuer has jurisdiction over (if this information is not common knowledge or derivable from the address).")
  
    public String getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenidPersonDocDetailsIssuer openidPersonDocDetailsIssuer = (OpenidPersonDocDetailsIssuer) o;
    return Objects.equals(this.name, openidPersonDocDetailsIssuer.name) &&
        Objects.equals(this.address, openidPersonDocDetailsIssuer.address) &&
        Objects.equals(this.countryCode, openidPersonDocDetailsIssuer.countryCode) &&
        Objects.equals(this.jurisdiction, openidPersonDocDetailsIssuer.jurisdiction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, countryCode, jurisdiction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenidPersonDocDetailsIssuer {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
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
