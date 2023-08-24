package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 1. A sample record list to identity various records that civil registry can produce 2, This is an indicative list as reference and every country, organisation, system shall customise to local requirements as extensions 3. Example Civil Registry records - person_record, birth_cert, death_cert, marriage_cert, etc., 
 */
public enum CivilRegRecordType {
  PERSON_RECORD("person_record"),
    BRITH_CERT("brith_cert"),
    DEATH_CERT("death_cert"),
    MARRIAGE_CERT("marriage_cert"),
    OTHER_RECORD("other_record");

  private String value;

  CivilRegRecordType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CivilRegRecordType fromValue(String text) {
    for (CivilRegRecordType b : CivilRegRecordType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
