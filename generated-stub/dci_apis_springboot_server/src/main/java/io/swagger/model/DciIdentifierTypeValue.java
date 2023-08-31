package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.DciIdentifierType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DciIdentifierTypeValue
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class DciIdentifierTypeValue  implements CoreRegAllQueries {
  @JsonProperty("identifier_type")
  private DciIdentifierType identifierType = null;

  @JsonProperty("identifier_value")
  private String identifierValue = null;

  public DciIdentifierTypeValue identifierType(DciIdentifierType identifierType) {
    this.identifierType = identifierType;
    return this;
  }

  /**
   * Get identifierType
   * @return identifierType
   **/
  @Schema(description = "")
  
    @Valid
    public DciIdentifierType getIdentifierType() {
    return identifierType;
  }

  public void setIdentifierType(DciIdentifierType identifierType) {
    this.identifierType = identifierType;
  }

  public DciIdentifierTypeValue identifierValue(String identifierValue) {
    this.identifierValue = identifierValue;
    return this;
  }

  /**
   * Value of the identifier
   * @return identifierValue
   **/
  @Schema(description = "Value of the identifier")
  
    public String getIdentifierValue() {
    return identifierValue;
  }

  public void setIdentifierValue(String identifierValue) {
    this.identifierValue = identifierValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DciIdentifierTypeValue dciIdentifierTypeValue = (DciIdentifierTypeValue) o;
    return Objects.equals(this.identifierType, dciIdentifierTypeValue.identifierType) &&
        Objects.equals(this.identifierValue, dciIdentifierTypeValue.identifierValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifierType, identifierValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DciIdentifierTypeValue {\n");
    
    sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
    sb.append("    identifierValue: ").append(toIndentedString(identifierValue)).append("\n");
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
