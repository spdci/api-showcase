package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * List of attribute names from a registry to return in respone object
 */
public enum OtherRecordType {
  PERSON("person"),
    BRITH("brith"),
    DEATH("death"),
    MARRIAGE("marriage"),
    OTHER("other");

  private String value;

  OtherRecordType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OtherRecordType fromValue(String text) {
    for (OtherRecordType b : OtherRecordType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
