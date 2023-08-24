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
public enum SearchStatusReasonCode {
  REFERENCE_ID_INVALID("rjct.reference_id.invalid"),
    REFERENCE_ID_DUPLICATE("rjct.reference_id.duplicate"),
    TIMESTAMP_INVALID("rjct.timestamp.invalid"),
    SEARCH_CRITERIA_INVALID("rjct.search_criteria.invalid"),
    FILTER_INVALID("rjct.filter.invalid"),
    SORT_INVALID("rjct.sort.invalid"),
    PAGINATION_INVALID("rjct.pagination.invalid"),
    SEARCH_TOO_MANY_RECORDS_FOUND("rjct.search.too_many_records_found");

  private String value;

  SearchStatusReasonCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SearchStatusReasonCode fromValue(String text) {
    for (SearchStatusReasonCode b : SearchStatusReasonCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
