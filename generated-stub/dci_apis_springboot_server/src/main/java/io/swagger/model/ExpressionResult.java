package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Expression result
 */
@Schema(description = "Expression result")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class ExpressionResult   {
  @JsonProperty("seq_num")
  private BigDecimal seqNum = null;

  /**
   * Gets or Sets result
   */
  public enum ResultEnum {
    Y("y"),
    
    N("n");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResultEnum fromValue(String text) {
      for (ResultEnum b : ResultEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("result")
  private ResultEnum result = null;

  public ExpressionResult seqNum(BigDecimal seqNum) {
    this.seqNum = seqNum;
    return this;
  }

  /**
   * expression seq number for correlation
   * @return seqNum
   **/
  @Schema(example = "1", required = true, description = "expression seq number for correlation")
      @NotNull

    @Valid
    public BigDecimal getSeqNum() {
    return seqNum;
  }

  public void setSeqNum(BigDecimal seqNum) {
    this.seqNum = seqNum;
  }

  public ExpressionResult result(ResultEnum result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @Schema(example = "y", required = true, description = "")
      @NotNull

    public ResultEnum getResult() {
    return result;
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressionResult expressionResult = (ExpressionResult) o;
    return Objects.equals(this.seqNum, expressionResult.seqNum) &&
        Objects.equals(this.result, expressionResult.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seqNum, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressionResult {\n");
    
    sb.append("    seqNum: ").append(toIndentedString(seqNum)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
