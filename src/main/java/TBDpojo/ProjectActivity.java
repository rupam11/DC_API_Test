package TBDpojo;

import java.ArrayList;
import java.List;

import javax.validation.constraints.NotNull;



public class ProjectSector {
private static final long serialVersionUID = 1L;
	
	
	@NotNull
	private int projectSectorId;
	
	
	@NotNull
	private int projectSectorCompletion;//%of Completion
	
	
	@NotNull
	private String projectSectorStartDate;
	
	
	@NotNull
	private String projectSectorEndDate;
	
	
	@NotNull
	private int projectSectorOwnerId;//userId
	
	
	@NotNull
	private String projectSectorActualStartDate;
	
	
	@NotNull
	private String projectSectorActualEndnDate;
	
	
	@NotNull
	private int projectSectorPlannedEffort;
	
	
	@NotNull
	private int projectSectorActualEffort;
	
	
	@NotNull
	private String projectSectorScheduleDeviationComment;
	
	
	
	@NotNull
	private String projectSectorState;//Not Started, Ongoing, Completed
	
	
	@NotNull
	private String projectSectorHealth;//Green,Abmer,Red(Ongoing), Not started(Dark )
	
	
	@NotNull
	private String projectSectorHappinessIndex;//High/Moderate/Low
	
	
	@NotNull
	private int projectSectorCompletionRate;//(0% to 100%)
	
	
	@NotNull
	private String projectSectorScheduleCompliance;//Compliant/Non Compliant, Deviated etc
	
	
	@NotNull
	private String projectSectorEffortCompliance;//Compliant/Non Compliant, Deviated etc
	
	
	@NotNull
	private String projectSectorCostCompliance;//Compliant/Non Compliant, Deviated etc
	
	
	@NotNull
	private List<ProjectTask> projectSectorTasks = new ArrayList<ProjectTask>();//Compliant/Non Compliant, Deviated etc
	
	public ProjectSector (){
		
	}

	/**
	 * @param projectSectorId
	 * @param projectSectorCompletion
	 * @param projectSectorStartDate
	 * @param projectSectorEndDate
	 * @param projectSectorOwnerId
	 * @param projectSectorActualStartDate
	 * @param projectSectorActualEndnDate
	 * @param projectSectorPlannedEffort
	 * @param projectSectorActualEffort
	 * @param projectSectorScheduleDeviationComment
	 * @param projectSectorState
	 * @param projectSectorHealth
	 * @param projectSectorHappinessIndex
	 * @param projectSectorCompletionRate
	 * @param projectSectorScheduleCompliance
	 * @param projectSectorEffortCompliance
	 * @param projectSectorCostCompliance
	 * @param projectSectorTasks
	 */
	public ProjectSector(@NotNull int projectSectorId, @NotNull int projectSectorCompletion,
			@NotNull String projectSectorStartDate, @NotNull String projectSectorEndDate,
			@NotNull int projectSectorOwnerId, @NotNull String projectSectorActualStartDate,
			@NotNull String projectSectorActualEndnDate, @NotNull int projectSectorPlannedEffort,
			@NotNull int projectSectorActualEffort, @NotNull String projectSectorScheduleDeviationComment,
			@NotNull String projectSectorState, @NotNull String projectSectorHealth,
			@NotNull String projectSectorHappinessIndex, @NotNull int projectSectorCompletionRate,
			@NotNull String projectSectorScheduleCompliance, @NotNull String projectSectorEffortCompliance,
			@NotNull String projectSectorCostCompliance, @NotNull List<ProjectTask> projectSectorTasks) {
		super();
		this.projectSectorId = projectSectorId;
		this.projectSectorCompletion = projectSectorCompletion;
		this.projectSectorStartDate = projectSectorStartDate;
		this.projectSectorEndDate = projectSectorEndDate;
		this.projectSectorOwnerId = projectSectorOwnerId;
		this.projectSectorActualStartDate = projectSectorActualStartDate;
		this.projectSectorActualEndnDate = projectSectorActualEndnDate;
		this.projectSectorPlannedEffort = projectSectorPlannedEffort;
		this.projectSectorActualEffort = projectSectorActualEffort;
		this.projectSectorScheduleDeviationComment = projectSectorScheduleDeviationComment;
		this.projectSectorState = projectSectorState;
		this.projectSectorHealth = projectSectorHealth;
		this.projectSectorHappinessIndex = projectSectorHappinessIndex;
		this.projectSectorCompletionRate = projectSectorCompletionRate;
		this.projectSectorScheduleCompliance = projectSectorScheduleCompliance;
		this.projectSectorEffortCompliance = projectSectorEffortCompliance;
		this.projectSectorCostCompliance = projectSectorCostCompliance;
		this.projectSectorTasks = projectSectorTasks;
	}

