package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* 1. Pre defined query objects injected by each country/org/system to query a registry 2. Implementing systems may create pre-defined query objects based on use cases and inject as custom extensions 3. ExpressionWithConditionList is simple generic search query construct to solve for majority of search conditons. few examples: &lt;br&gt;   - search or subscribe to update events; e.g any updates in postal_code 12345 between 1/jan/2020 and 31/dec/2020   - search or subscribe to birth, death events; e.g any new birth in postal_code 12345 after 1/jan/2023   - search all farmers with land area less than 2 acers in district code 504 
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = DciIdentifierTypeValue.class, name = "DciIdentifierTypeValue"),
  @JsonSubTypes.Type(value = CdpiPersonId.class, name = "CdpiPersonId"),
  @JsonSubTypes.Type(value = ExpressionWithConditionList.class, name = "ExpressionWithConditionList")
})
public interface CoreRegAllQueries {

}
