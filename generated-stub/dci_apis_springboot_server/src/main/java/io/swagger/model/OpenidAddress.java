package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Address info as per OpenID &lt;a href&#x3D;\&quot;https://openid.net/specs/openid-connect-core-1_0.html#AddressClaim\&quot;&gt;specs&lt;/a&gt;
 */
@Schema(description = "Address info as per OpenID <a href=\"https://openid.net/specs/openid-connect-core-1_0.html#AddressClaim\">specs</a>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class OpenidAddress   {
  @JsonProperty("address_line1")
  private String addressLine1 = null;

  @JsonProperty("address_line_2")
  private String addressLine2 = null;

  @JsonProperty("locality")
  private String locality = null;

  @JsonProperty("sub_region_code")
  private String subRegionCode = null;

  @JsonProperty("region_code")
  private String regionCode = null;

  @JsonProperty("postal_code")
  private String postalCode = null;

  @JsonProperty("country_code")
  private String countryCode = null;

  @JsonProperty("geo_location")
  private OneOfopenidAddressGeoLocation geoLocation = null;

  public OpenidAddress addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Full mailing address, formatted for display or use on a mailing label. This field MAY contain multiple lines, separated by newlines. Newlines can be represented either as a carriage return/line feed pair (\"\\r\\n\") or as a single line feed character (\"\\n\").
   * @return addressLine1
   **/
  @Schema(description = "Full mailing address, formatted for display or use on a mailing label. This field MAY contain multiple lines, separated by newlines. Newlines can be represented either as a carriage return/line feed pair (\"\\r\\n\") or as a single line feed character (\"\\n\").")
  
    public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public OpenidAddress addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Full street address component, which MAY include house number, street name, Post Office Box, and multi-line extended street address information. This field MAY contain multiple lines, separated by newlines. Newlines can be represented either as a carriage return/line feed pair (\"\\r\\n\") or as a single line feed character (\"\\n\").
   * @return addressLine2
   **/
  @Schema(description = "Full street address component, which MAY include house number, street name, Post Office Box, and multi-line extended street address information. This field MAY contain multiple lines, separated by newlines. Newlines can be represented either as a carriage return/line feed pair (\"\\r\\n\") or as a single line feed character (\"\\n\").")
  
    public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public OpenidAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * City or locality component.
   * @return locality
   **/
  @Schema(description = "City or locality component.")
  
    public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public OpenidAddress subRegionCode(String subRegionCode) {
    this.subRegionCode = subRegionCode;
    return this;
  }

  /**
   * District or sub-regional code
   * @return subRegionCode
   **/
  @Schema(description = "District or sub-regional code")
  
    public String getSubRegionCode() {
    return subRegionCode;
  }

  public void setSubRegionCode(String subRegionCode) {
    this.subRegionCode = subRegionCode;
  }

  public OpenidAddress regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * State, province, prefecture, or region component.
   * @return regionCode
   **/
  @Schema(description = "State, province, prefecture, or region component.")
  
    public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  public OpenidAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Zip code or postal code component.
   * @return postalCode
   **/
  @Schema(description = "Zip code or postal code component.")
  
    public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public OpenidAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country part of an address represented using an ISO 3-letter code [ISO3166-3], e.g., \"USA\" or \"JPN\". 2-letter ISO codes [ISO3166-1] e.g. ,e.g. US, JP
   * @return countryCode
   **/
  @Schema(description = "Country part of an address represented using an ISO 3-letter code [ISO3166-3], e.g., \"USA\" or \"JPN\". 2-letter ISO codes [ISO3166-1] e.g. ,e.g. US, JP")
  
    public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public OpenidAddress geoLocation(OneOfopenidAddressGeoLocation geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

  /**
   * Refer [Plus Codes](https://github.com/google/open-location-code/wiki/Plus-codes-API) for more details 
   * @return geoLocation
   **/
  @Schema(description = "Refer [Plus Codes](https://github.com/google/open-location-code/wiki/Plus-codes-API) for more details ")
  
    public OneOfopenidAddressGeoLocation getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(OneOfopenidAddressGeoLocation geoLocation) {
    this.geoLocation = geoLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenidAddress openidAddress = (OpenidAddress) o;
    return Objects.equals(this.addressLine1, openidAddress.addressLine1) &&
        Objects.equals(this.addressLine2, openidAddress.addressLine2) &&
        Objects.equals(this.locality, openidAddress.locality) &&
        Objects.equals(this.subRegionCode, openidAddress.subRegionCode) &&
        Objects.equals(this.regionCode, openidAddress.regionCode) &&
        Objects.equals(this.postalCode, openidAddress.postalCode) &&
        Objects.equals(this.countryCode, openidAddress.countryCode) &&
        Objects.equals(this.geoLocation, openidAddress.geoLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, locality, subRegionCode, regionCode, postalCode, countryCode, geoLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenidAddress {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    subRegionCode: ").append(toIndentedString(subRegionCode)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    geoLocation: ").append(toIndentedString(geoLocation)).append("\n");
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
