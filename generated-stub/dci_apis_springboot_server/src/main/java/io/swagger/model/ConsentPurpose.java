package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsentPurpose
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class ConsentPurpose   {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("refUri")
  private String refUri = null;

  public ConsentPurpose text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   **/
  @Schema(description = "")
  
    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ConsentPurpose code(String code) {
    this.code = code;
    return this;
  }

  /**
   * From a fixed set, documented at refUri
   * @return code
   **/
  @Schema(description = "From a fixed set, documented at refUri")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ConsentPurpose refUri(String refUri) {
    this.refUri = refUri;
    return this;
  }

  /**
   * Uri to provide more info on consent codes
   * @return refUri
   **/
  @Schema(description = "Uri to provide more info on consent codes")
  
    public String getRefUri() {
    return refUri;
  }

  public void setRefUri(String refUri) {
    this.refUri = refUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentPurpose consentPurpose = (ConsentPurpose) o;
    return Objects.equals(this.text, consentPurpose.text) &&
        Objects.equals(this.code, consentPurpose.code) &&
        Objects.equals(this.refUri, consentPurpose.refUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, code, refUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentPurpose {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    refUri: ").append(toIndentedString(refUri)).append("\n");
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
