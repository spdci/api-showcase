package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TxnStatusRequestData;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TxnStatusRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class TxnStatusRequest  implements OneOftxnStatusBodyMessage, OneOftxnStatusBody2Message {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("data")
  private TxnStatusRequestData data = null;

  public TxnStatusRequest version(String version) {
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

  public TxnStatusRequest data(TxnStatusRequestData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @Schema(description = "")
  
    @Valid
    public TxnStatusRequestData getData() {
    return data;
  }

  public void setData(TxnStatusRequestData data) {
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
    TxnStatusRequest txnStatusRequest = (TxnStatusRequest) o;
    return Objects.equals(this.version, txnStatusRequest.version) &&
        Objects.equals(this.data, txnStatusRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxnStatusRequest {\n");
    
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
