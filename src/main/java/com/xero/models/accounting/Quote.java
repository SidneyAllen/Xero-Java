/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.2.4
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;

/** Quote */
public class Quote {
  StringUtil util = new StringUtil();

  @JsonProperty("QuoteID")
  private UUID quoteID;

  @JsonProperty("QuoteNumber")
  private String quoteNumber;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("Terms")
  private String terms;

  @JsonProperty("Contact")
  private Contact contact;

  @JsonProperty("LineItems")
  private List<LineItem> lineItems = new ArrayList<LineItem>();

  @JsonProperty("Date")
  private String date;

  @JsonProperty("DateString")
  private String dateString;

  @JsonProperty("ExpiryDate")
  private String expiryDate;

  @JsonProperty("ExpiryDateString")
  private String expiryDateString;

  @JsonProperty("Status")
  private QuoteStatusCodes status;

  @JsonProperty("CurrencyCode")
  private CurrencyCode currencyCode;

  @JsonProperty("CurrencyRate")
  private Double currencyRate;

  @JsonProperty("SubTotal")
  private Double subTotal;

  @JsonProperty("TotalTax")
  private Double totalTax;

  @JsonProperty("Total")
  private Double total;

  @JsonProperty("TotalDiscount")
  private Double totalDiscount;

  @JsonProperty("Title")
  private String title;

  @JsonProperty("Summary")
  private String summary;

  @JsonProperty("BrandingThemeID")
  private UUID brandingThemeID;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("LineAmountTypes")
  private QuoteLineAmountTypes lineAmountTypes;

  @JsonProperty("StatusAttributeString")
  private String statusAttributeString;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

  public Quote quoteID(UUID quoteID) {
    this.quoteID = quoteID;
    return this;
  }

  /**
   * QuoteID GUID is automatically generated and is returned after create or GET.
   *
   * @return quoteID
   */
  @ApiModelProperty(
      value = "QuoteID GUID is automatically generated and is returned after create or GET.")
  public UUID getQuoteID() {
    return quoteID;
  }

  public void setQuoteID(UUID quoteID) {
    this.quoteID = quoteID;
  }

