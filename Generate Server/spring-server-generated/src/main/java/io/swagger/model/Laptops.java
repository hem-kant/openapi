package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Products;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Laptops
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-30T12:42:14.200Z[GMT]")


public class Laptops extends Products implements OneOfoneOfOrdersBodyProducts {
  /**
   * Gets or Sets ram
   */
  public enum RamEnum {
    _8GB_RAM("8GB RAM"),
    
    _16GB_RAM("16GB RAM"),
    
    _32GB_RAM("32GB RAM");

    private String value;

    RamEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RamEnum fromValue(String text) {
      for (RamEnum b : RamEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("ram")
  private RamEnum ram = null;

  public Laptops ram(RamEnum ram) {
    this.ram = ram;
    return this;
  }

  /**
   * Get ram
   * @return ram
   **/
  @Schema(required = true, description = "")
      @NotNull

    public RamEnum getRam() {
    return ram;
  }

  public void setRam(RamEnum ram) {
    this.ram = ram;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Laptops laptops = (Laptops) o;
    return Objects.equals(this.ram, laptops.ram) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ram, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Laptops {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
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
