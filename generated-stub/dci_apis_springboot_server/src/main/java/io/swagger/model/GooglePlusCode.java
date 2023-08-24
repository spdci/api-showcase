package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.GooglePlusCodeGeometry;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Refer [Plus Codes](https://github.com/google/open-location-code/wiki/Plus-codes-API) for more details
 */
@Schema(description = "Refer [Plus Codes](https://github.com/google/open-location-code/wiki/Plus-codes-API) for more details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class GooglePlusCode  implements OneOfopenidAddressGeoLocation {
  @JsonProperty("global_code")
  private String globalCode = null;

  @JsonProperty("geometry")
  private GooglePlusCodeGeometry geometry = null;

  public GooglePlusCode globalCode(String globalCode) {
    this.globalCode = globalCode;
    return this;
  }

  /**
   * Get globalCode
   * @return globalCode
   **/
  @Schema(description = "")
  
    public String getGlobalCode() {
    return globalCode;
  }

  public void setGlobalCode(String globalCode) {
    this.globalCode = globalCode;
  }

  public GooglePlusCode geometry(GooglePlusCodeGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

  /**
   * Get geometry
   * @return geometry
   **/
  @Schema(description = "")
  
    @Valid
    public GooglePlusCodeGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(GooglePlusCodeGeometry geometry) {
    this.geometry = geometry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglePlusCode googlePlusCode = (GooglePlusCode) o;
    return Objects.equals(this.globalCode, googlePlusCode.globalCode) &&
        Objects.equals(this.geometry, googlePlusCode.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalCode, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePlusCode {\n");
    
    sb.append("    globalCode: ").append(toIndentedString(globalCode)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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
