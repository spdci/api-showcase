package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.GooglePlusCodeGeometryBounds;
import io.swagger.model.LatLong;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GooglePlusCodeGeometry
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class GooglePlusCodeGeometry   {
  @JsonProperty("bounds")
  private GooglePlusCodeGeometryBounds bounds = null;

  @JsonProperty("location")
  private LatLong location = null;

  public GooglePlusCodeGeometry bounds(GooglePlusCodeGeometryBounds bounds) {
    this.bounds = bounds;
    return this;
  }

  /**
   * Get bounds
   * @return bounds
   **/
  @Schema(description = "")
  
    @Valid
    public GooglePlusCodeGeometryBounds getBounds() {
    return bounds;
  }

  public void setBounds(GooglePlusCodeGeometryBounds bounds) {
    this.bounds = bounds;
  }

  public GooglePlusCodeGeometry location(LatLong location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   **/
  @Schema(description = "")
  
    @Valid
    public LatLong getLocation() {
    return location;
  }

  public void setLocation(LatLong location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglePlusCodeGeometry googlePlusCodeGeometry = (GooglePlusCodeGeometry) o;
    return Objects.equals(this.bounds, googlePlusCodeGeometry.bounds) &&
        Objects.equals(this.location, googlePlusCodeGeometry.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bounds, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePlusCodeGeometry {\n");
    
    sb.append("    bounds: ").append(toIndentedString(bounds)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
