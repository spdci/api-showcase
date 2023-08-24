package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.EncryptedMessageHeader;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Encrypted payload
 */
@Schema(description = "Encrypted payload")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class EncryptedMessage  implements OneOfinlineResponseDefault1Message, OneOfinlineResponseDefault2Message, OneOfinlineResponseDefault3Message, OneOfregistryNotifyBodyMessage, OneOfregistryOnsearchBodyMessage, OneOfregistrySearchBodyMessage, OneOfregistrySubscribeBodyMessage, OneOfsyncSearchBodyMessage, OneOfsyncSubscriptionsBodyMessage, OneOfsyncUnsubscribeBodyMessage, OneOftxnOnstatusBodyMessage, OneOftxnStatusBodyMessage, OneOftxnStatusBody2Message {
  @JsonProperty("header")
  private EncryptedMessageHeader header = null;

  @JsonProperty("data")
  private String data = null;

  @JsonProperty("encrypted_key")
  private String encryptedKey = null;

  @JsonProperty("auth_tag")
  private String authTag = null;

  @JsonProperty("iv")
  private String iv = null;

  public EncryptedMessage header(EncryptedMessageHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public EncryptedMessageHeader getHeader() {
    return header;
  }

  public void setHeader(EncryptedMessageHeader header) {
    this.header = header;
  }

  public EncryptedMessage data(String data) {
    this.data = data;
    return this;
  }

  /**
   * This is the result of encrypting the plaintext using the CEK and the IV. It's Base64Url-encoded.
   * @return data
   **/
  @Schema(required = true, description = "This is the result of encrypting the plaintext using the CEK and the IV. It's Base64Url-encoded.")
      @NotNull

    public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public EncryptedMessage encryptedKey(String encryptedKey) {
    this.encryptedKey = encryptedKey;
    return this;
  }

  /**
   * The base64-url encoded encrypted key
   * @return encryptedKey
   **/
  @Schema(required = true, description = "The base64-url encoded encrypted key")
      @NotNull

    public String getEncryptedKey() {
    return encryptedKey;
  }

  public void setEncryptedKey(String encryptedKey) {
    this.encryptedKey = encryptedKey;
  }

  public EncryptedMessage authTag(String authTag) {
    this.authTag = authTag;
    return this;
  }

  /**
   * This is a Base64Url-encoded value that provides evidence of the integrity and authenticity of the ciphertext, Initialization Vector, and Additional Authenticated Data
   * @return authTag
   **/
  @Schema(required = true, description = "This is a Base64Url-encoded value that provides evidence of the integrity and authenticity of the ciphertext, Initialization Vector, and Additional Authenticated Data")
      @NotNull

    public String getAuthTag() {
    return authTag;
  }

  public void setAuthTag(String authTag) {
    this.authTag = authTag;
  }

  public EncryptedMessage iv(String iv) {
    this.iv = iv;
    return this;
  }

  /**
   * This is a Base64Url-encoded random bit string to be used as the Initialization Vector (IV) when encrypting the plaintext to produce the ciphertext. The size of the IV depends on the encryption algorithm used.
   * @return iv
   **/
  @Schema(required = true, description = "This is a Base64Url-encoded random bit string to be used as the Initialization Vector (IV) when encrypting the plaintext to produce the ciphertext. The size of the IV depends on the encryption algorithm used.")
      @NotNull

    public String getIv() {
    return iv;
  }

  public void setIv(String iv) {
    this.iv = iv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptedMessage encryptedMessage = (EncryptedMessage) o;
    return Objects.equals(this.header, encryptedMessage.header) &&
        Objects.equals(this.data, encryptedMessage.data) &&
        Objects.equals(this.encryptedKey, encryptedMessage.encryptedKey) &&
        Objects.equals(this.authTag, encryptedMessage.authTag) &&
        Objects.equals(this.iv, encryptedMessage.iv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, data, encryptedKey, authTag, iv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptedMessage {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    encryptedKey: ").append(toIndentedString(encryptedKey)).append("\n");
    sb.append("    authTag: ").append(toIndentedString(authTag)).append("\n");
    sb.append("    iv: ").append(toIndentedString(iv)).append("\n");
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
