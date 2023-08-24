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
 * TxnOnstatusBody1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class TxnOnstatusBody1 extends FileInfo  {
  @JsonProperty("action")
  private String txnOnstatusBody1Action = null;

  public TxnOnstatusBody1 txnOnstatusBody1Action(String txnOnstatusBody1Action) {
    this.txnOnstatusBody1Action = txnOnstatusBody1Action;
    return this;
  }

  /**
   * Get txnOnstatusBody1Action
   * @return txnOnstatusBody1Action
   **/
  @Schema(description = "")
  
    public String getTxnOnstatusBody1Action() {
    return txnOnstatusBody1Action;
  }

  public void setTxnOnstatusBody1Action(String txnOnstatusBody1Action) {
    this.txnOnstatusBody1Action = txnOnstatusBody1Action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxnOnstatusBody1 txnOnstatusBody1 = (TxnOnstatusBody1) o;
    return Objects.equals(this.txnOnstatusBody1Action, txnOnstatusBody1.txnOnstatusBody1Action) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txnOnstatusBody1Action, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxnOnstatusBody1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    txnOnstatusBody1Action: ").append(toIndentedString(txnOnstatusBody1Action)).append("\n");
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
