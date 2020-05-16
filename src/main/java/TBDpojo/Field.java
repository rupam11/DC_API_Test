package TBDpojo;

import java.io.Serializable;
import java.List;

import javax.validation.constraints.NotNull;


public class Field implements Serializable {
	private static final long serialVersionUID = 1L;

	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private int fieldId;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldParentId;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldVersion;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private int fieldDisplaySequence;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldType;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private List<Options> fieldOptions;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldValue;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private List<FieldRuleId> fieldRuleIds;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldName;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldGuidance;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldConstraints;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldCategory;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldTemplateName;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldQuestion;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldIndustry;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldSector;
		
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldComment;
		
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldValueSource;
		
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldValueSourceComment;
		
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private int fieldUsability;
		
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldStatus;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldCreatedBy;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldUpdatedBy;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldCreatedAt;
	
	@com.couchbase.client.java.repository.annotation.Field
	@NotNull
	private String fieldUpdatedAt;
	
	public Field() {
		
	}

	/**
	 * @param fieldId
	 * @param fieldParentId
	 * @param fieldVersion
	 * @param fieldDisplaySequence
	 * @param fieldType
	 * @param fieldOptions
	 * @param fieldValue
	 * @param fieldRuleIds
	 * @param fieldName
	 * @param fieldGuidance
	 * @param fieldConstraints
	 * @param fieldCategory
	 * @param fieldTemplateName
	 * @param fieldQuestion
	 * @param fieldIndustry
	 * @param fieldSector
	 * @param fieldComment
	 * @param fieldValueSource
	 * @param fieldValueSourceComment
	 * @param fieldUsability
	 * @param fieldStatus
	 * @param fieldCreatedBy
	 * @param fieldUpdatedBy
	 * @param fieldCreatedAt
	 * @param fieldUpdatedAt
	 */
	public Field(@NotNull int fieldId, @NotNull String fieldParentId, @NotNull String fieldVersion,
			@NotNull int fieldDisplaySequence, @NotNull String fieldType, @NotNull List<Options> fieldOptions,
			@NotNull String fieldValue, @NotNull List<FieldRuleId> fieldRuleIds, @NotNull String fieldName,
			@NotNull String fieldGuidance, @NotNull String fieldConstraints, @NotNull String fieldCategory,
			@NotNull String fieldTemplateName, @NotNull String fieldQuestion, @NotNull String fieldIndustry,
			@NotNull String fieldSector, @NotNull String fieldComment, @NotNull String fieldValueSource,
			@NotNull String fieldValueSourceComment, @NotNull int fieldUsability, @NotNull String fieldStatus,
			@NotNull String fieldCreatedBy, @NotNull String fieldUpdatedBy, @NotNull String fieldCreatedAt,
			@NotNull String fieldUpdatedAt) {
		super();
		this.fieldId = fieldId;
		this.fieldParentId = fieldParentId;
		this.fieldVersion = fieldVersion;
		this.fieldDisplaySequence = fieldDisplaySequence;
		this.fieldType = fieldType;
		this.fieldOptions = fieldOptions;
		this.fieldValue = fieldValue;
		this.fieldRuleIds = fieldRuleIds;
		this.fieldName = fieldName;
		this.fieldGuidance = fieldGuidance;
		this.fieldConstraints = fieldConstraints;
		this.fieldCategory = fieldCategory;
		this.fieldTemplateName = fieldTemplateName;
		this.fieldQuestion = fieldQuestion;
		this.fieldIndustry = fieldIndustry;
		this.fieldSector = fieldSector;
		this.fieldComment = fieldComment;
		this.fieldValueSource = fieldValueSource;
		this.fieldValueSourceComment = fieldValueSourceComment;
		this.fieldUsability = fieldUsability;
		this.fieldStatus = fieldStatus;
		this.fieldCreatedBy = fieldCreatedBy;
		this.fieldUpdatedBy = fieldUpdatedBy;
		this.fieldCreatedAt = fieldCreatedAt;
		this.fieldUpdatedAt = fieldUpdatedAt;
	}

	/**
	 * @return the fieldId
	 */
	public int getFieldId() {
		return fieldId;
	}

	/**
	 * @param fieldId the fieldId to set
	 */
	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	/**
	 * @return the fieldParentId
	 */
	public String getFieldParentId() {
		return fieldParentId;
	}

