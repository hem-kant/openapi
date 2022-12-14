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
import io.swagger.client.model.Products;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.LocalDate;
/**
 * Mobiles
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-30T12:56:11.764Z[GMT]")
public class Mobiles extends Products implements OneOfoneOfOrdersBodyProducts {
  /**
   * Gets or Sets networkType
   */
  @JsonAdapter(NetworkTypeEnum.Adapter.class)
  public enum NetworkTypeEnum {
    _4G("4G"),
    _5G("5G");

    private String value;

    NetworkTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static NetworkTypeEnum fromValue(String input) {
      for (NetworkTypeEnum b : NetworkTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<NetworkTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NetworkTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public NetworkTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return NetworkTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("networkType")
  private NetworkTypeEnum networkType = null;

  public Mobiles networkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
    return this;
  }

   /**
   * Get networkType
   * @return networkType
  **/
  @Schema(required = true, description = "")
  public NetworkTypeEnum getNetworkType() {
    return networkType;
  }

  public void setNetworkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mobiles mobiles = (Mobiles) o;
    return Objects.equals(this.networkType, mobiles.networkType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mobiles {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
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
