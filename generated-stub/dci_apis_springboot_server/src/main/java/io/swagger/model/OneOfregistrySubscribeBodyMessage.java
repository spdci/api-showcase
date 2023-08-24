package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfregistrySubscribeBodyMessage
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = SubscribeRequest.class, name = "SubscribeRequest"),
  @JsonSubTypes.Type(value = EncryptedMessage.class, name = "EncryptedMessage")
})
public interface OneOfregistrySubscribeBodyMessage {

}
