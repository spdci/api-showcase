package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CoreRegType;
import io.swagger.model.NotifyEventRequestDataRegistryData;
import io.swagger.model.Pagination;
import io.swagger.model.RequestStatus;
import io.swagger.model.SearchStatusReasonCode;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchResponseDataSearchResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")

@Data
public class SearchResponseDataSearchResponse   {
  @JsonProperty("reference_id")
  private String referenceId = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("status")
  private RequestStatus status = null;

  @JsonProperty("status_reason_code")
  private SearchStatusReasonCode statusReasonCode = null;

  @JsonProperty("status_reason_message")
  private String statusReasonMessage = null;

  @JsonProperty("registry_type")
  private CoreRegType registryType = null;

  @JsonProperty("event_type")
  private String eventType = null;

  @JsonProperty("registry_data")
  private NotifyEventRequestDataRegistryData registryData = null;

  @JsonProperty("pagination")
  private Pagination pagination = null;

  @JsonProperty("locale")
  private String locale = null;

  public SearchResponseDataSearchResponse referenceId(String referenceId) {
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

  public SearchResponseDataSearchResponse timestamp(OffsetDateTime timestamp) {
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

  public SearchResponseDataSearchResponse status(RequestStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public RequestStatus getStatus() {
    return status;
  }

  public void setStatus(RequestStatus status) {
    this.status = status;
  }

  public SearchResponseDataSearchResponse statusReasonCode(SearchStatusReasonCode statusReasonCode) {
    this.statusReasonCode = statusReasonCode;
    return this;
  }

  /**
   * Get statusReasonCode
   * @return statusReasonCode
   **/
  @Schema(description = "")
  
    @Valid
    public SearchStatusReasonCode getStatusReasonCode() {
    return statusReasonCode;
  }

  public void setStatusReasonCode(SearchStatusReasonCode statusReasonCode) {
    this.statusReasonCode = statusReasonCode;
  }

  public SearchResponseDataSearchResponse statusReasonMessage(String statusReasonMessage) {
    this.statusReasonMessage = statusReasonMessage;
    return this;
  }

  /**
   * Status reason code message. Helps actionanble messaging for systems/end users
   * @return statusReasonMessage
   **/
  @Schema(description = "Status reason code message. Helps actionanble messaging for systems/end users")
  
  @Size(max=999)   public String getStatusReasonMessage() {
    return statusReasonMessage;
  }

  public void setStatusReasonMessage(String statusReasonMessage) {
    this.statusReasonMessage = statusReasonMessage;
  }

  public SearchResponseDataSearchResponse registryType(CoreRegType registryType) {
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

  public SearchResponseDataSearchResponse eventType(String eventType) {
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

  public SearchResponseDataSearchResponse registryData(NotifyEventRequestDataRegistryData registryData) {
    this.registryData = registryData;
    return this;
  }

  /**
   * Get registryData
   * @return registryData
   **/
  @Schema(description = "")
  
    @Valid
    public NotifyEventRequestDataRegistryData getRegistryData() {
    return registryData;
  }

  public void setRegistryData(NotifyEventRequestDataRegistryData registryData) {
    this.registryData = registryData;
  }

  public SearchResponseDataSearchResponse pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
   **/
  @Schema(description = "")
  
    @Valid
    public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public SearchResponseDataSearchResponse locale(String locale) {
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
    SearchResponseDataSearchResponse searchResponseDataSearchResponse = (SearchResponseDataSearchResponse) o;
    return Objects.equals(this.referenceId, searchResponseDataSearchResponse.referenceId) &&
        Objects.equals(this.timestamp, searchResponseDataSearchResponse.timestamp) &&
        Objects.equals(this.status, searchResponseDataSearchResponse.status) &&
        Objects.equals(this.statusReasonCode, searchResponseDataSearchResponse.statusReasonCode) &&
        Objects.equals(this.statusReasonMessage, searchResponseDataSearchResponse.statusReasonMessage) &&
        Objects.equals(this.registryType, searchResponseDataSearchResponse.registryType) &&
        Objects.equals(this.eventType, searchResponseDataSearchResponse.eventType) &&
        Objects.equals(this.registryData, searchResponseDataSearchResponse.registryData) &&
        Objects.equals(this.pagination, searchResponseDataSearchResponse.pagination) &&
        Objects.equals(this.locale, searchResponseDataSearchResponse.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, timestamp, status, statusReasonCode, statusReasonMessage, registryType, eventType, registryData, pagination, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseDataSearchResponse {\n");
    
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReasonCode: ").append(toIndentedString(statusReasonCode)).append("\n");
    sb.append("    statusReasonMessage: ").append(toIndentedString(statusReasonMessage)).append("\n");
    sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    registryData: ").append(toIndentedString(registryData)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
