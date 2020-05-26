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
 * StatutoryDeduction
 */

public class StatutoryDeduction {
  StringUtil util = new StringUtil();

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;
  /**
   * Statutory Deduction Category
   */
  public enum StatutoryDeductionCategoryEnum {
    PRIORITYORDER("PriorityOrder"),
    
    NONPRIORITYORDER("NonPriorityOrder"),
    
    TABLEBASED("TableBased"),
    
    CHILDSUPPORT("ChildSupport"),
    
    COURTFINES("CourtFines"),
    
    INLANDREVENUEARREARS("InlandRevenueArrears"),
    
    MSDREPAYMENTS("MsdRepayments"),
    
    STUDENTLOAN("StudentLoan"),
    
    ADDITIONALSTUDENTLOAN("AdditionalStudentLoan"),
    
    VOLUNTARYSTUDENTLOAN("VoluntaryStudentLoan"),
    
    KIWISAVER("KiwiSaver"),
    
    FEDERALLEVY("FederalLevy"),
    
    USCHILDSUPPORT("USChildSupport"),
    
    CREDITOR("Creditor");

    private String value;

    StatutoryDeductionCategoryEnum(String value) {
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
    public static StatutoryDeductionCategoryEnum fromValue(String value) {
      for (StatutoryDeductionCategoryEnum b : StatutoryDeductionCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @JsonProperty("statutoryDeductionCategory")
  private StatutoryDeductionCategoryEnum statutoryDeductionCategory;

  @JsonProperty("liabilityAccoutId")
  private UUID liabilityAccoutId;

  @JsonProperty("currentRecord")
  private Boolean currentRecord;
  public StatutoryDeduction id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The Xero identifier for earnings order
   * @return id
  **/
  @ApiModelProperty(value = "The Xero identifier for earnings order")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public StatutoryDeduction name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the earnings order
   * @return name
  **/
  @ApiModelProperty(value = "Name of the earnings order")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatutoryDeduction statutoryDeductionCategory(StatutoryDeductionCategoryEnum statutoryDeductionCategory) {
    this.statutoryDeductionCategory = statutoryDeductionCategory;
    return this;
  }

   /**
   * Statutory Deduction Category
   * @return statutoryDeductionCategory
  **/
  @ApiModelProperty(value = "Statutory Deduction Category")
  public StatutoryDeductionCategoryEnum getStatutoryDeductionCategory() {
    return statutoryDeductionCategory;
  }

  public void setStatutoryDeductionCategory(StatutoryDeductionCategoryEnum statutoryDeductionCategory) {
    this.statutoryDeductionCategory = statutoryDeductionCategory;
  }

  public StatutoryDeduction liabilityAccoutId(UUID liabilityAccoutId) {
    this.liabilityAccoutId = liabilityAccoutId;
    return this;
  }

   /**
   * Xero identifier for Liability Account
   * @return liabilityAccoutId
  **/
  @ApiModelProperty(value = "Xero identifier for Liability Account")
  public UUID getLiabilityAccoutId() {
    return liabilityAccoutId;
  }

  public void setLiabilityAccoutId(UUID liabilityAccoutId) {
    this.liabilityAccoutId = liabilityAccoutId;
  }

  public StatutoryDeduction currentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
    return this;
  }

   /**
   * Identifier of a record is active or not.
   * @return currentRecord
  **/
  @ApiModelProperty(value = "Identifier of a record is active or not.")
  public Boolean getCurrentRecord() {
    return currentRecord;
  }

  public void setCurrentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatutoryDeduction statutoryDeduction = (StatutoryDeduction) o;
    return Objects.equals(this.id, statutoryDeduction.id) &&
        Objects.equals(this.name, statutoryDeduction.name) &&
        Objects.equals(this.statutoryDeductionCategory, statutoryDeduction.statutoryDeductionCategory) &&
        Objects.equals(this.liabilityAccoutId, statutoryDeduction.liabilityAccoutId) &&
        Objects.equals(this.currentRecord, statutoryDeduction.currentRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, statutoryDeductionCategory, liabilityAccoutId, currentRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatutoryDeduction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statutoryDeductionCategory: ").append(toIndentedString(statutoryDeductionCategory)).append("\n");
    sb.append("    liabilityAccoutId: ").append(toIndentedString(liabilityAccoutId)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
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

