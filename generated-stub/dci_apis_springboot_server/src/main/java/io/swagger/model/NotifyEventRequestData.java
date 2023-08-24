package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.NotifyEventRequestDataNotifyEvent;
import io.swagger.model.TransactionId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Registry to notify a event to subscrbiers
 */
@Schema(description = "Registry to notify a event to subscrbiers")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")


public class NotifyEventRequestData   {
  @JsonProperty("transaction_id")
  private TransactionId transactionId = null;

  @JsonProperty("notify_event")
  @Valid
  private List<NotifyEventRequestDataNotifyEvent> notifyEvent = new ArrayList<NotifyEventRequestDataNotifyEvent>();

  public NotifyEventRequestData transactionId(TransactionId transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
  @Size(max=99)   public TransactionId getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(TransactionId transactionId) {
    this.transactionId = transactionId;
  }

  public NotifyEventRequestData notifyEvent(List<NotifyEventRequestDataNotifyEvent> notifyEvent) {
    this.notifyEvent = notifyEvent;
    return this;
  }

  public NotifyEventRequestData addNotifyEventItem(NotifyEventRequestDataNotifyEvent notifyEventItem) {
    this.notifyEvent.add(notifyEventItem);
    return this;
  }

  /**
   * Get notifyEvent
   * @return notifyEvent
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<NotifyEventRequestDataNotifyEvent> getNotifyEvent() {
    return notifyEvent;
  }

  public void setNotifyEvent(List<NotifyEventRequestDataNotifyEvent> notifyEvent) {
    this.notifyEvent = notifyEvent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyEventRequestData notifyEventRequestData = (NotifyEventRequestData) o;
    return Objects.equals(this.transactionId, notifyEventRequestData.transactionId) &&
        Objects.equals(this.notifyEvent, notifyEventRequestData.notifyEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, notifyEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyEventRequestData {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    notifyEvent: ").append(toIndentedString(notifyEvent)).append("\n");
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
