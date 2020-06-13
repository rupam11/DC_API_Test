package entity;

import java.util.LinkedHashMap;

public class RuleOperationEntity {
	
	LinkedHashMap<Integer, String> ruleFlags;
	LinkedHashMap<Integer, String> ruleFlagMultiCheck;
	LinkedHashMap<Integer, String> ruleArithMaticMultiCheck;
	LinkedHashMap<Integer, String> ruleFlagFinalCheck ;
	LinkedHashMap<Integer, String> ruleArithMaticFinalCheck;
	LinkedHashMap<Integer, String> ruleArithMaticMultiFinalCheck ;
	LinkedHashMap<Integer, LinkedHashMap<String, String>> weightageValueMap;;
	LinkedHashMap<Integer, LinkedHashMap<String, String>> weightageMultiCheckValueMap;
	LinkedHashMap<Integer, LinkedHashMap<Integer, LinkedHashMap<String, String>>> weightageMultiCheckFinalValueMap;
	LinkedHashMap<String, String> weightageValue;
	
	public LinkedHashMap<Integer, String> getRuleFlags() {
		return ruleFlags;
	}
	public void setRuleFlags(LinkedHashMap<Integer, String> ruleFlags) {
		this.ruleFlags = ruleFlags;
	}
	public LinkedHashMap<Integer, String> getRuleFlagMultiCheck() {
		return ruleFlagMultiCheck;
	}
	public void setRuleFlagMultiCheck(LinkedHashMap<Integer, String> ruleFlagMultiCheck) {
		this.ruleFlagMultiCheck = ruleFlagMultiCheck;
	}
	public LinkedHashMap<Integer, String> getRuleArithMaticMultiCheck() {
		return ruleArithMaticMultiCheck;
	}
	public void setRuleArithMaticMultiCheck(LinkedHashMap<Integer, String> ruleArithMaticMultiCheck) {
		this.ruleArithMaticMultiCheck = ruleArithMaticMultiCheck;
	}
	public LinkedHashMap<Integer, String> getRuleFlagFinalCheck() {
		return ruleFlagFinalCheck;
	}
	public void setRuleFlagFinalCheck(LinkedHashMap<Integer, String> ruleFlagFinalCheck) {
		this.ruleFlagFinalCheck = ruleFlagFinalCheck;
	}
	public LinkedHashMap<Integer, String> getRuleArithMaticFinalCheck() {
		return ruleArithMaticFinalCheck;
	}
	public void setRuleArithMaticFinalCheck(LinkedHashMap<Integer, String> ruleArithMaticFinalCheck) {
		this.ruleArithMaticFinalCheck = ruleArithMaticFinalCheck;
	}
	public LinkedHashMap<Integer, String> getRuleArithMaticMultiFinalCheck() {
		return ruleArithMaticMultiFinalCheck;
	}
	public void setRuleArithMaticMultiFinalCheck(LinkedHashMap<Integer, String> ruleArithMaticMultiFinalCheck) {
		this.ruleArithMaticMultiFinalCheck = ruleArithMaticMultiFinalCheck;
	}
	public LinkedHashMap<Integer, LinkedHashMap<String, String>> getWeightageValueMap() {
		return weightageValueMap;
	}
	public void setWeightageValueMap(LinkedHashMap<Integer, LinkedHashMap<String, String>> weightageValueMap) {
		this.weightageValueMap = weightageValueMap;
	}
	public LinkedHashMap<Integer, LinkedHashMap<String, String>> getWeightageMultiCheckValueMap() {
		return weightageMultiCheckValueMap;
	}
	public void setWeightageMultiCheckValueMap(
			LinkedHashMap<Integer, LinkedHashMap<String, String>> weightageMultiCheckValueMap) {
		this.weightageMultiCheckValueMap = weightageMultiCheckValueMap;
	}
	public LinkedHashMap<Integer, LinkedHashMap<Integer, LinkedHashMap<String, String>>> getWeightageMultiCheckFinalValueMap() {
		return weightageMultiCheckFinalValueMap;
	}
	public void setWeightageMultiCheckFinalValueMap(
			LinkedHashMap<Integer, LinkedHashMap<Integer, LinkedHashMap<String, String>>> weightageMultiCheckFinalValueMap) {
		this.weightageMultiCheckFinalValueMap = weightageMultiCheckFinalValueMap;
	}
	public LinkedHashMap<String, String> getWeightageValue() {
		return weightageValue;
	}
	public void setWeightageValue(LinkedHashMap<String, String> weightageValue) {
		this.weightageValue = weightageValue;
	}

}
