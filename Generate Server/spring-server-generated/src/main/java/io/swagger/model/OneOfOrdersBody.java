package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Address;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OneOfOrdersBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-30T12:42:14.200Z[GMT]")


public class OneOfOrdersBody   {
  @JsonProperty("products")
  private OneOfoneOfOrdersBodyProducts products = null;

  @JsonProperty("address")
  private Address address = null;

  public OneOfOrdersBody products(OneOfoneOfOrdersBodyProducts products) {
    this.products = products;
    return this;
  }

  /**
   * Get products
   * @return products
   **/
  @Schema(required = true, description = "")
      @NotNull

    public OneOfoneOfOrdersBodyProducts getProducts() {
    return products;
  }

  public void setProducts(OneOfoneOfOrdersBodyProducts products) {
    this.products = products;
  }

  public OneOfOrdersBody address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneOfOrdersBody oneOfOrdersBody = (OneOfOrdersBody) o;
    return Objects.equals(this.products, oneOfOrdersBody.products) &&
        Objects.equals(this.address, oneOfOrdersBody.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneOfOrdersBody {\n");
    
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
