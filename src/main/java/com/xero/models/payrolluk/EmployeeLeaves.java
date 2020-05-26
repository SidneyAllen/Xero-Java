/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.1.6
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrolluk;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.payrolluk.EmployeeLeave;
import com.xero.models.payrolluk.Pagination;
import com.xero.models.payrolluk.Problem;
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
 * EmployeeLeaves
 */

public class EmployeeLeaves {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("leave")
  private List<EmployeeLeave> leave = new ArrayList<EmployeeLeave>();
  public EmployeeLeaves pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public EmployeeLeaves problem(Problem problem) {
    this.problem = problem;
    return this;
  }

   /**
   * Get problem
   * @return problem
  **/
  @ApiModelProperty(value = "")
  public Problem getProblem() {
    return problem;
  }

  public void setProblem(Problem problem) {
    this.problem = problem;
  }

  public EmployeeLeaves leave(List<EmployeeLeave> leave) {
    this.leave = leave;
    return this;
  }

  public EmployeeLeaves addLeaveItem(EmployeeLeave leaveItem) {
    if (this.leave == null) {
      this.leave = new ArrayList<EmployeeLeave>();
    }
    this.leave.add(leaveItem);
    return this;
  }

   /**
   * Get leave
   * @return leave
  **/
  @ApiModelProperty(value = "")
  public List<EmployeeLeave> getLeave() {
    return leave;
  }

  public void setLeave(List<EmployeeLeave> leave) {
    this.leave = leave;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeLeaves employeeLeaves = (EmployeeLeaves) o;
    return Objects.equals(this.pagination, employeeLeaves.pagination) &&
        Objects.equals(this.problem, employeeLeaves.problem) &&
        Objects.equals(this.leave, employeeLeaves.leave);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, leave);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeLeaves {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    leave: ").append(toIndentedString(leave)).append("\n");
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

