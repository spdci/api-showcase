package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SubscribeRequestDataSubscribeRequest;
import io.swagger.model.TransactionId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Subscribe to a life event with crvs
 */
@Schema(description = "Subscribe to a life event with crvs")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class SubscribeRequestData   {
  @JsonProperty("transaction_id")
  private TransactionId transactionId = null;

  @JsonProperty("subscribe_request")
  @Valid
  private List<SubscribeRequestDataSubscribeRequest> subscribeRequest = new ArrayList<SubscribeRequestDataSubscribeRequest>();

  public SubscribeRequestData transactionId(TransactionId transactionId) {
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

  public SubscribeRequestData subscribeRequest(List<SubscribeRequestDataSubscribeRequest> subscribeRequest) {
    this.subscribeRequest = subscribeRequest;
    return this;
  }

  public SubscribeRequestData addSubscribeRequestItem(SubscribeRequestDataSubscribeRequest subscribeRequestItem) {
    this.subscribeRequest.add(subscribeRequestItem);
    return this;
  }

  /**
   * Get subscribeRequest
   * @return subscribeRequest
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<SubscribeRequestDataSubscribeRequest> getSubscribeRequest() {
    return subscribeRequest;
  }

  public void setSubscribeRequest(List<SubscribeRequestDataSubscribeRequest> subscribeRequest) {
    this.subscribeRequest = subscribeRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscribeRequestData subscribeRequestData = (SubscribeRequestData) o;
    return Objects.equals(this.transactionId, subscribeRequestData.transactionId) &&
        Objects.equals(this.subscribeRequest, subscribeRequestData.subscribeRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, subscribeRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribeRequestData {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    subscribeRequest: ").append(toIndentedString(subscribeRequest)).append("\n");
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
