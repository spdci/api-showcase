package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponseDefault3
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class InlineResponseDefault3   {
  @JsonProperty("signature")
  private String signature = null;

  @JsonProperty("header")
  private AllOfinlineResponseDefault3Header header = null;

  @JsonProperty("message")
  private OneOfinlineResponseDefault3Message message = null;

  public InlineResponseDefault3 signature(String signature) {
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

  public InlineResponseDefault3 header(AllOfinlineResponseDefault3Header header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
   **/
  @Schema(required = true, description = "")
      @NotNull

    public AllOfinlineResponseDefault3Header getHeader() {
    return header;
  }

  public void setHeader(AllOfinlineResponseDefault3Header header) {
    this.header = header;
  }

  public InlineResponseDefault3 message(OneOfinlineResponseDefault3Message message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(description = "")
  
    public OneOfinlineResponseDefault3Message getMessage() {
    return message;
  }

  public void setMessage(OneOfinlineResponseDefault3Message message) {
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
    InlineResponseDefault3 inlineResponseDefault3 = (InlineResponseDefault3) o;
    return Objects.equals(this.signature, inlineResponseDefault3.signature) &&
        Objects.equals(this.header, inlineResponseDefault3.header) &&
        Objects.equals(this.message, inlineResponseDefault3.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, header, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefault3 {\n");
    
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
