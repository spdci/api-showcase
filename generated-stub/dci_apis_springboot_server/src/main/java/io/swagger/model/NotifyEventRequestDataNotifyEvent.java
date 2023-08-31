package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CoreRegType;
import io.swagger.model.NotifyEventRequestDataRegistryData;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NotifyEventRequestDataNotifyEvent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class NotifyEventRequestDataNotifyEvent   {
  @JsonProperty("reference_id")
  private String referenceId = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("registry_type")
  private CoreRegType registryType = null;

  @JsonProperty("event_type")
  private String eventType = null;

  @JsonProperty("registry_data")
  private NotifyEventRequestDataRegistryData registryData = null;

  @JsonProperty("locale")
  private String locale = null;

  public NotifyEventRequestDataNotifyEvent referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Unique reference_id set by txn initiating system for each request in a batch
   * @return referenceId
   **/
  @Schema(example = "12345678901234567890", required = true, description = "Unique reference_id set by txn initiating system for each request in a batch")
      @NotNull

    public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public NotifyEventRequestDataNotifyEvent timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * 1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. 
   * @return timestamp
   **/
  @Schema(required = true, description = "1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. ")
      @NotNull

    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public NotifyEventRequestDataNotifyEvent registryType(CoreRegType registryType) {
    this.registryType = registryType;
    return this;
  }

  /**
   * Get registryType
   * @return registryType
   **/
  @Schema(description = "")
  
    @Valid
    public CoreRegType getRegistryType() {
    return registryType;
  }

  public void setRegistryType(CoreRegType registryType) {
    this.registryType = registryType;
  }

  public NotifyEventRequestDataNotifyEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public NotifyEventRequestDataNotifyEvent registryData(NotifyEventRequestDataRegistryData registryData) {
    this.registryData = registryData;
    return this;
  }

  /**
   * Get registryData
   * @return registryData
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public NotifyEventRequestDataRegistryData getRegistryData() {
    return registryData;
  }

  public void setRegistryData(NotifyEventRequestDataRegistryData registryData) {
    this.registryData = registryData;
  }

  public NotifyEventRequestDataNotifyEvent locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * indicates language code. G2P Connect supports country codes as per ISO 639.3 standard
   * @return locale
   **/
  @Schema(example = "en", description = "indicates language code. G2P Connect supports country codes as per ISO 639.3 standard")
  
  @Pattern(regexp="^[a-z]{3,3}$")   public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyEventRequestDataNotifyEvent notifyEventRequestDataNotifyEvent = (NotifyEventRequestDataNotifyEvent) o;
    return Objects.equals(this.referenceId, notifyEventRequestDataNotifyEvent.referenceId) &&
        Objects.equals(this.timestamp, notifyEventRequestDataNotifyEvent.timestamp) &&
        Objects.equals(this.registryType, notifyEventRequestDataNotifyEvent.registryType) &&
        Objects.equals(this.eventType, notifyEventRequestDataNotifyEvent.eventType) &&
        Objects.equals(this.registryData, notifyEventRequestDataNotifyEvent.registryData) &&
        Objects.equals(this.locale, notifyEventRequestDataNotifyEvent.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, timestamp, registryType, eventType, registryData, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyEventRequestDataNotifyEvent {\n");
    
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    registryData: ").append(toIndentedString(registryData)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
