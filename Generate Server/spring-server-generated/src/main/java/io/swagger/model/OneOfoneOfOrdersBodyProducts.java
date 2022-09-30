package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfoneOfOrdersBodyProducts
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = Mobiles.class, name = "Mobiles"),
  @JsonSubTypes.Type(value = Laptops.class, name = "Laptops")
})
public interface OneOfoneOfOrdersBodyProducts {

}
