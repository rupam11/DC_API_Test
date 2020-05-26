package entity;

import javax.validation.constraints.NotNull;



public class FieldRuleId {
private static final long serialVersionUID = 1L;
	
	
	@NotNull
	private String ruleParentId;
	
	public FieldRuleId() {

	}

	/**
	 * @param ruleParentId
	 */
	public FieldRuleId(@NotNull String ruleParentId) {
		super();
		this.ruleParentId = ruleParentId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ruleParentId == null) ? 0 : ruleParentId.hashCode());
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
		FieldRuleId other = (FieldRuleId) obj;
		if (ruleParentId == null) {
			if (other.ruleParentId != null)
				return false;
		} else if (!ruleParentId.equals(other.ruleParentId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FieldRuleId [ruleParentId=" + ruleParentId + "]";
	}
}
