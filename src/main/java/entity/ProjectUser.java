package entity;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class ProjectUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull
	private int userId;
	
	@NotNull
	private String userProjectRole;// Active or Passive
	
	
	@NotNull
	private String userProjectStatus;// Active or Passive
	
	
	@NotNull
	private String userProjectPasscode;


	@NotNull
	private boolean userRegistered; 
	
	public ProjectUser() {
		
	}

	/**
	 * @param userId
	 * @param userProjectRole
	 * @param userProjectStatus
	 * @param userProjectPasscode
	 * @param userRegistered
	 */
	public ProjectUser(@NotNull int userId, @NotNull String userProjectRole, @NotNull String userProjectStatus,
			@NotNull String userProjectPasscode, @NotNull boolean userRegistered) {
		super();
		this.userId = userId;
		this.userProjectRole = userProjectRole;
		this.userProjectStatus = userProjectStatus;
		this.userProjectPasscode = userProjectPasscode;
		this.userRegistered = userRegistered;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userProjectRole
	 */
	public String getUserProjectRole() {
		return userProjectRole;
	}

	/**
	 * @param userProjectRole the userProjectRole to set
	 */
	public void setUserProjectRole(String userProjectRole) {
		this.userProjectRole = userProjectRole;
	}

	/**
	 * @return the userProjectStatus
	 */
	public String getUserProjectStatus() {
		return userProjectStatus;
	}

	/**
	 * @param userProjectStatus the userProjectStatus to set
	 */
	public void setUserProjectStatus(String userProjectStatus) {
		this.userProjectStatus = userProjectStatus;
	}

	/**
	 * @return the userProjectPasscode
	 */
	public String getUserProjectPasscode() {
		return userProjectPasscode;
	}

	/**
	 * @param userProjectPasscode the userProjectPasscode to set
	 */
	public void setUserProjectPasscode(String userProjectPasscode) {
		this.userProjectPasscode = userProjectPasscode;
	}

	/**
	 * @return the userRegistered
	 */
	public boolean isUserRegistered() {
		return userRegistered;
	}

	/**
	 * @param userRegistered the userRegistered to set
	 */
	public void setUserRegistered(boolean userRegistered) {
		this.userRegistered = userRegistered;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		result = prime * result + ((userProjectPasscode == null) ? 0 : userProjectPasscode.hashCode());
		result = prime * result + ((userProjectRole == null) ? 0 : userProjectRole.hashCode());
		result = prime * result + ((userProjectStatus == null) ? 0 : userProjectStatus.hashCode());
		result = prime * result + (userRegistered ? 1231 : 1237);
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
		ProjectUser other = (ProjectUser) obj;
		if (userId != other.userId)
			return false;
		if (userProjectPasscode == null) {
			if (other.userProjectPasscode != null)
				return false;
		} else if (!userProjectPasscode.equals(other.userProjectPasscode))
			return false;
		if (userProjectRole == null) {
			if (other.userProjectRole != null)
				return false;
		} else if (!userProjectRole.equals(other.userProjectRole))
			return false;
		if (userProjectStatus == null) {
			if (other.userProjectStatus != null)
				return false;
		} else if (!userProjectStatus.equals(other.userProjectStatus))
			return false;
		if (userRegistered != other.userRegistered)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProjectUser [userId=" + userId + ", userProjectRole=" + userProjectRole + ", userProjectStatus="
				+ userProjectStatus + ", userProjectPasscode=" + userProjectPasscode + ", userRegistered="
				+ userRegistered + "]";
	}
}
