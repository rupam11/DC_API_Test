package TBDpojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;



public class Audit implements Serializable {
	private static final long serialVersionUID = 2217760728274203054L;
	
	@NotNull
	private int auditId;
	
	@NotNull
	private String auditFeatureType;// client on boarding---business feature
	
	@NotNull
	private String documentName;// -----couch base document name
	
	@NotNull
	private String documentOperation;// -----Read or Write
	
	@NotNull
	private String apiName;//methodName
	
	@NotNull
	private String auditCreatedUser;
	
	@NotNull
	private String auditCreatedAt;

	public Audit() {
	}

	/**
	 * @param auditId
	 * @param auditFeatureType
	 * @param documentName
	 * @param documentOperation
	 * @param apiName
	 * @param auditCreatedUser
	 * @param auditCreatedAt
	 */
	public Audit(@NotNull int auditId, @NotNull String auditFeatureType, @NotNull String documentName,
			@NotNull String documentOperation, @NotNull String apiName, @NotNull String auditCreatedUser,
			@NotNull String auditCreatedAt) {
		super();
		this.auditId = auditId;
		this.auditFeatureType = auditFeatureType;
		this.documentName = documentName;
		this.documentOperation = documentOperation;
		this.apiName = apiName;
		this.auditCreatedUser = auditCreatedUser;
		this.auditCreatedAt = auditCreatedAt;
	}

	/**
	 * @return the auditId
	 */
	public int getAuditId() {
		return auditId;
	}

	/**
	 * @param auditId the auditId to set
	 */
	public void setAuditId(int auditId) {
		this.auditId = auditId;
	}

	/**
	 * @return the auditFeatureType
	 */
	public String getAuditFeatureType() {
		return auditFeatureType;
	}

	/**
	 * @param auditFeatureType the auditFeatureType to set
	 */
	public void setAuditFeatureType(String auditFeatureType) {
		this.auditFeatureType = auditFeatureType;
	}

	/**
	 * @return the documentName
	 */
	public String getDocumentName() {
		return documentName;
	}

	/**
	 * @param documentName the documentName to set
	 */
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	/**
	 * @return the documentOperation
	 */
	public String getDocumentOperation() {
		return documentOperation;
	}

	/**
	 * @param documentOperation the documentOperation to set
	 */
	public void setDocumentOperation(String documentOperation) {
		this.documentOperation = documentOperation;
	}

	/**
	 * @return the apiName
	 */
	public String getApiName() {
		return apiName;
	}

	/**
	 * @param apiName the apiName to set
	 */
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	/**
	 * @return the auditCreatedUser
	 */
	public String getAuditCreatedUser() {
		return auditCreatedUser;
	}

	/**
	 * @param auditCreatedUser the auditCreatedUser to set
	 */
	public void setAuditCreatedUser(String auditCreatedUser) {
		this.auditCreatedUser = auditCreatedUser;
	}

	/**
	 * @return the auditCreatedAt
	 */
	public String getAuditCreatedAt() {
		return auditCreatedAt;
	}

	/**
	 * @param auditCreatedAt the auditCreatedAt to set
	 */
	public void setAuditCreatedAt(String auditCreatedAt) {
		this.auditCreatedAt = auditCreatedAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apiName == null) ? 0 : apiName.hashCode());
		result = prime * result + ((auditCreatedAt == null) ? 0 : auditCreatedAt.hashCode());
		result = prime * result + ((auditCreatedUser == null) ? 0 : auditCreatedUser.hashCode());
		result = prime * result + ((auditFeatureType == null) ? 0 : auditFeatureType.hashCode());
		result = prime * result + auditId;
		result = prime * result + ((documentName == null) ? 0 : documentName.hashCode());
		result = prime * result + ((documentOperation == null) ? 0 : documentOperation.hashCode());
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
		Audit other = (Audit) obj;
		if (apiName == null) {
			if (other.apiName != null)
				return false;
		} else if (!apiName.equals(other.apiName))
			return false;
		if (auditCreatedAt == null) {
			if (other.auditCreatedAt != null)
				return false;
		} else if (!auditCreatedAt.equals(other.auditCreatedAt))
			return false;
		if (auditCreatedUser == null) {
			if (other.auditCreatedUser != null)
				return false;
		} else if (!auditCreatedUser.equals(other.auditCreatedUser))
			return false;
		if (auditFeatureType == null) {
			if (other.auditFeatureType != null)
				return false;
		} else if (!auditFeatureType.equals(other.auditFeatureType))
			return false;
		if (auditId != other.auditId)
			return false;
		if (documentName == null) {
			if (other.documentName != null)
				return false;
		} else if (!documentName.equals(other.documentName))
			return false;
		if (documentOperation == null) {
			if (other.documentOperation != null)
				return false;
		} else if (!documentOperation.equals(other.documentOperation))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Audit [auditId=" + auditId + ", auditFeatureType=" + auditFeatureType + ", documentName=" + documentName
				+ ", documentOperation=" + documentOperation + ", apiName=" + apiName + ", auditCreatedUser="
				+ auditCreatedUser + ", auditCreatedAt=" + auditCreatedAt + "]";
	}

}