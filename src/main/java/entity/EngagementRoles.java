package entity;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class EngagementRoles implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@NotNull
	private int roleId;

	
	@NotNull
	private String roleDescription;//

	
	@NotNull
	private boolean isPresentAlways;//

	
	@NotNull
	private int numberOfFTE;//

	
	@NotNull
	private String phase;// Intake/Design & Build

	
	@NotNull
	private String squadType;// Governance/Discovery/Intake/Design & build

	
	@NotNull
	private boolean isCICSquad;

	
	@NotNull
	private String band;

	
	@NotNull
	private double hourlyRate;

	
	@NotNull
	private double hoursWorked;

	
	@NotNull
	private double percentageFTEUtilization;

	
	@NotNull
	private String status;

	
	@NotNull
	private String geography;

	
	@NotNull
	private String toolsCreatedBy;

	
	@NotNull
	private String toolsCreatedAt;

	
	@NotNull
	private String toolsUpdatedBy;

	
	@NotNull
	private String toolsUpdatedAt;

	public EngagementRoles() {

	}

	/**
	 * @param roleId
	 * @param roleDescription
	 * @param isPresentAlways
	 * @param numberOfFTE
	 * @param phase
	 * @param squadType
	 * @param isCICSquad
	 * @param band
	 * @param hourlyRate
	 * @param hoursWorked
	 * @param percentageFTEUtilization
	 * @param status
	 * @param geography
	 * @param toolsCreatedBy
	 * @param toolsCreatedAt
	 * @param toolsUpdatedBy
	 * @param toolsUpdatedAt
	 */
	public EngagementRoles(@NotNull int roleId, @NotNull String roleDescription, @NotNull boolean isPresentAlways,
			@NotNull int numberOfFTE, @NotNull String phase, @NotNull String squadType, @NotNull boolean isCICSquad,
			@NotNull String band, @NotNull double hourlyRate, @NotNull double hoursWorked,
			@NotNull double percentageFTEUtilization, @NotNull String status, @NotNull String geography,
			@NotNull String toolsCreatedBy, @NotNull String toolsCreatedAt, @NotNull String toolsUpdatedBy,
			@NotNull String toolsUpdatedAt) {
		super();
		this.roleId = roleId;
		this.roleDescription = roleDescription;
		this.isPresentAlways = isPresentAlways;
		this.numberOfFTE = numberOfFTE;
		this.phase = phase;
		this.squadType = squadType;
		this.isCICSquad = isCICSquad;
		this.band = band;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.percentageFTEUtilization = percentageFTEUtilization;
		this.status = status;
		this.geography = geography;
		this.toolsCreatedBy = toolsCreatedBy;
		this.toolsCreatedAt = toolsCreatedAt;
		this.toolsUpdatedBy = toolsUpdatedBy;
		this.toolsUpdatedAt = toolsUpdatedAt;
	}

	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the roleDescription
	 */
	public String getRoleDescription() {
		return roleDescription;
	}

	/**
	 * @param roleDescription the roleDescription to set
	 */
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	/**
	 * @return the isPresentAlways
	 */
	public boolean isPresentAlways() {
		return isPresentAlways;
	}

	/**
	 * @param isPresentAlways the isPresentAlways to set
	 */
	public void setPresentAlways(boolean isPresentAlways) {
		this.isPresentAlways = isPresentAlways;
	}

	/**
	 * @return the numberOfFTE
	 */
	public int getNumberOfFTE() {
		return numberOfFTE;
	}

	/**
	 * @param numberOfFTE the numberOfFTE to set
	 */
	public void setNumberOfFTE(int numberOfFTE) {
		this.numberOfFTE = numberOfFTE;
	}

	/**
	 * @return the phase
	 */
	public String getPhase() {
		return phase;
	}

	/**
	 * @param phase the phase to set
	 */
	public void setPhase(String phase) {
		this.phase = phase;
	}

	/**
	 * @return the squadType
	 */
	public String getSquadType() {
		return squadType;
	}

	/**
	 * @param squadType the squadType to set
	 */
	public void setSquadType(String squadType) {
		this.squadType = squadType;
	}

	/**
	 * @return the isCICSquad
	 */
	public boolean isCICSquad() {
		return isCICSquad;
	}

	/**
	 * @param isCICSquad the isCICSquad to set
	 */
	public void setCICSquad(boolean isCICSquad) {
		this.isCICSquad = isCICSquad;
	}

	/**
	 * @return the band
	 */
	public String getBand() {
		return band;
	}

	/**
	 * @param band the band to set
	 */
	public void setBand(String band) {
		this.band = band;
	}

	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	/**
	 * @return the hoursWorked
	 */
	public double getHoursWorked() {
		return hoursWorked;
	}

	/**
	 * @param hoursWorked the hoursWorked to set
	 */
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	/**
	 * @return the percentageFTEUtilization
	 */
	public double getPercentageFTEUtilization() {
		return percentageFTEUtilization;
	}

	/**
	 * @param percentageFTEUtilization the percentageFTEUtilization to set
	 */
	public void setPercentageFTEUtilization(double percentageFTEUtilization) {
		this.percentageFTEUtilization = percentageFTEUtilization;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the geography
	 */
	public String getGeography() {
		return geography;
	}

	/**
	 * @param geography the geography to set
	 */
	public void setGeography(String geography) {
		this.geography = geography;
	}

	/**
	 * @return the toolsCreatedBy
	 */
	public String getToolsCreatedBy() {
		return toolsCreatedBy;
	}

	/**
	 * @param toolsCreatedBy the toolsCreatedBy to set
	 */
	public void setToolsCreatedBy(String toolsCreatedBy) {
		this.toolsCreatedBy = toolsCreatedBy;
	}

	/**
	 * @return the toolsCreatedAt
	 */
	public String getToolsCreatedAt() {
		return toolsCreatedAt;
	}

	/**
	 * @param toolsCreatedAt the toolsCreatedAt to set
	 */
	public void setToolsCreatedAt(String toolsCreatedAt) {
		this.toolsCreatedAt = toolsCreatedAt;
	}

	/**
	 * @return the toolsUpdatedBy
	 */
	public String getToolsUpdatedBy() {
		return toolsUpdatedBy;
	}

	/**
	 * @param toolsUpdatedBy the toolsUpdatedBy to set
	 */
	public void setToolsUpdatedBy(String toolsUpdatedBy) {
		this.toolsUpdatedBy = toolsUpdatedBy;
	}

	/**
	 * @return the toolsUpdatedAt
	 */
	public String getToolsUpdatedAt() {
		return toolsUpdatedAt;
	}

	/**
	 * @param toolsUpdatedAt the toolsUpdatedAt to set
	 */
	public void setToolsUpdatedAt(String toolsUpdatedAt) {
		this.toolsUpdatedAt = toolsUpdatedAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((band == null) ? 0 : band.hashCode());
		result = prime * result + ((geography == null) ? 0 : geography.hashCode());
		long temp;
		temp = Double.doubleToLongBits(hourlyRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(hoursWorked);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isCICSquad ? 1231 : 1237);
		result = prime * result + (isPresentAlways ? 1231 : 1237);
		result = prime * result + numberOfFTE;
		temp = Double.doubleToLongBits(percentageFTEUtilization);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((phase == null) ? 0 : phase.hashCode());
		result = prime * result + ((roleDescription == null) ? 0 : roleDescription.hashCode());
		result = prime * result + roleId;
		result = prime * result + ((squadType == null) ? 0 : squadType.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((toolsCreatedAt == null) ? 0 : toolsCreatedAt.hashCode());
		result = prime * result + ((toolsCreatedBy == null) ? 0 : toolsCreatedBy.hashCode());
		result = prime * result + ((toolsUpdatedAt == null) ? 0 : toolsUpdatedAt.hashCode());
		result = prime * result + ((toolsUpdatedBy == null) ? 0 : toolsUpdatedBy.hashCode());
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
		EngagementRoles other = (EngagementRoles) obj;
		if (band == null) {
			if (other.band != null)
				return false;
		} else if (!band.equals(other.band))
			return false;
		if (geography == null) {
			if (other.geography != null)
				return false;
		} else if (!geography.equals(other.geography))
			return false;
		if (Double.doubleToLongBits(hourlyRate) != Double.doubleToLongBits(other.hourlyRate))
			return false;
		if (Double.doubleToLongBits(hoursWorked) != Double.doubleToLongBits(other.hoursWorked))
			return false;
		if (isCICSquad != other.isCICSquad)
			return false;
		if (isPresentAlways != other.isPresentAlways)
			return false;
		if (numberOfFTE != other.numberOfFTE)
			return false;
		if (Double.doubleToLongBits(percentageFTEUtilization) != Double
				.doubleToLongBits(other.percentageFTEUtilization))
			return false;
		if (phase == null) {
			if (other.phase != null)
				return false;
		} else if (!phase.equals(other.phase))
			return false;
		if (roleDescription == null) {
			if (other.roleDescription != null)
				return false;
		} else if (!roleDescription.equals(other.roleDescription))
			return false;
		if (roleId != other.roleId)
			return false;
		if (squadType == null) {
			if (other.squadType != null)
				return false;
		} else if (!squadType.equals(other.squadType))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (toolsCreatedAt == null) {
			if (other.toolsCreatedAt != null)
				return false;
		} else if (!toolsCreatedAt.equals(other.toolsCreatedAt))
			return false;
		if (toolsCreatedBy == null) {
			if (other.toolsCreatedBy != null)
				return false;
		} else if (!toolsCreatedBy.equals(other.toolsCreatedBy))
			return false;
		if (toolsUpdatedAt == null) {
			if (other.toolsUpdatedAt != null)
				return false;
		} else if (!toolsUpdatedAt.equals(other.toolsUpdatedAt))
			return false;
		if (toolsUpdatedBy == null) {
			if (other.toolsUpdatedBy != null)
				return false;
		} else if (!toolsUpdatedBy.equals(other.toolsUpdatedBy))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EngagementRoles [roleId=" + roleId + ", roleDescription=" + roleDescription + ", isPresentAlways="
				+ isPresentAlways + ", numberOfFTE=" + numberOfFTE + ", phase=" + phase + ", squadType=" + squadType
				+ ", isCICSquad=" + isCICSquad + ", band=" + band + ", hourlyRate=" + hourlyRate + ", hoursWorked="
				+ hoursWorked + ", percentageFTEUtilization=" + percentageFTEUtilization + ", status=" + status
				+ ", geography=" + geography + ", toolsCreatedBy=" + toolsCreatedBy + ", toolsCreatedAt="
				+ toolsCreatedAt + ", toolsUpdatedBy=" + toolsUpdatedBy + ", toolsUpdatedAt=" + toolsUpdatedAt + "]";
	}

}