	/**
	 * @return the projectSectorId
	 */
	public int getProjectSectorId() {
		return projectSectorId;
	}

	/**
	 * @param projectSectorId the projectSectorId to set
	 */
	public void setProjectSectorId(int projectSectorId) {
		this.projectSectorId = projectSectorId;
	}

	/**
	 * @return the projectSectorCompletion
	 */
	public int getProjectSectorCompletion() {
		return projectSectorCompletion;
	}

	/**
	 * @param projectSectorCompletion the projectSectorCompletion to set
	 */
	public void setProjectSectorCompletion(int projectSectorCompletion) {
		this.projectSectorCompletion = projectSectorCompletion;
	}

	/**
	 * @return the projectSectorStartDate
	 */
	public String getProjectSectorStartDate() {
		return projectSectorStartDate;
	}

	/**
	 * @param projectSectorStartDate the projectSectorStartDate to set
	 */
	public void setProjectSectorStartDate(String projectSectorStartDate) {
		this.projectSectorStartDate = projectSectorStartDate;
	}

	/**
	 * @return the projectSectorEndDate
	 */
	public String getProjectSectorEndDate() {
		return projectSectorEndDate;
	}

	/**
	 * @param projectSectorEndDate the projectSectorEndDate to set
	 */
	public void setProjectSectorEndDate(String projectSectorEndDate) {
		this.projectSectorEndDate = projectSectorEndDate;
	}

	/**
	 * @return the projectSectorOwnerId
	 */
	public int getProjectSectorOwnerId() {
		return projectSectorOwnerId;
	}

	/**
	 * @param projectSectorOwnerId the projectSectorOwnerId to set
	 */
	public void setProjectSectorOwnerId(int projectSectorOwnerId) {
		this.projectSectorOwnerId = projectSectorOwnerId;
	}

	/**
	 * @return the projectSectorActualStartDate
	 */
	public String getProjectSectorActualStartDate() {
		return projectSectorActualStartDate;
	}

	/**
	 * @param projectSectorActualStartDate the projectSectorActualStartDate to set
	 */
	public void setProjectSectorActualStartDate(String projectSectorActualStartDate) {
		this.projectSectorActualStartDate = projectSectorActualStartDate;
	}

	/**
	 * @return the projectSectorActualEndnDate
	 */
	public String getProjectSectorActualEndnDate() {
		return projectSectorActualEndnDate;
	}

	/**
	 * @param projectSectorActualEndnDate the projectSectorActualEndnDate to set
	 */
	public void setProjectSectorActualEndnDate(String projectSectorActualEndnDate) {
		this.projectSectorActualEndnDate = projectSectorActualEndnDate;
	}

	/**
	 * @return the projectSectorPlannedEffort
	 */
	public int getProjectSectorPlannedEffort() {
		return projectSectorPlannedEffort;
	}

	/**
	 * @param projectSectorPlannedEffort the projectSectorPlannedEffort to set
	 */
	public void setProjectSectorPlannedEffort(int projectSectorPlannedEffort) {
		this.projectSectorPlannedEffort = projectSectorPlannedEffort;
	}

	/**
	 * @return the projectSectorActualEffort
	 */
	public int getProjectSectorActualEffort() {
		return projectSectorActualEffort;
	}

	/**
	 * @param projectSectorActualEffort the projectSectorActualEffort to set
	 */
	public void setProjectSectorActualEffort(int projectSectorActualEffort) {
		this.projectSectorActualEffort = projectSectorActualEffort;
	}

	/**
	 * @return the projectSectorScheduleDeviationComment
	 */
	public String getProjectSectorScheduleDeviationComment() {
		return projectSectorScheduleDeviationComment;
	}

	/**
	 * @param projectSectorScheduleDeviationComment the projectSectorScheduleDeviationComment to set
	 */
	public void setProjectSectorScheduleDeviationComment(String projectSectorScheduleDeviationComment) {
		this.projectSectorScheduleDeviationComment = projectSectorScheduleDeviationComment;
	}

	/**
	 * @return the projectSectorState
	 */
	public String getProjectSectorState() {
		return projectSectorState;
	}

	/**
	 * @param projectSectorState the projectSectorState to set
	 */
	public void setProjectSectorState(String projectSectorState) {
		this.projectSectorState = projectSectorState;
	}

