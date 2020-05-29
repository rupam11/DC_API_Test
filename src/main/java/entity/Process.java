package entity;

import java.io.Serializable;



public class Process implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int processId;
	
	
	private String processCode;

	
	private String processName;

	
	private String processStatus;

	
	private String processCreatedBy;

	
	private String processCreatedAt;

	
	private String processUpdatedBy;

	
	private String processUpdatedAt;

	public Process() {

	}

	/**
	 * @param processId
	 * @param processCode
	 * @param processName
	 * @param processStatus
	 * @param processCreatedBy
	 * @param processCreatedAt
	 * @param processUpdatedBy
	 * @param processUpdatedAt
	 */
	public Process(int processId, String processCode, String processName, String processStatus, String processCreatedBy,
			String processCreatedAt, String processUpdatedBy, String processUpdatedAt) {
		super();
		this.processId = processId;
		this.processCode = processCode;
		this.processName = processName;
		this.processStatus = processStatus;
		this.processCreatedBy = processCreatedBy;
		this.processCreatedAt = processCreatedAt;
		this.processUpdatedBy = processUpdatedBy;
		this.processUpdatedAt = processUpdatedAt;
	}

	/**
	 * @return the processId
	 */
	public int getProcessId() {
		return processId;
	}

	/**
	 * @param processId the processId to set
	 */
	public void setProcessId(int processId) {
		this.processId = processId;
	}

	/**
	 * @return the processCode
	 */
	public String getProcessCode() {
		return processCode;
	}

	/**
	 * @param processCode the processCode to set
	 */
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	/**
	 * @return the processName
	 */
	public String getProcessName() {
		return processName;
	}

	/**
	 * @param processName the processName to set
	 */
	public void setProcessName(String processName) {
		this.processName = processName;
	}

	/**
	 * @return the processStatus
	 */
	public String getProcessStatus() {
		return processStatus;
	}

	/**
	 * @param processStatus the processStatus to set
	 */
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	/**
	 * @return the processCreatedBy
	 */
	public String getProcessCreatedBy() {
		return processCreatedBy;
	}

	/**
	 * @param processCreatedBy the processCreatedBy to set
	 */
	public void setProcessCreatedBy(String processCreatedBy) {
		this.processCreatedBy = processCreatedBy;
	}

	/**
	 * @return the processCreatedAt
	 */
	public String getProcessCreatedAt() {
		return processCreatedAt;
	}

	/**
	 * @param processCreatedAt the processCreatedAt to set
	 */
	public void setProcessCreatedAt(String processCreatedAt) {
		this.processCreatedAt = processCreatedAt;
	}

	/**
	 * @return the processUpdatedBy
	 */
	public String getProcessUpdatedBy() {
		return processUpdatedBy;
	}

	/**
	 * @param processUpdatedBy the processUpdatedBy to set
	 */
	public void setProcessUpdatedBy(String processUpdatedBy) {
		this.processUpdatedBy = processUpdatedBy;
	}

	/**
	 * @return the processUpdatedAt
	 */
	public String getProcessUpdatedAt() {
		return processUpdatedAt;
	}

	/**
	 * @param processUpdatedAt the processUpdatedAt to set
	 */
	public void setProcessUpdatedAt(String processUpdatedAt) {
		this.processUpdatedAt = processUpdatedAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((processCode == null) ? 0 : processCode.hashCode());
		result = prime * result + ((processCreatedAt == null) ? 0 : processCreatedAt.hashCode());
		result = prime * result + ((processCreatedBy == null) ? 0 : processCreatedBy.hashCode());
		result = prime * result + processId;
		result = prime * result + ((processName == null) ? 0 : processName.hashCode());
		result = prime * result + ((processStatus == null) ? 0 : processStatus.hashCode());
		result = prime * result + ((processUpdatedAt == null) ? 0 : processUpdatedAt.hashCode());
		result = prime * result + ((processUpdatedBy == null) ? 0 : processUpdatedBy.hashCode());
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
		Process other = (Process) obj;
		if (processCode == null) {
			if (other.processCode != null)
				return false;
		} else if (!processCode.equals(other.processCode))
			return false;
		if (processCreatedAt == null) {
			if (other.processCreatedAt != null)
				return false;
		} else if (!processCreatedAt.equals(other.processCreatedAt))
			return false;
		if (processCreatedBy == null) {
			if (other.processCreatedBy != null)
				return false;
		} else if (!processCreatedBy.equals(other.processCreatedBy))
			return false;
		if (processId != other.processId)
			return false;
		if (processName == null) {
			if (other.processName != null)
				return false;
		} else if (!processName.equals(other.processName))
			return false;
		if (processStatus == null) {
			if (other.processStatus != null)
				return false;
		} else if (!processStatus.equals(other.processStatus))
			return false;
		if (processUpdatedAt == null) {
			if (other.processUpdatedAt != null)
				return false;
		} else if (!processUpdatedAt.equals(other.processUpdatedAt))
			return false;
		if (processUpdatedBy == null) {
			if (other.processUpdatedBy != null)
				return false;
		} else if (!processUpdatedBy.equals(other.processUpdatedBy))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Process [processId=" + processId + ", processCode=" + processCode + ", processName=" + processName
				+ ", processStatus=" + processStatus + ", processCreatedBy=" + processCreatedBy + ", processCreatedAt="
				+ processCreatedAt + ", processUpdatedBy=" + processUpdatedBy + ", processUpdatedAt=" + processUpdatedAt
				+ "]";
	}
}