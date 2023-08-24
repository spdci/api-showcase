package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Resident Local Name
 */
@Schema(description = "Resident Local Name")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class NidResidentLocalName   {
  @JsonProperty("language_code")
  private String languageCode = null;

  @JsonProperty("local_name")
  private String localName = null;

  public NidResidentLocalName languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * indicates language code. G2P Connect supports country codes as per ISO 639.3 standard
   * @return languageCode
   **/
  @Schema(example = "en", description = "indicates language code. G2P Connect supports country codes as per ISO 639.3 standard")
  
  @Pattern(regexp="^[a-z]{3,3}$")   public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public NidResidentLocalName localName(String localName) {
    this.localName = localName;
    return this;
  }

  /**
   * Local name of the Resident
   * @return localName
   **/
  @Schema(description = "Local name of the Resident")
  
    public String getLocalName() {
    return localName;
  }

  public void setLocalName(String localName) {
    this.localName = localName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NidResidentLocalName nidResidentLocalName = (NidResidentLocalName) o;
    return Objects.equals(this.languageCode, nidResidentLocalName.languageCode) &&
        Objects.equals(this.localName, nidResidentLocalName.localName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageCode, localName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NidResidentLocalName {\n");
    
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    localName: ").append(toIndentedString(localName)).append("\n");
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