	/**
	 * @return the projectSectorHealth
	 */
	public String getProjectSectorHealth() {
		return projectSectorHealth;
	}

	/**
	 * @param projectSectorHealth the projectSectorHealth to set
	 */
	public void setProjectSectorHealth(String projectSectorHealth) {
		this.projectSectorHealth = projectSectorHealth;
	}

	/**
	 * @return the projectSectorHappinessIndex
	 */
	public String getProjectSectorHappinessIndex() {
		return projectSectorHappinessIndex;
	}

	/**
	 * @param projectSectorHappinessIndex the projectSectorHappinessIndex to set
	 */
	public void setProjectSectorHappinessIndex(String projectSectorHappinessIndex) {
		this.projectSectorHappinessIndex = projectSectorHappinessIndex;
	}

	/**
	 * @return the projectSectorCompletionRate
	 */
	public int getProjectSectorCompletionRate() {
		return projectSectorCompletionRate;
	}

	/**
	 * @param projectSectorCompletionRate the projectSectorCompletionRate to set
	 */
	public void setProjectSectorCompletionRate(int projectSectorCompletionRate) {
		this.projectSectorCompletionRate = projectSectorCompletionRate;
	}

	/**
	 * @return the projectSectorScheduleCompliance
	 */
	public String getProjectSectorScheduleCompliance() {
		return projectSectorScheduleCompliance;
	}

	/**
	 * @param projectSectorScheduleCompliance the projectSectorScheduleCompliance to set
	 */
	public void setProjectSectorScheduleCompliance(String projectSectorScheduleCompliance) {
		this.projectSectorScheduleCompliance = projectSectorScheduleCompliance;
	}

	/**
	 * @return the projectSectorEffortCompliance
	 */
	public String getProjectSectorEffortCompliance() {
		return projectSectorEffortCompliance;
	}

	/**
	 * @param projectSectorEffortCompliance the projectSectorEffortCompliance to set
	 */
	public void setProjectSectorEffortCompliance(String projectSectorEffortCompliance) {
		this.projectSectorEffortCompliance = projectSectorEffortCompliance;
	}

	/**
	 * @return the projectSectorCostCompliance
	 */
	public String getProjectSectorCostCompliance() {
		return projectSectorCostCompliance;
	}

	/**
	 * @param projectSectorCostCompliance the projectSectorCostCompliance to set
	 */
	public void setProjectSectorCostCompliance(String projectSectorCostCompliance) {
		this.projectSectorCostCompliance = projectSectorCostCompliance;
	}

	/**
	 * @return the projectSectorTasks
	 */
	public List<ProjectTask> getProjectSectorTasks() {
		return projectSectorTasks;
	}

