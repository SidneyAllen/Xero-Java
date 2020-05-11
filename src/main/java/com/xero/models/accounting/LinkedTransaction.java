/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.1.1
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.ValidationError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
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
 * LinkedTransaction
 */

public class LinkedTransaction {
  StringUtil util = new StringUtil();

  @JsonProperty("SourceTransactionID")
  private UUID sourceTransactionID;

  @JsonProperty("SourceLineItemID")
  private UUID sourceLineItemID;

  @JsonProperty("ContactID")
  private UUID contactID;

  @JsonProperty("TargetTransactionID")
  private UUID targetTransactionID;

  @JsonProperty("TargetLineItemID")
  private UUID targetLineItemID;

  @JsonProperty("LinkedTransactionID")
  private UUID linkedTransactionID;
  /**
   * Filter by the combination of ContactID and Status. Get all the linked transactions that have been assigned to a particular customer and have a particular status e.g. GET /LinkedTransactions?ContactID&#x3D;4bb34b03-3378-4bb2-a0ed-6345abf3224e&amp;Status&#x3D;APPROVED.
   */
  public enum StatusEnum {
    APPROVED("APPROVED"),
    
    DRAFT("DRAFT"),
    
    ONDRAFT("ONDRAFT"),
    
    BILLED("BILLED"),
    
