package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CoreRegAllQueries;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionInfoSubscribeCriteria
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class SubscriptionInfoSubscribeCriteria   {
  @JsonProperty("query")
  private CoreRegAllQueries query = null;

  @JsonProperty("record_type")
  private String recordType = null;

  public SubscriptionInfoSubscribeCriteria query(CoreRegAllQueries query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CoreRegAllQueries getQuery() {
    return query;
  }

  public void setQuery(CoreRegAllQueries query) {
    this.query = query;
  }

  public SubscriptionInfoSubscribeCriteria recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

  /**
   * Get recordType
   * @return recordType
   **/
  @Schema(description = "")
  
    public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionInfoSubscribeCriteria subscriptionInfoSubscribeCriteria = (SubscriptionInfoSubscribeCriteria) o;
    return Objects.equals(this.query, subscriptionInfoSubscribeCriteria.query) &&
        Objects.equals(this.recordType, subscriptionInfoSubscribeCriteria.recordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, recordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionInfoSubscribeCriteria {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
