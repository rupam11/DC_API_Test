package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Client implements Serializable {
	private static long serialVersionUID = 1L;

	private int clientId;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(int clientId, String clientName, List<Integer> clientRuleIds, String clientGeography,
			String clientIndustry, String clientSector, String clientOnboardingDate, String clientOffBoardingdate,
			String clientStatus, String clientHappinessIndex, String clientEngagementHealth,
			String clientEngagementState, List<Integer> projectIds, String clientOnboardedBy, String clientOnboardedAt,
			String clientOffboardedBy, String clientOffboardedAt, List<ClientUser> users) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientRuleIds = clientRuleIds;
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
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", clientRuleIds=" + clientRuleIds
				+ ", clientGeography=" + clientGeography + ", clientIndustry=" + clientIndustry + ", clientSector="
				+ clientSector + ", clientOnboardingDate=" + clientOnboardingDate + ", clientOffBoardingdate="
				+ clientOffBoardingdate + ", clientStatus=" + clientStatus + ", clientHappinessIndex="
				+ clientHappinessIndex + ", clientEngagementHealth=" + clientEngagementHealth
				+ ", clientEngagementState=" + clientEngagementState + ", projectIds=" + projectIds
				+ ", clientOnboardedBy=" + clientOnboardedBy + ", clientOnboardedAt=" + clientOnboardedAt
				+ ", clientOffboardedBy=" + clientOffboardedBy + ", clientOffboardedAt=" + clientOffboardedAt
				+ ", users=" + users + "]";
	}
	private String clientName;
	private List<Integer> clientRuleIds;
	private String clientGeography;
	private String clientIndustry;
	private String clientSector;
	private String clientOnboardingDate;
	private String clientOffBoardingdate;
	private String clientStatus;
    private String clientHappinessIndex;
    private String clientEngagementHealth;
    private String clientEngagementState;
   	private List<Integer> projectIds= new ArrayList<>();
    private String clientOnboardedBy;
    private String clientOnboardedAt;
    private String clientOffboardedBy;
    private String clientOffboardedAt;
    private List<ClientUser> users=new ArrayList<>();
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		Client.serialVersionUID = serialVersionUID;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public List<Integer> getClientRuleIds() {
		return clientRuleIds;
	}
	public void setClientRuleIds(List<Integer> clientRuleIds) {
		this.clientRuleIds = clientRuleIds;
	}
	public String getClientGeography() {
		return clientGeography;
	}
	public void setClientGeography(String clientGeography) {
		this.clientGeography = clientGeography;
	}
	public String getClientIndustry() {
		return clientIndustry;
	}
	public void setClientIndustry(String clientIndustry) {
		this.clientIndustry = clientIndustry;
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
		result = prime * result + ((clientRuleIds == null) ? 0 : clientRuleIds.hashCode());
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
		if (clientRuleIds == null) {
			if (other.clientRuleIds != null)
				return false;
		} else if (!clientRuleIds.equals(other.clientRuleIds))
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
	public String getClientSector() {
		return clientSector;
	}
	public void setClientSector(String clientSector) {
		this.clientSector = clientSector;
	}
	public String getClientOnboardingDate() {
		return clientOnboardingDate;
	}
	public void setClientOnboardingDate(String clientOnboardingDate) {
		this.clientOnboardingDate = clientOnboardingDate;
	}
	public String getClientOffBoardingdate() {
		return clientOffBoardingdate;
	}
	public void setClientOffBoardingdate(String clientOffBoardingdate) {
		this.clientOffBoardingdate = clientOffBoardingdate;
	}
	public String getClientStatus() {
		return clientStatus;
	}
	public void setClientStatus(String clientStatus) {
		this.clientStatus = clientStatus;
	}
	public String getClientHappinessIndex() {
		return clientHappinessIndex;
	}
	public void setClientHappinessIndex(String clientHappinessIndex) {
		this.clientHappinessIndex = clientHappinessIndex;
	}
	public String getClientEngagementHealth() {
		return clientEngagementHealth;
	}
	public void setClientEngagementHealth(String clientEngagementHealth) {
		this.clientEngagementHealth = clientEngagementHealth;
	}
	public String getClientEngagementState() {
		return clientEngagementState;
	}
	public void setClientEngagementState(String clientEngagementState) {
		this.clientEngagementState = clientEngagementState;
	}
	public List<Integer> getProjectIds() {
		return projectIds;
	}
	public void setProjectIds(List<Integer> projectIds) {
		this.projectIds = projectIds;
	}
	public String getClientOnboardedBy() {
		return clientOnboardedBy;
	}
	public void setClientOnboardedBy(String clientOnboardedBy) {
		this.clientOnboardedBy = clientOnboardedBy;
	}
	public String getClientOnboardedAt() {
		return clientOnboardedAt;
	}
	public void setClientOnboardedAt(String clientOnboardedAt) {
		this.clientOnboardedAt = clientOnboardedAt;
	}
	public String getClientOffboardedBy() {
		return clientOffboardedBy;
	}
	public void setClientOffboardedBy(String clientOffboardedBy) {
		this.clientOffboardedBy = clientOffboardedBy;
	}
	public String getClientOffboardedAt() {
		return clientOffboardedAt;
	}
	public void setClientOffboardedAt(String clientOffboardedAt) {
		this.clientOffboardedAt = clientOffboardedAt;
	}
	public List<ClientUser> getUsers() {
		return users;
	}
	public void setUsers(List<ClientUser> users) {
		this.users = users;
	}
    
	
	
	
}
