package TBDpojo;

import java.io.Serializable;
import java.List;



public class Sector implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int SectorId;
	
	
	private String SectorCode;
	
	
	private int SectorSequence;
	
	
	private int SectorDisplaySequence;

	
	private String SectorName;
	
	
	private String SectorStatus;
	
	
	private String SectorPercentCompletion;

	
	private String SectorState;
	
	
	private String SectorEffort;
	
	
	private String SectorOwner;

	
	private String SectorCreatedBy;

	
	private String SectorCreatedAt;

	
	private String SectorUpdatedBy;

	
	private String SectorUpdatedAt;
	
	
	private List<Task> SectorTasks;
	

	public Sector() {

	}


	/**
	 * @param SectorId
	 * @param SectorCode
	 * @param SectorSequence
	 * @param SectorDisplaySequence
	 * @param SectorName
	 * @param SectorStatus
	 * @param SectorPercentCompletion
	 * @param SectorState
	 * @param SectorEffort
	 * @param SectorOwner
	 * @param SectorCreatedBy
	 * @param SectorCreatedAt
	 * @param SectorUpdatedBy
	 * @param SectorUpdatedAt
	 * @param SectorTasks
	 */
	public Sector(int SectorId, String SectorCode, int SectorSequence, int SectorDisplaySequence,
			String SectorName, String SectorStatus, String SectorPercentCompletion, String SectorState,
			String SectorEffort, String SectorOwner, String SectorCreatedBy, String SectorCreatedAt,
			String SectorUpdatedBy, String SectorUpdatedAt, List<Task> SectorTasks) {
		super();
		this.SectorId = SectorId;
		this.SectorCode = SectorCode;
		this.SectorSequence = SectorSequence;
		this.SectorDisplaySequence = SectorDisplaySequence;
		this.SectorName = SectorName;
		this.SectorStatus = SectorStatus;
		this.SectorPercentCompletion = SectorPercentCompletion;
		this.SectorState = SectorState;
		this.SectorEffort = SectorEffort;
		this.SectorOwner = SectorOwner;
		this.SectorCreatedBy = SectorCreatedBy;
		this.SectorCreatedAt = SectorCreatedAt;
		this.SectorUpdatedBy = SectorUpdatedBy;
		this.SectorUpdatedAt = SectorUpdatedAt;
		this.SectorTasks = SectorTasks;
	}


	/**
	 * @return the SectorId
	 */
	public int getSectorId() {
		return SectorId;
	}


	/**
	 * @param SectorId the SectorId to set
	 */
	public void setSectorId(int SectorId) {
		this.SectorId = SectorId;
	}


	/**
	 * @return the SectorCode
	 */
	public String getSectorCode() {
		return SectorCode;
	}


	/**
	 * @param SectorCode the SectorCode to set
	 */
	public void setSectorCode(String SectorCode) {
		this.SectorCode = SectorCode;
	}


	/**
	 * @return the SectorSequence
	 */
	public int getSectorSequence() {
		return SectorSequence;
	}


	/**
	 * @param SectorSequence the SectorSequence to set
	 */
	public void setSectorSequence(int SectorSequence) {
		this.SectorSequence = SectorSequence;
	}


	/**
	 * @return the SectorDisplaySequence
	 */
	public int getSectorDisplaySequence() {
		return SectorDisplaySequence;
	}


	/**
	 * @param SectorDisplaySequence the SectorDisplaySequence to set
	 */
	public void setSectorDisplaySequence(int SectorDisplaySequence) {
		this.SectorDisplaySequence = SectorDisplaySequence;
	}


	/**
	 * @return the SectorName
	 */
	public String getSectorName() {
		return SectorName;
	}


	/**
	 * @param SectorName the SectorName to set
	 */
	public void setSectorName(String SectorName) {
		this.SectorName = SectorName;
	}


	/**
	 * @return the SectorStatus
	 */
	public String getSectorStatus() {
		return SectorStatus;
	}


	/**
	 * @param SectorStatus the SectorStatus to set
	 */
	public void setSectorStatus(String SectorStatus) {
		this.SectorStatus = SectorStatus;
	}


	/**
	 * @return the SectorPercentCompletion
	 */
	public String getSectorPercentCompletion() {
		return SectorPercentCompletion;
	}


	/**
	 * @param SectorPercentCompletion the SectorPercentCompletion to set
	 */
	public void setSectorPercentCompletion(String SectorPercentCompletion) {
		this.SectorPercentCompletion = SectorPercentCompletion;
	}


	/**
	 * @return the SectorState
	 */
	public String getSectorState() {
		return SectorState;
	}


	/**
	 * @param SectorState the SectorState to set
	 */
	public void setSectorState(String SectorState) {
		this.SectorState = SectorState;
	}


	/**
	 * @return the SectorEffort
	 */
	public String getSectorEffort() {
		return SectorEffort;
	}


	/**
	 * @param SectorEffort the SectorEffort to set
	 */
	public void setSectorEffort(String SectorEffort) {
		this.SectorEffort = SectorEffort;
	}


	/**
	 * @return the SectorOwner
	 */
	public String getSectorOwner() {
		return SectorOwner;
	}


	/**
	 * @param SectorOwner the SectorOwner to set
	 */
	public void setSectorOwner(String SectorOwner) {
		this.SectorOwner = SectorOwner;
	}


	/**
	 * @return the SectorCreatedBy
	 */
	public String getSectorCreatedBy() {
		return SectorCreatedBy;
	}


	/**
	 * @param SectorCreatedBy the SectorCreatedBy to set
	 */
	public void setSectorCreatedBy(String SectorCreatedBy) {
		this.SectorCreatedBy = SectorCreatedBy;
	}


	/**
	 * @return the SectorCreatedAt
	 */
	public String getSectorCreatedAt() {
		return SectorCreatedAt;
	}


	/**
	 * @param SectorCreatedAt the SectorCreatedAt to set
	 */
	public void setSectorCreatedAt(String SectorCreatedAt) {
		this.SectorCreatedAt = SectorCreatedAt;
	}


	/**
	 * @return the SectorUpdatedBy
	 */
	public String getSectorUpdatedBy() {
		return SectorUpdatedBy;
	}


	/**
	 * @param SectorUpdatedBy the SectorUpdatedBy to set
	 */
	public void setSectorUpdatedBy(String SectorUpdatedBy) {
		this.SectorUpdatedBy = SectorUpdatedBy;
	}


	/**
	 * @return the SectorUpdatedAt
	 */
	public String getSectorUpdatedAt() {
		return SectorUpdatedAt;
	}


	/**
	 * @param SectorUpdatedAt the SectorUpdatedAt to set
	 */
	public void setSectorUpdatedAt(String SectorUpdatedAt) {
		this.SectorUpdatedAt = SectorUpdatedAt;
	}


	/**
	 * @return the SectorTasks
	 */
	public List<Task> getSectorTasks() {
		return SectorTasks;
	}


	/**
	 * @param SectorTasks the SectorTasks to set
	 */
	public void setSectorTasks(List<Task> SectorTasks) {
		this.SectorTasks = SectorTasks;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SectorCode == null) ? 0 : SectorCode.hashCode());
		result = prime * result + ((SectorCreatedAt == null) ? 0 : SectorCreatedAt.hashCode());
		result = prime * result + ((SectorCreatedBy == null) ? 0 : SectorCreatedBy.hashCode());
		result = prime * result + SectorDisplaySequence;
		result = prime * result + ((SectorEffort == null) ? 0 : SectorEffort.hashCode());
		result = prime * result + SectorId;
		result = prime * result + ((SectorName == null) ? 0 : SectorName.hashCode());
		result = prime * result + ((SectorOwner == null) ? 0 : SectorOwner.hashCode());
		result = prime * result + ((SectorPercentCompletion == null) ? 0 : SectorPercentCompletion.hashCode());
		result = prime * result + SectorSequence;
		result = prime * result + ((SectorState == null) ? 0 : SectorState.hashCode());
		result = prime * result + ((SectorStatus == null) ? 0 : SectorStatus.hashCode());
		result = prime * result + ((SectorTasks == null) ? 0 : SectorTasks.hashCode());
		result = prime * result + ((SectorUpdatedAt == null) ? 0 : SectorUpdatedAt.hashCode());
		result = prime * result + ((SectorUpdatedBy == null) ? 0 : SectorUpdatedBy.hashCode());
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
		if (SectorCode == null) {
			if (other.SectorCode != null)
				return false;
		} else if (!SectorCode.equals(other.SectorCode))
			return false;
		if (SectorCreatedAt == null) {
			if (other.SectorCreatedAt != null)
				return false;
		} else if (!SectorCreatedAt.equals(other.SectorCreatedAt))
			return false;
		if (SectorCreatedBy == null) {
			if (other.SectorCreatedBy != null)
				return false;
		} else if (!SectorCreatedBy.equals(other.SectorCreatedBy))
			return false;
		if (SectorDisplaySequence != other.SectorDisplaySequence)
			return false;
		if (SectorEffort == null) {
			if (other.SectorEffort != null)
				return false;
		} else if (!SectorEffort.equals(other.SectorEffort))
			return false;
		if (SectorId != other.SectorId)
			return false;
		if (SectorName == null) {
			if (other.SectorName != null)
				return false;
		} else if (!SectorName.equals(other.SectorName))
			return false;
		if (SectorOwner == null) {
			if (other.SectorOwner != null)
				return false;
		} else if (!SectorOwner.equals(other.SectorOwner))
			return false;
		if (SectorPercentCompletion == null) {
			if (other.SectorPercentCompletion != null)
				return false;
		} else if (!SectorPercentCompletion.equals(other.SectorPercentCompletion))
			return false;
		if (SectorSequence != other.SectorSequence)
			return false;
		if (SectorState == null) {
			if (other.SectorState != null)
				return false;
		} else if (!SectorState.equals(other.SectorState))
			return false;
		if (SectorStatus == null) {
			if (other.SectorStatus != null)
				return false;
		} else if (!SectorStatus.equals(other.SectorStatus))
			return false;
		if (SectorTasks == null) {
			if (other.SectorTasks != null)
				return false;
		} else if (!SectorTasks.equals(other.SectorTasks))
			return false;
		if (SectorUpdatedAt == null) {
			if (other.SectorUpdatedAt != null)
				return false;
		} else if (!SectorUpdatedAt.equals(other.SectorUpdatedAt))
			return false;
		if (SectorUpdatedBy == null) {
			if (other.SectorUpdatedBy != null)
				return false;
		} else if (!SectorUpdatedBy.equals(other.SectorUpdatedBy))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Sector [SectorId=" + SectorId + ", SectorCode=" + SectorCode + ", SectorSequence="
				+ SectorSequence + ", SectorDisplaySequence=" + SectorDisplaySequence + ", SectorName="
				+ SectorName + ", SectorStatus=" + SectorStatus + ", SectorPercentCompletion="
				+ SectorPercentCompletion + ", SectorState=" + SectorState + ", SectorEffort=" + SectorEffort
				+ ", SectorOwner=" + SectorOwner + ", SectorCreatedBy=" + SectorCreatedBy
				+ ", SectorCreatedAt=" + SectorCreatedAt + ", SectorUpdatedBy=" + SectorUpdatedBy
				+ ", SectorUpdatedAt=" + SectorUpdatedAt + ", SectorTasks=" + SectorTasks + "]";
	}
}