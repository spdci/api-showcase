package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AttributeNameValueList;
import io.swagger.model.OpenidAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 1. Attributes of a person to create fetch records, create verifiable credentials or use in search criteria. 2. Allowes Country/Registry specific implementation extensions using Attribute Name/Value pairs. 3. Person info as per OpenID [Claims](https://openid.net/specs/openid-connect-core-1_0.html#Claims) 4. Person additional info based on OpenID [name-additional-claims](https://openid.net/specs/openid-connect-4-identity-assurance-1_0-13.html#name-additional-claims-about-end) 
 */
@Schema(description = "1. Attributes of a person to create fetch records, create verifiable credentials or use in search criteria. 2. Allowes Country/Registry specific implementation extensions using Attribute Name/Value pairs. 3. Person info as per OpenID [Claims](https://openid.net/specs/openid-connect-core-1_0.html#Claims) 4. Person additional info based on OpenID [name-additional-claims](https://openid.net/specs/openid-connect-4-identity-assurance-1_0-13.html#name-additional-claims-about-end) ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class OpenidPersonRecord   {
  @JsonProperty("sub")
  private String sub = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("given_name")
  private String givenName = null;

  @JsonProperty("family_name")
  private String familyName = null;

  @JsonProperty("middle_name")
  private String middleName = null;

  @JsonProperty("nickname")
  private String nickname = null;

  @JsonProperty("preferred_username")
  private String preferredUsername = null;

  @JsonProperty("profile")
  private String profile = null;

  @JsonProperty("picture")
  private String picture = null;

  @JsonProperty("website")
  private String website = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("email_verified")
  private Boolean emailVerified = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("birthdate")
  private String birthdate = null;

  @JsonProperty("place_of_birth")
  private Object placeOfBirth = null;

  @JsonProperty("deathdate")
  private String deathdate = null;

  @JsonProperty("place_of_death")
  private Object placeOfDeath = null;

  @JsonProperty("phone_number")
  private String phoneNumber = null;

  @JsonProperty("phone_number_verified")
  private String phoneNumberVerified = null;

  @JsonProperty("address")
  private OpenidAddress address = null;

  @JsonProperty("zoneinfo")
  private String zoneinfo = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("nationalities")
  @Valid
  private List<String> nationalities = null;

  @JsonProperty("updated_at")
  private BigDecimal updatedAt = null;

  @JsonProperty("birth_family_name")
  private String birthFamilyName = null;

  @JsonProperty("birth_given_name")
  private String birthGivenName = null;

  @JsonProperty("birth_middle_name")
  private String birthMiddleName = null;

  @JsonProperty("salutation")
  private String salutation = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("msisdn")
  private String msisdn = null;

  @JsonProperty("also_known_as")
  private String alsoKnownAs = null;

  @JsonProperty("additional_attributes")
  private AttributeNameValueList additionalAttributes = null;

  public OpenidPersonRecord sub(String sub) {
    this.sub = sub;
    return this;
  }

  /**
   * Subject - Identifier for the End-User at the Issuer.
   * @return sub
   **/
  @Schema(description = "Subject - Identifier for the End-User at the Issuer.")
  
    public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public OpenidPersonRecord name(String name) {
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

  public OpenidPersonRecord givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Given name(s) or first name(s) of the End-User. Note that in some cultures, people can have multiple given names; all can be present, with the names being separated by space characters.
   * @return givenName
   **/
  @Schema(description = "Given name(s) or first name(s) of the End-User. Note that in some cultures, people can have multiple given names; all can be present, with the names being separated by space characters.")
  
    public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public OpenidPersonRecord familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Surname(s) or last name(s) of the End-User. Note that in some cultures, people can have multiple family names or no family name; all can be present, with the names being separated by space characters.
   * @return familyName
   **/
  @Schema(description = "Surname(s) or last name(s) of the End-User. Note that in some cultures, people can have multiple family names or no family name; all can be present, with the names being separated by space characters.")
  
    public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public OpenidPersonRecord middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Middle name(s) of the End-User. Note that in some cultures, people can have multiple middle names; all can be present, with the names being separated by space characters. Also note that in some cultures, middle names are not used.
   * @return middleName
   **/
  @Schema(description = "Middle name(s) of the End-User. Note that in some cultures, people can have multiple middle names; all can be present, with the names being separated by space characters. Also note that in some cultures, middle names are not used.")
  
    public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public OpenidPersonRecord nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Casual name of the End-User that may or may not be the same as the given_name. For instance, a nickname value of Mike might be returned alongside a given_name value of Michael.
   * @return nickname
   **/
  @Schema(description = "Casual name of the End-User that may or may not be the same as the given_name. For instance, a nickname value of Mike might be returned alongside a given_name value of Michael.")
  
    public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public OpenidPersonRecord preferredUsername(String preferredUsername) {
    this.preferredUsername = preferredUsername;
    return this;
  }

  /**
   * Shorthand name by which the End-User wishes to be referred to at the RP, such as janedoe or j.doe. This value MAY be any valid JSON string including special characters such as @, /, or whitespace. The RP MUST NOT rely upon this value being unique, as discussed in
   * @return preferredUsername
   **/
  @Schema(description = "Shorthand name by which the End-User wishes to be referred to at the RP, such as janedoe or j.doe. This value MAY be any valid JSON string including special characters such as @, /, or whitespace. The RP MUST NOT rely upon this value being unique, as discussed in")
  
    public String getPreferredUsername() {
    return preferredUsername;
  }

  public void setPreferredUsername(String preferredUsername) {
    this.preferredUsername = preferredUsername;
  }

  public OpenidPersonRecord profile(String profile) {
    this.profile = profile;
    return this;
  }

  /**
   * URL of the End-User's profile page. The contents of this Web page SHOULD be about the End-User.
   * @return profile
   **/
  @Schema(description = "URL of the End-User's profile page. The contents of this Web page SHOULD be about the End-User.")
  
    public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public OpenidPersonRecord picture(String picture) {
    this.picture = picture;
    return this;
  }

  /**
   * URL of the End-User's profile picture. This URL MUST refer to an image file (for example, a PNG, JPEG, or GIF image file), rather than to a Web page containing an image. Note that this URL SHOULD specifically reference a profile photo of the End-User suitable for displaying when describing the End-User, rather than an arbitrary photo taken by the End-User.
   * @return picture
   **/
  @Schema(description = "URL of the End-User's profile picture. This URL MUST refer to an image file (for example, a PNG, JPEG, or GIF image file), rather than to a Web page containing an image. Note that this URL SHOULD specifically reference a profile photo of the End-User suitable for displaying when describing the End-User, rather than an arbitrary photo taken by the End-User.")
  
    public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public OpenidPersonRecord website(String website) {
    this.website = website;
    return this;
  }

  /**
   * URL of the End-User's Web page or blog. This Web page SHOULD contain information published by the End-User or an organization that the End-User is affiliated with.
   * @return website
   **/
  @Schema(description = "URL of the End-User's Web page or blog. This Web page SHOULD contain information published by the End-User or an organization that the End-User is affiliated with.")
  
    public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public OpenidPersonRecord email(String email) {
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

  public OpenidPersonRecord emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

  /**
   * address was controlled by the End-User at the time the verification was performed. The means by which an e-mail address is verified is context-specific, and dependent upon the trust framework or contractual agreements within which the parties are operating.
   * @return emailVerified
   **/
  @Schema(description = "address was controlled by the End-User at the time the verification was performed. The means by which an e-mail address is verified is context-specific, and dependent upon the trust framework or contractual agreements within which the parties are operating.")
  
    public Boolean isEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public OpenidPersonRecord gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * End-User's gender. Values defined by this specification are female and male. Other values MAY be used when neither of the defined values are applicable.
   * @return gender
   **/
  @Schema(description = "End-User's gender. Values defined by this specification are female and male. Other values MAY be used when neither of the defined values are applicable.")
  
    public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public OpenidPersonRecord birthdate(String birthdate) {
    this.birthdate = birthdate;
    return this;
  }

  /**
   * YYYY format is allowed. Note that depending on the underlying platform's date related function, providing just year can result in varying month and day, so the implementers need to take this factor into account to correctly process the dates.
   * @return birthdate
   **/
  @Schema(description = "YYYY format is allowed. Note that depending on the underlying platform's date related function, providing just year can result in varying month and day, so the implementers need to take this factor into account to correctly process the dates.")
  
    public String getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }

  public OpenidPersonRecord placeOfBirth(Object placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
    return this;
  }

  /**
   * End-User's place of birth. The value of this member is a JSON structure containing some or all of the following members
   * @return placeOfBirth
   **/
  @Schema(description = "End-User's place of birth. The value of this member is a JSON structure containing some or all of the following members")
  
    public Object getPlaceOfBirth() {
    return placeOfBirth;
  }

  public void setPlaceOfBirth(Object placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public OpenidPersonRecord deathdate(String deathdate) {
    this.deathdate = deathdate;
    return this;
  }

  /**
   * YYYY format is allowed. Note that depending on the underlying platform's date related function, providing just year can result in varying month and day, so the implementers need to take this factor into account to correctly process the dates.
   * @return deathdate
   **/
  @Schema(description = "YYYY format is allowed. Note that depending on the underlying platform's date related function, providing just year can result in varying month and day, so the implementers need to take this factor into account to correctly process the dates.")
  
    public String getDeathdate() {
    return deathdate;
  }

  public void setDeathdate(String deathdate) {
    this.deathdate = deathdate;
  }

  public OpenidPersonRecord placeOfDeath(Object placeOfDeath) {
    this.placeOfDeath = placeOfDeath;
    return this;
  }

  /**
   * End-User's place of birth. The value of this member is a JSON structure containing some or all of the following members
   * @return placeOfDeath
   **/
  @Schema(description = "End-User's place of birth. The value of this member is a JSON structure containing some or all of the following members")
  
    public Object getPlaceOfDeath() {
    return placeOfDeath;
  }

  public void setPlaceOfDeath(Object placeOfDeath) {
    this.placeOfDeath = placeOfDeath;
  }

  public OpenidPersonRecord phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * number contains an extension, it is RECOMMENDED that the extension be represented using the RFC 3966 [RFC3966] extension syntax, for example, +1 (604) 555-1234;ext=5678.
   * @return phoneNumber
   **/
  @Schema(description = "number contains an extension, it is RECOMMENDED that the extension be represented using the RFC 3966 [RFC3966] extension syntax, for example, +1 (604) 555-1234;ext=5678.")
  
    public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public OpenidPersonRecord phoneNumberVerified(String phoneNumberVerified) {
    this.phoneNumberVerified = phoneNumberVerified;
    return this;
  }

  /**
   * True if the End-User's phone number has been verified; otherwise false. When this Claim Value is true, this means that the OP took affirmative steps to ensure that this phone number was controlled by the End-User at the time the verification was performed. The means by which a phone number is verified is context-specific, and dependent upon the trust framework or contractual agreements within which the parties are operating. When true, the phone_number Claim MUST be in E.164 format and any extensions MUST be represented in RFC 3966 format.
   * @return phoneNumberVerified
   **/
  @Schema(description = "True if the End-User's phone number has been verified; otherwise false. When this Claim Value is true, this means that the OP took affirmative steps to ensure that this phone number was controlled by the End-User at the time the verification was performed. The means by which a phone number is verified is context-specific, and dependent upon the trust framework or contractual agreements within which the parties are operating. When true, the phone_number Claim MUST be in E.164 format and any extensions MUST be represented in RFC 3966 format.")
  
    public String getPhoneNumberVerified() {
    return phoneNumberVerified;
  }

  public void setPhoneNumberVerified(String phoneNumberVerified) {
    this.phoneNumberVerified = phoneNumberVerified;
  }

  public OpenidPersonRecord address(OpenidAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(description = "")
  
    @Valid
    public OpenidAddress getAddress() {
    return address;
  }

  public void setAddress(OpenidAddress address) {
    this.address = address;
  }

  public OpenidPersonRecord zoneinfo(String zoneinfo) {
    this.zoneinfo = zoneinfo;
    return this;
  }

  /**
   * String from zoneinfo [zoneinfo] time zone database representing the End-User's time zone. For example, Europe/Paris or America/Los_Angeles.
   * @return zoneinfo
   **/
  @Schema(description = "String from zoneinfo [zoneinfo] time zone database representing the End-User's time zone. For example, Europe/Paris or America/Los_Angeles.")
  
    public String getZoneinfo() {
    return zoneinfo;
  }

  public void setZoneinfo(String zoneinfo) {
    this.zoneinfo = zoneinfo;
  }

  public OpenidPersonRecord locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Alpha-2 [ISO3166‑1] country code in uppercase, separated by a dash. For example, en-US or fr-CA. As a compatibility note, some implementations have used an underscore as the separator rather than a dash, for example, en_US; Relying Parties MAY choose to accept this locale syntax as well.
   * @return locale
   **/
  @Schema(description = "Alpha-2 [ISO3166‑1] country code in uppercase, separated by a dash. For example, en-US or fr-CA. As a compatibility note, some implementations have used an underscore as the separator rather than a dash, for example, en_US; Relying Parties MAY choose to accept this locale syntax as well.")
  
    public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public OpenidPersonRecord nationalities(List<String> nationalities) {
    this.nationalities = nationalities;
    return this;
  }

  public OpenidPersonRecord addNationalitiesItem(String nationalitiesItem) {
    if (this.nationalities == null) {
      this.nationalities = new ArrayList<String>();
    }
    this.nationalities.add(nationalitiesItem);
    return this;
  }

  /**
   * End-User's nationalities using ICAO 3-letter codes [ICAO-Doc9303], e.g., \"USA\" or \"JPN\". 2-letter ICAO codes MAY be used in some circumstances for compatibility reasons.
   * @return nationalities
   **/
  @Schema(description = "End-User's nationalities using ICAO 3-letter codes [ICAO-Doc9303], e.g., \"USA\" or \"JPN\". 2-letter ICAO codes MAY be used in some circumstances for compatibility reasons.")
  
    public List<String> getNationalities() {
    return nationalities;
  }

  public void setNationalities(List<String> nationalities) {
    this.nationalities = nationalities;
  }

  public OpenidPersonRecord updatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time the End-User's information was last updated. Its value is a JSON number representing the number of seconds from 1970-01-01T0:0:0Z as measured in UTC until the date/time
   * @return updatedAt
   **/
  @Schema(description = "Time the End-User's information was last updated. Its value is a JSON number representing the number of seconds from 1970-01-01T0:0:0Z as measured in UTC until the date/time")
  
    @Valid
    public BigDecimal getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
  }

  public OpenidPersonRecord birthFamilyName(String birthFamilyName) {
    this.birthFamilyName = birthFamilyName;
    return this;
  }

  /**
   * End-User's family name(s) when they were born, or at least from the time they were a child. This term can be used by a person who changes the family name later in life for any reason. Note that in some cultures, people can have multiple family names or no family name; all can be present, with the names being separated by space characters.
   * @return birthFamilyName
   **/
  @Schema(description = "End-User's family name(s) when they were born, or at least from the time they were a child. This term can be used by a person who changes the family name later in life for any reason. Note that in some cultures, people can have multiple family names or no family name; all can be present, with the names being separated by space characters.")
  
    public String getBirthFamilyName() {
    return birthFamilyName;
  }

  public void setBirthFamilyName(String birthFamilyName) {
    this.birthFamilyName = birthFamilyName;
  }

  public OpenidPersonRecord birthGivenName(String birthGivenName) {
    this.birthGivenName = birthGivenName;
    return this;
  }

  /**
   * End-User's given name(s) when they were born, or at least from the time they were a child. This term can be used by a person who changes the given name later in life for any reason. Note that in some cultures, people can have multiple given names; all can be present, with the names being separated by space characters.
   * @return birthGivenName
   **/
  @Schema(description = "End-User's given name(s) when they were born, or at least from the time they were a child. This term can be used by a person who changes the given name later in life for any reason. Note that in some cultures, people can have multiple given names; all can be present, with the names being separated by space characters.")
  
    public String getBirthGivenName() {
    return birthGivenName;
  }

  public void setBirthGivenName(String birthGivenName) {
    this.birthGivenName = birthGivenName;
  }

  public OpenidPersonRecord birthMiddleName(String birthMiddleName) {
    this.birthMiddleName = birthMiddleName;
    return this;
  }

  /**
   * End-User's middle name(s) when they were born, or at least from the time they were a child. This term can be used by a person who changes the middle name later in life for any reason. Note that in some cultures, people can have multiple middle names; all can be present, with the names being separated by space characters. Also note that in some cultures, middle names are not used.
   * @return birthMiddleName
   **/
  @Schema(description = "End-User's middle name(s) when they were born, or at least from the time they were a child. This term can be used by a person who changes the middle name later in life for any reason. Note that in some cultures, people can have multiple middle names; all can be present, with the names being separated by space characters. Also note that in some cultures, middle names are not used.")
  
    public String getBirthMiddleName() {
    return birthMiddleName;
  }

  public void setBirthMiddleName(String birthMiddleName) {
    this.birthMiddleName = birthMiddleName;
  }

  public OpenidPersonRecord salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

  /**
   * End-User's salutation, e.g., \"Mr.\"
   * @return salutation
   **/
  @Schema(description = "End-User's salutation, e.g., \"Mr.\"")
  
    public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public OpenidPersonRecord title(String title) {
    this.title = title;
    return this;
  }

  /**
   * End-User's title, e.g., \"Dr.\"
   * @return title
   **/
  @Schema(description = "End-User's title, e.g., \"Dr.\"")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OpenidPersonRecord msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

  /**
   * End-User's mobile phone number formatted according to ITU-T recommendation [E.164], e.g., \"1999550123\"
   * @return msisdn
   **/
  @Schema(description = "End-User's mobile phone number formatted according to ITU-T recommendation [E.164], e.g., \"1999550123\"")
  
    public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public OpenidPersonRecord alsoKnownAs(String alsoKnownAs) {
    this.alsoKnownAs = alsoKnownAs;
    return this;
  }

  /**
   * Stage name, religious name or any other type of alias/pseudonym with which a person is known in a specific context besides its legal name. This must be part of the applicable legislation and thus the trust framework (e.g., be an attribute on the identity card).
   * @return alsoKnownAs
   **/
  @Schema(description = "Stage name, religious name or any other type of alias/pseudonym with which a person is known in a specific context besides its legal name. This must be part of the applicable legislation and thus the trust framework (e.g., be an attribute on the identity card).")
  
    public String getAlsoKnownAs() {
    return alsoKnownAs;
  }

  public void setAlsoKnownAs(String alsoKnownAs) {
    this.alsoKnownAs = alsoKnownAs;
  }

  public OpenidPersonRecord additionalAttributes(AttributeNameValueList additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  /**
   * Get additionalAttributes
   * @return additionalAttributes
   **/
  @Schema(description = "")
  
    @Valid
    public AttributeNameValueList getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(AttributeNameValueList additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenidPersonRecord openidPersonRecord = (OpenidPersonRecord) o;
    return Objects.equals(this.sub, openidPersonRecord.sub) &&
        Objects.equals(this.name, openidPersonRecord.name) &&
        Objects.equals(this.givenName, openidPersonRecord.givenName) &&
        Objects.equals(this.familyName, openidPersonRecord.familyName) &&
        Objects.equals(this.middleName, openidPersonRecord.middleName) &&
        Objects.equals(this.nickname, openidPersonRecord.nickname) &&
        Objects.equals(this.preferredUsername, openidPersonRecord.preferredUsername) &&
        Objects.equals(this.profile, openidPersonRecord.profile) &&
        Objects.equals(this.picture, openidPersonRecord.picture) &&
        Objects.equals(this.website, openidPersonRecord.website) &&
        Objects.equals(this.email, openidPersonRecord.email) &&
        Objects.equals(this.emailVerified, openidPersonRecord.emailVerified) &&
        Objects.equals(this.gender, openidPersonRecord.gender) &&
        Objects.equals(this.birthdate, openidPersonRecord.birthdate) &&
        Objects.equals(this.placeOfBirth, openidPersonRecord.placeOfBirth) &&
        Objects.equals(this.deathdate, openidPersonRecord.deathdate) &&
        Objects.equals(this.placeOfDeath, openidPersonRecord.placeOfDeath) &&
        Objects.equals(this.phoneNumber, openidPersonRecord.phoneNumber) &&
        Objects.equals(this.phoneNumberVerified, openidPersonRecord.phoneNumberVerified) &&
        Objects.equals(this.address, openidPersonRecord.address) &&
        Objects.equals(this.zoneinfo, openidPersonRecord.zoneinfo) &&
        Objects.equals(this.locale, openidPersonRecord.locale) &&
        Objects.equals(this.nationalities, openidPersonRecord.nationalities) &&
        Objects.equals(this.updatedAt, openidPersonRecord.updatedAt) &&
        Objects.equals(this.birthFamilyName, openidPersonRecord.birthFamilyName) &&
        Objects.equals(this.birthGivenName, openidPersonRecord.birthGivenName) &&
        Objects.equals(this.birthMiddleName, openidPersonRecord.birthMiddleName) &&
        Objects.equals(this.salutation, openidPersonRecord.salutation) &&
        Objects.equals(this.title, openidPersonRecord.title) &&
        Objects.equals(this.msisdn, openidPersonRecord.msisdn) &&
        Objects.equals(this.alsoKnownAs, openidPersonRecord.alsoKnownAs) &&
        Objects.equals(this.additionalAttributes, openidPersonRecord.additionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sub, name, givenName, familyName, middleName, nickname, preferredUsername, profile, picture, website, email, emailVerified, gender, birthdate, placeOfBirth, deathdate, placeOfDeath, phoneNumber, phoneNumberVerified, address, zoneinfo, locale, nationalities, updatedAt, birthFamilyName, birthGivenName, birthMiddleName, salutation, title, msisdn, alsoKnownAs, additionalAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenidPersonRecord {\n");
    
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    preferredUsername: ").append(toIndentedString(preferredUsername)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    deathdate: ").append(toIndentedString(deathdate)).append("\n");
    sb.append("    placeOfDeath: ").append(toIndentedString(placeOfDeath)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberVerified: ").append(toIndentedString(phoneNumberVerified)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    zoneinfo: ").append(toIndentedString(zoneinfo)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    nationalities: ").append(toIndentedString(nationalities)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    birthFamilyName: ").append(toIndentedString(birthFamilyName)).append("\n");
    sb.append("    birthGivenName: ").append(toIndentedString(birthGivenName)).append("\n");
    sb.append("    birthMiddleName: ").append(toIndentedString(birthMiddleName)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    alsoKnownAs: ").append(toIndentedString(alsoKnownAs)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
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
