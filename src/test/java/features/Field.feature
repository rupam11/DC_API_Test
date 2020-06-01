@DC-Test-Suite
@Field
Feature: Validating Field API's

 @fields/init
Scenario: Verify API: fields/init API, Create Dummy Field
	Given "System_Admin" User invoke "fields/init" 
	When User calls "fields_init" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then "fieldVersion" in response body is "1.0"
	Then "fieldUsability" in response body is "0"
	
  @getFieldCount
  Scenario: Verify API: getFieldCount API, Get Number of Fields
    Given "System_Admin" User invoke "getFieldCount"
    When User calls "getFieldCount" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify field_Count result is greater than 0

  @createField
  Scenario: Verify API: createField API, add Field paylod
    Given "System_Admin" User "Add" Field Payload
    When User calls "createField" API with "Post" http Request
    Then The API call is success with StatusCode 200
    Then Verify responseBody is instance of Field
		Then Verify Total field_Count increased by 1
	#Then Verify fieldId, fieldequence, taskDisplaySequence is equal to total_task_count
	#Then Verify Task_Code is equal to 'TSK_task_count'
	#Then Compare requestBody and ResponseBody
	
	@getAllFields 
Scenario: Verify API: getAllFields API return List of All Fields
	Given "System_Admin" User invoke "getAllFields" 
	When User calls "getAllFields" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Fields
	Then Verify that total number of Fields in List is equal to getFieldCount
	Then Field added exist in returned FieldList
	
	@getFieldsBySearchCriteria
Scenario: Verify API: getFieldsBySearchCriteria API, search by 'fieldCategory'
	Given "System_Admin" User invoke "getFieldsBySearchCriteria" with Parameter: "fieldCategory" 
	When User calls "getFieldsBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Response should be list of Fields and satisfy the search: "fieldCategory"  
	
	@deleteField
Scenario: Verify API: deleteField API, update Field status as Passive 
	Given "System_Admin"  User invoke "deleteField" with Parameter: "fieldId" 
	When User calls "deleteField" API with "Delete" http Request 
	Then The API call is success with StatusCode 200
	Then "fieldStatus" in response body is "Passive"
	
