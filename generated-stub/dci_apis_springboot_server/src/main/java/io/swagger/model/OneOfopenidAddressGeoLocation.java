package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfopenidAddressGeoLocation
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = LatLong.class, name = "LatLong"),
  @JsonSubTypes.Type(value = GooglePlusCode.class, name = "GooglePlusCode")
})
public interface OneOfopenidAddressGeoLocation {

}
