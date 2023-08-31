package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CoreRegType;
import io.swagger.model.EventFrequency;
import io.swagger.model.SubscriptionInfoSubscribeCriteria;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class SubscriptionInfo   {
  @JsonProperty("subscription_code")
  private String subscriptionCode = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("registry_type")
  private CoreRegType registryType = null;

  @JsonProperty("event_type")
  private String eventType = null;

  @JsonProperty("frequency")
  private EventFrequency frequency = null;

  @JsonProperty("subscribe_criteria")
  private SubscriptionInfoSubscribeCriteria subscribeCriteria = null;

  @JsonProperty("locale")
  private String locale = null;

  public SubscriptionInfo subscriptionCode(String subscriptionCode) {
    this.subscriptionCode = subscriptionCode;
    return this;
  }

  /**
   * Unique code to ideintiy the subscription request by the entity providing subscription service. Helps to check status, unsubscribe etc., 
   * @return subscriptionCode
   **/
  @Schema(required = true, description = "Unique code to ideintiy the subscription request by the entity providing subscription service. Helps to check status, unsubscribe etc., ")
      @NotNull

  @Size(max=99)   public String getSubscriptionCode() {
    return subscriptionCode;
  }

  public void setSubscriptionCode(String subscriptionCode) {
    this.subscriptionCode = subscriptionCode;
  }

  public SubscriptionInfo timestamp(OffsetDateTime timestamp) {
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

  public SubscriptionInfo registryType(CoreRegType registryType) {
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

  public SubscriptionInfo eventType(String eventType) {
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

  public SubscriptionInfo frequency(EventFrequency frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   **/
  @Schema(description = "")
  
    @Valid
    public EventFrequency getFrequency() {
    return frequency;
  }

  public void setFrequency(EventFrequency frequency) {
    this.frequency = frequency;
  }

  public SubscriptionInfo subscribeCriteria(SubscriptionInfoSubscribeCriteria subscribeCriteria) {
    this.subscribeCriteria = subscribeCriteria;
    return this;
  }

  /**
   * Get subscribeCriteria
   * @return subscribeCriteria
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SubscriptionInfoSubscribeCriteria getSubscribeCriteria() {
    return subscribeCriteria;
  }

  public void setSubscribeCriteria(SubscriptionInfoSubscribeCriteria subscribeCriteria) {
    this.subscribeCriteria = subscribeCriteria;
  }

  public SubscriptionInfo locale(String locale) {
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
    SubscriptionInfo subscriptionInfo = (SubscriptionInfo) o;
    return Objects.equals(this.subscriptionCode, subscriptionInfo.subscriptionCode) &&
        Objects.equals(this.timestamp, subscriptionInfo.timestamp) &&
        Objects.equals(this.registryType, subscriptionInfo.registryType) &&
        Objects.equals(this.eventType, subscriptionInfo.eventType) &&
        Objects.equals(this.frequency, subscriptionInfo.frequency) &&
        Objects.equals(this.subscribeCriteria, subscriptionInfo.subscribeCriteria) &&
        Objects.equals(this.locale, subscriptionInfo.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionCode, timestamp, registryType, eventType, frequency, subscribeCriteria, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionInfo {\n");
    
    sb.append("    subscriptionCode: ").append(toIndentedString(subscriptionCode)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    subscribeCriteria: ").append(toIndentedString(subscribeCriteria)).append("\n");
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
