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
import com.xero.models.payrolluk.Deduction;
import com.xero.models.payrolluk.Pagination;
import com.xero.models.payrolluk.Problem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * DeductionObject
 */

public class DeductionObject {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination = null;

  @JsonProperty("problem")
  private Problem problem = null;

  @JsonProperty("deduction")
  private Deduction deduction = null;
  public DeductionObject pagination(Pagination pagination) {
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

  public DeductionObject problem(Problem problem) {
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

  public DeductionObject deduction(Deduction deduction) {
    this.deduction = deduction;
    return this;
  }

   /**
   * Get deduction
   * @return deduction
  **/
  @ApiModelProperty(value = "")
  public Deduction getDeduction() {
    return deduction;
  }

  public void setDeduction(Deduction deduction) {
    this.deduction = deduction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeductionObject deductionObject = (DeductionObject) o;
    return Objects.equals(this.pagination, deductionObject.pagination) &&
        Objects.equals(this.problem, deductionObject.problem) &&
        Objects.equals(this.deduction, deductionObject.deduction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, deduction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeductionObject {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    deduction: ").append(toIndentedString(deduction)).append("\n");
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

