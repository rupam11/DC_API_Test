@DC-Test-Suite
@Demo
@Client
Feature: Validating Client API's 

@getClientCount
Scenario: Verify API: getClientCount API return Total Client Count 
	Given "System_Admin" User invoke "getClientCount" 
	When User calls "getClientCount" API with "Get" http Request
	Then The API call is success with StatusCode 200 
	Then Verify client_Count result is greater than 0
	
@createClient 
Scenario: Verify API: createClient API add Client payload 
	Given "System_Admin" "Add" client Payload 
	When User calls "createClient" API with "Post" http Request 
	Then The API call is success with StatusCode 200
	Then Verify responseBody is instance of Client
  Then Verify Total client_Count increased by 1

@getAllClients 
Scenario: Verify API: getAllClients API return List of All Clients 
	Given "System_Admin" User invoke "getAllClients" 
	When User calls "getAllClients" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Clients
	Then Verify Client added exist in returned ClientList
	

@getAllProjectsIds 
#-ve scenario with no Client Id
Scenario: Verify API: getAllProjectsIds API return List of All ProjectIds
	Given "System_Admin" User invoke "getAllProjectsIds" 
	When User calls "getAllProjectsIds" API with "Get" http Request 
	Then The API call is success with StatusCode 400
	Then "message" in response body is "Required Integer parameter 'clientId' is not present"
	
@getAllProjectsIds 
#-ve scenario with invalid Parameter as clientName
Scenario: Verify API: getAllProjectsIds API return List of All ProjectId's
	Given "System_Admin" User invoke ClientAPI "getAllProjectsIds" with Parameter: "clientName" 
	When User calls "getAllProjectsIds" API with "Get" http Request 
	Then The API call is success with StatusCode 400
	Then "message" in response body is "Required Integer parameter 'clientId' is not present"
	
@getAllProjectsIds
#-ve scenario with invalid clientId
  Scenario: Verify API: getAllProjectsIds API, search by invalid 'clientId'
    Given "System_Admin" User invoke "getAllProjectsIds" with invalid Parameter: "clientId" = "-9"
    When User calls "getAllProjectsIds" API with "Get" http Request
    Then The API call is success with StatusCode 500
  #  Then "message" in response body is "No client found for clientId: -9"
    
@getAllProjectsIds 
Scenario: Verify API: getAllProjectsIds API return List of All ProjectIds
	Given "System_Admin" User invoke ClientAPI "getAllProjectsIds" with Parameter: "clientId" 
	When User calls "getAllProjectsIds" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of ProjectIds	
	
@getClientBySearchCriteria
Scenario: Verify API: getClientBySearchCriteria API, search no SearchCriteria 
	Given "System_Admin" User invoke "getClientBySearchCriteria" 
	When User calls "getClientBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Clients
	Then Verify Client added exist in returned ClientList
	Then Verify response should be list all Clients=getAllClients	
	
@getClientBySearchCriteria
Scenario: Verify API: getClientBySearchCriteria API, search by 'clientId' 
	Given "System_Admin" User invoke ClientAPI "getClientBySearchCriteria" with Parameter: "ClientId" 
	When User calls "getClientBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
#	Then Response should be list of Client and satisfy the search: "clientId"
#	Then Response should be list of Client and size should be one
#-----Issue with API	

@getClientBySearchCriteria 
Scenario: Verify API: getClientBySearchCriteria API, search by 'clientName'
	Given "System_Admin" User invoke ClientAPI "getClientBySearchCriteria" with Parameter: "clientName" 
	When User calls "getClientBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Clients
	Then Verify Client added exist in returned ClientList
	Then Response should be list of Client and satisfy the search: "clientName"
	
	
@getClientBySearchCriteria 
Scenario: Verify API: getClientBySearchCriteria API, search by 'clientStatus'
	Given "System_Admin" User invoke ClientAPI "getClientBySearchCriteria" with Parameter: "clientStatus" 
	When User calls "getClientBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
	#Then Verify Client added exist in returned ClientList
	Then Response should be list of Client and satisfy the search: "clientStatus"	



@getClientBySearchCriteria
Scenario: Verify API: getClientBySearchCriteria API, search by 'clientSector' 
 	Given "System_Admin" User invoke ClientAPI "getClientBySearchCriteria" with Parameter: "clientSector" 
	When User calls "getClientBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Response should be list of Client and satisfy the search: "clientSector"  
	Then Verify Client added exist in returned ClientList
	
