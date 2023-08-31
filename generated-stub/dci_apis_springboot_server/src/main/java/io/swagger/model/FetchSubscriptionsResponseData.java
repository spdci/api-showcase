package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SubscriptionInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Subscription list
 */
@Schema(description = "Subscription list")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class FetchSubscriptionsResponseData   {
  @JsonProperty("transaction_id")
  private String transactionId = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("subscriptions")
  @Valid
  private List<SubscriptionInfo> subscriptions = new ArrayList<SubscriptionInfo>();

  public FetchSubscriptionsResponseData transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Unique transaction_id set by txn initiating system (i.e sender) to co-relate requests across processing systems/service end points
   * @return transactionId
   **/
  @Schema(example = "12345678901234567000", required = true, description = "Unique transaction_id set by txn initiating system (i.e sender) to co-relate requests across processing systems/service end points")
      @NotNull

  @Size(max=99)   public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public FetchSubscriptionsResponseData timestamp(OffsetDateTime timestamp) {
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

  public FetchSubscriptionsResponseData subscriptions(List<SubscriptionInfo> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public FetchSubscriptionsResponseData addSubscriptionsItem(SubscriptionInfo subscriptionsItem) {
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

  /**
   * Get subscriptions
   * @return subscriptions
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<SubscriptionInfo> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<SubscriptionInfo> subscriptions) {
    this.subscriptions = subscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchSubscriptionsResponseData fetchSubscriptionsResponseData = (FetchSubscriptionsResponseData) o;
    return Objects.equals(this.transactionId, fetchSubscriptionsResponseData.transactionId) &&
        Objects.equals(this.timestamp, fetchSubscriptionsResponseData.timestamp) &&
        Objects.equals(this.subscriptions, fetchSubscriptionsResponseData.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, timestamp, subscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchSubscriptionsResponseData {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
