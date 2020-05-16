package pojo;

import java.util.List;

public class Activity1 {
	
	

	/*Updtaed attributes:
	 *  "ActivityDisplaySequence": 0,
	 "ActivityEffort": "string",
	 "ActivityOwner": "string",
	 "ActivitySequence": 0,
	 */
	String ActivityCode;
	String ActivityCreatedAt;
	String ActivityCreatedBy;
	int ActivityDisplaySequence;
	String ActivityEffort;
	int ActivityId;
	String ActivityName;
	String ActivityOwner;
	String ActivityPercentCompletion;
	int ActivitySequence;
	String ActivityState;
	String ActivityStatus;	
	List<Task> ActivityTasks;
	String ActivityUpdatedAt;
	String ActivityUpdatedBy;

	public Activity1() {
		
	}

	public Activity1(String ActivityCode, String ActivityCreatedAt, String ActivityCreatedBy,
			int ActivityDisplaySequence, String ActivityEffort, int ActivityId, String ActivityName,
			String ActivityOwner, String ActivityPercentCompletion, int ActivitySequence, String ActivityState,
			String ActivityStatus, List<Task> ActivityTasks, String ActivityUpdatedAt, String ActivityUpdatedBy) {
		super();
		this.ActivityCode = ActivityCode;
		this.ActivityCreatedAt = ActivityCreatedAt;
		this.ActivityCreatedBy = ActivityCreatedBy;
		this.ActivityDisplaySequence = ActivityDisplaySequence;
		this.ActivityEffort = ActivityEffort;
		this.ActivityId = ActivityId;
		this.ActivityName = ActivityName;
		this.ActivityOwner = ActivityOwner;
		this.ActivityPercentCompletion = ActivityPercentCompletion;
		this.ActivitySequence = ActivitySequence;
		this.ActivityState = ActivityState;
		this.ActivityStatus = ActivityStatus;
		this.ActivityTasks = ActivityTasks;
		this.ActivityUpdatedAt = ActivityUpdatedAt;
		this.ActivityUpdatedBy = ActivityUpdatedBy;
	}

	
	public String getActivityCode() {
		return ActivityCode;
	}

	public void setActivityCode(String ActivityCode) {
		this.ActivityCode = ActivityCode;
	}

	public String getActivityCreatedAt() {
		return ActivityCreatedAt;
	}

	public void setActivityCreatedAt(String ActivityCreatedAt) {
		this.ActivityCreatedAt = ActivityCreatedAt;
	}

	public String getActivityCreatedBy() {
		return ActivityCreatedBy;
	}

	public void setActivityCreatedBy(String ActivityCreatedBy) {
		this.ActivityCreatedBy = ActivityCreatedBy;
	}

	public int getActivityDisplaySequence() {
		return ActivityDisplaySequence;
	}

	public void setActivityDisplaySequence(int ActivityDisplaySequence) {
		this.ActivityDisplaySequence = ActivityDisplaySequence;
	}

	public String getActivityEffort() {
		return ActivityEffort;
	}

	public void setActivityEffort(String ActivityEffort) {
		this.ActivityEffort = ActivityEffort;
	}

	public int getActivityId() {
		return ActivityId;
	}

	public void setActivityId(int ActivityId) {
		this.ActivityId = ActivityId;
	}

	public String getActivityName() {
		return ActivityName;
	}

	public void setActivityName(String ActivityName) {
		this.ActivityName = ActivityName;
	}

	public String getActivityOwner() {
		return ActivityOwner;
	}

	public void setActivityOwner(String ActivityOwner) {
		this.ActivityOwner = ActivityOwner;
	}

	public String getActivityPercentCompletion() {
		return ActivityPercentCompletion;
	}

	public void setActivityPercentCompletion(String ActivityPercentCompletion) {
		this.ActivityPercentCompletion = ActivityPercentCompletion;
	}

	public int getActivitySequence() {
		return ActivitySequence;
	}

	public void setActivitySequence(int ActivitySequence) {
		this.ActivitySequence = ActivitySequence;
	}

	public String getActivityState() {
		return ActivityState;
	}

	public void setActivityState(String ActivityState) {
		this.ActivityState = ActivityState;
	}

	public String getActivityStatus() {
		return ActivityStatus;
	}

	public void setActivityStatus(String ActivityStatus) {
		this.ActivityStatus = ActivityStatus;
	}

	
	public List<Task> getActivityTasks() {
		return ActivityTasks;
	}

	public void setActivityTasks(List<Task> ActivityTasks) {
		this.ActivityTasks = ActivityTasks;
	}

	public String getActivityUpdatedAt() {
		return ActivityUpdatedAt;
	}

	public void setActivityUpdatedAt(String ActivityUpdatedAt) {
		this.ActivityUpdatedAt = ActivityUpdatedAt;
	}

	public String getActivityUpdatedBy() {
		return ActivityUpdatedBy;
	}

	public void setActivityUpdatedBy(String ActivityUpdatedBy) {
		this.ActivityUpdatedBy = ActivityUpdatedBy;
	}	
	
	@Override
	public String toString() {
		return "Activity [ActivityCode=" + ActivityCode + ", ActivityCreatedAt=" + ActivityCreatedAt
				+ ", ActivityCreatedBy=" + ActivityCreatedBy + ", ActivityDisplaySequence=" + ActivityDisplaySequence
				+ ", ActivityEffort=" + ActivityEffort + ", ActivityId=" + ActivityId + ", ActivityName=" + ActivityName
				+ ", ActivityOwner=" + ActivityOwner + ", ActivityPercentCompletion=" + ActivityPercentCompletion
				+ ", ActivitySequence=" + ActivitySequence + ", ActivityState=" + ActivityState + ", ActivityStatus="
				+ ActivityStatus + ", ActivityTasks=" + ActivityTasks + ", ActivityUpdatedAt=" + ActivityUpdatedAt
				+ ", ActivityUpdatedBy=" + ActivityUpdatedBy + "]";
	}	

	}
