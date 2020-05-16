package TBDpojo;

import java.ArrayList;
import java.List;

import javax.validation.constraints.NotNull;



public class ProjectMilestone {
	private static final long serialVersionUID = 1L;
	
	
	@NotNull
	private int projectMilestoneId;
	
	
	@NotNull
	private int projectMilestoneCompletion;//%of Completion
	
	
	@NotNull
	private String projectMilestoneStartDate;
	
	
	@NotNull
	private String projectMilestoneEndDate;
	
	
	@NotNull
	private int projectMileStoneOwnerId;//userId
	
	
	@NotNull
	private String projectMilestoneActualStartDate;
	
	
	@NotNull
	private String projectMilestoneActualEndnDate;
	
	
	@NotNull
	private int projectMilestonePlannedEffort;
	
	
	@NotNull
	private int projectMilestoneActualEffort;
	
	
	@NotNull
	private String projectMilestoneScheduleDeviationComment;
	
	
	
	@NotNull
	private String projectMilestoneState;//Not Started, Ongoing, Completed
	
	
	@NotNull
	private String projectMilestoneHealth;//Green,Abmer,Red(Ongoing), Not started(Dark )
	
	
	@NotNull
	private String projectMilestoneHappinessIndex;//High/Moderate/Low
	
	
	@NotNull
	private int projectMilestoneCompletionRate;//(0% to 100%)
	
	
	@NotNull
	private String projectMilestoneScheduleCompliance;//Compliant/Non Compliant, Deviated etc
	
	
	@NotNull
	private String projectMilestoneEffortCompliance;//Compliant/Non Compliant, Deviated etc
	
	
	@NotNull
	private String projectMilestoneCostCompliance;//Compliant/Non Compliant, Deviated etc
	
	
	@NotNull
	private List<ProjectSector> projectMilestoneSectors = new ArrayList<ProjectSector>();//Compliant/Non Compliant, Deviated etc
	
	public ProjectMilestone() {
		
	}

	/**
	 * @param projectMilestoneId
	 * @param projectMilestoneCompletion
	 * @param projectMilestoneStartDate
	 * @param projectMilestoneEndDate
	 * @param projectMileStoneOwnerId
	 * @param projectMilestoneActualStartDate
	 * @param projectMilestoneActualEndnDate
	 * @param projectMilestonePlannedEffort
	 * @param projectMilestoneActualEffort
	 * @param projectMilestoneScheduleDeviationComment
	 * @param projectMilestoneState
	 * @param projectMilestoneHealth
	 * @param projectMilestoneHappinessIndex
	 * @param projectMilestoneCompletionRate
	 * @param projectMilestoneScheduleCompliance
	 * @param projectMilestoneEffortCompliance
	 * @param projectMilestoneCostCompliance
	 * @param projectMilestoneSectors
	 */
	public ProjectMilestone(@NotNull int projectMilestoneId, @NotNull int projectMilestoneCompletion,
			@NotNull String projectMilestoneStartDate, @NotNull String projectMilestoneEndDate,
			@NotNull int projectMileStoneOwnerId, @NotNull String projectMilestoneActualStartDate,
			@NotNull String projectMilestoneActualEndnDate, @NotNull int projectMilestonePlannedEffort,
			@NotNull int projectMilestoneActualEffort, @NotNull String projectMilestoneScheduleDeviationComment,
			@NotNull String projectMilestoneState, @NotNull String projectMilestoneHealth,
			@NotNull String projectMilestoneHappinessIndex, @NotNull int projectMilestoneCompletionRate,
			@NotNull String projectMilestoneScheduleCompliance, @NotNull String projectMilestoneEffortCompliance,
			@NotNull String projectMilestoneCostCompliance, @NotNull List<ProjectSector> projectMilestoneSectors) {
		super();
		this.projectMilestoneId = projectMilestoneId;
		this.projectMilestoneCompletion = projectMilestoneCompletion;
		this.projectMilestoneStartDate = projectMilestoneStartDate;
		this.projectMilestoneEndDate = projectMilestoneEndDate;
		this.projectMileStoneOwnerId = projectMileStoneOwnerId;
		this.projectMilestoneActualStartDate = projectMilestoneActualStartDate;
		this.projectMilestoneActualEndnDate = projectMilestoneActualEndnDate;
		this.projectMilestonePlannedEffort = projectMilestonePlannedEffort;
		this.projectMilestoneActualEffort = projectMilestoneActualEffort;
		this.projectMilestoneScheduleDeviationComment = projectMilestoneScheduleDeviationComment;
		this.projectMilestoneState = projectMilestoneState;
		this.projectMilestoneHealth = projectMilestoneHealth;
		this.projectMilestoneHappinessIndex = projectMilestoneHappinessIndex;
		this.projectMilestoneCompletionRate = projectMilestoneCompletionRate;
		this.projectMilestoneScheduleCompliance = projectMilestoneScheduleCompliance;
		this.projectMilestoneEffortCompliance = projectMilestoneEffortCompliance;
		this.projectMilestoneCostCompliance = projectMilestoneCostCompliance;
		this.projectMilestoneSectors = projectMilestoneSectors;
	}

