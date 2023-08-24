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
 * AllOftxnStatusBodyHeader
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class AllOftxnStatusBodyHeader extends MsgHeaderV100  {
  @JsonProperty("action")
  private String allOftxnStatusBodyHeaderAction = null;

  public AllOftxnStatusBodyHeader allOftxnStatusBodyHeaderAction(String allOftxnStatusBodyHeaderAction) {
    this.allOftxnStatusBodyHeaderAction = allOftxnStatusBodyHeaderAction;
    return this;
  }

  /**
   * Get allOftxnStatusBodyHeaderAction
   * @return allOftxnStatusBodyHeaderAction
   **/
  @Schema(description = "")
  
    public String getAllOftxnStatusBodyHeaderAction() {
    return allOftxnStatusBodyHeaderAction;
  }

  public void setAllOftxnStatusBodyHeaderAction(String allOftxnStatusBodyHeaderAction) {
    this.allOftxnStatusBodyHeaderAction = allOftxnStatusBodyHeaderAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOftxnStatusBodyHeader allOftxnStatusBodyHeader = (AllOftxnStatusBodyHeader) o;
    return Objects.equals(this.allOftxnStatusBodyHeaderAction, allOftxnStatusBodyHeader.allOftxnStatusBodyHeaderAction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOftxnStatusBodyHeaderAction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOftxnStatusBodyHeader {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allOftxnStatusBodyHeaderAction: ").append(toIndentedString(allOftxnStatusBodyHeaderAction)).append("\n");
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
