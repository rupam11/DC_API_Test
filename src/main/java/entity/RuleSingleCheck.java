package entity;

import java.io.Serializable;
import java.util.List;

public class RuleSingleCheck implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private List<RuleData> ruleData;
	
	
	private String ruleDataFunctionType;

	public RuleSingleCheck() {

	}
	
	/**
	 * @param ruleData
	 */
	public RuleSingleCheck(List<RuleData> ruleData) {
		super();
		this.ruleData = ruleData;
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

	public String getRuleDataFunctionType() {
		return ruleDataFunctionType;
	}

	public void setRuleDataFunctionType(String ruleDataFunctionType) {
		this.ruleDataFunctionType = ruleDataFunctionType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ruleData == null) ? 0 : ruleData.hashCode());
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
		RuleSingleCheck other = (RuleSingleCheck) obj;
		if (ruleData == null) {
			if (other.ruleData != null)
				return false;
		} else if (!ruleData.equals(other.ruleData))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RuleSingleCheck [ruleData=" + ruleData + "]";
	}

	public void addRuleData(entity.RuleData ruleData) {
		this.ruleData.add(ruleData);
	}
}
