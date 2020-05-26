@DC-Test-Suite
@Task 
Feature: Validating Task API's 
	
@getTaskCount 
Scenario: Verify API: getTaskCount API return Total Task Count 
	Given "System_Admin" User invoke "getTaskCount" 
	When User calls "getTaskCount" API with "Get" http Request
	Then The API call is success with StatusCode 200 
	Then Verify task_Count result is greater than 0
	
@createTask 
Scenario: Verify API: createTask API add Task paylod 
	Given "System_Admin" "Add" Task Payload 
	When User calls "createTask" API with "Post" http Request 
	Then The API call is success with StatusCode 200
	Then Verify responseBody is instance of Task
	Then Verify Total task_Count increased by 1
	Then Verify taskId, taskequence, taskDisplaySequence is equal to total_task_count
	Then Verify Task_Code is equal to 'TSK_task_count'
	
@getAllTasks 
Scenario: Verify API: getAllTasks API return List of All Tasks
	Given "System_Admin" User invoke "getAllTasks" 
	When User calls "getAllTasks" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Tasks
	Then Total number of Task in List is equal to getTaskCount
	#Then Task added exist in returned TaskList
	
@getTaskBySearchCriteria 
Scenario: Verify API: getTaskBySearchCriteria API, search no SearchCriteria 
	Given "System_Admin" User invoke "getTaskBySearchCriteria" 
	When User calls "getTaskBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200 
	Then Verify response should be list all Tasks=getAllTasks
	 
@getTaskBySearchCriteria 
Scenario: Verify API: getTaskBySearchCriteria API, search by 'taskApplicable' 
	Given "System_Admin" User invoke "getTaskBySearchCriteria" with Parameter: "taskApplicable" 
	When User calls "getTaskBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200 
	Then Response should be list of Tasks and satisfy the search: "taskApplicable"  
	#validate taskApplicable value fo rall result
#	Then Response Task is added should be filtered
	
@getTaskBySearchCriteria 
Scenario: Verify API: getTaskBySearchCriteria API, search by 'taskDescription'
	Given "System_Admin" User invoke "getTaskBySearchCriteria" with Parameter: "taskDescription" 
	When User calls "getTaskBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Response should be list of Tasks and satisfy the search: "taskDescription"  
#	Then Response Task is added should be filtered  

@getTaskBySearchCriteria 
Scenario: Verify API: getTaskBySearchCriteria API, search by 'taskId' 
	Given "System_Admin" User invoke "getTaskBySearchCriteria" with Parameter: "taskId" 
	When User calls "getTaskBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
	Then Response should be list of Tasks and satisfy the search: "taskId"
	Then The size of items in Response should be 1  
#	Then Response Task is added should be filtered  
	
@getTaskBySearchCriteria 
Scenario: Verify API: getTaskBySearchCriteria API, search by 'taskStatus'
	Given "System_Admin" User invoke "getTaskBySearchCriteria" with Parameter: "taskStatus" 
	When User calls "getTaskBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
	Then Response should be list of Tasks and satisfy the search: "taskStatus"  
#	Then Response Task is added should be filtered
	
@deleteTask
Scenario: Verify API: deleteTask update Sector status as Passive 
	Given "System_Admin" User invoke "deleteTask" with Parameter: "taskId" 
	When User calls "deleteTask" API with "Delete" http Request 
	Then The API call is success with StatusCode 200 
	Then "taskStatus" in response body is "Passive"
	
@updateSector 
Scenario: Verify API: updateTask API add Task paylod 
	Given "System_Admin" "Update" Task Payload  
	When User calls "updateTask" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify Task fields gets updated
	
#@importPattern
#Scenario: Verify API: importPattern API importPattern 
#	Given "System_Admin" User invoke "importPattern" 
#	When User calls "importPattern" API with "Put" http Request 
#	Then The API call is success with StatusCode 200 
	