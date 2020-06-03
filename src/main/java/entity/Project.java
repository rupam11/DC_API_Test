package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull
	private int projectId;
	@NotNull
	private String projectParentId;
	@NotNull
	private String projectName;
	@NotNull
	private List<Integer> projectRuleIds;
	@NotNull
	private String projectStatus;//Active/Passive
	@NotNull
	private String projectPasscode;//24character alphanumeric
	@NotNull
	private String projectPurpose;
	@NotNull
	private String projectType;	
	@NotNull
	private List<Integer> bookIds = new ArrayList<Integer>();
	@NotNull
	private String projectDescription;
	@NotNull
	private ProjectInsight projectInsight;
	@NotNull
	private List<ProjectMilestone> projectMilestone=new ArrayList<ProjectMilestone>();
	@NotNull
	private List<ProjectUser> users = new ArrayList<ProjectUser>();
	@NotNull
	private String projectSector;//All
	@NotNull
	private String projectIndustry;//All
	@NotNull
	private String projectCreatedBy;
	@NotNull
	private String projectCreatedAt;
	@NotNull
	private String projectUpdatedBy;
	@NotNull
	private String projectUpdatedAt;
	
	public Project() {
		
	}

	/**
	 * @param projectId
	 * @param projectParentId
	 * @param projectName
	 * @param projectRuleIds
	 * @param projectStatus
	 * @param projectPasscode
	 * @param projectPurpose
	 * @param projectType
	 * @param bookIds
	 * @param projectDescription
	 * @param projectInsight
	 * @param projectMilestone
	 * @param users
	 * @param projectSector
	 * @param projectIndustry
	 * @param projectCreatedBy
	 * @param projectCreatedAt
	 * @param projectUpdatedBy
	 * @param projectUpdatedAt
	 */
	public Project(@NotNull int projectId, @NotNull String projectParentId, @NotNull String projectName,
			@NotNull List<Integer> projectRuleIds, @NotNull String projectStatus, @NotNull String projectPasscode,
			@NotNull String projectPurpose, @NotNull String projectType, @NotNull List<Integer> bookIds,
			@NotNull String projectDescription, @NotNull ProjectInsight projectInsight,
			@NotNull List<ProjectMilestone> projectMilestone, @NotNull List<ProjectUser> users,
			@NotNull String projectSector, @NotNull String projectIndustry, @NotNull String projectCreatedBy,
			@NotNull String projectCreatedAt, @NotNull String projectUpdatedBy, @NotNull String projectUpdatedAt) {
		super();
		this.projectId = projectId;
		this.projectParentId = projectParentId;
		this.projectName = projectName;
		this.projectRuleIds = projectRuleIds;
		this.projectStatus = projectStatus;
		this.projectPasscode = projectPasscode;
		this.projectPurpose = projectPurpose;
		this.projectType = projectType;
		this.bookIds = bookIds;
		this.projectDescription = projectDescription;
		this.projectInsight = projectInsight;
		this.projectMilestone = projectMilestone;
		this.users = users;
		this.projectSector = projectSector;
		this.projectIndustry = projectIndustry;
		this.projectCreatedBy = projectCreatedBy;
		this.projectCreatedAt = projectCreatedAt;
		this.projectUpdatedBy = projectUpdatedBy;
		this.projectUpdatedAt = projectUpdatedAt;
	}

	/**
	 * @return the projectId
	 */
	public int getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the projectParentId
	 */
	public String getProjectParentId() {
		return projectParentId;
	}

	/**
	 * @param projectParentId the projectParentId to set
	 */
	public void setProjectParentId(String projectParentId) {
		this.projectParentId = projectParentId;
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the projectRuleIds
	 */
	public List<Integer> getProjectRuleIds() {
		return projectRuleIds;
	}

	/**
	 * @param projectRuleIds the projectRuleIds to set
	 */
	public void setProjectRuleIds(List<Integer> projectRuleIds) {
		this.projectRuleIds = projectRuleIds;
	}

	/**
	 * @return the projectStatus
	 */
	public String getProjectStatus() {
		return projectStatus;
	}

	/**
	 * @param projectStatus the projectStatus to set
	 */
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	/**
	 * @return the projectPasscode
	 */
	public String getProjectPasscode() {
		return projectPasscode;
	}

	/**
	 * @param projectPasscode the projectPasscode to set
	 */
	public void setProjectPasscode(String projectPasscode) {
		this.projectPasscode = projectPasscode;
	}

	/**
	 * @return the projectPurpose
	 */
	public String getProjectPurpose() {
		return projectPurpose;
	}

	/**
	 * @param projectPurpose the projectPurpose to set
	 */
	public void setProjectPurpose(String projectPurpose) {
		this.projectPurpose = projectPurpose;
	}

	/**
	 * @return the projectType
	 */
	public String getProjectType() {
		return projectType;
	}

	/**
	 * @param projectType the projectType to set
	 */
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	/**
	 * @return the bookIds
	 */
	public List<Integer> getBookIds() {
		return bookIds;
	}

	/**
	 * @param bookIds the bookIds to set
	 */
	public void setBookIds(List<Integer> bookIds) {
		this.bookIds = bookIds;
	}

	/**
	 * @return the projectDescription
	 */
	public String getProjectDescription() {
		return projectDescription;
	}

	/**
	 * @param projectDescription the projectDescription to set
	 */
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	/**
	 * @return the projectInsight
	 */
	public ProjectInsight getProjectInsight() {
		return projectInsight;
	}

	/**
	 * @param projectInsight the projectInsight to set
	 */
	public void setProjectInsight(ProjectInsight projectInsight) {
		this.projectInsight = projectInsight;
	}

	/**
	 * @return the projectMilestone
	 */
	public List<ProjectMilestone> getProjectMilestone() {
		return projectMilestone;
	}

	/**
	 * @param projectMilestone the projectMilestone to set
	 */
	public void setProjectMilestone(List<ProjectMilestone> projectMilestone) {
		this.projectMilestone = projectMilestone;
	}

	/**
	 * @return the users
	 */
	public List<ProjectUser> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<ProjectUser> users) {
		this.users = users;
	}

	/**
	 * @return the projectSector
	 */
	public String getProjectSector() {
		return projectSector;
	}

	/**
	 * @param projectSector the projectSector to set
	 */
	public void setProjectSector(String projectSector) {
		this.projectSector = projectSector;
	}

	/**
	 * @return the projectIndustry
	 */
	public String getProjectIndustry() {
		return projectIndustry;
	}

	/**
	 * @param projectIndustry the projectIndustry to set
	 */
	public void setProjectIndustry(String projectIndustry) {
		this.projectIndustry = projectIndustry;
	}

	/**
	 * @return the projectCreatedBy
	 */
	public String getProjectCreatedBy() {
		return projectCreatedBy;
	}

	/**
	 * @param projectCreatedBy the projectCreatedBy to set
	 */
	public void setProjectCreatedBy(String projectCreatedBy) {
		this.projectCreatedBy = projectCreatedBy;
	}

	/**
	 * @return the projectCreatedAt
	 */
	public String getProjectCreatedAt() {
		return projectCreatedAt;
	}

	/**
	 * @param projectCreatedAt the projectCreatedAt to set
	 */
	public void setProjectCreatedAt(String projectCreatedAt) {
		this.projectCreatedAt = projectCreatedAt;
	}

	/**
	 * @return the projectUpdatedBy
	 */
	public String getProjectUpdatedBy() {
		return projectUpdatedBy;
	}

	/**
	 * @param projectUpdatedBy the projectUpdatedBy to set
	 */
	public void setProjectUpdatedBy(String projectUpdatedBy) {
		this.projectUpdatedBy = projectUpdatedBy;
	}

	/**
	 * @return the projectUpdatedAt
	 */
	public String getProjectUpdatedAt() {
		return projectUpdatedAt;
	}

	/**
	 * @param projectUpdatedAt the projectUpdatedAt to set
	 */
	public void setProjectUpdatedAt(String projectUpdatedAt) {
		this.projectUpdatedAt = projectUpdatedAt;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookIds == null) ? 0 : bookIds.hashCode());
		result = prime * result + ((projectCreatedAt == null) ? 0 : projectCreatedAt.hashCode());
		result = prime * result + ((projectCreatedBy == null) ? 0 : projectCreatedBy.hashCode());
		result = prime * result + ((projectDescription == null) ? 0 : projectDescription.hashCode());
		result = prime * result + projectId;
		result = prime * result + ((projectIndustry == null) ? 0 : projectIndustry.hashCode());
		result = prime * result + ((projectInsight == null) ? 0 : projectInsight.hashCode());
		result = prime * result + ((projectMilestone == null) ? 0 : projectMilestone.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result + ((projectParentId == null) ? 0 : projectParentId.hashCode());
		result = prime * result + ((projectPasscode == null) ? 0 : projectPasscode.hashCode());
		result = prime * result + ((projectPurpose == null) ? 0 : projectPurpose.hashCode());
		result = prime * result + ((projectRuleIds == null) ? 0 : projectRuleIds.hashCode());
		result = prime * result + ((projectSector == null) ? 0 : projectSector.hashCode());
		result = prime * result + ((projectStatus == null) ? 0 : projectStatus.hashCode());
		result = prime * result + ((projectType == null) ? 0 : projectType.hashCode());
		result = prime * result + ((projectUpdatedAt == null) ? 0 : projectUpdatedAt.hashCode());
		result = prime * result + ((projectUpdatedBy == null) ? 0 : projectUpdatedBy.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		Project other = (Project) obj;
		if (bookIds == null) {
			if (other.bookIds != null)
				return false;
		} else if (!bookIds.equals(other.bookIds))
			return false;
		if (projectCreatedAt == null) {
			if (other.projectCreatedAt != null)
				return false;
		} else if (!projectCreatedAt.equals(other.projectCreatedAt))
			return false;
		if (projectCreatedBy == null) {
			if (other.projectCreatedBy != null)
				return false;
		} else if (!projectCreatedBy.equals(other.projectCreatedBy))
			return false;
		if (projectDescription == null) {
			if (other.projectDescription != null)
				return false;
		} else if (!projectDescription.equals(other.projectDescription))
			return false;
		if (projectId != other.projectId)
			return false;
		if (projectIndustry == null) {
			if (other.projectIndustry != null)
				return false;
		} else if (!projectIndustry.equals(other.projectIndustry))
			return false;
		if (projectInsight == null) {
			if (other.projectInsight != null)
				return false;
		} else if (!projectInsight.equals(other.projectInsight))
			return false;
		if (projectMilestone == null) {
			if (other.projectMilestone != null)
				return false;
		} else if (!projectMilestone.equals(other.projectMilestone))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		if (projectParentId == null) {
			if (other.projectParentId != null)
				return false;
		} else if (!projectParentId.equals(other.projectParentId))
			return false;
		if (projectPasscode == null) {
			if (other.projectPasscode != null)
				return false;
		} else if (!projectPasscode.equals(other.projectPasscode))
			return false;
		if (projectPurpose == null) {
			if (other.projectPurpose != null)
				return false;
		} else if (!projectPurpose.equals(other.projectPurpose))
			return false;
		if (projectRuleIds == null) {
			if (other.projectRuleIds != null)
				return false;
		} else if (!projectRuleIds.equals(other.projectRuleIds))
			return false;
		if (projectSector == null) {
			if (other.projectSector != null)
				return false;
		} else if (!projectSector.equals(other.projectSector))
			return false;
		if (projectStatus == null) {
			if (other.projectStatus != null)
				return false;
		} else if (!projectStatus.equals(other.projectStatus))
			return false;
		if (projectType == null) {
			if (other.projectType != null)
				return false;
		} else if (!projectType.equals(other.projectType))
			return false;
		if (projectUpdatedAt == null) {
			if (other.projectUpdatedAt != null)
				return false;
		} else if (!projectUpdatedAt.equals(other.projectUpdatedAt))
			return false;
		if (projectUpdatedBy == null) {
			if (other.projectUpdatedBy != null)
				return false;
		} else if (!projectUpdatedBy.equals(other.projectUpdatedBy))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectParentId=" + projectParentId + ", projectName="
				+ projectName + ", projectRuleIds=" + projectRuleIds + ", projectStatus=" + projectStatus
				+ ", projectPasscode=" + projectPasscode + ", projectPurpose=" + projectPurpose + ", projectType="
				+ projectType + ", bookIds=" + bookIds + ", projectDescription=" + projectDescription
				+ ", projectInsight=" + projectInsight + ", projectMilestone=" + projectMilestone + ", users=" + users
				+ ", projectSector=" + projectSector + ", projectIndustry=" + projectIndustry + ", projectCreatedBy="
				+ projectCreatedBy + ", projectCreatedAt=" + projectCreatedAt + ", projectUpdatedBy=" + projectUpdatedBy
				+ ", projectUpdatedAt=" + projectUpdatedAt + "]";
	}
}