package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfregistryNotifyBodyMessage
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = NotifyEventRequest.class, name = "NotifyEventRequest"),
  @JsonSubTypes.Type(value = EncryptedMessage.class, name = "EncryptedMessage")
})
public interface OneOfregistryNotifyBodyMessage {

}
