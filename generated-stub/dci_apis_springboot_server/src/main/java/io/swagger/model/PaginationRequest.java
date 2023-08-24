package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pagination definition, count starts with 1
 */
@Schema(description = "Pagination definition, count starts with 1")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class PaginationRequest   {
  @JsonProperty("page_size")
  private BigDecimal pageSize = null;

  @JsonProperty("page_number")
  private BigDecimal pageNumber = new BigDecimal(1);

  public PaginationRequest pageSize(BigDecimal pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   **/
  @Schema(example = "2000", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getPageSize() {
    return pageSize;
  }

  public void setPageSize(BigDecimal pageSize) {
    this.pageSize = pageSize;
  }

  public PaginationRequest pageNumber(BigDecimal pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   * @return pageNumber
   **/
  @Schema(example = "5", description = "")
  
    @Valid
    public BigDecimal getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(BigDecimal pageNumber) {
    this.pageNumber = pageNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationRequest paginationRequest = (PaginationRequest) o;
    return Objects.equals(this.pageSize, paginationRequest.pageSize) &&
        Objects.equals(this.pageNumber, paginationRequest.pageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationRequest {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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
