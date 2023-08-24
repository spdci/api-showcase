package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SearchResponseDataSearchResponse;
import io.swagger.model.TransactionId;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class SearchResponseData   {
  @JsonProperty("transaction_id")
  private TransactionId transactionId = null;

  @JsonProperty("search_response")
  @Valid
  private List<SearchResponseDataSearchResponse> searchResponse = new ArrayList<SearchResponseDataSearchResponse>();

  public SearchResponseData transactionId(TransactionId transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
  @Size(max=99)   public TransactionId getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(TransactionId transactionId) {
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
