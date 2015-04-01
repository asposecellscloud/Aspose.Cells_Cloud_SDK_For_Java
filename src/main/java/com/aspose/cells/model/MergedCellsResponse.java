package com.aspose.cells.model;

import com.aspose.cells.model.MergedCells;
public class MergedCellsResponse {
  private MergedCells MergedCells = null;
  private String Code = null;
  private String Status = null;
  /**
	 * getMergedCells
	 * Gets MergedCells
	 * @return MergedCells
	 */
  public MergedCells getMergedCells() {
    return MergedCells;
  }

	/**
	 * setMergedCells
	 * Sets MergedCells
	 * @param MergedCells MergedCells
	 */
  public void setMergedCells(MergedCells MergedCells) {
    this.MergedCells = MergedCells;
  }

  /**
	 * getCode
	 * Gets String
	 * @return Code
	 */
  public String getCode() {
    return Code;
  }

	/**
	 * setCode
	 * Sets String
	 * @param Code String
	 */
  public void setCode(String Code) {
    this.Code = Code;
  }

  /**
	 * getStatus
	 * Gets String
	 * @return Status
	 */
  public String getStatus() {
    return Status;
  }

	/**
	 * setStatus
	 * Sets String
	 * @param Status String
	 */
  public void setStatus(String Status) {
    this.Status = Status;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergedCellsResponse {\n");
    sb.append("  MergedCells: ").append(MergedCells).append("\n");
    sb.append("  Code: ").append(Code).append("\n");
    sb.append("  Status: ").append(Status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

