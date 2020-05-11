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
import com.xero.models.accounting.JournalLine;
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
 * Journal
 */

public class Journal {
  StringUtil util = new StringUtil();

  @JsonProperty("JournalID")
  private UUID journalID;

  @JsonProperty("JournalDate")
  private String journalDate;

  @JsonProperty("JournalNumber")
  private Integer journalNumber;

  @JsonProperty("CreatedDateUTC")
  private String createdDateUTC;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("SourceID")
  private UUID sourceID;
  /**
   * The journal source type. The type of transaction that created the journal
   */
  public enum SourceTypeEnum {
    ACCREC("ACCREC"),
    
    ACCPAY("ACCPAY"),
    
    ACCRECCREDIT("ACCRECCREDIT"),
    
    ACCPAYCREDIT("ACCPAYCREDIT"),
    
    ACCRECPAYMENT("ACCRECPAYMENT"),
    
    ACCPAYPAYMENT("ACCPAYPAYMENT"),
    
    ARCREDITPAYMENT("ARCREDITPAYMENT"),
    
    APCREDITPAYMENT("APCREDITPAYMENT"),
    
    CASHREC("CASHREC"),
    
    CASHPAID("CASHPAID"),
    
    TRANSFER("TRANSFER"),
    
    ARPREPAYMENT("ARPREPAYMENT"),
    
    APPREPAYMENT("APPREPAYMENT"),
    
    AROVERPAYMENT("AROVERPAYMENT"),
    
    APOVERPAYMENT("APOVERPAYMENT"),
    
    EXPCLAIM("EXPCLAIM"),
    
    EXPPAYMENT("EXPPAYMENT"),
    
    MANJOURNAL("MANJOURNAL"),
    
    PAYSLIP("PAYSLIP"),
    
    WAGEPAYABLE("WAGEPAYABLE"),
    
    INTEGRATEDPAYROLLPE("INTEGRATEDPAYROLLPE"),
    
    INTEGRATEDPAYROLLPT("INTEGRATEDPAYROLLPT"),
    
    EXTERNALSPENDMONEY("EXTERNALSPENDMONEY"),
    
    INTEGRATEDPAYROLLPTPAYMENT("INTEGRATEDPAYROLLPTPAYMENT"),
    
    INTEGRATEDPAYROLLCN("INTEGRATEDPAYROLLCN");

    private String value;

    SourceTypeEnum(String value) {
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
    public static SourceTypeEnum fromValue(String value) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @JsonProperty("SourceType")
  private SourceTypeEnum sourceType;

  @JsonProperty("JournalLines")
  private List<JournalLine> journalLines = new ArrayList<JournalLine>();
  public Journal journalID(UUID journalID) {
    this.journalID = journalID;
    return this;
  }

   /**
   * Xero identifier
   * @return journalID
  **/
  @ApiModelProperty(value = "Xero identifier")
  public UUID getJournalID() {
    return journalID;
  }

  public void setJournalID(UUID journalID) {
    this.journalID = journalID;
  }

  public Journal journalDate(String journalDate) {
    this.journalDate = journalDate;
    return this;
  }

   /**
   * Date the journal was posted
   * @return journalDate
  **/
  @ApiModelProperty(value = "Date the journal was posted")
  public String getJournalDate() {
    return journalDate;
  }
  public LocalDate getJournalDateAsDate() {
    if (this.journalDate != null) {
      try {
        return util.convertStringToDate(this.journalDate);
      } catch (IOException e) {
        e.printStackTrace();
      }  
    }
    return null;        
  }

  public void setJournalDate(String journalDate) {
    this.journalDate = journalDate;
  }

  public void setJournalDate(LocalDate journalDate) {
    //CONVERT LocalDate args into MS DateFromat String
    Instant instant =  journalDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();  
    long timeInMillis = instant.toEpochMilli();

    this.journalDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public Journal journalNumber(Integer journalNumber) {
    this.journalNumber = journalNumber;
    return this;
  }

   /**
   * Xero generated journal number
   * @return journalNumber
  **/
  @ApiModelProperty(value = "Xero generated journal number")
  public Integer getJournalNumber() {
    return journalNumber;
  }

  public void setJournalNumber(Integer journalNumber) {
    this.journalNumber = journalNumber;
  }

   /**
   * Created date UTC format
   * @return createdDateUTC
  **/
  @ApiModelProperty(example = "/Date(1573755038314)/", value = "Created date UTC format")
  public String getCreatedDateUTC() {
    return createdDateUTC;
  }
  public OffsetDateTime getCreatedDateUTCAsDate() {
    if (this.createdDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.createdDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }  
    }
    return null;        
  }

  public Journal reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * reference field for additional indetifying information
   * @return reference
  **/
  @ApiModelProperty(value = "reference field for additional indetifying information")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Journal sourceID(UUID sourceID) {
    this.sourceID = sourceID;
    return this;
  }

   /**
   * The identifier for the source transaction (e.g. InvoiceID)
   * @return sourceID
  **/
  @ApiModelProperty(value = "The identifier for the source transaction (e.g. InvoiceID)")
  public UUID getSourceID() {
    return sourceID;
  }

  public void setSourceID(UUID sourceID) {
    this.sourceID = sourceID;
  }

  public Journal sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * The journal source type. The type of transaction that created the journal
   * @return sourceType
  **/
  @ApiModelProperty(value = "The journal source type. The type of transaction that created the journal")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public Journal journalLines(List<JournalLine> journalLines) {
    this.journalLines = journalLines;
    return this;
  }

  public Journal addJournalLinesItem(JournalLine journalLinesItem) {
    if (this.journalLines == null) {
      this.journalLines = new ArrayList<JournalLine>();
    }
    this.journalLines.add(journalLinesItem);
    return this;
  }

   /**
   * See JournalLines
   * @return journalLines
  **/
  @ApiModelProperty(value = "See JournalLines")
  public List<JournalLine> getJournalLines() {
    return journalLines;
  }

  public void setJournalLines(List<JournalLine> journalLines) {
    this.journalLines = journalLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Journal journal = (Journal) o;
    return Objects.equals(this.journalID, journal.journalID) &&
        Objects.equals(this.journalDate, journal.journalDate) &&
        Objects.equals(this.journalNumber, journal.journalNumber) &&
        Objects.equals(this.createdDateUTC, journal.createdDateUTC) &&
        Objects.equals(this.reference, journal.reference) &&
        Objects.equals(this.sourceID, journal.sourceID) &&
        Objects.equals(this.sourceType, journal.sourceType) &&
        Objects.equals(this.journalLines, journal.journalLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(journalID, journalDate, journalNumber, createdDateUTC, reference, sourceID, sourceType, journalLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Journal {\n");
    sb.append("    journalID: ").append(toIndentedString(journalID)).append("\n");
    sb.append("    journalDate: ").append(toIndentedString(journalDate)).append("\n");
    sb.append("    journalNumber: ").append(toIndentedString(journalNumber)).append("\n");
    sb.append("    createdDateUTC: ").append(toIndentedString(createdDateUTC)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sourceID: ").append(toIndentedString(sourceID)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    journalLines: ").append(toIndentedString(journalLines)).append("\n");
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

