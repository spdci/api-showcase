package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 1. Civil registration event list used to record and interact with a typical civil registry 2. This is an indicative list as reference and every country, organisation, system shall customise to local requirements as extensions 3. Example Civil Registration events: person, birth, death, marriage, divorce, annulment, seperation, adoption, demo_change, unregister, etc., 
 */
public enum CivilRegEventType {
  PERSON("person"),
    BIRTH("birth"),
    DEATH("death"),
    MARRIAGE("marriage"),
    DIVORCE("divorce"),
    ANNULMENT("annulment"),
    SEPERATION("seperation"),
    ADOPTION("adoption"),
    DEMO_CHANGE("demo_change"),
    UNREGISTER("unregister");

  private String value;

  CivilRegEventType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CivilRegEventType fromValue(String text) {
    for (CivilRegEventType b : CivilRegEventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
