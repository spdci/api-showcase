package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 1. Person id is case insensitve normative represenation as id-type:id@provider &lt;br&gt; 2. This will enumerate foundational and functioanl id&#x27;s to easily resolvable addressess &lt;br&gt; 3. This property is intended to unambiguously refer to an object, such as a person, beneficiary, user, etc., &lt;br&gt; 4. Few examples: &lt;br&gt;     - id@identifier-type.id-provider e.g token:12345@mosip, vid:543215@mosip &lt;br&gt;     - id@civil-registry.issuing-agency e.g id:12345@crvs, brn:12345@crvs, mrn:12345@crvs &lt;br&gt;     - id@functional-identifier.issuing-agency e.g id:12345@voter-id, id:12345@driving-license, mobile:12345@farmer-reg &lt;br&gt; Note: id provider should be made configurable and solutions should adapt to the local jurisdiction and policies. 
 */
@Schema(description = "1. Person id is case insensitve normative represenation as id-type:id@provider <br> 2. This will enumerate foundational and functioanl id's to easily resolvable addressess <br> 3. This property is intended to unambiguously refer to an object, such as a person, beneficiary, user, etc., <br> 4. Few examples: <br>     - id@identifier-type.id-provider e.g token:12345@mosip, vid:543215@mosip <br>     - id@civil-registry.issuing-agency e.g id:12345@crvs, brn:12345@crvs, mrn:12345@crvs <br>     - id@functional-identifier.issuing-agency e.g id:12345@voter-id, id:12345@driving-license, mobile:12345@farmer-reg <br> Note: id provider should be made configurable and solutions should adapt to the local jurisdiction and policies. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class CdpiPersonId  implements CoreRegAllQueries {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdpiPersonId {\n");
    
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