    VOIDED("VOIDED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @JsonProperty("Status")
  private StatusEnum status;
  /**
   * This will always be BILLABLEEXPENSE. More types may be added in future.
   */
  public enum TypeEnum {
    BILLABLEEXPENSE("BILLABLEEXPENSE");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @JsonProperty("Type")
  private TypeEnum type;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;
  /**
   * The Type of the source tranasction. This will be ACCPAY if the linked transaction was created from an invoice and SPEND if it was created from a bank transaction.
   */
  public enum SourceTransactionTypeCodeEnum {
    ACCPAY("ACCPAY"),
    
    SPEND("SPEND");

    private String value;

    SourceTransactionTypeCodeEnum(String value) {
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
    public static SourceTransactionTypeCodeEnum fromValue(String value) {
      for (SourceTransactionTypeCodeEnum b : SourceTransactionTypeCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @JsonProperty("SourceTransactionTypeCode")
  private SourceTransactionTypeCodeEnum sourceTransactionTypeCode;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();
  public LinkedTransaction sourceTransactionID(UUID sourceTransactionID) {
    this.sourceTransactionID = sourceTransactionID;
    return this;
  }

   /**
   * Filter by the SourceTransactionID. Get all the linked transactions created from a particular ACCPAY invoice
   * @return sourceTransactionID
  **/
  @ApiModelProperty(value = "Filter by the SourceTransactionID. Get all the linked transactions created from a particular ACCPAY invoice")
  public UUID getSourceTransactionID() {
    return sourceTransactionID;
  }

  public void setSourceTransactionID(UUID sourceTransactionID) {
    this.sourceTransactionID = sourceTransactionID;
  }

  public LinkedTransaction sourceLineItemID(UUID sourceLineItemID) {
    this.sourceLineItemID = sourceLineItemID;
    return this;
  }

   /**
   * The line item identifier from the source transaction.
   * @return sourceLineItemID
  **/
  @ApiModelProperty(value = "The line item identifier from the source transaction.")
  public UUID getSourceLineItemID() {
    return sourceLineItemID;
  }

  public void setSourceLineItemID(UUID sourceLineItemID) {
    this.sourceLineItemID = sourceLineItemID;
  }

  public LinkedTransaction contactID(UUID contactID) {
    this.contactID = contactID;
    return this;
  }

   /**
   * Filter by the combination of ContactID and Status. Get all the linked transactions that have been assigned to a particular customer and have a particular status e.g. GET /LinkedTransactions?ContactID&#x3D;4bb34b03-3378-4bb2-a0ed-6345abf3224e&amp;Status&#x3D;APPROVED.
   * @return contactID
  **/
  @ApiModelProperty(value = "Filter by the combination of ContactID and Status. Get all the linked transactions that have been assigned to a particular customer and have a particular status e.g. GET /LinkedTransactions?ContactID=4bb34b03-3378-4bb2-a0ed-6345abf3224e&Status=APPROVED.")
  public UUID getContactID() {
    return contactID;
  }

  public void setContactID(UUID contactID) {
    this.contactID = contactID;
  }

  public LinkedTransaction targetTransactionID(UUID targetTransactionID) {
    this.targetTransactionID = targetTransactionID;
    return this;
  }

   /**
   * Filter by the TargetTransactionID. Get all the linked transactions  allocated to a particular ACCREC invoice
   * @return targetTransactionID
  **/
  @ApiModelProperty(value = "Filter by the TargetTransactionID. Get all the linked transactions  allocated to a particular ACCREC invoice")
  public UUID getTargetTransactionID() {
    return targetTransactionID;
  }

  public void setTargetTransactionID(UUID targetTransactionID) {
    this.targetTransactionID = targetTransactionID;
  }

  public LinkedTransaction targetLineItemID(UUID targetLineItemID) {
    this.targetLineItemID = targetLineItemID;
    return this;
  }

   /**
   * The line item identifier from the target transaction. It is possible  to link multiple billable expenses to the same TargetLineItemID.
   * @return targetLineItemID
  **/
  @ApiModelProperty(value = "The line item identifier from the target transaction. It is possible  to link multiple billable expenses to the same TargetLineItemID.")
  public UUID getTargetLineItemID() {
    return targetLineItemID;
  }

  public void setTargetLineItemID(UUID targetLineItemID) {
    this.targetLineItemID = targetLineItemID;
  }

  public LinkedTransaction linkedTransactionID(UUID linkedTransactionID) {
    this.linkedTransactionID = linkedTransactionID;
    return this;
  }

   /**
   * The Xero identifier for an Linked Transaction e.g./LinkedTransactions/297c2dc5-cc47-4afd-8ec8-74990b8761e9
   * @return linkedTransactionID
  **/
  @ApiModelProperty(value = "The Xero identifier for an Linked Transaction e.g./LinkedTransactions/297c2dc5-cc47-4afd-8ec8-74990b8761e9")
  public UUID getLinkedTransactionID() {
    return linkedTransactionID;
  }

  public void setLinkedTransactionID(UUID linkedTransactionID) {
    this.linkedTransactionID = linkedTransactionID;
  }

  public LinkedTransaction status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Filter by the combination of ContactID and Status. Get all the linked transactions that have been assigned to a particular customer and have a particular status e.g. GET /LinkedTransactions?ContactID&#x3D;4bb34b03-3378-4bb2-a0ed-6345abf3224e&amp;Status&#x3D;APPROVED.
   * @return status
  **/
  @ApiModelProperty(value = "Filter by the combination of ContactID and Status. Get all the linked transactions that have been assigned to a particular customer and have a particular status e.g. GET /LinkedTransactions?ContactID=4bb34b03-3378-4bb2-a0ed-6345abf3224e&Status=APPROVED.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public LinkedTransaction type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * This will always be BILLABLEEXPENSE. More types may be added in future.
   * @return type
  **/
  @ApiModelProperty(value = "This will always be BILLABLEEXPENSE. More types may be added in future.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

   /**
   * The last modified date in UTC format
   * @return updatedDateUTC
  **/
  @ApiModelProperty(example = "/Date(1573755038314)/", value = "The last modified date in UTC format")
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

  public LinkedTransaction sourceTransactionTypeCode(SourceTransactionTypeCodeEnum sourceTransactionTypeCode) {
    this.sourceTransactionTypeCode = sourceTransactionTypeCode;
    return this;
  }

   /**
   * The Type of the source tranasction. This will be ACCPAY if the linked transaction was created from an invoice and SPEND if it was created from a bank transaction.
   * @return sourceTransactionTypeCode
  **/
  @ApiModelProperty(value = "The Type of the source tranasction. This will be ACCPAY if the linked transaction was created from an invoice and SPEND if it was created from a bank transaction.")
  public SourceTransactionTypeCodeEnum getSourceTransactionTypeCode() {
    return sourceTransactionTypeCode;
  }

  public void setSourceTransactionTypeCode(SourceTransactionTypeCodeEnum sourceTransactionTypeCode) {
    this.sourceTransactionTypeCode = sourceTransactionTypeCode;
  }

  public LinkedTransaction validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public LinkedTransaction addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Displays array of validation error messages from the API
   * @return validationErrors
  **/
  @ApiModelProperty(value = "Displays array of validation error messages from the API")
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedTransaction linkedTransaction = (LinkedTransaction) o;
    return Objects.equals(this.sourceTransactionID, linkedTransaction.sourceTransactionID) &&
        Objects.equals(this.sourceLineItemID, linkedTransaction.sourceLineItemID) &&
        Objects.equals(this.contactID, linkedTransaction.contactID) &&
        Objects.equals(this.targetTransactionID, linkedTransaction.targetTransactionID) &&
        Objects.equals(this.targetLineItemID, linkedTransaction.targetLineItemID) &&
        Objects.equals(this.linkedTransactionID, linkedTransaction.linkedTransactionID) &&
        Objects.equals(this.status, linkedTransaction.status) &&
        Objects.equals(this.type, linkedTransaction.type) &&
        Objects.equals(this.updatedDateUTC, linkedTransaction.updatedDateUTC) &&
        Objects.equals(this.sourceTransactionTypeCode, linkedTransaction.sourceTransactionTypeCode) &&
        Objects.equals(this.validationErrors, linkedTransaction.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceTransactionID, sourceLineItemID, contactID, targetTransactionID, targetLineItemID, linkedTransactionID, status, type, updatedDateUTC, sourceTransactionTypeCode, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedTransaction {\n");
    sb.append("    sourceTransactionID: ").append(toIndentedString(sourceTransactionID)).append("\n");
    sb.append("    sourceLineItemID: ").append(toIndentedString(sourceLineItemID)).append("\n");
    sb.append("    contactID: ").append(toIndentedString(contactID)).append("\n");
    sb.append("    targetTransactionID: ").append(toIndentedString(targetTransactionID)).append("\n");
    sb.append("    targetLineItemID: ").append(toIndentedString(targetLineItemID)).append("\n");
    sb.append("    linkedTransactionID: ").append(toIndentedString(linkedTransactionID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    sourceTransactionTypeCode: ").append(toIndentedString(sourceTransactionTypeCode)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