  public Quote quoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
    return this;
  }

  /**
   * Unique alpha numeric code identifying a quote (Max Length &#x3D; 255)
   *
   * @return quoteNumber
   */
  @ApiModelProperty(value = "Unique alpha numeric code identifying a quote (Max Length = 255)")
  public String getQuoteNumber() {
    return quoteNumber;
  }

  public void setQuoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
  }

  public Quote reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Additional reference number
   *
   * @return reference
   */
  @ApiModelProperty(value = "Additional reference number")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Quote terms(String terms) {
    this.terms = terms;
    return this;
  }

  /**
   * Terms of the quote
   *
   * @return terms
   */
  @ApiModelProperty(value = "Terms of the quote")
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public Quote contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   *
   * @return contact
   */
  @ApiModelProperty(value = "")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Quote lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Quote addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * See LineItems
   *
   * @return lineItems
   */
  @ApiModelProperty(value = "See LineItems")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public Quote date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Date quote was issued – YYYY-MM-DD. If the Date element is not specified it will default to the
   * current date based on the timezone setting of the organisation
   *
   * @return date
   */
  @ApiModelProperty(
      value =
          "Date quote was issued – YYYY-MM-DD. If the Date element is not specified it will"
              + " default to the current date based on the timezone setting of the organisation")
  public String getDate() {
    return date;
  }

  public LocalDate getDateAsDate() {
    if (this.date != null) {
      try {
        return util.convertStringToDate(this.date);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = date.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.date = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public Quote dateString(String dateString) {
    this.dateString = dateString;
    return this;
  }

  /**
   * Date the quote was issued (YYYY-MM-DD)
   *
   * @return dateString
   */
  @ApiModelProperty(value = "Date the quote was issued (YYYY-MM-DD)")
  public String getDateString() {
    return dateString;
  }

  public void setDateString(String dateString) {
    this.dateString = dateString;
  }

  public Quote expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Date the quote expires – YYYY-MM-DD.
   *
   * @return expiryDate
   */
  @ApiModelProperty(value = "Date the quote expires – YYYY-MM-DD.")
  public String getExpiryDate() {
    return expiryDate;
  }

  public LocalDate getExpiryDateAsDate() {
    if (this.expiryDate != null) {
      try {
        return util.convertStringToDate(this.expiryDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public void setExpiryDate(LocalDate expiryDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = expiryDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.expiryDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public Quote expiryDateString(String expiryDateString) {
    this.expiryDateString = expiryDateString;
    return this;
  }

  /**
   * Date the quote expires – YYYY-MM-DD.
   *
   * @return expiryDateString
   */
  @ApiModelProperty(value = "Date the quote expires – YYYY-MM-DD.")
  public String getExpiryDateString() {
    return expiryDateString;
  }

  public void setExpiryDateString(String expiryDateString) {
    this.expiryDateString = expiryDateString;
  }

  public Quote status(QuoteStatusCodes status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public QuoteStatusCodes getStatus() {
    return status;
  }

  public void setStatus(QuoteStatusCodes status) {
    this.status = status;
  }

  public Quote currencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   *
   * @return currencyCode
   */
  @ApiModelProperty(value = "")
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Quote currencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

  /**
   * The currency rate for a multicurrency quote
   *
   * @return currencyRate
   */
  @ApiModelProperty(value = "The currency rate for a multicurrency quote")
  public Double getCurrencyRate() {
    return currencyRate;
  }

  public void setCurrencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
  }

  /**
   * Total of quote excluding taxes.
   *
   * @return subTotal
   */
  @ApiModelProperty(value = "Total of quote excluding taxes.")
  public Double getSubTotal() {
    return subTotal;
  }

  /**
   * Total tax on quote
   *
   * @return totalTax
   */
  @ApiModelProperty(value = "Total tax on quote")
  public Double getTotalTax() {
    return totalTax;
  }

  /**
   * Total of Quote tax inclusive (i.e. SubTotal + TotalTax). This will be ignored if it doesn’t
   * equal the sum of the LineAmounts
   *
   * @return total
   */
  @ApiModelProperty(
      value =
          "Total of Quote tax inclusive (i.e. SubTotal + TotalTax). This will be ignored if it"
              + " doesn’t equal the sum of the LineAmounts")
  public Double getTotal() {
    return total;
  }

  /**
   * Total of discounts applied on the quote line items
   *
   * @return totalDiscount
   */
  @ApiModelProperty(value = "Total of discounts applied on the quote line items")
  public Double getTotalDiscount() {
    return totalDiscount;
  }

  public Quote title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title text for the quote
   *
   * @return title
   */
  @ApiModelProperty(value = "Title text for the quote")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Quote summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Summary text for the quote
   *
   * @return summary
   */
  @ApiModelProperty(value = "Summary text for the quote")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Quote brandingThemeID(UUID brandingThemeID) {
    this.brandingThemeID = brandingThemeID;
    return this;
  }

  /**
   * See BrandingThemes
   *
   * @return brandingThemeID
   */
  @ApiModelProperty(value = "See BrandingThemes")
  public UUID getBrandingThemeID() {
    return brandingThemeID;
  }

  public void setBrandingThemeID(UUID brandingThemeID) {
    this.brandingThemeID = brandingThemeID;
  }

  /**
   * Last modified date UTC format
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1573755038314)/", value = "Last modified date UTC format")
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

  public Quote lineAmountTypes(QuoteLineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
    return this;
  }

  /**
   * Get lineAmountTypes
   *
   * @return lineAmountTypes
   */
  @ApiModelProperty(value = "")
  public QuoteLineAmountTypes getLineAmountTypes() {
    return lineAmountTypes;
  }

  public void setLineAmountTypes(QuoteLineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
  }

  public Quote statusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
    return this;
  }

  /**
   * A string to indicate if a invoice status
   *
   * @return statusAttributeString
   */
  @ApiModelProperty(value = "A string to indicate if a invoice status")
  public String getStatusAttributeString() {
    return statusAttributeString;
  }

  public void setStatusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
  }

  public Quote validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Quote addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @return validationErrors
   */
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
    Quote quote = (Quote) o;
    return Objects.equals(this.quoteID, quote.quoteID)
        && Objects.equals(this.quoteNumber, quote.quoteNumber)
        && Objects.equals(this.reference, quote.reference)
        && Objects.equals(this.terms, quote.terms)
        && Objects.equals(this.contact, quote.contact)
        && Objects.equals(this.lineItems, quote.lineItems)
        && Objects.equals(this.date, quote.date)
        && Objects.equals(this.dateString, quote.dateString)
        && Objects.equals(this.expiryDate, quote.expiryDate)
        && Objects.equals(this.expiryDateString, quote.expiryDateString)
        && Objects.equals(this.status, quote.status)
        && Objects.equals(this.currencyCode, quote.currencyCode)
        && Objects.equals(this.currencyRate, quote.currencyRate)
        && Objects.equals(this.subTotal, quote.subTotal)
        && Objects.equals(this.totalTax, quote.totalTax)
        && Objects.equals(this.total, quote.total)
        && Objects.equals(this.totalDiscount, quote.totalDiscount)
        && Objects.equals(this.title, quote.title)
        && Objects.equals(this.summary, quote.summary)
        && Objects.equals(this.brandingThemeID, quote.brandingThemeID)
        && Objects.equals(this.updatedDateUTC, quote.updatedDateUTC)
        && Objects.equals(this.lineAmountTypes, quote.lineAmountTypes)
        && Objects.equals(this.statusAttributeString, quote.statusAttributeString)
        && Objects.equals(this.validationErrors, quote.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        quoteID,
        quoteNumber,
        reference,
        terms,
        contact,
        lineItems,
        date,
        dateString,
        expiryDate,
        expiryDateString,
        status,
        currencyCode,
        currencyRate,
        subTotal,
        totalTax,
        total,
        totalDiscount,
        title,
        summary,
        brandingThemeID,
        updatedDateUTC,
        lineAmountTypes,
        statusAttributeString,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quote {\n");
    sb.append("    quoteID: ").append(toIndentedString(quoteID)).append("\n");
    sb.append("    quoteNumber: ").append(toIndentedString(quoteNumber)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateString: ").append(toIndentedString(dateString)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    expiryDateString: ").append(toIndentedString(expiryDateString)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    brandingThemeID: ").append(toIndentedString(brandingThemeID)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    lineAmountTypes: ").append(toIndentedString(lineAmountTypes)).append("\n");
    sb.append("    statusAttributeString: ")
        .append(toIndentedString(statusAttributeString))
        .append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
