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
 * AllOfsyncUnsubscribeBodyHeader
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class AllOfsyncUnsubscribeBodyHeader extends MsgHeaderV100  {
  @JsonProperty("action")
  private String allOfsyncUnsubscribeBodyHeaderAction = null;

  public AllOfsyncUnsubscribeBodyHeader allOfsyncUnsubscribeBodyHeaderAction(String allOfsyncUnsubscribeBodyHeaderAction) {
    this.allOfsyncUnsubscribeBodyHeaderAction = allOfsyncUnsubscribeBodyHeaderAction;
    return this;
  }

  /**
   * Get allOfsyncUnsubscribeBodyHeaderAction
   * @return allOfsyncUnsubscribeBodyHeaderAction
   **/
  @Schema(description = "")
  
    public String getAllOfsyncUnsubscribeBodyHeaderAction() {
    return allOfsyncUnsubscribeBodyHeaderAction;
  }

  public void setAllOfsyncUnsubscribeBodyHeaderAction(String allOfsyncUnsubscribeBodyHeaderAction) {
    this.allOfsyncUnsubscribeBodyHeaderAction = allOfsyncUnsubscribeBodyHeaderAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfsyncUnsubscribeBodyHeader allOfsyncUnsubscribeBodyHeader = (AllOfsyncUnsubscribeBodyHeader) o;
    return Objects.equals(this.allOfsyncUnsubscribeBodyHeaderAction, allOfsyncUnsubscribeBodyHeader.allOfsyncUnsubscribeBodyHeaderAction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOfsyncUnsubscribeBodyHeaderAction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfsyncUnsubscribeBodyHeader {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allOfsyncUnsubscribeBodyHeaderAction: ").append(toIndentedString(allOfsyncUnsubscribeBodyHeaderAction)).append("\n");
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
