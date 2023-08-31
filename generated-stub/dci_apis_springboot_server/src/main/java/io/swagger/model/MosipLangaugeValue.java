package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * multi language value object
 */
@Schema(description = "multi language value object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class MosipLangaugeValue   {
  @JsonProperty("langugage")
  private String langugage = null;

  @JsonProperty("value")
  private String value = null;

  public MosipLangaugeValue langugage(String langugage) {
    this.langugage = langugage;
    return this;
  }

  /**
   * Get langugage
   * @return langugage
   **/
  @Schema(example = "eng", description = "")
  
    public String getLangugage() {
    return langugage;
  }

  public void setLangugage(String langugage) {
    this.langugage = langugage;
  }

  public MosipLangaugeValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(example = "value", description = "")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MosipLangaugeValue mosipLangaugeValue = (MosipLangaugeValue) o;
    return Objects.equals(this.langugage, mosipLangaugeValue.langugage) &&
        Objects.equals(this.value, mosipLangaugeValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(langugage, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MosipLangaugeValue {\n");
    
    sb.append("    langugage: ").append(toIndentedString(langugage)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
