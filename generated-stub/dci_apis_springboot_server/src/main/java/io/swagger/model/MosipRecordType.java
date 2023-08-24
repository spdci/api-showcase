package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Predefined registry record to return in respone as object 
 */
public enum MosipRecordType {
  REGISTRATIONRECORD("RegistrationRecord"),
    MOSIPVERIFIABLECREDENTIAL("MOSIPVerifiableCredential");

  private String value;

  MosipRecordType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MosipRecordType fromValue(String text) {
    for (MosipRecordType b : MosipRecordType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
