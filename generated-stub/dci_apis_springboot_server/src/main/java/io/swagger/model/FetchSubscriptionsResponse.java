package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.FetchSubscriptionsResponseData;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FetchSubscriptionsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class FetchSubscriptionsResponse  implements OneOfinlineResponseDefault1Message {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("data")
  private FetchSubscriptionsResponseData data = null;

  public FetchSubscriptionsResponse version(String version) {
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

  public FetchSubscriptionsResponse data(FetchSubscriptionsResponseData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @Schema(description = "")
  
    @Valid
    public FetchSubscriptionsResponseData getData() {
    return data;
  }

  public void setData(FetchSubscriptionsResponseData data) {
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
    FetchSubscriptionsResponse fetchSubscriptionsResponse = (FetchSubscriptionsResponse) o;
    return Objects.equals(this.version, fetchSubscriptionsResponse.version) &&
        Objects.equals(this.data, fetchSubscriptionsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchSubscriptionsResponse {\n");
    
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
