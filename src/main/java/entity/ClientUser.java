package entity;

public class ClientUser {
	
	private static long serialVersionUID = 1L;
	private String userClientRole;
	private String userClientStatus;
	private int userId;
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		ClientUser.serialVersionUID = serialVersionUID;
	}
	public String getUserClientRole() {
		return userClientRole;
	}
	public ClientUser(String userClientRole, String userClientStatus, int userId) {
		super();
		this.userClientRole = userClientRole;
		this.userClientStatus = userClientStatus;
		this.userId = userId;
	}
	public void setUserClientRole(String userClientRole) {
		this.userClientRole = userClientRole;
	}
	public String getUserClientStatus() {
		return userClientStatus;
	}
	public void setUserClientStatus(String userClientStatus) {
		this.userClientStatus = userClientStatus;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public ClientUser() {
		super();
		
	}

}
