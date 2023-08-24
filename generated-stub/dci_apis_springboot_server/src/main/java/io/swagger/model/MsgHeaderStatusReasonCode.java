package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Message header related common status reason codes
 */
public enum MsgHeaderStatusReasonCode {
  VERSION_INVALID("rjct.version.invalid"),
    MESSAGE_ID_DUPLICATE("rjct.message_id.duplicate"),
    MESSAGE_TS_INVALID("rjct.message_ts.invalid"),
    ACTION_INVALID("rjct.action.invalid"),
    ACTION_NOT_SUPPORTED("rjct.action.not_supported"),
    TOTAL_COUNT_INVALID("rjct.total_count.invalid"),
    TOTAL_COUNT_LIMIT_EXCEEDED("rjct.total_count.limit_exceeded"),
    ERRORS_TOO_MANY("rjct.errors.too_many");

  private String value;

  MsgHeaderStatusReasonCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MsgHeaderStatusReasonCode fromValue(String text) {
    for (MsgHeaderStatusReasonCode b : MsgHeaderStatusReasonCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
