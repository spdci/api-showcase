package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.LatLong;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GooglePlusCodeGeometryBounds
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class GooglePlusCodeGeometryBounds   {
  @JsonProperty("northeast")
  private LatLong northeast = null;

  @JsonProperty("southwest")
  private LatLong southwest = null;

  public GooglePlusCodeGeometryBounds northeast(LatLong northeast) {
    this.northeast = northeast;
    return this;
  }

  /**
   * Get northeast
   * @return northeast
   **/
  @Schema(description = "")
  
    @Valid
    public LatLong getNortheast() {
    return northeast;
  }

  public void setNortheast(LatLong northeast) {
    this.northeast = northeast;
  }

  public GooglePlusCodeGeometryBounds southwest(LatLong southwest) {
    this.southwest = southwest;
    return this;
  }

  /**
   * Get southwest
   * @return southwest
   **/
  @Schema(description = "")
  
    @Valid
    public LatLong getSouthwest() {
    return southwest;
  }

  public void setSouthwest(LatLong southwest) {
    this.southwest = southwest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglePlusCodeGeometryBounds googlePlusCodeGeometryBounds = (GooglePlusCodeGeometryBounds) o;
    return Objects.equals(this.northeast, googlePlusCodeGeometryBounds.northeast) &&
        Objects.equals(this.southwest, googlePlusCodeGeometryBounds.southwest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(northeast, southwest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePlusCodeGeometryBounds {\n");
    
    sb.append("    northeast: ").append(toIndentedString(northeast)).append("\n");
    sb.append("    southwest: ").append(toIndentedString(southwest)).append("\n");
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
