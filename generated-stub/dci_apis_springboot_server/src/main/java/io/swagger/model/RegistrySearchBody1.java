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
 * RegistrySearchBody1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class RegistrySearchBody1 extends FileInfo  {
  @JsonProperty("action")
  private String registrySearchBody1Action = null;

  public RegistrySearchBody1 registrySearchBody1Action(String registrySearchBody1Action) {
    this.registrySearchBody1Action = registrySearchBody1Action;
    return this;
  }

  /**
   * Get registrySearchBody1Action
   * @return registrySearchBody1Action
   **/
  @Schema(description = "")
  
    public String getRegistrySearchBody1Action() {
    return registrySearchBody1Action;
  }

  public void setRegistrySearchBody1Action(String registrySearchBody1Action) {
    this.registrySearchBody1Action = registrySearchBody1Action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrySearchBody1 registrySearchBody1 = (RegistrySearchBody1) o;
    return Objects.equals(this.registrySearchBody1Action, registrySearchBody1.registrySearchBody1Action) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrySearchBody1Action, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrySearchBody1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    registrySearchBody1Action: ").append(toIndentedString(registrySearchBody1Action)).append("\n");
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
