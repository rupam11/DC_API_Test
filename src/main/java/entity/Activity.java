package entity;

import java.io.Serializable;
import java.util.List;


public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int activityId;
	
	
	private String activityCode;
	
	
	private int activitySequence;
	
	
	private int activityDisplaySequence;

	
	private String activityName;
	
	
	private String activityStatus;
	
	
	private String activityPercentCompletion;

	
	private String activityState;
	
	
	private String activityEffort;
	
	
	private String activityOwner;

	
	private String activityCreatedBy;

	
	private String activityCreatedAt;

	
	private String activityUpdatedBy;

	
	private String activityUpdatedAt;
	
	
	private List<Task> activityTasks;
	

	public Activity() {

	}


	/**
	 * @param activityId
	 * @param activityCode
	 * @param activitySequence
	 * @param activityDisplaySequence
	 * @param activityName
	 * @param activityStatus
	 * @param activityPercentCompletion
	 * @param activityState
	 * @param activityEffort
	 * @param activityOwner
	 * @param activityCreatedBy
	 * @param activityCreatedAt
	 * @param activityUpdatedBy
	 * @param activityUpdatedAt
	 * @param activityTasks
	 */
	public Activity(int activityId, String activityCode, int activitySequence, int activityDisplaySequence,
			String activityName, String activityStatus, String activityPercentCompletion, String activityState,
			String activityEffort, String activityOwner, String activityCreatedBy, String activityCreatedAt,
			String activityUpdatedBy, String activityUpdatedAt, List<Task> activityTasks) {
		super();
		this.activityId = activityId;
		this.activityCode = activityCode;
		this.activitySequence = activitySequence;
		this.activityDisplaySequence = activityDisplaySequence;
		this.activityName = activityName;
		this.activityStatus = activityStatus;
		this.activityPercentCompletion = activityPercentCompletion;
		this.activityState = activityState;
		this.activityEffort = activityEffort;
		this.activityOwner = activityOwner;
		this.activityCreatedBy = activityCreatedBy;
		this.activityCreatedAt = activityCreatedAt;
		this.activityUpdatedBy = activityUpdatedBy;
		this.activityUpdatedAt = activityUpdatedAt;
		this.activityTasks = activityTasks;
	}


	/**
	 * @return the activityId
	 */
	public int getActivityId() {
		return activityId;
	}


	/**
	 * @param activityId the activityId to set
	 */
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}


	/**
	 * @return the activityCode
	 */
	public String getActivityCode() {
		return activityCode;
	}


	/**
	 * @param activityCode the activityCode to set
	 */
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}


	/**
	 * @return the activitySequence
	 */
	public int getActivitySequence() {
		return activitySequence;
	}


	/**
	 * @param activitySequence the activitySequence to set
	 */
	public void setActivitySequence(int activitySequence) {
		this.activitySequence = activitySequence;
	}


	/**
	 * @return the activityDisplaySequence
	 */
	public int getActivityDisplaySequence() {
		return activityDisplaySequence;
	}


	/**
	 * @param activityDisplaySequence the activityDisplaySequence to set
	 */
	public void setActivityDisplaySequence(int activityDisplaySequence) {
		this.activityDisplaySequence = activityDisplaySequence;
	}


	/**
	 * @return the activityName
	 */
	public String getActivityName() {
		return activityName;
	}


	/**
	 * @param activityName the activityName to set
	 */
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}


	/**
	 * @return the activityStatus
	 */
	public String getActivityStatus() {
		return activityStatus;
	}


	/**
	 * @param activityStatus the activityStatus to set
	 */
	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}


	/**
	 * @return the activityPercentCompletion
	 */
	public String getActivityPercentCompletion() {
		return activityPercentCompletion;
	}


	/**
	 * @param activityPercentCompletion the activityPercentCompletion to set
	 */
	public void setActivityPercentCompletion(String activityPercentCompletion) {
		this.activityPercentCompletion = activityPercentCompletion;
	}


	/**
	 * @return the activityState
	 */
	public String getActivityState() {
		return activityState;
	}


	/**
	 * @param activityState the activityState to set
	 */
	public void setActivityState(String activityState) {
		this.activityState = activityState;
	}


	/**
	 * @return the activityEffort
	 */
	public String getActivityEffort() {
		return activityEffort;
	}


	/**
	 * @param activityEffort the activityEffort to set
	 */
	public void setActivityEffort(String activityEffort) {
		this.activityEffort = activityEffort;
	}


	/**
	 * @return the activityOwner
	 */
	public String getActivityOwner() {
		return activityOwner;
	}


	/**
	 * @param activityOwner the activityOwner to set
	 */
	public void setActivityOwner(String activityOwner) {
		this.activityOwner = activityOwner;
	}


	/**
	 * @return the activityCreatedBy
	 */
	public String getActivityCreatedBy() {
		return activityCreatedBy;
	}


	/**
	 * @param activityCreatedBy the activityCreatedBy to set
	 */
	public void setActivityCreatedBy(String activityCreatedBy) {
		this.activityCreatedBy = activityCreatedBy;
	}


	/**
	 * @return the activityCreatedAt
	 */
	public String getActivityCreatedAt() {
		return activityCreatedAt;
	}


	/**
	 * @param activityCreatedAt the activityCreatedAt to set
	 */
	public void setActivityCreatedAt(String activityCreatedAt) {
		this.activityCreatedAt = activityCreatedAt;
	}


	/**
	 * @return the activityUpdatedBy
	 */
	public String getActivityUpdatedBy() {
		return activityUpdatedBy;
	}


	/**
	 * @param activityUpdatedBy the activityUpdatedBy to set
	 */
	public void setActivityUpdatedBy(String activityUpdatedBy) {
		this.activityUpdatedBy = activityUpdatedBy;
	}


	/**
	 * @return the activityUpdatedAt
	 */
	public String getActivityUpdatedAt() {
		return activityUpdatedAt;
	}


	/**
	 * @param activityUpdatedAt the activityUpdatedAt to set
	 */
	public void setActivityUpdatedAt(String activityUpdatedAt) {
		this.activityUpdatedAt = activityUpdatedAt;
	}


	/**
	 * @return the activityTasks
	 */
	public List<Task> getActivityTasks() {
		return activityTasks;
	}


	/**
	 * @param activityTasks the activityTasks to set
	 */
	public void setActivityTasks(List<Task> activityTasks) {
		this.activityTasks = activityTasks;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activityCode == null) ? 0 : activityCode.hashCode());
		result = prime * result + ((activityCreatedAt == null) ? 0 : activityCreatedAt.hashCode());
		result = prime * result + ((activityCreatedBy == null) ? 0 : activityCreatedBy.hashCode());
		result = prime * result + activityDisplaySequence;
		result = prime * result + ((activityEffort == null) ? 0 : activityEffort.hashCode());
		result = prime * result + activityId;
		result = prime * result + ((activityName == null) ? 0 : activityName.hashCode());
		result = prime * result + ((activityOwner == null) ? 0 : activityOwner.hashCode());
		result = prime * result + ((activityPercentCompletion == null) ? 0 : activityPercentCompletion.hashCode());
		result = prime * result + activitySequence;
		result = prime * result + ((activityState == null) ? 0 : activityState.hashCode());
		result = prime * result + ((activityStatus == null) ? 0 : activityStatus.hashCode());
		result = prime * result + ((activityTasks == null) ? 0 : activityTasks.hashCode());
		result = prime * result + ((activityUpdatedAt == null) ? 0 : activityUpdatedAt.hashCode());
		result = prime * result + ((activityUpdatedBy == null) ? 0 : activityUpdatedBy.hashCode());
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
		Activity other = (Activity) obj;
		if (activityCode == null) {
			if (other.activityCode != null)
				return false;
		} else if (!activityCode.equals(other.activityCode))
			return false;
		if (activityCreatedAt == null) {
			if (other.activityCreatedAt != null)
				return false;
		} else if (!activityCreatedAt.equals(other.activityCreatedAt))
			return false;
		if (activityCreatedBy == null) {
			if (other.activityCreatedBy != null)
				return false;
		} else if (!activityCreatedBy.equals(other.activityCreatedBy))
			return false;
		if (activityDisplaySequence != other.activityDisplaySequence)
			return false;
		if (activityEffort == null) {
			if (other.activityEffort != null)
				return false;
		} else if (!activityEffort.equals(other.activityEffort))
			return false;
		if (activityId != other.activityId)
			return false;
		if (activityName == null) {
			if (other.activityName != null)
				return false;
		} else if (!activityName.equals(other.activityName))
			return false;
		if (activityOwner == null) {
			if (other.activityOwner != null)
				return false;
		} else if (!activityOwner.equals(other.activityOwner))
			return false;
		if (activityPercentCompletion == null) {
			if (other.activityPercentCompletion != null)
				return false;
		} else if (!activityPercentCompletion.equals(other.activityPercentCompletion))
			return false;
		if (activitySequence != other.activitySequence)
			return false;
		if (activityState == null) {
			if (other.activityState != null)
				return false;
		} else if (!activityState.equals(other.activityState))
			return false;
		if (activityStatus == null) {
			if (other.activityStatus != null)
				return false;
		} else if (!activityStatus.equals(other.activityStatus))
			return false;
		if (activityTasks == null) {
			if (other.activityTasks != null)
				return false;
		} else if (!activityTasks.equals(other.activityTasks))
			return false;
		if (activityUpdatedAt == null) {
			if (other.activityUpdatedAt != null)
				return false;
		} else if (!activityUpdatedAt.equals(other.activityUpdatedAt))
			return false;
		if (activityUpdatedBy == null) {
			if (other.activityUpdatedBy != null)
				return false;
		} else if (!activityUpdatedBy.equals(other.activityUpdatedBy))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Activity [activityId=" + activityId + ", activityCode=" + activityCode + ", activitySequence="
				+ activitySequence + ", activityDisplaySequence=" + activityDisplaySequence + ", activityName="
				+ activityName + ", activityStatus=" + activityStatus + ", activityPercentCompletion="
				+ activityPercentCompletion + ", activityState=" + activityState + ", activityEffort=" + activityEffort
				+ ", activityOwner=" + activityOwner + ", activityCreatedBy=" + activityCreatedBy
				+ ", activityCreatedAt=" + activityCreatedAt + ", activityUpdatedBy=" + activityUpdatedBy
				+ ", activityUpdatedAt=" + activityUpdatedAt + ", activityTasks=" + activityTasks + "]";
	}
}