package TBDpojo;

import java.io.Serializable;
import java.List;



public class RuleMultiCheck implements Serializable{
	private static final long serialVersionUID = 1L;

	
	private int ruleMultiCheckId;
	
	private List<RuleData> ruleData;
	
	private String ruleMultiCheckJoinOperator;

	public RuleMultiCheck() {

	}

	/**
	 * @param ruleMultiCheckId
	 * @param ruleData
	 * @param ruleMultiCheckJoinOperator
	 */
	public RuleMultiCheck(int ruleMultiCheckId, List<RuleData> ruleData, String ruleMultiCheckJoinOperator) {
		super();
		this.ruleMultiCheckId = ruleMultiCheckId;
		this.ruleData = ruleData;
		this.ruleMultiCheckJoinOperator = ruleMultiCheckJoinOperator;
	}

	/**
	 * @return the ruleMultiCheckId
	 */
	public int getRuleMultiCheckId() {
		return ruleMultiCheckId;
	}

	/**
	 * @param ruleMultiCheckId the ruleMultiCheckId to set
	 */
	public void setRuleMultiCheckId(int ruleMultiCheckId) {
		this.ruleMultiCheckId = ruleMultiCheckId;
	}

	/**
	 * @return the ruleData
	 */
	public List<RuleData> getRuleData() {
		return ruleData;
	}

	/**
	 * @param ruleData the ruleData to set
	 */
	public void setRuleData(List<RuleData> ruleData) {
		this.ruleData = ruleData;
	}

	/**
	 * @return the ruleMultiCheckJoinOperator
	 */
	public String getRuleMultiCheckJoinOperator() {
		return ruleMultiCheckJoinOperator;
	}

	/**
	 * @param ruleMultiCheckJoinOperator the ruleMultiCheckJoinOperator to set
	 */
	public void setRuleMultiCheckJoinOperator(String ruleMultiCheckJoinOperator) {
		this.ruleMultiCheckJoinOperator = ruleMultiCheckJoinOperator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ruleData == null) ? 0 : ruleData.hashCode());
		result = prime * result + ruleMultiCheckId;
		result = prime * result + ((ruleMultiCheckJoinOperator == null) ? 0 : ruleMultiCheckJoinOperator.hashCode());
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
		RuleMultiCheck other = (RuleMultiCheck) obj;
		if (ruleData == null) {
			if (other.ruleData != null)
				return false;
		} else if (!ruleData.equals(other.ruleData))
			return false;
		if (ruleMultiCheckId != other.ruleMultiCheckId)
			return false;
		if (ruleMultiCheckJoinOperator == null) {
			if (other.ruleMultiCheckJoinOperator != null)
				return false;
		} else if (!ruleMultiCheckJoinOperator.equals(other.ruleMultiCheckJoinOperator))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RuleMultiCheck [ruleMultiCheckId=" + ruleMultiCheckId + ", ruleData=" + ruleData
				+ ", ruleMultiCheckJoinOperator=" + ruleMultiCheckJoinOperator + "]";
	}
}