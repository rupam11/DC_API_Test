package pojo;

public class Task {

	/*
	 * new Attribute : taskDisplaySequence
	 * String taskEffort;
	 * 	String taskOwner
	 * int taskSequence
	 */
	String percentCompletion;
	String taskApplicable;
	String taskCode;
	String taskComments;
	String taskCreatedAt;
	String taskCreatedBy;
	String taskDescription;
	int taskDisplaySequence;
	String taskEffort;
	int taskId;
	String taskOwner;
	String taskProcessName;
	int taskSequence;
	String taskSquadName;
	String taskSquadType;
	String taskState;
	String taskStatus;
	String taskUpdatedAt;
	String taskUpdatedBy;
	
	public Task() {}

	public Task(String percentCompletion, String taskApplicable, String taskCode, String taskComments,
			String taskCreatedAt, String taskCreatedBy, String taskDescription, int taskDisplaySequence,
			String taskEffort, int taskId, String taskOwner, String taskProcessName, int taskSequence,
			String taskSquadName, String taskSquadType, String taskState, String taskStatus, String taskUpdatedAt,
			String taskUpdatedBy) {
		super();
		this.percentCompletion = percentCompletion;
		this.taskApplicable = taskApplicable;
		this.taskCode = taskCode;
		this.taskComments = taskComments;
		this.taskCreatedAt = taskCreatedAt;
		this.taskCreatedBy = taskCreatedBy;
		this.taskDescription = taskDescription;
		this.taskDisplaySequence = taskDisplaySequence;
		this.taskEffort = taskEffort;
		this.taskId = taskId;
		this.taskOwner = taskOwner;
		this.taskProcessName = taskProcessName;
		this.taskSequence = taskSequence;
		this.taskSquadName = taskSquadName;
		this.taskSquadType = taskSquadType;
		this.taskState = taskState;
		this.taskStatus = taskStatus;
		this.taskUpdatedAt = taskUpdatedAt;
		this.taskUpdatedBy = taskUpdatedBy;
	}

	
	public String getPercentCompletion() {
		return percentCompletion;
	}

	public void setPercentCompletion(String percentCompletion) {
		this.percentCompletion = percentCompletion;
	}

	public String getTaskApplicable() {
		return taskApplicable;
	}

	public void setTaskApplicable(String taskApplicable) {
		this.taskApplicable = taskApplicable;
	}

	public String getTaskCode() {
		return taskCode;
	}

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getTaskComments() {
		return taskComments;
	}

	public void setTaskComments(String taskComments) {
		this.taskComments = taskComments;
	}

	public String getTaskCreatedAt() {
		return taskCreatedAt;
	}

	public void setTaskCreatedAt(String taskCreatedAt) {
		this.taskCreatedAt = taskCreatedAt;
	}

	public String getTaskCreatedBy() {
		return taskCreatedBy;
	}

	public void setTaskCreatedBy(String taskCreatedBy) {
		this.taskCreatedBy = taskCreatedBy;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public int getTaskDisplaySequence() {
		return taskDisplaySequence;
	}

	public void setTaskDisplaySequence(int taskDisplaySequence) {
		this.taskDisplaySequence = taskDisplaySequence;
	}

	public String getTaskEffort() {
		return taskEffort;
	}

	public void setTaskEffort(String taskEffort) {
		this.taskEffort = taskEffort;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskOwner() {
		return taskOwner;
	}

	public void setTaskOwner(String taskOwner) {
		this.taskOwner = taskOwner;
	}

	public String getTaskProcessName() {
		return taskProcessName;
	}

	public void setTaskProcessName(String taskProcessName) {
		this.taskProcessName = taskProcessName;
	}

	public int getTaskSequence() {
		return taskSequence;
	}

	public void setTaskSequence(int taskSequence) {
		this.taskSequence = taskSequence;
	}

	public String getTaskSquadName() {
		return taskSquadName;
	}

	public void setTaskSquadName(String taskSquadName) {
		this.taskSquadName = taskSquadName;
	}

	public String getTaskSquadType() {
		return taskSquadType;
	}

	public void setTaskSquadType(String taskSquadType) {
		this.taskSquadType = taskSquadType;
	}

	public String getTaskState() {
		return taskState;
	}

	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskUpdatedAt() {
		return taskUpdatedAt;
	}

	public void setTaskUpdatedAt(String taskUpdatedAt) {
		this.taskUpdatedAt = taskUpdatedAt;
	}

	public String getTaskUpdatedBy() {
		return taskUpdatedBy;
	}

	public void setTaskUpdatedBy(String taskUpdatedBy) {
		this.taskUpdatedBy = taskUpdatedBy;
	}

	@Override
	public String toString() {
		return "Task [taskPercentCompletion=" + percentCompletion + ", taskApplicable=" + taskApplicable
				+ ", taskCode=" + taskCode + ", taskComments=" + taskComments + ", taskCreatedAt=" + taskCreatedAt
				+ ", taskCreatedBy=" + taskCreatedBy + ", taskDescription=" + taskDescription + ", taskDisplaySequence="
				+ taskDisplaySequence + ", taskEffort=" + taskEffort + ", taskId=" + taskId + ", taskOwner=" + taskOwner
				+ ", taskProcessName=" + taskProcessName + ", taskSequence=" + taskSequence + ", taskSquadName="
				+ taskSquadName + ", taskSquadType=" + taskSquadType + ", taskState=" + taskState + ", taskStatus="
				+ taskStatus + ", taskUpdatedAt=" + taskUpdatedAt + ", taskUpdatedBy=" + taskUpdatedBy + "]";
	}

	

}
