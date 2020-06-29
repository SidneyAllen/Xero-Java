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
import java.util.UUID;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import com.xero.api.StringUtil;

/** PayslipSummary */
public class PayslipSummary {
  StringUtil util = new StringUtil();

  @JsonProperty("EmployeeID")
  private UUID employeeID;

  @JsonProperty("PayslipID")
  private UUID payslipID;

  @JsonProperty("FirstName")
  private String firstName;

  @JsonProperty("LastName")
  private String lastName;

  @JsonProperty("EmployeeGroup")
  private String employeeGroup;

  @JsonProperty("Wages")
  private Double wages;

  @JsonProperty("Deductions")
  private Double deductions;

  @JsonProperty("Tax")
  private Double tax;

  @JsonProperty("Super")
  private Double _super;

  @JsonProperty("Reimbursements")
  private Double reimbursements;

  @JsonProperty("NetPay")
  private Double netPay;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  public PayslipSummary employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

  /**
   * The Xero identifier for an employee
   *
   * @return employeeID
   */
  @ApiModelProperty(
      example = "4729f087-8eec-49c1-8294-4d11a5a0a37c",
      value = "The Xero identifier for an employee")
  public UUID getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  public PayslipSummary payslipID(UUID payslipID) {
    this.payslipID = payslipID;
    return this;
  }

  /**
   * Xero identifier for the payslip
   *
   * @return payslipID
   */
  @ApiModelProperty(
      example = "f3c0874d-7cdd-459a-a95c-d90d51decc42",
      value = "Xero identifier for the payslip")
  public UUID getPayslipID() {
    return payslipID;
  }

  public void setPayslipID(UUID payslipID) {
    this.payslipID = payslipID;
  }

  public PayslipSummary firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of employee
   *
   * @return firstName
   */
  @ApiModelProperty(example = "Karen", value = "First name of employee")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PayslipSummary lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of employee
   *
   * @return lastName
   */
  @ApiModelProperty(example = "Jones", value = "Last name of employee")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PayslipSummary employeeGroup(String employeeGroup) {
    this.employeeGroup = employeeGroup;
    return this;
  }

  /**
   * Employee group name
   *
   * @return employeeGroup
   */
  @ApiModelProperty(example = "Marketing", value = "Employee group name")
  public String getEmployeeGroup() {
    return employeeGroup;
  }

  public void setEmployeeGroup(String employeeGroup) {
    this.employeeGroup = employeeGroup;
  }

  public PayslipSummary wages(Double wages) {
    this.wages = wages;
    return this;
  }

  /**
   * The Wages for the Payslip
   *
   * @return wages
   */
  @ApiModelProperty(example = "1060.5", value = "The Wages for the Payslip")
  public Double getWages() {
    return wages;
  }

  public void setWages(Double wages) {
    this.wages = wages;
  }

  public PayslipSummary deductions(Double deductions) {
    this.deductions = deductions;
    return this;
  }

  /**
   * The Deductions for the Payslip
   *
   * @return deductions
   */
  @ApiModelProperty(example = "0.0", value = "The Deductions for the Payslip")
  public Double getDeductions() {
    return deductions;
  }

  public void setDeductions(Double deductions) {
    this.deductions = deductions;
  }

  public PayslipSummary tax(Double tax) {
    this.tax = tax;
    return this;
  }

  /**
   * The Tax for the Payslip
   *
   * @return tax
   */
  @ApiModelProperty(example = "198.0", value = "The Tax for the Payslip")
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public PayslipSummary _super(Double _super) {
    this._super = _super;
    return this;
  }

  /**
   * The Super for the Payslip
   *
   * @return _super
   */
  @ApiModelProperty(example = "75.6", value = "The Super for the Payslip")
  public Double getSuper() {
    return _super;
  }

  public void setSuper(Double _super) {
    this._super = _super;
  }

  public PayslipSummary reimbursements(Double reimbursements) {
    this.reimbursements = reimbursements;
    return this;
  }

  /**
   * The Reimbursements for the Payslip
   *
   * @return reimbursements
   */
  @ApiModelProperty(example = "0.0", value = "The Reimbursements for the Payslip")
  public Double getReimbursements() {
    return reimbursements;
  }

  public void setReimbursements(Double reimbursements) {
    this.reimbursements = reimbursements;
  }

  public PayslipSummary netPay(Double netPay) {
    this.netPay = netPay;
    return this;
  }

  /**
   * The NetPay for the Payslip
   *
   * @return netPay
   */
  @ApiModelProperty(example = "862.5", value = "The NetPay for the Payslip")
  public Double getNetPay() {
    return netPay;
  }

  public void setNetPay(Double netPay) {
    this.netPay = netPay;
  }

  /**
   * Last modified timestamp
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1583967733054+0000)/", value = "Last modified timestamp")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayslipSummary payslipSummary = (PayslipSummary) o;
    return Objects.equals(this.employeeID, payslipSummary.employeeID)
        && Objects.equals(this.payslipID, payslipSummary.payslipID)
        && Objects.equals(this.firstName, payslipSummary.firstName)
        && Objects.equals(this.lastName, payslipSummary.lastName)
        && Objects.equals(this.employeeGroup, payslipSummary.employeeGroup)
        && Objects.equals(this.wages, payslipSummary.wages)
        && Objects.equals(this.deductions, payslipSummary.deductions)
        && Objects.equals(this.tax, payslipSummary.tax)
        && Objects.equals(this._super, payslipSummary._super)
        && Objects.equals(this.reimbursements, payslipSummary.reimbursements)
        && Objects.equals(this.netPay, payslipSummary.netPay)
        && Objects.equals(this.updatedDateUTC, payslipSummary.updatedDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        employeeID,
        payslipID,
        firstName,
        lastName,
        employeeGroup,
        wages,
        deductions,
        tax,
        _super,
        reimbursements,
        netPay,
        updatedDateUTC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayslipSummary {\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    payslipID: ").append(toIndentedString(payslipID)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    employeeGroup: ").append(toIndentedString(employeeGroup)).append("\n");
    sb.append("    wages: ").append(toIndentedString(wages)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    _super: ").append(toIndentedString(_super)).append("\n");
    sb.append("    reimbursements: ").append(toIndentedString(reimbursements)).append("\n");
    sb.append("    netPay: ").append(toIndentedString(netPay)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
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
