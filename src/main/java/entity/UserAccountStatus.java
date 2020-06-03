package entity;

public class UserAccountStatus {
	private boolean userAccountExpired;
	public UserAccountStatus(boolean userAccountExpired, boolean userAccountLocked, String userPassword,
			String userPasswordLastUpdatedAt, String userWrongAttempts) {
		super();
		this.userAccountExpired = userAccountExpired;
		this.userAccountLocked = userAccountLocked;
		this.userPassword = userPassword;
		this.userPasswordLastUpdatedAt = userPasswordLastUpdatedAt;
		this.userWrongAttempts = userWrongAttempts;
	}
	public UserAccountStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserAccountStatus [userAccountExpired=" + userAccountExpired + ", userAccountLocked="
				+ userAccountLocked + ", userPassword=" + userPassword + ", userPasswordLastUpdatedAt="
				+ userPasswordLastUpdatedAt + ", userWrongAttempts=" + userWrongAttempts + "]";
	}
	private boolean userAccountLocked;
	private String userPassword;
	private String userPasswordLastUpdatedAt;
	private String userWrongAttempts;
	public boolean isUserAccountExpired() {
		return userAccountExpired;
	}
	public void setUserAccountExpired(boolean userAccountExpired) {
		this.userAccountExpired = userAccountExpired;
	}
	public boolean isUserAccountLocked() {
		return userAccountLocked;
	}
	public void setUserAccountLocked(boolean userAccountLocked) {
		this.userAccountLocked = userAccountLocked;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserPasswordLastUpdatedAt() {
		return userPasswordLastUpdatedAt;
	}
	public void setUserPasswordLastUpdatedAt(String userPasswordLastUpdatedAt) {
		this.userPasswordLastUpdatedAt = userPasswordLastUpdatedAt;
	}
	public String getUserWrongAttempts() {
		return userWrongAttempts;
	}
	public void setUserWrongAttempts(String userWrongAttempts) {
		this.userWrongAttempts = userWrongAttempts;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (userAccountExpired ? 1231 : 1237);
		result = prime * result + (userAccountLocked ? 1231 : 1237);
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		result = prime * result + ((userPasswordLastUpdatedAt == null) ? 0 : userPasswordLastUpdatedAt.hashCode());
		result = prime * result + ((userWrongAttempts == null) ? 0 : userWrongAttempts.hashCode());
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
		UserAccountStatus other = (UserAccountStatus) obj;
		if (userAccountExpired != other.userAccountExpired)
			return false;
		if (userAccountLocked != other.userAccountLocked)
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		if (userPasswordLastUpdatedAt == null) {
			if (other.userPasswordLastUpdatedAt != null)
				return false;
		} else if (!userPasswordLastUpdatedAt.equals(other.userPasswordLastUpdatedAt))
			return false;
		if (userWrongAttempts == null) {
			if (other.userWrongAttempts != null)
				return false;
		} else if (!userWrongAttempts.equals(other.userWrongAttempts))
			return false;
		return true;
	}

}
