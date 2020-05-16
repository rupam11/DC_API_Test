@DC-Test-Suite
@Activity 
Feature: Validating Activity API's 

@getActivityCount 
Scenario: Verify API: getActivityCount API return Total Activity Count 
	Given User invoke "getActivityCount" 
	When user calls "getActivityCount" API with "Get" http Request 
	Then the API call is success with StatusCode 200 
	Then Total_Activity_Count>0 
	
@createActivity 
Scenario: Verify API: createActivity API add Activity paylod 
	Given Add Activity Payload 
	When user calls "createActivity" API with "Post" http Request 
	Then verify responseBody is instance of Activity
	Then the API call is success with StatusCode 200 
	Then "activityCreatedBy" in response body is "skvarghe" 
	Then "activityState" in response body is "Not Started" 
	Then "activityPercentCompletion" in response body is "0" 
	Then activityId and activitySequence and activityDisplaySequence in response body is equal to output of "getActivityCount" 
	#Then "activityTasks","taskState" in response body is "Not Started"
	
@getAllActivities 
Scenario: Verify API: getAllActivities API return List of All Activities 
	Given User invoke "getAllActivities" 
	When user calls "getAllActivities" API with "Get" http Request 
	Then the API call is success with StatusCode 200 
	Then verify response will return List of Activities 
	Then total number of Activity in List is equal to getActivityCount 
	#   Then Activity added exist in returned ActivityList 
	
@getActivityBySearchCriteria 
Scenario:
Verify API: getActivityBySearchCriteria API return List of Activities as per search Criteria 
	Given User invoke getActivityBySearchCriteria with Parameters: activityCode, activityId, activityStatus 
	When perform "getActivityBySearchCriteria" by "activityCode" 
	Then Activity List should have only one Activity 
	Then "activityCode" for in responseBody have activity Code: "activityCode" 
	 Then the API call is success with StatusCode 200 	 
	# When perform "getActivityBySearchCriteria" by "activityId"
	#Then "activityId" for all Activities is "activityId"
	#Then Activity List should have only one Activity
	#Then the API call is success with StatusCode 200 
	#When perform "getActivityBySearchCriteria" by "activityStatus"
	#  Then "activityStatus" for all Activities is "activityStatus"
	#   Then the API call is success with StatusCode 200 
	
	#@updateActivity
	#Scenario: Verify API: updateActivity API add Activity paylod
	#Given Add Activity Payload
	#  When user calls "updateActivity" API with "Put" http Request
	#  Then verify responseBody is same as requestBody
	#Then the API call is success with StatusCode 200 
	#Then Updated Payload and Response Payload should be equal
	
@deleteActivity 
Scenario: Verify API: deleteActivity API update activity status as Passive 
	Given Update Activty status as Passive using activity Id generated 
	When user calls "deleteActivity" API with "Delete" http Request 
	# Then the API call is success with StatusCode 200
	
	
	
	#  Scenario Outline: Verify that, API:=>"createActivity" add Activity using given payload
	#    Given Add Activity Payload with "<activityCode>" "<activityCreatedAt>" "<activityCreatedBy>" <activityDisplaySequence> "<activityEffort>" <activityId> "<activityName>" "<activityOwner>" "<activityPercentCompletion>" <activitySequence> "<activityState>" "<activityStatus>" "<activityUpdatedAt>" "<activityUpdatedBy>"   
	#     When user calls "addActivity" API with "Post" http Request
	#     Then the API call is success with StatusCode 200
	#     Then Response will have "Activity" object
	#     Then "activityCreatedBy" in response body is "skvarghe"
	#     Then "activityState" in response body is "Not Started"
	# 		Then "activityPercentCompletion" in response body is "0"
	#	Then activityId and activitySequence and activityDisplaySequence in response body is equal to output of "getActivityCount"
	#Then "activityId" inside response body of "getActivityBySearchCriteria" matched
	
	# Examples:
	#|activityCode|activityCreatedAt	 |activityCreatedBy|activityDisplaySequence|activityEffort |activityId|activityName|activityOwner|activityPercentCompletion|activitySequence|activityState|activityStatus|activityUpdatedAt  |activityUpdatedBy|
	#|	act_code |2020-03-08 00:48:00|rupam  		   |0                      |act_effort     |0         |rk_name	   |rupam_sys    |0                        | 0			    |Not Started  |Passive       |0000-00-00 00:00:00|test             |
	
	
