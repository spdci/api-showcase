package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes an error object that is returned to standard post call request. &lt;br&gt; 1. This object shall be sent when any request received by a participant is not parsable or message integrity check fails. &lt;br&gt; 2. This object may be used across all transport protocols to acknowledge the receipt of a message i.e HTTPS, FTP, Messaging etc., &lt;br&gt;\&quot; 
 */
@Schema(description = "Describes an error object that is returned to standard post call request. <br> 1. This object shall be sent when any request received by a participant is not parsable or message integrity check fails. <br> 2. This object may be used across all transport protocols to acknowledge the receipt of a message i.e HTTPS, FTP, Messaging etc., <br>\" ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class Error   {
  /**
   * Standard error code
   */
  public enum CodeEnum {
    REQUEST_BAD("err.request.bad"),
    
    REQUEST_UNAUTHORIZED("err.request.unauthorized"),
    
    REQUEST_FORBIDDEN("err.request.forbidden"),
    
    REQUEST_NOT_FOUND("err.request.not_found"),
    
    REQUEST_TIMEOUT("err.request.timeout"),
    
    VERSION_NOT_SUPPORTED("err.version.not_supported"),
    
    REQUEST_TOO_MANY_REQUESTS("err.request.too_many_requests"),
    
    SENDER_ID_INVALID("err.sender_id.invalid"),
    
    SENDER_URI_INVALID("err.sender_uri.invalid"),
    
    RECEIVER_ID_INVALID("err.receiver_id.invalid"),
    
    SIGNATURE_MISSING("err.signature.missing"),
    
    SIGNATURE_INVALID("err.signature.invalid"),
    
    ENCRYPTION_INVALID("err.encryption.invalid"),
    
    SERVICE_UNAVAILABLE("err.service.unavailable");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("code")
  private CodeEnum code = null;

  @JsonProperty("message")
  private String message = null;

  public Error code(CodeEnum code) {
    this.code = code;
    return this;
  }

  /**
   * Standard error code
   * @return code
   **/
  @Schema(description = "Standard error code")
  
    public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * message to describe above error code
   * @return message
   **/
  @Schema(description = "message to describe above error code")
  
  @Size(max=999)   public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
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
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
