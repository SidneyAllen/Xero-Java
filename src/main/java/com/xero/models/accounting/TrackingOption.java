/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.1.6
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * TrackingOption
 */

public class TrackingOption {
  StringUtil util = new StringUtil();

  @JsonProperty("TrackingOptionID")
  private UUID trackingOptionID;

  @JsonProperty("Name")
  private String name;
  /**
   * The status of a tracking option
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    ARCHIVED("ARCHIVED"),
    
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @JsonProperty("Status")
  private StatusEnum status;

  @JsonProperty("TrackingCategoryID")
  private UUID trackingCategoryID;
  public TrackingOption trackingOptionID(UUID trackingOptionID) {
    this.trackingOptionID = trackingOptionID;
    return this;
  }

   /**
   * The Xero identifier for a tracking optione.g. ae777a87-5ef3-4fa0-a4f0-d10e1f13073a
   * @return trackingOptionID
  **/
  @ApiModelProperty(value = "The Xero identifier for a tracking optione.g. ae777a87-5ef3-4fa0-a4f0-d10e1f13073a")
  public UUID getTrackingOptionID() {
    return trackingOptionID;
  }

  public void setTrackingOptionID(UUID trackingOptionID) {
    this.trackingOptionID = trackingOptionID;
  }

  public TrackingOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the tracking option e.g. Marketing, East (max length &#x3D; 50)
   * @return name
  **/
  @ApiModelProperty(value = "The name of the tracking option e.g. Marketing, East (max length = 50)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TrackingOption status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of a tracking option
   * @return status
  **/
  @ApiModelProperty(value = "The status of a tracking option")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TrackingOption trackingCategoryID(UUID trackingCategoryID) {
    this.trackingCategoryID = trackingCategoryID;
    return this;
  }

   /**
   * Filter by a tracking categorye.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9
   * @return trackingCategoryID
  **/
  @ApiModelProperty(value = "Filter by a tracking categorye.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9")
  public UUID getTrackingCategoryID() {
    return trackingCategoryID;
  }

  public void setTrackingCategoryID(UUID trackingCategoryID) {
    this.trackingCategoryID = trackingCategoryID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingOption trackingOption = (TrackingOption) o;
    return Objects.equals(this.trackingOptionID, trackingOption.trackingOptionID) &&
        Objects.equals(this.name, trackingOption.name) &&
        Objects.equals(this.status, trackingOption.status) &&
        Objects.equals(this.trackingCategoryID, trackingOption.trackingCategoryID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingOptionID, name, status, trackingCategoryID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingOption {\n");
    sb.append("    trackingOptionID: ").append(toIndentedString(trackingOptionID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingCategoryID: ").append(toIndentedString(trackingCategoryID)).append("\n");
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

