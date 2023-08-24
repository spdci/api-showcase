package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOftxnStatusBodyMessage
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = TxnStatusRequest.class, name = "TxnStatusRequest"),
  @JsonSubTypes.Type(value = EncryptedMessage.class, name = "EncryptedMessage")
})
public interface OneOftxnStatusBodyMessage {

}
