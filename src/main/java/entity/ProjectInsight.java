package entity;

import javax.validation.constraints.NotNull;

public class ProjectInsight {
	private static final long serialVersionUID = 1L;
	
	
	@NotNull
	private int projectInsightId;
	
	
	@NotNull
	private String projectExecutionMethodology;//WaterFall/Agile
	
	
	@NotNull
	private int projectOwnerId;//userId
	
	
	@NotNull
	private String projectExecutionType;//Joint/Client/IBM
	
	
	@NotNull
	private String projectScheduleStartDate;
	
	
	@NotNull
	private String projectScheduleEndDate;
	
	
	@NotNull
	private String projectScheduleDeviationComment;
	
	
	@NotNull
	private String projectActualStartDate;
	
	
	@NotNull
	private String projectActualEndnDate;
	
	
	@NotNull
	private int projectPlannedEffort;
	
	
	@NotNull
	private int projectActualEffort;
	
	
	
	@NotNull
	private String projectState;//Not Started, Ongoing, Completed
	
	
	@NotNull
	private String projectHealth;//Green,Abmer,Red(Ongoing), Not started(Dark )
	
	
	@NotNull
	private String projectHappinessIndex;//High/Moderate/Low
	
	
	@NotNull
	private int projectCompletionRate;//(0% to 100%)
	
	
	@NotNull
	private String projectScheduleCompliance;//Compliant/Non Compliant, Deviated etc
	
	
	@NotNull
	private String projectEffortCompliance;//Compliant/Non Compliant, Deviated etc
	
	
	@NotNull
	private String projectCostCompliance;//Compliant/Non Compliant, Deviated etc
	
	
	@NotNull
	private String  projectMilestonesCompliance;//Compliant/Non Compliant, Deviated etc
	
	public ProjectInsight() {
		
	}

	/**
	 * @param projectInsightId
	 * @param projectExecutionMethodology
	 * @param projectOwnerId
	 * @param projectExecutionType
	 * @param projectScheduleStartDate
	 * @param projectScheduleEndDate
	 * @param projectScheduleDeviationComment
	 * @param projectActualStartDate
	 * @param projectActualEndnDate
	 * @param projectPlannedEffort
	 * @param projectActualEffort
	 * @param projectState
	 * @param projectHealth
	 * @param projectHappinessIndex
	 * @param projectCompletionRate
	 * @param projectScheduleCompliance
	 * @param projectEffortCompliance
	 * @param projectCostCompliance
	 * @param projectMilestonesCompliance
	 */
	public ProjectInsight(@NotNull int projectInsightId, @NotNull String projectExecutionMethodology,
			@NotNull int projectOwnerId, @NotNull String projectExecutionType, @NotNull String projectScheduleStartDate,
			@NotNull String projectScheduleEndDate, @NotNull String projectScheduleDeviationComment,
			@NotNull String projectActualStartDate, @NotNull String projectActualEndnDate,
			@NotNull int projectPlannedEffort, @NotNull int projectActualEffort, @NotNull String projectState,
			@NotNull String projectHealth, @NotNull String projectHappinessIndex, @NotNull int projectCompletionRate,
			@NotNull String projectScheduleCompliance, @NotNull String projectEffortCompliance,
			@NotNull String projectCostCompliance, @NotNull String projectMilestonesCompliance) {
		super();
		this.projectInsightId = projectInsightId;
		this.projectExecutionMethodology = projectExecutionMethodology;
		this.projectOwnerId = projectOwnerId;
		this.projectExecutionType = projectExecutionType;
		this.projectScheduleStartDate = projectScheduleStartDate;
		this.projectScheduleEndDate = projectScheduleEndDate;
		this.projectScheduleDeviationComment = projectScheduleDeviationComment;
		this.projectActualStartDate = projectActualStartDate;
		this.projectActualEndnDate = projectActualEndnDate;
		this.projectPlannedEffort = projectPlannedEffort;
		this.projectActualEffort = projectActualEffort;
		this.projectState = projectState;
		this.projectHealth = projectHealth;
		this.projectHappinessIndex = projectHappinessIndex;
		this.projectCompletionRate = projectCompletionRate;
		this.projectScheduleCompliance = projectScheduleCompliance;
		this.projectEffortCompliance = projectEffortCompliance;
		this.projectCostCompliance = projectCostCompliance;
		this.projectMilestonesCompliance = projectMilestonesCompliance;
	}

