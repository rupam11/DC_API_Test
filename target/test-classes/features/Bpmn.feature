@DC-Test-Suite 
@BPMN 
Feature: Validating Activity API's 

@getActivityCount 
  Scenario: Verify API: getActivityCount API return Total Activity Count 
    Given User invoke "getActivityCount" 
     When user calls "getActivityCount" API with "Get" http Request 
     Then the API call is success with StatusCode 200 
     Then getCount from Response and verify it is greater than 0 
  
  @createActivity 
  Scenario: Verify API: createActivity API add Activity paylod 
    Given "Add" Activity Payload 
     When user calls "createActivity" API with "Post" http Request 
     Then the API call is success with StatusCode 200 
     Then verify response will return Activity instance 
     Then "activityState" in response body is "Not Started" 
     Then activityId and activitySequence and activityDisplaySequence in response body is equal to output of "getActivityCount" 
     Then "activityName" in response body is 'ACT_activityId' 
  #Then verify task Data::: tastState,taskid,taskCode,taskstatus,activityanme,taskname,taskSquadname, taskSquadType
  
  @getAllActivities 
  Scenario: Verify API: getAllActivities API return List of All Activities 
    Given User invoke "getAllActivities" 
     When user calls "getAllActivities" API with "Get" http Request 
     Then the API call is success with StatusCode 200 
     Then verify response will return List of Activities 
     Then total number of Activity in List is equal to getActivityCount 
     Then Activity added exist in returned ActivityList 
  
  @getActivityBySearchCriteria 
  Scenario: Verify API: getSectorBySearchCriteria API, search no SearchCriteria 
  
    Given User invoke "getActivityBySearchCriteria" 
     When user calls "getActivityBySearchCriteria" API with "Get" http Request 
     Then response should be list all Sectors=getAllActivities 
  
  @getSectorBySearchCriteria 
  Scenario: Verify API: getSectorBySearchCriteria API, search by 'activityCode' created in 'createActivity'
    Given User invoke "getSectorBySearchCriteria" with Parameter: "activityCode" 
     When user calls "getSectorBySearchCriteria" API with "Get" http Request 
     Then response should be list of Activities and size should be one 
     Then response Sector is same which was added 
  
  @getSectorBySearchCriteria 
  Scenario: Verify API: getSectorBySearchCriteria API, search by 'activityId'  created in 'createActivity'
    Given User invoke "getSectorBySearchCriteria" with Parameter: "activityId" 
     When user calls "getSectorBySearchCriteria" API with "Get" http Request 
     Then response should be list of Sectors and size should be one 
     Then response Sector is same which was added 
  
  @getSectorBySearchCriteria 
  Scenario: Verify API: getSectorBySearchCriteria API, search by 'activityStatus' 
    Given User invoke "getSectorBySearchCriteria" with Parameter: "activityStatus" and status="Passive"
     When user calls "getSectorBySearchCriteria" API with "Get" http Request 
     Then response should be list of Sectors with same status
     Then response Sector is same which was added 
  
  @deleteActivtity 
  Scenario: Verify API: deleteActivity update Activity status as Passive created in 'createActivity'
    Given User invoke "deleteActivity" with Parameter: "activityId" 
     When user calls "deleteSector" API with "Delete" http Request 
     Then the API call is success with StatusCode 200 
     Then verify "ActiivtyStatus" of particular "Activity" updated as Passive 
  
  @updateSector 
  Scenario: Verify API: updateActivity API add Activity paylod 
    Given "Update" Activity Payload 
     When user calls "updateActivity" API with "Put" http Request 
     Then the API call is success with StatusCode 200 
     Then verify 'activityCode','activityCode','activitySequence' gets updated 
  
