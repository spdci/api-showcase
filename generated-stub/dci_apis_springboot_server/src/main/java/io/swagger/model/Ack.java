package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 1. ACK: If the request is valid (for basic checks) and async callback (i.e webhook) will be invoked by reciever back to the sender. 2. NACK: If the request is valid (for basic checks) and there is no futher updates from reciever back to the sender. 3. ERR: If the reuqest is invalid and reciver can't process the request. error object holds error code, message. 
 */
public enum Ack {
  ACK("ACK"),
    NACK("NACK"),
    ERR("ERR");

  private String value;

  Ack(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Ack fromValue(String text) {
    for (Ack b : Ack.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
