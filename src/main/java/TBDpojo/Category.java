package TBDpojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;



public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@NotNull
	private int categoryId;
	
	
	@NotNull
	private String categoryParentId;
	
	
	@NotNull
	private String categoryName;
	
	
	@NotNull
	private int categorySequence;
	
	
	@NotNull
	private String categoryCreatedBy;

	
	@NotNull
	private String categoryCreatedAt;

	
	@NotNull
	private String categoryUpdatedBy;

	
	@NotNull
	private String categoryUpdatedAt;

	
	@NotNull
	private String categoryStatus;
	
	public Category() {

	}

	/**
	 * @param categoryId
	 * @param categoryParentId
	 * @param categoryName
	 * @param categorySequence
	 * @param categoryCreatedBy
	 * @param categoryCreatedAt
	 * @param categoryUpdatedBy
	 * @param categoryUpdatedAt
	 * @param categoryStatus
	 */
	public Category(@NotNull int categoryId, @NotNull String categoryParentId, @NotNull String categoryName,
			@NotNull int categorySequence, @NotNull String categoryCreatedBy, @NotNull String categoryCreatedAt,
			@NotNull String categoryUpdatedBy, @NotNull String categoryUpdatedAt, @NotNull String categoryStatus) {
		super();
		this.categoryId = categoryId;
		this.categoryParentId = categoryParentId;
		this.categoryName = categoryName;
		this.categorySequence = categorySequence;
		this.categoryCreatedBy = categoryCreatedBy;
		this.categoryCreatedAt = categoryCreatedAt;
		this.categoryUpdatedBy = categoryUpdatedBy;
		this.categoryUpdatedAt = categoryUpdatedAt;
		this.categoryStatus = categoryStatus;
	}

	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the categoryParentId
	 */
	public String getCategoryParentId() {
		return categoryParentId;
	}

	/**
	 * @param categoryParentId the categoryParentId to set
	 */
	public void setCategoryParentId(String categoryParentId) {
		this.categoryParentId = categoryParentId;
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
	 * @return the categorySequence
	 */
	public int getCategorySequence() {
		return categorySequence;
	}

	/**
	 * @param categorySequence the categorySequence to set
	 */
	public void setCategorySequence(int categorySequence) {
		this.categorySequence = categorySequence;
	}

	/**
	 * @return the categoryCreatedBy
	 */
	public String getCategoryCreatedBy() {
		return categoryCreatedBy;
	}

	/**
	 * @param categoryCreatedBy the categoryCreatedBy to set
	 */
	public void setCategoryCreatedBy(String categoryCreatedBy) {
		this.categoryCreatedBy = categoryCreatedBy;
	}

	/**
	 * @return the categoryCreatedAt
	 */
	public String getCategoryCreatedAt() {
		return categoryCreatedAt;
	}

	/**
	 * @param categoryCreatedAt the categoryCreatedAt to set
	 */
	public void setCategoryCreatedAt(String categoryCreatedAt) {
		this.categoryCreatedAt = categoryCreatedAt;
	}

	/**
	 * @return the categoryUpdatedBy
	 */
	public String getCategoryUpdatedBy() {
		return categoryUpdatedBy;
	}

	/**
	 * @param categoryUpdatedBy the categoryUpdatedBy to set
	 */
	public void setCategoryUpdatedBy(String categoryUpdatedBy) {
		this.categoryUpdatedBy = categoryUpdatedBy;
	}

	/**
	 * @return the categoryUpdatedAt
	 */
	public String getCategoryUpdatedAt() {
		return categoryUpdatedAt;
	}

	/**
	 * @param categoryUpdatedAt the categoryUpdatedAt to set
	 */
	public void setCategoryUpdatedAt(String categoryUpdatedAt) {
		this.categoryUpdatedAt = categoryUpdatedAt;
	}

	/**
	 * @return the categoryStatus
	 */
	public String getCategoryStatus() {
		return categoryStatus;
	}

	/**
	 * @param categoryStatus the categoryStatus to set
	 */
	public void setCategoryStatus(String categoryStatus) {
		this.categoryStatus = categoryStatus;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryCreatedAt == null) ? 0 : categoryCreatedAt.hashCode());
		result = prime * result + ((categoryCreatedBy == null) ? 0 : categoryCreatedBy.hashCode());
		result = prime * result + categoryId;
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		result = prime * result + ((categoryParentId == null) ? 0 : categoryParentId.hashCode());
		result = prime * result + categorySequence;
		result = prime * result + ((categoryStatus == null) ? 0 : categoryStatus.hashCode());
		result = prime * result + ((categoryUpdatedAt == null) ? 0 : categoryUpdatedAt.hashCode());
		result = prime * result + ((categoryUpdatedBy == null) ? 0 : categoryUpdatedBy.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (categoryCreatedAt == null) {
			if (other.categoryCreatedAt != null)
				return false;
		} else if (!categoryCreatedAt.equals(other.categoryCreatedAt))
			return false;
		if (categoryCreatedBy == null) {
			if (other.categoryCreatedBy != null)
				return false;
		} else if (!categoryCreatedBy.equals(other.categoryCreatedBy))
			return false;
		if (categoryId != other.categoryId)
			return false;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		if (categoryParentId == null) {
			if (other.categoryParentId != null)
				return false;
		} else if (!categoryParentId.equals(other.categoryParentId))
			return false;
		if (categorySequence != other.categorySequence)
			return false;
		if (categoryStatus == null) {
			if (other.categoryStatus != null)
				return false;
		} else if (!categoryStatus.equals(other.categoryStatus))
			return false;
		if (categoryUpdatedAt == null) {
			if (other.categoryUpdatedAt != null)
				return false;
		} else if (!categoryUpdatedAt.equals(other.categoryUpdatedAt))
			return false;
		if (categoryUpdatedBy == null) {
			if (other.categoryUpdatedBy != null)
				return false;
		} else if (!categoryUpdatedBy.equals(other.categoryUpdatedBy))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryParentId=" + categoryParentId + ", categoryName="
				+ categoryName + ", categorySequence=" + categorySequence + ", categoryCreatedBy=" + categoryCreatedBy
				+ ", categoryCreatedAt=" + categoryCreatedAt + ", categoryUpdatedBy=" + categoryUpdatedBy
				+ ", categoryUpdatedAt=" + categoryUpdatedAt + ", categoryStatus=" + categoryStatus + "]";
	}
	
	
	
}