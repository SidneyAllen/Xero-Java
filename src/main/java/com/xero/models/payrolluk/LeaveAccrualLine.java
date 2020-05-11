/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.1.1
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrolluk;

import java.util.Objects;
import java.util.Arrays;
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

  @JsonProperty("leaveTypeID")
  private UUID leaveTypeID;

  @JsonProperty("numberOfUnits")
  private Float numberOfUnits;
  public LeaveAccrualLine leaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

   /**
   * Xero identifier for the Leave type
   * @return leaveTypeID
  **/
  @ApiModelProperty(value = "Xero identifier for the Leave type")
  public UUID getLeaveTypeID() {
    return leaveTypeID;
  }

  public void setLeaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  public LeaveAccrualLine numberOfUnits(Float numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

   /**
   * Leave accrual number of units
   * @return numberOfUnits
  **/
  @ApiModelProperty(value = "Leave accrual number of units")
  public Float getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Float numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
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
        Objects.equals(this.numberOfUnits, leaveAccrualLine.numberOfUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveTypeID, numberOfUnits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveAccrualLine {\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
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

