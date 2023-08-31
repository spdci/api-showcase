package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AttributeValue;
import io.swagger.model.ExpOperator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Expression
 */
@Schema(description = "Expression")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class Expression   {
  @JsonProperty("seq_num")
  private BigDecimal seqNum = null;

  @JsonProperty("attribute_name")
  private String attributeName = null;

  @JsonProperty("operator")
  private ExpOperator operator = null;

  @JsonProperty("attribute_value")
  private AttributeValue attributeValue = null;

  public Expression seqNum(BigDecimal seqNum) {
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

  public Expression attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  /**
   * attribute name
   * @return attributeName
   **/
  @Schema(required = true, description = "attribute name")
      @NotNull

    public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  public Expression operator(ExpOperator operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ExpOperator getOperator() {
    return operator;
  }

  public void setOperator(ExpOperator operator) {
    this.operator = operator;
  }

  public Expression attributeValue(AttributeValue attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

  /**
   * Get attributeValue
   * @return attributeValue
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AttributeValue getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(AttributeValue attributeValue) {
    this.attributeValue = attributeValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expression expression = (Expression) o;
    return Objects.equals(this.seqNum, expression.seqNum) &&
        Objects.equals(this.attributeName, expression.attributeName) &&
        Objects.equals(this.operator, expression.operator) &&
        Objects.equals(this.attributeValue, expression.attributeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seqNum, attributeName, operator, attributeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expression {\n");
    
    sb.append("    seqNum: ").append(toIndentedString(seqNum)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
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
