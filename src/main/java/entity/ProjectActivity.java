package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;


public class ProjectActivity implements Serializable {
private static final long serialVersionUID = 1L;
	
	
	@NotNull
	private int projectActivityId;
	
	@NotNull
	private int projectActivityCompletion;//%of Completion
	
	@NotNull
	private String projectActivityStartDate;
	
	@NotNull
	private String projectActivityEndDate;
	
	@NotNull
	private int projectActivityOwnerId;//userId
	
	@NotNull
	private String projectActivityActualStartDate;
	
	@NotNull
	private String projectActivityActualEndnDate;
	
	@NotNull
	private int projectActivityPlannedEffort;
	
	@NotNull
	private int projectActivityActualEffort;
	
	@NotNull
	private String projectActivityScheduleDeviationComment;
	
	@NotNull
	private String projectActivityState;//Not Started, Ongoing, Completed
	
	@NotNull
	private String projectActivityHealth;//Green,Abmer,Red(Ongoing), Not started(Dark )
	
	@NotNull
	private String projectActivityHappinessIndex;//High/Moderate/Low
	
	@NotNull
	private int projectActivityCompletionRate;//(0% to 100%)
	
	@NotNull
	private String projectActivityScheduleCompliance;//Compliant/Non Compliant, Deviated etc
	
	@NotNull
	private String projectActivityEffortCompliance;//Compliant/Non Compliant, Deviated etc
	
	@NotNull
	private String projectActivityCostCompliance;//Compliant/Non Compliant, Deviated etc
	
	@NotNull
	private List<ProjectTask> projectActivityTasks = new ArrayList<ProjectTask>();//Compliant/Non Compliant, Deviated etc
	
	public ProjectActivity (){
		
	}

	/**
	 * @param projectActivityId
	 * @param projectActivityCompletion
	 * @param projectActivityStartDate
	 * @param projectActivityEndDate
	 * @param projectActivityOwnerId
	 * @param projectActivityActualStartDate
	 * @param projectActivityActualEndnDate
	 * @param projectActivityPlannedEffort
	 * @param projectActivityActualEffort
	 * @param projectActivityScheduleDeviationComment
	 * @param projectActivityState
	 * @param projectActivityHealth
	 * @param projectActivityHappinessIndex
	 * @param projectActivityCompletionRate
	 * @param projectActivityScheduleCompliance
	 * @param projectActivityEffortCompliance
	 * @param projectActivityCostCompliance
	 * @param projectActivityTasks
	 */
	public ProjectActivity(@NotNull int projectActivityId, @NotNull int projectActivityCompletion,
			@NotNull String projectActivityStartDate, @NotNull String projectActivityEndDate,
			@NotNull int projectActivityOwnerId, @NotNull String projectActivityActualStartDate,
			@NotNull String projectActivityActualEndnDate, @NotNull int projectActivityPlannedEffort,
			@NotNull int projectActivityActualEffort, @NotNull String projectActivityScheduleDeviationComment,
			@NotNull String projectActivityState, @NotNull String projectActivityHealth,
			@NotNull String projectActivityHappinessIndex, @NotNull int projectActivityCompletionRate,
			@NotNull String projectActivityScheduleCompliance, @NotNull String projectActivityEffortCompliance,
			@NotNull String projectActivityCostCompliance, @NotNull List<ProjectTask> projectActivityTasks) {
		super();
		this.projectActivityId = projectActivityId;
		this.projectActivityCompletion = projectActivityCompletion;
		this.projectActivityStartDate = projectActivityStartDate;
		this.projectActivityEndDate = projectActivityEndDate;
		this.projectActivityOwnerId = projectActivityOwnerId;
		this.projectActivityActualStartDate = projectActivityActualStartDate;
		this.projectActivityActualEndnDate = projectActivityActualEndnDate;
		this.projectActivityPlannedEffort = projectActivityPlannedEffort;
		this.projectActivityActualEffort = projectActivityActualEffort;
		this.projectActivityScheduleDeviationComment = projectActivityScheduleDeviationComment;
		this.projectActivityState = projectActivityState;
		this.projectActivityHealth = projectActivityHealth;
		this.projectActivityHappinessIndex = projectActivityHappinessIndex;
		this.projectActivityCompletionRate = projectActivityCompletionRate;
		this.projectActivityScheduleCompliance = projectActivityScheduleCompliance;
		this.projectActivityEffortCompliance = projectActivityEffortCompliance;
		this.projectActivityCostCompliance = projectActivityCostCompliance;
		this.projectActivityTasks = projectActivityTasks;
	}

