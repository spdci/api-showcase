package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The name data object represents a person&#x27;s name with various components. &lt;br&gt; Reference: [FHIR XPN - extended person name](https://v2plus.hl7.org/2021Jan/data-type/XPN.html#XPN-1) &lt;br&gt; Note: Note: In some cultures, people can have multiple Surname(s), Given name(s), Second name(s), Suffix(s), or Prefix(s) to their name; all can be present in the respective attributes, being separated by separator character like space or /. 
 */
@Schema(description = "The name data object represents a person's name with various components. <br> Reference: [FHIR XPN - extended person name](https://v2plus.hl7.org/2021Jan/data-type/XPN.html#XPN-1) <br> Note: Note: In some cultures, people can have multiple Surname(s), Given name(s), Second name(s), Suffix(s), or Prefix(s) to their name; all can be present in the respective attributes, being separated by separator character like space or /. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class DciName   {
  @JsonProperty("sur_name")
  private String surName = null;

  @JsonProperty("given_name")
  private String givenName = null;

  @JsonProperty("second_name")
  private String secondName = null;

  @JsonProperty("suffix")
  private String suffix = null;

  @JsonProperty("prefix")
  private String prefix = null;

  public DciName surName(String surName) {
    this.surName = surName;
    return this;
  }

  /**
   * Surname(s) or last name(s) of the applicant
   * @return surName
   **/
  @Schema(description = "Surname(s) or last name(s) of the applicant")
  
    public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public DciName givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Given name(s) or first name(s) of the applicant
   * @return givenName
   **/
  @Schema(description = "Given name(s) or first name(s) of the applicant")
  
    public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public DciName secondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

  /**
   * Second name(s) or middle name(s) of the applicant
   * @return secondName
   **/
  @Schema(description = "Second name(s) or middle name(s) of the applicant")
  
    public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public DciName suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Suffix part of the applicant's name
   * @return suffix
   **/
  @Schema(description = "Suffix part of the applicant's name")
  
    public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public DciName prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Prefix part of the applicant's name
   * @return prefix
   **/
  @Schema(description = "Prefix part of the applicant's name")
  
    public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DciName dciName = (DciName) o;
    return Objects.equals(this.surName, dciName.surName) &&
        Objects.equals(this.givenName, dciName.givenName) &&
        Objects.equals(this.secondName, dciName.secondName) &&
        Objects.equals(this.suffix, dciName.suffix) &&
        Objects.equals(this.prefix, dciName.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surName, givenName, secondName, suffix, prefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DciName {\n");
    
    sb.append("    surName: ").append(toIndentedString(surName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
