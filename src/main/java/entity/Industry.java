package entity;

import java.io.Serializable;

import org.springframework.lang.NonNull;



public class Industry implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@NonNull
	private int industryId;

	
	@NonNull
	private String industryName;

	
	@NonNull
	private String industryStatus;

	
	@NonNull
	private String industrySectorName;

	
	@NonNull
	private String industryCreatedBy;

	
	@NonNull
	private String industryCreatedAt;

	
	@NonNull
	private String industryUpdatedBy;

	
	@NonNull
	private String industryUpdatedAt;

	public Industry() {

	}

	/**
	 * @param industryId
	 * @param industryName
	 * @param industryStatus
	 * @param industrySectorName
	 * @param industryCreatedBy
	 * @param industryCreatedAt
	 * @param industryUpdatedBy
	 * @param industryUpdatedAt
	 */
	public Industry(int industryId, String industryName, String industryStatus, String industrySectorName,
			String industryCreatedBy, String industryCreatedAt, String industryUpdatedBy, String industryUpdatedAt) {
		super();
		this.industryId = industryId;
		this.industryName = industryName;
		this.industryStatus = industryStatus;
		this.industrySectorName = industrySectorName;
		this.industryCreatedBy = industryCreatedBy;
		this.industryCreatedAt = industryCreatedAt;
		this.industryUpdatedBy = industryUpdatedBy;
		this.industryUpdatedAt = industryUpdatedAt;
	}

	/**
	 * @return the industryId
	 */
	public int getIndustryId() {
		return industryId;
	}

	/**
	 * @param industryId the industryId to set
	 */
	public void setIndustryId(int industryId) {
		this.industryId = industryId;
	}

	/**
	 * @return the industryName
	 */
	public String getIndustryName() {
		return industryName;
	}

	/**
	 * @param industryName the industryName to set
	 */
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	/**
	 * @return the industryStatus
	 */
	public String getIndustryStatus() {
		return industryStatus;
	}

	/**
	 * @param industryStatus the industryStatus to set
	 */
	public void setIndustryStatus(String industryStatus) {
		this.industryStatus = industryStatus;
	}

	/**
	 * @return the industrySectorName
	 */
	public String getIndustrySectorName() {
		return industrySectorName;
	}

	/**
	 * @param industrySectorName the industrySectorName to set
	 */
	public void setIndustrySectorName(String industrySectorName) {
		this.industrySectorName = industrySectorName;
	}

	/**
	 * @return the industryCreatedBy
	 */
	public String getIndustryCreatedBy() {
		return industryCreatedBy;
	}

	/**
	 * @param industryCreatedBy the industryCreatedBy to set
	 */
	public void setIndustryCreatedBy(String industryCreatedBy) {
		this.industryCreatedBy = industryCreatedBy;
	}

	/**
	 * @return the industryCreatedAt
	 */
	public String getIndustryCreatedAt() {
		return industryCreatedAt;
	}

	/**
	 * @param industryCreatedAt the industryCreatedAt to set
	 */
	public void setIndustryCreatedAt(String industryCreatedAt) {
		this.industryCreatedAt = industryCreatedAt;
	}

	/**
	 * @return the industryUpdatedBy
	 */
	public String getIndustryUpdatedBy() {
		return industryUpdatedBy;
	}

	/**
	 * @param industryUpdatedBy the industryUpdatedBy to set
	 */
	public void setIndustryUpdatedBy(String industryUpdatedBy) {
		this.industryUpdatedBy = industryUpdatedBy;
	}

	/**
	 * @return the industryUpdatedAt
	 */
	public String getIndustryUpdatedAt() {
		return industryUpdatedAt;
	}

	/**
	 * @param industryUpdatedAt the industryUpdatedAt to set
	 */
	public void setIndustryUpdatedAt(String industryUpdatedAt) {
		this.industryUpdatedAt = industryUpdatedAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((industryCreatedAt == null) ? 0 : industryCreatedAt.hashCode());
		result = prime * result + ((industryCreatedBy == null) ? 0 : industryCreatedBy.hashCode());
		result = prime * result + industryId;
		result = prime * result + ((industryName == null) ? 0 : industryName.hashCode());
		result = prime * result + ((industrySectorName == null) ? 0 : industrySectorName.hashCode());
		result = prime * result + ((industryStatus == null) ? 0 : industryStatus.hashCode());
		result = prime * result + ((industryUpdatedAt == null) ? 0 : industryUpdatedAt.hashCode());
		result = prime * result + ((industryUpdatedBy == null) ? 0 : industryUpdatedBy.hashCode());
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
		Industry other = (Industry) obj;
		if (industryCreatedAt == null) {
			if (other.industryCreatedAt != null)
				return false;
		} else if (!industryCreatedAt.equals(other.industryCreatedAt))
			return false;
		if (industryCreatedBy == null) {
			if (other.industryCreatedBy != null)
				return false;
		} else if (!industryCreatedBy.equals(other.industryCreatedBy))
			return false;
		if (industryId != other.industryId)
			return false;
		if (industryName == null) {
			if (other.industryName != null)
				return false;
		} else if (!industryName.equals(other.industryName))
			return false;
		if (industrySectorName == null) {
			if (other.industrySectorName != null)
				return false;
		} else if (!industrySectorName.equals(other.industrySectorName))
			return false;
		if (industryStatus == null) {
			if (other.industryStatus != null)
				return false;
		} else if (!industryStatus.equals(other.industryStatus))
			return false;
		if (industryUpdatedAt == null) {
			if (other.industryUpdatedAt != null)
				return false;
		} else if (!industryUpdatedAt.equals(other.industryUpdatedAt))
			return false;
		if (industryUpdatedBy == null) {
			if (other.industryUpdatedBy != null)
				return false;
		} else if (!industryUpdatedBy.equals(other.industryUpdatedBy))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Industry [industryId=" + industryId + ", industryName=" + industryName + ", industryStatus="
				+ industryStatus + ", industrySectorName=" + industrySectorName + ", industryCreatedBy="
				+ industryCreatedBy + ", industryCreatedAt=" + industryCreatedAt + ", industryUpdatedBy="
				+ industryUpdatedBy + ", industryUpdatedAt=" + industryUpdatedAt + "]";
	}
}