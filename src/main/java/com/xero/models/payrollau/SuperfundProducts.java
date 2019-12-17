/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.payrollau.SuperFundProduct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * SuperFundProducts
 */

public class SuperFundProducts {
  
  @JsonProperty("SuperFundProducts")
  private List<SuperFundProduct> superFundProducts = new ArrayList<SuperFundProduct>();

  public SuperFundProducts superFundProducts(List<SuperFundProduct> superFundProducts) {
    this.superFundProducts = superFundProducts;
    return this;
  }

  public SuperFundProducts addSuperFundProductsItem(SuperFundProduct superFundProductsItem) {
    if (this.superFundProducts == null) {
      this.superFundProducts = new ArrayList<SuperFundProduct>();
    }
    this.superFundProducts.add(superFundProductsItem);
    return this;
  }

   /**
   * Get superFundProducts
   * @return superFundProducts
  **/
  @ApiModelProperty(value = "")
  public List<SuperFundProduct> getSuperFundProducts() {
    return superFundProducts;
  }

  public void setSuperFundProducts(List<SuperFundProduct> superFundProducts) {
    this.superFundProducts = superFundProducts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperFundProducts superFundProducts = (SuperFundProducts) o;
    return Objects.equals(this.superFundProducts, superFundProducts.superFundProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(superFundProducts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperFundProducts {\n");
    sb.append("    superFundProducts: ").append(toIndentedString(superFundProducts)).append("\n");
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
