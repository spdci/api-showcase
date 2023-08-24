package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SyncUnsubscribeBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class SyncUnsubscribeBody   {
  @JsonProperty("signature")
  private String signature = null;

  @JsonProperty("header")
  private AllOfsyncUnsubscribeBodyHeader header = null;

  @JsonProperty("message")
  private OneOfsyncUnsubscribeBodyMessage message = null;

  public SyncUnsubscribeBody signature(String signature) {
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

  public SyncUnsubscribeBody header(AllOfsyncUnsubscribeBodyHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
   **/
  @Schema(required = true, description = "")
      @NotNull

    public AllOfsyncUnsubscribeBodyHeader getHeader() {
    return header;
  }

  public void setHeader(AllOfsyncUnsubscribeBodyHeader header) {
    this.header = header;
  }

  public SyncUnsubscribeBody message(OneOfsyncUnsubscribeBodyMessage message) {
    this.message = message;
    return this;
  }

  /**
   * The unsubscribe request that contain subscription ids which to be removed from subscription list
   * @return message
   **/
  @Schema(required = true, description = "The unsubscribe request that contain subscription ids which to be removed from subscription list")
      @NotNull

    public OneOfsyncUnsubscribeBodyMessage getMessage() {
    return message;
  }

  public void setMessage(OneOfsyncUnsubscribeBodyMessage message) {
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
    SyncUnsubscribeBody syncUnsubscribeBody = (SyncUnsubscribeBody) o;
    return Objects.equals(this.signature, syncUnsubscribeBody.signature) &&
        Objects.equals(this.header, syncUnsubscribeBody.header) &&
        Objects.equals(this.message, syncUnsubscribeBody.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, header, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncUnsubscribeBody {\n");
    
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
