package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SubscriptionStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UnSubscribeResponseDataSubscriptionStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class UnSubscribeResponseDataSubscriptionStatus   {
  @JsonProperty("subscription_code")
  private String subscriptionCode = null;

  @JsonProperty("subscription_status")
  private SubscriptionStatus subscriptionStatus = null;

  public UnSubscribeResponseDataSubscriptionStatus subscriptionCode(String subscriptionCode) {
    this.subscriptionCode = subscriptionCode;
    return this;
  }

  /**
   * Unique code to ideintiy the subscription request by the entity providing subscription service. Helps to check status, unsubscribe etc., 
   * @return subscriptionCode
   **/
  @Schema(required = true, description = "Unique code to ideintiy the subscription request by the entity providing subscription service. Helps to check status, unsubscribe etc., ")
      @NotNull

  @Size(max=99)   public String getSubscriptionCode() {
    return subscriptionCode;
  }

  public void setSubscriptionCode(String subscriptionCode) {
    this.subscriptionCode = subscriptionCode;
  }

  public UnSubscribeResponseDataSubscriptionStatus subscriptionStatus(SubscriptionStatus subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
    return this;
  }

  /**
   * Get subscriptionStatus
   * @return subscriptionStatus
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SubscriptionStatus getSubscriptionStatus() {
    return subscriptionStatus;
  }

  public void setSubscriptionStatus(SubscriptionStatus subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnSubscribeResponseDataSubscriptionStatus unSubscribeResponseDataSubscriptionStatus = (UnSubscribeResponseDataSubscriptionStatus) o;
    return Objects.equals(this.subscriptionCode, unSubscribeResponseDataSubscriptionStatus.subscriptionCode) &&
        Objects.equals(this.subscriptionStatus, unSubscribeResponseDataSubscriptionStatus.subscriptionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionCode, subscriptionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnSubscribeResponseDataSubscriptionStatus {\n");
    
    sb.append("    subscriptionCode: ").append(toIndentedString(subscriptionCode)).append("\n");
    sb.append("    subscriptionStatus: ").append(toIndentedString(subscriptionStatus)).append("\n");
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