	/**
	 * @return the projectInsightId
	 */
	public int getProjectInsightId() {
		return projectInsightId;
	}

	/**
	 * @param projectInsightId the projectInsightId to set
	 */
	public void setProjectInsightId(int projectInsightId) {
		this.projectInsightId = projectInsightId;
	}

	/**
	 * @return the projectExecutionMethodology
	 */
	public String getProjectExecutionMethodology() {
		return projectExecutionMethodology;
	}

	/**
	 * @param projectExecutionMethodology the projectExecutionMethodology to set
	 */
	public void setProjectExecutionMethodology(String projectExecutionMethodology) {
		this.projectExecutionMethodology = projectExecutionMethodology;
	}

	/**
	 * @return the projectOwnerId
	 */
	public int getProjectOwnerId() {
		return projectOwnerId;
	}

	/**
	 * @param projectOwnerId the projectOwnerId to set
	 */
	public void setProjectOwnerId(int projectOwnerId) {
		this.projectOwnerId = projectOwnerId;
	}

	/**
	 * @return the projectExecutionType
	 */
	public String getProjectExecutionType() {
		return projectExecutionType;
	}

	/**
	 * @param projectExecutionType the projectExecutionType to set
	 */
	public void setProjectExecutionType(String projectExecutionType) {
		this.projectExecutionType = projectExecutionType;
	}

	/**
	 * @return the projectScheduleStartDate
	 */
	public String getProjectScheduleStartDate() {
		return projectScheduleStartDate;
	}

	/**
	 * @param projectScheduleStartDate the projectScheduleStartDate to set
	 */
	public void setProjectScheduleStartDate(String projectScheduleStartDate) {
		this.projectScheduleStartDate = projectScheduleStartDate;
	}

	/**
	 * @return the projectScheduleEndDate
	 */
	public String getProjectScheduleEndDate() {
		return projectScheduleEndDate;
	}

	/**
	 * @param projectScheduleEndDate the projectScheduleEndDate to set
	 */
	public void setProjectScheduleEndDate(String projectScheduleEndDate) {
		this.projectScheduleEndDate = projectScheduleEndDate;
	}

	/**
	 * @return the projectScheduleDeviationComment
	 */
	public String getProjectScheduleDeviationComment() {
		return projectScheduleDeviationComment;
	}

	/**
	 * @param projectScheduleDeviationComment the projectScheduleDeviationComment to set
	 */
	public void setProjectScheduleDeviationComment(String projectScheduleDeviationComment) {
		this.projectScheduleDeviationComment = projectScheduleDeviationComment;
	}

	/**
	 * @return the projectActualStartDate
	 */
	public String getProjectActualStartDate() {
		return projectActualStartDate;
	}

	/**
	 * @param projectActualStartDate the projectActualStartDate to set
	 */
	public void setProjectActualStartDate(String projectActualStartDate) {
		this.projectActualStartDate = projectActualStartDate;
	}

	/**
	 * @return the projectActualEndnDate
	 */
	public String getProjectActualEndnDate() {
		return projectActualEndnDate;
	}

	/**
	 * @param projectActualEndnDate the projectActualEndnDate to set
	 */
	public void setProjectActualEndnDate(String projectActualEndnDate) {
		this.projectActualEndnDate = projectActualEndnDate;
	}

	/**
	 * @return the projectPlannedEffort
	 */
	public int getProjectPlannedEffort() {
		return projectPlannedEffort;
	}

	/**
	 * @param projectPlannedEffort the projectPlannedEffort to set
	 */
	public void setProjectPlannedEffort(int projectPlannedEffort) {
		this.projectPlannedEffort = projectPlannedEffort;
	}

	/**
	 * @return the projectActualEffort
	 */
	public int getProjectActualEffort() {
		return projectActualEffort;
	}

	/**
	 * @param projectActualEffort the projectActualEffort to set
	 */
	public void setProjectActualEffort(int projectActualEffort) {
		this.projectActualEffort = projectActualEffort;
	}

	/**
	 * @return the projectState
	 */
	public String getProjectState() {
		return projectState;
	}

	/**
	 * @param projectState the projectState to set
	 */
	public void setProjectState(String projectState) {
		this.projectState = projectState;
	}

