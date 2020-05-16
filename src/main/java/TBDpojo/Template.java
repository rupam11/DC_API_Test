package TBDpojo;

import java.io.Serializable;
import java.ArrayList;
import java.List;

import javax.validation.constraints.NotNull;



public class Template implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@NotNull
	private int templateId;
	
	
	@NotNull
	private String templateParentId;
	
	
	@NotNull
	private String templateName;
	
	
	@NotNull
	private int templateSequence;
	
	
	@NotNull
	private String templateIndustryName;
	
	
	@NotNull
	private String templateSectorName;
	
	
	@NotNull
	private String templateStatus;
	
	
	@NotNull
	private String templateVersion;
	
	
	
	@NotNull
	private String templateCreatedBy;
	
	
	@NotNull
	private String templateCreatedAt;
	
	
	@NotNull
	private String templateUpdatedBy;
	
	
	@NotNull
	private String templateUpdatedAt;
	
	
	
	@NotNull
	List<com.ibm.dc.rule.entity.Field> fields = new ArrayList<com.ibm.dc.rule.entity.Field>();
	
	
	@NotNull
	List<com.ibm.dc.rule.entity.Category> categories = new ArrayList<com.ibm.dc.rule.entity.Category>();
	
	
	@NotNull
	List<com.ibm.dc.rule.entity.Data> data = new ArrayList<com.ibm.dc.rule.entity.Data>();
		
	public Template() {

	}

	/**
	 * @param templateId
	 * @param templateParentId
	 * @param templateName
	 * @param templateSequence
	 * @param templateIndustryName
	 * @param templateSectorName
	 * @param templateStatus
	 * @param templateVersion
	 * @param templateCreatedBy
	 * @param templateCreatedAt
	 * @param templateUpdatedBy
	 * @param templateUpdatedAt
	 * @param fields
	 * @param categories
	 * @param data
	 */
	public Template(@NotNull int templateId, @NotNull String templateParentId, @NotNull String templateName,
			@NotNull int templateSequence, @NotNull String templateIndustryName, @NotNull String templateSectorName,
			@NotNull String templateStatus, @NotNull String templateVersion, @NotNull String templateCreatedBy,
			@NotNull String templateCreatedAt, @NotNull String templateUpdatedBy, @NotNull String templateUpdatedAt,
			@NotNull List<com.ibm.dc.rule.entity.Field> fields, @NotNull List<Category> categories,
			@NotNull List<Data> data) {
		super();
		this.templateId = templateId;
		this.templateParentId = templateParentId;
		this.templateName = templateName;
		this.templateSequence = templateSequence;
		this.templateIndustryName = templateIndustryName;
		this.templateSectorName = templateSectorName;
		this.templateStatus = templateStatus;
		this.templateVersion = templateVersion;
		this.templateCreatedBy = templateCreatedBy;
		this.templateCreatedAt = templateCreatedAt;
		this.templateUpdatedBy = templateUpdatedBy;
		this.templateUpdatedAt = templateUpdatedAt;
		this.fields = fields;
		this.categories = categories;
		this.data = data;
	}

	/**
	 * @return the templateId
	 */
	public int getTemplateId() {
		return templateId;
	}

	/**
	 * @param templateId the templateId to set
	 */
	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}

	/**
	 * @return the templateParentId
	 */
	public String getTemplateParentId() {
		return templateParentId;
	}

	/**
	 * @param templateParentId the templateParentId to set
	 */
	public void setTemplateParentId(String templateParentId) {
		this.templateParentId = templateParentId;
	}

	/**
	 * @return the templateName
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * @param templateName the templateName to set
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	/**
	 * @return the templateSequence
	 */
	public int getTemplateSequence() {
		return templateSequence;
	}

	/**
	 * @param templateSequence the templateSequence to set
	 */
	public void setTemplateSequence(int templateSequence) {
		this.templateSequence = templateSequence;
	}

	/**
	 * @return the templateIndustryName
	 */
	public String getTemplateIndustryName() {
		return templateIndustryName;
	}

	/**
	 * @param templateIndustryName the templateIndustryName to set
	 */
	public void setTemplateIndustryName(String templateIndustryName) {
		this.templateIndustryName = templateIndustryName;
	}

	/**
	 * @return the templateSectorName
	 */
	public String getTemplateSectorName() {
		return templateSectorName;
	}

	/**
	 * @param templateSectorName the templateSectorName to set
	 */
	public void setTemplateSectorName(String templateSectorName) {
		this.templateSectorName = templateSectorName;
	}

	/**
	 * @return the templateStatus
	 */
	public String getTemplateStatus() {
		return templateStatus;
	}

	/**
	 * @param templateStatus the templateStatus to set
	 */
	public void setTemplateStatus(String templateStatus) {
		this.templateStatus = templateStatus;
	}

	/**
	 * @return the templateVersion
	 */
	public String getTemplateVersion() {
		return templateVersion;
	}

	/**
	 * @param templateVersion the templateVersion to set
	 */
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

	/**
	 * @return the templateCreatedBy
	 */
	public String getTemplateCreatedBy() {
		return templateCreatedBy;
	}

	/**
	 * @param templateCreatedBy the templateCreatedBy to set
	 */
	public void setTemplateCreatedBy(String templateCreatedBy) {
		this.templateCreatedBy = templateCreatedBy;
	}

	/**
	 * @return the templateCreatedAt
	 */
	public String getTemplateCreatedAt() {
		return templateCreatedAt;
	}

	/**
	 * @param templateCreatedAt the templateCreatedAt to set
	 */
	public void setTemplateCreatedAt(String templateCreatedAt) {
		this.templateCreatedAt = templateCreatedAt;
	}

	/**
	 * @return the templateUpdatedBy
	 */
	public String getTemplateUpdatedBy() {
		return templateUpdatedBy;
	}

	/**
	 * @param templateUpdatedBy the templateUpdatedBy to set
	 */
	public void setTemplateUpdatedBy(String templateUpdatedBy) {
		this.templateUpdatedBy = templateUpdatedBy;
	}

	/**
	 * @return the templateUpdatedAt
	 */
	public String getTemplateUpdatedAt() {
		return templateUpdatedAt;
	}

	/**
	 * @param templateUpdatedAt the templateUpdatedAt to set
	 */
	public void setTemplateUpdatedAt(String templateUpdatedAt) {
		this.templateUpdatedAt = templateUpdatedAt;
	}

	/**
	 * @return the fields
	 */
	public List<com.ibm.dc.rule.entity.Field> getFields() {
		return fields;
	}

	/**
	 * @param fields the fields to set
	 */
	public void setFields(List<com.ibm.dc.rule.entity.Field> fields) {
		this.fields = fields;
	}

	/**
	 * @return the categories
	 */
	public List<com.ibm.dc.rule.entity.Category> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<com.ibm.dc.rule.entity.Category> categories) {
		this.categories = categories;
	}

	/**
	 * @return the data
	 */
	public List<com.ibm.dc.rule.entity.Data> getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<com.ibm.dc.rule.entity.Data> data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((fields == null) ? 0 : fields.hashCode());
		result = prime * result + ((templateCreatedAt == null) ? 0 : templateCreatedAt.hashCode());
		result = prime * result + ((templateCreatedBy == null) ? 0 : templateCreatedBy.hashCode());
		result = prime * result + templateId;
		result = prime * result + ((templateIndustryName == null) ? 0 : templateIndustryName.hashCode());
		result = prime * result + ((templateName == null) ? 0 : templateName.hashCode());
		result = prime * result + ((templateParentId == null) ? 0 : templateParentId.hashCode());
		result = prime * result + ((templateSectorName == null) ? 0 : templateSectorName.hashCode());
		result = prime * result + templateSequence;
		result = prime * result + ((templateStatus == null) ? 0 : templateStatus.hashCode());
		result = prime * result + ((templateUpdatedAt == null) ? 0 : templateUpdatedAt.hashCode());
		result = prime * result + ((templateUpdatedBy == null) ? 0 : templateUpdatedBy.hashCode());
		result = prime * result + ((templateVersion == null) ? 0 : templateVersion.hashCode());
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
		Template other = (Template) obj;
		if (categories == null) {
			if (other.categories != null)
				return false;
		} else if (!categories.equals(other.categories))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (fields == null) {
			if (other.fields != null)
				return false;
		} else if (!fields.equals(other.fields))
			return false;
		if (templateCreatedAt == null) {
			if (other.templateCreatedAt != null)
				return false;
		} else if (!templateCreatedAt.equals(other.templateCreatedAt))
			return false;
		if (templateCreatedBy == null) {
			if (other.templateCreatedBy != null)
				return false;
		} else if (!templateCreatedBy.equals(other.templateCreatedBy))
			return false;
		if (templateId != other.templateId)
			return false;
		if (templateIndustryName == null) {
			if (other.templateIndustryName != null)
				return false;
		} else if (!templateIndustryName.equals(other.templateIndustryName))
			return false;
		if (templateName == null) {
			if (other.templateName != null)
				return false;
		} else if (!templateName.equals(other.templateName))
			return false;
		if (templateParentId == null) {
			if (other.templateParentId != null)
				return false;
		} else if (!templateParentId.equals(other.templateParentId))
			return false;
		if (templateSectorName == null) {
			if (other.templateSectorName != null)
				return false;
		} else if (!templateSectorName.equals(other.templateSectorName))
			return false;
		if (templateSequence != other.templateSequence)
			return false;
		if (templateStatus == null) {
			if (other.templateStatus != null)
				return false;
		} else if (!templateStatus.equals(other.templateStatus))
			return false;
		if (templateUpdatedAt == null) {
			if (other.templateUpdatedAt != null)
				return false;
		} else if (!templateUpdatedAt.equals(other.templateUpdatedAt))
			return false;
		if (templateUpdatedBy == null) {
			if (other.templateUpdatedBy != null)
				return false;
		} else if (!templateUpdatedBy.equals(other.templateUpdatedBy))
			return false;
		if (templateVersion == null) {
			if (other.templateVersion != null)
				return false;
		} else if (!templateVersion.equals(other.templateVersion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Template [templateId=" + templateId + ", templateParentId=" + templateParentId + ", templateName="
				+ templateName + ", templateSequence=" + templateSequence + ", templateIndustryName="
				+ templateIndustryName + ", templateSectorName=" + templateSectorName + ", templateStatus="
				+ templateStatus + ", templateVersion=" + templateVersion + ", templateCreatedBy=" + templateCreatedBy
				+ ", templateCreatedAt=" + templateCreatedAt + ", templateUpdatedBy=" + templateUpdatedBy
				+ ", templateUpdatedAt=" + templateUpdatedAt + ", fields=" + fields + ", categories=" + categories
				+ ", data=" + data + "]";
	}
}