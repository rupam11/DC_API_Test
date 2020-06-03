@DC-Test-Suite 
@Test
Feature: Validating Process-Service APIs 

@getProcessCount 
Scenario: Verify API: getProcessCount API return Total Process Count 
	Given "System_Admin" User invoke "getProcessCount"
	When User calls "getProcessCount" API with "Get" http Request 
	Then Verify Process_Count result is greater than 0
	Then The API call is success with StatusCode 200 
		
@createProcess 
Scenario: Verify API: createProcess API add Process paylod 
	Given "System_Admin" User "Add" Process Payload with Param = "none" 
	When User calls "createProcess" API with "Post" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return Process instance
	Then "processUpdatedBy" in response body is "NA"
	Then "processUpdatedAt" in response body is "0000-00-00 00:00:00"
	Then processId in response body is equal to output of "getActivityCount" 
	Then processCode in response body is equal to output of "PRS_getProcessCount" 
	Then Verify Total Process_Count increased by 1
	#Then Verify responseProcess is same as that of requestProcess
	
	@createProcess
  Scenario: Verify API: createProcess API with no process Body
    Given "System_Admin" User "Add" Process Payload  with no Process Body and Param = "none"
    When User calls "createProcess" API with "Post" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.process.entity.Process com.ibm.dc.process.controller.ProcessController.createProcess(java.lang.String,com.ibm.dc.process.entity.Process)"		

@getAllProcess
Scenario: Verify API: getAllProcess API return List of All Process 
	Given "System_Admin" User invoke "getAllProcess"
	When User calls "getAllProcess" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Process 
	Then Total number of Process in List is equal to getProcessCount 
	Then Created Process should exist in the List of Process 
	
		
@getProcessBySearchCriteria
Scenario: Verify API: getProcessBySearchCriteria API, search no SearchCriteria 
	Given "System_Admin" User invoke "getProcessBySearchCriteria" 
	When User calls "getProcessBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Process 
	#Then Response should be list all Process=getAllProcess
	Then All Process should have Active Status
	
	@getProcessBySearchCriteria 
Scenario: Verify API: getProcessBySearchCriteria API, search by 'processId' 
	Given "System_Admin" User invoke getProcessBySearchCriteria with Parameter: "processId" 
	When User calls "getProcessBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Process 
	Then Response should be list of Process and size should be one 
	Then Response Process is same which was added

	@getProcessBySearchCriteria 
Scenario: Verify API: getProcessBySearchCriteria API, search by 'processName' 
	Given "System_Admin" User invoke getProcessBySearchCriteria with Parameter: "processName" 
	When User calls "getProcessBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Process 
		Then Created Process should exist in the List of Process
	
	@getProcessBySearchCriteria 
Scenario: Verify API: getProcessBySearchCriteria API, search by 'processStatus' 
	Given "System_Admin" User invoke getProcessBySearchCriteria with Parameter: "processStatus" 
	When User calls "getProcessBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Process 
		Then Created Process should exist in the List of Process
		
		@getProcessBySearchCriteria
  Scenario: Verify API: getProcessBySearchCriteria API, search by 'processId' & 'processName' & 'processStatus'
    Given "System_Admin" User invoke getProcessBySearchCriteria with Parameter: 'processId' & 'processName' & 'processStatus'
    When User calls "getProcessBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Response should be list of Process and size should be one
    Then Created Process should exist in the List of Process
    
     @getProcessBySearchCriteria
  Scenario: Verify API: getProcessBySearchCriteria API, search by invalid 'processId'
    Given "System_Admin" User invoke "getProcessBySearchCriteria" with invalid Parameter: "processId" = "-9"
    When User calls "getProcessBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Processes with zero records

  @getProcessBySearchCriteria
  Scenario: Verify API: getProcessBySearchCriteria API, search by invalid 'processName'
    Given "System_Admin" User invoke "getProcessBySearchCriteria" with invalid Parameter: "processName" = "invalidProcessCode"
    When User calls "getProcessBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Processes with zero records

  @getProcessBySearchCriteria
  Scenario: Verify API: getProcessBySearchCriteria API, search by invalid 'processStatus'
    Given "System_Admin" User invoke "getProcessBySearchCriteria" with invalid Parameter: "processStatus" = "invalidProcessName"
    When User calls "getProcessBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Processes with zero records
    
	
	@updateProcess 
Scenario: Verify API: updateProcess API add Process paylod 
	Given  "System_Admin" User "Update" Process Payload with Param = "processId" 
	When User calls "updateProcess" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify Process fields gets updated
	
	@updateProcess
  Scenario: Verify API: updateProcess API, with invalid processId
    Given "System_Admin" User "Update" Process Payload  with invalid Param = "processId" and value="-9"
    When User calls "updateProcess" API with "Put" http Request
    Then The API call is success with StatusCode 500
    Then "message" in response body is "Process with id - -9 not found"

  @updateProcess
  Scenario: Verify API: updateProcess API, with no activityId
    Given "System_Admin" User "Update" Process Payload  with no Param
    When User calls "updateProcess" API with "Put" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'processId' is not present"

  @updateProcess
  Scenario: Verify API: updateProcess API, with no pattern Body
    Given "System_Admin" User "Update" Process Payload  with no Process Body and Param = "processId"
    When User calls "updateProcess" API with "Put" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.process.entity.Process com.ibm.dc.process.controller.ProcessController.updateProcess(java.lang.String,java.lang.Integer,com.ibm.dc.process.entity.Process)"
    
	@deleteProcess 
Scenario: Verify API: deleteProcess update Process status as Passive 
	Given "System_Admin" User invoke deleteProcess with Parameter: "processId" 
	When User calls "deleteProcess" API with "Delete" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return Process instance
	Then "processStatus" in response body is "Passive"
	
	@deleteProcess
  Scenario: Verify API: deleteProcess API,  with invalid processId
    Given "System_Admin" User invoke "deleteProcess" with invalid Parameter: "processId" = "-9"
    When User calls "deleteProcess" API with "Delete" http Request
    Then The API call is success with StatusCode 500
    Then "message" in response body is "Process with id - -9 not found"

  @deleteProcess
  Scenario: Verify API: deleteProcess API, with no Param
    Given "System_Admin" User "deleteProcess" with no Param
    When User calls "deleteProcess" API with "Delete" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'processId' is not present"