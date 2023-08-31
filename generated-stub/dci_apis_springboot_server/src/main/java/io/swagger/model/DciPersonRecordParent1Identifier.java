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
 * DciPersonRecordParent1Identifier
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class DciPersonRecordParent1Identifier   {
  @JsonProperty("identifier_type")
  private DciIdentifierType identifierType = null;

  @JsonProperty("identifier")
  private String identifier = null;

  public DciPersonRecordParent1Identifier identifierType(DciIdentifierType identifierType) {
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

  public DciPersonRecordParent1Identifier identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Value of the identifier
   * @return identifier
   **/
  @Schema(description = "Value of the identifier")
  
    public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DciPersonRecordParent1Identifier dciPersonRecordParent1Identifier = (DciPersonRecordParent1Identifier) o;
    return Objects.equals(this.identifierType, dciPersonRecordParent1Identifier.identifierType) &&
        Objects.equals(this.identifier, dciPersonRecordParent1Identifier.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifierType, identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DciPersonRecordParent1Identifier {\n");
    
    sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
