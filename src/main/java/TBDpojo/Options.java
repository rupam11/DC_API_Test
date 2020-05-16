package TBDpojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;




public class Options implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	@NotNull
	private int optionId;
	
	
	@NotNull
	private String optionLabel;
	
	
	@NotNull
	private String optionValue;
	
	
	@NotNull
	private String optionVersion;
	
	
	@NotNull
	private boolean optionDisplayFlag;
	
	public Options() {
		
	}

	/**
	 * @param optionId
	 * @param optionLabel
	 * @param optionValue
	 * @param optionVersion
	 * @param optionDisplayFlag
	 */
	public Options(@NotNull int optionId, @NotNull String optionLabel, @NotNull String optionValue,
			@NotNull String optionVersion, @NotNull boolean optionDisplayFlag) {
		super();
		this.optionId = optionId;
		this.optionLabel = optionLabel;
		this.optionValue = optionValue;
		this.optionVersion = optionVersion;
		this.optionDisplayFlag = optionDisplayFlag;
	}

	/**
	 * @return the optionId
	 */
	public int getOptionId() {
		return optionId;
	}

	/**
	 * @param optionId the optionId to set
	 */
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	/**
	 * @return the optionLabel
	 */
	public String getOptionLabel() {
		return optionLabel;
	}

	/**
	 * @param optionLabel the optionLabel to set
	 */
	public void setOptionLabel(String optionLabel) {
		this.optionLabel = optionLabel;
	}

	/**
	 * @return the optionValue
	 */
	public String getOptionValue() {
		return optionValue;
	}

	/**
	 * @param optionValue the optionValue to set
	 */
	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	/**
	 * @return the optionVersion
	 */
	public String getOptionVersion() {
		return optionVersion;
	}

	/**
	 * @param optionVersion the optionVersion to set
	 */
	public void setOptionVersion(String optionVersion) {
		this.optionVersion = optionVersion;
	}

	/**
	 * @return the optionDisplayFlag
	 */
	public boolean isOptionDisplayFlag() {
		return optionDisplayFlag;
	}

	/**
	 * @param optionDisplayFlag the optionDisplayFlag to set
	 */
	public void setOptionDisplayFlag(boolean optionDisplayFlag) {
		this.optionDisplayFlag = optionDisplayFlag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (optionDisplayFlag ? 1231 : 1237);
		result = prime * result + optionId;
		result = prime * result + ((optionLabel == null) ? 0 : optionLabel.hashCode());
		result = prime * result + ((optionValue == null) ? 0 : optionValue.hashCode());
		result = prime * result + ((optionVersion == null) ? 0 : optionVersion.hashCode());
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
		Options other = (Options) obj;
		if (optionDisplayFlag != other.optionDisplayFlag)
			return false;
		if (optionId != other.optionId)
			return false;
		if (optionLabel == null) {
			if (other.optionLabel != null)
				return false;
		} else if (!optionLabel.equals(other.optionLabel))
			return false;
		if (optionValue == null) {
			if (other.optionValue != null)
				return false;
		} else if (!optionValue.equals(other.optionValue))
			return false;
		if (optionVersion == null) {
			if (other.optionVersion != null)
				return false;
		} else if (!optionVersion.equals(other.optionVersion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Options [optionId=" + optionId + ", optionLabel=" + optionLabel + ", optionValue=" + optionValue
				+ ", optionVersion=" + optionVersion + ", optionDisplayFlag=" + optionDisplayFlag + "]";
	}
}
