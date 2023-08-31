package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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


public class MsgHeaderV100   {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("message_id")
  private String messageId = null;

  @JsonProperty("message_ts")
  private OffsetDateTime messageTs = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("sender_id")
  private String senderId = null;

  @JsonProperty("sender_uri")
  private String senderUri = null;

  @JsonProperty("receiver_id")
  private String receiverId = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("encryption_algo")
  private String encryptionAlgo = null;

  public MsgHeaderV100 version(String version) {
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

  public MsgHeaderV100 messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * 1. Unique message id to communicate between sender and receiver systems to realiable deliver the message over any transport layer i.e https, pub/sub, sftp etc., 2. The scope of message_id end with successful ack of the message by the receiver. 3. To realy the message between hops, underlying relying parties may consider to store and forward the message with integirty, ie Signature intact. 
   * @return messageId
   **/
  @Schema(example = "123", required = true, description = "1. Unique message id to communicate between sender and receiver systems to realiable deliver the message over any transport layer i.e https, pub/sub, sftp etc., 2. The scope of message_id end with successful ack of the message by the receiver. 3. To realy the message between hops, underlying relying parties may consider to store and forward the message with integirty, ie Signature intact. ")
      @NotNull

    public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public MsgHeaderV100 messageTs(OffsetDateTime messageTs) {
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

  public MsgHeaderV100 action(String action) {
    this.action = action;
    return this;
  }

  /**
   * G2P Connect specific action. Usually verb from the URI. Helps in sync, async, store/fwd processing. Helps identity payload type in message property.
   * @return action
   **/
  @Schema(required = true, description = "G2P Connect specific action. Usually verb from the URI. Helps in sync, async, store/fwd processing. Helps identity payload type in message property.")
      @NotNull

    public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public MsgHeaderV100 senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }

  /**
   * 1. sender_id registered with the receiving system or gateway.  2. Used for authorization, encryption, digital sign verfication, etc.,  
   * @return senderId
   **/
  @Schema(example = "spp.example.org", required = true, description = "1. sender_id registered with the receiving system or gateway.  2. Used for authorization, encryption, digital sign verfication, etc.,  ")
      @NotNull

    public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public MsgHeaderV100 senderUri(String senderUri) {
    this.senderUri = senderUri;
    return this;
  }

  /**
   * 1. sender url to accept callbacks. Applicable only for async communications and if response ack_status is ACK. 2. Default uri is assumed to be configred on the gateway as part of sender/receiver onboarding.  3. For SFTP based communications, this shall be set to server/folder details. 
   * @return senderUri
   **/
  @Schema(example = "https://spp.example.org/{namespace}/callback/on-search", description = "1. sender url to accept callbacks. Applicable only for async communications and if response ack_status is ACK. 2. Default uri is assumed to be configred on the gateway as part of sender/receiver onboarding.  3. For SFTP based communications, this shall be set to server/folder details. ")
  
    public String getSenderUri() {
    return senderUri;
  }

  public void setSenderUri(String senderUri) {
    this.senderUri = senderUri;
  }

  public MsgHeaderV100 receiverId(String receiverId) {
    this.receiverId = receiverId;
    return this;
  }

  /**
   * receiver id registered with the calling system. Used for authorization, encryption, digital sign verfication, etc., functions.
   * @return receiverId
   **/
  @Schema(example = "pymts.example.org", description = "receiver id registered with the calling system. Used for authorization, encryption, digital sign verfication, etc., functions.")
  
    public String getReceiverId() {
    return receiverId;
  }

  public void setReceiverId(String receiverId) {
    this.receiverId = receiverId;
  }

  public MsgHeaderV100 totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total no of requests present in the message request
   * @return totalCount
   **/
  @Schema(example = "21800", required = true, description = "Total no of requests present in the message request")
      @NotNull

    public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public MsgHeaderV100 encryptionAlgo(String encryptionAlgo) {
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
    MsgHeaderV100 msgHeaderV100 = (MsgHeaderV100) o;
    return Objects.equals(this.version, msgHeaderV100.version) &&
        Objects.equals(this.messageId, msgHeaderV100.messageId) &&
        Objects.equals(this.messageTs, msgHeaderV100.messageTs) &&
        Objects.equals(this.action, msgHeaderV100.action) &&
        Objects.equals(this.senderId, msgHeaderV100.senderId) &&
        Objects.equals(this.senderUri, msgHeaderV100.senderUri) &&
        Objects.equals(this.receiverId, msgHeaderV100.receiverId) &&
        Objects.equals(this.totalCount, msgHeaderV100.totalCount) &&
        Objects.equals(this.encryptionAlgo, msgHeaderV100.encryptionAlgo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, messageId, messageTs, action, senderId, senderUri, receiverId, totalCount, encryptionAlgo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsgHeaderV100 {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageTs: ").append(toIndentedString(messageTs)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    senderUri: ").append(toIndentedString(senderUri)).append("\n");
    sb.append("    receiverId: ").append(toIndentedString(receiverId)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
