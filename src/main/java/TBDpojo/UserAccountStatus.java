package TBDpojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;



public class UserAccountStatus implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String userPassword;
	// At Registration - set to false
	// At login, check if currentDate - userPasswordLastUpdatedAt is >= 90, then set
	// to false
	// For Add Users to project, if the user doesnt already exist, set to true so
	// that the user can reset at first time login
	
	@NotNull
	private boolean userAccountExpired;
	// At loginUser -> failed, increment by 1, if >=3 set userAccountLocked to true
	// At updateUser for password change, reset counter to 0
	
	@NotNull
	private int userWrongAttempts;
	// At loginUser -> failed, userAccountLocked is set to true at 3 wrong attempts
	// in userLogin
	// At updateUser -> set to true
	
	@NotNull
	private boolean userAccountLocked;
	// At Registration set to current date
	// At updateUser for password change, set to current date
	
	@NotNull
	private String userPasswordLastUpdatedAt;

	public UserAccountStatus() {

	}

	/**
	 * @param userPassword
	 * @param userAccountExpired
	 * @param userWrongAttempts
	 * @param userAccountLocked
	 * @param userPasswordLastUpdatedAt
	 */
	public UserAccountStatus(@NotNull String userPassword, @NotNull boolean userAccountExpired,
			@NotNull int userWrongAttempts, @NotNull boolean userAccountLocked,
			@NotNull String userPasswordLastUpdatedAt) {
		super();
		this.userPassword = userPassword;
		this.userAccountExpired = userAccountExpired;
		this.userWrongAttempts = userWrongAttempts;
		this.userAccountLocked = userAccountLocked;
		this.userPasswordLastUpdatedAt = userPasswordLastUpdatedAt;
	}

	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * @return the userAccountExpired
	 */
	public boolean isUserAccountExpired() {
		return userAccountExpired;
	}

	/**
	 * @param userAccountExpired the userAccountExpired to set
	 */
	public void setUserAccountExpired(boolean userAccountExpired) {
		this.userAccountExpired = userAccountExpired;
	}

	/**
	 * @return the userWrongAttempts
	 */
	public int getUserWrongAttempts() {
		return userWrongAttempts;
	}

	/**
	 * @param userWrongAttempts the userWrongAttempts to set
	 */
	public void setUserWrongAttempts(int userWrongAttempts) {
		this.userWrongAttempts = userWrongAttempts;
	}

	/**
	 * @return the userAccountLocked
	 */
	public boolean isUserAccountLocked() {
		return userAccountLocked;
	}

	/**
	 * @param userAccountLocked the userAccountLocked to set
	 */
	public void setUserAccountLocked(boolean userAccountLocked) {
		this.userAccountLocked = userAccountLocked;
	}

	/**
	 * @return the userPasswordLastUpdatedAt
	 */
	public String getUserPasswordLastUpdatedAt() {
		return userPasswordLastUpdatedAt;
	}

	/**
	 * @param userPasswordLastUpdatedAt the userPasswordLastUpdatedAt to set
	 */
	public void setUserPasswordLastUpdatedAt(String userPasswordLastUpdatedAt) {
		this.userPasswordLastUpdatedAt = userPasswordLastUpdatedAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (userAccountExpired ? 1231 : 1237);
		result = prime * result + (userAccountLocked ? 1231 : 1237);
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		result = prime * result + ((userPasswordLastUpdatedAt == null) ? 0 : userPasswordLastUpdatedAt.hashCode());
		result = prime * result + userWrongAttempts;
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
		if (userWrongAttempts != other.userWrongAttempts)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserAccountStatus [userPassword=" + userPassword + ", userAccountExpired=" + userAccountExpired
				+ ", userWrongAttempts=" + userWrongAttempts + ", userAccountLocked=" + userAccountLocked
				+ ", userPasswordLastUpdatedAt=" + userPasswordLastUpdatedAt + "]";
	}
}