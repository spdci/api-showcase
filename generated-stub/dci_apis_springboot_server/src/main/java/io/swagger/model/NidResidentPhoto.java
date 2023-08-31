package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Resident Photo,Image encoded as Base64 string
 */
@Schema(description = "Resident Photo,Image encoded as Base64 string")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class NidResidentPhoto   {
  @JsonProperty("photo")
  private String photo = null;

  public NidResidentPhoto photo(String photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Photo encoded as Base64 string
   * @return photo
   **/
  @Schema(description = "Photo encoded as Base64 string")
  
    public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NidResidentPhoto nidResidentPhoto = (NidResidentPhoto) o;
    return Objects.equals(this.photo, nidResidentPhoto.photo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(photo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NidResidentPhoto {\n");
    
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
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