	/**
	 * @param projectSectorTasks the projectSectorTasks to set
	 */
	public void setProjectSectorTasks(List<ProjectTask> projectSectorTasks) {
		this.projectSectorTasks = projectSectorTasks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + projectSectorActualEffort;
		result = prime * result
				+ ((projectSectorActualEndnDate == null) ? 0 : projectSectorActualEndnDate.hashCode());
		result = prime * result
				+ ((projectSectorActualStartDate == null) ? 0 : projectSectorActualStartDate.hashCode());
		result = prime * result + projectSectorCompletion;
		result = prime * result + projectSectorCompletionRate;
		result = prime * result
				+ ((projectSectorCostCompliance == null) ? 0 : projectSectorCostCompliance.hashCode());
		result = prime * result
				+ ((projectSectorEffortCompliance == null) ? 0 : projectSectorEffortCompliance.hashCode());
		result = prime * result + ((projectSectorEndDate == null) ? 0 : projectSectorEndDate.hashCode());
		result = prime * result
				+ ((projectSectorHappinessIndex == null) ? 0 : projectSectorHappinessIndex.hashCode());
		result = prime * result + ((projectSectorHealth == null) ? 0 : projectSectorHealth.hashCode());
		result = prime * result + projectSectorId;
		result = prime * result + projectSectorOwnerId;
		result = prime * result + projectSectorPlannedEffort;
		result = prime * result
				+ ((projectSectorScheduleCompliance == null) ? 0 : projectSectorScheduleCompliance.hashCode());
		result = prime * result + ((projectSectorScheduleDeviationComment == null) ? 0
				: projectSectorScheduleDeviationComment.hashCode());
		result = prime * result + ((projectSectorStartDate == null) ? 0 : projectSectorStartDate.hashCode());
		result = prime * result + ((projectSectorState == null) ? 0 : projectSectorState.hashCode());
		result = prime * result + ((projectSectorTasks == null) ? 0 : projectSectorTasks.hashCode());
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
		ProjectSector other = (ProjectSector) obj;
		if (projectSectorActualEffort != other.projectSectorActualEffort)
			return false;
		if (projectSectorActualEndnDate == null) {
			if (other.projectSectorActualEndnDate != null)
				return false;
		} else if (!projectSectorActualEndnDate.equals(other.projectSectorActualEndnDate))
			return false;
		if (projectSectorActualStartDate == null) {
			if (other.projectSectorActualStartDate != null)
				return false;
		} else if (!projectSectorActualStartDate.equals(other.projectSectorActualStartDate))
			return false;
		if (projectSectorCompletion != other.projectSectorCompletion)
			return false;
		if (projectSectorCompletionRate != other.projectSectorCompletionRate)
			return false;
		if (projectSectorCostCompliance == null) {
			if (other.projectSectorCostCompliance != null)
				return false;
		} else if (!projectSectorCostCompliance.equals(other.projectSectorCostCompliance))
			return false;
		if (projectSectorEffortCompliance == null) {
			if (other.projectSectorEffortCompliance != null)
				return false;
		} else if (!projectSectorEffortCompliance.equals(other.projectSectorEffortCompliance))
			return false;
		if (projectSectorEndDate == null) {
			if (other.projectSectorEndDate != null)
				return false;
		} else if (!projectSectorEndDate.equals(other.projectSectorEndDate))
			return false;
		if (projectSectorHappinessIndex == null) {
			if (other.projectSectorHappinessIndex != null)
				return false;
		} else if (!projectSectorHappinessIndex.equals(other.projectSectorHappinessIndex))
			return false;
		if (projectSectorHealth == null) {
			if (other.projectSectorHealth != null)
				return false;
		} else if (!projectSectorHealth.equals(other.projectSectorHealth))
			return false;
		if (projectSectorId != other.projectSectorId)
			return false;
		if (projectSectorOwnerId != other.projectSectorOwnerId)
			return false;
		if (projectSectorPlannedEffort != other.projectSectorPlannedEffort)
			return false;
		if (projectSectorScheduleCompliance == null) {
			if (other.projectSectorScheduleCompliance != null)
				return false;
		} else if (!projectSectorScheduleCompliance.equals(other.projectSectorScheduleCompliance))
			return false;
		if (projectSectorScheduleDeviationComment == null) {
			if (other.projectSectorScheduleDeviationComment != null)
				return false;
		} else if (!projectSectorScheduleDeviationComment.equals(other.projectSectorScheduleDeviationComment))
			return false;
		if (projectSectorStartDate == null) {
			if (other.projectSectorStartDate != null)
				return false;
		} else if (!projectSectorStartDate.equals(other.projectSectorStartDate))
			return false;
		if (projectSectorState == null) {
			if (other.projectSectorState != null)
				return false;
		} else if (!projectSectorState.equals(other.projectSectorState))
			return false;
		if (projectSectorTasks == null) {
			if (other.projectSectorTasks != null)
				return false;
		} else if (!projectSectorTasks.equals(other.projectSectorTasks))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProjectSector [projectSectorId=" + projectSectorId + ", projectSectorCompletion="
				+ projectSectorCompletion + ", projectSectorStartDate=" + projectSectorStartDate
				+ ", projectSectorEndDate=" + projectSectorEndDate + ", projectSectorOwnerId="
				+ projectSectorOwnerId + ", projectSectorActualStartDate=" + projectSectorActualStartDate
				+ ", projectSectorActualEndnDate=" + projectSectorActualEndnDate + ", projectSectorPlannedEffort="
				+ projectSectorPlannedEffort + ", projectSectorActualEffort=" + projectSectorActualEffort
				+ ", projectSectorScheduleDeviationComment=" + projectSectorScheduleDeviationComment
				+ ", projectSectorState=" + projectSectorState + ", projectSectorHealth=" + projectSectorHealth
				+ ", projectSectorHappinessIndex=" + projectSectorHappinessIndex
				+ ", projectSectorCompletionRate=" + projectSectorCompletionRate
				+ ", projectSectorScheduleCompliance=" + projectSectorScheduleCompliance
				+ ", projectSectorEffortCompliance=" + projectSectorEffortCompliance
				+ ", projectSectorCostCompliance=" + projectSectorCostCompliance + ", projectSectorTasks="
				+ projectSectorTasks + "]";
	}
}