	/**
	 * @return the projectMilestoneId
	 */
	public int getProjectMilestoneId() {
		return projectMilestoneId;
	}

	/**
	 * @param projectMilestoneId the projectMilestoneId to set
	 */
	public void setProjectMilestoneId(int projectMilestoneId) {
		this.projectMilestoneId = projectMilestoneId;
	}

	/**
	 * @return the projectMilestoneCompletion
	 */
	public int getProjectMilestoneCompletion() {
		return projectMilestoneCompletion;
	}

	/**
	 * @param projectMilestoneCompletion the projectMilestoneCompletion to set
	 */
	public void setProjectMilestoneCompletion(int projectMilestoneCompletion) {
		this.projectMilestoneCompletion = projectMilestoneCompletion;
	}

	/**
	 * @return the projectMilestoneStartDate
	 */
	public String getProjectMilestoneStartDate() {
		return projectMilestoneStartDate;
	}

	/**
	 * @param projectMilestoneStartDate the projectMilestoneStartDate to set
	 */
	public void setProjectMilestoneStartDate(String projectMilestoneStartDate) {
		this.projectMilestoneStartDate = projectMilestoneStartDate;
	}

	/**
	 * @return the projectMilestoneEndDate
	 */
	public String getProjectMilestoneEndDate() {
		return projectMilestoneEndDate;
	}

	/**
	 * @param projectMilestoneEndDate the projectMilestoneEndDate to set
	 */
	public void setProjectMilestoneEndDate(String projectMilestoneEndDate) {
		this.projectMilestoneEndDate = projectMilestoneEndDate;
	}

	/**
	 * @return the projectMileStoneOwnerId
	 */
	public int getProjectMileStoneOwnerId() {
		return projectMileStoneOwnerId;
	}

	/**
	 * @param projectMileStoneOwnerId the projectMileStoneOwnerId to set
	 */
	public void setProjectMileStoneOwnerId(int projectMileStoneOwnerId) {
		this.projectMileStoneOwnerId = projectMileStoneOwnerId;
	}

	/**
	 * @return the projectMilestoneActualStartDate
	 */
	public String getProjectMilestoneActualStartDate() {
		return projectMilestoneActualStartDate;
	}

	/**
	 * @param projectMilestoneActualStartDate the projectMilestoneActualStartDate to set
	 */
	public void setProjectMilestoneActualStartDate(String projectMilestoneActualStartDate) {
		this.projectMilestoneActualStartDate = projectMilestoneActualStartDate;
	}

	/**
	 * @return the projectMilestoneActualEndnDate
	 */
	public String getProjectMilestoneActualEndnDate() {
		return projectMilestoneActualEndnDate;
	}

