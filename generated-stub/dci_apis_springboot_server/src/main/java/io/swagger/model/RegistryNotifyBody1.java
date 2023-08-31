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
 * RegistryNotifyBody1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class RegistryNotifyBody1 extends FileInfo  {
  @JsonProperty("action")
  private String registryNotifyBody1Action = null;

  public RegistryNotifyBody1 registryNotifyBody1Action(String registryNotifyBody1Action) {
    this.registryNotifyBody1Action = registryNotifyBody1Action;
    return this;
  }

  /**
   * Get registryNotifyBody1Action
   * @return registryNotifyBody1Action
   **/
  @Schema(description = "")
  
    public String getRegistryNotifyBody1Action() {
    return registryNotifyBody1Action;
  }

  public void setRegistryNotifyBody1Action(String registryNotifyBody1Action) {
    this.registryNotifyBody1Action = registryNotifyBody1Action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryNotifyBody1 registryNotifyBody1 = (RegistryNotifyBody1) o;
    return Objects.equals(this.registryNotifyBody1Action, registryNotifyBody1.registryNotifyBody1Action) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registryNotifyBody1Action, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryNotifyBody1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    registryNotifyBody1Action: ").append(toIndentedString(registryNotifyBody1Action)).append("\n");
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
