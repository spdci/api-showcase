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
 * AllOfregistryOnsearchBodyHeader
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class AllOfregistryOnsearchBodyHeader extends MsgCallbackHeaderV100  {
  @JsonProperty("action")
  private String allOfregistryOnsearchBodyHeaderAction = null;

  public AllOfregistryOnsearchBodyHeader allOfregistryOnsearchBodyHeaderAction(String allOfregistryOnsearchBodyHeaderAction) {
    this.allOfregistryOnsearchBodyHeaderAction = allOfregistryOnsearchBodyHeaderAction;
    return this;
  }

  /**
   * Get allOfregistryOnsearchBodyHeaderAction
   * @return allOfregistryOnsearchBodyHeaderAction
   **/
  @Schema(description = "")
  
    public String getAllOfregistryOnsearchBodyHeaderAction() {
    return allOfregistryOnsearchBodyHeaderAction;
  }

  public void setAllOfregistryOnsearchBodyHeaderAction(String allOfregistryOnsearchBodyHeaderAction) {
    this.allOfregistryOnsearchBodyHeaderAction = allOfregistryOnsearchBodyHeaderAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfregistryOnsearchBodyHeader allOfregistryOnsearchBodyHeader = (AllOfregistryOnsearchBodyHeader) o;
    return Objects.equals(this.allOfregistryOnsearchBodyHeaderAction, allOfregistryOnsearchBodyHeader.allOfregistryOnsearchBodyHeaderAction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOfregistryOnsearchBodyHeaderAction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfregistryOnsearchBodyHeader {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allOfregistryOnsearchBodyHeaderAction: ").append(toIndentedString(allOfregistryOnsearchBodyHeaderAction)).append("\n");
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
