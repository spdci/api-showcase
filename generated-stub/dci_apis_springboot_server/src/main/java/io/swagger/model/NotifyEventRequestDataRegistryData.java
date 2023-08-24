package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CoreRegAllRecords;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Search result record as an outcome of search/subscribe action 
 */
@Schema(description = "Search result record as an outcome of search/subscribe action ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class NotifyEventRequestDataRegistryData   {
  @JsonProperty("record_type")
  private String recordType = null;

  @JsonProperty("record")
  private CoreRegAllRecords record = null;

  public NotifyEventRequestDataRegistryData recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

  /**
   * Get recordType
   * @return recordType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public NotifyEventRequestDataRegistryData record(CoreRegAllRecords record) {
    this.record = record;
    return this;
  }

  /**
   * Get record
   * @return record
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CoreRegAllRecords getRecord() {
    return record;
  }

  public void setRecord(CoreRegAllRecords record) {
    this.record = record;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyEventRequestDataRegistryData notifyEventRequestDataRegistryData = (NotifyEventRequestDataRegistryData) o;
    return Objects.equals(this.recordType, notifyEventRequestDataRegistryData.recordType) &&
        Objects.equals(this.record, notifyEventRequestDataRegistryData.record);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, record);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyEventRequestDataRegistryData {\n");
    
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
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
