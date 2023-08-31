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
 * RegistryOnsearchBody1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class RegistryOnsearchBody1 extends FileInfo  {
  @JsonProperty("action")
  private String registryOnsearchBody1Action = null;

  public RegistryOnsearchBody1 registryOnsearchBody1Action(String registryOnsearchBody1Action) {
    this.registryOnsearchBody1Action = registryOnsearchBody1Action;
    return this;
  }

  /**
   * Get registryOnsearchBody1Action
   * @return registryOnsearchBody1Action
   **/
  @Schema(description = "")
  
    public String getRegistryOnsearchBody1Action() {
    return registryOnsearchBody1Action;
  }

  public void setRegistryOnsearchBody1Action(String registryOnsearchBody1Action) {
    this.registryOnsearchBody1Action = registryOnsearchBody1Action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryOnsearchBody1 registryOnsearchBody1 = (RegistryOnsearchBody1) o;
    return Objects.equals(this.registryOnsearchBody1Action, registryOnsearchBody1.registryOnsearchBody1Action) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registryOnsearchBody1Action, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryOnsearchBody1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    registryOnsearchBody1Action: ").append(toIndentedString(registryOnsearchBody1Action)).append("\n");
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
