@DC-Test-Suite
@Demo
@Squad

Feature: Validating Squad-Service APIs

@getSquadCount 
Scenario: Verify API: getSquadCount API return Total Squad Count 
	Given "System_Admin" User invoke "getSquadCount"
	When User calls "getSquadCount" API with "Get" http Request 
	Then Verify squad_Count result is greater than 0
	Then The API call is success with StatusCode 200 
		
@createSquad 
Scenario: Verify API: createSquad API add Squad payload 
	Given "System_Admin" User "Add" Squad Payload with Param = "none"
	When User calls "createSquad" API with "Post" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return Squad instance 
	Then Verify Total squad_Count increased by 1
	
	
 @createSquad
  Scenario: Verify API: createSquad API with no squad Body
    Given "System_Admin" User "Add" Squad Payload  with no Squad Body
    When User calls "createSquad" API with "Post" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.squad.entity.Squad com.ibm.dc.squad.controller.SquadController.createSquad(java.lang.String,com.ibm.dc.squad.entity.Squad)"
    
    @getAllIndusties 
Scenario: Verify API: getAllSquads API return List of All Squads 
	Given "System_Admin" User invoke "getAllSquads"
	When User calls "getAllSquads" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Squads
	Then Total number of Squad in List is equal to getSquadCount 
	Then Squad added exist in returned Squad List 
    
    @getSquadBySearchCriteria 
Scenario: Verify API: getSquadBySearchCriteria API, search no SearchCriteria 
	Given "System_Admin" User invoke "getSquadBySearchCriteria" 
	When User calls "getSquadBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Squads 
	Then Response should be list all Squads=getAllSquads
	#Then All Squads should have Active Status
	
	@getSquadBySearchCriteria 
Scenario: Verify API: getSquadBySearchCriteria API, search by 'squadId' 
	Given "System_Admin" User invoke getSquadBySearchCriteria with Parameter: "squadId" 
	When User calls "getSquadBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Squads 
	Then Response should be list of Squads and size should be one 
	Then Squad added exist in returned Squad List
	
	@getSquadBySearchCriteria 
Scenario: Verify API: getSquadBySearchCriteria API, search by 'squadName' 
	Given "System_Admin" User invoke getSquadBySearchCriteria with Parameter: "squadName" 
	When User calls "getSquadBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Squads 
		Then Squad added exist in returned Squad List
		
		@getSquadBySearchCriteria 
Scenario: Verify API: getSquadBySearchCriteria API, search by 'squadSectorName' 
	Given "System_Admin" User invoke getSquadBySearchCriteria with Parameter: "squadSectorName" 
	When User calls "getSquadBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Squads
		Then Squad added exist in returned Squad List
  
  @getSquadBySearchCriteria
  Scenario: Verify API: getSquadBySearchCriteria API, search by 'squadId' & 'squadName' & 'squadSectorName'
    Given "System_Admin" User invoke getSquadBySearchCriteria with Parameter: 'squadId' & 'squadName' & 'squadSectorName'
    When User calls "getSquadBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Squads
    Then Response should be list of Squads and size should be one 
   Then Squad added exist in returned Squad List
 
  @getSquadBySearchCriteria
  Scenario: Verify API: getSquadBySearchCriteria API, search by invalid 'squadId'
    Given "System_Admin" User invoke "getSquadBySearchCriteria" with invalid Parameter: "squadId" = "-9"
    When User calls "getSquadBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Squads with zero records

  @getSquadBySearchCriteria
  Scenario: Verify API: getSquadBySearchCriteria API, search by invalid 'squadName'
    Given "System_Admin" User invoke "getSquadBySearchCriteria" with invalid Parameter: "squadName" = "invalidSquadName"
    When User calls "getSquadBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Squads with zero records
    
    @getSquadBySearchCriteria
  Scenario: Verify API: getSquadBySearchCriteria API, search by invalid 'squadStatus'
    Given "System_Admin" User invoke "getSquadBySearchCriteria" with invalid Parameter: "squadStatus" = "invalidSquadStatus"
    When User calls "getSquadBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Squads with zero records
 
 @deleteSquad 
Scenario: Verify API: deleteSquad update Squad status as Passive 
	Given "System_Admin" User invoke deleteSquad with Parameter: "squadId" 
	When User calls "deleteSquad" API with "Delete" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify SquadStatus of particular Squad updated as Passive
	
	
  @deleteSquad
  Scenario: Verify API: deleteSquad API,  with invalid squadId
    Given "System_Admin" User invoke "deleteSquad" with invalid Parameter: "squadId" = "-9"
    When User calls "deleteSquad" API with "Delete" http Request
    Then The API call is failed with StatusCode 500
    Then "message" in response body is "Squad with id - -9 not found"

  @deleteSquad
  Scenario: Verify API: deleteSquad API, with no Param
    Given "System_Admin" User "deleteSquad" with no Param
    When User calls "deleteSquad" API with "Delete" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'squadId' is not present"	
 
  @updateSquad
  Scenario: Verify API: updateSquad API add Squad paylod
    Given "System_Admin" User "Update" Squad Payload with Param = "squadId"
    When User calls "updateSquad" API with "Put" http Request
    Then The API call is success with StatusCode 200
    Then Verify Squad fields gets updated

  @updateSquad
  Scenario: Verify API: updateSquad API, with invalid squadId
    Given "System_Admin" User "Update" Squad Payload  with invalid Param = "squadId" and value="-9"
    When User calls "updateSquad" API with "Put" http Request
    Then The API call is failed with StatusCode 500
    Then "message" in response body is "Squad with id - -9 not found"

  @updateSquad
  Scenario: Verify API: updateSquad API, with no squadId
    Given "System_Admin" User "Update" Squad Payload  with no Param
    When User calls "updateSquad" API with "Put" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'squadId' is not present"

  @updateSquad
  Scenario: Verify API: updateSquad API, with no squad Body
    Given "System_Admin" User "Update" Squad Payload  with no Squad Body and Param = "squadId"
    When User calls "updateSquad" API with "Put" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.squad.entity.Squad com.ibm.dc.squad.controller.SquadController.updateSquad(java.lang.String,java.lang.Integer,com.ibm.dc.squad.entity.Squad)"
  