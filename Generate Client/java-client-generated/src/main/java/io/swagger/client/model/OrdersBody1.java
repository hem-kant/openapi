/*
 * Shop Online APIs Definition
 * ## About Us  Using this `OpenAPI specification`, any consumer can understand the _APIs_ that are exposed by the ***Shop-Online*** team.  # Product Categories    - Mobiles      - Apple      - Samsung      - OnePlus    - Laptops    - Watches    - Accessories       - TV      - Home Appliances 
 *
 * OpenAPI spec version: 0.0.1
 * Contact: hemkant.india@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Address;
import io.swagger.client.model.Products;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * OrdersBody1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-30T12:56:11.764Z[GMT]")
public class OrdersBody1 {
  @SerializedName("products")
  private List<Products> products = null;

  @SerializedName("address")
  private Address address = null;

  public OrdersBody1 products(List<Products> products) {
    this.products = products;
    return this;
  }

  public OrdersBody1 addProductsItem(Products productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<Products>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @Schema(description = "")
  public List<Products> getProducts() {
    return products;
  }

  public void setProducts(List<Products> products) {
    this.products = products;
  }

  public OrdersBody1 address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
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
    OrdersBody1 ordersBody1 = (OrdersBody1) o;
    return Objects.equals(this.products, ordersBody1.products) &&
        Objects.equals(this.address, ordersBody1.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersBody1 {\n");
    
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
