package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MsgHeaderV100;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AllOftxnStatusBody2Header
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class AllOftxnStatusBody2Header extends MsgHeaderV100  {
  @JsonProperty("action")
  private String allOftxnStatusBody2HeaderAction = null;

  public AllOftxnStatusBody2Header allOftxnStatusBody2HeaderAction(String allOftxnStatusBody2HeaderAction) {
    this.allOftxnStatusBody2HeaderAction = allOftxnStatusBody2HeaderAction;
    return this;
  }

  /**
   * Get allOftxnStatusBody2HeaderAction
   * @return allOftxnStatusBody2HeaderAction
   **/
  @Schema(description = "")
  
    public String getAllOftxnStatusBody2HeaderAction() {
    return allOftxnStatusBody2HeaderAction;
  }

  public void setAllOftxnStatusBody2HeaderAction(String allOftxnStatusBody2HeaderAction) {
    this.allOftxnStatusBody2HeaderAction = allOftxnStatusBody2HeaderAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOftxnStatusBody2Header allOftxnStatusBody2Header = (AllOftxnStatusBody2Header) o;
    return Objects.equals(this.allOftxnStatusBody2HeaderAction, allOftxnStatusBody2Header.allOftxnStatusBody2HeaderAction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOftxnStatusBody2HeaderAction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOftxnStatusBody2Header {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allOftxnStatusBody2HeaderAction: ").append(toIndentedString(allOftxnStatusBody2HeaderAction)).append("\n");
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
