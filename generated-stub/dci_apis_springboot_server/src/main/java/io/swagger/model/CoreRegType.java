package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 1. Country specific implementations should extend and allow other registries. 2. In most scenarios, receiver i.e receipient of search/subsribe request determine which registry is being searched 3. example: civil, population, national-id, family, household, social, beneficiary, disability, student, farmer, land, utiltiy, other 
 */
public enum CoreRegType {
  CIVIL("civil"),
    POPULATION("population"),
    NATIONAL_ID("national-id"),
    FAMILY("family"),
    HOUSEHOLD("household"),
    SOCIAL("social"),
    BENEFICIARY("beneficiary"),
    DISABILITY("disability"),
    STUDENT("student"),
    FARMER("farmer"),
    LAND("land"),
    UTILITY("utility"),
    OTHER("other");

  private String value;

  CoreRegType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CoreRegType fromValue(String text) {
    for (CoreRegType b : CoreRegType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
