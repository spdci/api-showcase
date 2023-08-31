package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MsgHeaderStatusReasonCode;
import io.swagger.model.RequestStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Message header
 */
@Schema(description = "Message header")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-28T12:47:18.932973955Z[GMT]")


public class MsgCallbackHeaderV100   {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("message_id")
  private String messageId = null;

  @JsonProperty("message_ts")
  private OffsetDateTime messageTs = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("status")
  private RequestStatus status = null;

  @JsonProperty("status_reason_code")
  private MsgHeaderStatusReasonCode statusReasonCode = null;

  @JsonProperty("status_reason_message")
  private String statusReasonMessage = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("completed_count")
  private Integer completedCount = null;

  @JsonProperty("sender_id")
  private String senderId = null;

  @JsonProperty("receiver_id")
  private String receiverId = null;

  @JsonProperty("encryption_algo")
  private String encryptionAlgo = null;

  public MsgCallbackHeaderV100 version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Messaing protocol specification version being used
   * @return version
   **/
  @Schema(example = "0.1.0", description = "Messaing protocol specification version being used")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public MsgCallbackHeaderV100 messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * 1. Unique message id to communicate between sender and receiver systems to realiable deliver the message over any transport layer i.e https, pub/sub, sftp etc., 2. The scope of message_id end with successful ack of the message by the receiver. 3. To realy the message between hops, underlying relying parties may consider to store and forward the message with integirty, ie Signature intact. 
   * @return messageId
   **/
  @Schema(example = "789", required = true, description = "1. Unique message id to communicate between sender and receiver systems to realiable deliver the message over any transport layer i.e https, pub/sub, sftp etc., 2. The scope of message_id end with successful ack of the message by the receiver. 3. To realy the message between hops, underlying relying parties may consider to store and forward the message with integirty, ie Signature intact. ")
      @NotNull

    public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public MsgCallbackHeaderV100 messageTs(OffsetDateTime messageTs) {
    this.messageTs = messageTs;
    return this;
  }

  /**
   * 1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. 
   * @return messageTs
   **/
  @Schema(required = true, description = "1. All dates and timestamps are represented in [ISO 8601](https://www.iso.org/standard/40874.html) format including timezone - e.g 2022-12-04T17:20:07-04:00. ")
      @NotNull

    @Valid
    public OffsetDateTime getMessageTs() {
    return messageTs;
  }

  public void setMessageTs(OffsetDateTime messageTs) {
    this.messageTs = messageTs;
  }

  public MsgCallbackHeaderV100 action(String action) {
    this.action = action;
    return this;
  }

  /**
   * G2P Connect specific action. Usually verb from the URI should go here to help store and fwd kind of processing requirements.
   * @return action
   **/
  @Schema(required = true, description = "G2P Connect specific action. Usually verb from the URI should go here to help store and fwd kind of processing requirements.")
      @NotNull

    public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public MsgCallbackHeaderV100 status(RequestStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public RequestStatus getStatus() {
    return status;
  }

  public void setStatus(RequestStatus status) {
    this.status = status;
  }

  public MsgCallbackHeaderV100 statusReasonCode(MsgHeaderStatusReasonCode statusReasonCode) {
    this.statusReasonCode = statusReasonCode;
    return this;
  }

  /**
   * Get statusReasonCode
   * @return statusReasonCode
   **/
  @Schema(description = "")
  
    @Valid
    public MsgHeaderStatusReasonCode getStatusReasonCode() {
    return statusReasonCode;
  }

  public void setStatusReasonCode(MsgHeaderStatusReasonCode statusReasonCode) {
    this.statusReasonCode = statusReasonCode;
  }

  public MsgCallbackHeaderV100 statusReasonMessage(String statusReasonMessage) {
    this.statusReasonMessage = statusReasonMessage;
    return this;
  }

  /**
   * Status reascon code message, if any, Helps actionanble messaging for system/end users
   * @return statusReasonMessage
   **/
  @Schema(description = "Status reascon code message, if any, Helps actionanble messaging for system/end users")
  
  @Size(max=999)   public String getStatusReasonMessage() {
    return statusReasonMessage;
  }

  public void setStatusReasonMessage(String statusReasonMessage) {
    this.statusReasonMessage = statusReasonMessage;
  }

  public MsgCallbackHeaderV100 totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total no of requests present in the message request
   * @return totalCount
   **/
  @Schema(example = "21800", description = "Total no of requests present in the message request")
  
    public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public MsgCallbackHeaderV100 completedCount(Integer completedCount) {
    this.completedCount = completedCount;
    return this;
  }

  /**
   * No of requests in complteed state. Complete includes success and error requests due to funcational errors
   * @return completedCount
   **/
  @Schema(example = "50", description = "No of requests in complteed state. Complete includes success and error requests due to funcational errors")
  
    public Integer getCompletedCount() {
    return completedCount;
  }

  public void setCompletedCount(Integer completedCount) {
    this.completedCount = completedCount;
  }

  public MsgCallbackHeaderV100 senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }

