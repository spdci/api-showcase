package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MsgCallbackHeaderV100;
import io.swagger.model.MsgHeaderStatusReasonCode;
import io.swagger.model.RequestStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AllOftxnOnstatusBodyHeader
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class AllOftxnOnstatusBodyHeader extends MsgCallbackHeaderV100  {
  @JsonProperty("action")
  private String allOftxnOnstatusBodyHeaderAction = null;

  public AllOftxnOnstatusBodyHeader allOftxnOnstatusBodyHeaderAction(String allOftxnOnstatusBodyHeaderAction) {
    this.allOftxnOnstatusBodyHeaderAction = allOftxnOnstatusBodyHeaderAction;
    return this;
  }

  /**
   * Get allOftxnOnstatusBodyHeaderAction
   * @return allOftxnOnstatusBodyHeaderAction
   **/
  @Schema(description = "")
  
    public String getAllOftxnOnstatusBodyHeaderAction() {
    return allOftxnOnstatusBodyHeaderAction;
  }

  public void setAllOftxnOnstatusBodyHeaderAction(String allOftxnOnstatusBodyHeaderAction) {
    this.allOftxnOnstatusBodyHeaderAction = allOftxnOnstatusBodyHeaderAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOftxnOnstatusBodyHeader allOftxnOnstatusBodyHeader = (AllOftxnOnstatusBodyHeader) o;
    return Objects.equals(this.allOftxnOnstatusBodyHeaderAction, allOftxnOnstatusBodyHeader.allOftxnOnstatusBodyHeaderAction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOftxnOnstatusBodyHeaderAction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOftxnOnstatusBodyHeader {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allOftxnOnstatusBodyHeaderAction: ").append(toIndentedString(allOftxnOnstatusBodyHeaderAction)).append("\n");
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
