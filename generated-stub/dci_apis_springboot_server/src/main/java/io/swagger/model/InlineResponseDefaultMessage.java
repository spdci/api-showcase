package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Ack;
import io.swagger.model.Error;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponseDefaultMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class InlineResponseDefaultMessage   {
  @JsonProperty("ack_status")
  private Ack ackStatus = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("error")
  private Error error = null;

  public InlineResponseDefaultMessage ackStatus(Ack ackStatus) {
    this.ackStatus = ackStatus;
    return this;
  }

  /**
   * Get ackStatus
   * @return ackStatus
   **/
  @Schema(description = "")
  
    @Valid
    public Ack getAckStatus() {
    return ackStatus;
  }

  public void setAckStatus(Ack ackStatus) {
    this.ackStatus = ackStatus;
  }

  public InlineResponseDefaultMessage timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * 1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. 
   * @return timestamp
   **/
  @Schema(description = "1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. ")
  
    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public InlineResponseDefaultMessage error(Error error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   **/
  @Schema(description = "")
  
    @Valid
    public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponseDefaultMessage inlineResponseDefaultMessage = (InlineResponseDefaultMessage) o;
    return Objects.equals(this.ackStatus, inlineResponseDefaultMessage.ackStatus) &&
        Objects.equals(this.timestamp, inlineResponseDefaultMessage.timestamp) &&
        Objects.equals(this.error, inlineResponseDefaultMessage.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ackStatus, timestamp, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefaultMessage {\n");
    
    sb.append("    ackStatus: ").append(toIndentedString(ackStatus)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
