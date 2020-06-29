/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.2.4
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import com.xero.api.StringUtil;

/** TimesheetObject */
public class TimesheetObject {
  StringUtil util = new StringUtil();

  @JsonProperty("Timesheet")
  private Timesheet timesheet;

  public TimesheetObject timesheet(Timesheet timesheet) {
    this.timesheet = timesheet;
    return this;
  }

  /**
   * Get timesheet
   *
   * @return timesheet
   */
  @ApiModelProperty(value = "")
  public Timesheet getTimesheet() {
    return timesheet;
  }

  public void setTimesheet(Timesheet timesheet) {
    this.timesheet = timesheet;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimesheetObject timesheetObject = (TimesheetObject) o;
    return Objects.equals(this.timesheet, timesheetObject.timesheet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timesheet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimesheetObject {\n");
    sb.append("    timesheet: ").append(toIndentedString(timesheet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
