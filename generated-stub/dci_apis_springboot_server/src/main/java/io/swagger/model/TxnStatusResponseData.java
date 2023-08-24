package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TransactionId;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TxnStatusResponseData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class TxnStatusResponseData   {
  @JsonProperty("transaction_id")
  private TransactionId transactionId = null;

  @JsonProperty("txnstatus_response")
  private OneOfTxnStatusResponseDataTxnstatusResponse txnstatusResponse = null;

  public TxnStatusResponseData transactionId(TransactionId transactionId) {
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

  public TxnStatusResponseData txnstatusResponse(OneOfTxnStatusResponseDataTxnstatusResponse txnstatusResponse) {
    this.txnstatusResponse = txnstatusResponse;
    return this;
  }

  /**
   * Get txnstatusResponse
   * @return txnstatusResponse
   **/
  @Schema(required = true, description = "")
      @NotNull

    public OneOfTxnStatusResponseDataTxnstatusResponse getTxnstatusResponse() {
    return txnstatusResponse;
  }

  public void setTxnstatusResponse(OneOfTxnStatusResponseDataTxnstatusResponse txnstatusResponse) {
    this.txnstatusResponse = txnstatusResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxnStatusResponseData txnStatusResponseData = (TxnStatusResponseData) o;
    return Objects.equals(this.transactionId, txnStatusResponseData.transactionId) &&
        Objects.equals(this.txnstatusResponse, txnStatusResponseData.txnstatusResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, txnstatusResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxnStatusResponseData {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    txnstatusResponse: ").append(toIndentedString(txnstatusResponse)).append("\n");
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
