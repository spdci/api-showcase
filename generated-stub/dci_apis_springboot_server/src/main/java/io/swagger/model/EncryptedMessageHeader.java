package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EncryptedMessageHeader
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class EncryptedMessageHeader   {
  @JsonProperty("alg")
  private String alg = null;

  @JsonProperty("enc")
  private String enc = null;

  @JsonProperty("kid")
  private String kid = null;

  public EncryptedMessageHeader alg(String alg) {
    this.alg = alg;
    return this;
  }

  /**
   * The JWE algorithm used for encryption
   * @return alg
   **/
  @Schema(required = true, description = "The JWE algorithm used for encryption")
      @NotNull

    public String getAlg() {
    return alg;
  }

  public void setAlg(String alg) {
    this.alg = alg;
  }

  public EncryptedMessageHeader enc(String enc) {
    this.enc = enc;
    return this;
  }

  /**
   * The encryption algorithm used for encrypting the plaintext
   * @return enc
   **/
  @Schema(required = true, description = "The encryption algorithm used for encrypting the plaintext")
      @NotNull

    public String getEnc() {
    return enc;
  }

  public void setEnc(String enc) {
    this.enc = enc;
  }

  public EncryptedMessageHeader kid(String kid) {
    this.kid = kid;
    return this;
  }

  /**
   * The key identifier for the encryption key
   * @return kid
   **/
  @Schema(required = true, description = "The key identifier for the encryption key")
      @NotNull

    public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptedMessageHeader encryptedMessageHeader = (EncryptedMessageHeader) o;
    return Objects.equals(this.alg, encryptedMessageHeader.alg) &&
        Objects.equals(this.enc, encryptedMessageHeader.enc) &&
        Objects.equals(this.kid, encryptedMessageHeader.kid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, enc, kid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptedMessageHeader {\n");
    
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    enc: ").append(toIndentedString(enc)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
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
