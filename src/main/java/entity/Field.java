package entity;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

public class Field implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@NotNull
	private int fieldId;
	
	
	@NotNull
	private String fieldParentId;
	
	
	@NotNull
	private String fieldVersion;
	
	
	@NotNull
	private int fieldDisplaySequence;
	
	
	@NotNull
	private String fieldType;
	
	
	@NotNull
	private List<Options> fieldOptions;
	
	
	@NotNull
	private String fieldValue;
	
	
	@NotNull
	private List<FieldRuleId> fieldRuleIds;
	
	
	@NotNull
	private String fieldName;
	
	
	@NotNull
	private String fieldGuidance;
	
	
	@NotNull
	private String fieldConstraints;
	
	
	@NotNull
	private String fieldCategory;
	
	
	@NotNull
	private String fieldTemplateName;
	
	
	@NotNull
	private String fieldQuestion;
	
	
	@NotNull
	private String fieldIndustry;
	
	
	@NotNull
	private String fieldSector;
		
	
	@NotNull
	private String fieldComment;
		
	
	@NotNull
	private String fieldValueSource;
		
	
	@NotNull
	private String fieldValueSourceComment;
		
	
	@NotNull
	private int fieldUsability;
		
	
	@NotNull
	private String fieldStatus;
	
	
	@NotNull
	private String fieldCreatedBy;
	
	
	@NotNull
	private String fieldUpdatedBy;
	
	
	@NotNull
	private String fieldCreatedAt;
	
	
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fieldCategory == null) ? 0 : fieldCategory.hashCode());
		result = prime * result + ((fieldComment == null) ? 0 : fieldComment.hashCode());
		result = prime * result + ((fieldConstraints == null) ? 0 : fieldConstraints.hashCode());
		result = prime * result + ((fieldCreatedAt == null) ? 0 : fieldCreatedAt.hashCode());
		result = prime * result + ((fieldCreatedBy == null) ? 0 : fieldCreatedBy.hashCode());
		result = prime * result + fieldDisplaySequence;
		result = prime * result + ((fieldGuidance == null) ? 0 : fieldGuidance.hashCode());
		result = prime * result + fieldId;
		result = prime * result + ((fieldIndustry == null) ? 0 : fieldIndustry.hashCode());
		result = prime * result + ((fieldName == null) ? 0 : fieldName.hashCode());
		result = prime * result + ((fieldOptions == null) ? 0 : fieldOptions.hashCode());
		result = prime * result + ((fieldParentId == null) ? 0 : fieldParentId.hashCode());
		result = prime * result + ((fieldQuestion == null) ? 0 : fieldQuestion.hashCode());
		result = prime * result + ((fieldRuleIds == null) ? 0 : fieldRuleIds.hashCode());
		result = prime * result + ((fieldSector == null) ? 0 : fieldSector.hashCode());
		result = prime * result + ((fieldStatus == null) ? 0 : fieldStatus.hashCode());
		result = prime * result + ((fieldTemplateName == null) ? 0 : fieldTemplateName.hashCode());
		result = prime * result + ((fieldType == null) ? 0 : fieldType.hashCode());
		result = prime * result + ((fieldUpdatedAt == null) ? 0 : fieldUpdatedAt.hashCode());
		result = prime * result + ((fieldUpdatedBy == null) ? 0 : fieldUpdatedBy.hashCode());
		result = prime * result + fieldUsability;
		result = prime * result + ((fieldValue == null) ? 0 : fieldValue.hashCode());
		result = prime * result + ((fieldValueSource == null) ? 0 : fieldValueSource.hashCode());
		result = prime * result + ((fieldValueSourceComment == null) ? 0 : fieldValueSourceComment.hashCode());
		result = prime * result + ((fieldVersion == null) ? 0 : fieldVersion.hashCode());
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
		Field other = (Field) obj;
		if (fieldCategory == null) {
			if (other.fieldCategory != null)
				return false;
		} else if (!fieldCategory.equals(other.fieldCategory))
			return false;
		if (fieldComment == null) {
			if (other.fieldComment != null)
				return false;
		} else if (!fieldComment.equals(other.fieldComment))
			return false;
		if (fieldConstraints == null) {
			if (other.fieldConstraints != null)
				return false;
		} else if (!fieldConstraints.equals(other.fieldConstraints))
			return false;
		if (fieldCreatedAt == null) {
			if (other.fieldCreatedAt != null)
				return false;
		} else if (!fieldCreatedAt.equals(other.fieldCreatedAt))
			return false;
		if (fieldCreatedBy == null) {
			if (other.fieldCreatedBy != null)
				return false;
		} else if (!fieldCreatedBy.equals(other.fieldCreatedBy))
			return false;
		if (fieldDisplaySequence != other.fieldDisplaySequence)
			return false;
		if (fieldGuidance == null) {
			if (other.fieldGuidance != null)
				return false;
		} else if (!fieldGuidance.equals(other.fieldGuidance))
			return false;
		if (fieldId != other.fieldId)
			return false;
		if (fieldIndustry == null) {
			if (other.fieldIndustry != null)
				return false;
		} else if (!fieldIndustry.equals(other.fieldIndustry))
			return false;
		if (fieldName == null) {
			if (other.fieldName != null)
				return false;
		} else if (!fieldName.equals(other.fieldName))
			return false;
		if (fieldOptions == null) {
			if (other.fieldOptions != null)
				return false;
		} else if (!fieldOptions.equals(other.fieldOptions))
			return false;
		if (fieldParentId == null) {
			if (other.fieldParentId != null)
				return false;
		} else if (!fieldParentId.equals(other.fieldParentId))
			return false;
		if (fieldQuestion == null) {
			if (other.fieldQuestion != null)
				return false;
		} else if (!fieldQuestion.equals(other.fieldQuestion))
			return false;
		if (fieldRuleIds == null) {
			if (other.fieldRuleIds != null)
				return false;
		} else if (!fieldRuleIds.equals(other.fieldRuleIds))
			return false;
		if (fieldSector == null) {
			if (other.fieldSector != null)
				return false;
		} else if (!fieldSector.equals(other.fieldSector))
			return false;
		if (fieldStatus == null) {
			if (other.fieldStatus != null)
				return false;
		} else if (!fieldStatus.equals(other.fieldStatus))
			return false;
		if (fieldTemplateName == null) {
			if (other.fieldTemplateName != null)
				return false;
		} else if (!fieldTemplateName.equals(other.fieldTemplateName))
			return false;
		if (fieldType == null) {
			if (other.fieldType != null)
				return false;
		} else if (!fieldType.equals(other.fieldType))
			return false;
		if (fieldUpdatedAt == null) {
			if (other.fieldUpdatedAt != null)
				return false;
		} else if (!fieldUpdatedAt.equals(other.fieldUpdatedAt))
			return false;
		if (fieldUpdatedBy == null) {
			if (other.fieldUpdatedBy != null)
				return false;
		} else if (!fieldUpdatedBy.equals(other.fieldUpdatedBy))
			return false;
		if (fieldUsability != other.fieldUsability)
			return false;
		if (fieldValue == null) {
			if (other.fieldValue != null)
				return false;
		} else if (!fieldValue.equals(other.fieldValue))
			return false;
		if (fieldValueSource == null) {
			if (other.fieldValueSource != null)
				return false;
		} else if (!fieldValueSource.equals(other.fieldValueSource))
			return false;
		if (fieldValueSourceComment == null) {
			if (other.fieldValueSourceComment != null)
				return false;
		} else if (!fieldValueSourceComment.equals(other.fieldValueSourceComment))
			return false;
		if (fieldVersion == null) {
			if (other.fieldVersion != null)
				return false;
		} else if (!fieldVersion.equals(other.fieldVersion))
			return false;
		return true;
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