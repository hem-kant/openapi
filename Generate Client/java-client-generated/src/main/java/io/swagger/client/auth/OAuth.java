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

package io.swagger.client.auth;

import io.swagger.client.Pair;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-30T12:56:11.764Z[GMT]")public class OAuth implements Authentication {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (accessToken != null) {
      headerParams.put("Authorization", "Bearer " + accessToken);
    }
  }
}
