package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegistrySubscribeBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class RegistrySubscribeBody   {
  @JsonProperty("signature")
  private String signature = null;

  @JsonProperty("header")
  private AllOfregistrySubscribeBodyHeader header = null;

  @JsonProperty("message")
  private OneOfregistrySubscribeBodyMessage message = null;

  public RegistrySubscribeBody signature(String signature) {
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

  public RegistrySubscribeBody header(AllOfregistrySubscribeBodyHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
   **/
  @Schema(required = true, description = "")
      @NotNull

    public AllOfregistrySubscribeBodyHeader getHeader() {
    return header;
  }

  public void setHeader(AllOfregistrySubscribeBodyHeader header) {
    this.header = header;
  }

  public RegistrySubscribeBody message(OneOfregistrySubscribeBodyMessage message) {
    this.message = message;
    return this;
  }

  /**
   * Subscription request which contaion query with frequency and other info on which notification to be sent by registry to subscriber
   * @return message
   **/
  @Schema(required = true, description = "Subscription request which contaion query with frequency and other info on which notification to be sent by registry to subscriber")
      @NotNull

    public OneOfregistrySubscribeBodyMessage getMessage() {
    return message;
  }

  public void setMessage(OneOfregistrySubscribeBodyMessage message) {
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
    RegistrySubscribeBody registrySubscribeBody = (RegistrySubscribeBody) o;
    return Objects.equals(this.signature, registrySubscribeBody.signature) &&
        Objects.equals(this.header, registrySubscribeBody.header) &&
        Objects.equals(this.message, registrySubscribeBody.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, header, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrySubscribeBody {\n");
    
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
