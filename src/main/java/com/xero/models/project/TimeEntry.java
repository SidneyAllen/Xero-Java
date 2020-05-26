/*
 * Xero Projects API
 * This is the Xero Projects API
 *
 * The version of the OpenAPI document: 2.1.6
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.project;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
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
 * TimeEntry
 */

public class TimeEntry {
  StringUtil util = new StringUtil();

  @JsonProperty("timeEntryId")
  private UUID timeEntryId;

  @JsonProperty("userId")
  private UUID userId;

  @JsonProperty("projectId")
  private UUID projectId;

  @JsonProperty("taskId")
  private UUID taskId;

  @JsonProperty("dateUtc")
  private OffsetDateTime dateUtc;

  @JsonProperty("dateEnteredUtc")
  private OffsetDateTime dateEnteredUtc;

  @JsonProperty("duration")
  private Integer duration;

  @JsonProperty("description")
  private String description;
  /**
   * Status of the time entry. By default a time entry is created with status of &#x60;ACTIVE&#x60;. A &#x60;LOCKED&#x60; state indicates that the time entry is currently changing state (for example being invoiced). Updates are not allowed when in this state. It will have a status of INVOICED once it is invoiced.
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
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
  public TimeEntry timeEntryId(UUID timeEntryId) {
    this.timeEntryId = timeEntryId;
    return this;
  }

   /**
   * Identifier of the time entry.
   * @return timeEntryId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Identifier of the time entry.")
  public UUID getTimeEntryId() {
    return timeEntryId;
  }

  public void setTimeEntryId(UUID timeEntryId) {
    this.timeEntryId = timeEntryId;
  }

  public TimeEntry userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The xero user identifier of the person who logged time.
   * @return userId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "The xero user identifier of the person who logged time.")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public TimeEntry projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Identifier of the project, that the task (which the time entry is logged against) belongs to.
   * @return projectId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Identifier of the project, that the task (which the time entry is logged against) belongs to.")
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }

  public TimeEntry taskId(UUID taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Identifier of the task that time entry is logged against.
   * @return taskId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Identifier of the task that time entry is logged against.")
  public UUID getTaskId() {
    return taskId;
  }

  public void setTaskId(UUID taskId) {
    this.taskId = taskId;
  }

  public TimeEntry dateUtc(OffsetDateTime dateUtc) {
    this.dateUtc = dateUtc;
    return this;
  }

   /**
   * The date time that time entry is logged on. UTC Date Time in ISO-8601 format.
   * @return dateUtc
  **/
  @ApiModelProperty(value = "The date time that time entry is logged on. UTC Date Time in ISO-8601 format.")
  public OffsetDateTime getDateUtc() {
    return dateUtc;
  }

  public void setDateUtc(OffsetDateTime dateUtc) {
    this.dateUtc = dateUtc;
  }

  public TimeEntry dateEnteredUtc(OffsetDateTime dateEnteredUtc) {
    this.dateEnteredUtc = dateEnteredUtc;
    return this;
  }

   /**
   * The date time that time entry is created. UTC Date Time in ISO-8601 format. By default it is set to server time.
   * @return dateEnteredUtc
  **/
  @ApiModelProperty(value = "The date time that time entry is created. UTC Date Time in ISO-8601 format. By default it is set to server time.")
  public OffsetDateTime getDateEnteredUtc() {
    return dateEnteredUtc;
  }

  public void setDateEnteredUtc(OffsetDateTime dateEnteredUtc) {
    this.dateEnteredUtc = dateEnteredUtc;
  }

  public TimeEntry duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of logged minutes.
   * @return duration
  **/
  @ApiModelProperty(value = "The duration of logged minutes.")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public TimeEntry description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the time entry.
   * @return description
  **/
  @ApiModelProperty(value = "A description of the time entry.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TimeEntry status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the time entry. By default a time entry is created with status of &#x60;ACTIVE&#x60;. A &#x60;LOCKED&#x60; state indicates that the time entry is currently changing state (for example being invoiced). Updates are not allowed when in this state. It will have a status of INVOICED once it is invoiced.
   * @return status
  **/
  @ApiModelProperty(value = "Status of the time entry. By default a time entry is created with status of `ACTIVE`. A `LOCKED` state indicates that the time entry is currently changing state (for example being invoiced). Updates are not allowed when in this state. It will have a status of INVOICED once it is invoiced.")
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
    TimeEntry timeEntry = (TimeEntry) o;
    return Objects.equals(this.timeEntryId, timeEntry.timeEntryId) &&
        Objects.equals(this.userId, timeEntry.userId) &&
        Objects.equals(this.projectId, timeEntry.projectId) &&
        Objects.equals(this.taskId, timeEntry.taskId) &&
        Objects.equals(this.dateUtc, timeEntry.dateUtc) &&
        Objects.equals(this.dateEnteredUtc, timeEntry.dateEnteredUtc) &&
        Objects.equals(this.duration, timeEntry.duration) &&
        Objects.equals(this.description, timeEntry.description) &&
        Objects.equals(this.status, timeEntry.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeEntryId, userId, projectId, taskId, dateUtc, dateEnteredUtc, duration, description, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeEntry {\n");
    sb.append("    timeEntryId: ").append(toIndentedString(timeEntryId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    dateUtc: ").append(toIndentedString(dateUtc)).append("\n");
    sb.append("    dateEnteredUtc: ").append(toIndentedString(dateEnteredUtc)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

