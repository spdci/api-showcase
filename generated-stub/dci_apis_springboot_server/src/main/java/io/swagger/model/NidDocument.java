package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Supporting document of the Resident,Reference document collected for registering the deceased information,Document encoded as Base64 string
 */
@Schema(description = "Supporting document of the Resident,Reference document collected for registering the deceased information,Document encoded as Base64 string")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class NidDocument   {
  @JsonProperty("document_name")
  private String documentName = null;

  @JsonProperty("document")
  private String document = null;

  public NidDocument documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

  /**
   * Name of the document
   * @return documentName
   **/
  @Schema(description = "Name of the document")
  
    public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public NidDocument document(String document) {
    this.document = document;
    return this;
  }

  /**
   * Bases 64 encoded document
   * @return document
   **/
  @Schema(description = "Bases 64 encoded document")
  
    public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NidDocument nidDocument = (NidDocument) o;
    return Objects.equals(this.documentName, nidDocument.documentName) &&
        Objects.equals(this.document, nidDocument.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentName, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NidDocument {\n");
    
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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
