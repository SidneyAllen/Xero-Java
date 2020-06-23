/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.2.4
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * PayRunCalendar
 */

public class PayRunCalendar {
  StringUtil util = new StringUtil();

  @JsonProperty("payrollCalendarID")
  private UUID payrollCalendarID;

  @JsonProperty("name")
  private String name;
  /**
   * Type of the calendar
   */
  public enum CalendarTypeEnum {
    WEEKLY("Weekly"),
    
    FORTNIGHTLY("Fortnightly"),
    
    FOURWEEKLY("FourWeekly"),
    
    MONTHLY("Monthly"),
    
    ANNUAL("Annual"),
    
    QUARTERLY("Quarterly");

    private String value;

    CalendarTypeEnum(String value) {
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
    public static CalendarTypeEnum fromValue(String value) {
      for (CalendarTypeEnum b : CalendarTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @JsonProperty("calendarType")
  private CalendarTypeEnum calendarType;

  @JsonProperty("periodStartDate")
  private LocalDate periodStartDate;

  @JsonProperty("periodEndDate")
  private LocalDate periodEndDate;

  @JsonProperty("paymentDate")
  private LocalDate paymentDate;

  @JsonProperty("updatedDateUTC")
  private LocalDateTime updatedDateUTC;
  public PayRunCalendar payrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
    return this;
  }

   /**
   * Xero unique identifier for the payroll calendar
   * @return payrollCalendarID
  **/
  @ApiModelProperty(value = "Xero unique identifier for the payroll calendar")
  public UUID getPayrollCalendarID() {
    return payrollCalendarID;
  }

  public void setPayrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
  }

  public PayRunCalendar name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the calendar
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the calendar")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PayRunCalendar calendarType(CalendarTypeEnum calendarType) {
    this.calendarType = calendarType;
    return this;
  }

   /**
   * Type of the calendar
   * @return calendarType
  **/
  @ApiModelProperty(required = true, value = "Type of the calendar")
  public CalendarTypeEnum getCalendarType() {
    return calendarType;
  }

  public void setCalendarType(CalendarTypeEnum calendarType) {
    this.calendarType = calendarType;
  }

  public PayRunCalendar periodStartDate(LocalDate periodStartDate) {
    this.periodStartDate = periodStartDate;
    return this;
  }

   /**
   * Period start date of the calendar
   * @return periodStartDate
  **/
  @ApiModelProperty(required = true, value = "Period start date of the calendar")
  public LocalDate getPeriodStartDate() {
    return periodStartDate;
  }

  public void setPeriodStartDate(LocalDate periodStartDate) {
    this.periodStartDate = periodStartDate;
  }

  public PayRunCalendar periodEndDate(LocalDate periodEndDate) {
    this.periodEndDate = periodEndDate;
    return this;
  }

   /**
   * Period end date of the calendar
   * @return periodEndDate
  **/
  @ApiModelProperty(value = "Period end date of the calendar")
  public LocalDate getPeriodEndDate() {
    return periodEndDate;
  }

  public void setPeriodEndDate(LocalDate periodEndDate) {
    this.periodEndDate = periodEndDate;
  }

  public PayRunCalendar paymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * Payment date of the calendar
   * @return paymentDate
  **/
  @ApiModelProperty(required = true, value = "Payment date of the calendar")
  public LocalDate getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }

  public PayRunCalendar updatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

   /**
   * UTC timestamp of the last update to the pay run calendar
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "UTC timestamp of the last update to the pay run calendar")
  public LocalDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayRunCalendar payRunCalendar = (PayRunCalendar) o;
    return Objects.equals(this.payrollCalendarID, payRunCalendar.payrollCalendarID) &&
        Objects.equals(this.name, payRunCalendar.name) &&
        Objects.equals(this.calendarType, payRunCalendar.calendarType) &&
        Objects.equals(this.periodStartDate, payRunCalendar.periodStartDate) &&
        Objects.equals(this.periodEndDate, payRunCalendar.periodEndDate) &&
        Objects.equals(this.paymentDate, payRunCalendar.paymentDate) &&
        Objects.equals(this.updatedDateUTC, payRunCalendar.updatedDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payrollCalendarID, name, calendarType, periodStartDate, periodEndDate, paymentDate, updatedDateUTC);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRunCalendar {\n");
    sb.append("    payrollCalendarID: ").append(toIndentedString(payrollCalendarID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    calendarType: ").append(toIndentedString(calendarType)).append("\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
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

