package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SearchRequestDataSearchRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 1. Functional registry specific extension to search. 2. Additional checks using conditioanl expressions is possible. 3. Allows Country/Registry specific implementation extensions using key/value pairs. 
 */
@Schema(description = "1. Functional registry specific extension to search. 2. Additional checks using conditioanl expressions is possible. 3. Allows Country/Registry specific implementation extensions using key/value pairs. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class SearchRequestData   {
  @JsonProperty("transaction_id")
  private String transactionId = null;

  @JsonProperty("search_request")
  @Valid
  private List<SearchRequestDataSearchRequest> searchRequest = new ArrayList<SearchRequestDataSearchRequest>();

  public SearchRequestData transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Unique transaction_id set by txn initiating system (i.e sender) to co-relate requests across processing systems/service end points
   * @return transactionId
   **/
  @Schema(example = "12345678901234567000", required = true, description = "Unique transaction_id set by txn initiating system (i.e sender) to co-relate requests across processing systems/service end points")
      @NotNull

  @Size(max=99)   public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public SearchRequestData searchRequest(List<SearchRequestDataSearchRequest> searchRequest) {
    this.searchRequest = searchRequest;
    return this;
  }

  public SearchRequestData addSearchRequestItem(SearchRequestDataSearchRequest searchRequestItem) {
    this.searchRequest.add(searchRequestItem);
    return this;
  }

  /**
   * Get searchRequest
   * @return searchRequest
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<SearchRequestDataSearchRequest> getSearchRequest() {
    return searchRequest;
  }

  public void setSearchRequest(List<SearchRequestDataSearchRequest> searchRequest) {
    this.searchRequest = searchRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRequestData searchRequestData = (SearchRequestData) o;
    return Objects.equals(this.transactionId, searchRequestData.transactionId) &&
        Objects.equals(this.searchRequest, searchRequestData.searchRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, searchRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequestData {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    searchRequest: ").append(toIndentedString(searchRequest)).append("\n");
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
