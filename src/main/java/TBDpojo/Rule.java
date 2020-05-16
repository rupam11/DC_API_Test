package TBDpojo;

import java.io.Serializable;

import org.springframework.lang.NonNull;



public class Rule implements Comparable<Rule> ,Serializable{
private static final long serialVersionUID = 1L;
	
	
	@NonNull
	private int ruleId;

	
	@NonNull
	private String ruleParentId;
	
	
	private int ruleNumber;
	
	
	private int ruleSequence;
	
	
	private String ruleFieldName;
	
	
	private String ruleFieldDefaultValue;
	
	
	private String ruleFieldFinalValue;
	
	
	@NonNull
	private String ruleStatus;
	
	
	private RuleConditionCheck ruleConditionCheck;
	
	public Rule() {

	}

	/**
	 * @param ruleId
	 * @param ruleParentId
	 * @param ruleNumber
	 * @param ruleSequence
	 * @param ruleFieldName
	 * @param ruleFieldDefaultValue
	 * @param ruleFieldFinalValue
	 * @param ruleStatus
	 * @param ruleConditionCheck
	 */
	public Rule(int ruleId, String ruleParentId, int ruleNumber, int ruleSequence, String ruleFieldName,
			String ruleFieldDefaultValue, String ruleFieldFinalValue, String ruleStatus,
			RuleConditionCheck ruleConditionCheck) {
		super();
		this.ruleId = ruleId;
		this.ruleParentId = ruleParentId;
		this.ruleNumber = ruleNumber;
		this.ruleSequence = ruleSequence;
		this.ruleFieldName = ruleFieldName;
		this.ruleFieldDefaultValue = ruleFieldDefaultValue;
		this.ruleFieldFinalValue = ruleFieldFinalValue;
		this.ruleStatus = ruleStatus;
		this.ruleConditionCheck = ruleConditionCheck;
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
	 * @return the ruleParentId
	 */
	public String getRuleParentId() {
		return ruleParentId;
	}

	/**
	 * @param ruleParentId the ruleParentId to set
	 */
	public void setRuleParentId(String ruleParentId) {
		this.ruleParentId = ruleParentId;
	}

	/**
	 * @return the ruleNumber
	 */
	public int getRuleNumber() {
		return ruleNumber;
	}

	/**
	 * @param ruleNumber the ruleNumber to set
	 */
	public void setRuleNumber(int ruleNumber) {
		this.ruleNumber = ruleNumber;
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
	 * @return the ruleFieldName
	 */
	public String getRuleFieldName() {
		return ruleFieldName;
	}

	/**
	 * @param ruleFieldName the ruleFieldName to set
	 */
	public void setRuleFieldName(String ruleFieldName) {
		this.ruleFieldName = ruleFieldName;
	}

	/**
	 * @return the ruleFieldDefaultValue
	 */
	public String getRuleFieldDefaultValue() {
		return ruleFieldDefaultValue;
	}

	/**
	 * @param ruleFieldDefaultValue the ruleFieldDefaultValue to set
	 */
	public void setRuleFieldDefaultValue(String ruleFieldDefaultValue) {
		this.ruleFieldDefaultValue = ruleFieldDefaultValue;
	}

	/**
	 * @return the ruleFieldFinalValue
	 */
	public String getRuleFieldFinalValue() {
		return ruleFieldFinalValue;
	}

	/**
	 * @param ruleFieldFinalValue the ruleFieldFinalValue to set
	 */
	public void setRuleFieldFinalValue(String ruleFieldFinalValue) {
		this.ruleFieldFinalValue = ruleFieldFinalValue;
	}

	/**
	 * @return the ruleStatus
	 */
	public String getRuleStatus() {
		return ruleStatus;
	}

	/**
	 * @param ruleStatus the ruleStatus to set
	 */
	public void setRuleStatus(String ruleStatus) {
		this.ruleStatus = ruleStatus;
	}

	/**
	 * @return the ruleConditionCheck
	 */
	public RuleConditionCheck getRuleConditionCheck() {
		return ruleConditionCheck;
	}

	/**
	 * @param ruleConditionCheck the ruleConditionCheck to set
	 */
	public void setRuleConditionCheck(RuleConditionCheck ruleConditionCheck) {
		this.ruleConditionCheck = ruleConditionCheck;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ruleConditionCheck == null) ? 0 : ruleConditionCheck.hashCode());
		result = prime * result + ((ruleFieldDefaultValue == null) ? 0 : ruleFieldDefaultValue.hashCode());
		result = prime * result + ((ruleFieldFinalValue == null) ? 0 : ruleFieldFinalValue.hashCode());
		result = prime * result + ((ruleFieldName == null) ? 0 : ruleFieldName.hashCode());
		result = prime * result + ruleId;
		result = prime * result + ruleNumber;
		result = prime * result + ((ruleParentId == null) ? 0 : ruleParentId.hashCode());
		result = prime * result + ruleSequence;
		result = prime * result + ((ruleStatus == null) ? 0 : ruleStatus.hashCode());
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
		Rule other = (Rule) obj;
		if (ruleConditionCheck == null) {
			if (other.ruleConditionCheck != null)
				return false;
		} else if (!ruleConditionCheck.equals(other.ruleConditionCheck))
			return false;
		if (ruleFieldDefaultValue == null) {
			if (other.ruleFieldDefaultValue != null)
				return false;
		} else if (!ruleFieldDefaultValue.equals(other.ruleFieldDefaultValue))
			return false;
		if (ruleFieldFinalValue == null) {
			if (other.ruleFieldFinalValue != null)
				return false;
		} else if (!ruleFieldFinalValue.equals(other.ruleFieldFinalValue))
			return false;
		if (ruleFieldName == null) {
			if (other.ruleFieldName != null)
				return false;
		} else if (!ruleFieldName.equals(other.ruleFieldName))
			return false;
		if (ruleId != other.ruleId)
			return false;
		if (ruleNumber != other.ruleNumber)
			return false;
		if (ruleParentId == null) {
			if (other.ruleParentId != null)
				return false;
		} else if (!ruleParentId.equals(other.ruleParentId))
			return false;
		if (ruleSequence != other.ruleSequence)
			return false;
		if (ruleStatus == null) {
			if (other.ruleStatus != null)
				return false;
		} else if (!ruleStatus.equals(other.ruleStatus))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rule [ruleId=" + ruleId + ", ruleParentId=" + ruleParentId + ", ruleNumber=" + ruleNumber
				+ ", ruleSequence=" + ruleSequence + ", ruleFieldName=" + ruleFieldName + ", ruleFieldDefaultValue="
				+ ruleFieldDefaultValue + ", ruleFieldFinalValue=" + ruleFieldFinalValue + ", ruleStatus=" + ruleStatus
				+ ", ruleConditionCheck=" + ruleConditionCheck + "]";
	}

	@Override
	public int compareTo(Rule o) {
		Integer intObj = new Integer(this.getRuleId());
		// TODO Auto-generated method stub
		return intObj.compareTo(o.getRuleId());
	}
}