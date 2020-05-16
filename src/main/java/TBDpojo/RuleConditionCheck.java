package TBDpojo;
import java.io.Serializable;
import java.List;


public class RuleConditionCheck implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private RuleSingleCheck ruleSingleCheck;
	
	private String ruleBlockJoinOperator;
	
	private List<RuleMultiCheck> ruleMultiCheck;
	
	public RuleConditionCheck() {
		
	}
	public RuleConditionCheck(RuleSingleCheck ruleSingleCheck, String ruleBlockJoinOperator,
			List<RuleMultiCheck> ruleMultiCheck) {
		super();
		this.ruleSingleCheck = ruleSingleCheck;
		this.ruleBlockJoinOperator = ruleBlockJoinOperator;
		this.ruleMultiCheck = ruleMultiCheck;
	}
	/**
	 * @return the ruleSingleCheck
	 */
	public RuleSingleCheck getRuleSingleCheck() {
		return ruleSingleCheck;
	}
	/**
	 * @param ruleSingleCheck the ruleSingleCheck to set
	 */
	public void setRuleSingleCheck(RuleSingleCheck ruleSingleCheck) {
		this.ruleSingleCheck = ruleSingleCheck;
	}
	/**
	 * @return the ruleBlockJoinOperator
	 */
	public String getRuleBlockJoinOperator() {
		return ruleBlockJoinOperator;
	}
	/**
	 * @param ruleBlockJoinOperator the ruleBlockJoinOperator to set
	 */
	public void setRuleBlockJoinOperator(String ruleBlockJoinOperator) {
		this.ruleBlockJoinOperator = ruleBlockJoinOperator;
	}
	/**
	 * @return the ruleMultiCheck
	 */
	public List<RuleMultiCheck> getRuleMultiCheck() {
		return ruleMultiCheck;
	}
	/**
	 * @param ruleMultiCheck the ruleMultiCheck to set
	 */
	public void setRuleMultiCheck(List<RuleMultiCheck> ruleMultiCheck) {
		this.ruleMultiCheck = ruleMultiCheck;
	}
	
	public void addRuleMultiCheck(com.ibm.dc.rule.entity.RuleMultiCheck ruleMultiCheck) {
		this.ruleMultiCheck.add(ruleMultiCheck);
	}
	
	@Override
	public String toString() {
		return "RuleConditionCheck [ruleSingleCheck=" + ruleSingleCheck + ", ruleBlockJoinOperator="
				+ ruleBlockJoinOperator + ", ruleMultiCheck=" + ruleMultiCheck + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ruleBlockJoinOperator == null) ? 0 : ruleBlockJoinOperator.hashCode());
		result = prime * result + ((ruleMultiCheck == null) ? 0 : ruleMultiCheck.hashCode());
		result = prime * result + ((ruleSingleCheck == null) ? 0 : ruleSingleCheck.hashCode());
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
		RuleConditionCheck other = (RuleConditionCheck) obj;
		if (ruleBlockJoinOperator == null) {
			if (other.ruleBlockJoinOperator != null)
				return false;
		} else if (!ruleBlockJoinOperator.equals(other.ruleBlockJoinOperator))
			return false;
		if (ruleMultiCheck == null) {
			if (other.ruleMultiCheck != null)
				return false;
		} else if (!ruleMultiCheck.equals(other.ruleMultiCheck))
			return false;
		if (ruleSingleCheck == null) {
			if (other.ruleSingleCheck != null)
				return false;
		} else if (!ruleSingleCheck.equals(other.ruleSingleCheck))
			return false;
		return true;
	}
	
	
}
