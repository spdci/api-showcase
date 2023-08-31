package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OpenidPersonDocDetailsIssuer;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 1. Person document detials as per OpenID [identity-assurance](https://openid.net/specs/openid-connect-4-identity-assurance-1_0-13.html#name-evidence-element) 2. JSON object representing the document used to perform the identity verification.  
 */
@Schema(description = "1. Person document detials as per OpenID [identity-assurance](https://openid.net/specs/openid-connect-4-identity-assurance-1_0-13.html#name-evidence-element) 2. JSON object representing the document used to perform the identity verification.  ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class OpenidPersonDocDetails   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("document_number")
  private String documentNumber = null;

  @JsonProperty("personal_number")
  private String personalNumber = null;

  @JsonProperty("serial_number")
  private String serialNumber = null;

  @JsonProperty("date_of_issuance")
  private String dateOfIssuance = null;

  @JsonProperty("date_of_expiry")
  private String dateOfExpiry = null;

  @JsonProperty("issuer")
  private OpenidPersonDocDetailsIssuer issuer = null;

  public OpenidPersonDocDetails type(String type) {
    this.type = type;
    return this;
  }

  /**
   * String denoting the type of the document. The OP MAY use other than the predefined values in which case the RPs will either be unable to process the assertion, just store this value for audit purposes, or apply bespoken business logic to it.
   * @return type
   **/
  @Schema(required = true, description = "String denoting the type of the document. The OP MAY use other than the predefined values in which case the RPs will either be unable to process the assertion, just store this value for audit purposes, or apply bespoken business logic to it.")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OpenidPersonDocDetails documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * String Representing an identifier/number that uniquely identifies a document that was issued to the End-User. This is used on one document and will change if it is reissued, e.g., a passport number, certificate number, etc. Note, number can be used as an alias for 'document_number' for backward compatibility purposes but will be deprecated in future releases, implementers are recommended to use document_number.
   * @return documentNumber
   **/
  @Schema(description = "String Representing an identifier/number that uniquely identifies a document that was issued to the End-User. This is used on one document and will change if it is reissued, e.g., a passport number, certificate number, etc. Note, number can be used as an alias for 'document_number' for backward compatibility purposes but will be deprecated in future releases, implementers are recommended to use document_number.")
  
    public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public OpenidPersonDocDetails personalNumber(String personalNumber) {
    this.personalNumber = personalNumber;
    return this;
  }

  /**
   * String representing an identifier that is assigned to the End-User and is not limited to being used in one document, for example a national identification number, personal identity number, citizen number, social security number, driver number, account number, customer number, licensee number, etc.
   * @return personalNumber
   **/
  @Schema(description = "String representing an identifier that is assigned to the End-User and is not limited to being used in one document, for example a national identification number, personal identity number, citizen number, social security number, driver number, account number, customer number, licensee number, etc.")
  
    public String getPersonalNumber() {
    return personalNumber;
  }

  public void setPersonalNumber(String personalNumber) {
    this.personalNumber = personalNumber;
  }

  public OpenidPersonDocDetails serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * String representing an identifier/number that identifies the document irrespective of any personalization information (this usually only applies to physical artifacts and is present before personalization).
   * @return serialNumber
   **/
  @Schema(description = "String representing an identifier/number that identifies the document irrespective of any personalization information (this usually only applies to physical artifacts and is present before personalization).")
  
    public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public OpenidPersonDocDetails dateOfIssuance(String dateOfIssuance) {
    this.dateOfIssuance = dateOfIssuance;
    return this;
  }

  /**
   * The date the document was issued as ISO 8601 [ISO8601] YYYY-MM-DD format.
   * @return dateOfIssuance
   **/
  @Schema(description = "The date the document was issued as ISO 8601 [ISO8601] YYYY-MM-DD format.")
  
    public String getDateOfIssuance() {
    return dateOfIssuance;
  }

  public void setDateOfIssuance(String dateOfIssuance) {
    this.dateOfIssuance = dateOfIssuance;
  }

  public OpenidPersonDocDetails dateOfExpiry(String dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
    return this;
  }

  /**
   * The date the document will expire as ISO 8601 [ISO8601] YYYY-MM-DD format.
   * @return dateOfExpiry
   **/
  @Schema(description = "The date the document will expire as ISO 8601 [ISO8601] YYYY-MM-DD format.")
  
    public String getDateOfExpiry() {
    return dateOfExpiry;
  }

  public void setDateOfExpiry(String dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
  }

  public OpenidPersonDocDetails issuer(OpenidPersonDocDetailsIssuer issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
   **/
  @Schema(description = "")
  
    @Valid
    public OpenidPersonDocDetailsIssuer getIssuer() {
    return issuer;
  }

  public void setIssuer(OpenidPersonDocDetailsIssuer issuer) {
    this.issuer = issuer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenidPersonDocDetails openidPersonDocDetails = (OpenidPersonDocDetails) o;
    return Objects.equals(this.type, openidPersonDocDetails.type) &&
        Objects.equals(this.documentNumber, openidPersonDocDetails.documentNumber) &&
        Objects.equals(this.personalNumber, openidPersonDocDetails.personalNumber) &&
        Objects.equals(this.serialNumber, openidPersonDocDetails.serialNumber) &&
        Objects.equals(this.dateOfIssuance, openidPersonDocDetails.dateOfIssuance) &&
        Objects.equals(this.dateOfExpiry, openidPersonDocDetails.dateOfExpiry) &&
        Objects.equals(this.issuer, openidPersonDocDetails.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, documentNumber, personalNumber, serialNumber, dateOfIssuance, dateOfExpiry, issuer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenidPersonDocDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    personalNumber: ").append(toIndentedString(personalNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    dateOfIssuance: ").append(toIndentedString(dateOfIssuance)).append("\n");
    sb.append("    dateOfExpiry: ").append(toIndentedString(dateOfExpiry)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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