	/**
	 * @return the projectActivityId
	 */
	public int getProjectActivityId() {
		return projectActivityId;
	}

	/**
	 * @param projectActivityId the projectActivityId to set
	 */
	public void setProjectActivityId(int projectActivityId) {
		this.projectActivityId = projectActivityId;
	}

	/**
	 * @return the projectActivityCompletion
	 */
	public int getProjectActivityCompletion() {
		return projectActivityCompletion;
	}

	/**
	 * @param projectActivityCompletion the projectActivityCompletion to set
	 */
	public void setProjectActivityCompletion(int projectActivityCompletion) {
		this.projectActivityCompletion = projectActivityCompletion;
	}

	/**
	 * @return the projectActivityStartDate
	 */
	public String getProjectActivityStartDate() {
		return projectActivityStartDate;
	}

	/**
	 * @param projectActivityStartDate the projectActivityStartDate to set
	 */
	public void setProjectActivityStartDate(String projectActivityStartDate) {
		this.projectActivityStartDate = projectActivityStartDate;
	}

	/**
	 * @return the projectActivityEndDate
	 */
	public String getProjectActivityEndDate() {
		return projectActivityEndDate;
	}

	/**
	 * @param projectActivityEndDate the projectActivityEndDate to set
	 */
	public void setProjectActivityEndDate(String projectActivityEndDate) {
		this.projectActivityEndDate = projectActivityEndDate;
	}

	/**
	 * @return the projectActivityOwnerId
	 */
	public int getProjectActivityOwnerId() {
		return projectActivityOwnerId;
	}

	/**
	 * @param projectActivityOwnerId the projectActivityOwnerId to set
	 */
	public void setProjectActivityOwnerId(int projectActivityOwnerId) {
		this.projectActivityOwnerId = projectActivityOwnerId;
	}

	/**
	 * @return the projectActivityActualStartDate
	 */
	public String getProjectActivityActualStartDate() {
		return projectActivityActualStartDate;
	}

	/**
	 * @param projectActivityActualStartDate the projectActivityActualStartDate to set
	 */
	public void setProjectActivityActualStartDate(String projectActivityActualStartDate) {
		this.projectActivityActualStartDate = projectActivityActualStartDate;
	}

	/**
	 * @return the projectActivityActualEndnDate
	 */
	public String getProjectActivityActualEndnDate() {
		return projectActivityActualEndnDate;
	}

	/**
	 * @param projectActivityActualEndnDate the projectActivityActualEndnDate to set
	 */
	public void setProjectActivityActualEndnDate(String projectActivityActualEndnDate) {
		this.projectActivityActualEndnDate = projectActivityActualEndnDate;
	}

	/**
	 * @return the projectActivityPlannedEffort
	 */
	public int getProjectActivityPlannedEffort() {
		return projectActivityPlannedEffort;
	}

	/**
	 * @param projectActivityPlannedEffort the projectActivityPlannedEffort to set
	 */
	public void setProjectActivityPlannedEffort(int projectActivityPlannedEffort) {
		this.projectActivityPlannedEffort = projectActivityPlannedEffort;
	}

	/**
	 * @return the projectActivityActualEffort
	 */
	public int getProjectActivityActualEffort() {
		return projectActivityActualEffort;
	}

	/**
	 * @param projectActivityActualEffort the projectActivityActualEffort to set
	 */
	public void setProjectActivityActualEffort(int projectActivityActualEffort) {
		this.projectActivityActualEffort = projectActivityActualEffort;
	}

	/**
	 * @return the projectActivityScheduleDeviationComment
	 */
	public String getProjectActivityScheduleDeviationComment() {
		return projectActivityScheduleDeviationComment;
	}

	/**
	 * @param projectActivityScheduleDeviationComment the projectActivityScheduleDeviationComment to set
	 */
	public void setProjectActivityScheduleDeviationComment(String projectActivityScheduleDeviationComment) {
		this.projectActivityScheduleDeviationComment = projectActivityScheduleDeviationComment;
	}

	/**
	 * @return the projectActivityState
	 */
	public String getProjectActivityState() {
		return projectActivityState;
	}

	/**
	 * @param projectActivityState the projectActivityState to set
	 */
	public void setProjectActivityState(String projectActivityState) {
		this.projectActivityState = projectActivityState;
	}

	/**
	 * @return the projectActivityHealth
	 */
	public String getProjectActivityHealth() {
		return projectActivityHealth;
	}

