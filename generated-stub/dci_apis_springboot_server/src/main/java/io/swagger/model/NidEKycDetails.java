package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * eKYC details of the resident ,ekyc Details undertaken by the Resident
 */
@Schema(description = "eKYC details of the resident ,ekyc Details undertaken by the Resident")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class NidEKycDetails   {
  @JsonProperty("ekyc_date")
  private String ekycDate = null;

  public NidEKycDetails ekycDate(String ekycDate) {
    this.ekycDate = ekycDate;
    return this;
  }

  /**
   * Date on which eKYC has been done. A null value indicates that eKYC has not been undertaken
   * @return ekycDate
   **/
  @Schema(description = "Date on which eKYC has been done. A null value indicates that eKYC has not been undertaken")
  
    public String getEkycDate() {
    return ekycDate;
  }

  public void setEkycDate(String ekycDate) {
    this.ekycDate = ekycDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NidEKycDetails nidEKycDetails = (NidEKycDetails) o;
    return Objects.equals(this.ekycDate, nidEKycDetails.ekycDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ekycDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NidEKycDetails {\n");
    
    sb.append("    ekycDate: ").append(toIndentedString(ekycDate)).append("\n");
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
