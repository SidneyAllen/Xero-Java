/*
 * Bank Feeds API
 * This specifing endpoints Xero Bank feeds API
 *
 * The version of the OpenAPI document: 2.1.6
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.bankfeeds;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.bankfeeds.CreditDebitIndicator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * the lines details for a statement
 */
@ApiModel(description = "the lines details for a statement")

public class StatementLine {
  StringUtil util = new StringUtil();

  @JsonProperty("postedDate")
  private LocalDate postedDate;

  @JsonProperty("description")
  private String description;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("creditDebitIndicator")
  private CreditDebitIndicator creditDebitIndicator;

  @JsonProperty("transactionId")
  private String transactionId;

  @JsonProperty("payeeName")
  private String payeeName;

  @JsonProperty("reference")
  private String reference;

  @JsonProperty("chequeNumber")
  private String chequeNumber;
  public StatementLine postedDate(LocalDate postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date that the transaction was processed or cleared as seen in internet banking ISO-8601 YYYY-MM-DD
   * @return postedDate
  **/
  @ApiModelProperty(example = "Sun Jun 10 00:00:00 GMT 2018", value = "The date that the transaction was processed or cleared as seen in internet banking ISO-8601 YYYY-MM-DD")
  public LocalDate getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(LocalDate postedDate) {
    this.postedDate = postedDate;
  }

  public StatementLine description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Transaction description
   * maximum: 2000
   * @return description
  **/
  @ApiModelProperty(example = "Description for statement line 2", value = "Transaction description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StatementLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Transaction amount
   * @return amount
  **/
  @ApiModelProperty(example = "5.00", value = "Transaction amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public StatementLine creditDebitIndicator(CreditDebitIndicator creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

   /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(value = "")
  public CreditDebitIndicator getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(CreditDebitIndicator creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public StatementLine transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Financial institute&#39;s internal transaction identifier. If provided this field is factored into duplicate detection.
   * @return transactionId
  **/
  @ApiModelProperty(example = "transaction-id-2", value = "Financial institute's internal transaction identifier. If provided this field is factored into duplicate detection.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public StatementLine payeeName(String payeeName) {
    this.payeeName = payeeName;
    return this;
  }

   /**
   * Typically the merchant or payee name
   * maximum: 255
   * @return payeeName
  **/
  @ApiModelProperty(example = "Payee name for statement line 2", value = "Typically the merchant or payee name")
  public String getPayeeName() {
    return payeeName;
  }

  public void setPayeeName(String payeeName) {
    this.payeeName = payeeName;
  }

  public StatementLine reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Optional field to enhance the Description
   * maximum: 255
   * @return reference
  **/
  @ApiModelProperty(example = "Reference for statement line 2", value = "Optional field to enhance the Description")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public StatementLine chequeNumber(String chequeNumber) {
    this.chequeNumber = chequeNumber;
    return this;
  }

   /**
   * The cheque/check number
   * maximum: 20
   * @return chequeNumber
  **/
  @ApiModelProperty(example = "021", value = "The cheque/check number")
  public String getChequeNumber() {
    return chequeNumber;
  }

  public void setChequeNumber(String chequeNumber) {
    this.chequeNumber = chequeNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementLine statementLine = (StatementLine) o;
    return Objects.equals(this.postedDate, statementLine.postedDate) &&
        Objects.equals(this.description, statementLine.description) &&
        Objects.equals(this.amount, statementLine.amount) &&
        Objects.equals(this.creditDebitIndicator, statementLine.creditDebitIndicator) &&
        Objects.equals(this.transactionId, statementLine.transactionId) &&
        Objects.equals(this.payeeName, statementLine.payeeName) &&
        Objects.equals(this.reference, statementLine.reference) &&
        Objects.equals(this.chequeNumber, statementLine.chequeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postedDate, description, amount, creditDebitIndicator, transactionId, payeeName, reference, chequeNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementLine {\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    chequeNumber: ").append(toIndentedString(chequeNumber)).append("\n");
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

