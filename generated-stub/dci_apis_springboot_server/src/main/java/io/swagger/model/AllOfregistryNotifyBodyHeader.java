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
 * AllOfregistryNotifyBodyHeader
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class AllOfregistryNotifyBodyHeader extends MsgCallbackHeaderV100  {
  @JsonProperty("action")
  private String allOfregistryNotifyBodyHeaderAction = null;

  public AllOfregistryNotifyBodyHeader allOfregistryNotifyBodyHeaderAction(String allOfregistryNotifyBodyHeaderAction) {
    this.allOfregistryNotifyBodyHeaderAction = allOfregistryNotifyBodyHeaderAction;
    return this;
  }

  /**
   * Get allOfregistryNotifyBodyHeaderAction
   * @return allOfregistryNotifyBodyHeaderAction
   **/
  @Schema(description = "")
  
    public String getAllOfregistryNotifyBodyHeaderAction() {
    return allOfregistryNotifyBodyHeaderAction;
  }

  public void setAllOfregistryNotifyBodyHeaderAction(String allOfregistryNotifyBodyHeaderAction) {
    this.allOfregistryNotifyBodyHeaderAction = allOfregistryNotifyBodyHeaderAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfregistryNotifyBodyHeader allOfregistryNotifyBodyHeader = (AllOfregistryNotifyBodyHeader) o;
    return Objects.equals(this.allOfregistryNotifyBodyHeaderAction, allOfregistryNotifyBodyHeader.allOfregistryNotifyBodyHeaderAction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOfregistryNotifyBodyHeaderAction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfregistryNotifyBodyHeader {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allOfregistryNotifyBodyHeaderAction: ").append(toIndentedString(allOfregistryNotifyBodyHeaderAction)).append("\n");
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
