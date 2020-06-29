/*
 * Xero Projects API
 * This is the Xero Projects API
 *
 * The version of the OpenAPI document: 2.2.4
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.project;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

import com.xero.api.StringUtil;

/** Task */
public class Task {
  StringUtil util = new StringUtil();

  @JsonProperty("taskId")
  private UUID taskId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("rate")
  private Amount rate;

  @JsonProperty("chargeType")
  private ChargeType chargeType;

  @JsonProperty("estimateMinutes")
  private Double estimateMinutes;

  @JsonProperty("projectId")
  private UUID projectId;

  @JsonProperty("totalMinutes")
  private Double totalMinutes;

  @JsonProperty("totalAmount")
  private Amount totalAmount;

  @JsonProperty("minutesInvoiced")
  private Double minutesInvoiced;

  @JsonProperty("minutesToBeInvoiced")
  private Double minutesToBeInvoiced;

  @JsonProperty("fixedMinutes")
  private Double fixedMinutes;

  @JsonProperty("nonChargeableMinutes")
  private Double nonChargeableMinutes;

  @JsonProperty("amountToBeInvoiced")
  private Amount amountToBeInvoiced;

  @JsonProperty("amountInvoiced")
  private Amount amountInvoiced;
  /**
   * Status of the task. When a task of ChargeType is &#x60;FIXED&#x60; and the rate amount is
   * invoiced the status will be set to &#x60;INVOICED&#x60; and can&#39;t be modified. A task with
   * ChargeType of &#x60;TIME&#x60; or &#x60;NON_CHARGEABLE&#x60; cannot have a status of
   * &#x60;INVOICED&#x60;. A &#x60;LOCKED&#x60; state indicates that the task is currently changing
   * state (for example being invoiced) and can&#39;t be modified.
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),

    INVOICED("INVOICED"),

    LOCKED("LOCKED");

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

  @JsonProperty("status")
  private StatusEnum status;

  public Task taskId(UUID taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Identifier of the task.
   *
   * @return taskId
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      value = "Identifier of the task.")
  public UUID getTaskId() {
    return taskId;
  }

  public void setTaskId(UUID taskId) {
    this.taskId = taskId;
  }

  public Task name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the task.
   *
   * @return name
   */
  @ApiModelProperty(value = "Name of the task.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Task rate(Amount rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   *
   * @return rate
   */
  @ApiModelProperty(value = "")
  public Amount getRate() {
    return rate;
  }

  public void setRate(Amount rate) {
    this.rate = rate;
  }

  public Task chargeType(ChargeType chargeType) {
    this.chargeType = chargeType;
    return this;
  }

  /**
   * Get chargeType
   *
   * @return chargeType
   */
  @ApiModelProperty(value = "")
  public ChargeType getChargeType() {
    return chargeType;
  }

  public void setChargeType(ChargeType chargeType) {
    this.chargeType = chargeType;
  }

  public Task estimateMinutes(Double estimateMinutes) {
    this.estimateMinutes = estimateMinutes;
    return this;
  }

  /**
   * An estimated time to perform the task
   *
   * @return estimateMinutes
   */
  @ApiModelProperty(value = "An estimated time to perform the task")
  public Double getEstimateMinutes() {
    return estimateMinutes;
  }

  public void setEstimateMinutes(Double estimateMinutes) {
    this.estimateMinutes = estimateMinutes;
  }

  public Task projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Identifier of the project task belongs to.
   *
   * @return projectId
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      value = "Identifier of the project task belongs to.")
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }

  public Task totalMinutes(Double totalMinutes) {
    this.totalMinutes = totalMinutes;
    return this;
  }

  /**
   * Total minutes which have been logged against the task. Logged by assigning a time entry to a
   * task
   *
   * @return totalMinutes
   */
  @ApiModelProperty(
      value =
          "Total minutes which have been logged against the task. Logged by assigning a time entry"
              + " to a task")
  public Double getTotalMinutes() {
    return totalMinutes;
  }

  public void setTotalMinutes(Double totalMinutes) {
    this.totalMinutes = totalMinutes;
  }

  public Task totalAmount(Amount totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   *
   * @return totalAmount
   */
  @ApiModelProperty(value = "")
  public Amount getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Amount totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Task minutesInvoiced(Double minutesInvoiced) {
    this.minutesInvoiced = minutesInvoiced;
    return this;
  }

  /**
   * Minutes on this task which have been invoiced.
   *
   * @return minutesInvoiced
   */
  @ApiModelProperty(value = "Minutes on this task which have been invoiced.")
  public Double getMinutesInvoiced() {
    return minutesInvoiced;
  }

  public void setMinutesInvoiced(Double minutesInvoiced) {
    this.minutesInvoiced = minutesInvoiced;
  }

  public Task minutesToBeInvoiced(Double minutesToBeInvoiced) {
    this.minutesToBeInvoiced = minutesToBeInvoiced;
    return this;
  }

  /**
   * Minutes on this task which have not been invoiced.
   *
   * @return minutesToBeInvoiced
   */
  @ApiModelProperty(value = "Minutes on this task which have not been invoiced.")
  public Double getMinutesToBeInvoiced() {
    return minutesToBeInvoiced;
  }

  public void setMinutesToBeInvoiced(Double minutesToBeInvoiced) {
    this.minutesToBeInvoiced = minutesToBeInvoiced;
  }

  public Task fixedMinutes(Double fixedMinutes) {
    this.fixedMinutes = fixedMinutes;
    return this;
  }

  /**
   * Minutes logged against this task if its charge type is &#x60;FIXED&#x60;.
   *
   * @return fixedMinutes
   */
  @ApiModelProperty(value = "Minutes logged against this task if its charge type is `FIXED`.")
  public Double getFixedMinutes() {
    return fixedMinutes;
  }

  public void setFixedMinutes(Double fixedMinutes) {
    this.fixedMinutes = fixedMinutes;
  }

  public Task nonChargeableMinutes(Double nonChargeableMinutes) {
    this.nonChargeableMinutes = nonChargeableMinutes;
    return this;
  }

  /**
   * Minutes logged against this task if its charge type is &#x60;NON_CHARGEABLE&#x60;.
   *
   * @return nonChargeableMinutes
   */
  @ApiModelProperty(
      value = "Minutes logged against this task if its charge type is `NON_CHARGEABLE`.")
  public Double getNonChargeableMinutes() {
    return nonChargeableMinutes;
  }

  public void setNonChargeableMinutes(Double nonChargeableMinutes) {
    this.nonChargeableMinutes = nonChargeableMinutes;
  }

  public Task amountToBeInvoiced(Amount amountToBeInvoiced) {
    this.amountToBeInvoiced = amountToBeInvoiced;
    return this;
  }

  /**
   * Get amountToBeInvoiced
   *
   * @return amountToBeInvoiced
   */
  @ApiModelProperty(value = "")
  public Amount getAmountToBeInvoiced() {
    return amountToBeInvoiced;
  }

  public void setAmountToBeInvoiced(Amount amountToBeInvoiced) {
    this.amountToBeInvoiced = amountToBeInvoiced;
  }

  public Task amountInvoiced(Amount amountInvoiced) {
    this.amountInvoiced = amountInvoiced;
    return this;
  }

  /**
   * Get amountInvoiced
   *
   * @return amountInvoiced
   */
  @ApiModelProperty(value = "")
  public Amount getAmountInvoiced() {
    return amountInvoiced;
  }

  public void setAmountInvoiced(Amount amountInvoiced) {
    this.amountInvoiced = amountInvoiced;
  }

  public Task status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the task. When a task of ChargeType is &#x60;FIXED&#x60; and the rate amount is
   * invoiced the status will be set to &#x60;INVOICED&#x60; and can&#39;t be modified. A task with
   * ChargeType of &#x60;TIME&#x60; or &#x60;NON_CHARGEABLE&#x60; cannot have a status of
   * &#x60;INVOICED&#x60;. A &#x60;LOCKED&#x60; state indicates that the task is currently changing
   * state (for example being invoiced) and can&#39;t be modified.
   *
   * @return status
   */
  @ApiModelProperty(
      value =
          "Status of the task. When a task of ChargeType is `FIXED` and the rate amount is"
              + " invoiced the status will be set to `INVOICED` and can't be modified. A task with"
              + " ChargeType of `TIME` or `NON_CHARGEABLE` cannot have a status of `INVOICED`. A"
              + " `LOCKED` state indicates that the task is currently changing state (for example"
              + " being invoiced) and can't be modified.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.taskId, task.taskId)
        && Objects.equals(this.name, task.name)
        && Objects.equals(this.rate, task.rate)
        && Objects.equals(this.chargeType, task.chargeType)
        && Objects.equals(this.estimateMinutes, task.estimateMinutes)
        && Objects.equals(this.projectId, task.projectId)
        && Objects.equals(this.totalMinutes, task.totalMinutes)
        && Objects.equals(this.totalAmount, task.totalAmount)
        && Objects.equals(this.minutesInvoiced, task.minutesInvoiced)
        && Objects.equals(this.minutesToBeInvoiced, task.minutesToBeInvoiced)
        && Objects.equals(this.fixedMinutes, task.fixedMinutes)
        && Objects.equals(this.nonChargeableMinutes, task.nonChargeableMinutes)
        && Objects.equals(this.amountToBeInvoiced, task.amountToBeInvoiced)
        && Objects.equals(this.amountInvoiced, task.amountInvoiced)
        && Objects.equals(this.status, task.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        taskId,
        name,
        rate,
        chargeType,
        estimateMinutes,
        projectId,
        totalMinutes,
        totalAmount,
        minutesInvoiced,
        minutesToBeInvoiced,
        fixedMinutes,
        nonChargeableMinutes,
        amountToBeInvoiced,
        amountInvoiced,
        status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    estimateMinutes: ").append(toIndentedString(estimateMinutes)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    totalMinutes: ").append(toIndentedString(totalMinutes)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    minutesInvoiced: ").append(toIndentedString(minutesInvoiced)).append("\n");
    sb.append("    minutesToBeInvoiced: ")
        .append(toIndentedString(minutesToBeInvoiced))
        .append("\n");
    sb.append("    fixedMinutes: ").append(toIndentedString(fixedMinutes)).append("\n");
    sb.append("    nonChargeableMinutes: ")
        .append(toIndentedString(nonChargeableMinutes))
        .append("\n");
    sb.append("    amountToBeInvoiced: ").append(toIndentedString(amountToBeInvoiced)).append("\n");
    sb.append("    amountInvoiced: ").append(toIndentedString(amountInvoiced)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
