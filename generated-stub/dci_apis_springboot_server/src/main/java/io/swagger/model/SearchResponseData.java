package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SearchResponseDataSearchResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response to search request. Multiple repsonses for each page can be pushed to the caller as an implementation!
 */
@Schema(description = "Response to search request. Multiple repsonses for each page can be pushed to the caller as an implementation!")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class SearchResponseData   {
  @JsonProperty("transaction_id")
  private String transactionId = null;

  @JsonProperty("search_response")
  @Valid
  private List<SearchResponseDataSearchResponse> searchResponse = new ArrayList<SearchResponseDataSearchResponse>();

  public SearchResponseData transactionId(String transactionId) {
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

  public SearchResponseData searchResponse(List<SearchResponseDataSearchResponse> searchResponse) {
    this.searchResponse = searchResponse;
    return this;
  }

  public SearchResponseData addSearchResponseItem(SearchResponseDataSearchResponse searchResponseItem) {
    this.searchResponse.add(searchResponseItem);
    return this;
  }

  /**
   * Get searchResponse
   * @return searchResponse
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<SearchResponseDataSearchResponse> getSearchResponse() {
    return searchResponse;
  }

  public void setSearchResponse(List<SearchResponseDataSearchResponse> searchResponse) {
    this.searchResponse = searchResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseData searchResponseData = (SearchResponseData) o;
    return Objects.equals(this.transactionId, searchResponseData.transactionId) &&
        Objects.equals(this.searchResponse, searchResponseData.searchResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, searchResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseData {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    searchResponse: ").append(toIndentedString(searchResponse)).append("\n");
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
