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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.AccountType;
import com.xero.models.accounting.CurrencyCode;
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
 * Account
 */

public class Account {
  StringUtil util = new StringUtil();

  @JsonProperty("Code")
  private String code;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("AccountID")
  private UUID accountID;

  @JsonProperty("Type")
  private AccountType type;

  @JsonProperty("BankAccountNumber")
  private String bankAccountNumber;
  /**
   * Accounts with a status of ACTIVE can be updated to ARCHIVED. See Account Status Codes
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    ARCHIVED("ARCHIVED"),
    
    DELETED("DELETED");

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

  @JsonProperty("Description")
  private String description;
  /**
   * For bank accounts only. See Bank Account types
   */
  public enum BankAccountTypeEnum {
    BANK("BANK"),
    
    CREDITCARD("CREDITCARD"),
    
    PAYPAL("PAYPAL"),
    
    NONE("NONE"),
    
    EMPTY("");

    private String value;

    BankAccountTypeEnum(String value) {
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
    public static BankAccountTypeEnum fromValue(String value) {
      for (BankAccountTypeEnum b : BankAccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @JsonProperty("BankAccountType")
  private BankAccountTypeEnum bankAccountType;

  @JsonProperty("CurrencyCode")
  private CurrencyCode currencyCode;

  @JsonProperty("TaxType")
  private String taxType;

  @JsonProperty("EnablePaymentsToAccount")
  private Boolean enablePaymentsToAccount;

  @JsonProperty("ShowInExpenseClaims")
  private Boolean showInExpenseClaims;
  /**
   * See Account Class Types
   */
  public enum PropertyClassEnum {
    ASSET("ASSET"),
    
    EQUITY("EQUITY"),
    
    EXPENSE("EXPENSE"),
    
    LIABILITY("LIABILITY"),
    
    REVENUE("REVENUE");

    private String value;

    PropertyClassEnum(String value) {
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
    public static PropertyClassEnum fromValue(String value) {
      for (PropertyClassEnum b : PropertyClassEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @JsonProperty("Class")
  private PropertyClassEnum propertyClass;
  /**
   * If this is a system account then this element is returned. See System Account types. Note that non-system accounts may have this element set as either “” or null.
   */
  public enum SystemAccountEnum {
    DEBTORS("DEBTORS"),
    
    CREDITORS("CREDITORS"),
    
    BANKCURRENCYGAIN("BANKCURRENCYGAIN"),
    
    GST("GST"),
    
    GSTONIMPORTS("GSTONIMPORTS"),
    
    HISTORICAL("HISTORICAL"),
    
    REALISEDCURRENCYGAIN("REALISEDCURRENCYGAIN"),
    
    RETAINEDEARNINGS("RETAINEDEARNINGS"),
    
    ROUNDING("ROUNDING"),
    
    TRACKINGTRANSFERS("TRACKINGTRANSFERS"),
    
    UNPAIDEXPCLM("UNPAIDEXPCLM"),
    
    UNREALISEDCURRENCYGAIN("UNREALISEDCURRENCYGAIN"),
    
    WAGEPAYABLES("WAGEPAYABLES"),
    
    CISASSETS("CISASSETS"),
    
    CISASSET("CISASSET"),
    
    CISLABOUR("CISLABOUR"),
    
    CISLABOUREXPENSE("CISLABOUREXPENSE"),
    
    CISLABOURINCOME("CISLABOURINCOME"),
    
    CISLIABILITY("CISLIABILITY"),
    
    CISMATERIALS("CISMATERIALS"),
    
    EMPTY("");

    private String value;

    SystemAccountEnum(String value) {
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
    public static SystemAccountEnum fromValue(String value) {
      for (SystemAccountEnum b : SystemAccountEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @JsonProperty("SystemAccount")
  private SystemAccountEnum systemAccount;

  @JsonProperty("ReportingCode")
  private String reportingCode;

  @JsonProperty("ReportingCodeName")
  private String reportingCodeName;

  @JsonProperty("HasAttachments")
  private Boolean hasAttachments = false;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("AddToWatchlist")
  private Boolean addToWatchlist;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();
  public Account code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Customer defined alpha numeric account code e.g 200 or SALES (max length &#x3D; 10)
   * @return code
  **/
  @ApiModelProperty(example = "4400", value = "Customer defined alpha numeric account code e.g 200 or SALES (max length = 10)")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Account name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of account (max length &#x3D; 150)
   * @return name
  **/
  @ApiModelProperty(example = "Food Sales", value = "Name of account (max length = 150)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account accountID(UUID accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * The Xero identifier for an account – specified as a string following  the endpoint name   e.g. /297c2dc5-cc47-4afd-8ec8-74990b8761e9
   * @return accountID
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "The Xero identifier for an account – specified as a string following  the endpoint name   e.g. /297c2dc5-cc47-4afd-8ec8-74990b8761e9")
  public UUID getAccountID() {
    return accountID;
  }

  public void setAccountID(UUID accountID) {
    this.accountID = accountID;
  }

  public Account type(AccountType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public AccountType getType() {
    return type;
  }

  public void setType(AccountType type) {
    this.type = type;
  }

  public Account bankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * For bank accounts only (Account Type BANK)
   * @return bankAccountNumber
  **/
  @ApiModelProperty(value = "For bank accounts only (Account Type BANK)")
  public String getBankAccountNumber() {
    return bankAccountNumber;
  }

  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }

  public Account status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Accounts with a status of ACTIVE can be updated to ARCHIVED. See Account Status Codes
   * @return status
  **/
  @ApiModelProperty(value = "Accounts with a status of ACTIVE can be updated to ARCHIVED. See Account Status Codes")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Account description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the Account. Valid for all types of accounts except bank accounts (max length &#x3D; 4000)
   * @return description
  **/
  @ApiModelProperty(value = "Description of the Account. Valid for all types of accounts except bank accounts (max length = 4000)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Account bankAccountType(BankAccountTypeEnum bankAccountType) {
    this.bankAccountType = bankAccountType;
    return this;
  }

   /**
   * For bank accounts only. See Bank Account types
   * @return bankAccountType
  **/
  @ApiModelProperty(value = "For bank accounts only. See Bank Account types")
  public BankAccountTypeEnum getBankAccountType() {
    return bankAccountType;
  }

  public void setBankAccountType(BankAccountTypeEnum bankAccountType) {
    this.bankAccountType = bankAccountType;
  }

  public Account currencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Account taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * The tax type from TaxRates
   * @return taxType
  **/
  @ApiModelProperty(value = "The tax type from TaxRates")
  public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  public Account enablePaymentsToAccount(Boolean enablePaymentsToAccount) {
    this.enablePaymentsToAccount = enablePaymentsToAccount;
    return this;
  }

   /**
   * Boolean – describes whether account can have payments applied to it
   * @return enablePaymentsToAccount
  **/
  @ApiModelProperty(value = "Boolean – describes whether account can have payments applied to it")
  public Boolean getEnablePaymentsToAccount() {
    return enablePaymentsToAccount;
  }

  public void setEnablePaymentsToAccount(Boolean enablePaymentsToAccount) {
    this.enablePaymentsToAccount = enablePaymentsToAccount;
  }

  public Account showInExpenseClaims(Boolean showInExpenseClaims) {
    this.showInExpenseClaims = showInExpenseClaims;
    return this;
  }

   /**
   * Boolean – describes whether account code is available for use with expense claims
   * @return showInExpenseClaims
  **/
  @ApiModelProperty(value = "Boolean – describes whether account code is available for use with expense claims")
  public Boolean getShowInExpenseClaims() {
    return showInExpenseClaims;
  }

  public void setShowInExpenseClaims(Boolean showInExpenseClaims) {
    this.showInExpenseClaims = showInExpenseClaims;
  }

   /**
   * See Account Class Types
   * @return propertyClass
  **/
  @ApiModelProperty(value = "See Account Class Types")
  public PropertyClassEnum getPropertyClass() {
    return propertyClass;
  }

   /**
   * If this is a system account then this element is returned. See System Account types. Note that non-system accounts may have this element set as either “” or null.
   * @return systemAccount
  **/
  @ApiModelProperty(value = "If this is a system account then this element is returned. See System Account types. Note that non-system accounts may have this element set as either “” or null.")
  public SystemAccountEnum getSystemAccount() {
    return systemAccount;
  }

   /**
   * Shown if set
   * @return reportingCode
  **/
  @ApiModelProperty(value = "Shown if set")
  public String getReportingCode() {
    return reportingCode;
  }

   /**
   * Shown if set
   * @return reportingCodeName
  **/
  @ApiModelProperty(value = "Shown if set")
  public String getReportingCodeName() {
    return reportingCodeName;
  }

   /**
   * boolean to indicate if an account has an attachment (read only)
   * @return hasAttachments
  **/
  @ApiModelProperty(example = "false", value = "boolean to indicate if an account has an attachment (read only)")
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

   /**
   * Last modified date UTC format
   * @return updatedDateUTC
  **/
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

  public Account addToWatchlist(Boolean addToWatchlist) {
    this.addToWatchlist = addToWatchlist;
    return this;
  }

   /**
   * Boolean – describes whether the account is shown in the watchlist widget on the dashboard
   * @return addToWatchlist
  **/
  @ApiModelProperty(value = "Boolean – describes whether the account is shown in the watchlist widget on the dashboard")
  public Boolean getAddToWatchlist() {
    return addToWatchlist;
  }

  public void setAddToWatchlist(Boolean addToWatchlist) {
    this.addToWatchlist = addToWatchlist;
  }

  public Account validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Account addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    Account account = (Account) o;
    return Objects.equals(this.code, account.code) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.accountID, account.accountID) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.bankAccountNumber, account.bankAccountNumber) &&
        Objects.equals(this.status, account.status) &&
        Objects.equals(this.description, account.description) &&
        Objects.equals(this.bankAccountType, account.bankAccountType) &&
        Objects.equals(this.currencyCode, account.currencyCode) &&
        Objects.equals(this.taxType, account.taxType) &&
        Objects.equals(this.enablePaymentsToAccount, account.enablePaymentsToAccount) &&
        Objects.equals(this.showInExpenseClaims, account.showInExpenseClaims) &&
        Objects.equals(this.propertyClass, account.propertyClass) &&
        Objects.equals(this.systemAccount, account.systemAccount) &&
        Objects.equals(this.reportingCode, account.reportingCode) &&
        Objects.equals(this.reportingCodeName, account.reportingCodeName) &&
        Objects.equals(this.hasAttachments, account.hasAttachments) &&
        Objects.equals(this.updatedDateUTC, account.updatedDateUTC) &&
        Objects.equals(this.addToWatchlist, account.addToWatchlist) &&
        Objects.equals(this.validationErrors, account.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, accountID, type, bankAccountNumber, status, description, bankAccountType, currencyCode, taxType, enablePaymentsToAccount, showInExpenseClaims, propertyClass, systemAccount, reportingCode, reportingCodeName, hasAttachments, updatedDateUTC, addToWatchlist, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bankAccountType: ").append(toIndentedString(bankAccountType)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    enablePaymentsToAccount: ").append(toIndentedString(enablePaymentsToAccount)).append("\n");
    sb.append("    showInExpenseClaims: ").append(toIndentedString(showInExpenseClaims)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    systemAccount: ").append(toIndentedString(systemAccount)).append("\n");
    sb.append("    reportingCode: ").append(toIndentedString(reportingCode)).append("\n");
    sb.append("    reportingCodeName: ").append(toIndentedString(reportingCodeName)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    addToWatchlist: ").append(toIndentedString(addToWatchlist)).append("\n");
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

