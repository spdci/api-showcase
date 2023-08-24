package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * File info. Used in file upload feature using HTTPS
 */
@Schema(description = "File info. Used in file upload feature using HTTPS")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class FileInfo   {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("fileName")
  private Resource fileName = null;

  @JsonProperty("fileFormat")
  private String fileFormat = "json";

  public FileInfo action(String action) {
    this.action = action;
    return this;
  }

  /**
   * G2P Connect specific actions. Usually verb from the URI should go here to help store and fwd kind of processing requirements.
   * @return action
   **/
  @Schema(required = true, description = "G2P Connect specific actions. Usually verb from the URI should go here to help store and fwd kind of processing requirements.")
      @NotNull

    public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public FileInfo fileName(Resource fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Disbursement instruction file representing Disburse or OnDisburse end point elements i.e signature/header/message entities as a file record
   * @return fileName
   **/
  @Schema(required = true, description = "Disbursement instruction file representing Disburse or OnDisburse end point elements i.e signature/header/message entities as a file record")
      @NotNull

    @Valid
    public Resource getFileName() {
    return fileName;
  }

  public void setFileName(Resource fileName) {
    this.fileName = fileName;
  }

  public FileInfo fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

  /**
   * File content format. e.g json, csv, etc.,
   * @return fileFormat
   **/
  @Schema(example = "csv", description = "File content format. e.g json, csv, etc.,")
  
    public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileInfo fileInfo = (FileInfo) o;
    return Objects.equals(this.action, fileInfo.action) &&
        Objects.equals(this.fileName, fileInfo.fileName) &&
        Objects.equals(this.fileFormat, fileInfo.fileFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, fileName, fileFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileInfo {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
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
