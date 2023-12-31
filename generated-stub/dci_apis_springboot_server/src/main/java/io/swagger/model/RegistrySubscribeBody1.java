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
 * RegistrySubscribeBody1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class RegistrySubscribeBody1 extends FileInfo  {
  @JsonProperty("action")
  private String registrySubscribeBody1Action = null;

  public RegistrySubscribeBody1 registrySubscribeBody1Action(String registrySubscribeBody1Action) {
    this.registrySubscribeBody1Action = registrySubscribeBody1Action;
    return this;
  }

  /**
   * Get registrySubscribeBody1Action
   * @return registrySubscribeBody1Action
   **/
  @Schema(description = "")
  
    public String getRegistrySubscribeBody1Action() {
    return registrySubscribeBody1Action;
  }

  public void setRegistrySubscribeBody1Action(String registrySubscribeBody1Action) {
    this.registrySubscribeBody1Action = registrySubscribeBody1Action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrySubscribeBody1 registrySubscribeBody1 = (RegistrySubscribeBody1) o;
    return Objects.equals(this.registrySubscribeBody1Action, registrySubscribeBody1.registrySubscribeBody1Action) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrySubscribeBody1Action, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrySubscribeBody1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    registrySubscribeBody1Action: ").append(toIndentedString(registrySubscribeBody1Action)).append("\n");
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
