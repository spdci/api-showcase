package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 1. Frequency at which subscribed services should be notified.  2. start_time, end_time represent data range where the notification frequency is applicable  
 */
@Schema(description = "1. Frequency at which subscribed services should be notified.  2. start_time, end_time represent data range where the notification frequency is applicable  ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class EventFrequency   {
  @JsonProperty("start_time")
  private OffsetDateTime startTime = null;

  @JsonProperty("end_time")
  private OffsetDateTime endTime = null;

  @JsonProperty("frequency")
  private String frequency = null;

  public EventFrequency startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * 1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. 
   * @return startTime
   **/
  @Schema(required = true, description = "1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. ")
      @NotNull

    @Valid
    public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public EventFrequency endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * 1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. 
   * @return endTime
   **/
  @Schema(required = true, description = "1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. ")
      @NotNull

    @Valid
    public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public EventFrequency frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Frequency at which notification is required. This will be in the form of cron expression.  Example - \"0 0 0 5,15 * ? *\"  which says At 00:00:00am, on the 5th and 15th day, every month 
   * @return frequency
   **/
  @Schema(required = true, description = "Frequency at which notification is required. This will be in the form of cron expression.  Example - \"0 0 0 5,15 * ? *\"  which says At 00:00:00am, on the 5th and 15th day, every month ")
      @NotNull

    public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventFrequency eventFrequency = (EventFrequency) o;
    return Objects.equals(this.startTime, eventFrequency.startTime) &&
        Objects.equals(this.endTime, eventFrequency.endTime) &&
        Objects.equals(this.frequency, eventFrequency.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventFrequency {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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
