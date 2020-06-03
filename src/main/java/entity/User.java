package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable{
	private String userCreatedAt;
	@Override
	public String toString() {
		return "User [userCreatedAt=" + userCreatedAt + ", userCreatedBy=" + userCreatedBy + ", userEmail=" + userEmail
				+ ", userId=" + userId + ", userName=" + userName + ", userRole=" + userRole + ", userSessionToken="
				+ userSessionToken + ", userStatus=" + userStatus + ", userType=" + userType + ", userUpdatedAt="
				+ userUpdatedAt + ", userUpdatedBy=" + userUpdatedBy + ", userAccountStatus=" + userAccountStatus + "]";
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
	public String getUserCreatedAt() {
		return userCreatedAt;
	}
	public void setUserCreatedAt(String userCreatedAt) {
		this.userCreatedAt = userCreatedAt;
	}
	public String getUserCreatedBy() {
		return userCreatedBy;
	}
	public void setUserCreatedBy(String userCreatedBy) {
		this.userCreatedBy = userCreatedBy;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUserSessionToken() {
		return userSessionToken;
	}
	public void setUserSessionToken(String userSessionToken) {
		this.userSessionToken = userSessionToken;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserUpdatedAt() {
		return userUpdatedAt;
	}
	public void setUserUpdatedAt(String userUpdatedAt) {
		this.userUpdatedAt = userUpdatedAt;
	}
	public String getUserUpdatedBy() {
		return userUpdatedBy;
	}
	public void setUserUpdatedBy(String userUpdatedBy) {
		this.userUpdatedBy = userUpdatedBy;
	}
	public UserAccountStatus getUserAccountStatus() {
		return userAccountStatus;
	}
	public void setUserAccountStatus(UserAccountStatus userAccountStatus) {
		this.userAccountStatus = userAccountStatus;
	}
	private String userCreatedBy;
	private String userEmail;
	private int userId;
	private String userName;
	private String userRole;
	private String userSessionToken;
	private String userStatus;
	private String userType;
	private String userUpdatedAt;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userCreatedAt, String userCreatedBy, String userEmail, int userId, String userName,
			String userRole, String userSessionToken, String userStatus, String userType, String userUpdatedAt,
			String userUpdatedBy, UserAccountStatus userAccountStatus) {
		super();
		this.userCreatedAt = userCreatedAt;
		this.userCreatedBy = userCreatedBy;
		this.userEmail = userEmail;
		this.userId = userId;
		this.userName = userName;
		this.userRole = userRole;
		this.userSessionToken = userSessionToken;
		this.userStatus = userStatus;
		this.userType = userType;
		this.userUpdatedAt = userUpdatedAt;
		this.userUpdatedBy = userUpdatedBy;
		this.userAccountStatus = userAccountStatus;
	}
	private String userUpdatedBy;
	private UserAccountStatus userAccountStatus;

}