@getClientBySearchCriteria
Scenario: Verify API: getClientBySearchCriteria API, search by 'clientIndustry' 
 	Given "System_Admin" User invoke ClientAPI "getClientBySearchCriteria" with Parameter: "clientIndustry" 
	When User calls "getClientBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Response should be list of Client and satisfy the search: "clientIndustry"  
	Then Verify Client added exist in returned ClientList	
	
@getClientBySearchCriteria
Scenario: Verify API: getClientBySearchCriteria API, search by 'clientHappinessIndex' 
 	Given "System_Admin" User invoke ClientAPI "getClientBySearchCriteria" with Parameter: "clientHappinessIndex" 
	When User calls "getClientBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Response should be list of Client and satisfy the search: "clientHappinessIndex"  
	Then Verify Client added exist in returned ClientList		
	
@getClientBySearchCriteria
Scenario: Verify API: getClientBySearchCriteria API, search by 'clientGeography' 
 	Given "System_Admin" User invoke ClientAPI "getClientBySearchCriteria" with Parameter: "clientGeography" 
	When User calls "getClientBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Response should be list of Client and satisfy the search: "clientGeography"  
	Then Verify Client added exist in returned ClientList			
	
@getClientBySearchCriteria
Scenario: Verify API: getClientBySearchCriteria API, search by 'clientEngagementState' 
 	Given "System_Admin" User invoke ClientAPI "getClientBySearchCriteria" with Parameter: "clientEngagementState" 
	When User calls "getClientBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Response should be list of Client and satisfy the search: "clientEngagementState"  
	Then Verify Client added exist in returned ClientList		
	
@getClientBySearchCriteria
Scenario: Verify API: getClientBySearchCriteria API, search by 'clientEngagementHealth' 
 	Given "System_Admin" User invoke ClientAPI "getClientBySearchCriteria" with Parameter: "clientEngagementHealth" 
	When User calls "getClientBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Response should be list of Client and satisfy the search: "clientEngagementHealth"  
	Then Verify Client added exist in returned ClientList		
	
@getClientBySearchCriteria
#-ve scenario with invalid clientId
  Scenario: Verify API: getClientBySearchCriteria API, search by invalid 'clientId'
    Given "System_Admin" User invoke "getClientBySearchCriteria" with invalid Parameter: "clientId" = "-9"
    When User calls "getClientBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Client with zero records		
	
@getClientBySearchCriteria
#-ve scenario with invalid clientname
  Scenario: Verify API: getClientBySearchCriteria API, search by invalid 'clientName'
    Given "System_Admin" User invoke "getClientBySearchCriteria" with invalid Parameter: "clientName" = "invalidClientName"
    When User calls "getClientBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Client with zero records	
    
@getClientBySearchCriteria
#-ve scenario with invalid clientStatus
  Scenario: Verify API: getClientBySearchCriteria API, search by invalid 'clientStatus'
    Given "System_Admin" User invoke "getClientBySearchCriteria" with invalid Parameter: "clientStatus" = "invalidClientStatus"
    When User calls "getClientBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Client with zero records	  
    
@getClientBySearchCriteria
#-ve scenario with invalid clientSector
  Scenario: Verify API: getClientBySearchCriteria API, search by invalid 'clientSector'
    Given "System_Admin" User invoke "getClientBySearchCriteria" with invalid Parameter: "clientSector" = "invalidClientSector"
    When User calls "getClientBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Client with zero records	    
    
@getClientBySearchCriteria
#-ve scenario with invalid clientIndustry
  Scenario: Verify API: getClientBySearchCriteria API, search by invalid 'clientIndustry'
    Given "System_Admin" User invoke "getClientBySearchCriteria" with invalid Parameter: "clientIndustry" = "invalidClientIndustry"
    When User calls "getClientBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Client with zero records	  

@getClientBySearchCriteria
#-ve scenario with invalid clientHappinessIndex
  Scenario: Verify API: getClientBySearchCriteria API, search by invalid 'clientHappinessIndex'
    Given "System_Admin" User invoke "getClientBySearchCriteria" with invalid Parameter: "clientHappinessIndex" = "invalidClientHappinessIndex"
    When User calls "getClientBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Client with zero records	      
    
@getClientBySearchCriteria
#-ve scenario with invalid clientGeography
  Scenario: Verify API: getClientBySearchCriteria API, search by invalid 'clientGeography'
    Given "System_Admin" User invoke "getClientBySearchCriteria" with invalid Parameter: "clientGeography" = "invalidClientGeography"
    When User calls "getClientBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Client with zero records	    
    
