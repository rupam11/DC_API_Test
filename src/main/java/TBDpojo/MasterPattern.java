package TBDpojo;

import java.io.Serializable;
import java.List;



public class MasterPattern implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int masterPatternId;
	
	
	private String masterPatternCode;
	
	
	private int masterPatternSequence;
	
	
	private int masterPatternDisplaySequence;

	
	private String masterPatternName;

	
	private String masterPatternStatus;
	
	
	private String masterPatternCompletion;

	
	private String masterPatternState;
	
	
	private String masterPatternEffort;
	
	
	private String masterPatternOwner;
	
	
	private String masterPatternCreatedBy;

	
	private String masterPatternCreatedAt;

	
	private String masterPatternUpdatedBy;

	
	private String masterPatternUpdatedAt;
	
	
	private List<Pattern> patterns;
	

	public MasterPattern() {

	}


	/**
	 * @param masterPatternId
	 * @param masterPatternCode
	 * @param masterPatternSequence
	 * @param masterPatternDisplaySequence
	 * @param masterPatternName
	 * @param masterPatternStatus
	 * @param masterPatternCompletion
	 * @param masterPatternState
	 * @param masterPatternEffort
	 * @param masterPatternOwner
	 * @param masterPatternCreatedBy
	 * @param masterPatternCreatedAt
	 * @param masterPatternUpdatedBy
	 * @param masterPatternUpdatedAt
	 * @param patterns
	 */
	public MasterPattern(int masterPatternId, String masterPatternCode, int masterPatternSequence,
			int masterPatternDisplaySequence, String masterPatternName, String masterPatternStatus,
			String masterPatternCompletion, String masterPatternState, String masterPatternEffort,
			String masterPatternOwner, String masterPatternCreatedBy, String masterPatternCreatedAt,
			String masterPatternUpdatedBy, String masterPatternUpdatedAt, List<Pattern> patterns) {
		super();
		this.masterPatternId = masterPatternId;
		this.masterPatternCode = masterPatternCode;
		this.masterPatternSequence = masterPatternSequence;
		this.masterPatternDisplaySequence = masterPatternDisplaySequence;
		this.masterPatternName = masterPatternName;
		this.masterPatternStatus = masterPatternStatus;
		this.masterPatternCompletion = masterPatternCompletion;
		this.masterPatternState = masterPatternState;
		this.masterPatternEffort = masterPatternEffort;
		this.masterPatternOwner = masterPatternOwner;
		this.masterPatternCreatedBy = masterPatternCreatedBy;
		this.masterPatternCreatedAt = masterPatternCreatedAt;
		this.masterPatternUpdatedBy = masterPatternUpdatedBy;
		this.masterPatternUpdatedAt = masterPatternUpdatedAt;
		this.patterns = patterns;
	}


	/**
	 * @return the masterPatternId
	 */
	public int getMasterPatternId() {
		return masterPatternId;
	}


	/**
	 * @param masterPatternId the masterPatternId to set
	 */
	public void setMasterPatternId(int masterPatternId) {
		this.masterPatternId = masterPatternId;
	}


	/**
	 * @return the masterPatternCode
	 */
	public String getMasterPatternCode() {
		return masterPatternCode;
	}


	/**
	 * @param masterPatternCode the masterPatternCode to set
	 */
	public void setMasterPatternCode(String masterPatternCode) {
		this.masterPatternCode = masterPatternCode;
	}


	/**
	 * @return the masterPatternSequence
	 */
	public int getMasterPatternSequence() {
		return masterPatternSequence;
	}


	/**
	 * @param masterPatternSequence the masterPatternSequence to set
	 */
	public void setMasterPatternSequence(int masterPatternSequence) {
		this.masterPatternSequence = masterPatternSequence;
	}


	/**
	 * @return the masterPatternDisplaySequence
	 */
	public int getMasterPatternDisplaySequence() {
		return masterPatternDisplaySequence;
	}


	/**
	 * @param masterPatternDisplaySequence the masterPatternDisplaySequence to set
	 */
	public void setMasterPatternDisplaySequence(int masterPatternDisplaySequence) {
		this.masterPatternDisplaySequence = masterPatternDisplaySequence;
	}


	/**
	 * @return the masterPatternName
	 */
	public String getMasterPatternName() {
		return masterPatternName;
	}


	/**
	 * @param masterPatternName the masterPatternName to set
	 */
	public void setMasterPatternName(String masterPatternName) {
		this.masterPatternName = masterPatternName;
	}


	/**
	 * @return the masterPatternStatus
	 */
	public String getMasterPatternStatus() {
		return masterPatternStatus;
	}


	/**
	 * @param masterPatternStatus the masterPatternStatus to set
	 */
	public void setMasterPatternStatus(String masterPatternStatus) {
		this.masterPatternStatus = masterPatternStatus;
	}


	/**
	 * @return the masterPatternCompletion
	 */
	public String getMasterPatternCompletion() {
		return masterPatternCompletion;
	}


	/**
	 * @param masterPatternCompletion the masterPatternCompletion to set
	 */
	public void setMasterPatternCompletion(String masterPatternCompletion) {
		this.masterPatternCompletion = masterPatternCompletion;
	}


	/**
	 * @return the masterPatternState
	 */
	public String getMasterPatternState() {
		return masterPatternState;
	}


	/**
	 * @param masterPatternState the masterPatternState to set
	 */
	public void setMasterPatternState(String masterPatternState) {
		this.masterPatternState = masterPatternState;
	}


	/**
	 * @return the masterPatternEffort
	 */
	public String getMasterPatternEffort() {
		return masterPatternEffort;
	}


	/**
	 * @param masterPatternEffort the masterPatternEffort to set
	 */
	public void setMasterPatternEffort(String masterPatternEffort) {
		this.masterPatternEffort = masterPatternEffort;
	}


	/**
	 * @return the masterPatternOwner
	 */
	public String getMasterPatternOwner() {
		return masterPatternOwner;
	}


	/**
	 * @param masterPatternOwner the masterPatternOwner to set
	 */
	public void setMasterPatternOwner(String masterPatternOwner) {
		this.masterPatternOwner = masterPatternOwner;
	}


	/**
	 * @return the masterPatternCreatedBy
	 */
	public String getMasterPatternCreatedBy() {
		return masterPatternCreatedBy;
	}


	/**
	 * @param masterPatternCreatedBy the masterPatternCreatedBy to set
	 */
	public void setMasterPatternCreatedBy(String masterPatternCreatedBy) {
		this.masterPatternCreatedBy = masterPatternCreatedBy;
	}


	/**
	 * @return the masterPatternCreatedAt
	 */
	public String getMasterPatternCreatedAt() {
		return masterPatternCreatedAt;
	}


	/**
	 * @param masterPatternCreatedAt the masterPatternCreatedAt to set
	 */
	public void setMasterPatternCreatedAt(String masterPatternCreatedAt) {
		this.masterPatternCreatedAt = masterPatternCreatedAt;
	}


	/**
	 * @return the masterPatternUpdatedBy
	 */
	public String getMasterPatternUpdatedBy() {
		return masterPatternUpdatedBy;
	}


	/**
	 * @param masterPatternUpdatedBy the masterPatternUpdatedBy to set
	 */
	public void setMasterPatternUpdatedBy(String masterPatternUpdatedBy) {
		this.masterPatternUpdatedBy = masterPatternUpdatedBy;
	}


	/**
	 * @return the masterPatternUpdatedAt
	 */
	public String getMasterPatternUpdatedAt() {
		return masterPatternUpdatedAt;
	}


	/**
	 * @param masterPatternUpdatedAt the masterPatternUpdatedAt to set
	 */
	public void setMasterPatternUpdatedAt(String masterPatternUpdatedAt) {
		this.masterPatternUpdatedAt = masterPatternUpdatedAt;
	}


	/**
	 * @return the patterns
	 */
	public List<Pattern> getPatterns() {
		return patterns;
	}


	/**
	 * @param patterns the patterns to set
	 */
	public void setPatterns(List<Pattern> patterns) {
		this.patterns = patterns;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((masterPatternCode == null) ? 0 : masterPatternCode.hashCode());
		result = prime * result + ((masterPatternCompletion == null) ? 0 : masterPatternCompletion.hashCode());
		result = prime * result + ((masterPatternCreatedAt == null) ? 0 : masterPatternCreatedAt.hashCode());
		result = prime * result + ((masterPatternCreatedBy == null) ? 0 : masterPatternCreatedBy.hashCode());
		result = prime * result + masterPatternDisplaySequence;
		result = prime * result + ((masterPatternEffort == null) ? 0 : masterPatternEffort.hashCode());
		result = prime * result + masterPatternId;
		result = prime * result + ((masterPatternName == null) ? 0 : masterPatternName.hashCode());
		result = prime * result + ((masterPatternOwner == null) ? 0 : masterPatternOwner.hashCode());
		result = prime * result + masterPatternSequence;
		result = prime * result + ((masterPatternState == null) ? 0 : masterPatternState.hashCode());
		result = prime * result + ((masterPatternStatus == null) ? 0 : masterPatternStatus.hashCode());
		result = prime * result + ((masterPatternUpdatedAt == null) ? 0 : masterPatternUpdatedAt.hashCode());
		result = prime * result + ((masterPatternUpdatedBy == null) ? 0 : masterPatternUpdatedBy.hashCode());
		result = prime * result + ((patterns == null) ? 0 : patterns.hashCode());
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
		MasterPattern other = (MasterPattern) obj;
		if (masterPatternCode == null) {
			if (other.masterPatternCode != null)
				return false;
		} else if (!masterPatternCode.equals(other.masterPatternCode))
			return false;
		if (masterPatternCompletion == null) {
			if (other.masterPatternCompletion != null)
				return false;
		} else if (!masterPatternCompletion.equals(other.masterPatternCompletion))
			return false;
		if (masterPatternCreatedAt == null) {
			if (other.masterPatternCreatedAt != null)
				return false;
		} else if (!masterPatternCreatedAt.equals(other.masterPatternCreatedAt))
			return false;
		if (masterPatternCreatedBy == null) {
			if (other.masterPatternCreatedBy != null)
				return false;
		} else if (!masterPatternCreatedBy.equals(other.masterPatternCreatedBy))
			return false;
		if (masterPatternDisplaySequence != other.masterPatternDisplaySequence)
			return false;
		if (masterPatternEffort == null) {
			if (other.masterPatternEffort != null)
				return false;
		} else if (!masterPatternEffort.equals(other.masterPatternEffort))
			return false;
		if (masterPatternId != other.masterPatternId)
			return false;
		if (masterPatternName == null) {
			if (other.masterPatternName != null)
				return false;
		} else if (!masterPatternName.equals(other.masterPatternName))
			return false;
		if (masterPatternOwner == null) {
			if (other.masterPatternOwner != null)
				return false;
		} else if (!masterPatternOwner.equals(other.masterPatternOwner))
			return false;
		if (masterPatternSequence != other.masterPatternSequence)
			return false;
		if (masterPatternState == null) {
			if (other.masterPatternState != null)
				return false;
		} else if (!masterPatternState.equals(other.masterPatternState))
			return false;
		if (masterPatternStatus == null) {
			if (other.masterPatternStatus != null)
				return false;
		} else if (!masterPatternStatus.equals(other.masterPatternStatus))
			return false;
		if (masterPatternUpdatedAt == null) {
			if (other.masterPatternUpdatedAt != null)
				return false;
		} else if (!masterPatternUpdatedAt.equals(other.masterPatternUpdatedAt))
			return false;
		if (masterPatternUpdatedBy == null) {
			if (other.masterPatternUpdatedBy != null)
				return false;
		} else if (!masterPatternUpdatedBy.equals(other.masterPatternUpdatedBy))
			return false;
		if (patterns == null) {
			if (other.patterns != null)
				return false;
		} else if (!patterns.equals(other.patterns))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "MasterPattern [masterPatternId=" + masterPatternId + ", masterPatternCode=" + masterPatternCode
				+ ", masterPatternSequence=" + masterPatternSequence + ", masterPatternDisplaySequence="
				+ masterPatternDisplaySequence + ", masterPatternName=" + masterPatternName + ", masterPatternStatus="
				+ masterPatternStatus + ", masterPatternCompletion=" + masterPatternCompletion + ", masterPatternState="
				+ masterPatternState + ", masterPatternEffort=" + masterPatternEffort + ", masterPatternOwner="
				+ masterPatternOwner + ", masterPatternCreatedBy=" + masterPatternCreatedBy
				+ ", masterPatternCreatedAt=" + masterPatternCreatedAt + ", masterPatternUpdatedBy="
				+ masterPatternUpdatedBy + ", masterPatternUpdatedAt=" + masterPatternUpdatedAt + ", patterns="
				+ patterns + "]";
	}
}