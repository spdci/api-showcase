package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.FetchSubscriptionsRequestDataFetchSubscriptionsRequest;
import io.swagger.model.TransactionId;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Fetch list of active subscriptions based on sender id,registry type and event type
 */
@Schema(description = "Fetch list of active subscriptions based on sender id,registry type and event type")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class FetchSubscriptionsRequestData   {
  @JsonProperty("transaction_id")
  private TransactionId transactionId = null;

  @JsonProperty("fetch_subscriptions_request")
  private FetchSubscriptionsRequestDataFetchSubscriptionsRequest fetchSubscriptionsRequest = null;

  public FetchSubscriptionsRequestData transactionId(TransactionId transactionId) {
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

  public FetchSubscriptionsRequestData fetchSubscriptionsRequest(FetchSubscriptionsRequestDataFetchSubscriptionsRequest fetchSubscriptionsRequest) {
    this.fetchSubscriptionsRequest = fetchSubscriptionsRequest;
    return this;
  }

  /**
   * Get fetchSubscriptionsRequest
   * @return fetchSubscriptionsRequest
   **/
  @Schema(description = "")
  
    @Valid
    public FetchSubscriptionsRequestDataFetchSubscriptionsRequest getFetchSubscriptionsRequest() {
    return fetchSubscriptionsRequest;
  }

  public void setFetchSubscriptionsRequest(FetchSubscriptionsRequestDataFetchSubscriptionsRequest fetchSubscriptionsRequest) {
    this.fetchSubscriptionsRequest = fetchSubscriptionsRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchSubscriptionsRequestData fetchSubscriptionsRequestData = (FetchSubscriptionsRequestData) o;
    return Objects.equals(this.transactionId, fetchSubscriptionsRequestData.transactionId) &&
        Objects.equals(this.fetchSubscriptionsRequest, fetchSubscriptionsRequestData.fetchSubscriptionsRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, fetchSubscriptionsRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchSubscriptionsRequestData {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    fetchSubscriptionsRequest: ").append(toIndentedString(fetchSubscriptionsRequest)).append("\n");
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
