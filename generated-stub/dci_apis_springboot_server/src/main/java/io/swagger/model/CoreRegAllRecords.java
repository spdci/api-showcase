package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* 1. Records retured as response to search/subsribe actions to exchange registry data  2. record_type acts as namespace to define record being retunred for receiving system to unmarshel and use 3. Objects are defined in respecitive schemas definition with entity/org namespace as prefix 3. Implementing systems shall reference to the requires objects based on the context of these API usage 
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = CivilRegPersonRecord.class, name = "CivilRegPersonRecord"),
  @JsonSubTypes.Type(value = DciPersonRecord.class, name = "DciPersonRecord"),
  @JsonSubTypes.Type(value = NidResidentRecord.class, name = "NidResidentRecord"),
  @JsonSubTypes.Type(value = NidDeceasedRecord.class, name = "NidDeceasedRecord"),
  @JsonSubTypes.Type(value = MosipRegistrationRecord.class, name = "MosipRegistrationRecord"),
  @JsonSubTypes.Type(value = MosipMOSIPVerifiableCredential.class, name = "MosipMOSIPVerifiableCredential")
})
public interface CoreRegAllRecords {

}
