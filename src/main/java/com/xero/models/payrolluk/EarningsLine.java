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
 * EarningsLine
 */

public class EarningsLine {
  StringUtil util = new StringUtil();

  @JsonProperty("earningsRateID")
  private UUID earningsRateID;

  @JsonProperty("ratePerUnit")
  private Float ratePerUnit;

  @JsonProperty("numberOfUnits")
  private Float numberOfUnits;

  @JsonProperty("fixedAmount")
  private Float fixedAmount;

  @JsonProperty("amount")
  private Float amount;

  @JsonProperty("isLinkedToTimesheet")
  private Boolean isLinkedToTimesheet;
  public EarningsLine earningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
    return this;
  }

   /**
   * Xero identifier for payroll earnings rate
   * @return earningsRateID
  **/
  @ApiModelProperty(value = "Xero identifier for payroll earnings rate")
  public UUID getEarningsRateID() {
    return earningsRateID;
  }

  public void setEarningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
  }

  public EarningsLine ratePerUnit(Float ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
    return this;
  }

   /**
   * Rate per unit for earnings line
   * @return ratePerUnit
  **/
  @ApiModelProperty(value = "Rate per unit for earnings line")
  public Float getRatePerUnit() {
    return ratePerUnit;
  }

  public void setRatePerUnit(Float ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
  }

  public EarningsLine numberOfUnits(Float numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

   /**
   * Earnings number of units
   * @return numberOfUnits
  **/
  @ApiModelProperty(value = "Earnings number of units")
  public Float getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Float numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public EarningsLine fixedAmount(Float fixedAmount) {
    this.fixedAmount = fixedAmount;
    return this;
  }

   /**
   * Earnings fixed amount. Only applicable if the EarningsRate RateType is Fixed
   * @return fixedAmount
  **/
  @ApiModelProperty(value = "Earnings fixed amount. Only applicable if the EarningsRate RateType is Fixed")
  public Float getFixedAmount() {
    return fixedAmount;
  }

  public void setFixedAmount(Float fixedAmount) {
    this.fixedAmount = fixedAmount;
  }

  public EarningsLine amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the earnings line.
   * @return amount
  **/
  @ApiModelProperty(value = "The amount of the earnings line.")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public EarningsLine isLinkedToTimesheet(Boolean isLinkedToTimesheet) {
    this.isLinkedToTimesheet = isLinkedToTimesheet;
    return this;
  }

   /**
   * Identifies if the earnings is taken from the timesheet. False for earnings line
   * @return isLinkedToTimesheet
  **/
  @ApiModelProperty(value = "Identifies if the earnings is taken from the timesheet. False for earnings line")
  public Boolean getIsLinkedToTimesheet() {
    return isLinkedToTimesheet;
  }

  public void setIsLinkedToTimesheet(Boolean isLinkedToTimesheet) {
    this.isLinkedToTimesheet = isLinkedToTimesheet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsLine earningsLine = (EarningsLine) o;
    return Objects.equals(this.earningsRateID, earningsLine.earningsRateID) &&
        Objects.equals(this.ratePerUnit, earningsLine.ratePerUnit) &&
        Objects.equals(this.numberOfUnits, earningsLine.numberOfUnits) &&
        Objects.equals(this.fixedAmount, earningsLine.fixedAmount) &&
        Objects.equals(this.amount, earningsLine.amount) &&
        Objects.equals(this.isLinkedToTimesheet, earningsLine.isLinkedToTimesheet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earningsRateID, ratePerUnit, numberOfUnits, fixedAmount, amount, isLinkedToTimesheet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsLine {\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isLinkedToTimesheet: ").append(toIndentedString(isLinkedToTimesheet)).append("\n");
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

