package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Standardized codes/values represent vital events in an individual's life.  Reference: [Vital Events Statistics](https://mospi.gov.in/sites/default/files/publication_reports/vital_statistics_2010_0.pdf)<br> 1 : Live Birth <br> 2 : Death <br> 3 : Fetal death <br> 4 : Marriage <br> 5 : Divorce <br> 6 : Adoption <br> 
 */
public enum DciVitalEvents {
  _1("1"),
    _2("2"),
    _3("3"),
    _4("4"),
    _5("5"),
    _6("6");

  private String value;

  DciVitalEvents(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DciVitalEvents fromValue(String text) {
    for (DciVitalEvents b : DciVitalEvents.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
