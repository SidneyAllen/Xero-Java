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
import com.xero.models.accounting.ReportCell;
import com.xero.models.accounting.RowType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * ReportRow
 */

public class ReportRow {
  StringUtil util = new StringUtil();

  @JsonProperty("RowType")
  private RowType rowType;

  @JsonProperty("Title")
  private String title;

  @JsonProperty("Cells")
  private List<ReportCell> cells = new ArrayList<ReportCell>();
  public ReportRow rowType(RowType rowType) {
    this.rowType = rowType;
    return this;
  }

   /**
   * Get rowType
   * @return rowType
  **/
  @ApiModelProperty(value = "")
  public RowType getRowType() {
    return rowType;
  }

  public void setRowType(RowType rowType) {
    this.rowType = rowType;
  }

  public ReportRow title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ReportRow cells(List<ReportCell> cells) {
    this.cells = cells;
    return this;
  }

  public ReportRow addCellsItem(ReportCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<ReportCell>();
    }
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * Get cells
   * @return cells
  **/
  @ApiModelProperty(value = "")
  public List<ReportCell> getCells() {
    return cells;
  }

  public void setCells(List<ReportCell> cells) {
    this.cells = cells;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRow reportRow = (ReportRow) o;
    return Objects.equals(this.rowType, reportRow.rowType) &&
        Objects.equals(this.title, reportRow.title) &&
        Objects.equals(this.cells, reportRow.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowType, title, cells);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRow {\n");
    sb.append("    rowType: ").append(toIndentedString(rowType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
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

