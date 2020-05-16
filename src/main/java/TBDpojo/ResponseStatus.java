package TBDpojo;

import java.io.Serializable;

public class ResponseStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	private int messageCode;
	private String message;
	private String displayMessage;
	
	public ResponseStatus() {}

	/**
	 * @param messageCode
	 * @param message
	 * @param displayMessage
	 */
	public ResponseStatus(int messageCode, String message, String displayMessage) {
		super();
		this.messageCode = messageCode;
		this.message = message;
		this.displayMessage = displayMessage;
	}

	/**
	 * @return the messageCode
	 */
	public int getMessageCode() {
		return messageCode;
	}

	/**
	 * @param messageCode the messageCode to set
	 */
	public void setMessageCode(int messageCode) {
		this.messageCode = messageCode;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the displayMessage
	 */
	public String getDisplayMessage() {
		return displayMessage;
	}

	/**
	 * @param displayMessage the displayMessage to set
	 */
	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((displayMessage == null) ? 0 : displayMessage.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + messageCode;
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
		ResponseStatus other = (ResponseStatus) obj;
		if (displayMessage == null) {
			if (other.displayMessage != null)
				return false;
		} else if (!displayMessage.equals(other.displayMessage))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (messageCode != other.messageCode)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ResponseStatus [messageCode=" + messageCode + ", message=" + message + ", displayMessage="
				+ displayMessage + "]";
	}
}