	/**
	 * @param projectMilestoneActualEndnDate the projectMilestoneActualEndnDate to set
	 */
	public void setProjectMilestoneActualEndnDate(String projectMilestoneActualEndnDate) {
		this.projectMilestoneActualEndnDate = projectMilestoneActualEndnDate;
	}

	/**
	 * @return the projectMilestonePlannedEffort
	 */
	public int getProjectMilestonePlannedEffort() {
		return projectMilestonePlannedEffort;
	}

	/**
	 * @param projectMilestonePlannedEffort the projectMilestonePlannedEffort to set
	 */
	public void setProjectMilestonePlannedEffort(int projectMilestonePlannedEffort) {
		this.projectMilestonePlannedEffort = projectMilestonePlannedEffort;
	}

	/**
	 * @return the projectMilestoneActualEffort
	 */
	public int getProjectMilestoneActualEffort() {
		return projectMilestoneActualEffort;
	}

	/**
	 * @param projectMilestoneActualEffort the projectMilestoneActualEffort to set
	 */
	public void setProjectMilestoneActualEffort(int projectMilestoneActualEffort) {
		this.projectMilestoneActualEffort = projectMilestoneActualEffort;
	}

	/**
	 * @return the projectMilestoneScheduleDeviationComment
	 */
	public String getProjectMilestoneScheduleDeviationComment() {
		return projectMilestoneScheduleDeviationComment;
	}

	/**
	 * @param projectMilestoneScheduleDeviationComment the projectMilestoneScheduleDeviationComment to set
	 */
	public void setProjectMilestoneScheduleDeviationComment(String projectMilestoneScheduleDeviationComment) {
		this.projectMilestoneScheduleDeviationComment = projectMilestoneScheduleDeviationComment;
	}

	/**
	 * @return the projectMilestoneState
	 */
	public String getProjectMilestoneState() {
		return projectMilestoneState;
	}

	/**
	 * @param projectMilestoneState the projectMilestoneState to set
	 */
	public void setProjectMilestoneState(String projectMilestoneState) {
		this.projectMilestoneState = projectMilestoneState;
	}

	/**
	 * @return the projectMilestoneHealth
	 */
	public String getProjectMilestoneHealth() {
		return projectMilestoneHealth;
	}

	/**
	 * @param projectMilestoneHealth the projectMilestoneHealth to set
	 */
	public void setProjectMilestoneHealth(String projectMilestoneHealth) {
		this.projectMilestoneHealth = projectMilestoneHealth;
	}

	/**
	 * @return the projectMilestoneHappinessIndex
	 */
	public String getProjectMilestoneHappinessIndex() {
		return projectMilestoneHappinessIndex;
	}

	/**
	 * @param projectMilestoneHappinessIndex the projectMilestoneHappinessIndex to set
	 */
	public void setProjectMilestoneHappinessIndex(String projectMilestoneHappinessIndex) {
		this.projectMilestoneHappinessIndex = projectMilestoneHappinessIndex;
	}

	/**
	 * @return the projectMilestoneCompletionRate
	 */
	public int getProjectMilestoneCompletionRate() {
		return projectMilestoneCompletionRate;
	}

	/**
	 * @param projectMilestoneCompletionRate the projectMilestoneCompletionRate to set
	 */
	public void setProjectMilestoneCompletionRate(int projectMilestoneCompletionRate) {
		this.projectMilestoneCompletionRate = projectMilestoneCompletionRate;
	}

	/**
	 * @return the projectMilestoneScheduleCompliance
	 */
	public String getProjectMilestoneScheduleCompliance() {
		return projectMilestoneScheduleCompliance;
	}

	/**
	 * @param projectMilestoneScheduleCompliance the projectMilestoneScheduleCompliance to set
	 */
	public void setProjectMilestoneScheduleCompliance(String projectMilestoneScheduleCompliance) {
		this.projectMilestoneScheduleCompliance = projectMilestoneScheduleCompliance;
	}

	/**
	 * @return the projectMilestoneEffortCompliance
	 */
	public String getProjectMilestoneEffortCompliance() {
		return projectMilestoneEffortCompliance;
	}

