package TBDpojo;

import javax.validation.constraints.NotNull;



public class ClientUser {
	
	@NotNull
	private int userId;
	
	
	@NotNull
	private String userClientStatus;// Active or Passive

	
	@NotNull
	private String userClientRole; // Eval Admin, System Admin, Normal User
	
	public ClientUser() {
		
	}

	/**
	 * @param userId
	 * @param userClientStatus
	 * @param userClientRole
	 */
	public ClientUser(@NotNull int userId, @NotNull String userClientStatus, @NotNull String userClientRole) {
		super();
		this.userId = userId;
		this.userClientStatus = userClientStatus;
		this.userClientRole = userClientRole;
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
	 * @return the userClientStatus
	 */
	public String getUserClientStatus() {
		return userClientStatus;
	}

	/**
	 * @param userClientStatus the userClientStatus to set
	 */
	public void setUserClientStatus(String userClientStatus) {
		this.userClientStatus = userClientStatus;
	}

	/**
	 * @return the userClientRole
	 */
	public String getUserClientRole() {
		return userClientRole;
	}

	/**
	 * @param userClientRole the userClientRole to set
	 */
	public void setUserClientRole(String userClientRole) {
		this.userClientRole = userClientRole;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userClientRole == null) ? 0 : userClientRole.hashCode());
		result = prime * result + ((userClientStatus == null) ? 0 : userClientStatus.hashCode());
		result = prime * result + userId;
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
		ClientUser other = (ClientUser) obj;
		if (userClientRole == null) {
			if (other.userClientRole != null)
				return false;
		} else if (!userClientRole.equals(other.userClientRole))
			return false;
		if (userClientStatus == null) {
			if (other.userClientStatus != null)
				return false;
		} else if (!userClientStatus.equals(other.userClientStatus))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClientUser [userId=" + userId + ", userClientStatus=" + userClientStatus + ", userClientRole="
				+ userClientRole + "]";
	}
}
