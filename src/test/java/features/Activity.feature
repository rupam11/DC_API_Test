@DC-Test-Suite
@Activity
Feature: Validating Activity-Service APIs

  @getActivityCount
  Scenario: Verify API: getActivityCount API return Total Activity Count
    Given "System_Admin" User invoke "getActivityCount"
    When User calls "getActivityCount" API with "Get" http Request
    Then Verify Activity_Count result is greater than or equal to 0
    Then The API call is success with StatusCode 200

  @createActivity
  Scenario: Verify API: createActivity API add Activity paylod
    Given "System_Admin" User "Add" Activity Payload with Param = "none"
    When User calls "createActivity" API with "Post" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return Activity instance
    Then Verify Total Activity_Count increased by 1

  @createActivity
  Scenario: Verify API: createActivity API with no pattern Body
    Given "System_Admin" User "Add" Activity Payload  with no Activity Body and Param = "none"
    When User calls "createActivity" API with "Post" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.activity.entity.Activity com.ibm.dc.activity.controller.ActivityController.createActivity(java.lang.String,com.ibm.dc.activity.entity.Activity)"

  @getAllActivitys
  Scenario: Verify API: getAllActivities API return List of All Activities
    Given "System_Admin" User invoke "getAllActivities"
    When User calls "getAllActivities" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities
    Then Total number of Activities in List is equal to getActivityCount
  #Then Activity added exist in returned ActivityList
  
  @getActivityBySearchCriteria
  Scenario: Verify API: getActivityBySearchCriteria API, search no SearchCriteria
    Given "System_Admin" User invoke "getActivityBySearchCriteria"
    When User calls "getActivityBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities
    #Then Response should be list all Activity=getAllActivities
    Then All Activities should have Active Status

  @getActivityBySearchCriteria
  Scenario: Verify API: getActivityBySearchCriteria API, search by 'activityId'
    Given "System_Admin" User invoke getActivityBySearchCriteria with Parameter: "activityId"
    When User calls "getActivityBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities
    Then Response should be List of Activities and size should be one
  #Then Response Activity is same which was added
  #Then Activity added exist in returned ActivityList
  
  @getActivityBySearchCriteria
  Scenario: Verify API: getActivityBySearchCriteria API, search by 'activityCode'
    Given "System_Admin" User invoke getActivityBySearchCriteria with Parameter: "activityCode"
    When User calls "getActivityBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities
    Then Each Activity of returned ActivityList should have same pattern "activityCode"
  #Then Activity added exist in returned ActivityList
  
  @getActivityBySearchCriteria
  Scenario: Verify API: getActivityBySearchCriteria API, search by 'activityName'
    Given "System_Admin" User invoke getActivityBySearchCriteria with Parameter: "activityName"
    When User calls "getActivityBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities
    Then Each Activity of returned ActivityList should have same pattern "activityName"
  
  @getActivityBySearchCriteria
  Scenario: Verify API: getActivityBySearchCriteria API, search by 'activityState'
    Given "System_Admin" User invoke getActivityBySearchCriteria with Parameter: "activityState"
    When User calls "getActivityBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities
    Then Each Activity of returned ActivityList should have same pattern "activityState"
  #Then Activity added exist in returned ActivityList
  
  @getActivityBySearchCriteria
  Scenario: Verify API: getActivityBySearchCriteria API, search by 'activityStatus'
    Given "System_Admin" User invoke getActivityBySearchCriteria with Parameter: "activityStatus"
    When User calls "getActivityBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities
    Then Each Activity of returned ActivityList should have same pattern "activityStatus"
  # Then Activity added exist in returned ActivityList
  
  @getActivityBySearchCriteria
  Scenario: Verify API: getActivityBySearchCriteria API, search by 'activityId' & 'patternCode' & 'patternName' & 'patternState' & 'patternStatus'
    Given "System_Admin" User invoke getActivityBySearchCriteria with Parameter: 'activityId' & 'patternCode' & 'patternName' & 'patternState' & 'patternStatus'
    When User calls "getActivityBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Response should be List of Activities and size should be one
  # Then Response Activity is same which was added
  #Then Activity added exist in returned ActivityList
  
  @getActivityBySearchCriteria
  Scenario: Verify API: getActivityBySearchCriteria API, search by invalid 'activityId'
    Given "System_Admin" User invoke "getActivityBySearchCriteria" with invalid Parameter: "activityId" = "-9"
    When User calls "getActivityBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities with zero records
    
     @getActivityBySearchCriteria
  Scenario: Verify API: getActivityBySearchCriteria API, search by invalid 'activityCode'
    Given "System_Admin" User invoke "getActivityBySearchCriteria" with invalid Parameter: "activityCode" = "invalidActivityCode"
    When User calls "getActivityBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities with zero records

  @getActivityBySearchCriteria
  Scenario: Verify API: getActivityBySearchCriteria API, search by invalid 'activityName'
    Given "System_Admin" User invoke "getActivityBySearchCriteria" with invalid Parameter: "activityName" = "invalidActivityName"
    When User calls "getActivityBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities with zero records

  @getActivityBySearchCriteria
  Scenario: Verify API: getActivityBySearchCriteria API, search by invalid 'activityState'
    Given "System_Admin" User invoke "getActivityBySearchCriteria" with invalid Parameter: "activityState" = "invalidActivityState"
    When User calls "getActivityBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities with zero records

  @getActivityBySearchCriteria
  Scenario: Verify API: getActivityBySearchCriteria API, search by invalid 'activityStatus'
    Given "System_Admin" User invoke "getActivityBySearchCriteria" with invalid Parameter: "activityStatus" = "invalidActivityStatus"
    When User calls "getActivityBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities with zero records

  @deleteActivity
  Scenario: Verify API: deleteActivity update Activity status as Passive
    Given "System_Admin" User invoke deleteActivity with Parameter: "activityId"
    When User calls "deleteActivity" API with "Delete" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return Activity instance
    Then "activityStatus" in response body is "Passive"

  @deleteActivity
  Scenario: Verify API: deleteActivity API,  with invalid activityId
    Given "System_Admin" User invoke "deleteActivity" with invalid Parameter: "activityId" = "-9"
    When User calls "deleteActivity" API with "Delete" http Request
    Then The API call is success with StatusCode 500
    Then "message" in response body is "No pattern found for activityId: -9"

  @deleteActivity
  Scenario: Verify API: deleteActivity API, with no Param
    Given "System_Admin" User deleteActivity with no Param
    When User calls "deleteActivity" API with "Delete" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'activityId' is not present"

  @updateActivity
  Scenario: Verify API: updateActivity API add Activity paylod
    Given "System_Admin" User "Update" Activity Payload with Param = "activityId"
    When User calls "updateActivity" API with "Put" http Request
    Then The API call is success with StatusCode 200
    Then Verify Activity fields gets updated

  @updateActivity
  Scenario: Verify API: updateActivity API, with invalid activityId
    Given "System_Admin" User "Update" Activity Payload  with invalid Param = "activityId" and value="-9"
    When User calls "updateActivity" API with "Put" http Request
    Then The API call is success with StatusCode 500
    Then "message" in response body is "No activity found for activityId: -9"

  @updateActivity
  Scenario: Verify API: updateActivity API, with no activityId
    Given "System_Admin" User "Update" Activity Payload  with no Param
    When User calls "updateActivity" API with "Put" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'activityId' is not present"

  @updateActivity
  Scenario: Verify API: updateActivity API, with no pattern Body
    Given "System_Admin" User "Update" Activity Payload  with no Activity Body and Param = "activityId"
    When User calls "updateActivity" API with "Put" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.activity.entity.Activity com.ibm.dc.activity.controller.ActivityController.updateActivity(java.lang.String,java.lang.Integer,com.ibm.dc.activity.entity.Activity)"
