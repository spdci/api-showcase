package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class UnSubscribeRequestData   {
  @JsonProperty("transaction_id")
  private String transactionId = null;

  @JsonProperty("timesstamp")
  private OffsetDateTime timesstamp = null;

  @JsonProperty("subscription_codes")
  @Valid
  private List<String> subscriptionCodes = null;

  public UnSubscribeRequestData transactionId(String transactionId) {
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

  public UnSubscribeRequestData timesstamp(OffsetDateTime timesstamp) {
    this.timesstamp = timesstamp;
    return this;
  }

  /**
   * 1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. 
   * @return timesstamp
   **/
  @Schema(description = "1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. ")
  
    @Valid
    public OffsetDateTime getTimesstamp() {
    return timesstamp;
  }

  public void setTimesstamp(OffsetDateTime timesstamp) {
    this.timesstamp = timesstamp;
  }

  public UnSubscribeRequestData subscriptionCodes(List<String> subscriptionCodes) {
    this.subscriptionCodes = subscriptionCodes;
    return this;
  }

  public UnSubscribeRequestData addSubscriptionCodesItem(String subscriptionCodesItem) {
    if (this.subscriptionCodes == null) {
      this.subscriptionCodes = new ArrayList<String>();
    }
    this.subscriptionCodes.add(subscriptionCodesItem);
    return this;
  }

  /**
   * Get subscriptionCodes
   * @return subscriptionCodes
   **/
  @Schema(description = "")
  
    public List<String> getSubscriptionCodes() {
    return subscriptionCodes;
  }

  public void setSubscriptionCodes(List<String> subscriptionCodes) {
    this.subscriptionCodes = subscriptionCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnSubscribeRequestData unSubscribeRequestData = (UnSubscribeRequestData) o;
    return Objects.equals(this.transactionId, unSubscribeRequestData.transactionId) &&
        Objects.equals(this.timesstamp, unSubscribeRequestData.timesstamp) &&
        Objects.equals(this.subscriptionCodes, unSubscribeRequestData.subscriptionCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, timesstamp, subscriptionCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnSubscribeRequestData {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    timesstamp: ").append(toIndentedString(timesstamp)).append("\n");
    sb.append("    subscriptionCodes: ").append(toIndentedString(subscriptionCodes)).append("\n");
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
