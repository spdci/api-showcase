package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 1. A sample related person into captured in civil registry 2, This is an indicative list as reference and every country, organisation, system shall customise to local requirements as extensions 
 */
@Schema(description = "1. A sample related person into captured in civil registry 2, This is an indicative list as reference and every country, organisation, system shall customise to local requirements as extensions ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class CivilRegRelatedPerson   {
  @JsonProperty("sub")
  private String sub = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("relationship")
  private String relationship = null;

  public CivilRegRelatedPerson sub(String sub) {
    this.sub = sub;
    return this;
  }

  /**
   * Subject - Identifier for the End-User at the Issuer.
   * @return sub
   **/
  @Schema(description = "Subject - Identifier for the End-User at the Issuer.")
  
    public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public CivilRegRelatedPerson name(String name) {
    this.name = name;
    return this;
  }

  /**
   * End-User's full name in displayable form including all name parts, possibly including titles and suffixes, ordered according to the End-User's locale and preferences.
   * @return name
   **/
  @Schema(description = "End-User's full name in displayable form including all name parts, possibly including titles and suffixes, ordered according to the End-User's locale and preferences.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CivilRegRelatedPerson relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

  /**
   * Indicative relationship values - mother, father, gaurdian, bride, groom, wife, husband, spouse, partner, other 
   * @return relationship
   **/
  @Schema(example = "[\"mother\",\"father\",\"gaurdian\",\"bride\",\"groom\",\"wife\",\"husband\",\"spouse\",\"partner\",\"other\"]", description = "Indicative relationship values - mother, father, gaurdian, bride, groom, wife, husband, spouse, partner, other ")
  
    public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CivilRegRelatedPerson civilRegRelatedPerson = (CivilRegRelatedPerson) o;
    return Objects.equals(this.sub, civilRegRelatedPerson.sub) &&
        Objects.equals(this.name, civilRegRelatedPerson.name) &&
        Objects.equals(this.relationship, civilRegRelatedPerson.relationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sub, name, relationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CivilRegRelatedPerson {\n");
    
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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
