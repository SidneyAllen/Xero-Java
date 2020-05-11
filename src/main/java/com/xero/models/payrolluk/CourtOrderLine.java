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
 * CourtOrderLine
 */

public class CourtOrderLine {
  StringUtil util = new StringUtil();

  @JsonProperty("courtOrderTypeID")
  private UUID courtOrderTypeID;

  @JsonProperty("amount")
  private Float amount;
  public CourtOrderLine courtOrderTypeID(UUID courtOrderTypeID) {
    this.courtOrderTypeID = courtOrderTypeID;
    return this;
  }

   /**
   * Xero identifier for payroll court order type
   * @return courtOrderTypeID
  **/
  @ApiModelProperty(value = "Xero identifier for payroll court order type")
  public UUID getCourtOrderTypeID() {
    return courtOrderTypeID;
  }

  public void setCourtOrderTypeID(UUID courtOrderTypeID) {
    this.courtOrderTypeID = courtOrderTypeID;
  }

  public CourtOrderLine amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount
   * @return amount
  **/
  @ApiModelProperty(value = "Amount")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourtOrderLine courtOrderLine = (CourtOrderLine) o;
    return Objects.equals(this.courtOrderTypeID, courtOrderLine.courtOrderTypeID) &&
        Objects.equals(this.amount, courtOrderLine.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courtOrderTypeID, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourtOrderLine {\n");
    sb.append("    courtOrderTypeID: ").append(toIndentedString(courtOrderTypeID)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

