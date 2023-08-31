package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.NidDocument;
import io.swagger.model.NidEKycDetails;
import io.swagger.model.NidResidentAddress;
import io.swagger.model.NidResidentLocalAddress;
import io.swagger.model.NidResidentLocalName;
import io.swagger.model.NidResidentNationality;
import io.swagger.model.NidResidentPhoto;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Resident Information
 */
@Schema(description = "Resident Information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class NidResidentRecord  implements CoreRegAllRecords {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("dob")
  private String dob = null;

  @JsonProperty("dob_type")
  private String dobType = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("address")
  private NidResidentAddress address = null;

  @JsonProperty("local_name")
  private NidResidentLocalName localName = null;

  @JsonProperty("local_address")
  private NidResidentLocalAddress localAddress = null;

  @JsonProperty("photo")
  private NidResidentPhoto photo = null;

  @JsonProperty("nationality")
  private NidResidentNationality nationality = null;

  @JsonProperty("kyc_status")
  private NidEKycDetails kycStatus = null;

  @JsonProperty("document")
  private NidDocument document = null;

  public NidResidentRecord name(String name) {
    this.name = name;
    return this;
  }

  /**
   * End-User's full name in displayable form including all name parts, possibly including titles and suffixes, ordered according to the End-User's locale and preferences.
   * @return name
   **/
  @Schema(description = "End-User's full name in displayable form including all name parts, possibly including titles and suffixes, ordered according to the End-User's locale and preferences.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NidResidentRecord gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * End-User's gender. Values defined by this specification are female, male, transgender.
   * @return gender
   **/
  @Schema(description = "End-User's gender. Values defined by this specification are female, male, transgender.")
  
    public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public NidResidentRecord dob(String dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Date of Birth in DDMMYYYY format
   * @return dob
   **/
  @Schema(description = "Date of Birth in DDMMYYYY format")
  
    public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public NidResidentRecord dobType(String dobType) {
    this.dobType = dobType;
    return this;
  }

  /**
   * Date of Birth Type i.e Declared, Approximate, Verified
   * @return dobType
   **/
  @Schema(description = "Date of Birth Type i.e Declared, Approximate, Verified")
  
    public String getDobType() {
    return dobType;
  }

  public void setDobType(String dobType) {
    this.dobType = dobType;
  }

  public NidResidentRecord phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the resident. If the number contains an extension, it is RECOMMENDED that the extension be represented using the RFC 3966 [RFC3966] extension syntax, for example, +1 (604) 555-1234;ext=5678.
   * @return phone
   **/
  @Schema(description = "Phone number of the resident. If the number contains an extension, it is RECOMMENDED that the extension be represented using the RFC 3966 [RFC3966] extension syntax, for example, +1 (604) 555-1234;ext=5678.")
  
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public NidResidentRecord email(String email) {
    this.email = email;
    return this;
  }

  /**
   * End-User's preferred e-mail address. Its value MUST conform to the RFC 5322 [RFC5322] addr-spec syntax. The RP MUST NOT rely upon this value being unique, as discussed in Section 5.7.
   * @return email
   **/
  @Schema(description = "End-User's preferred e-mail address. Its value MUST conform to the RFC 5322 [RFC5322] addr-spec syntax. The RP MUST NOT rely upon this value being unique, as discussed in Section 5.7.")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public NidResidentRecord address(NidResidentAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(description = "")
  
    @Valid
    public NidResidentAddress getAddress() {
    return address;
  }

  public void setAddress(NidResidentAddress address) {
    this.address = address;
  }

  public NidResidentRecord localName(NidResidentLocalName localName) {
    this.localName = localName;
    return this;
  }

  /**
   * Get localName
   * @return localName
   **/
  @Schema(description = "")
  
    @Valid
    public NidResidentLocalName getLocalName() {
    return localName;
  }

  public void setLocalName(NidResidentLocalName localName) {
    this.localName = localName;
  }

  public NidResidentRecord localAddress(NidResidentLocalAddress localAddress) {
    this.localAddress = localAddress;
    return this;
  }

  /**
   * Get localAddress
   * @return localAddress
   **/
  @Schema(description = "")
  
    @Valid
    public NidResidentLocalAddress getLocalAddress() {
    return localAddress;
  }

  public void setLocalAddress(NidResidentLocalAddress localAddress) {
    this.localAddress = localAddress;
  }

  public NidResidentRecord photo(NidResidentPhoto photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
   **/
  @Schema(description = "")
  
    @Valid
    public NidResidentPhoto getPhoto() {
    return photo;
  }

  public void setPhoto(NidResidentPhoto photo) {
    this.photo = photo;
  }

  public NidResidentRecord nationality(NidResidentNationality nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
   **/
  @Schema(description = "")
  
    @Valid
    public NidResidentNationality getNationality() {
    return nationality;
  }

  public void setNationality(NidResidentNationality nationality) {
    this.nationality = nationality;
  }

  public NidResidentRecord kycStatus(NidEKycDetails kycStatus) {
    this.kycStatus = kycStatus;
    return this;
  }

  /**
   * Get kycStatus
   * @return kycStatus
   **/
  @Schema(description = "")
  
    @Valid
    public NidEKycDetails getKycStatus() {
    return kycStatus;
  }

  public void setKycStatus(NidEKycDetails kycStatus) {
    this.kycStatus = kycStatus;
  }

  public NidResidentRecord document(NidDocument document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
   **/
  @Schema(description = "")
  
    @Valid
    public NidDocument getDocument() {
    return document;
  }

  public void setDocument(NidDocument document) {
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
    NidResidentRecord nidResidentRecord = (NidResidentRecord) o;
    return Objects.equals(this.name, nidResidentRecord.name) &&
        Objects.equals(this.gender, nidResidentRecord.gender) &&
        Objects.equals(this.dob, nidResidentRecord.dob) &&
        Objects.equals(this.dobType, nidResidentRecord.dobType) &&
        Objects.equals(this.phone, nidResidentRecord.phone) &&
        Objects.equals(this.email, nidResidentRecord.email) &&
        Objects.equals(this.address, nidResidentRecord.address) &&
        Objects.equals(this.localName, nidResidentRecord.localName) &&
        Objects.equals(this.localAddress, nidResidentRecord.localAddress) &&
        Objects.equals(this.photo, nidResidentRecord.photo) &&
        Objects.equals(this.nationality, nidResidentRecord.nationality) &&
        Objects.equals(this.kycStatus, nidResidentRecord.kycStatus) &&
        Objects.equals(this.document, nidResidentRecord.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, gender, dob, dobType, phone, email, address, localName, localAddress, photo, nationality, kycStatus, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NidResidentRecord {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    dobType: ").append(toIndentedString(dobType)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    localName: ").append(toIndentedString(localName)).append("\n");
    sb.append("    localAddress: ").append(toIndentedString(localAddress)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    kycStatus: ").append(toIndentedString(kycStatus)).append("\n");
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
