package entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Cic {

private Integer cicId;
private String cicName;
private String cicStatus;
private String cicCreatedBy;
private String cicCreatedAt;
private String cicUpdatedBy;
private String cicUpdatedAt;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public Cic() {
}

/**
*
* @param cicCreatedBy
* @param cicStatus
* @param cicName
* @param cicUpdatedAt
* @param cicId
* @param cicCreatedAt
* @param cicUpdatedBy
*/
public Cic(Integer cicId, String cicName, String cicStatus, String cicCreatedBy, String cicCreatedAt, String cicUpdatedBy, String cicUpdatedAt) {
super();
this.cicId = cicId;
this.cicName = cicName;
this.cicStatus = cicStatus;
this.cicCreatedBy = cicCreatedBy;
this.cicCreatedAt = cicCreatedAt;
this.cicUpdatedBy = cicUpdatedBy;
this.cicUpdatedAt = cicUpdatedAt;
}

public Integer getCicId() {
return cicId;
}

public void setCicId(Integer cicId) {
this.cicId = cicId;
}

public String getCicName() {
return cicName;
}

public void setCicName(String cicName) {
this.cicName = cicName;
}

public String getCicStatus() {
return cicStatus;
}

public void setCicStatus(String cicStatus) {
this.cicStatus = cicStatus;
}

public String getCicCreatedBy() {
return cicCreatedBy;
}

public void setCicCreatedBy(String cicCreatedBy) {
this.cicCreatedBy = cicCreatedBy;
}

public String getCicCreatedAt() {
return cicCreatedAt;
}

public void setCicCreatedAt(String cicCreatedAt) {
this.cicCreatedAt = cicCreatedAt;
}

public String getCicUpdatedBy() {
return cicUpdatedBy;
}

public void setCicUpdatedBy(String cicUpdatedBy) {
this.cicUpdatedBy = cicUpdatedBy;
}

public String getCicUpdatedAt() {
return cicUpdatedAt;
}

public void setCicUpdatedAt(String cicUpdatedAt) {
this.cicUpdatedAt = cicUpdatedAt;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
return new ToStringBuilder(this).append("cicId", cicId).append("cicName", cicName).append("cicStatus", cicStatus).append("cicCreatedBy", cicCreatedBy).append("cicCreatedAt", cicCreatedAt).append("cicUpdatedBy", cicUpdatedBy).append("cicUpdatedAt", cicUpdatedAt).append("additionalProperties", additionalProperties).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(cicCreatedBy).append(cicStatus).append(cicName).append(cicUpdatedAt).append(additionalProperties).append(cicId).append(cicCreatedAt).append(cicUpdatedBy).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Cic) == false) {
return false;
}
Cic rhs = ((Cic) other);
return new EqualsBuilder().append(cicCreatedBy, rhs.cicCreatedBy).append(cicStatus, rhs.cicStatus).append(cicName, rhs.cicName).append(cicUpdatedAt, rhs.cicUpdatedAt).append(additionalProperties, rhs.additionalProperties).append(cicId, rhs.cicId).append(cicCreatedAt, rhs.cicCreatedAt).append(cicUpdatedBy, rhs.cicUpdatedBy).isEquals();
}

}