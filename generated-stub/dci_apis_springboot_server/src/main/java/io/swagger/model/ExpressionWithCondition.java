package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ExpCondition;
import io.swagger.model.Expression;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExpressionWithCondition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class ExpressionWithCondition   {
  @JsonProperty("expression1")
  private Expression expression1 = null;

  @JsonProperty("condition")
  private ExpCondition condition = null;

  @JsonProperty("expression2")
  private Expression expression2 = null;

  public ExpressionWithCondition expression1(Expression expression1) {
    this.expression1 = expression1;
    return this;
  }

  /**
   * Get expression1
   * @return expression1
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Expression getExpression1() {
    return expression1;
  }

  public void setExpression1(Expression expression1) {
    this.expression1 = expression1;
  }

  public ExpressionWithCondition condition(ExpCondition condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   **/
  @Schema(description = "")
  
    @Valid
    public ExpCondition getCondition() {
    return condition;
  }

  public void setCondition(ExpCondition condition) {
    this.condition = condition;
  }

  public ExpressionWithCondition expression2(Expression expression2) {
    this.expression2 = expression2;
    return this;
  }

  /**
   * Get expression2
   * @return expression2
   **/
  @Schema(description = "")
  
    @Valid
    public Expression getExpression2() {
    return expression2;
  }

  public void setExpression2(Expression expression2) {
    this.expression2 = expression2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressionWithCondition expressionWithCondition = (ExpressionWithCondition) o;
    return Objects.equals(this.expression1, expressionWithCondition.expression1) &&
        Objects.equals(this.condition, expressionWithCondition.condition) &&
        Objects.equals(this.expression2, expressionWithCondition.expression2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression1, condition, expression2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressionWithCondition {\n");
    
    sb.append("    expression1: ").append(toIndentedString(expression1)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    expression2: ").append(toIndentedString(expression2)).append("\n");
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