	/**
	 * @param fieldParentId the fieldParentId to set
	 */
	public void setFieldParentId(String fieldParentId) {
		this.fieldParentId = fieldParentId;
	}

	/**
	 * @return the fieldVersion
	 */
	public String getFieldVersion() {
		return fieldVersion;
	}

	/**
	 * @param fieldVersion the fieldVersion to set
	 */
	public void setFieldVersion(String fieldVersion) {
		this.fieldVersion = fieldVersion;
	}

	/**
	 * @return the fieldDisplaySequence
	 */
	public int getFieldDisplaySequence() {
		return fieldDisplaySequence;
	}

	/**
	 * @param fieldDisplaySequence the fieldDisplaySequence to set
	 */
	public void setFieldDisplaySequence(int fieldDisplaySequence) {
		this.fieldDisplaySequence = fieldDisplaySequence;
	}

	/**
	 * @return the fieldType
	 */
	public String getFieldType() {
		return fieldType;
	}

	/**
	 * @param fieldType the fieldType to set
	 */
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	/**
	 * @return the fieldOptions
	 */
	public List<Options> getFieldOptions() {
		return fieldOptions;
	}

	/**
	 * @param fieldOptions the fieldOptions to set
	 */
	public void setFieldOptions(List<Options> fieldOptions) {
		this.fieldOptions = fieldOptions;
	}

	/**
	 * @return the fieldValue
	 */
	public String getFieldValue() {
		return fieldValue;
	}

	/**
	 * @param fieldValue the fieldValue to set
	 */
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	/**
	 * @return the fieldRuleIds
	 */
	public List<FieldRuleId> getFieldRuleIds() {
		return fieldRuleIds;
	}

