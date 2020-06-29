/*
 * Xero Assets API
 * This is the Xero Assets API
 *
 * The version of the OpenAPI document: 2.2.4
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.assets;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import com.xero.api.StringUtil;

/** ResourceValidationErrorsElement */
public class ResourceValidationErrorsElement {
  StringUtil util = new StringUtil();

  @JsonProperty("resourceName")
  private String resourceName;

  @JsonProperty("localisedMessage")
  private String localisedMessage;

  @JsonProperty("type")
  private String type;

  @JsonProperty("title")
  private String title;

  @JsonProperty("detail")
  private String detail;

  public ResourceValidationErrorsElement resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The field name of the erroneous field
   *
   * @return resourceName
   */
  @ApiModelProperty(value = "The field name of the erroneous field")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public ResourceValidationErrorsElement localisedMessage(String localisedMessage) {
    this.localisedMessage = localisedMessage;
    return this;
  }

  /**
   * Explaination of the resource validation error
   *
   * @return localisedMessage
   */
  @ApiModelProperty(value = "Explaination of the resource validation error")
  public String getLocalisedMessage() {
    return localisedMessage;
  }

  public void setLocalisedMessage(String localisedMessage) {
    this.localisedMessage = localisedMessage;
  }

  public ResourceValidationErrorsElement type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Internal type of the resource error message
   *
   * @return type
   */
  @ApiModelProperty(value = "Internal type of the resource error message")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ResourceValidationErrorsElement title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the resource validation error
   *
   * @return title
   */
  @ApiModelProperty(value = "Title of the resource validation error")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ResourceValidationErrorsElement detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Detail of the resource validation error
   *
   * @return detail
   */
  @ApiModelProperty(value = "Detail of the resource validation error")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceValidationErrorsElement resourceValidationErrorsElement =
        (ResourceValidationErrorsElement) o;
    return Objects.equals(this.resourceName, resourceValidationErrorsElement.resourceName)
        && Objects.equals(this.localisedMessage, resourceValidationErrorsElement.localisedMessage)
        && Objects.equals(this.type, resourceValidationErrorsElement.type)
        && Objects.equals(this.title, resourceValidationErrorsElement.title)
        && Objects.equals(this.detail, resourceValidationErrorsElement.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceName, localisedMessage, type, title, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceValidationErrorsElement {\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    localisedMessage: ").append(toIndentedString(localisedMessage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
