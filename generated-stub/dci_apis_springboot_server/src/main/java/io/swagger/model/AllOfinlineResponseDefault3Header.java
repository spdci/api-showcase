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
 * AllOfinlineResponseDefault3Header
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class AllOfinlineResponseDefault3Header extends MsgCallbackHeaderV100  {
  @JsonProperty("action")
  private String allOfinlineResponseDefault3HeaderAction = null;

  public AllOfinlineResponseDefault3Header allOfinlineResponseDefault3HeaderAction(String allOfinlineResponseDefault3HeaderAction) {
    this.allOfinlineResponseDefault3HeaderAction = allOfinlineResponseDefault3HeaderAction;
    return this;
  }

  /**
   * Get allOfinlineResponseDefault3HeaderAction
   * @return allOfinlineResponseDefault3HeaderAction
   **/
  @Schema(description = "")
  
    public String getAllOfinlineResponseDefault3HeaderAction() {
    return allOfinlineResponseDefault3HeaderAction;
  }

  public void setAllOfinlineResponseDefault3HeaderAction(String allOfinlineResponseDefault3HeaderAction) {
    this.allOfinlineResponseDefault3HeaderAction = allOfinlineResponseDefault3HeaderAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfinlineResponseDefault3Header allOfinlineResponseDefault3Header = (AllOfinlineResponseDefault3Header) o;
    return Objects.equals(this.allOfinlineResponseDefault3HeaderAction, allOfinlineResponseDefault3Header.allOfinlineResponseDefault3HeaderAction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allOfinlineResponseDefault3HeaderAction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfinlineResponseDefault3Header {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allOfinlineResponseDefault3HeaderAction: ").append(toIndentedString(allOfinlineResponseDefault3HeaderAction)).append("\n");
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
