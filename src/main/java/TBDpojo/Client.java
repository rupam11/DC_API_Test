package TBDpojo;

import java.io.Serializable;
import java.ArrayList;
import java.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.couchbase.core.mapping.id.IdAttribute;
import org.springframework.lang.NonNull;




public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@IdAttribute(order = 0)
	@NonNull
	private int clientId;
	
	
	@NonNull
	private String clientName;
	
	
	@NonNull
	private String clientGeography;
	
	
	@NonNull
	private String clientIndustry;
	
	
	@NonNull
	private String clientSector;
	
	
	@NonNull
	private String clientOnboardingDate;
	
	
	@NonNull
	private String clientOffBoardingdate;
	
    
    @NonNull
	private String clientStatus;
    
    
    @NonNull
    
	private String clientHappinessIndex;//happy /moderate/highly-----defalut value Not Known
    
    @NonNull
    
	private String clientEngagementHealth;//green/amber/red/Dark Grey------default - dark Grey
    
    @NonNull
    
	private String clientEngagementState;//not started-ongoing-compoleted-------Default Not Started
    
    
	@NotNull
	private List<Integer> projectIds= new ArrayList<Integer>();
    
    
   	@NotNull
	private String clientOnboardedBy;
    
    
    @NonNull
	private String clientOnboardedAt;
    
    
	private String clientOffboardedBy;
    
    
	private String clientOffboardedAt;
    
    
	@NotNull
	private List<ClientUser> users= new ArrayList<ClientUser>();

	public Client() {

	}

	/**
	 * @param clientId
	 * @param clientName
	 * @param clientGeography
	 * @param clientIndustry
	 * @param clientSector
	 * @param clientOnboardingDate
	 * @param clientOffBoardingdate
	 * @param clientStatus
	 * @param clientHappinessIndex
	 * @param clientEngagementHealth
	 * @param clientEngagementState
	 * @param projectIds
	 * @param clientOnboardedBy
	 * @param clientOnboardedAt
	 * @param clientOffboardedBy
	 * @param clientOffboardedAt
	 * @param users
	 */
	public Client(int clientId, String clientName, String clientGeography, String clientIndustry, String clientSector,
			String clientOnboardingDate, String clientOffBoardingdate, String clientStatus, String clientHappinessIndex,
			String clientEngagementHealth, String clientEngagementState, @NotNull List<Integer> projectIds,
			@NotNull String clientOnboardedBy, String clientOnboardedAt, String clientOffboardedBy,
			String clientOffboardedAt, @NotNull List<ClientUser> users) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientGeography = clientGeography;
		this.clientIndustry = clientIndustry;
		this.clientSector = clientSector;
		this.clientOnboardingDate = clientOnboardingDate;
		this.clientOffBoardingdate = clientOffBoardingdate;
		this.clientStatus = clientStatus;
		this.clientHappinessIndex = clientHappinessIndex;
		this.clientEngagementHealth = clientEngagementHealth;
		this.clientEngagementState = clientEngagementState;
		this.projectIds = projectIds;
		this.clientOnboardedBy = clientOnboardedBy;
		this.clientOnboardedAt = clientOnboardedAt;
		this.clientOffboardedBy = clientOffboardedBy;
		this.clientOffboardedAt = clientOffboardedAt;
		this.users = users;
	}

	/**
	 * @return the clientId
	 */
	public int getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the clientGeography
	 */
	public String getClientGeography() {
		return clientGeography;
	}

	/**
	 * @param clientGeography the clientGeography to set
	 */
	public void setClientGeography(String clientGeography) {
		this.clientGeography = clientGeography;
	}

	/**
	 * @return the clientIndustry
	 */
	public String getClientIndustry() {
		return clientIndustry;
	}

	/**
	 * @param clientIndustry the clientIndustry to set
	 */
	public void setClientIndustry(String clientIndustry) {
		this.clientIndustry = clientIndustry;
	}

	/**
	 * @return the clientSector
	 */
	public String getClientSector() {
		return clientSector;
	}

	/**
	 * @param clientSector the clientSector to set
	 */
	public void setClientSector(String clientSector) {
		this.clientSector = clientSector;
	}

	/**
	 * @return the clientOnboardingDate
	 */
	public String getClientOnboardingDate() {
		return clientOnboardingDate;
	}

	/**
	 * @param clientOnboardingDate the clientOnboardingDate to set
	 */
	public void setClientOnboardingDate(String clientOnboardingDate) {
		this.clientOnboardingDate = clientOnboardingDate;
	}

	/**
	 * @return the clientOffBoardingdate
	 */
	public String getClientOffBoardingdate() {
		return clientOffBoardingdate;
	}

	/**
	 * @param clientOffBoardingdate the clientOffBoardingdate to set
	 */
	public void setClientOffBoardingdate(String clientOffBoardingdate) {
		this.clientOffBoardingdate = clientOffBoardingdate;
	}

	/**
	 * @return the clientStatus
	 */
	public String getClientStatus() {
		return clientStatus;
	}

	/**
	 * @param clientStatus the clientStatus to set
	 */
	public void setClientStatus(String clientStatus) {
		this.clientStatus = clientStatus;
	}

	/**
	 * @return the clientHappinessIndex
	 */
	public String getClientHappinessIndex() {
		return clientHappinessIndex;
	}

	/**
	 * @param clientHappinessIndex the clientHappinessIndex to set
	 */
	public void setClientHappinessIndex(String clientHappinessIndex) {
		this.clientHappinessIndex = clientHappinessIndex;
	}

	/**
	 * @return the clientEngagementHealth
	 */
	public String getClientEngagementHealth() {
		return clientEngagementHealth;
	}

	/**
	 * @param clientEngagementHealth the clientEngagementHealth to set
	 */
	public void setClientEngagementHealth(String clientEngagementHealth) {
		this.clientEngagementHealth = clientEngagementHealth;
	}

	/**
	 * @return the clientEngagementState
	 */
	public String getClientEngagementState() {
		return clientEngagementState;
	}

	/**
	 * @param clientEngagementState the clientEngagementState to set
	 */
	public void setClientEngagementState(String clientEngagementState) {
		this.clientEngagementState = clientEngagementState;
	}

	/**
	 * @return the projectIds
	 */
	public List<Integer> getProjectIds() {
		return projectIds;
	}

	/**
	 * @param projectIds the projectIds to set
	 */
	public void setProjectIds(List<Integer> projectIds) {
		this.projectIds = projectIds;
	}

	/**
	 * @return the clientOnboardedBy
	 */
	public String getClientOnboardedBy() {
		return clientOnboardedBy;
	}

	/**
	 * @param clientOnboardedBy the clientOnboardedBy to set
	 */
	public void setClientOnboardedBy(String clientOnboardedBy) {
		this.clientOnboardedBy = clientOnboardedBy;
	}

	/**
	 * @return the clientOnboardedAt
	 */
	public String getClientOnboardedAt() {
		return clientOnboardedAt;
	}

	/**
	 * @param clientOnboardedAt the clientOnboardedAt to set
	 */
	public void setClientOnboardedAt(String clientOnboardedAt) {
		this.clientOnboardedAt = clientOnboardedAt;
	}

	/**
	 * @return the clientOffboardedBy
	 */
	public String getClientOffboardedBy() {
		return clientOffboardedBy;
	}

	/**
	 * @param clientOffboardedBy the clientOffboardedBy to set
	 */
	public void setClientOffboardedBy(String clientOffboardedBy) {
		this.clientOffboardedBy = clientOffboardedBy;
	}

	/**
	 * @return the clientOffboardedAt
	 */
	public String getClientOffboardedAt() {
		return clientOffboardedAt;
	}

	/**
	 * @param clientOffboardedAt the clientOffboardedAt to set
	 */
	public void setClientOffboardedAt(String clientOffboardedAt) {
		this.clientOffboardedAt = clientOffboardedAt;
	}

	/**
	 * @return the users
	 */
	public List<ClientUser> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<ClientUser> users) {
		this.users = users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientEngagementHealth == null) ? 0 : clientEngagementHealth.hashCode());
		result = prime * result + ((clientEngagementState == null) ? 0 : clientEngagementState.hashCode());
		result = prime * result + ((clientGeography == null) ? 0 : clientGeography.hashCode());
		result = prime * result + ((clientHappinessIndex == null) ? 0 : clientHappinessIndex.hashCode());
		result = prime * result + clientId;
		result = prime * result + ((clientIndustry == null) ? 0 : clientIndustry.hashCode());
		result = prime * result + ((clientName == null) ? 0 : clientName.hashCode());
		result = prime * result + ((clientOffBoardingdate == null) ? 0 : clientOffBoardingdate.hashCode());
		result = prime * result + ((clientOffboardedAt == null) ? 0 : clientOffboardedAt.hashCode());
		result = prime * result + ((clientOffboardedBy == null) ? 0 : clientOffboardedBy.hashCode());
		result = prime * result + ((clientOnboardedAt == null) ? 0 : clientOnboardedAt.hashCode());
		result = prime * result + ((clientOnboardedBy == null) ? 0 : clientOnboardedBy.hashCode());
		result = prime * result + ((clientOnboardingDate == null) ? 0 : clientOnboardingDate.hashCode());
		result = prime * result + ((clientSector == null) ? 0 : clientSector.hashCode());
		result = prime * result + ((clientStatus == null) ? 0 : clientStatus.hashCode());
		result = prime * result + ((projectIds == null) ? 0 : projectIds.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		Client other = (Client) obj;
		if (clientEngagementHealth == null) {
			if (other.clientEngagementHealth != null)
				return false;
		} else if (!clientEngagementHealth.equals(other.clientEngagementHealth))
			return false;
		if (clientEngagementState == null) {
			if (other.clientEngagementState != null)
				return false;
		} else if (!clientEngagementState.equals(other.clientEngagementState))
			return false;
		if (clientGeography == null) {
			if (other.clientGeography != null)
				return false;
		} else if (!clientGeography.equals(other.clientGeography))
			return false;
		if (clientHappinessIndex == null) {
			if (other.clientHappinessIndex != null)
				return false;
		} else if (!clientHappinessIndex.equals(other.clientHappinessIndex))
			return false;
		if (clientId != other.clientId)
			return false;
		if (clientIndustry == null) {
			if (other.clientIndustry != null)
				return false;
		} else if (!clientIndustry.equals(other.clientIndustry))
			return false;
		if (clientName == null) {
			if (other.clientName != null)
				return false;
		} else if (!clientName.equals(other.clientName))
			return false;
		if (clientOffBoardingdate == null) {
			if (other.clientOffBoardingdate != null)
				return false;
		} else if (!clientOffBoardingdate.equals(other.clientOffBoardingdate))
			return false;
		if (clientOffboardedAt == null) {
			if (other.clientOffboardedAt != null)
				return false;
		} else if (!clientOffboardedAt.equals(other.clientOffboardedAt))
			return false;
		if (clientOffboardedBy == null) {
			if (other.clientOffboardedBy != null)
				return false;
		} else if (!clientOffboardedBy.equals(other.clientOffboardedBy))
			return false;
		if (clientOnboardedAt == null) {
			if (other.clientOnboardedAt != null)
				return false;
		} else if (!clientOnboardedAt.equals(other.clientOnboardedAt))
			return false;
		if (clientOnboardedBy == null) {
			if (other.clientOnboardedBy != null)
				return false;
		} else if (!clientOnboardedBy.equals(other.clientOnboardedBy))
			return false;
		if (clientOnboardingDate == null) {
			if (other.clientOnboardingDate != null)
				return false;
		} else if (!clientOnboardingDate.equals(other.clientOnboardingDate))
			return false;
		if (clientSector == null) {
			if (other.clientSector != null)
				return false;
		} else if (!clientSector.equals(other.clientSector))
			return false;
		if (clientStatus == null) {
			if (other.clientStatus != null)
				return false;
		} else if (!clientStatus.equals(other.clientStatus))
			return false;
		if (projectIds == null) {
			if (other.projectIds != null)
				return false;
		} else if (!projectIds.equals(other.projectIds))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", clientGeography=" + clientGeography
				+ ", clientIndustry=" + clientIndustry + ", clientSector=" + clientSector + ", clientOnboardingDate="
				+ clientOnboardingDate + ", clientOffBoardingdate=" + clientOffBoardingdate + ", clientStatus="
				+ clientStatus + ", clientHappinessIndex=" + clientHappinessIndex + ", clientEngagementHealth="
				+ clientEngagementHealth + ", clientEngagementState=" + clientEngagementState + ", projectIds="
				+ projectIds + ", clientOnboardedBy=" + clientOnboardedBy + ", clientOnboardedAt=" + clientOnboardedAt
				+ ", clientOffboardedBy=" + clientOffboardedBy + ", clientOffboardedAt=" + clientOffboardedAt
				+ ", users=" + users + "]";
	}
}