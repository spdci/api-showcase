package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RequestStatus;
import io.swagger.model.TransactionId;
import io.swagger.model.UnSubscribeResponseDataSubscriptionStatus;
import io.swagger.model.UnSubscribeStatusReasonCode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Un-Subscribe to a life event with crvs
 */
@Schema(description = "Un-Subscribe to a life event with crvs")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class UnSubscribeResponseData   {
  @JsonProperty("transaction_id")
  private TransactionId transactionId = null;

  @JsonProperty("timesatmp")
  private OffsetDateTime timesatmp = null;

  @JsonProperty("status")
  private RequestStatus status = null;

  @JsonProperty("status_reason_code")
  private UnSubscribeStatusReasonCode statusReasonCode = null;

  @JsonProperty("status_reason_message")
  private String statusReasonMessage = null;

  @JsonProperty("subscription_status")
  @Valid
  private List<UnSubscribeResponseDataSubscriptionStatus> subscriptionStatus = null;

  public UnSubscribeResponseData transactionId(TransactionId transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
  @Size(max=99)   public TransactionId getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(TransactionId transactionId) {
    this.transactionId = transactionId;
  }

  public UnSubscribeResponseData timesatmp(OffsetDateTime timesatmp) {
    this.timesatmp = timesatmp;
    return this;
  }

  /**
   * 1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. 
   * @return timesatmp
   **/
  @Schema(description = "1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. ")
  
    @Valid
    public OffsetDateTime getTimesatmp() {
    return timesatmp;
  }

  public void setTimesatmp(OffsetDateTime timesatmp) {
    this.timesatmp = timesatmp;
  }

  public UnSubscribeResponseData status(RequestStatus status) {
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

  public UnSubscribeResponseData statusReasonCode(UnSubscribeStatusReasonCode statusReasonCode) {
    this.statusReasonCode = statusReasonCode;
    return this;
  }

  /**
   * Get statusReasonCode
   * @return statusReasonCode
   **/
  @Schema(description = "")
  
    @Valid
    public UnSubscribeStatusReasonCode getStatusReasonCode() {
    return statusReasonCode;
  }

  public void setStatusReasonCode(UnSubscribeStatusReasonCode statusReasonCode) {
    this.statusReasonCode = statusReasonCode;
  }

  public UnSubscribeResponseData statusReasonMessage(String statusReasonMessage) {
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

  public UnSubscribeResponseData subscriptionStatus(List<UnSubscribeResponseDataSubscriptionStatus> subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
    return this;
  }

  public UnSubscribeResponseData addSubscriptionStatusItem(UnSubscribeResponseDataSubscriptionStatus subscriptionStatusItem) {
    if (this.subscriptionStatus == null) {
      this.subscriptionStatus = new ArrayList<UnSubscribeResponseDataSubscriptionStatus>();
    }
    this.subscriptionStatus.add(subscriptionStatusItem);
    return this;
  }

  /**
   * Get subscriptionStatus
   * @return subscriptionStatus
   **/
  @Schema(description = "")
      @Valid
    public List<UnSubscribeResponseDataSubscriptionStatus> getSubscriptionStatus() {
    return subscriptionStatus;
  }

  public void setSubscriptionStatus(List<UnSubscribeResponseDataSubscriptionStatus> subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnSubscribeResponseData unSubscribeResponseData = (UnSubscribeResponseData) o;
    return Objects.equals(this.transactionId, unSubscribeResponseData.transactionId) &&
        Objects.equals(this.timesatmp, unSubscribeResponseData.timesatmp) &&
        Objects.equals(this.status, unSubscribeResponseData.status) &&
        Objects.equals(this.statusReasonCode, unSubscribeResponseData.statusReasonCode) &&
        Objects.equals(this.statusReasonMessage, unSubscribeResponseData.statusReasonMessage) &&
        Objects.equals(this.subscriptionStatus, unSubscribeResponseData.subscriptionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, timesatmp, status, statusReasonCode, statusReasonMessage, subscriptionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnSubscribeResponseData {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    timesatmp: ").append(toIndentedString(timesatmp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReasonCode: ").append(toIndentedString(statusReasonCode)).append("\n");
    sb.append("    statusReasonMessage: ").append(toIndentedString(statusReasonMessage)).append("\n");
    sb.append("    subscriptionStatus: ").append(toIndentedString(subscriptionStatus)).append("\n");
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
