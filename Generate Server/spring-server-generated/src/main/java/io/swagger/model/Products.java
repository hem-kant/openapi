package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Products
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-30T12:42:14.200Z[GMT]")


public class Products   {
  @JsonProperty("productId")
  private Integer productId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("price")
  private Float price = null;

  @JsonProperty("categoryName")
  private String categoryName = null;

  @JsonProperty("releseDate")
  private LocalDate releseDate = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  public Products productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
   **/
  @Schema(description = "")
  
    public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public Products name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Products price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(description = "")
  
    public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public Products categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * Get categoryName
   * @return categoryName
   **/
  @Schema(description = "")
  
    public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public Products releseDate(LocalDate releseDate) {
    this.releseDate = releseDate;
    return this;
  }

  /**
   * Get releseDate
   * @return releseDate
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
    @Valid
    public LocalDate getReleseDate() {
    return releseDate;
  }

  public void setReleseDate(LocalDate releseDate) {
    this.releseDate = releseDate;
  }

  public Products quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * ***Quantity*** represents `stock` value when this field is being sent by OnlineShope.Where as in the scenarios of consumer sending this feild, it represents `number of product items` inside the order. Consumers are expected to handle the scenario of stopping the end user <u>*when the stock value is 0*</u>  
   * @return quantity
   **/
  @Schema(description = "***Quantity*** represents `stock` value when this field is being sent by OnlineShope.Where as in the scenarios of consumer sending this feild, it represents `number of product items` inside the order. Consumers are expected to handle the scenario of stopping the end user <u>*when the stock value is 0*</u>  ")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Products products = (Products) o;
    return Objects.equals(this.productId, products.productId) &&
        Objects.equals(this.name, products.name) &&
        Objects.equals(this.price, products.price) &&
        Objects.equals(this.categoryName, products.categoryName) &&
        Objects.equals(this.releseDate, products.releseDate) &&
        Objects.equals(this.quantity, products.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, name, price, categoryName, releseDate, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Products {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    releseDate: ").append(toIndentedString(releseDate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
