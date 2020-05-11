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
import com.xero.models.payrolluk.TimesheetLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Timesheet
 */

public class Timesheet {
  StringUtil util = new StringUtil();

  @JsonProperty("timesheetID")
  private UUID timesheetID;

  @JsonProperty("payrollCalendarID")
  private UUID payrollCalendarID;

  @JsonProperty("employeeID")
  private UUID employeeID;

  @JsonProperty("startDate")
  private LocalDate startDate;

  @JsonProperty("endDate")
  private LocalDate endDate;
  /**
   * Status of the timesheet
   */
  public enum StatusEnum {
    DRAFT("Draft"),
    
    APPROVED("Approved"),
    
    COMPLETED("Completed");

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


  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("totalHours")
  private Float totalHours;

  @JsonProperty("updatedDateUTC")
  private LocalDate updatedDateUTC;

  @JsonProperty("timesheetLines")
  private List<TimesheetLine> timesheetLines = new ArrayList<TimesheetLine>();
  public Timesheet timesheetID(UUID timesheetID) {
    this.timesheetID = timesheetID;
    return this;
  }

   /**
   * The Xero identifier for a Timesheet
   * @return timesheetID
  **/
  @ApiModelProperty(value = "The Xero identifier for a Timesheet")
  public UUID getTimesheetID() {
    return timesheetID;
  }

  public void setTimesheetID(UUID timesheetID) {
    this.timesheetID = timesheetID;
  }

  public Timesheet payrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
    return this;
  }

   /**
   * The Xero identifier for the Payroll Calandar that the Timesheet applies to
   * @return payrollCalendarID
  **/
  @ApiModelProperty(required = true, value = "The Xero identifier for the Payroll Calandar that the Timesheet applies to")
  public UUID getPayrollCalendarID() {
    return payrollCalendarID;
  }

  public void setPayrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
  }

  public Timesheet employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

   /**
   * The Xero identifier for the Employee that the Timesheet is for
   * @return employeeID
  **/
  @ApiModelProperty(required = true, value = "The Xero identifier for the Employee that the Timesheet is for")
  public UUID getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  public Timesheet startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The Start Date of the Timesheet period (YYYY-MM-DD)
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "The Start Date of the Timesheet period (YYYY-MM-DD)")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Timesheet endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The End Date of the Timesheet period (YYYY-MM-DD)
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "The End Date of the Timesheet period (YYYY-MM-DD)")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Timesheet status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the timesheet
   * @return status
  **/
  @ApiModelProperty(value = "Status of the timesheet")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Timesheet totalHours(Float totalHours) {
    this.totalHours = totalHours;
    return this;
  }

   /**
   * The Total Hours of the Timesheet
   * @return totalHours
  **/
  @ApiModelProperty(value = "The Total Hours of the Timesheet")
  public Float getTotalHours() {
    return totalHours;
  }

  public void setTotalHours(Float totalHours) {
    this.totalHours = totalHours;
  }

  public Timesheet updatedDateUTC(LocalDate updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

   /**
   * The UTC date time that the Timesheet was last updated
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "The UTC date time that the Timesheet was last updated")
  public LocalDate getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(LocalDate updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }

  public Timesheet timesheetLines(List<TimesheetLine> timesheetLines) {
    this.timesheetLines = timesheetLines;
    return this;
  }

  public Timesheet addTimesheetLinesItem(TimesheetLine timesheetLinesItem) {
    if (this.timesheetLines == null) {
      this.timesheetLines = new ArrayList<TimesheetLine>();
    }
    this.timesheetLines.add(timesheetLinesItem);
    return this;
  }

   /**
   * Get timesheetLines
   * @return timesheetLines
  **/
  @ApiModelProperty(value = "")
  public List<TimesheetLine> getTimesheetLines() {
    return timesheetLines;
  }

  public void setTimesheetLines(List<TimesheetLine> timesheetLines) {
    this.timesheetLines = timesheetLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timesheet timesheet = (Timesheet) o;
    return Objects.equals(this.timesheetID, timesheet.timesheetID) &&
        Objects.equals(this.payrollCalendarID, timesheet.payrollCalendarID) &&
        Objects.equals(this.employeeID, timesheet.employeeID) &&
        Objects.equals(this.startDate, timesheet.startDate) &&
        Objects.equals(this.endDate, timesheet.endDate) &&
        Objects.equals(this.status, timesheet.status) &&
        Objects.equals(this.totalHours, timesheet.totalHours) &&
        Objects.equals(this.updatedDateUTC, timesheet.updatedDateUTC) &&
        Objects.equals(this.timesheetLines, timesheet.timesheetLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timesheetID, payrollCalendarID, employeeID, startDate, endDate, status, totalHours, updatedDateUTC, timesheetLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timesheet {\n");
    sb.append("    timesheetID: ").append(toIndentedString(timesheetID)).append("\n");
    sb.append("    payrollCalendarID: ").append(toIndentedString(payrollCalendarID)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalHours: ").append(toIndentedString(totalHours)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    timesheetLines: ").append(toIndentedString(timesheetLines)).append("\n");
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

