package TBDpojo;

import java.io.Serializable;



public class Task implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int taskId;
	
	
	private String taskCode;
	
	
	private int taskSequence;
	
	
	private int taskDisplaySequence;
	
	
	private String taskDescription;
	
	
	private String taskStatus;//Active-Passive
	
	
	private String taskComments;
	
	
	private String taskApplicable;//Yes--No
	
	
	private String percentCompletion;//given By user
	
	
	private String taskState;//Not Started-In Progress-Completed
	
	
	private String taskEffort;
	
	
	private String taskOwner;
	
	
	private String taskCreatedBy;

	
	private String taskCreatedAt;

	
	private String taskUpdatedBy;

	
	private String taskUpdatedAt;
	
	
	private String taskProcessName;
	
	
	private String taskSquadName;//Name of the Squad
	
	
	private String taskSquadType;//IBM/Client/JOINT

	public Task() {

	}

	/**
	 * @param taskId
	 * @param taskCode
	 * @param taskSequence
	 * @param taskDisplaySequence
	 * @param taskDescription
	 * @param taskStatus
	 * @param taskComments
	 * @param taskApplicable
	 * @param percentCompletion
	 * @param taskState
	 * @param taskEffort
	 * @param taskOwner
	 * @param taskCreatedBy
	 * @param taskCreatedAt
	 * @param taskUpdatedBy
	 * @param taskUpdatedAt
	 * @param taskProcessName
	 * @param taskSquadName
	 * @param taskSquadType
	 */
	public Task(int taskId, String taskCode, int taskSequence, int taskDisplaySequence, String taskDescription,
			String taskStatus, String taskComments, String taskApplicable, String percentCompletion, String taskState,
			String taskEffort, String taskOwner, String taskCreatedBy, String taskCreatedAt, String taskUpdatedBy,
			String taskUpdatedAt, String taskProcessName, String taskSquadName, String taskSquadType) {
		super();
		this.taskId = taskId;
		this.taskCode = taskCode;
		this.taskSequence = taskSequence;
		this.taskDisplaySequence = taskDisplaySequence;
		this.taskDescription = taskDescription;
		this.taskStatus = taskStatus;
		this.taskComments = taskComments;
		this.taskApplicable = taskApplicable;
		this.percentCompletion = percentCompletion;
		this.taskState = taskState;
		this.taskEffort = taskEffort;
		this.taskOwner = taskOwner;
		this.taskCreatedBy = taskCreatedBy;
		this.taskCreatedAt = taskCreatedAt;
		this.taskUpdatedBy = taskUpdatedBy;
		this.taskUpdatedAt = taskUpdatedAt;
		this.taskProcessName = taskProcessName;
		this.taskSquadName = taskSquadName;
		this.taskSquadType = taskSquadType;
	}

	/**
	 * @return the taskId
	 */
	public int getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	/**
	 * @return the taskCode
	 */
	public String getTaskCode() {
		return taskCode;
	}

	/**
	 * @param taskCode the taskCode to set
	 */
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	/**
	 * @return the taskSequence
	 */
	public int getTaskSequence() {
		return taskSequence;
	}

	/**
	 * @param taskSequence the taskSequence to set
	 */
	public void setTaskSequence(int taskSequence) {
		this.taskSequence = taskSequence;
	}

	/**
	 * @return the taskDisplaySequence
	 */
	public int getTaskDisplaySequence() {
		return taskDisplaySequence;
	}

	/**
	 * @param taskDisplaySequence the taskDisplaySequence to set
	 */
	public void setTaskDisplaySequence(int taskDisplaySequence) {
		this.taskDisplaySequence = taskDisplaySequence;
	}

	/**
	 * @return the taskDescription
	 */
	public String getTaskDescription() {
		return taskDescription;
	}

	/**
	 * @param taskDescription the taskDescription to set
	 */
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	/**
	 * @return the taskStatus
	 */
	public String getTaskStatus() {
		return taskStatus;
	}

	/**
	 * @param taskStatus the taskStatus to set
	 */
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	/**
	 * @return the taskComments
	 */
	public String getTaskComments() {
		return taskComments;
	}

	/**
	 * @param taskComments the taskComments to set
	 */
	public void setTaskComments(String taskComments) {
		this.taskComments = taskComments;
	}

	/**
	 * @return the taskApplicable
	 */
	public String getTaskApplicable() {
		return taskApplicable;
	}

	/**
	 * @param taskApplicable the taskApplicable to set
	 */
	public void setTaskApplicable(String taskApplicable) {
		this.taskApplicable = taskApplicable;
	}

	/**
	 * @return the percentCompletion
	 */
	public String getPercentCompletion() {
		return percentCompletion;
	}

	/**
	 * @param percentCompletion the percentCompletion to set
	 */
	public void setPercentCompletion(String percentCompletion) {
		this.percentCompletion = percentCompletion;
	}

	/**
	 * @return the taskState
	 */
	public String getTaskState() {
		return taskState;
	}

	/**
	 * @param taskState the taskState to set
	 */
	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}

	/**
	 * @return the taskEffort
	 */
	public String getTaskEffort() {
		return taskEffort;
	}

	/**
	 * @param taskEffort the taskEffort to set
	 */
	public void setTaskEffort(String taskEffort) {
		this.taskEffort = taskEffort;
	}

	/**
	 * @return the taskOwner
	 */
	public String getTaskOwner() {
		return taskOwner;
	}

	/**
	 * @param taskOwner the taskOwner to set
	 */
	public void setTaskOwner(String taskOwner) {
		this.taskOwner = taskOwner;
	}

	/**
	 * @return the taskCreatedBy
	 */
	public String getTaskCreatedBy() {
		return taskCreatedBy;
	}

	/**
	 * @param taskCreatedBy the taskCreatedBy to set
	 */
	public void setTaskCreatedBy(String taskCreatedBy) {
		this.taskCreatedBy = taskCreatedBy;
	}

	/**
	 * @return the taskCreatedAt
	 */
	public String getTaskCreatedAt() {
		return taskCreatedAt;
	}

	/**
	 * @param taskCreatedAt the taskCreatedAt to set
	 */
	public void setTaskCreatedAt(String taskCreatedAt) {
		this.taskCreatedAt = taskCreatedAt;
	}

	/**
	 * @return the taskUpdatedBy
	 */
	public String getTaskUpdatedBy() {
		return taskUpdatedBy;
	}

	/**
	 * @param taskUpdatedBy the taskUpdatedBy to set
	 */
	public void setTaskUpdatedBy(String taskUpdatedBy) {
		this.taskUpdatedBy = taskUpdatedBy;
	}

	/**
	 * @return the taskUpdatedAt
	 */
	public String getTaskUpdatedAt() {
		return taskUpdatedAt;
	}

	/**
	 * @param taskUpdatedAt the taskUpdatedAt to set
	 */
	public void setTaskUpdatedAt(String taskUpdatedAt) {
		this.taskUpdatedAt = taskUpdatedAt;
	}

	/**
	 * @return the taskProcessName
	 */
	public String getTaskProcessName() {
		return taskProcessName;
	}

	/**
	 * @param taskProcessName the taskProcessName to set
	 */
	public void setTaskProcessName(String taskProcessName) {
		this.taskProcessName = taskProcessName;
	}

	/**
	 * @return the taskSquadName
	 */
	public String getTaskSquadName() {
		return taskSquadName;
	}

	/**
	 * @param taskSquadName the taskSquadName to set
	 */
	public void setTaskSquadName(String taskSquadName) {
		this.taskSquadName = taskSquadName;
	}

	/**
	 * @return the taskSquadType
	 */
	public String getTaskSquadType() {
		return taskSquadType;
	}

	/**
	 * @param taskSquadType the taskSquadType to set
	 */
	public void setTaskSquadType(String taskSquadType) {
		this.taskSquadType = taskSquadType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((percentCompletion == null) ? 0 : percentCompletion.hashCode());
		result = prime * result + ((taskApplicable == null) ? 0 : taskApplicable.hashCode());
		result = prime * result + ((taskCode == null) ? 0 : taskCode.hashCode());
		result = prime * result + ((taskComments == null) ? 0 : taskComments.hashCode());
		result = prime * result + ((taskCreatedAt == null) ? 0 : taskCreatedAt.hashCode());
		result = prime * result + ((taskCreatedBy == null) ? 0 : taskCreatedBy.hashCode());
		result = prime * result + ((taskDescription == null) ? 0 : taskDescription.hashCode());
		result = prime * result + taskDisplaySequence;
		result = prime * result + ((taskEffort == null) ? 0 : taskEffort.hashCode());
		result = prime * result + taskId;
		result = prime * result + ((taskOwner == null) ? 0 : taskOwner.hashCode());
		result = prime * result + ((taskProcessName == null) ? 0 : taskProcessName.hashCode());
		result = prime * result + taskSequence;
		result = prime * result + ((taskSquadName == null) ? 0 : taskSquadName.hashCode());
		result = prime * result + ((taskSquadType == null) ? 0 : taskSquadType.hashCode());
		result = prime * result + ((taskState == null) ? 0 : taskState.hashCode());
		result = prime * result + ((taskStatus == null) ? 0 : taskStatus.hashCode());
		result = prime * result + ((taskUpdatedAt == null) ? 0 : taskUpdatedAt.hashCode());
		result = prime * result + ((taskUpdatedBy == null) ? 0 : taskUpdatedBy.hashCode());
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
		Task other = (Task) obj;
		if (percentCompletion == null) {
			if (other.percentCompletion != null)
				return false;
		} else if (!percentCompletion.equals(other.percentCompletion))
			return false;
		if (taskApplicable == null) {
			if (other.taskApplicable != null)
				return false;
		} else if (!taskApplicable.equals(other.taskApplicable))
			return false;
		if (taskCode == null) {
			if (other.taskCode != null)
				return false;
		} else if (!taskCode.equals(other.taskCode))
			return false;
		if (taskComments == null) {
			if (other.taskComments != null)
				return false;
		} else if (!taskComments.equals(other.taskComments))
			return false;
		if (taskCreatedAt == null) {
			if (other.taskCreatedAt != null)
				return false;
		} else if (!taskCreatedAt.equals(other.taskCreatedAt))
			return false;
		if (taskCreatedBy == null) {
			if (other.taskCreatedBy != null)
				return false;
		} else if (!taskCreatedBy.equals(other.taskCreatedBy))
			return false;
		if (taskDescription == null) {
			if (other.taskDescription != null)
				return false;
		} else if (!taskDescription.equals(other.taskDescription))
			return false;
		if (taskDisplaySequence != other.taskDisplaySequence)
			return false;
		if (taskEffort == null) {
			if (other.taskEffort != null)
				return false;
		} else if (!taskEffort.equals(other.taskEffort))
			return false;
		if (taskId != other.taskId)
			return false;
		if (taskOwner == null) {
			if (other.taskOwner != null)
				return false;
		} else if (!taskOwner.equals(other.taskOwner))
			return false;
		if (taskProcessName == null) {
			if (other.taskProcessName != null)
				return false;
		} else if (!taskProcessName.equals(other.taskProcessName))
			return false;
		if (taskSequence != other.taskSequence)
			return false;
		if (taskSquadName == null) {
			if (other.taskSquadName != null)
				return false;
		} else if (!taskSquadName.equals(other.taskSquadName))
			return false;
		if (taskSquadType == null) {
			if (other.taskSquadType != null)
				return false;
		} else if (!taskSquadType.equals(other.taskSquadType))
			return false;
		if (taskState == null) {
			if (other.taskState != null)
				return false;
		} else if (!taskState.equals(other.taskState))
			return false;
		if (taskStatus == null) {
			if (other.taskStatus != null)
				return false;
		} else if (!taskStatus.equals(other.taskStatus))
			return false;
		if (taskUpdatedAt == null) {
			if (other.taskUpdatedAt != null)
				return false;
		} else if (!taskUpdatedAt.equals(other.taskUpdatedAt))
			return false;
		if (taskUpdatedBy == null) {
			if (other.taskUpdatedBy != null)
				return false;
		} else if (!taskUpdatedBy.equals(other.taskUpdatedBy))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskCode=" + taskCode + ", taskSequence=" + taskSequence
				+ ", taskDisplaySequence=" + taskDisplaySequence + ", taskDescription=" + taskDescription
				+ ", taskStatus=" + taskStatus + ", taskComments=" + taskComments + ", taskApplicable=" + taskApplicable
				+ ", percentCompletion=" + percentCompletion + ", taskState=" + taskState + ", taskEffort=" + taskEffort
				+ ", taskOwner=" + taskOwner + ", taskCreatedBy=" + taskCreatedBy + ", taskCreatedAt=" + taskCreatedAt
				+ ", taskUpdatedBy=" + taskUpdatedBy + ", taskUpdatedAt=" + taskUpdatedAt + ", taskProcessName="
				+ taskProcessName + ", taskSquadName=" + taskSquadName + ", taskSquadType=" + taskSquadType + "]";
	}
}