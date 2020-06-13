package entity;

import java.io.Serializable;

import org.springframework.lang.NonNull;

public class RuleText  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@NonNull
	private int ruleId;

	private int ruleSequence;

	private String ruleText;

	public RuleText() {
	}

	/**
	 * @param ruleId
	 * @param ruleSequence
	 * @param ruleText
	 */
	public RuleText(int ruleId, int ruleSequence, String ruleText) {
		super();
		this.ruleId = ruleId;
		this.ruleSequence = ruleSequence;
		this.ruleText = ruleText;
	}

	/**
	 * @return the ruleId
	 */
	public int getRuleId() {
		return ruleId;
	}

	/**
	 * @param ruleId the ruleId to set
	 */
	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	/**
	 * @return the ruleSequence
	 */
	public int getRuleSequence() {
		return ruleSequence;
	}

	/**
	 * @param ruleSequence the ruleSequence to set
	 */
	public void setRuleSequence(int ruleSequence) {
		this.ruleSequence = ruleSequence;
	}

	/**
	 * @return the ruleText
	 */
	public String getRuleText() {
		return ruleText;
	}

	/**
	 * @param ruleText the ruleText to set
	 */
	public void setRuleText(String ruleText) {
		this.ruleText = ruleText;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ruleId;
		result = prime * result + ruleSequence;
		result = prime * result + ((ruleText == null) ? 0 : ruleText.hashCode());
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
		RuleText other = (RuleText) obj;
		if (ruleId != other.ruleId)
			return false;
		if (ruleSequence != other.ruleSequence)
			return false;
		if (ruleText == null) {
			if (other.ruleText != null)
				return false;
		} else if (!ruleText.equals(other.ruleText))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RuleText [ruleId=" + ruleId + ", ruleSequence=" + ruleSequence + ", ruleText=" + ruleText + "]";
	}
}