	/**
	 * @param projectMilestoneEffortCompliance the projectMilestoneEffortCompliance to set
	 */
	public void setProjectMilestoneEffortCompliance(String projectMilestoneEffortCompliance) {
		this.projectMilestoneEffortCompliance = projectMilestoneEffortCompliance;
	}

	/**
	 * @return the projectMilestoneCostCompliance
	 */
	public String getProjectMilestoneCostCompliance() {
		return projectMilestoneCostCompliance;
	}

	/**
	 * @param projectMilestoneCostCompliance the projectMilestoneCostCompliance to set
	 */
	public void setProjectMilestoneCostCompliance(String projectMilestoneCostCompliance) {
		this.projectMilestoneCostCompliance = projectMilestoneCostCompliance;
	}

	/**
	 * @return the projectMilestoneSectors
	 */
	public List<ProjectSector> getProjectMilestoneSectors() {
		return projectMilestoneSectors;
	}

	/**
	 * @param projectMilestoneSectors the projectMilestoneSectors to set
	 */
	public void setProjectMilestoneSectors(List<ProjectSector> projectMilestoneSectors) {
		this.projectMilestoneSectors = projectMilestoneSectors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + projectMileStoneOwnerId;
		result = prime * result + ((projectMilestoneSectors == null) ? 0 : projectMilestoneSectors.hashCode());
		result = prime * result + projectMilestoneActualEffort;
		result = prime * result
				+ ((projectMilestoneActualEndnDate == null) ? 0 : projectMilestoneActualEndnDate.hashCode());
		result = prime * result
				+ ((projectMilestoneActualStartDate == null) ? 0 : projectMilestoneActualStartDate.hashCode());
		result = prime * result + projectMilestoneCompletion;
		result = prime * result + projectMilestoneCompletionRate;
		result = prime * result
				+ ((projectMilestoneCostCompliance == null) ? 0 : projectMilestoneCostCompliance.hashCode());
		result = prime * result
				+ ((projectMilestoneEffortCompliance == null) ? 0 : projectMilestoneEffortCompliance.hashCode());
		result = prime * result + ((projectMilestoneEndDate == null) ? 0 : projectMilestoneEndDate.hashCode());
		result = prime * result
				+ ((projectMilestoneHappinessIndex == null) ? 0 : projectMilestoneHappinessIndex.hashCode());
		result = prime * result + ((projectMilestoneHealth == null) ? 0 : projectMilestoneHealth.hashCode());
		result = prime * result + projectMilestoneId;
		result = prime * result + projectMilestonePlannedEffort;
		result = prime * result
				+ ((projectMilestoneScheduleCompliance == null) ? 0 : projectMilestoneScheduleCompliance.hashCode());
		result = prime * result + ((projectMilestoneScheduleDeviationComment == null) ? 0
				: projectMilestoneScheduleDeviationComment.hashCode());
		result = prime * result + ((projectMilestoneStartDate == null) ? 0 : projectMilestoneStartDate.hashCode());
		result = prime * result + ((projectMilestoneState == null) ? 0 : projectMilestoneState.hashCode());
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
		ProjectMilestone other = (ProjectMilestone) obj;
		if (projectMileStoneOwnerId != other.projectMileStoneOwnerId)
			return false;
		if (projectMilestoneSectors == null) {
			if (other.projectMilestoneSectors != null)
				return false;
		} else if (!projectMilestoneSectors.equals(other.projectMilestoneSectors))
			return false;
		if (projectMilestoneActualEffort != other.projectMilestoneActualEffort)
			return false;
		if (projectMilestoneActualEndnDate == null) {
			if (other.projectMilestoneActualEndnDate != null)
				return false;
		} else if (!projectMilestoneActualEndnDate.equals(other.projectMilestoneActualEndnDate))
			return false;
		if (projectMilestoneActualStartDate == null) {
			if (other.projectMilestoneActualStartDate != null)
				return false;
		} else if (!projectMilestoneActualStartDate.equals(other.projectMilestoneActualStartDate))
			return false;
		if (projectMilestoneCompletion != other.projectMilestoneCompletion)
			return false;
		if (projectMilestoneCompletionRate != other.projectMilestoneCompletionRate)
			return false;
		if (projectMilestoneCostCompliance == null) {
			if (other.projectMilestoneCostCompliance != null)
				return false;
		} else if (!projectMilestoneCostCompliance.equals(other.projectMilestoneCostCompliance))
			return false;
		if (projectMilestoneEffortCompliance == null) {
			if (other.projectMilestoneEffortCompliance != null)
				return false;
		} else if (!projectMilestoneEffortCompliance.equals(other.projectMilestoneEffortCompliance))
			return false;
		if (projectMilestoneEndDate == null) {
			if (other.projectMilestoneEndDate != null)
				return false;
		} else if (!projectMilestoneEndDate.equals(other.projectMilestoneEndDate))
			return false;
		if (projectMilestoneHappinessIndex == null) {
			if (other.projectMilestoneHappinessIndex != null)
				return false;
		} else if (!projectMilestoneHappinessIndex.equals(other.projectMilestoneHappinessIndex))
			return false;
		if (projectMilestoneHealth == null) {
			if (other.projectMilestoneHealth != null)
				return false;
		} else if (!projectMilestoneHealth.equals(other.projectMilestoneHealth))
			return false;
		if (projectMilestoneId != other.projectMilestoneId)
			return false;
		if (projectMilestonePlannedEffort != other.projectMilestonePlannedEffort)
			return false;
		if (projectMilestoneScheduleCompliance == null) {
			if (other.projectMilestoneScheduleCompliance != null)
				return false;
		} else if (!projectMilestoneScheduleCompliance.equals(other.projectMilestoneScheduleCompliance))
			return false;
		if (projectMilestoneScheduleDeviationComment == null) {
			if (other.projectMilestoneScheduleDeviationComment != null)
				return false;
		} else if (!projectMilestoneScheduleDeviationComment.equals(other.projectMilestoneScheduleDeviationComment))
			return false;
		if (projectMilestoneStartDate == null) {
			if (other.projectMilestoneStartDate != null)
				return false;
		} else if (!projectMilestoneStartDate.equals(other.projectMilestoneStartDate))
			return false;
		if (projectMilestoneState == null) {
			if (other.projectMilestoneState != null)
				return false;
		} else if (!projectMilestoneState.equals(other.projectMilestoneState))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProjectMilestone [projectMilestoneId=" + projectMilestoneId + ", projectMilestoneCompletion="
				+ projectMilestoneCompletion + ", projectMilestoneStartDate=" + projectMilestoneStartDate
				+ ", projectMilestoneEndDate=" + projectMilestoneEndDate + ", projectMileStoneOwnerId="
				+ projectMileStoneOwnerId + ", projectMilestoneActualStartDate=" + projectMilestoneActualStartDate
				+ ", projectMilestoneActualEndnDate=" + projectMilestoneActualEndnDate
				+ ", projectMilestonePlannedEffort=" + projectMilestonePlannedEffort + ", projectMilestoneActualEffort="
				+ projectMilestoneActualEffort + ", projectMilestoneScheduleDeviationComment="
				+ projectMilestoneScheduleDeviationComment + ", projectMilestoneState=" + projectMilestoneState
				+ ", projectMilestoneHealth=" + projectMilestoneHealth + ", projectMilestoneHappinessIndex="
				+ projectMilestoneHappinessIndex + ", projectMilestoneCompletionRate=" + projectMilestoneCompletionRate
				+ ", projectMilestoneScheduleCompliance=" + projectMilestoneScheduleCompliance
				+ ", projectMilestoneEffortCompliance=" + projectMilestoneEffortCompliance
				+ ", projectMilestoneCostCompliance=" + projectMilestoneCostCompliance + ", projectMilestoneSectors="
				+ projectMilestoneSectors + "]";
	}
}
