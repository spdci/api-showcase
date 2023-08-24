package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.FileInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TxnStatusBody1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class TxnStatusBody1 extends FileInfo  {
  @JsonProperty("action")
  private String txnStatusBody1Action = null;

  public TxnStatusBody1 txnStatusBody1Action(String txnStatusBody1Action) {
    this.txnStatusBody1Action = txnStatusBody1Action;
    return this;
  }

  /**
   * Get txnStatusBody1Action
   * @return txnStatusBody1Action
   **/
  @Schema(description = "")
  
    public String getTxnStatusBody1Action() {
    return txnStatusBody1Action;
  }

  public void setTxnStatusBody1Action(String txnStatusBody1Action) {
    this.txnStatusBody1Action = txnStatusBody1Action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxnStatusBody1 txnStatusBody1 = (TxnStatusBody1) o;
    return Objects.equals(this.txnStatusBody1Action, txnStatusBody1.txnStatusBody1Action) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txnStatusBody1Action, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxnStatusBody1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    txnStatusBody1Action: ").append(toIndentedString(txnStatusBody1Action)).append("\n");
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