@getClientBySearchCriteria
#-ve scenario with invalid clientEngagementState
  Scenario: Verify API: getClientBySearchCriteria API, search by invalid 'clientEngagementState'
    Given "System_Admin" User invoke "getClientBySearchCriteria" with invalid Parameter: "clientEngagementState" = "invalidClientEngagementState"
    When User calls "getClientBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Client with zero records	  
    
@getClientBySearchCriteria
#-ve scenario with invalid clientEngagementHealth
  Scenario: Verify API: getClientBySearchCriteria API, search by invalid 'clientEngagementHealth'
    Given "System_Admin" User invoke "getClientBySearchCriteria" with invalid Parameter: "clientEngagementHealth" = "invalidClientEngagementHealth"
    When User calls "getClientBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Client with zero records	                       
			
@getClientUsers 
#-ve scenarion with no Client Id
Scenario: Verify API: getClientUsers API return List of All Users
	Given "System_Admin" User invoke "getClientUsers" 
	When User calls "getClientUsers" API with "Put" http Request 
	Then The API call is success with StatusCode 400
	Then "message" in response body is "Required Integer parameter 'clientId' is not present"	
	
	
@getClientUsers 
Scenario: Verify API: getClientUsers API return List of All Users
	Given "System_Admin" User invoke ClientAPI "getClientUsers" with Parameter: "clientId" 
	When User calls "getClientUsers" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of ProjectIds		
	
@getClientUsers
#-ve scenario with invalid clientId
  Scenario: Verify API: getClientUsers API, search by invalid 'clientId'
    Given "System_Admin" User invoke "getClientUsers" with invalid Parameter: "clientId" = "-9"
    When User calls "getClientUsers" API with "Put" http Request
    Then The API call is success with StatusCode 500
    Then Verify response will return List of Client with zero records	 
    
@addProjectToClient    	
Scenario: Verify API: addProjectToClient API, to add Project to Client
		Given "System_Admin" User invoke "getAllProjects" 
		When User calls "getAllProjects" API with "Get" http Request 
		Then Save the Project Details
		Given "System_Admin" User invoke ClientAPI addProjectToClient with project Payload and Parameter: "clientId" 
		When User calls "addProjectToClient" API with "Put" http Request 
		Then The API call is success with StatusCode 200  
	
@addProjectToClient   
#-Ve scenario is invalid Client Id 	
Scenario: Verify API: addUsersToClient API, with Invalid clientId
		Given "System_Admin" User invoke "getAllProjects" 
		When User calls "getAllProjects" API with "Get" http Request 
		Then Save the Project Details
		Given "System_Admin" User invoke "addProjectToClient" with invalid Parameter: "clientId" = "-9" 
		When User calls "addProjectToClient" API with "Put" http Request 
		Then The API call is success with StatusCode 400
		
@addProjectToClient    	
Scenario: Verify API: addUsersToClient API, with Invalid Parameter-clientName
		Given "System_Admin" User invoke "getAllProjects" 
		When User calls "getAllProjects" API with "Get" http Request 
		Then Save the Project Details
		Given "System_Admin" User invoke ClientAPI addProjectToClient with project Payload and Parameter: "clientName"
		When User calls "addProjectToClient" API with "Put" http Request 
		Then The API call is success with StatusCode 400
		Then "message" in response body is "Required Integer parameter 'clientId' is not present"			    
    
@addUsersToClient    	
Scenario: Verify API: addUsersToClient API, to add user to Client
		Given "System_Admin" User invoke "getAllUsers" 
		When User calls "getAllUsers" API with "Get" http Request 
		Then Save the User Details
		Given "System_Admin" User invoke ClientAPI addUsersToClient with user Payload and Parameter: "clientId"  
		When User calls "addUsersToClient" API with "Put" http Request 
		Then The API call is success with StatusCode 200
		
@addUsersToClient    	
Scenario: Verify API: addUsersToClient API, to add user to Client
		Given "System_Admin" User invoke "getAllUsers" 
		When User calls "getAllUsers" API with "Get" http Request 
		Then Save the User Details
		Given "System_Admin" User invoke "addUsersToClient" with invalid Parameter: "clientId" = "-9"
		#Given "System_Admin" User invoke ClientAPI addUsersToClient with user Payload and Parameter: "clientId"  
		When User calls "addUsersToClient" API with "Put" http Request 
		Then The API call is success with StatusCode 400	

