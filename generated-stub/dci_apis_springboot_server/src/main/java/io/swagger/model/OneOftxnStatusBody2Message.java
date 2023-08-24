package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOftxnStatusBody2Message
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = TxnStatusRequest.class, name = "TxnStatusRequest"),
  @JsonSubTypes.Type(value = EncryptedMessage.class, name = "EncryptedMessage")
})
public interface OneOftxnStatusBody2Message {

}
