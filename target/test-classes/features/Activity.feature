@DC-Test-Suite
@Activity 
Feature: Validating Activity API's 

@getActivityCount 
Scenario: Verify API: getActivityCount API return Total Activity Count 
	Given "System_Admin" User invoke "getActivityCount" 
	When User calls "getActivityCount" API with "Get" http Request 
	Then The API call is success with StatusCode 200	
	#Then Total_Activity_Count>0 
	
@createActivity 
Scenario: Verify API: createActivity API add Activity paylod 
	Given "System_Admin" User "Add" Pattern Payload 
	When User calls "createActivity" API with "Post" http Request 
	Then Verify responseBody is instance of Activity
	Then The API call is success with StatusCode 200 
	Then "activityCreatedBy" in response body is "skvarghe" 
	Then "activityState" in response body is "Not Started" 
	Then "activityPercentCompletion" in response body is "0" 
	Then activityId and activitySequence and activityDisplaySequence in response body is equal to output of "getActivityCount" 
	#Then "activityTasks","taskState" in response body is "Not Started"
