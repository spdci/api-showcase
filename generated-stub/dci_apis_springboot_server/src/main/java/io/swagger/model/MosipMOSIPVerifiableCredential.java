package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MosipMOSIPVerifiableCredentialCredentialSubject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MOSIP Verifiable Credential for a [person](https://github.com/opencrvs/mosip-mediator/blob/master/samples/decrypted-sample-received-credentials.json)
 */
@Schema(description = "MOSIP Verifiable Credential for a [person](https://github.com/opencrvs/mosip-mediator/blob/master/samples/decrypted-sample-received-credentials.json)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class MosipMOSIPVerifiableCredential  implements CoreRegAllRecords {
  @JsonProperty("issuedTo")
  private String issuedTo = null;

  @JsonProperty("protectedAttributes")
  @Valid
  private List<String> protectedAttributes = null;

  @JsonProperty("credentialSubject")
  private MosipMOSIPVerifiableCredentialCredentialSubject credentialSubject = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  @Valid
  private List<String> type = null;

  @JsonProperty("consent")
  private String consent = null;

  @JsonProperty("issuer")
  private String issuer = null;

  public MosipMOSIPVerifiableCredential issuedTo(String issuedTo) {
    this.issuedTo = issuedTo;
    return this;
  }

  /**
   * Get issuedTo
   * @return issuedTo
   **/
  @Schema(description = "")
  
    public String getIssuedTo() {
    return issuedTo;
  }

  public void setIssuedTo(String issuedTo) {
    this.issuedTo = issuedTo;
  }

  public MosipMOSIPVerifiableCredential protectedAttributes(List<String> protectedAttributes) {
    this.protectedAttributes = protectedAttributes;
    return this;
  }

  public MosipMOSIPVerifiableCredential addProtectedAttributesItem(String protectedAttributesItem) {
    if (this.protectedAttributes == null) {
      this.protectedAttributes = new ArrayList<String>();
    }
    this.protectedAttributes.add(protectedAttributesItem);
    return this;
  }

  /**
   * Get protectedAttributes
   * @return protectedAttributes
   **/
  @Schema(description = "")
  
    public List<String> getProtectedAttributes() {
    return protectedAttributes;
  }

  public void setProtectedAttributes(List<String> protectedAttributes) {
    this.protectedAttributes = protectedAttributes;
  }

  public MosipMOSIPVerifiableCredential credentialSubject(MosipMOSIPVerifiableCredentialCredentialSubject credentialSubject) {
    this.credentialSubject = credentialSubject;
    return this;
  }

  /**
   * Get credentialSubject
   * @return credentialSubject
   **/
  @Schema(description = "")
  
    @Valid
    public MosipMOSIPVerifiableCredentialCredentialSubject getCredentialSubject() {
    return credentialSubject;
  }

  public void setCredentialSubject(MosipMOSIPVerifiableCredentialCredentialSubject credentialSubject) {
    this.credentialSubject = credentialSubject;
  }

  public MosipMOSIPVerifiableCredential id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "http://mosip.io/credentials/e2039315-87b0-4012-942e-e0d7c879994b", description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MosipMOSIPVerifiableCredential type(List<String> type) {
    this.type = type;
    return this;
  }

  public MosipMOSIPVerifiableCredential addTypeItem(String typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<String>();
    }
    this.type.add(typeItem);
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    public List<String> getType() {
    return type;
  }

  public void setType(List<String> type) {
    this.type = type;
  }

  public MosipMOSIPVerifiableCredential consent(String consent) {
    this.consent = consent;
    return this;
  }

  /**
   * Get consent
   * @return consent
   **/
  @Schema(description = "")
  
    public String getConsent() {
    return consent;
  }

  public void setConsent(String consent) {
    this.consent = consent;
  }

  public MosipMOSIPVerifiableCredential issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
   **/
  @Schema(example = "https://mosip.io/issuers/", description = "")
  
    public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
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
    MosipMOSIPVerifiableCredential mosipMOSIPVerifiableCredential = (MosipMOSIPVerifiableCredential) o;
    return Objects.equals(this.issuedTo, mosipMOSIPVerifiableCredential.issuedTo) &&
        Objects.equals(this.protectedAttributes, mosipMOSIPVerifiableCredential.protectedAttributes) &&
        Objects.equals(this.credentialSubject, mosipMOSIPVerifiableCredential.credentialSubject) &&
        Objects.equals(this.id, mosipMOSIPVerifiableCredential.id) &&
        Objects.equals(this.type, mosipMOSIPVerifiableCredential.type) &&
        Objects.equals(this.consent, mosipMOSIPVerifiableCredential.consent) &&
        Objects.equals(this.issuer, mosipMOSIPVerifiableCredential.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedTo, protectedAttributes, credentialSubject, id, type, consent, issuer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MosipMOSIPVerifiableCredential {\n");
    
    sb.append("    issuedTo: ").append(toIndentedString(issuedTo)).append("\n");
    sb.append("    protectedAttributes: ").append(toIndentedString(protectedAttributes)).append("\n");
    sb.append("    credentialSubject: ").append(toIndentedString(credentialSubject)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
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
