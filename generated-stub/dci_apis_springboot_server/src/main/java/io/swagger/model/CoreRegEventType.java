package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Functional registry event types:   1. update - search or subscribe to update events; e.g update to postal_code 12345 between date_range   2. link - search or subscribe to linking events; e.g mobile no link with ID, national ID link with civil reg record, etc.,   3. unlink - search or subscribe to unlinking events; <br>  Note: update event can also cover link/unlink events on a registry record. 
 */
public enum CoreRegEventType {
  UPDATE("update"),
    LINK("link"),
    UNLINK("unlink");

  private String value;

  CoreRegEventType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CoreRegEventType fromValue(String text) {
    for (CoreRegEventType b : CoreRegEventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
