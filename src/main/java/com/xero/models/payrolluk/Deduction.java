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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

import com.xero.api.StringUtil;

/** Deduction */
public class Deduction {
  StringUtil util = new StringUtil();

  @JsonProperty("deductionId")
  private UUID deductionId;

  @JsonProperty("deductionName")
  private String deductionName;
  /** Deduction Category type */
  public enum DeductionCategoryEnum {
    STAKEHOLDERPENSION("StakeholderPension"),

    STAKEHOLDERPENSIONPOSTTAX("StakeholderPensionPostTax"),

    CHILDCAREVOUCHER("ChildCareVoucher"),

    SALARYSACRIFICE("SalarySacrifice"),

    UKOTHER("UkOther");

    private String value;

    DeductionCategoryEnum(String value) {
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
    public static DeductionCategoryEnum fromValue(String value) {
      for (DeductionCategoryEnum b : DeductionCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("deductionCategory")
  private DeductionCategoryEnum deductionCategory;

  @JsonProperty("liabilityAccountId")
  private UUID liabilityAccountId;

  @JsonProperty("currentRecord")
  private Boolean currentRecord;

  @JsonProperty("standardAmount")
  private Double standardAmount;

  @JsonProperty("reducesSuperLiability")
  private Boolean reducesSuperLiability;

  @JsonProperty("reducesTaxLiability")
  private Boolean reducesTaxLiability;
  /** determine the calculation type whether fixed amount or percentage of gross */
  public enum CalculationTypeEnum {
    FIXEDAMOUNT("FixedAmount"),

    PERCENTAGEOFGROSS("PercentageOfGross");

    private String value;

    CalculationTypeEnum(String value) {
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
    public static CalculationTypeEnum fromValue(String value) {
      for (CalculationTypeEnum b : CalculationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("calculationType")
  private CalculationTypeEnum calculationType;

  @JsonProperty("percentage")
  private Double percentage;

  @JsonProperty("subjectToNIC")
  private Boolean subjectToNIC;

  @JsonProperty("subjectToTax")
  private Boolean subjectToTax;

  @JsonProperty("isReducedByBasicRate")
  private Boolean isReducedByBasicRate;

  @JsonProperty("applyToPensionCalculations")
  private Boolean applyToPensionCalculations;

  @JsonProperty("isCalculatingOnQualifyingEarnings")
  private Boolean isCalculatingOnQualifyingEarnings;

  @JsonProperty("isPension")
  private Boolean isPension;

  public Deduction deductionId(UUID deductionId) {
    this.deductionId = deductionId;
    return this;
  }

  /**
   * The Xero identifier for Deduction
   *
   * @return deductionId
   */
  @ApiModelProperty(value = "The Xero identifier for Deduction")
  public UUID getDeductionId() {
    return deductionId;
  }

  public void setDeductionId(UUID deductionId) {
    this.deductionId = deductionId;
  }

  public Deduction deductionName(String deductionName) {
    this.deductionName = deductionName;
    return this;
  }

  /**
   * Name of the deduction
   *
   * @return deductionName
   */
  @ApiModelProperty(required = true, value = "Name of the deduction")
  public String getDeductionName() {
    return deductionName;
  }

  public void setDeductionName(String deductionName) {
    this.deductionName = deductionName;
  }

  public Deduction deductionCategory(DeductionCategoryEnum deductionCategory) {
    this.deductionCategory = deductionCategory;
    return this;
  }

  /**
   * Deduction Category type
   *
   * @return deductionCategory
   */
  @ApiModelProperty(required = true, value = "Deduction Category type")
  public DeductionCategoryEnum getDeductionCategory() {
    return deductionCategory;
  }

  public void setDeductionCategory(DeductionCategoryEnum deductionCategory) {
    this.deductionCategory = deductionCategory;
  }

  public Deduction liabilityAccountId(UUID liabilityAccountId) {
    this.liabilityAccountId = liabilityAccountId;
    return this;
  }

  /**
   * Xero identifier for Liability Account
   *
   * @return liabilityAccountId
   */
  @ApiModelProperty(required = true, value = "Xero identifier for Liability Account")
  public UUID getLiabilityAccountId() {
    return liabilityAccountId;
  }

  public void setLiabilityAccountId(UUID liabilityAccountId) {
    this.liabilityAccountId = liabilityAccountId;
  }

  public Deduction currentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
    return this;
  }

  /**
   * Identifier of a record is active or not.
   *
   * @return currentRecord
   */
  @ApiModelProperty(value = "Identifier of a record is active or not.")
  public Boolean getCurrentRecord() {
    return currentRecord;
  }

  public void setCurrentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
  }

  public Deduction standardAmount(Double standardAmount) {
    this.standardAmount = standardAmount;
    return this;
  }

  /**
   * Standard amount of the deduction
   *
   * @return standardAmount
   */
  @ApiModelProperty(value = "Standard amount of the deduction")
  public Double getStandardAmount() {
    return standardAmount;
  }

  public void setStandardAmount(Double standardAmount) {
    this.standardAmount = standardAmount;
  }

  public Deduction reducesSuperLiability(Boolean reducesSuperLiability) {
    this.reducesSuperLiability = reducesSuperLiability;
    return this;
  }

  /**
   * Identifier of reduces super liability
   *
   * @return reducesSuperLiability
   */
  @ApiModelProperty(value = "Identifier of reduces super liability")
  public Boolean getReducesSuperLiability() {
    return reducesSuperLiability;
  }

  public void setReducesSuperLiability(Boolean reducesSuperLiability) {
    this.reducesSuperLiability = reducesSuperLiability;
  }

  public Deduction reducesTaxLiability(Boolean reducesTaxLiability) {
    this.reducesTaxLiability = reducesTaxLiability;
    return this;
  }

  /**
   * Identifier of reduces tax liability
   *
   * @return reducesTaxLiability
   */
  @ApiModelProperty(value = "Identifier of reduces tax liability")
  public Boolean getReducesTaxLiability() {
    return reducesTaxLiability;
  }

  public void setReducesTaxLiability(Boolean reducesTaxLiability) {
    this.reducesTaxLiability = reducesTaxLiability;
  }

  public Deduction calculationType(CalculationTypeEnum calculationType) {
    this.calculationType = calculationType;
    return this;
  }

  /**
   * determine the calculation type whether fixed amount or percentage of gross
   *
   * @return calculationType
   */
  @ApiModelProperty(
      required = true,
      value = "determine the calculation type whether fixed amount or percentage of gross")
  public CalculationTypeEnum getCalculationType() {
    return calculationType;
  }

  public void setCalculationType(CalculationTypeEnum calculationType) {
    this.calculationType = calculationType;
  }

  public Deduction percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage of gross
   *
   * @return percentage
   */
  @ApiModelProperty(value = "Percentage of gross")
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public Deduction subjectToNIC(Boolean subjectToNIC) {
    this.subjectToNIC = subjectToNIC;
    return this;
  }

  /**
   * Identifier of subject To NIC
   *
   * @return subjectToNIC
   */
  @ApiModelProperty(value = "Identifier of subject To NIC")
  public Boolean getSubjectToNIC() {
    return subjectToNIC;
  }

  public void setSubjectToNIC(Boolean subjectToNIC) {
    this.subjectToNIC = subjectToNIC;
  }

  public Deduction subjectToTax(Boolean subjectToTax) {
    this.subjectToTax = subjectToTax;
    return this;
  }

  /**
   * Identifier of subject To Tax
   *
   * @return subjectToTax
   */
  @ApiModelProperty(value = "Identifier of subject To Tax")
  public Boolean getSubjectToTax() {
    return subjectToTax;
  }

  public void setSubjectToTax(Boolean subjectToTax) {
    this.subjectToTax = subjectToTax;
  }

  public Deduction isReducedByBasicRate(Boolean isReducedByBasicRate) {
    this.isReducedByBasicRate = isReducedByBasicRate;
    return this;
  }

  /**
   * Identifier of reduced by basic rate applicable or not
   *
   * @return isReducedByBasicRate
   */
  @ApiModelProperty(value = "Identifier of reduced by basic rate applicable or not")
  public Boolean getIsReducedByBasicRate() {
    return isReducedByBasicRate;
  }

  public void setIsReducedByBasicRate(Boolean isReducedByBasicRate) {
    this.isReducedByBasicRate = isReducedByBasicRate;
  }

  public Deduction applyToPensionCalculations(Boolean applyToPensionCalculations) {
    this.applyToPensionCalculations = applyToPensionCalculations;
    return this;
  }

  /**
   * Identifier for apply to pension calculations
   *
   * @return applyToPensionCalculations
   */
  @ApiModelProperty(value = "Identifier for apply to pension calculations")
  public Boolean getApplyToPensionCalculations() {
    return applyToPensionCalculations;
  }

  public void setApplyToPensionCalculations(Boolean applyToPensionCalculations) {
    this.applyToPensionCalculations = applyToPensionCalculations;
  }

  public Deduction isCalculatingOnQualifyingEarnings(Boolean isCalculatingOnQualifyingEarnings) {
    this.isCalculatingOnQualifyingEarnings = isCalculatingOnQualifyingEarnings;
    return this;
  }

  /**
   * Identifier of calculating on qualifying earnings
   *
   * @return isCalculatingOnQualifyingEarnings
   */
  @ApiModelProperty(value = "Identifier of calculating on qualifying earnings")
  public Boolean getIsCalculatingOnQualifyingEarnings() {
    return isCalculatingOnQualifyingEarnings;
  }

  public void setIsCalculatingOnQualifyingEarnings(Boolean isCalculatingOnQualifyingEarnings) {
    this.isCalculatingOnQualifyingEarnings = isCalculatingOnQualifyingEarnings;
  }

  public Deduction isPension(Boolean isPension) {
    this.isPension = isPension;
    return this;
  }

  /**
   * Identifier of applicable for pension or not
   *
   * @return isPension
   */
  @ApiModelProperty(value = "Identifier of applicable for pension or not")
  public Boolean getIsPension() {
    return isPension;
  }

  public void setIsPension(Boolean isPension) {
    this.isPension = isPension;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deduction deduction = (Deduction) o;
    return Objects.equals(this.deductionId, deduction.deductionId)
        && Objects.equals(this.deductionName, deduction.deductionName)
        && Objects.equals(this.deductionCategory, deduction.deductionCategory)
        && Objects.equals(this.liabilityAccountId, deduction.liabilityAccountId)
        && Objects.equals(this.currentRecord, deduction.currentRecord)
        && Objects.equals(this.standardAmount, deduction.standardAmount)
        && Objects.equals(this.reducesSuperLiability, deduction.reducesSuperLiability)
        && Objects.equals(this.reducesTaxLiability, deduction.reducesTaxLiability)
        && Objects.equals(this.calculationType, deduction.calculationType)
        && Objects.equals(this.percentage, deduction.percentage)
        && Objects.equals(this.subjectToNIC, deduction.subjectToNIC)
        && Objects.equals(this.subjectToTax, deduction.subjectToTax)
        && Objects.equals(this.isReducedByBasicRate, deduction.isReducedByBasicRate)
        && Objects.equals(this.applyToPensionCalculations, deduction.applyToPensionCalculations)
        && Objects.equals(
            this.isCalculatingOnQualifyingEarnings, deduction.isCalculatingOnQualifyingEarnings)
        && Objects.equals(this.isPension, deduction.isPension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        deductionId,
        deductionName,
        deductionCategory,
        liabilityAccountId,
        currentRecord,
        standardAmount,
        reducesSuperLiability,
        reducesTaxLiability,
        calculationType,
        percentage,
        subjectToNIC,
        subjectToTax,
        isReducedByBasicRate,
        applyToPensionCalculations,
        isCalculatingOnQualifyingEarnings,
        isPension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deduction {\n");
    sb.append("    deductionId: ").append(toIndentedString(deductionId)).append("\n");
    sb.append("    deductionName: ").append(toIndentedString(deductionName)).append("\n");
    sb.append("    deductionCategory: ").append(toIndentedString(deductionCategory)).append("\n");
    sb.append("    liabilityAccountId: ").append(toIndentedString(liabilityAccountId)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
    sb.append("    standardAmount: ").append(toIndentedString(standardAmount)).append("\n");
    sb.append("    reducesSuperLiability: ")
        .append(toIndentedString(reducesSuperLiability))
        .append("\n");
    sb.append("    reducesTaxLiability: ")
        .append(toIndentedString(reducesTaxLiability))
        .append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    subjectToNIC: ").append(toIndentedString(subjectToNIC)).append("\n");
    sb.append("    subjectToTax: ").append(toIndentedString(subjectToTax)).append("\n");
    sb.append("    isReducedByBasicRate: ")
        .append(toIndentedString(isReducedByBasicRate))
        .append("\n");
    sb.append("    applyToPensionCalculations: ")
        .append(toIndentedString(applyToPensionCalculations))
        .append("\n");
    sb.append("    isCalculatingOnQualifyingEarnings: ")
        .append(toIndentedString(isCalculatingOnQualifyingEarnings))
        .append("\n");
    sb.append("    isPension: ").append(toIndentedString(isPension)).append("\n");
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
