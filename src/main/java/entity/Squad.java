package entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Squad {

private Integer squadId;
private String squadCode;
private String squadName;
private String squadStatus;
private String squadCreatedBy;
private String squadCreatedAt;
private String squadUpdatedBy;
private String squadUpdatedAt;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public Squad() {
}

/**
*
* @param squadName
* @param squadCode
* @param squadUpdatedAt
* @param squadCreatedBy
* @param squadId
* @param squadUpdatedBy
* @param squadStatus
* @param squadCreatedAt
*/
public Squad(Integer squadId, String squadCode, String squadName, String squadStatus, String squadCreatedBy, String squadCreatedAt, String squadUpdatedBy, String squadUpdatedAt) {
super();
this.squadId = squadId;
this.squadCode = squadCode;
this.squadName = squadName;
this.squadStatus = squadStatus;
this.squadCreatedBy = squadCreatedBy;
this.squadCreatedAt = squadCreatedAt;
this.squadUpdatedBy = squadUpdatedBy;
this.squadUpdatedAt = squadUpdatedAt;
}

public Integer getSquadId() {
return squadId;
}

public void setSquadId(Integer squadId) {
this.squadId = squadId;
}

public String getSquadCode() {
return squadCode;
}

public void setSquadCode(String squadCode) {
this.squadCode = squadCode;
}

public String getSquadName() {
return squadName;
}

public void setSquadName(String squadName) {
this.squadName = squadName;
}

public String getSquadStatus() {
return squadStatus;
}

public void setSquadStatus(String squadStatus) {
this.squadStatus = squadStatus;
}

public String getSquadCreatedBy() {
return squadCreatedBy;
}

public void setSquadCreatedBy(String squadCreatedBy) {
this.squadCreatedBy = squadCreatedBy;
}

public String getSquadCreatedAt() {
return squadCreatedAt;
}

public void setSquadCreatedAt(String squadCreatedAt) {
this.squadCreatedAt = squadCreatedAt;
}

public String getSquadUpdatedBy() {
return squadUpdatedBy;
}

public void setSquadUpdatedBy(String squadUpdatedBy) {
this.squadUpdatedBy = squadUpdatedBy;
}

public String getSquadUpdatedAt() {
return squadUpdatedAt;
}

public void setSquadUpdatedAt(String squadUpdatedAt) {
this.squadUpdatedAt = squadUpdatedAt;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
return new ToStringBuilder(this).append("squadId", squadId).append("squadCode", squadCode).append("squadName", squadName).append("squadStatus", squadStatus).append("squadCreatedBy", squadCreatedBy).append("squadCreatedAt", squadCreatedAt).append("squadUpdatedBy", squadUpdatedBy).append("squadUpdatedAt", squadUpdatedAt).append("additionalProperties", additionalProperties).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(squadName).append(squadCode).append(squadUpdatedAt).append(squadCreatedBy).append(squadId).append(squadUpdatedBy).append(additionalProperties).append(squadStatus).append(squadCreatedAt).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Squad) == false) {
return false;
}
Squad rhs = ((Squad) other);
return new EqualsBuilder().append(squadName, rhs.squadName).append(squadCode, rhs.squadCode).append(squadUpdatedAt, rhs.squadUpdatedAt).append(squadCreatedBy, rhs.squadCreatedBy).append(squadId, rhs.squadId).append(squadUpdatedBy, rhs.squadUpdatedBy).append(additionalProperties, rhs.additionalProperties).append(squadStatus, rhs.squadStatus).append(squadCreatedAt, rhs.squadCreatedAt).isEquals();
}

}