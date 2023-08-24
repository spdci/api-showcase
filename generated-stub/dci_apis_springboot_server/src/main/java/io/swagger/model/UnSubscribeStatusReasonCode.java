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
public enum UnSubscribeStatusReasonCode {
  REFERENCE_ID_INVALID("rjct.reference_id.invalid"),
    REFERENCE_ID_DUPLICATE("rjct.reference_id.duplicate"),
    TIMESTAMP_INVALID("rjct.timestamp.invalid"),
    SUBSCRIPTION_CODE_INVALID("rjct.subscription_code.invalid"),
    REQUESTER_INVALID("rjct.requester.invalid"),
    EVENT_ALREADY_UNSUBSCRIBED("rjct.event.already_unsubscribed");

  private String value;

  UnSubscribeStatusReasonCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static UnSubscribeStatusReasonCode fromValue(String text) {
    for (UnSubscribeStatusReasonCode b : UnSubscribeStatusReasonCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
