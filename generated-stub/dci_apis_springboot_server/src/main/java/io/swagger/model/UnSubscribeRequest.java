package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.UnSubscribeRequestData;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UnSubscribeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class UnSubscribeRequest  implements OneOfsyncUnsubscribeBodyMessage {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("data")
  private UnSubscribeRequestData data = null;

  public UnSubscribeRequest version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @Schema(example = "1.0.0", description = "")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public UnSubscribeRequest data(UnSubscribeRequestData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @Schema(description = "")
  
    @Valid
    public UnSubscribeRequestData getData() {
    return data;
  }

  public void setData(UnSubscribeRequestData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnSubscribeRequest unSubscribeRequest = (UnSubscribeRequest) o;
    return Objects.equals(this.version, unSubscribeRequest.version) &&
        Objects.equals(this.data, unSubscribeRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnSubscribeRequest {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
