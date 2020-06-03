package entity;



import java.io.Serializable;

import javax.validation.constraints.NotNull;



public class ProjectTask implements Serializable {
private static final long serialVersionUID = 1L;
	
	
	@NotNull
	private int projectTaskId;
	@NotNull
	private int projectTaskCompletion;//%of Completion
	@NotNull
	private String projectTaskStartDate;
	@NotNull
	private String projectTaskEndDate;
	@NotNull
	private int projectTaskOwnerId;//userId
	@NotNull
	private String projectTaskActualStartDate;
	@NotNull
	private String projectTaskActualEndnDate;
	@NotNull
	private int projectTaskPlannedEffort;
	@NotNull
	private int projectTaskActualEffort;
	@NotNull
	private String projectTaskScheduleDeviationComment;
	@NotNull
	private String projectTaskState;//Not Started, Ongoing, Completed
	@NotNull
	private String projectTaskHealth;//Green,Abmer,Red(Ongoing), Not started(Dark )
	@NotNull
	private String projectTaskHappinessIndex;//High/Moderate/Low
	@NotNull
	private int projectTaskCompletionRate;//(0% to 100%)
	@NotNull
	private String projectTaskScheduleCompliance;//Compliant/Non Compliant, Deviated etc
	@NotNull
	private String projectTaskEffortCompliance;//Compliant/Non Compliant, Deviated etc
	@NotNull
	private String projectTaskCostCompliance;//Compliant/Non Compliant, Deviated etc
	public ProjectTask() {
		
	}
	/**
	 * @param projectTaskId
	 * @param projectTaskCompletion
	 * @param projectTaskStartDate
	 * @param projectTaskEndDate
	 * @param projectTaskOwnerId
	 * @param projectTaskActualStartDate
	 * @param projectTaskActualEndnDate
	 * @param projectTaskPlannedEffort
	 * @param projectTaskActualEffort
	 * @param projectTaskScheduleDeviationComment
	 * @param projectTaskState
	 * @param projectTaskHealth
	 * @param projectTaskHappinessIndex
	 * @param projectTaskCompletionRate
	 * @param projectTaskScheduleCompliance
	 * @param projectTaskEffortCompliance
	 * @param projectTaskCostCompliance
	 */
	public ProjectTask(@NotNull int projectTaskId, @NotNull int projectTaskCompletion,
			@NotNull String projectTaskStartDate, @NotNull String projectTaskEndDate, @NotNull int projectTaskOwnerId,
			@NotNull String projectTaskActualStartDate, @NotNull String projectTaskActualEndnDate,
			@NotNull int projectTaskPlannedEffort, @NotNull int projectTaskActualEffort,
			@NotNull String projectTaskScheduleDeviationComment, @NotNull String projectTaskState,
			@NotNull String projectTaskHealth, @NotNull String projectTaskHappinessIndex,
			@NotNull int projectTaskCompletionRate, @NotNull String projectTaskScheduleCompliance,
			@NotNull String projectTaskEffortCompliance, @NotNull String projectTaskCostCompliance) {
		super();
		this.projectTaskId = projectTaskId;
		this.projectTaskCompletion = projectTaskCompletion;
		this.projectTaskStartDate = projectTaskStartDate;
		this.projectTaskEndDate = projectTaskEndDate;
		this.projectTaskOwnerId = projectTaskOwnerId;
		this.projectTaskActualStartDate = projectTaskActualStartDate;
		this.projectTaskActualEndnDate = projectTaskActualEndnDate;
		this.projectTaskPlannedEffort = projectTaskPlannedEffort;
		this.projectTaskActualEffort = projectTaskActualEffort;
		this.projectTaskScheduleDeviationComment = projectTaskScheduleDeviationComment;
		this.projectTaskState = projectTaskState;
		this.projectTaskHealth = projectTaskHealth;
		this.projectTaskHappinessIndex = projectTaskHappinessIndex;
		this.projectTaskCompletionRate = projectTaskCompletionRate;
		this.projectTaskScheduleCompliance = projectTaskScheduleCompliance;
		this.projectTaskEffortCompliance = projectTaskEffortCompliance;
		this.projectTaskCostCompliance = projectTaskCostCompliance;
	}
	/**
	 * @return the projectTaskId
	 */
	public int getProjectTaskId() {
		return projectTaskId;
	}
	/**
	 * @param projectTaskId the projectTaskId to set
	 */
	public void setProjectTaskId(int projectTaskId) {
		this.projectTaskId = projectTaskId;
	}
	/**
	 * @return the projectTaskCompletion
	 */
	public int getProjectTaskCompletion() {
		return projectTaskCompletion;
	}
	/**
	 * @param projectTaskCompletion the projectTaskCompletion to set
	 */
	public void setProjectTaskCompletion(int projectTaskCompletion) {
		this.projectTaskCompletion = projectTaskCompletion;
	}
	/**
	 * @return the projectTaskStartDate
	 */
	public String getProjectTaskStartDate() {
		return projectTaskStartDate;
	}
	/**
	 * @param projectTaskStartDate the projectTaskStartDate to set
	 */
	public void setProjectTaskStartDate(String projectTaskStartDate) {
		this.projectTaskStartDate = projectTaskStartDate;
	}
	/**
	 * @return the projectTaskEndDate
	 */
	public String getProjectTaskEndDate() {
		return projectTaskEndDate;
	}
	/**
	 * @param projectTaskEndDate the projectTaskEndDate to set
	 */
	public void setProjectTaskEndDate(String projectTaskEndDate) {
		this.projectTaskEndDate = projectTaskEndDate;
	}
	/**
	 * @return the projectTaskOwnerId
	 */
	public int getProjectTaskOwnerId() {
		return projectTaskOwnerId;
	}
	/**
	 * @param projectTaskOwnerId the projectTaskOwnerId to set
	 */
	public void setProjectTaskOwnerId(int projectTaskOwnerId) {
		this.projectTaskOwnerId = projectTaskOwnerId;
	}
	/**
	 * @return the projectTaskActualStartDate
	 */
	public String getProjectTaskActualStartDate() {
		return projectTaskActualStartDate;
	}
	/**
	 * @param projectTaskActualStartDate the projectTaskActualStartDate to set
	 */
	public void setProjectTaskActualStartDate(String projectTaskActualStartDate) {
		this.projectTaskActualStartDate = projectTaskActualStartDate;
	}
	/**
	 * @return the projectTaskActualEndnDate
	 */
	public String getProjectTaskActualEndnDate() {
		return projectTaskActualEndnDate;
	}
	/**
	 * @param projectTaskActualEndnDate the projectTaskActualEndnDate to set
	 */
	public void setProjectTaskActualEndnDate(String projectTaskActualEndnDate) {
		this.projectTaskActualEndnDate = projectTaskActualEndnDate;
	}
	/**
	 * @return the projectTaskPlannedEffort
	 */
	public int getProjectTaskPlannedEffort() {
		return projectTaskPlannedEffort;
	}
	/**
	 * @param projectTaskPlannedEffort the projectTaskPlannedEffort to set
	 */
	public void setProjectTaskPlannedEffort(int projectTaskPlannedEffort) {
		this.projectTaskPlannedEffort = projectTaskPlannedEffort;
	}
	/**
	 * @return the projectTaskActualEffort
	 */
	public int getProjectTaskActualEffort() {
		return projectTaskActualEffort;
	}
	/**
	 * @param projectTaskActualEffort the projectTaskActualEffort to set
	 */
	public void setProjectTaskActualEffort(int projectTaskActualEffort) {
		this.projectTaskActualEffort = projectTaskActualEffort;
	}
	/**
	 * @return the projectTaskScheduleDeviationComment
	 */
	public String getProjectTaskScheduleDeviationComment() {
		return projectTaskScheduleDeviationComment;
	}
	/**
	 * @param projectTaskScheduleDeviationComment the projectTaskScheduleDeviationComment to set
	 */
	public void setProjectTaskScheduleDeviationComment(String projectTaskScheduleDeviationComment) {
		this.projectTaskScheduleDeviationComment = projectTaskScheduleDeviationComment;
	}
	/**
	 * @return the projectTaskState
	 */
	public String getProjectTaskState() {
		return projectTaskState;
	}
	/**
	 * @param projectTaskState the projectTaskState to set
	 */
	public void setProjectTaskState(String projectTaskState) {
		this.projectTaskState = projectTaskState;
	}
	/**
	 * @return the projectTaskHealth
	 */
	public String getProjectTaskHealth() {
		return projectTaskHealth;
	}
	/**
	 * @param projectTaskHealth the projectTaskHealth to set
	 */
	public void setProjectTaskHealth(String projectTaskHealth) {
		this.projectTaskHealth = projectTaskHealth;
	}
	/**
	 * @return the projectTaskHappinessIndex
	 */
	public String getProjectTaskHappinessIndex() {
		return projectTaskHappinessIndex;
	}
	/**
	 * @param projectTaskHappinessIndex the projectTaskHappinessIndex to set
	 */
	public void setProjectTaskHappinessIndex(String projectTaskHappinessIndex) {
		this.projectTaskHappinessIndex = projectTaskHappinessIndex;
	}
	/**
	 * @return the projectTaskCompletionRate
	 */
	public int getProjectTaskCompletionRate() {
		return projectTaskCompletionRate;
	}
	/**
	 * @param projectTaskCompletionRate the projectTaskCompletionRate to set
	 */
	public void setProjectTaskCompletionRate(int projectTaskCompletionRate) {
		this.projectTaskCompletionRate = projectTaskCompletionRate;
	}
	/**
	 * @return the projectTaskScheduleCompliance
	 */
	public String getProjectTaskScheduleCompliance() {
		return projectTaskScheduleCompliance;
	}
	/**
	 * @param projectTaskScheduleCompliance the projectTaskScheduleCompliance to set
	 */
	public void setProjectTaskScheduleCompliance(String projectTaskScheduleCompliance) {
		this.projectTaskScheduleCompliance = projectTaskScheduleCompliance;
	}
	/**
	 * @return the projectTaskEffortCompliance
	 */
	public String getProjectTaskEffortCompliance() {
		return projectTaskEffortCompliance;
	}
	/**
	 * @param projectTaskEffortCompliance the projectTaskEffortCompliance to set
	 */
	public void setProjectTaskEffortCompliance(String projectTaskEffortCompliance) {
		this.projectTaskEffortCompliance = projectTaskEffortCompliance;
	}
	/**
	 * @return the projectTaskCostCompliance
	 */
	public String getProjectTaskCostCompliance() {
		return projectTaskCostCompliance;
	}
	/**
	 * @param projectTaskCostCompliance the projectTaskCostCompliance to set
	 */
	public void setProjectTaskCostCompliance(String projectTaskCostCompliance) {
		this.projectTaskCostCompliance = projectTaskCostCompliance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + projectTaskActualEffort;
		result = prime * result + ((projectTaskActualEndnDate == null) ? 0 : projectTaskActualEndnDate.hashCode());
		result = prime * result + ((projectTaskActualStartDate == null) ? 0 : projectTaskActualStartDate.hashCode());
		result = prime * result + projectTaskCompletion;
		result = prime * result + projectTaskCompletionRate;
		result = prime * result + ((projectTaskCostCompliance == null) ? 0 : projectTaskCostCompliance.hashCode());
		result = prime * result + ((projectTaskEffortCompliance == null) ? 0 : projectTaskEffortCompliance.hashCode());
		result = prime * result + ((projectTaskEndDate == null) ? 0 : projectTaskEndDate.hashCode());
		result = prime * result + ((projectTaskHappinessIndex == null) ? 0 : projectTaskHappinessIndex.hashCode());
		result = prime * result + ((projectTaskHealth == null) ? 0 : projectTaskHealth.hashCode());
		result = prime * result + projectTaskId;
		result = prime * result + projectTaskOwnerId;
		result = prime * result + projectTaskPlannedEffort;
		result = prime * result
				+ ((projectTaskScheduleCompliance == null) ? 0 : projectTaskScheduleCompliance.hashCode());
		result = prime * result
				+ ((projectTaskScheduleDeviationComment == null) ? 0 : projectTaskScheduleDeviationComment.hashCode());
		result = prime * result + ((projectTaskStartDate == null) ? 0 : projectTaskStartDate.hashCode());
		result = prime * result + ((projectTaskState == null) ? 0 : projectTaskState.hashCode());
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
		ProjectTask other = (ProjectTask) obj;
		if (projectTaskActualEffort != other.projectTaskActualEffort)
			return false;
		if (projectTaskActualEndnDate == null) {
			if (other.projectTaskActualEndnDate != null)
				return false;
		} else if (!projectTaskActualEndnDate.equals(other.projectTaskActualEndnDate))
			return false;
		if (projectTaskActualStartDate == null) {
			if (other.projectTaskActualStartDate != null)
				return false;
		} else if (!projectTaskActualStartDate.equals(other.projectTaskActualStartDate))
			return false;
		if (projectTaskCompletion != other.projectTaskCompletion)
			return false;
		if (projectTaskCompletionRate != other.projectTaskCompletionRate)
			return false;
		if (projectTaskCostCompliance == null) {
			if (other.projectTaskCostCompliance != null)
				return false;
		} else if (!projectTaskCostCompliance.equals(other.projectTaskCostCompliance))
			return false;
		if (projectTaskEffortCompliance == null) {
			if (other.projectTaskEffortCompliance != null)
				return false;
		} else if (!projectTaskEffortCompliance.equals(other.projectTaskEffortCompliance))
			return false;
		if (projectTaskEndDate == null) {
			if (other.projectTaskEndDate != null)
				return false;
		} else if (!projectTaskEndDate.equals(other.projectTaskEndDate))
			return false;
		if (projectTaskHappinessIndex == null) {
			if (other.projectTaskHappinessIndex != null)
				return false;
		} else if (!projectTaskHappinessIndex.equals(other.projectTaskHappinessIndex))
			return false;
		if (projectTaskHealth == null) {
			if (other.projectTaskHealth != null)
				return false;
		} else if (!projectTaskHealth.equals(other.projectTaskHealth))
			return false;
		if (projectTaskId != other.projectTaskId)
			return false;
		if (projectTaskOwnerId != other.projectTaskOwnerId)
			return false;
		if (projectTaskPlannedEffort != other.projectTaskPlannedEffort)
			return false;
		if (projectTaskScheduleCompliance == null) {
			if (other.projectTaskScheduleCompliance != null)
				return false;
		} else if (!projectTaskScheduleCompliance.equals(other.projectTaskScheduleCompliance))
			return false;
		if (projectTaskScheduleDeviationComment == null) {
			if (other.projectTaskScheduleDeviationComment != null)
				return false;
		} else if (!projectTaskScheduleDeviationComment.equals(other.projectTaskScheduleDeviationComment))
			return false;
		if (projectTaskStartDate == null) {
			if (other.projectTaskStartDate != null)
				return false;
		} else if (!projectTaskStartDate.equals(other.projectTaskStartDate))
			return false;
		if (projectTaskState == null) {
			if (other.projectTaskState != null)
				return false;
		} else if (!projectTaskState.equals(other.projectTaskState))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ProjectTask [projectTaskId=" + projectTaskId + ", projectTaskCompletion=" + projectTaskCompletion
				+ ", projectTaskStartDate=" + projectTaskStartDate + ", projectTaskEndDate=" + projectTaskEndDate
				+ ", projectTaskOwnerId=" + projectTaskOwnerId + ", projectTaskActualStartDate="
				+ projectTaskActualStartDate + ", projectTaskActualEndnDate=" + projectTaskActualEndnDate
				+ ", projectTaskPlannedEffort=" + projectTaskPlannedEffort + ", projectTaskActualEffort="
				+ projectTaskActualEffort + ", projectTaskScheduleDeviationComment="
				+ projectTaskScheduleDeviationComment + ", projectTaskState=" + projectTaskState
				+ ", projectTaskHealth=" + projectTaskHealth + ", projectTaskHappinessIndex="
				+ projectTaskHappinessIndex + ", projectTaskCompletionRate=" + projectTaskCompletionRate
				+ ", projectTaskScheduleCompliance=" + projectTaskScheduleCompliance + ", projectTaskEffortCompliance="
				+ projectTaskEffortCompliance + ", projectTaskCostCompliance=" + projectTaskCostCompliance + "]";
	}
}
