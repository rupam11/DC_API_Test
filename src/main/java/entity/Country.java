package entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Country {

private Integer countryId;
private String countryName;
private String countryStatus;
private String countryGeographyName;
private String countryCreatedBy;
private String countryCreatedAt;
private String countryUpdatedBy;
private String countryUpdatedAt;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public Country() {
}

/**
*
* @param countryGeographyName
* @param countryCreatedBy
* @param countryCreatedAt
* @param countryUpdatedBy
* @param countryName
* @param countryStatus
* @param countryId
* @param countryUpdatedAt
*/
public Country(Integer countryId, String countryName, String countryStatus, String countryGeographyName, String countryCreatedBy, String countryCreatedAt, String countryUpdatedBy, String countryUpdatedAt) {
super();
this.countryId = countryId;
this.countryName = countryName;
this.countryStatus = countryStatus;
this.countryGeographyName = countryGeographyName;
this.countryCreatedBy = countryCreatedBy;
this.countryCreatedAt = countryCreatedAt;
this.countryUpdatedBy = countryUpdatedBy;
this.countryUpdatedAt = countryUpdatedAt;
}

public Integer getCountryId() {
return countryId;
}

public void setCountryId(Integer countryId) {
this.countryId = countryId;
}

public String getCountryName() {
return countryName;
}

public void setCountryName(String countryName) {
this.countryName = countryName;
}

public String getCountryStatus() {
return countryStatus;
}

public void setCountryStatus(String countryStatus) {
this.countryStatus = countryStatus;
}

public String getCountryGeographyName() {
return countryGeographyName;
}

public void setCountryGeographyName(String countryGeographyName) {
this.countryGeographyName = countryGeographyName;
}

public String getCountryCreatedBy() {
return countryCreatedBy;
}

public void setCountryCreatedBy(String countryCreatedBy) {
this.countryCreatedBy = countryCreatedBy;
}

public String getCountryCreatedAt() {
return countryCreatedAt;
}

public void setCountryCreatedAt(String countryCreatedAt) {
this.countryCreatedAt = countryCreatedAt;
}

public String getCountryUpdatedBy() {
return countryUpdatedBy;
}

public void setCountryUpdatedBy(String countryUpdatedBy) {
this.countryUpdatedBy = countryUpdatedBy;
}

public String getCountryUpdatedAt() {
return countryUpdatedAt;
}

public void setCountryUpdatedAt(String countryUpdatedAt) {
this.countryUpdatedAt = countryUpdatedAt;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
return new ToStringBuilder(this).append("countryId", countryId).append("countryName", countryName).append("countryStatus", countryStatus).append("countryGeographyName", countryGeographyName).append("countryCreatedBy", countryCreatedBy).append("countryCreatedAt", countryCreatedAt).append("countryUpdatedBy", countryUpdatedBy).append("countryUpdatedAt", countryUpdatedAt).append("additionalProperties", additionalProperties).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(countryGeographyName).append(countryCreatedBy).append(countryCreatedAt).append(countryUpdatedBy).append(countryName).append(countryStatus).append(additionalProperties).append(countryId).append(countryUpdatedAt).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Country) == false) {
return false;
}
Country rhs = ((Country) other);
return new EqualsBuilder().append(countryGeographyName, rhs.countryGeographyName).append(countryCreatedBy, rhs.countryCreatedBy).append(countryCreatedAt, rhs.countryCreatedAt).append(countryUpdatedBy, rhs.countryUpdatedBy).append(countryName, rhs.countryName).append(countryStatus, rhs.countryStatus).append(additionalProperties, rhs.additionalProperties).append(countryId, rhs.countryId).append(countryUpdatedAt, rhs.countryUpdatedAt).isEquals();
}

}