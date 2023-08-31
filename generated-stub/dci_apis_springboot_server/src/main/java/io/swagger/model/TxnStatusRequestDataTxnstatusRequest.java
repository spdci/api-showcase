package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TxnStatusRequestDataTxnstatusRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class TxnStatusRequestDataTxnstatusRequest   {
  @JsonProperty("reference_id")
  private String referenceId = null;

  /**
   * Gets or Sets searchType
   */
  public enum SearchTypeEnum {
    TRANSACTION_ID("transaction_id"),
    
    REFERENCE_ID_LIST("reference_id_list");

    private String value;

    SearchTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SearchTypeEnum fromValue(String text) {
      for (SearchTypeEnum b : SearchTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("search_type")
  private SearchTypeEnum searchType = null;

  @JsonProperty("search_attribute")
  private OneOfTxnStatusRequestDataTxnstatusRequestSearchAttribute searchAttribute = null;

  @JsonProperty("locale")
  private String locale = null;

  public TxnStatusRequestDataTxnstatusRequest referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Unique reference_id set by txn initiating system for each request in a batch
   * @return referenceId
   **/
  @Schema(example = "12345678901234567890", required = true, description = "Unique reference_id set by txn initiating system for each request in a batch")
      @NotNull

    public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public TxnStatusRequestDataTxnstatusRequest searchType(SearchTypeEnum searchType) {
    this.searchType = searchType;
    return this;
  }

  /**
   * Get searchType
   * @return searchType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public SearchTypeEnum getSearchType() {
    return searchType;
  }

  public void setSearchType(SearchTypeEnum searchType) {
    this.searchType = searchType;
  }

  public TxnStatusRequestDataTxnstatusRequest searchAttribute(OneOfTxnStatusRequestDataTxnstatusRequestSearchAttribute searchAttribute) {
    this.searchAttribute = searchAttribute;
    return this;
  }

  /**
   * Get searchAttribute
   * @return searchAttribute
   **/
  @Schema(required = true, description = "")
      @NotNull

    public OneOfTxnStatusRequestDataTxnstatusRequestSearchAttribute getSearchAttribute() {
    return searchAttribute;
  }

  public void setSearchAttribute(OneOfTxnStatusRequestDataTxnstatusRequestSearchAttribute searchAttribute) {
    this.searchAttribute = searchAttribute;
  }

  public TxnStatusRequestDataTxnstatusRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * indicates language code. G2P Connect supports country codes as per ISO 639.3 standard
   * @return locale
   **/
  @Schema(example = "en", description = "indicates language code. G2P Connect supports country codes as per ISO 639.3 standard")
  
  @Pattern(regexp="^[a-z]{3,3}$")   public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxnStatusRequestDataTxnstatusRequest txnStatusRequestDataTxnstatusRequest = (TxnStatusRequestDataTxnstatusRequest) o;
    return Objects.equals(this.referenceId, txnStatusRequestDataTxnstatusRequest.referenceId) &&
        Objects.equals(this.searchType, txnStatusRequestDataTxnstatusRequest.searchType) &&
        Objects.equals(this.searchAttribute, txnStatusRequestDataTxnstatusRequest.searchAttribute) &&
        Objects.equals(this.locale, txnStatusRequestDataTxnstatusRequest.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, searchType, searchAttribute, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxnStatusRequestDataTxnstatusRequest {\n");
    
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
    sb.append("    searchAttribute: ").append(toIndentedString(searchAttribute)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
