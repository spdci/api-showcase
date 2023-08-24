package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Identity verification request status reason codes
 */
public enum SubscribeStatusReasonCode {
  REFERENCE_ID_INVALID("rjct.reference_id.invalid"),
    REFERENCE_ID_DUPLICATE("rjct.reference_id.duplicate"),
    TIMESTAMP_INVALID("rjct.timestamp.invalid"),
    NOTIFY_TYPES_INVALID("rjct.notify_types.invalid"),
    NOTIFY_DETAILS_INVALID("rjct.notify_details.invalid"),
    PERSON_ID_INVALID("rjct.person_id.invalid"),
    EVENT_ALREADY_SUBSCRIBED("rjct.event.already_subscribed");

  private String value;

  SubscribeStatusReasonCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SubscribeStatusReasonCode fromValue(String text) {
    for (SubscribeStatusReasonCode b : SubscribeStatusReasonCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
