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
 * AllOfsyncSubscriptionsBodyHeader
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class AllOfsyncSubscriptionsBodyHeader extends MsgHeaderV100  {
  @JsonProperty("action")
  private String allOfsyncSubscriptionsBodyHeaderAction = null;

  public AllOfsyncSubscriptionsBodyHeader allOfsyncSubscriptionsBodyHeaderAction(String allOfsyncSubscriptionsBodyHeaderAction) {
    this.allOfsyncSubscriptionsBodyHeaderAction = allOfsyncSubscriptionsBodyHeaderAction;
    return this;
  }

  /**
   * Get allOfsyncSubscriptionsBodyHeaderAction
   * @return allOfsyncSubscriptionsBodyHeaderAction
   **/
  @Schema(description = "")
  
    public String getAllOfsyncSubscriptionsBodyHeaderAction() {
    return allOfsyncSubscriptionsBodyHeaderAction;
  }

  public void setAllOfsyncSubscriptionsBodyHeaderAction(String allOfsyncSubscriptionsBodyHeaderAction) {
    this.allOfsyncSubscriptionsBodyHeaderAction = allOfsyncSubscriptionsBodyHeaderAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfsyncSubscriptionsBodyHeader allOfsyncSubscriptionsBodyHeader = (AllOfsyncSubscriptionsBodyHeader) o;
    return Objects.equals(this.allOfsyncSubscriptionsBodyHeaderAction, allOfsyncSubscriptionsBodyHeader.allOfsyncSubscriptionsBodyHeaderAction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOfsyncSubscriptionsBodyHeaderAction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfsyncSubscriptionsBodyHeader {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allOfsyncSubscriptionsBodyHeaderAction: ").append(toIndentedString(allOfsyncSubscriptionsBodyHeaderAction)).append("\n");
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
