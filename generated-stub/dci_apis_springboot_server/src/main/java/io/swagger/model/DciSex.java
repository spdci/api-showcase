package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Standardized codes/values representing diverse Sex categories. Reference: [ISO/IEC 5218:2022](https://www.iso.org/standard/81682.html)  1 : Male 2 : Female 3 : Others 4 : Unknown 
 */
public enum DciSex {
  _1("1"),
    _2("2"),
    _3("3"),
    _4("4");

  private String value;

  DciSex(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DciSex fromValue(String text) {
    for (DciSex b : DciSex.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
