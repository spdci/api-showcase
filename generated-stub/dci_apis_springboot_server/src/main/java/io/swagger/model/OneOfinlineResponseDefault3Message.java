package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfinlineResponseDefault3Message
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = TxnStatusResponse.class, name = "TxnStatusResponse"),
  @JsonSubTypes.Type(value = EncryptedMessage.class, name = "EncryptedMessage")
})
public interface OneOfinlineResponseDefault3Message {

}
