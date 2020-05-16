package TBDpojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;



public class BookUser implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@NotNull
	private int userId;
	
	
	@NotNull
	private String userBookAccess;// Read/Write/Both
	
	
	@NotNull
	private String userBookPassword;

	
	@NotNull
	private boolean userBookRegistered;
	
	public BookUser() {
		
	}

	/**
	 * @param userId
	 * @param userBookAccess
	 * @param userBookPassword
	 * @param userBookRegistered
	 */
	public BookUser(@NotNull int userId, @NotNull String userBookAccess, @NotNull String userBookPassword,
			@NotNull boolean userBookRegistered) {
		super();
		this.userId = userId;
		this.userBookAccess = userBookAccess;
		this.userBookPassword = userBookPassword;
		this.userBookRegistered = userBookRegistered;
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
	 * @return the userBookAccess
	 */
	public String getUserBookAccess() {
		return userBookAccess;
	}

	/**
	 * @param userBookAccess the userBookAccess to set
	 */
	public void setUserBookAccess(String userBookAccess) {
		this.userBookAccess = userBookAccess;
	}

	/**
	 * @return the userBookPassword
	 */
	public String getUserBookPassword() {
		return userBookPassword;
	}

	/**
	 * @param userBookPassword the userBookPassword to set
	 */
	public void setUserBookPassword(String userBookPassword) {
		this.userBookPassword = userBookPassword;
	}

	/**
	 * @return the userBookRegistered
	 */
	public boolean isUserBookRegistered() {
		return userBookRegistered;
	}

	/**
	 * @param userBookRegistered the userBookRegistered to set
	 */
	public void setUserBookRegistered(boolean userBookRegistered) {
		this.userBookRegistered = userBookRegistered;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userBookAccess == null) ? 0 : userBookAccess.hashCode());
		result = prime * result + ((userBookPassword == null) ? 0 : userBookPassword.hashCode());
		result = prime * result + (userBookRegistered ? 1231 : 1237);
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
		BookUser other = (BookUser) obj;
		if (userBookAccess == null) {
			if (other.userBookAccess != null)
				return false;
		} else if (!userBookAccess.equals(other.userBookAccess))
			return false;
		if (userBookPassword == null) {
			if (other.userBookPassword != null)
				return false;
		} else if (!userBookPassword.equals(other.userBookPassword))
			return false;
		if (userBookRegistered != other.userBookRegistered)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookUser [userId=" + userId + ", userBookAccess=" + userBookAccess + ", userBookPassword="
				+ userBookPassword + ", userBookRegistered=" + userBookRegistered + "]";
	}
}
