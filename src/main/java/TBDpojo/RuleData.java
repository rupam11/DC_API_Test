package TBDpojo;

import java.io.Serializable;



public class RuleData  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int ruleDataId;
	
	private String ruleOperation;
	
	private String ruleSelectInputType;
	
	private String ruleField;
	
	private String ruleOperator;
	
	private String ruleFieldValueType;
	
	private String ruleValue;
	
	private String ruleJoinOperator;
	
	public RuleData() {
		
	}

	/**
	 * @param ruleDataId
	 * @param ruleOperation
	 * @param ruleSelectInputType
	 * @param ruleField
	 * @param ruleOperator
	 * @param ruleFieldValueType
	 * @param ruleValue
	 * @param ruleJoinOperator
	 */
	public RuleData(int ruleDataId, String ruleOperation, String ruleSelectInputType, String ruleField,
			String ruleOperator, String ruleFieldValueType, String ruleValue, String ruleJoinOperator) {
		super();
		this.ruleDataId = ruleDataId;
		this.ruleOperation = ruleOperation;
		this.ruleSelectInputType = ruleSelectInputType;
		this.ruleField = ruleField;
		this.ruleOperator = ruleOperator;
		this.ruleFieldValueType = ruleFieldValueType;
		this.ruleValue = ruleValue;
		this.ruleJoinOperator = ruleJoinOperator;
	}

	/**
	 * @return the ruleDataId
	 */
	public int getRuleDataId() {
		return ruleDataId;
	}

	/**
	 * @param ruleDataId the ruleDataId to set
	 */
	public void setRuleDataId(int ruleDataId) {
		this.ruleDataId = ruleDataId;
	}

	/**
	 * @return the ruleOperation
	 */
	public String getRuleOperation() {
		return ruleOperation;
	}

	/**
	 * @param ruleOperation the ruleOperation to set
	 */
	public void setRuleOperation(String ruleOperation) {
		this.ruleOperation = ruleOperation;
	}

	/**
	 * @return the ruleSelectInputType
	 */
	public String getRuleSelectInputType() {
		return ruleSelectInputType;
	}

	/**
	 * @param ruleSelectInputType the ruleSelectInputType to set
	 */
	public void setRuleSelectInputType(String ruleSelectInputType) {
		this.ruleSelectInputType = ruleSelectInputType;
	}

	/**
	 * @return the ruleField
	 */
	public String getRuleField() {
		return ruleField;
	}

	/**
	 * @param ruleField the ruleField to set
	 */
	public void setRuleField(String ruleField) {
		this.ruleField = ruleField;
	}

	/**
	 * @return the ruleOperator
	 */
	public String getRuleOperator() {
		return ruleOperator;
	}

	/**
	 * @param ruleOperator the ruleOperator to set
	 */
	public void setRuleOperator(String ruleOperator) {
		this.ruleOperator = ruleOperator;
	}

	/**
	 * @return the ruleFieldValueType
	 */
	public String getRuleFieldValueType() {
		return ruleFieldValueType;
	}

	/**
	 * @param ruleFieldValueType the ruleFieldValueType to set
	 */
	public void setRuleFieldValueType(String ruleFieldValueType) {
		this.ruleFieldValueType = ruleFieldValueType;
	}

	/**
	 * @return the ruleValue
	 */
	public String getRuleValue() {
		return ruleValue;
	}

	/**
	 * @param ruleValue the ruleValue to set
	 */
	public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue;
	}

	/**
	 * @return the ruleJoinOperator
	 */
	public String getRuleJoinOperator() {
		return ruleJoinOperator;
	}

	/**
	 * @param ruleJoinOperator the ruleJoinOperator to set
	 */
	public void setRuleJoinOperator(String ruleJoinOperator) {
		this.ruleJoinOperator = ruleJoinOperator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ruleDataId;
		result = prime * result + ((ruleField == null) ? 0 : ruleField.hashCode());
		result = prime * result + ((ruleFieldValueType == null) ? 0 : ruleFieldValueType.hashCode());
		result = prime * result + ((ruleJoinOperator == null) ? 0 : ruleJoinOperator.hashCode());
		result = prime * result + ((ruleOperation == null) ? 0 : ruleOperation.hashCode());
		result = prime * result + ((ruleOperator == null) ? 0 : ruleOperator.hashCode());
		result = prime * result + ((ruleSelectInputType == null) ? 0 : ruleSelectInputType.hashCode());
		result = prime * result + ((ruleValue == null) ? 0 : ruleValue.hashCode());
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
		RuleData other = (RuleData) obj;
		if (ruleDataId != other.ruleDataId)
			return false;
		if (ruleField == null) {
			if (other.ruleField != null)
				return false;
		} else if (!ruleField.equals(other.ruleField))
			return false;
		if (ruleFieldValueType == null) {
			if (other.ruleFieldValueType != null)
				return false;
		} else if (!ruleFieldValueType.equals(other.ruleFieldValueType))
			return false;
		if (ruleJoinOperator == null) {
			if (other.ruleJoinOperator != null)
				return false;
		} else if (!ruleJoinOperator.equals(other.ruleJoinOperator))
			return false;
		if (ruleOperation == null) {
			if (other.ruleOperation != null)
				return false;
		} else if (!ruleOperation.equals(other.ruleOperation))
			return false;
		if (ruleOperator == null) {
			if (other.ruleOperator != null)
				return false;
		} else if (!ruleOperator.equals(other.ruleOperator))
			return false;
		if (ruleSelectInputType == null) {
			if (other.ruleSelectInputType != null)
				return false;
		} else if (!ruleSelectInputType.equals(other.ruleSelectInputType))
			return false;
		if (ruleValue == null) {
			if (other.ruleValue != null)
				return false;
		} else if (!ruleValue.equals(other.ruleValue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RuleData [ruleDataId=" + ruleDataId + ", ruleOperation=" + ruleOperation + ", ruleSelectInputType="
				+ ruleSelectInputType + ", ruleField=" + ruleField + ", ruleOperator=" + ruleOperator
				+ ", ruleFieldValueType=" + ruleFieldValueType + ", ruleValue=" + ruleValue + ", ruleJoinOperator="
				+ ruleJoinOperator + "]";
	}
}