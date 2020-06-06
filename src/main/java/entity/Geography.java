package entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Geography {

private Integer geographyId;
private String geographyName;
private String geographyStatus;
private String geographyCreatedBy;
private String geographyCreatedAt;
private String geographyUpdatedBy;
private String geographyUpdatedAt;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public Geography() {
}

/**
*
* @param geographyStatus
* @param geographyUpdatedAt
* @param geographyCreatedAt
* @param geographyUpdatedBy
* @param geographyName
* @param geographyCreatedBy
* @param geographyId
*/
public Geography(Integer geographyId, String geographyName, String geographyStatus, String geographyCreatedBy, String geographyCreatedAt, String geographyUpdatedBy, String geographyUpdatedAt) {
super();
this.geographyId = geographyId;
this.geographyName = geographyName;
this.geographyStatus = geographyStatus;
this.geographyCreatedBy = geographyCreatedBy;
this.geographyCreatedAt = geographyCreatedAt;
this.geographyUpdatedBy = geographyUpdatedBy;
this.geographyUpdatedAt = geographyUpdatedAt;
}

public Integer getGeographyId() {
return geographyId;
}

public void setGeographyId(Integer geographyId) {
this.geographyId = geographyId;
}

public String getGeographyName() {
return geographyName;
}

public void setGeographyName(String geographyName) {
this.geographyName = geographyName;
}

public String getGeographyStatus() {
return geographyStatus;
}

public void setGeographyStatus(String geographyStatus) {
this.geographyStatus = geographyStatus;
}

public String getGeographyCreatedBy() {
return geographyCreatedBy;
}

public void setGeographyCreatedBy(String geographyCreatedBy) {
this.geographyCreatedBy = geographyCreatedBy;
}

public String getGeographyCreatedAt() {
return geographyCreatedAt;
}

public void setGeographyCreatedAt(String geographyCreatedAt) {
this.geographyCreatedAt = geographyCreatedAt;
}

public String getGeographyUpdatedBy() {
return geographyUpdatedBy;
}

public void setGeographyUpdatedBy(String geographyUpdatedBy) {
this.geographyUpdatedBy = geographyUpdatedBy;
}

public String getGeographyUpdatedAt() {
return geographyUpdatedAt;
}

public void setGeographyUpdatedAt(String geographyUpdatedAt) {
this.geographyUpdatedAt = geographyUpdatedAt;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
return new ToStringBuilder(this).append("geographyId", geographyId).append("geographyName", geographyName).append("geographyStatus", geographyStatus).append("geographyCreatedBy", geographyCreatedBy).append("geographyCreatedAt", geographyCreatedAt).append("geographyUpdatedBy", geographyUpdatedBy).append("geographyUpdatedAt", geographyUpdatedAt).append("additionalProperties", additionalProperties).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(geographyStatus).append(geographyUpdatedAt).append(geographyCreatedAt).append(geographyUpdatedBy).append(geographyName).append(geographyCreatedBy).append(additionalProperties).append(geographyId).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Geography) == false) {
return false;
}
Geography rhs = ((Geography) other);
return new EqualsBuilder().append(geographyStatus, rhs.geographyStatus).append(geographyUpdatedAt, rhs.geographyUpdatedAt).append(geographyCreatedAt, rhs.geographyCreatedAt).append(geographyUpdatedBy, rhs.geographyUpdatedBy).append(geographyName, rhs.geographyName).append(geographyCreatedBy, rhs.geographyCreatedBy).append(additionalProperties, rhs.additionalProperties).append(geographyId, rhs.geographyId).isEquals();
}

}