package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;




public class Data implements Serializable{
	
	
	private static final long serialVersionUID = 1174289370626448020L;
	
	@NotNull
	private int rowId;
	
	
	@NotNull
	private String categoryName;
	
	
	@NotNull
	private String createdBy;
	
	
	@NotNull
	private String createdAt;
	
	
	@NotNull
	private String updatedAt;
	
	
	@NotNull
	private String updatedBy;
	
	@NotNull
	private List<RowValue> rowValues = new ArrayList<RowValue>();

	public Data() {
		
	}

	/**
	 * @param rowId
	 * @param categoryName
	 * @param createdBy
	 * @param createdAt
	 * @param updatedAt
	 * @param updatedBy
	 * @param rowValues
	 */
	public Data(@NotNull int rowId, @NotNull String categoryName, @NotNull String createdBy, @NotNull String createdAt,
			@NotNull String updatedAt, @NotNull String updatedBy, @NotNull List<RowValue> rowValues) {
		super();
		this.rowId = rowId;
		this.categoryName = categoryName;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.rowValues = rowValues;
	}

	/**
	 * @return the rowId
	 */
	public int getRowId() {
		return rowId;
	}

	/**
	 * @param rowId the rowId to set
	 */
	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the updatedAt
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the rowValues
	 */
	public List<RowValue> getRowValues() {
		return rowValues;
	}

	/**
	 * @param rowValues the rowValues to set
	 */
	public void setRowValues(List<RowValue> rowValues) {
		this.rowValues = rowValues;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + rowId;
		result = prime * result + ((rowValues == null) ? 0 : rowValues.hashCode());
		result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
		result = prime * result + ((updatedBy == null) ? 0 : updatedBy.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (rowId != other.rowId)
			return false;
		if (rowValues == null) {
			if (other.rowValues != null)
				return false;
		} else if (!rowValues.equals(other.rowValues))
			return false;
		if (updatedAt == null) {
			if (other.updatedAt != null)
				return false;
		} else if (!updatedAt.equals(other.updatedAt))
			return false;
		if (updatedBy == null) {
			if (other.updatedBy != null)
				return false;
		} else if (!updatedBy.equals(other.updatedBy))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Data [rowId=" + rowId + ", categoryName=" + categoryName + ", createdBy=" + createdBy + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", updatedBy=" + updatedBy + ", rowValues=" + rowValues
				+ "]";
	}
}
