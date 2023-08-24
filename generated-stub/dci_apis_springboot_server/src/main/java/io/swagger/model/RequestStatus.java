package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Request (e.g disburse, link, unlink, resolve, issue, search, verify, etc.,) status: <br> 1. rcvd: Received; Request received <br> 2. pdng: Pending; Request initiated <br> 3. succ: Success; Request successful <br> 4. rjct: Rejected; Request rejected
 */
public enum RequestStatus {
  RCVD("rcvd"),
    PDNG("pdng"),
    SUCC("succ"),
    RJCT("rjct");

  private String value;

  RequestStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RequestStatus fromValue(String text) {
    for (RequestStatus b : RequestStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
