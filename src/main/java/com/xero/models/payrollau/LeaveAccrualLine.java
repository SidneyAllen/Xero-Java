/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.1.6
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

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
 * LeaveAccrualLine
 */

public class LeaveAccrualLine {
  StringUtil util = new StringUtil();

  @JsonProperty("LeaveTypeID")
  private UUID leaveTypeID;

  @JsonProperty("NumberOfUnits")
  private Double numberOfUnits;

  @JsonProperty("AutoCalculate")
  private Boolean autoCalculate;
  public LeaveAccrualLine leaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

   /**
   * Xero identifier for the Leave type.
   * @return leaveTypeID
  **/
  @ApiModelProperty(example = "e0eb6747-7c17-4075-b804-989f8d4e5d39", value = "Xero identifier for the Leave type.")
  public UUID getLeaveTypeID() {
    return leaveTypeID;
  }

  public void setLeaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  public LeaveAccrualLine numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

   /**
   * Leave Accrual number of units
   * @return numberOfUnits
  **/
  @ApiModelProperty(example = "105.5", value = "Leave Accrual number of units")
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public LeaveAccrualLine autoCalculate(Boolean autoCalculate) {
    this.autoCalculate = autoCalculate;
    return this;
  }

   /**
   * If you want to auto calculate leave.
   * @return autoCalculate
  **/
  @ApiModelProperty(example = "true", value = "If you want to auto calculate leave.")
  public Boolean getAutoCalculate() {
    return autoCalculate;
  }

  public void setAutoCalculate(Boolean autoCalculate) {
    this.autoCalculate = autoCalculate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveAccrualLine leaveAccrualLine = (LeaveAccrualLine) o;
    return Objects.equals(this.leaveTypeID, leaveAccrualLine.leaveTypeID) &&
        Objects.equals(this.numberOfUnits, leaveAccrualLine.numberOfUnits) &&
        Objects.equals(this.autoCalculate, leaveAccrualLine.autoCalculate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveTypeID, numberOfUnits, autoCalculate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveAccrualLine {\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    autoCalculate: ").append(toIndentedString(autoCalculate)).append("\n");
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

