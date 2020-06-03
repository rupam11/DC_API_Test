@DC-Test-Suite 
@Process 
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

@getAllProcess
Scenario: Verify API: getAllProcess API return List of All Process 
	Given "System_Admin" User invoke "getAllProcess"
	When User calls "getAllProcess" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Process 
	Then Total number of Process in List is equal to getProcessCount 
	Then Process added exist in returned ProcessList 
	
		
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
	Given "System_Admin" User invoke getProcessBySearchCriteria with Parameter: "ProcessName" 
	When User calls "getProcessBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Process 
		Then Created Process should exist in the List of Process
	
	
	
	@updateProcess 
Scenario: Verify API: updateProcess API add Process paylod 
	Given  "System_Admin" User "Update" Process Payload with Param = "processId" 
	When User calls "updateProcess" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify Process fields gets updated
	
	@deleteProcess 
Scenario: Verify API: deleteProcess update Process status as Passive 
	Given "System_Admin" User invoke deleteProcess with Parameter: "processId" 
	When User calls "deleteProcess" API with "Delete" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return Process instance
	Then "processStatus" in response body is "Passive"