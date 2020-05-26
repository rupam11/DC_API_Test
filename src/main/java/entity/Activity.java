package entity;

import java.io.Serializable;
import java.util.List;

public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int ActivityId;
	
	
	private String ActivityCode;
	
	
	private int ActivitySequence;
	
	
	private int ActivityDisplaySequence;

	
	private String ActivityName;
	
	
	private String ActivityStatus;
	
	
	private String ActivityPercentCompletion;

	
	private String ActivityState;
	
	
	private String ActivityEffort;
	
	
	private String ActivityOwner;

	
	private String ActivityCreatedBy;

	
	private String ActivityCreatedAt;

	
	private String ActivityUpdatedBy;

	
	private String ActivityUpdatedAt;
	
	
	private List<Task> ActivityTasks;
	

	public Activity() {

	}


	/**
	 * @param ActivityId
	 * @param ActivityCode
	 * @param ActivitySequence
	 * @param ActivityDisplaySequence
	 * @param ActivityName
	 * @param ActivityStatus
	 * @param ActivityPercentCompletion
	 * @param ActivityState
	 * @param ActivityEffort
	 * @param ActivityOwner
	 * @param ActivityCreatedBy
	 * @param ActivityCreatedAt
	 * @param ActivityUpdatedBy
	 * @param ActivityUpdatedAt
	 * @param ActivityTasks
	 */
	public Activity(int ActivityId, String ActivityCode, int ActivitySequence, int ActivityDisplaySequence,
			String ActivityName, String ActivityStatus, String ActivityPercentCompletion, String ActivityState,
			String ActivityEffort, String ActivityOwner, String ActivityCreatedBy, String ActivityCreatedAt,
			String ActivityUpdatedBy, String ActivityUpdatedAt, List<Task> ActivityTasks) {
		super();
		this.ActivityId = ActivityId;
		this.ActivityCode = ActivityCode;
		this.ActivitySequence = ActivitySequence;
		this.ActivityDisplaySequence = ActivityDisplaySequence;
		this.ActivityName = ActivityName;
		this.ActivityStatus = ActivityStatus;
		this.ActivityPercentCompletion = ActivityPercentCompletion;
		this.ActivityState = ActivityState;
		this.ActivityEffort = ActivityEffort;
		this.ActivityOwner = ActivityOwner;
		this.ActivityCreatedBy = ActivityCreatedBy;
		this.ActivityCreatedAt = ActivityCreatedAt;
		this.ActivityUpdatedBy = ActivityUpdatedBy;
		this.ActivityUpdatedAt = ActivityUpdatedAt;
		this.ActivityTasks = ActivityTasks;
	}


	/**
	 * @return the ActivityId
	 */
	public int getActivityId() {
		return ActivityId;
	}


	/**
	 * @param ActivityId the ActivityId to set
	 */
	public void setActivityId(int ActivityId) {
		this.ActivityId = ActivityId;
	}


	/**
	 * @return the ActivityCode
	 */
	public String getActivityCode() {
		return ActivityCode;
	}


	/**
	 * @param ActivityCode the ActivityCode to set
	 */
	public void setActivityCode(String ActivityCode) {
		this.ActivityCode = ActivityCode;
	}


	/**
	 * @return the ActivitySequence
	 */
	public int getActivitySequence() {
		return ActivitySequence;
	}


	/**
	 * @param ActivitySequence the ActivitySequence to set
	 */
	public void setActivitySequence(int ActivitySequence) {
		this.ActivitySequence = ActivitySequence;
	}


	/**
	 * @return the ActivityDisplaySequence
	 */
	public int getActivityDisplaySequence() {
		return ActivityDisplaySequence;
	}


	/**
	 * @param ActivityDisplaySequence the ActivityDisplaySequence to set
	 */
	public void setActivityDisplaySequence(int ActivityDisplaySequence) {
		this.ActivityDisplaySequence = ActivityDisplaySequence;
	}


	/**
	 * @return the ActivityName
	 */
	public String getActivityName() {
		return ActivityName;
	}


	/**
	 * @param ActivityName the ActivityName to set
	 */
	public void setActivityName(String ActivityName) {
		this.ActivityName = ActivityName;
	}


	/**
	 * @return the ActivityStatus
	 */
	public String getActivityStatus() {
		return ActivityStatus;
	}


	/**
	 * @param ActivityStatus the ActivityStatus to set
	 */
	public void setActivityStatus(String ActivityStatus) {
		this.ActivityStatus = ActivityStatus;
	}


	/**
	 * @return the ActivityPercentCompletion
	 */
	public String getActivityPercentCompletion() {
		return ActivityPercentCompletion;
	}


	/**
	 * @param ActivityPercentCompletion the ActivityPercentCompletion to set
	 */
	public void setActivityPercentCompletion(String ActivityPercentCompletion) {
		this.ActivityPercentCompletion = ActivityPercentCompletion;
	}


	/**
	 * @return the ActivityState
	 */
	public String getActivityState() {
		return ActivityState;
	}


	/**
	 * @param ActivityState the ActivityState to set
	 */
	public void setActivityState(String ActivityState) {
		this.ActivityState = ActivityState;
	}


	/**
	 * @return the ActivityEffort
	 */
	public String getActivityEffort() {
		return ActivityEffort;
	}


	/**
	 * @param ActivityEffort the ActivityEffort to set
	 */
	public void setActivityEffort(String ActivityEffort) {
		this.ActivityEffort = ActivityEffort;
	}


	/**
	 * @return the ActivityOwner
	 */
	public String getActivityOwner() {
		return ActivityOwner;
	}


	/**
	 * @param ActivityOwner the ActivityOwner to set
	 */
	public void setActivityOwner(String ActivityOwner) {
		this.ActivityOwner = ActivityOwner;
	}


	/**
	 * @return the ActivityCreatedBy
	 */
	public String getActivityCreatedBy() {
		return ActivityCreatedBy;
	}


	/**
	 * @param ActivityCreatedBy the ActivityCreatedBy to set
	 */
	public void setActivityCreatedBy(String ActivityCreatedBy) {
		this.ActivityCreatedBy = ActivityCreatedBy;
	}


	/**
	 * @return the ActivityCreatedAt
	 */
	public String getActivityCreatedAt() {
		return ActivityCreatedAt;
	}


	/**
	 * @param ActivityCreatedAt the ActivityCreatedAt to set
	 */
	public void setActivityCreatedAt(String ActivityCreatedAt) {
		this.ActivityCreatedAt = ActivityCreatedAt;
	}


	/**
	 * @return the ActivityUpdatedBy
	 */
	public String getActivityUpdatedBy() {
		return ActivityUpdatedBy;
	}


	/**
	 * @param ActivityUpdatedBy the ActivityUpdatedBy to set
	 */
	public void setActivityUpdatedBy(String ActivityUpdatedBy) {
		this.ActivityUpdatedBy = ActivityUpdatedBy;
	}


	/**
	 * @return the ActivityUpdatedAt
	 */
	public String getActivityUpdatedAt() {
		return ActivityUpdatedAt;
	}


	/**
	 * @param ActivityUpdatedAt the ActivityUpdatedAt to set
	 */
	public void setActivityUpdatedAt(String ActivityUpdatedAt) {
		this.ActivityUpdatedAt = ActivityUpdatedAt;
	}


	/**
	 * @return the ActivityTasks
	 */
	public List<Task> getActivityTasks() {
		return ActivityTasks;
	}


	/**
	 * @param ActivityTasks the ActivityTasks to set
	 */
	public void setActivityTasks(List<Task> ActivityTasks) {
		this.ActivityTasks = ActivityTasks;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ActivityCode == null) ? 0 : ActivityCode.hashCode());
		result = prime * result + ((ActivityCreatedAt == null) ? 0 : ActivityCreatedAt.hashCode());
		result = prime * result + ((ActivityCreatedBy == null) ? 0 : ActivityCreatedBy.hashCode());
		result = prime * result + ActivityDisplaySequence;
		result = prime * result + ((ActivityEffort == null) ? 0 : ActivityEffort.hashCode());
		result = prime * result + ActivityId;
		result = prime * result + ((ActivityName == null) ? 0 : ActivityName.hashCode());
		result = prime * result + ((ActivityOwner == null) ? 0 : ActivityOwner.hashCode());
		result = prime * result + ((ActivityPercentCompletion == null) ? 0 : ActivityPercentCompletion.hashCode());
		result = prime * result + ActivitySequence;
		result = prime * result + ((ActivityState == null) ? 0 : ActivityState.hashCode());
		result = prime * result + ((ActivityStatus == null) ? 0 : ActivityStatus.hashCode());
		result = prime * result + ((ActivityTasks == null) ? 0 : ActivityTasks.hashCode());
		result = prime * result + ((ActivityUpdatedAt == null) ? 0 : ActivityUpdatedAt.hashCode());
		result = prime * result + ((ActivityUpdatedBy == null) ? 0 : ActivityUpdatedBy.hashCode());
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
		if (ActivityCode == null) {
			if (other.ActivityCode != null)
				return false;
		} else if (!ActivityCode.equals(other.ActivityCode))
			return false;
		if (ActivityCreatedAt == null) {
			if (other.ActivityCreatedAt != null)
				return false;
		} else if (!ActivityCreatedAt.equals(other.ActivityCreatedAt))
			return false;
		if (ActivityCreatedBy == null) {
			if (other.ActivityCreatedBy != null)
				return false;
		} else if (!ActivityCreatedBy.equals(other.ActivityCreatedBy))
			return false;
		if (ActivityDisplaySequence != other.ActivityDisplaySequence)
			return false;
		if (ActivityEffort == null) {
			if (other.ActivityEffort != null)
				return false;
		} else if (!ActivityEffort.equals(other.ActivityEffort))
			return false;
		if (ActivityId != other.ActivityId)
			return false;
		if (ActivityName == null) {
			if (other.ActivityName != null)
				return false;
		} else if (!ActivityName.equals(other.ActivityName))
			return false;
		if (ActivityOwner == null) {
			if (other.ActivityOwner != null)
				return false;
		} else if (!ActivityOwner.equals(other.ActivityOwner))
			return false;
		if (ActivityPercentCompletion == null) {
			if (other.ActivityPercentCompletion != null)
				return false;
		} else if (!ActivityPercentCompletion.equals(other.ActivityPercentCompletion))
			return false;
		if (ActivitySequence != other.ActivitySequence)
			return false;
		if (ActivityState == null) {
			if (other.ActivityState != null)
				return false;
		} else if (!ActivityState.equals(other.ActivityState))
			return false;
		if (ActivityStatus == null) {
			if (other.ActivityStatus != null)
				return false;
		} else if (!ActivityStatus.equals(other.ActivityStatus))
			return false;
		if (ActivityTasks == null) {
			if (other.ActivityTasks != null)
				return false;
		} else if (!ActivityTasks.equals(other.ActivityTasks))
			return false;
		if (ActivityUpdatedAt == null) {
			if (other.ActivityUpdatedAt != null)
				return false;
		} else if (!ActivityUpdatedAt.equals(other.ActivityUpdatedAt))
			return false;
		if (ActivityUpdatedBy == null) {
			if (other.ActivityUpdatedBy != null)
				return false;
		} else if (!ActivityUpdatedBy.equals(other.ActivityUpdatedBy))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Activity [ActivityId=" + ActivityId + ", ActivityCode=" + ActivityCode + ", ActivitySequence="
				+ ActivitySequence + ", ActivityDisplaySequence=" + ActivityDisplaySequence + ", ActivityName="
				+ ActivityName + ", ActivityStatus=" + ActivityStatus + ", ActivityPercentCompletion="
				+ ActivityPercentCompletion + ", ActivityState=" + ActivityState + ", ActivityEffort=" + ActivityEffort
				+ ", ActivityOwner=" + ActivityOwner + ", ActivityCreatedBy=" + ActivityCreatedBy
				+ ", ActivityCreatedAt=" + ActivityCreatedAt + ", ActivityUpdatedBy=" + ActivityUpdatedBy
				+ ", ActivityUpdatedAt=" + ActivityUpdatedAt + ", ActivityTasks=" + ActivityTasks + "]";
	}
}