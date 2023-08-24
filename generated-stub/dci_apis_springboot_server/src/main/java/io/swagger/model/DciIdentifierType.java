package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * An identifier type includes unique numbers legally assigned to individuals. <br> Reference: [Types of ID](https://id4d.worldbank.org/guide/types-id-systems)  UIN : Unique Identification Number <br> BRN : Birth Registration Number or Birth Serial Number <br> MRN : Marriage Registration Number <br> DRN : Death Registration Number <br> 
 */
public enum DciIdentifierType {
  UIN("UIN"),
    BRN("BRN"),
    MRN("MRN"),
    DRN("DRN");

  private String value;

  DciIdentifierType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DciIdentifierType fromValue(String text) {
    for (DciIdentifierType b : DciIdentifierType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
