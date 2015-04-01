package com.aspose.cells.model;

import java.util.*;
import com.aspose.cells.model.Link;
public class Columns {
  private Integer MaxColumn = null;
  private Integer ColumnsCount = null;
  private List<LinkElement> ColumnsList = new ArrayList<LinkElement>();
  private Link link = null;
  /**
	 * getMaxColumn
	 * Gets Integer
	 * @return MaxColumn
	 */
  public Integer getMaxColumn() {
    return MaxColumn;
  }

	/**
	 * setMaxColumn
	 * Sets Integer
	 * @param MaxColumn Integer
	 */
  public void setMaxColumn(Integer MaxColumn) {
    this.MaxColumn = MaxColumn;
  }

  /**
	 * getColumnsCount
	 * Gets Integer
	 * @return ColumnsCount
	 */
  public Integer getColumnsCount() {
    return ColumnsCount;
  }

	/**
	 * setColumnsCount
	 * Sets Integer
	 * @param ColumnsCount Integer
	 */
  public void setColumnsCount(Integer ColumnsCount) {
    this.ColumnsCount = ColumnsCount;
  }

  /**
	 * getColumnsList
	 * Gets List<LinkElement>
	 * @return ColumnsList
	 */
  public List<LinkElement> getColumnsList() {
    return ColumnsList;
  }

	/**
	 * setColumnsList
	 * Sets List<LinkElement>
	 * @param ColumnsList List<LinkElement>
	 */
  public void setColumnsList(List<LinkElement> ColumnsList) {
    this.ColumnsList = ColumnsList;
  }

  /**
	 * getLink
	 * Gets Link
	 * @return link
	 */
  public Link getLink() {
    return link;
  }

	/**
	 * setLink
	 * Sets Link
	 * @param link Link
	 */
  public void setLink(Link link) {
    this.link = link;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Columns {\n");
    sb.append("  MaxColumn: ").append(MaxColumn).append("\n");
    sb.append("  ColumnsCount: ").append(ColumnsCount).append("\n");
    sb.append("  ColumnsList: ").append(ColumnsList).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