	/**
	 * @param projectActivityHealth the projectActivityHealth to set
	 */
	public void setProjectActivityHealth(String projectActivityHealth) {
		this.projectActivityHealth = projectActivityHealth;
	}

	/**
	 * @return the projectActivityHappinessIndex
	 */
	public String getProjectActivityHappinessIndex() {
		return projectActivityHappinessIndex;
	}

	/**
	 * @param projectActivityHappinessIndex the projectActivityHappinessIndex to set
	 */
	public void setProjectActivityHappinessIndex(String projectActivityHappinessIndex) {
		this.projectActivityHappinessIndex = projectActivityHappinessIndex;
	}

	/**
	 * @return the projectActivityCompletionRate
	 */
	public int getProjectActivityCompletionRate() {
		return projectActivityCompletionRate;
	}

	/**
	 * @param projectActivityCompletionRate the projectActivityCompletionRate to set
	 */
	public void setProjectActivityCompletionRate(int projectActivityCompletionRate) {
		this.projectActivityCompletionRate = projectActivityCompletionRate;
	}

	/**
	 * @return the projectActivityScheduleCompliance
	 */
	public String getProjectActivityScheduleCompliance() {
		return projectActivityScheduleCompliance;
	}

	/**
	 * @param projectActivityScheduleCompliance the projectActivityScheduleCompliance to set
	 */
	public void setProjectActivityScheduleCompliance(String projectActivityScheduleCompliance) {
		this.projectActivityScheduleCompliance = projectActivityScheduleCompliance;
	}

	/**
	 * @return the projectActivityEffortCompliance
	 */
	public String getProjectActivityEffortCompliance() {
		return projectActivityEffortCompliance;
	}

	/**
	 * @param projectActivityEffortCompliance the projectActivityEffortCompliance to set
	 */
	public void setProjectActivityEffortCompliance(String projectActivityEffortCompliance) {
		this.projectActivityEffortCompliance = projectActivityEffortCompliance;
	}

	/**
	 * @return the projectActivityCostCompliance
	 */
	public String getProjectActivityCostCompliance() {
		return projectActivityCostCompliance;
	}

	/**
	 * @param projectActivityCostCompliance the projectActivityCostCompliance to set
	 */
	public void setProjectActivityCostCompliance(String projectActivityCostCompliance) {
		this.projectActivityCostCompliance = projectActivityCostCompliance;
	}

	/**
	 * @return the projectActivityTasks
	 */
	public List<ProjectTask> getProjectActivityTasks() {
		return projectActivityTasks;
	}