  /**
   * 1. sender_id registered with the receiving system or gateway.  2. Used for authorization, encryption, digital sign verfication, etc.,  
   * @return senderId
   **/
  @Schema(example = "civilregistry.example.org", description = "1. sender_id registered with the receiving system or gateway.  2. Used for authorization, encryption, digital sign verfication, etc.,  ")
  
    public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public MsgCallbackHeaderV100 receiverId(String receiverId) {
    this.receiverId = receiverId;
    return this;
  }

  /**
   * receiver id registered with the calling system. Used for authorization, encryption, digital sign verfication, etc., functions.
   * @return receiverId
   **/
  @Schema(example = "registry.example.org", description = "receiver id registered with the calling system. Used for authorization, encryption, digital sign verfication, etc., functions.")
  
    public String getReceiverId() {
    return receiverId;
  }

  public void setReceiverId(String receiverId) {
    this.receiverId = receiverId;
  }

  public MsgCallbackHeaderV100 encryptionAlgo(String encryptionAlgo) {
    this.encryptionAlgo = encryptionAlgo;
    return this;
  }

  /**
   * 1. If message is encrypted, Ecnryption alog used for receiver to decrypt the message payload 2. example: aes, rsa, aes_rsa, ecc, other 
   * @return encryptionAlgo
   **/
  @Schema(example = "[\"aes\",\"rsa\",\"aes+rsa\",\"ecc\",\"other\"]", description = "1. If message is encrypted, Ecnryption alog used for receiver to decrypt the message payload 2. example: aes, rsa, aes_rsa, ecc, other ")
  
    public String getEncryptionAlgo() {
    return encryptionAlgo;
  }

  public void setEncryptionAlgo(String encryptionAlgo) {
    this.encryptionAlgo = encryptionAlgo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MsgCallbackHeaderV100 msgCallbackHeaderV100 = (MsgCallbackHeaderV100) o;
    return Objects.equals(this.version, msgCallbackHeaderV100.version) &&
        Objects.equals(this.messageId, msgCallbackHeaderV100.messageId) &&
        Objects.equals(this.messageTs, msgCallbackHeaderV100.messageTs) &&
        Objects.equals(this.action, msgCallbackHeaderV100.action) &&
        Objects.equals(this.status, msgCallbackHeaderV100.status) &&
        Objects.equals(this.statusReasonCode, msgCallbackHeaderV100.statusReasonCode) &&
        Objects.equals(this.statusReasonMessage, msgCallbackHeaderV100.statusReasonMessage) &&
        Objects.equals(this.totalCount, msgCallbackHeaderV100.totalCount) &&
        Objects.equals(this.completedCount, msgCallbackHeaderV100.completedCount) &&
        Objects.equals(this.senderId, msgCallbackHeaderV100.senderId) &&
        Objects.equals(this.receiverId, msgCallbackHeaderV100.receiverId) &&
        Objects.equals(this.encryptionAlgo, msgCallbackHeaderV100.encryptionAlgo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, messageId, messageTs, action, status, statusReasonCode, statusReasonMessage, totalCount, completedCount, senderId, receiverId, encryptionAlgo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsgCallbackHeaderV100 {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageTs: ").append(toIndentedString(messageTs)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReasonCode: ").append(toIndentedString(statusReasonCode)).append("\n");
    sb.append("    statusReasonMessage: ").append(toIndentedString(statusReasonMessage)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    completedCount: ").append(toIndentedString(completedCount)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    receiverId: ").append(toIndentedString(receiverId)).append("\n");
    sb.append("    encryptionAlgo: ").append(toIndentedString(encryptionAlgo)).append("\n");
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
