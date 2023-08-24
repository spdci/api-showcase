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


public class Pagination   {
  @JsonProperty("page_size")
  private BigDecimal pageSize = null;

  @JsonProperty("page_number")
  private BigDecimal pageNumber = null;

  @JsonProperty("total_count")
  private BigDecimal totalCount = null;

  public Pagination pageSize(BigDecimal pageSize) {
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

  public Pagination pageNumber(BigDecimal pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   * @return pageNumber
   **/
  @Schema(example = "5", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(BigDecimal pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Pagination totalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
   **/
  @Schema(example = "24250", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.pageSize, pagination.pageSize) &&
        Objects.equals(this.pageNumber, pagination.pageNumber) &&
        Objects.equals(this.totalCount, pagination.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