@deleteProjectFromClient
Scenario: Verify API: deleteProjectFromClient API, to delete Project from Client
		Given "System_Admin" User invoke ClientAPI "getAllProjectsIds" with Parameter: "clientId" 
		When User calls "getAllProjects" API with "Get" http Request 
		Then Save the Project Details
		Given "System_Admin" User invoke ClientAPI deleteProjectFromClient with project Payload and Parameter: "clientId" 
		When User calls "deleteProjectFromClient" API with "Put" http Request 
		Then The API call is success with StatusCode 200  
		
@deleteProjectFromClient
Scenario: Verify API: deleteProjectFromClient API, to delete Project from Client with Invalid Client Id
		Given "System_Admin" User invoke ClientAPI "getAllProjectsIds" with Parameter: "clientId" 
		When User calls "getAllProjects" API with "Get" http Request 
		Then Save the Project Details
		Given "System_Admin" User invoke "deleteProjectFromClient" with invalid Parameter: "clientId" = "-9" 
		When User calls "deleteProjectFromClient" API with "Put" http Request 
		Then The API call is success with StatusCode 400 
		Then "message" in response body is "Client with id - -9 not found"	
		
@deleteProjectFromClient
Scenario: Verify API: deleteProjectFromClient API, to delete Project from Client with Invalid Parameter ClientName
		Given "System_Admin" User invoke ClientAPI "getAllProjectsIds" with Parameter: "clientId" 
		When User calls "getAllProjects" API with "Get" http Request 
		Then Save the Project Details
		Given "System_Admin" User invoke ClientAPI deleteProjectFromClient with project Payload and Parameter: "clientName"
		When User calls "deleteProjectFromClient" API with "Put" http Request 
		Then The API call is success with StatusCode 400 
    Then "message" in response body is "Required Integer parameter 'clientId' is not present"	

@deleteUsersFromClient    	
Scenario: Verify API: deleteUsersFromClient API, to add user to Client
		Given "System_Admin" User invoke ClientAPI "getClientUsers" with Parameter: "clientId" 
		When User calls "getAllUsers" API with "Get" http Request 
		Then Save the User Details
		Given "System_Admin" User invoke ClientAPI deleteUsersFromClient with user Payload and Parameter: "clientId"  
		When User calls "deleteUsersFromClient" API with "Put" http Request 
		Then The API call is success with StatusCode 200
		
@deleteUsersFromClient    	
Scenario: Verify API: deleteUsersFromClient API, to delete user from Client with invalid value clientId
		Given "System_Admin" User invoke ClientAPI "getClientUsers" with Parameter: "clientId" 
		When User calls "getAllUsers" API with "Get" http Request 
		Then Save the User Details
		Given "System_Admin" User invoke "deleteUsersFromClient" with invalid Parameter: "clientId" = "-9"   
		When User calls "deleteUsersFromClient" API with "Put" http Request 
		Then The API call is success with StatusCode 400 
		Then "message" in response body is "Client with id - -9 not found"		
		
@deleteUsersFromClient    	
Scenario: Verify API: deleteUsersFromClient API, to delete user from Client with invalid parameter ClientName
		Given "System_Admin" User invoke ClientAPI "getClientUsers" with Parameter: "clientId" 
		When User calls "getAllUsers" API with "Get" http Request 
		Then Save the User Details
		Given "System_Admin" User invoke ClientAPI deleteUsersFromClient with user Payload and Parameter: "clientName"
		When User calls "deleteUsersFromClient" API with "Put" http Request 
		Then The API call is success with StatusCode 400 
		Then "message" in response body is "Required Integer parameter 'clientId' is not present"	

@updateClient
Scenario: Verify API: updateClient API, update Field status as Passive
		Given "System_Admin" User invoke ClientAPI "updateClient" with Parameter: "clientId" 
		Given "System_Admin" "Update" client Payload
    When User calls "updateClient" API with "Put" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return Client instance
  
@deleteClient
Scenario: Verify API: deleteClient API, update Field status as Passive
    Given "System_Admin" User invoke ClientAPI "deleteClient" with Parameter: "clientId" 
    When User calls "deleteClient" API with "Delete" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return Client instance
    Then "clientStatus" in response body is "Passive"		    
    
@deleteClient
#-ve scenarion with no Client Id
Scenario: Verify API: deleteClient API, with No Client Id
   Given "System_Admin" User invoke "deleteClient" 
   When User calls "deleteClient" API with "Delete" http Request
   Then The API call is success with StatusCode 400
   Then "message" in response body is "Required Integer parameter 'clientId' is not present" 