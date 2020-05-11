/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.1.1
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.BrandingTheme;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * BrandingThemes
 */

public class BrandingThemes {
  StringUtil util = new StringUtil();

  @JsonProperty("BrandingThemes")
  private List<BrandingTheme> brandingThemes = new ArrayList<BrandingTheme>();
  public BrandingThemes brandingThemes(List<BrandingTheme> brandingThemes) {
    this.brandingThemes = brandingThemes;
    return this;
  }

  public BrandingThemes addBrandingThemesItem(BrandingTheme brandingThemesItem) {
    if (this.brandingThemes == null) {
      this.brandingThemes = new ArrayList<BrandingTheme>();
    }
    this.brandingThemes.add(brandingThemesItem);
    return this;
  }

   /**
   * Get brandingThemes
   * @return brandingThemes
  **/
  @ApiModelProperty(value = "")
  public List<BrandingTheme> getBrandingThemes() {
    return brandingThemes;
  }

  public void setBrandingThemes(List<BrandingTheme> brandingThemes) {
    this.brandingThemes = brandingThemes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandingThemes brandingThemes = (BrandingThemes) o;
    return Objects.equals(this.brandingThemes, brandingThemes.brandingThemes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandingThemes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandingThemes {\n");
    sb.append("    brandingThemes: ").append(toIndentedString(brandingThemes)).append("\n");
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

