package TBDpojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;



public class Sector implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@NotNull
	private int sectorId;

	
	@NotNull
	private String sectorName;

	
	@NotNull
	private String sectorStatus;
	
	
	@NotNull
	private String sectorCreatedBy;

	
	@NotNull
	private String sectorCreatedAt;

	
	@NotNull
	private String sectorUpdatedBy;

	
	@NotNull
	private String sectorUpdatedAt;

	public Sector() {

	}

	/**
	 * @param sectorId
	 * @param sectorName
	 * @param sectorStatus
	 * @param sectorCreatedBy
	 * @param sectorCreatedAt
	 * @param sectorUpdatedBy
	 * @param sectorUpdatedAt
	 */
	public Sector(@NotNull int sectorId, @NotNull String sectorName, @NotNull String sectorStatus,
			@NotNull String sectorCreatedBy, @NotNull String sectorCreatedAt, @NotNull String sectorUpdatedBy,
			@NotNull String sectorUpdatedAt) {
		super();
		this.sectorId = sectorId;
		this.sectorName = sectorName;
		this.sectorStatus = sectorStatus;
		this.sectorCreatedBy = sectorCreatedBy;
		this.sectorCreatedAt = sectorCreatedAt;
		this.sectorUpdatedBy = sectorUpdatedBy;
		this.sectorUpdatedAt = sectorUpdatedAt;
	}

	/**
	 * @return the sectorId
	 */
	public int getSectorId() {
		return sectorId;
	}

	/**
	 * @param sectorId the sectorId to set
	 */
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}

	/**
	 * @return the sectorName
	 */
	public String getSectorName() {
		return sectorName;
	}

	/**
	 * @param sectorName the sectorName to set
	 */
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	/**
	 * @return the sectorStatus
	 */
	public String getSectorStatus() {
		return sectorStatus;
	}

	/**
	 * @param sectorStatus the sectorStatus to set
	 */
	public void setSectorStatus(String sectorStatus) {
		this.sectorStatus = sectorStatus;
	}

	/**
	 * @return the sectorCreatedBy
	 */
	public String getSectorCreatedBy() {
		return sectorCreatedBy;
	}

	/**
	 * @param sectorCreatedBy the sectorCreatedBy to set
	 */
	public void setSectorCreatedBy(String sectorCreatedBy) {
		this.sectorCreatedBy = sectorCreatedBy;
	}

	/**
	 * @return the sectorCreatedAt
	 */
	public String getSectorCreatedAt() {
		return sectorCreatedAt;
	}

	/**
	 * @param sectorCreatedAt the sectorCreatedAt to set
	 */
	public void setSectorCreatedAt(String sectorCreatedAt) {
		this.sectorCreatedAt = sectorCreatedAt;
	}

	/**
	 * @return the sectorUpdatedBy
	 */
	public String getSectorUpdatedBy() {
		return sectorUpdatedBy;
	}

	/**
	 * @param sectorUpdatedBy the sectorUpdatedBy to set
	 */
	public void setSectorUpdatedBy(String sectorUpdatedBy) {
		this.sectorUpdatedBy = sectorUpdatedBy;
	}

	/**
	 * @return the sectorUpdatedAt
	 */
	public String getSectorUpdatedAt() {
		return sectorUpdatedAt;
	}

	/**
	 * @param sectorUpdatedAt the sectorUpdatedAt to set
	 */
	public void setSectorUpdatedAt(String sectorUpdatedAt) {
		this.sectorUpdatedAt = sectorUpdatedAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sectorCreatedAt == null) ? 0 : sectorCreatedAt.hashCode());
		result = prime * result + ((sectorCreatedBy == null) ? 0 : sectorCreatedBy.hashCode());
		result = prime * result + sectorId;
		result = prime * result + ((sectorName == null) ? 0 : sectorName.hashCode());
		result = prime * result + ((sectorStatus == null) ? 0 : sectorStatus.hashCode());
		result = prime * result + ((sectorUpdatedAt == null) ? 0 : sectorUpdatedAt.hashCode());
		result = prime * result + ((sectorUpdatedBy == null) ? 0 : sectorUpdatedBy.hashCode());
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
		Sector other = (Sector) obj;
		if (sectorCreatedAt == null) {
			if (other.sectorCreatedAt != null)
				return false;
		} else if (!sectorCreatedAt.equals(other.sectorCreatedAt))
			return false;
		if (sectorCreatedBy == null) {
			if (other.sectorCreatedBy != null)
				return false;
		} else if (!sectorCreatedBy.equals(other.sectorCreatedBy))
			return false;
		if (sectorId != other.sectorId)
			return false;
		if (sectorName == null) {
			if (other.sectorName != null)
				return false;
		} else if (!sectorName.equals(other.sectorName))
			return false;
		if (sectorStatus == null) {
			if (other.sectorStatus != null)
				return false;
		} else if (!sectorStatus.equals(other.sectorStatus))
			return false;
		if (sectorUpdatedAt == null) {
			if (other.sectorUpdatedAt != null)
				return false;
		} else if (!sectorUpdatedAt.equals(other.sectorUpdatedAt))
			return false;
		if (sectorUpdatedBy == null) {
			if (other.sectorUpdatedBy != null)
				return false;
		} else if (!sectorUpdatedBy.equals(other.sectorUpdatedBy))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sector [sectorId=" + sectorId + ", sectorName=" + sectorName + ", sectorStatus=" + sectorStatus
				+ ", sectorCreatedBy=" + sectorCreatedBy + ", sectorCreatedAt=" + sectorCreatedAt + ", sectorUpdatedBy="
				+ sectorUpdatedBy + ", sectorUpdatedAt=" + sectorUpdatedAt + "]";
	}
}