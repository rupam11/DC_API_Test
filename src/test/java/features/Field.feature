@DC-Test-Suite
@Field 
Feature: Validating Field API's 

@getFieldCount
Scenario: Verify API: getFieldCount API, Get Number of Fields
	Given "System_Admin" User invoke "getFieldCount"
	When User calls "getFieldCount" API with "Get" http Request
	Then The API call is success with StatusCode 200 
	Then Response should be list of Tasks and satisfy the search: "taskApplicable"  
#	Then Response Task is added should be filtered
	
@createField
Scenario: Verify API: createField API, add Field paylod
	Given "System_Admin" User "Add" Field Payload 
	When User calls "createField" API with "Post" http Request
	Then The API call is success with StatusCode 200 
	Then Verify task_Count result is greater than 0
	
@deleteField
Scenario: Verify API: deleteField API, update Field status as Passive 
	Given "System_Admin"  User invoke "deleteField" with Parameter: "fieldId" 
	When User calls "deleteField" API with "Delete" http Request 
	Then The API call is success with StatusCode 200
	Then "fieldStatus" in response body is "Passive"
	
@fields/init
Scenario: Verify API: fields/init API, Create Dummy Field
	Given "System_Admin" User invoke "fields/init" 
	When User calls "fields/init" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Tasks
	Then Total number of Task in List is equal to getTaskCount
	#Then Task added exist in returned TaskList
	
@getAllFields
Scenario: Verify API: getAllFields API return List of All Fields
	Given "System_Admin" User invoke "getAllFields" 
	When User calls "getAllFields" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Fields
	Then Total number of Fields in List is equal to getFieldCount
	 

	
@getFieldsBySearchCriteria
Scenario: Verify API: getFieldsBySearchCriteria API, search by 'fieldCategory'
	Given "System_Admin" User invoke "getFieldsBySearchCriteria" with Parameter: "fieldCategory" 
	When User calls "getFieldsBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Response should be list of Tasks and satisfy the search: "taskDescription"  
#	Then Response Task is added should be filtered  
	
@updateField
Scenario: Verify API: updateField API, Update Field attributes successfully
	Given "System_Admin" User "Update" Field Payload 
	When User calls "updateField" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then "taskStatus" in response body is "Passive"
	
@updateFieldByRuleId
Scenario: Verify API: updateFieldByRuleId API, Update Field By Rule Id
	Given "System_Admin" User invoke "getFieldsBySearchCriteria" with Parameter: "fieldId","ruleParentId" 
	When User calls "updateFieldByRuleId" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify Task fields gets updated

  @fields/init
  Scenario: Verify API: fields/init API, Create Dummy Field
    Given "System_Admin" User invoke "fields/init"
    When User calls "fields_init" API with "Get" http Request
    Then The API call is success with StatusCode 200

  @getAllFields
  Scenario: Verify API: getAllFields API, Get All Fields
    Given "System_Admin" User invoke "getAllFields"
    When User calls "getAllFields" API with "Get" http Request
    Then The API call is success with StatusCode 200
    
    
  @getFieldsBySearchCriteria
  Scenario: Verify API: getFieldsBySearchCriteria API, search by 'fieldCategory'
    Given "System_Admin" User invoke "getFieldsBySearchCriteria" with Parameter: "fieldCategory"
    When User calls "getFieldsBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    
  @deleteField
  Scenario: Verify API: deleteField API, update Field status as Passive
    Given "System_Admin"  User invoke "deleteField" with Parameter: "fieldId"
    When User calls "deleteField" API with "Delete" http Request
    Then The API call is success with StatusCode 200
    Then "fieldStatus" in response body is "Passive"
    
  