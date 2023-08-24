package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.FileInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SyncUnsubscribeBody1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class SyncUnsubscribeBody1 extends FileInfo  {
  @JsonProperty("action")
  private String syncUnsubscribeBody1Action = null;

  public SyncUnsubscribeBody1 syncUnsubscribeBody1Action(String syncUnsubscribeBody1Action) {
    this.syncUnsubscribeBody1Action = syncUnsubscribeBody1Action;
    return this;
  }

  /**
   * Get syncUnsubscribeBody1Action
   * @return syncUnsubscribeBody1Action
   **/
  @Schema(description = "")
  
    public String getSyncUnsubscribeBody1Action() {
    return syncUnsubscribeBody1Action;
  }

  public void setSyncUnsubscribeBody1Action(String syncUnsubscribeBody1Action) {
    this.syncUnsubscribeBody1Action = syncUnsubscribeBody1Action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncUnsubscribeBody1 syncUnsubscribeBody1 = (SyncUnsubscribeBody1) o;
    return Objects.equals(this.syncUnsubscribeBody1Action, syncUnsubscribeBody1.syncUnsubscribeBody1Action) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncUnsubscribeBody1Action, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncUnsubscribeBody1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    syncUnsubscribeBody1Action: ").append(toIndentedString(syncUnsubscribeBody1Action)).append("\n");
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
