package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TransactionId;
import io.swagger.model.TxnStatusRequestDataTxnstatusRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request to search identity service requests
 */
@Schema(description = "Request to search identity service requests")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class TxnStatusRequestData   {
  @JsonProperty("transaction_id")
  private TransactionId transactionId = null;

  @JsonProperty("txnstatus_request")
  private TxnStatusRequestDataTxnstatusRequest txnstatusRequest = null;

  public TxnStatusRequestData transactionId(TransactionId transactionId) {
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

  public TxnStatusRequestData txnstatusRequest(TxnStatusRequestDataTxnstatusRequest txnstatusRequest) {
    this.txnstatusRequest = txnstatusRequest;
    return this;
  }

  /**
   * Get txnstatusRequest
   * @return txnstatusRequest
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public TxnStatusRequestDataTxnstatusRequest getTxnstatusRequest() {
    return txnstatusRequest;
  }

  public void setTxnstatusRequest(TxnStatusRequestDataTxnstatusRequest txnstatusRequest) {
    this.txnstatusRequest = txnstatusRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxnStatusRequestData txnStatusRequestData = (TxnStatusRequestData) o;
    return Objects.equals(this.transactionId, txnStatusRequestData.transactionId) &&
        Objects.equals(this.txnstatusRequest, txnStatusRequestData.txnstatusRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, txnstatusRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxnStatusRequestData {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    txnstatusRequest: ").append(toIndentedString(txnstatusRequest)).append("\n");
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
