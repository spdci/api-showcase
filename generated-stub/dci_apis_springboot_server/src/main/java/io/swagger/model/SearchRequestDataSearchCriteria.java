package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CoreRegAllQueries;
import io.swagger.model.PaginationRequest;
import io.swagger.model.SearchSortList;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchRequestDataSearchCriteria
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class SearchRequestDataSearchCriteria   {
  @JsonProperty("query")
  private CoreRegAllQueries query = null;

  @JsonProperty("record_type")
  private String recordType = null;

  @JsonProperty("sort")
  private SearchSortList sort = null;

  @JsonProperty("pagination")
  private PaginationRequest pagination = null;

  public SearchRequestDataSearchCriteria query(CoreRegAllQueries query) {
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

  public SearchRequestDataSearchCriteria recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

  /**
   * Get recordType
   * @return recordType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public SearchRequestDataSearchCriteria sort(SearchSortList sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
   **/
  @Schema(description = "")
  
    @Valid
    public SearchSortList getSort() {
    return sort;
  }

  public void setSort(SearchSortList sort) {
    this.sort = sort;
  }

  public SearchRequestDataSearchCriteria pagination(PaginationRequest pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
   **/
  @Schema(description = "")
  
    @Valid
    public PaginationRequest getPagination() {
    return pagination;
  }

  public void setPagination(PaginationRequest pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRequestDataSearchCriteria searchRequestDataSearchCriteria = (SearchRequestDataSearchCriteria) o;
    return Objects.equals(this.query, searchRequestDataSearchCriteria.query) &&
        Objects.equals(this.recordType, searchRequestDataSearchCriteria.recordType) &&
        Objects.equals(this.sort, searchRequestDataSearchCriteria.sort) &&
        Objects.equals(this.pagination, searchRequestDataSearchCriteria.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, recordType, sort, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequestDataSearchCriteria {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
