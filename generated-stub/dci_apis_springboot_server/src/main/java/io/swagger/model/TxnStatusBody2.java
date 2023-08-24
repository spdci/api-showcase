package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TxnStatusBody2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class TxnStatusBody2   {
  @JsonProperty("signature")
  private String signature = null;

  @JsonProperty("header")
  private AllOftxnStatusBody2Header header = null;

  @JsonProperty("message")
  private OneOftxnStatusBody2Message message = null;

  public TxnStatusBody2 signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Signature of {header}+{message} body verified using sender's signing public key
   * @return signature
   **/
  @Schema(example = "Signature:  namespace=\"g2p\", kidId=\"{sender_id}|{unique_key_id}|{algorithm}\", algorithm=\"ed25519\", created=\"1606970629\", expires=\"1607030629\", headers=\"(created) (expires) digest\", signature=\"Base64(signing content)", description = "Signature of {header}+{message} body verified using sender's signing public key")
  
    public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public TxnStatusBody2 header(AllOftxnStatusBody2Header header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
   **/
  @Schema(required = true, description = "")
      @NotNull

    public AllOftxnStatusBody2Header getHeader() {
    return header;
  }

  public void setHeader(AllOftxnStatusBody2Header header) {
    this.header = header;
  }

  public TxnStatusBody2 message(OneOftxnStatusBody2Message message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(required = true, description = "")
      @NotNull

    public OneOftxnStatusBody2Message getMessage() {
    return message;
  }

  public void setMessage(OneOftxnStatusBody2Message message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxnStatusBody2 txnStatusBody2 = (TxnStatusBody2) o;
    return Objects.equals(this.signature, txnStatusBody2.signature) &&
        Objects.equals(this.header, txnStatusBody2.header) &&
        Objects.equals(this.message, txnStatusBody2.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, header, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxnStatusBody2 {\n");
    
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
