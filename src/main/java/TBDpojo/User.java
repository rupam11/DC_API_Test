package TBDpojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;



public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@NotNull
	private int userId;

	
	@NotNull
	private String userName;

	
	@NotNull
	private String userEmail;

	
	@NotNull
	private String userStatus;// Active or Passive

	
	@NotNull
	private String userType;// IBM/Client

	
	@NotNull
	private String userRole; // Eval Admin, System Admin, Normal User

	
	@NotNull
	private String userSessionToken;
	
	@NotNull
	private String userCreatedBy;

	
	@NotNull
	private String userCreatedAt;

	
	@NotNull
	private String userUpdatedBy;

	
	@NotNull
	private String userUpdatedAt;
	
	
	@NotNull
	private UserAccountStatus userAccountStatus;

	public User() {

	}

	/**
	 * @param userId
	 * @param userName
	 * @param userEmail
	 * @param userStatus
	 * @param userType
	 * @param userRole
	 * @param userSessionToken
	 * @param userCreatedBy
	 * @param userCreatedAt
	 * @param userUpdatedBy
	 * @param userUpdatedAt
	 * @param userAccountStatus
	 */
	public User(@NotNull int userId, @NotNull String userName, @NotNull String userEmail, @NotNull String userStatus,
			@NotNull String userType, @NotNull String userRole, @NotNull String userSessionToken,
			@NotNull String userCreatedBy, @NotNull String userCreatedAt, @NotNull String userUpdatedBy,
			@NotNull String userUpdatedAt, @NotNull UserAccountStatus userAccountStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userStatus = userStatus;
		this.userType = userType;
		this.userRole = userRole;
		this.userSessionToken = userSessionToken;
		this.userCreatedBy = userCreatedBy;
		this.userCreatedAt = userCreatedAt;
		this.userUpdatedBy = userUpdatedBy;
		this.userUpdatedAt = userUpdatedAt;
		this.userAccountStatus = userAccountStatus;
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the userStatus
	 */
	public String getUserStatus() {
		return userStatus;
	}

	/**
	 * @param userStatus the userStatus to set
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the userRole
	 */
	public String getUserRole() {
		return userRole;
	}

	/**
	 * @param userRole the userRole to set
	 */
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	/**
	 * @return the userSessionToken
	 */
	public String getUserSessionToken() {
		return userSessionToken;
	}

	/**
	 * @param userSessionToken the userSessionToken to set
	 */
	public void setUserSessionToken(String userSessionToken) {
		this.userSessionToken = userSessionToken;
	}

	/**
	 * @return the userCreatedBy
	 */
	public String getUserCreatedBy() {
		return userCreatedBy;
	}

	/**
	 * @param userCreatedBy the userCreatedBy to set
	 */
	public void setUserCreatedBy(String userCreatedBy) {
		this.userCreatedBy = userCreatedBy;
	}

	/**
	 * @return the userCreatedAt
	 */
	public String getUserCreatedAt() {
		return userCreatedAt;
	}

	/**
	 * @param userCreatedAt the userCreatedAt to set
	 */
	public void setUserCreatedAt(String userCreatedAt) {
		this.userCreatedAt = userCreatedAt;
	}

	/**
	 * @return the userUpdatedBy
	 */
	public String getUserUpdatedBy() {
		return userUpdatedBy;
	}

	/**
	 * @param userUpdatedBy the userUpdatedBy to set
	 */
	public void setUserUpdatedBy(String userUpdatedBy) {
		this.userUpdatedBy = userUpdatedBy;
	}

	/**
	 * @return the userUpdatedAt
	 */
	public String getUserUpdatedAt() {
		return userUpdatedAt;
	}

	/**
	 * @param userUpdatedAt the userUpdatedAt to set
	 */
	public void setUserUpdatedAt(String userUpdatedAt) {
		this.userUpdatedAt = userUpdatedAt;
	}

	/**
	 * @return the userAccountStatus
	 */
	public UserAccountStatus getUserAccountStatus() {
		return userAccountStatus;
	}

	/**
	 * @param userAccountStatus the userAccountStatus to set
	 */
	public void setUserAccountStatus(UserAccountStatus userAccountStatus) {
		this.userAccountStatus = userAccountStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userAccountStatus == null) ? 0 : userAccountStatus.hashCode());
		result = prime * result + ((userCreatedAt == null) ? 0 : userCreatedAt.hashCode());
		result = prime * result + ((userCreatedBy == null) ? 0 : userCreatedBy.hashCode());
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userRole == null) ? 0 : userRole.hashCode());
		result = prime * result + ((userSessionToken == null) ? 0 : userSessionToken.hashCode());
		result = prime * result + ((userStatus == null) ? 0 : userStatus.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
		result = prime * result + ((userUpdatedAt == null) ? 0 : userUpdatedAt.hashCode());
		result = prime * result + ((userUpdatedBy == null) ? 0 : userUpdatedBy.hashCode());
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
		User other = (User) obj;
		if (userAccountStatus == null) {
			if (other.userAccountStatus != null)
				return false;
		} else if (!userAccountStatus.equals(other.userAccountStatus))
			return false;
		if (userCreatedAt == null) {
			if (other.userCreatedAt != null)
				return false;
		} else if (!userCreatedAt.equals(other.userCreatedAt))
			return false;
		if (userCreatedBy == null) {
			if (other.userCreatedBy != null)
				return false;
		} else if (!userCreatedBy.equals(other.userCreatedBy))
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userRole == null) {
			if (other.userRole != null)
				return false;
		} else if (!userRole.equals(other.userRole))
			return false;
		if (userSessionToken == null) {
			if (other.userSessionToken != null)
				return false;
		} else if (!userSessionToken.equals(other.userSessionToken))
			return false;
		if (userStatus == null) {
			if (other.userStatus != null)
				return false;
		} else if (!userStatus.equals(other.userStatus))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		if (userUpdatedAt == null) {
			if (other.userUpdatedAt != null)
				return false;
		} else if (!userUpdatedAt.equals(other.userUpdatedAt))
			return false;
		if (userUpdatedBy == null) {
			if (other.userUpdatedBy != null)
				return false;
		} else if (!userUpdatedBy.equals(other.userUpdatedBy))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userStatus="
				+ userStatus + ", userType=" + userType + ", userRole=" + userRole + ", userSessionToken="
				+ userSessionToken + ", userCreatedBy=" + userCreatedBy + ", userCreatedAt=" + userCreatedAt
				+ ", userUpdatedBy=" + userUpdatedBy + ", userUpdatedAt=" + userUpdatedAt + ", userAccountStatus="
				+ userAccountStatus + "]";
	}
}