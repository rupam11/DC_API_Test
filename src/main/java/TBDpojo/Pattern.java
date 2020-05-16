package TBDpojo;

import java.io.Serializable;
import java.List;



public class Pattern implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int patternId;
	
	
	private String patternCode;
	
	
	private int patternSequence;
	
	
	private int patternDisplaySequence;

	
	private String patternName;

	
	private String patternStatus;
	
	
	private String patternCompletion;
	
	
	private String patternState;
	
	
	private String patternEffort;
	
	
	private String patternOwner;

	
	private String patternCreatedBy;
	
	
	private String patternCreatedAt;

	
	private String patternUpdatedBy;

	
	private String patternUpdatedAt;
	
	
	private List<Sector> patternSectors;

	public Pattern() {

	}

	/**
	 * @param patternId
	 * @param patternCode
	 * @param patternSequence
	 * @param patternDisplaySequence
	 * @param patternName
	 * @param patternStatus
	 * @param patternCompletion
	 * @param patternState
	 * @param patternEffort
	 * @param patternOwner
	 * @param patternCreatedBy
	 * @param patternCreatedAt
	 * @param patternUpdatedBy
	 * @param patternUpdatedAt
	 * @param patternSectors
	 */
	public Pattern(int patternId, String patternCode, int patternSequence, int patternDisplaySequence,
			String patternName, String patternStatus, String patternCompletion, String patternState,
			String patternEffort, String patternOwner, String patternCreatedBy, String patternCreatedAt,
			String patternUpdatedBy, String patternUpdatedAt, List<Sector> patternSectors) {
		super();
		this.patternId = patternId;
		this.patternCode = patternCode;
		this.patternSequence = patternSequence;
		this.patternDisplaySequence = patternDisplaySequence;
		this.patternName = patternName;
		this.patternStatus = patternStatus;
		this.patternCompletion = patternCompletion;
		this.patternState = patternState;
		this.patternEffort = patternEffort;
		this.patternOwner = patternOwner;
		this.patternCreatedBy = patternCreatedBy;
		this.patternCreatedAt = patternCreatedAt;
		this.patternUpdatedBy = patternUpdatedBy;
		this.patternUpdatedAt = patternUpdatedAt;
		this.patternSectors = patternSectors;
	}

	/**
	 * @return the patternId
	 */
	public int getPatternId() {
		return patternId;
	}

	/**
	 * @param patternId the patternId to set
	 */
	public void setPatternId(int patternId) {
		this.patternId = patternId;
	}

	/**
	 * @return the patternCode
	 */
	public String getPatternCode() {
		return patternCode;
	}

	/**
	 * @param patternCode the patternCode to set
	 */
	public void setPatternCode(String patternCode) {
		this.patternCode = patternCode;
	}

	/**
	 * @return the patternSequence
	 */
	public int getPatternSequence() {
		return patternSequence;
	}

	/**
	 * @param patternSequence the patternSequence to set
	 */
	public void setPatternSequence(int patternSequence) {
		this.patternSequence = patternSequence;
	}

	/**
	 * @return the patternDisplaySequence
	 */
	public int getPatternDisplaySequence() {
		return patternDisplaySequence;
	}

	/**
	 * @param patternDisplaySequence the patternDisplaySequence to set
	 */
	public void setPatternDisplaySequence(int patternDisplaySequence) {
		this.patternDisplaySequence = patternDisplaySequence;
	}

	/**
	 * @return the patternName
	 */
	public String getPatternName() {
		return patternName;
	}

	/**
	 * @param patternName the patternName to set
	 */
	public void setPatternName(String patternName) {
		this.patternName = patternName;
	}

	/**
	 * @return the patternStatus
	 */
	public String getPatternStatus() {
		return patternStatus;
	}

	/**
	 * @param patternStatus the patternStatus to set
	 */
	public void setPatternStatus(String patternStatus) {
		this.patternStatus = patternStatus;
	}

	/**
	 * @return the patternCompletion
	 */
	public String getPatternCompletion() {
		return patternCompletion;
	}

	/**
	 * @param patternCompletion the patternCompletion to set
	 */
	public void setPatternCompletion(String patternCompletion) {
		this.patternCompletion = patternCompletion;
	}

	/**
	 * @return the patternState
	 */
	public String getPatternState() {
		return patternState;
	}

	/**
	 * @param patternState the patternState to set
	 */
	public void setPatternState(String patternState) {
		this.patternState = patternState;
	}

	/**
	 * @return the patternEffort
	 */
	public String getPatternEffort() {
		return patternEffort;
	}

	/**
	 * @param patternEffort the patternEffort to set
	 */
	public void setPatternEffort(String patternEffort) {
		this.patternEffort = patternEffort;
	}

	/**
	 * @return the patternOwner
	 */
	public String getPatternOwner() {
		return patternOwner;
	}

	/**
	 * @param patternOwner the patternOwner to set
	 */
	public void setPatternOwner(String patternOwner) {
		this.patternOwner = patternOwner;
	}

	/**
	 * @return the patternCreatedBy
	 */
	public String getPatternCreatedBy() {
		return patternCreatedBy;
	}

	/**
	 * @param patternCreatedBy the patternCreatedBy to set
	 */
	public void setPatternCreatedBy(String patternCreatedBy) {
		this.patternCreatedBy = patternCreatedBy;
	}

	/**
	 * @return the patternCreatedAt
	 */
	public String getPatternCreatedAt() {
		return patternCreatedAt;
	}

	/**
	 * @param patternCreatedAt the patternCreatedAt to set
	 */
	public void setPatternCreatedAt(String patternCreatedAt) {
		this.patternCreatedAt = patternCreatedAt;
	}

	/**
	 * @return the patternUpdatedBy
	 */
	public String getPatternUpdatedBy() {
		return patternUpdatedBy;
	}

	/**
	 * @param patternUpdatedBy the patternUpdatedBy to set
	 */
	public void setPatternUpdatedBy(String patternUpdatedBy) {
		this.patternUpdatedBy = patternUpdatedBy;
	}

	/**
	 * @return the patternUpdatedAt
	 */
	public String getPatternUpdatedAt() {
		return patternUpdatedAt;
	}

	/**
	 * @param patternUpdatedAt the patternUpdatedAt to set
	 */
	public void setPatternUpdatedAt(String patternUpdatedAt) {
		this.patternUpdatedAt = patternUpdatedAt;
	}

	/**
	 * @return the patternSectors
	 */
	public List<Sector> getPatternSectors() {
		return patternSectors;
	}

	/**
	 * @param patternSectors the patternSectors to set
	 */
	public void setPatternSectors(List<Sector> patternSectors) {
		this.patternSectors = patternSectors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patternSectors == null) ? 0 : patternSectors.hashCode());
		result = prime * result + ((patternCode == null) ? 0 : patternCode.hashCode());
		result = prime * result + ((patternCompletion == null) ? 0 : patternCompletion.hashCode());
		result = prime * result + ((patternCreatedAt == null) ? 0 : patternCreatedAt.hashCode());
		result = prime * result + ((patternCreatedBy == null) ? 0 : patternCreatedBy.hashCode());
		result = prime * result + patternDisplaySequence;
		result = prime * result + ((patternEffort == null) ? 0 : patternEffort.hashCode());
		result = prime * result + patternId;
		result = prime * result + ((patternName == null) ? 0 : patternName.hashCode());
		result = prime * result + ((patternOwner == null) ? 0 : patternOwner.hashCode());
		result = prime * result + patternSequence;
		result = prime * result + ((patternState == null) ? 0 : patternState.hashCode());
		result = prime * result + ((patternStatus == null) ? 0 : patternStatus.hashCode());
		result = prime * result + ((patternUpdatedAt == null) ? 0 : patternUpdatedAt.hashCode());
		result = prime * result + ((patternUpdatedBy == null) ? 0 : patternUpdatedBy.hashCode());
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
		Pattern other = (Pattern) obj;
		if (patternSectors == null) {
			if (other.patternSectors != null)
				return false;
		} else if (!patternSectors.equals(other.patternSectors))
			return false;
		if (patternCode == null) {
			if (other.patternCode != null)
				return false;
		} else if (!patternCode.equals(other.patternCode))
			return false;
		if (patternCompletion == null) {
			if (other.patternCompletion != null)
				return false;
		} else if (!patternCompletion.equals(other.patternCompletion))
			return false;
		if (patternCreatedAt == null) {
			if (other.patternCreatedAt != null)
				return false;
		} else if (!patternCreatedAt.equals(other.patternCreatedAt))
			return false;
		if (patternCreatedBy == null) {
			if (other.patternCreatedBy != null)
				return false;
		} else if (!patternCreatedBy.equals(other.patternCreatedBy))
			return false;
		if (patternDisplaySequence != other.patternDisplaySequence)
			return false;
		if (patternEffort == null) {
			if (other.patternEffort != null)
				return false;
		} else if (!patternEffort.equals(other.patternEffort))
			return false;
		if (patternId != other.patternId)
			return false;
		if (patternName == null) {
			if (other.patternName != null)
				return false;
		} else if (!patternName.equals(other.patternName))
			return false;
		if (patternOwner == null) {
			if (other.patternOwner != null)
				return false;
		} else if (!patternOwner.equals(other.patternOwner))
			return false;
		if (patternSequence != other.patternSequence)
			return false;
		if (patternState == null) {
			if (other.patternState != null)
				return false;
		} else if (!patternState.equals(other.patternState))
			return false;
		if (patternStatus == null) {
			if (other.patternStatus != null)
				return false;
		} else if (!patternStatus.equals(other.patternStatus))
			return false;
		if (patternUpdatedAt == null) {
			if (other.patternUpdatedAt != null)
				return false;
		} else if (!patternUpdatedAt.equals(other.patternUpdatedAt))
			return false;
		if (patternUpdatedBy == null) {
			if (other.patternUpdatedBy != null)
				return false;
		} else if (!patternUpdatedBy.equals(other.patternUpdatedBy))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pattern [patternId=" + patternId + ", patternCode=" + patternCode + ", patternSequence="
				+ patternSequence + ", patternDisplaySequence=" + patternDisplaySequence + ", patternName="
				+ patternName + ", patternStatus=" + patternStatus + ", patternCompletion=" + patternCompletion
				+ ", patternState=" + patternState + ", patternEffort=" + patternEffort + ", patternOwner="
				+ patternOwner + ", patternCreatedBy=" + patternCreatedBy + ", patternCreatedAt=" + patternCreatedAt
				+ ", patternUpdatedBy=" + patternUpdatedBy + ", patternUpdatedAt=" + patternUpdatedAt
				+ ", patternSectors=" + patternSectors + "]";
	}
}