	/**
	 * @return the projectHealth
	 */
	public String getProjectHealth() {
		return projectHealth;
	}

	/**
	 * @param projectHealth the projectHealth to set
	 */
	public void setProjectHealth(String projectHealth) {
		this.projectHealth = projectHealth;
	}

	/**
	 * @return the projectHappinessIndex
	 */
	public String getProjectHappinessIndex() {
		return projectHappinessIndex;
	}

	/**
	 * @param projectHappinessIndex the projectHappinessIndex to set
	 */
	public void setProjectHappinessIndex(String projectHappinessIndex) {
		this.projectHappinessIndex = projectHappinessIndex;
	}

	/**
	 * @return the projectCompletionRate
	 */
	public int getProjectCompletionRate() {
		return projectCompletionRate;
	}

	/**
	 * @param projectCompletionRate the projectCompletionRate to set
	 */
	public void setProjectCompletionRate(int projectCompletionRate) {
		this.projectCompletionRate = projectCompletionRate;
	}

	/**
	 * @return the projectScheduleCompliance
	 */
	public String getProjectScheduleCompliance() {
		return projectScheduleCompliance;
	}

	/**
	 * @param projectScheduleCompliance the projectScheduleCompliance to set
	 */
	public void setProjectScheduleCompliance(String projectScheduleCompliance) {
		this.projectScheduleCompliance = projectScheduleCompliance;
	}

	/**
	 * @return the projectEffortCompliance
	 */
	public String getProjectEffortCompliance() {
		return projectEffortCompliance;
	}

	/**
	 * @param projectEffortCompliance the projectEffortCompliance to set
	 */
	public void setProjectEffortCompliance(String projectEffortCompliance) {
		this.projectEffortCompliance = projectEffortCompliance;
	}

	/**
	 * @return the projectCostCompliance
	 */
	public String getProjectCostCompliance() {
		return projectCostCompliance;
	}

	/**
	 * @param projectCostCompliance the projectCostCompliance to set
	 */
	public void setProjectCostCompliance(String projectCostCompliance) {
		this.projectCostCompliance = projectCostCompliance;
	}

	/**
	 * @return the projectMilestonesCompliance
	 */
	public String getProjectMilestonesCompliance() {
		return projectMilestonesCompliance;
	}