	/**
	 * @param fieldRuleIds the fieldRuleIds to set
	 */
	public void setFieldRuleIds(List<FieldRuleId> fieldRuleIds) {
		this.fieldRuleIds = fieldRuleIds;
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * @return the fieldGuidance
	 */
	public String getFieldGuidance() {
		return fieldGuidance;
	}

	/**
	 * @param fieldGuidance the fieldGuidance to set
	 */
	public void setFieldGuidance(String fieldGuidance) {
		this.fieldGuidance = fieldGuidance;
	}

	/**
	 * @return the fieldConstraints
	 */
	public String getFieldConstraints() {
		return fieldConstraints;
	}

	/**
	 * @param fieldConstraints the fieldConstraints to set
	 */
	public void setFieldConstraints(String fieldConstraints) {
		this.fieldConstraints = fieldConstraints;
	}

	/**
	 * @return the fieldCategory
	 */
	public String getFieldCategory() {
		return fieldCategory;
	}

	/**
	 * @param fieldCategory the fieldCategory to set
	 */
	public void setFieldCategory(String fieldCategory) {
		this.fieldCategory = fieldCategory;
	}

	/**
	 * @return the fieldTemplateName
	 */
	public String getFieldTemplateName() {
		return fieldTemplateName;
	}

	/**
	 * @param fieldTemplateName the fieldTemplateName to set
	 */
	public void setFieldTemplateName(String fieldTemplateName) {
		this.fieldTemplateName = fieldTemplateName;
	}

	/**
	 * @return the fieldQuestion
	 */
	public String getFieldQuestion() {
		return fieldQuestion;
	}

	/**
	 * @param fieldQuestion the fieldQuestion to set
	 */
	public void setFieldQuestion(String fieldQuestion) {
		this.fieldQuestion = fieldQuestion;
	}

	/**
	 * @return the fieldIndustry
	 */
	public String getFieldIndustry() {
		return fieldIndustry;
	}

	/**
	 * @param fieldIndustry the fieldIndustry to set
	 */
	public void setFieldIndustry(String fieldIndustry) {
		this.fieldIndustry = fieldIndustry;
	}

	/**
	 * @return the fieldSector
	 */
	public String getFieldSector() {
		return fieldSector;
	}

	/**
	 * @param fieldSector the fieldSector to set
	 */
	public void setFieldSector(String fieldSector) {
		this.fieldSector = fieldSector;
	}

	/**
	 * @return the fieldComment
	 */
	public String getFieldComment() {
		return fieldComment;
	}

	/**
	 * @param fieldComment the fieldComment to set
	 */
	public void setFieldComment(String fieldComment) {
		this.fieldComment = fieldComment;
	}

	/**
	 * @return the fieldValueSource
	 */
	public String getFieldValueSource() {
		return fieldValueSource;
	}

	/**
	 * @param fieldValueSource the fieldValueSource to set
	 */
	public void setFieldValueSource(String fieldValueSource) {
		this.fieldValueSource = fieldValueSource;
	}

	/**
	 * @return the fieldValueSourceComment
	 */
	public String getFieldValueSourceComment() {
		return fieldValueSourceComment;
	}

	/**
	 * @param fieldValueSourceComment the fieldValueSourceComment to set
	 */
	public void setFieldValueSourceComment(String fieldValueSourceComment) {
		this.fieldValueSourceComment = fieldValueSourceComment;
	}

	/**
	 * @return the fieldUsability
	 */
	public int getFieldUsability() {
		return fieldUsability;
	}

	/**
	 * @param fieldUsability the fieldUsability to set
	 */
	public void setFieldUsability(int fieldUsability) {
		this.fieldUsability = fieldUsability;
	}

	/**
	 * @return the fieldStatus
	 */
	public String getFieldStatus() {
		return fieldStatus;
	}

	/**
	 * @param fieldStatus the fieldStatus to set
	 */
	public void setFieldStatus(String fieldStatus) {
		this.fieldStatus = fieldStatus;
	}

	/**
	 * @return the fieldCreatedBy
	 */
	public String getFieldCreatedBy() {
		return fieldCreatedBy;
	}

	/**
	 * @param fieldCreatedBy the fieldCreatedBy to set
	 */
	public void setFieldCreatedBy(String fieldCreatedBy) {
		this.fieldCreatedBy = fieldCreatedBy;
	}

	/**
	 * @return the fieldUpdatedBy
	 */
	public String getFieldUpdatedBy() {
		return fieldUpdatedBy;
	}

	/**
	 * @param fieldUpdatedBy the fieldUpdatedBy to set
	 */
	public void setFieldUpdatedBy(String fieldUpdatedBy) {
		this.fieldUpdatedBy = fieldUpdatedBy;
	}

	/**
	 * @return the fieldCreatedAt
	 */
	public String getFieldCreatedAt() {
		return fieldCreatedAt;
	}

	/**
	 * @param fieldCreatedAt the fieldCreatedAt to set
	 */
	public void setFieldCreatedAt(String fieldCreatedAt) {
		this.fieldCreatedAt = fieldCreatedAt;
	}

	/**
	 * @return the fieldUpdatedAt
	 */
	public String getFieldUpdatedAt() {
		return fieldUpdatedAt;
	}

	/**
	 * @param fieldUpdatedAt the fieldUpdatedAt to set
	 */
	public void setFieldUpdatedAt(String fieldUpdatedAt) {
		this.fieldUpdatedAt = fieldUpdatedAt;
	}

	@Override
	public String toString() {
		return "Field [fieldId=" + fieldId + ", fieldParentId=" + fieldParentId + ", fieldVersion=" + fieldVersion
				+ ", fieldDisplaySequence=" + fieldDisplaySequence + ", fieldType=" + fieldType + ", fieldOptions="
				+ fieldOptions + ", fieldValue=" + fieldValue + ", fieldRuleIds=" + fieldRuleIds + ", fieldName="
				+ fieldName + ", fieldGuidance=" + fieldGuidance + ", fieldConstraints=" + fieldConstraints
				+ ", fieldCategory=" + fieldCategory + ", fieldTemplateName=" + fieldTemplateName + ", fieldQuestion="
				+ fieldQuestion + ", fieldIndustry=" + fieldIndustry + ", fieldSector=" + fieldSector
				+ ", fieldComment=" + fieldComment + ", fieldValueSource=" + fieldValueSource
				+ ", fieldValueSourceComment=" + fieldValueSourceComment + ", fieldUsability=" + fieldUsability
				+ ", fieldStatus=" + fieldStatus + ", fieldCreatedBy=" + fieldCreatedBy + ", fieldUpdatedBy="
				+ fieldUpdatedBy + ", fieldCreatedAt=" + fieldCreatedAt + ", fieldUpdatedAt=" + fieldUpdatedAt + "]";
	}

}