	/**
	 * @param projectActivityTasks the projectActivityTasks to set
	 */
	public void setProjectActivityTasks(List<ProjectTask> projectActivityTasks) {
		this.projectActivityTasks = projectActivityTasks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + projectActivityActualEffort;
		result = prime * result
				+ ((projectActivityActualEndnDate == null) ? 0 : projectActivityActualEndnDate.hashCode());
		result = prime * result
				+ ((projectActivityActualStartDate == null) ? 0 : projectActivityActualStartDate.hashCode());
		result = prime * result + projectActivityCompletion;
		result = prime * result + projectActivityCompletionRate;
		result = prime * result
				+ ((projectActivityCostCompliance == null) ? 0 : projectActivityCostCompliance.hashCode());
		result = prime * result
				+ ((projectActivityEffortCompliance == null) ? 0 : projectActivityEffortCompliance.hashCode());
		result = prime * result + ((projectActivityEndDate == null) ? 0 : projectActivityEndDate.hashCode());
		result = prime * result
				+ ((projectActivityHappinessIndex == null) ? 0 : projectActivityHappinessIndex.hashCode());
		result = prime * result + ((projectActivityHealth == null) ? 0 : projectActivityHealth.hashCode());
		result = prime * result + projectActivityId;
		result = prime * result + projectActivityOwnerId;
		result = prime * result + projectActivityPlannedEffort;
		result = prime * result
				+ ((projectActivityScheduleCompliance == null) ? 0 : projectActivityScheduleCompliance.hashCode());
		result = prime * result + ((projectActivityScheduleDeviationComment == null) ? 0
				: projectActivityScheduleDeviationComment.hashCode());
		result = prime * result + ((projectActivityStartDate == null) ? 0 : projectActivityStartDate.hashCode());
		result = prime * result + ((projectActivityState == null) ? 0 : projectActivityState.hashCode());
		result = prime * result + ((projectActivityTasks == null) ? 0 : projectActivityTasks.hashCode());
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
		ProjectActivity other = (ProjectActivity) obj;
		if (projectActivityActualEffort != other.projectActivityActualEffort)
			return false;
		if (projectActivityActualEndnDate == null) {
			if (other.projectActivityActualEndnDate != null)
				return false;
		} else if (!projectActivityActualEndnDate.equals(other.projectActivityActualEndnDate))
			return false;
		if (projectActivityActualStartDate == null) {
			if (other.projectActivityActualStartDate != null)
				return false;
		} else if (!projectActivityActualStartDate.equals(other.projectActivityActualStartDate))
			return false;
		if (projectActivityCompletion != other.projectActivityCompletion)
			return false;
		if (projectActivityCompletionRate != other.projectActivityCompletionRate)
			return false;
		if (projectActivityCostCompliance == null) {
			if (other.projectActivityCostCompliance != null)
				return false;
		} else if (!projectActivityCostCompliance.equals(other.projectActivityCostCompliance))
			return false;
		if (projectActivityEffortCompliance == null) {
			if (other.projectActivityEffortCompliance != null)
				return false;
		} else if (!projectActivityEffortCompliance.equals(other.projectActivityEffortCompliance))
			return false;
		if (projectActivityEndDate == null) {
			if (other.projectActivityEndDate != null)
				return false;
		} else if (!projectActivityEndDate.equals(other.projectActivityEndDate))
			return false;
		if (projectActivityHappinessIndex == null) {
			if (other.projectActivityHappinessIndex != null)
				return false;
		} else if (!projectActivityHappinessIndex.equals(other.projectActivityHappinessIndex))
			return false;
		if (projectActivityHealth == null) {
			if (other.projectActivityHealth != null)
				return false;
		} else if (!projectActivityHealth.equals(other.projectActivityHealth))
			return false;
		if (projectActivityId != other.projectActivityId)
			return false;
		if (projectActivityOwnerId != other.projectActivityOwnerId)
			return false;
		if (projectActivityPlannedEffort != other.projectActivityPlannedEffort)
			return false;
		if (projectActivityScheduleCompliance == null) {
			if (other.projectActivityScheduleCompliance != null)
				return false;
		} else if (!projectActivityScheduleCompliance.equals(other.projectActivityScheduleCompliance))
			return false;
		if (projectActivityScheduleDeviationComment == null) {
			if (other.projectActivityScheduleDeviationComment != null)
				return false;
		} else if (!projectActivityScheduleDeviationComment.equals(other.projectActivityScheduleDeviationComment))
			return false;
		if (projectActivityStartDate == null) {
			if (other.projectActivityStartDate != null)
				return false;
		} else if (!projectActivityStartDate.equals(other.projectActivityStartDate))
			return false;
		if (projectActivityState == null) {
			if (other.projectActivityState != null)
				return false;
		} else if (!projectActivityState.equals(other.projectActivityState))
			return false;
		if (projectActivityTasks == null) {
			if (other.projectActivityTasks != null)
				return false;
		} else if (!projectActivityTasks.equals(other.projectActivityTasks))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProjectActivity [projectActivityId=" + projectActivityId + ", projectActivityCompletion="
				+ projectActivityCompletion + ", projectActivityStartDate=" + projectActivityStartDate
				+ ", projectActivityEndDate=" + projectActivityEndDate + ", projectActivityOwnerId="
				+ projectActivityOwnerId + ", projectActivityActualStartDate=" + projectActivityActualStartDate
				+ ", projectActivityActualEndnDate=" + projectActivityActualEndnDate + ", projectActivityPlannedEffort="
				+ projectActivityPlannedEffort + ", projectActivityActualEffort=" + projectActivityActualEffort
				+ ", projectActivityScheduleDeviationComment=" + projectActivityScheduleDeviationComment
				+ ", projectActivityState=" + projectActivityState + ", projectActivityHealth=" + projectActivityHealth
				+ ", projectActivityHappinessIndex=" + projectActivityHappinessIndex
				+ ", projectActivityCompletionRate=" + projectActivityCompletionRate
				+ ", projectActivityScheduleCompliance=" + projectActivityScheduleCompliance
				+ ", projectActivityEffortCompliance=" + projectActivityEffortCompliance
				+ ", projectActivityCostCompliance=" + projectActivityCostCompliance + ", projectActivityTasks="
				+ projectActivityTasks + "]";
	}
}