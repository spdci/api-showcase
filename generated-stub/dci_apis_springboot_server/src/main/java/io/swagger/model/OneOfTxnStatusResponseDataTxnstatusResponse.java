package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfTxnStatusResponseDataTxnstatusResponse
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = SearchResponse.class, name = "SearchResponse"),
  @JsonSubTypes.Type(value = NotifyEventRequest.class, name = "NotifyEventRequest")
})
public interface OneOfTxnStatusResponseDataTxnstatusResponse {

}
