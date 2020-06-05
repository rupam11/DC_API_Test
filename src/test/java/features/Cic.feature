@DC-Test-Suite
@Demo
@Cic

Feature: Validating Cic-Service APIs

@getCicCount 
Scenario: Verify API: getCicCount API return Total Cic Count 
	Given "System_Admin" User invoke "getCicCount"
	When User calls "getCicCount" API with "Get" http Request 
	Then Verify cic_Count result is greater than 0
	Then The API call is success with StatusCode 200 
		
@createCic 
Scenario: Verify API: createCic API add Cic payload 
	Given "System_Admin" User "Add" Cic Payload 
	When User calls "createCic" API with "Post" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return Cic instance 
	Then Verify Total cic_Count increased by 1
	
	
 @createCic
  Scenario: Verify API: createCic API with no cic Body
    Given "System_Admin" User "Add" Cic Payload  with no Cic Body
    When User calls "createCic" API with "Post" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.cic.entity.Cic com.ibm.dc.cic.controller.CicController.createCic(java.lang.String,com.ibm.dc.cic.entity.Cic)"
    
    @getAllCics
Scenario: Verify API: getAllCics API return List of All Cics 
	Given "System_Admin" User invoke "getAllCics"
	When User calls "getAllCics" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Cics
	Then Total number of Cic in List is equal to getCicCount 
	Then Cic added exist in returned Cic List 
    
    @getCicBySearchCriteria 
Scenario: Verify API: getCicBySearchCriteria API, search no SearchCriteria 
	Given "System_Admin" User invoke "getCicBySearchCriteria" 
	When User calls "getCicBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Cics 
	Then Response should be list all Cics=getAllCics
	
	@getCicBySearchCriteria 
Scenario: Verify API: getCicBySearchCriteria API, search by 'cicId' 
	Given "System_Admin" User invoke getCicBySearchCriteria with Parameter: "cicId" 
	When User calls "getCicBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Cics 
	Then Response should be list of Cics and size should be one 
	Then Cic added exist in returned Cic List
	
	@getCicBySearchCriteria 
Scenario: Verify API: getCicBySearchCriteria API, search by 'cicName' 
	Given "System_Admin" User invoke getCicBySearchCriteria with Parameter: "cicName" 
	When User calls "getCicBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Cics 
		Then Cic added exist in returned Cic List
  
  @getCicBySearchCriteria
  Scenario: Verify API: getCicBySearchCriteria API, search by 'cicId' & 'cicName'
    Given "System_Admin" User invoke getCicBySearchCriteria with Parameter: 'cicId' & 'cicName'
    When User calls "getCicBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Cics
    Then Response should be list of Cics and size should be one 
   Then Cic added exist in returned Cic List
 
  @getCicBySearchCriteria
  Scenario: Verify API: getCicBySearchCriteria API, search by invalid 'cicId'
    Given "System_Admin" User invoke "getCicBySearchCriteria" with invalid Parameter: "cicId" = "-9"
    When User calls "getCicBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Cics with zero records

  @getCicBySearchCriteria
  Scenario: Verify API: getCicBySearchCriteria API, search by invalid 'cicName'
    Given "System_Admin" User invoke "getCicBySearchCriteria" with invalid Parameter: "cicName" = "invalidCicName"
    When User calls "getCicBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Cics with zero records
 Then Verify response will return List of Cics with zero records
 
 @deleteCic 
Scenario: Verify API: deleteCic update Cic status as Passive 
	Given "System_Admin" User invoke deleteCic with Parameter: "cicId" 
	When User calls "deleteCic" API with "Delete" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify CicStatus of particular Cic updated as Passive
	
	
  @deleteCic
  Scenario: Verify API: deleteCic API,  with invalid cicId
    Given "System_Admin" User invoke "deleteCic" with invalid Parameter: "cicId" = "-9"
    When User calls "deleteCic" API with "Delete" http Request
    Then The API call is failed with StatusCode 500
    Then "message" in response body is "Cic with id - -9 not found"

  @deleteCic
  Scenario: Verify API: deleteCic API, with no Param
    Given "System_Admin" User "deleteCic" with no Param
    When User calls "deleteCic" API with "Delete" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'cicId' is not present"	
 
 @updateCic 
Scenario: Verify API: updateCic API add Cic paylod 
	Given  "System_Admin" User "Update" Cic Payload 
	When User calls "updateCic" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify Cic fields gets updated

  @updateCic
  Scenario: Verify API: updateCic API, with no Cic Body
    Given "System_Admin" User "Update" Cic Payload  with no Cic Body
    When User calls "updateCic" API with "Put" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.cic.entity.Cic com.ibm.dc.cic.controller.CicController.updateCic(java.lang.String,com.ibm.dc.cic.entity.Cic)"
    

  