	/**
	 * @param projectMilestonesCompliance the projectMilestonesCompliance to set
	 */
	public void setProjectMilestonesCompliance(String projectMilestonesCompliance) {
		this.projectMilestonesCompliance = projectMilestonesCompliance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + projectActualEffort;
		result = prime * result + ((projectActualEndnDate == null) ? 0 : projectActualEndnDate.hashCode());
		result = prime * result + ((projectActualStartDate == null) ? 0 : projectActualStartDate.hashCode());
		result = prime * result + projectCompletionRate;
		result = prime * result + ((projectCostCompliance == null) ? 0 : projectCostCompliance.hashCode());
		result = prime * result + ((projectEffortCompliance == null) ? 0 : projectEffortCompliance.hashCode());
		result = prime * result + ((projectExecutionMethodology == null) ? 0 : projectExecutionMethodology.hashCode());
		result = prime * result + ((projectExecutionType == null) ? 0 : projectExecutionType.hashCode());
		result = prime * result + ((projectHappinessIndex == null) ? 0 : projectHappinessIndex.hashCode());
		result = prime * result + ((projectHealth == null) ? 0 : projectHealth.hashCode());
		result = prime * result + projectInsightId;
		result = prime * result + ((projectMilestonesCompliance == null) ? 0 : projectMilestonesCompliance.hashCode());
		result = prime * result + projectOwnerId;
		result = prime * result + projectPlannedEffort;
		result = prime * result + ((projectScheduleCompliance == null) ? 0 : projectScheduleCompliance.hashCode());
		result = prime * result
				+ ((projectScheduleDeviationComment == null) ? 0 : projectScheduleDeviationComment.hashCode());
		result = prime * result + ((projectScheduleEndDate == null) ? 0 : projectScheduleEndDate.hashCode());
		result = prime * result + ((projectScheduleStartDate == null) ? 0 : projectScheduleStartDate.hashCode());
		result = prime * result + ((projectState == null) ? 0 : projectState.hashCode());
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
		ProjectInsight other = (ProjectInsight) obj;
		if (projectActualEffort != other.projectActualEffort)
			return false;
		if (projectActualEndnDate == null) {
			if (other.projectActualEndnDate != null)
				return false;
		} else if (!projectActualEndnDate.equals(other.projectActualEndnDate))
			return false;
		if (projectActualStartDate == null) {
			if (other.projectActualStartDate != null)
				return false;
		} else if (!projectActualStartDate.equals(other.projectActualStartDate))
			return false;
		if (projectCompletionRate != other.projectCompletionRate)
			return false;
		if (projectCostCompliance == null) {
			if (other.projectCostCompliance != null)
				return false;
		} else if (!projectCostCompliance.equals(other.projectCostCompliance))
			return false;
		if (projectEffortCompliance == null) {
			if (other.projectEffortCompliance != null)
				return false;
		} else if (!projectEffortCompliance.equals(other.projectEffortCompliance))
			return false;
		if (projectExecutionMethodology == null) {
			if (other.projectExecutionMethodology != null)
				return false;
		} else if (!projectExecutionMethodology.equals(other.projectExecutionMethodology))
			return false;
		if (projectExecutionType == null) {
			if (other.projectExecutionType != null)
				return false;
		} else if (!projectExecutionType.equals(other.projectExecutionType))
			return false;
		if (projectHappinessIndex == null) {
			if (other.projectHappinessIndex != null)
				return false;
		} else if (!projectHappinessIndex.equals(other.projectHappinessIndex))
			return false;
		if (projectHealth == null) {
			if (other.projectHealth != null)
				return false;
		} else if (!projectHealth.equals(other.projectHealth))
			return false;
		if (projectInsightId != other.projectInsightId)
			return false;
		if (projectMilestonesCompliance == null) {
			if (other.projectMilestonesCompliance != null)
				return false;
		} else if (!projectMilestonesCompliance.equals(other.projectMilestonesCompliance))
			return false;
		if (projectOwnerId != other.projectOwnerId)
			return false;
		if (projectPlannedEffort != other.projectPlannedEffort)
			return false;
		if (projectScheduleCompliance == null) {
			if (other.projectScheduleCompliance != null)
				return false;
		} else if (!projectScheduleCompliance.equals(other.projectScheduleCompliance))
			return false;
		if (projectScheduleDeviationComment == null) {
			if (other.projectScheduleDeviationComment != null)
				return false;
		} else if (!projectScheduleDeviationComment.equals(other.projectScheduleDeviationComment))
			return false;
		if (projectScheduleEndDate == null) {
			if (other.projectScheduleEndDate != null)
				return false;
		} else if (!projectScheduleEndDate.equals(other.projectScheduleEndDate))
			return false;
		if (projectScheduleStartDate == null) {
			if (other.projectScheduleStartDate != null)
				return false;
		} else if (!projectScheduleStartDate.equals(other.projectScheduleStartDate))
			return false;
		if (projectState == null) {
			if (other.projectState != null)
				return false;
		} else if (!projectState.equals(other.projectState))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProjectInsight [projectInsightId=" + projectInsightId + ", projectExecutionMethodology="
				+ projectExecutionMethodology + ", projectOwnerId=" + projectOwnerId + ", projectExecutionType="
				+ projectExecutionType + ", projectScheduleStartDate=" + projectScheduleStartDate
				+ ", projectScheduleEndDate=" + projectScheduleEndDate + ", projectScheduleDeviationComment="
				+ projectScheduleDeviationComment + ", projectActualStartDate=" + projectActualStartDate
				+ ", projectActualEndnDate=" + projectActualEndnDate + ", projectPlannedEffort=" + projectPlannedEffort
				+ ", projectActualEffort=" + projectActualEffort + ", projectState=" + projectState + ", projectHealth="
				+ projectHealth + ", projectHappinessIndex=" + projectHappinessIndex + ", projectCompletionRate="
				+ projectCompletionRate + ", projectScheduleCompliance=" + projectScheduleCompliance
				+ ", projectEffortCompliance=" + projectEffortCompliance + ", projectCostCompliance="
				+ projectCostCompliance + ", projectMilestonesCompliance=" + projectMilestonesCompliance + "]";
	}
}
