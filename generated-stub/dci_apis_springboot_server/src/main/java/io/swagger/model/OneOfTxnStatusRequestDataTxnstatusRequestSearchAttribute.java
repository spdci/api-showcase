package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfTxnStatusRequestDataTxnstatusRequestSearchAttribute
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = TransactionId.class, name = "TransactionId"),
  @JsonSubTypes.Type(value = ReferenceIdList.class, name = "ReferenceIdList")
})
public interface OneOfTxnStatusRequestDataTxnstatusRequestSearchAttribute {

}
