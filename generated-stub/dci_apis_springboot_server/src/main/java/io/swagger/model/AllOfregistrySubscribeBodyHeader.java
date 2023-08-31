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
 * AllOfregistrySubscribeBodyHeader
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class AllOfregistrySubscribeBodyHeader extends MsgHeaderV100  {
  @JsonProperty("action")
  private String allOfregistrySubscribeBodyHeaderAction = null;

  public AllOfregistrySubscribeBodyHeader allOfregistrySubscribeBodyHeaderAction(String allOfregistrySubscribeBodyHeaderAction) {
    this.allOfregistrySubscribeBodyHeaderAction = allOfregistrySubscribeBodyHeaderAction;
    return this;
  }

  /**
   * Get allOfregistrySubscribeBodyHeaderAction
   * @return allOfregistrySubscribeBodyHeaderAction
   **/
  @Schema(description = "")
  
    public String getAllOfregistrySubscribeBodyHeaderAction() {
    return allOfregistrySubscribeBodyHeaderAction;
  }

  public void setAllOfregistrySubscribeBodyHeaderAction(String allOfregistrySubscribeBodyHeaderAction) {
    this.allOfregistrySubscribeBodyHeaderAction = allOfregistrySubscribeBodyHeaderAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfregistrySubscribeBodyHeader allOfregistrySubscribeBodyHeader = (AllOfregistrySubscribeBodyHeader) o;
    return Objects.equals(this.allOfregistrySubscribeBodyHeaderAction, allOfregistrySubscribeBodyHeader.allOfregistrySubscribeBodyHeaderAction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOfregistrySubscribeBodyHeaderAction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfregistrySubscribeBodyHeader {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allOfregistrySubscribeBodyHeaderAction: ").append(toIndentedString(allOfregistrySubscribeBodyHeaderAction)).append("\n");
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
