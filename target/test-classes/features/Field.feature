@DC-Test-Suite
@Field
@Demo
Feature: Validating Field API's

 @fields/init
Scenario: Verify API: fields/init API, Create Dummy Field [need clarification on its functionality]
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
    Then Verify fieldCount result is greater than equal to 0
    
    @createQuestion
    Scenario: Verify API: createQuestion API, Create Question [need clarification on its validation]
   	Given "System_Admin" Get Field Payload ready for "Pass_Question" operation
    When User calls "createQuestion" API with "Post" http Request
    Then The API call is success with StatusCode 200
    Then Verify responseBody is instance of Field
    Then Verify field->responseBody is same as that of field->requestBody except:"fieldUpdatedAt,fieldUpdatedBy"

     @createField
  Scenario: Verify API: createField API, add Field paylod
    Given "System_Admin" Get Field Payload ready for "Add" operation
    When User calls "createField" API with "Post" http Request
    Then The API call is success with StatusCode 200
    Then Verify responseBody is instance of Field
    Then Print the created Field 
    Then Verify field->responseBody is same as that of field->requestBody except:"fieldId,fieldCreatedAt,fieldCreatedBy,fieldUpdatedAt,fieldUpdatedBy,fieldDisplaySequence,fieldParentId"
    Then Verify fieldId="fieldCount"
    Then Verify fieldId="fieldDisplaySequence"
    Then Verify fieldId="fieldParentId"    
    Then "fieldUpdatedAt" in response body is "0000-00-00 00:00:00"
    Then "fieldUpdatedBy" in response body is "NA"
			
	@getAllFields 
Scenario: Verify API: getAllFields API return List of All Fields
	Given "System_Admin" User invoke "getAllFields" 
	When User calls "getAllFields" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Fields
	Then Field added exist in returned Field List
		Then Verify that total number of Fields in List is equal to getFieldCount
	
	 @getFieldsBySearchCriteria1
Scenario: Verify API: getFieldsBySearchCriteria API, search no SearchCriteria 
	Given "System_Admin" User invoke "getFieldsBySearchCriteria" 
		When User calls "getFieldsBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Fields
	Then Verify that total number of Fields in List is equal to getFieldCount
	 
	
	 @getFieldsBySearchCriteria
Scenario: Verify API: getFieldsBySearchCriteria API, search by 'fieldCategory'
	Given "System_Admin" User invoke Field->"getFieldsBySearchCriteria" with Parameter: "fieldCategory" 
	When User calls "getFieldsBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Fields
	Then Field added exist in returned Field List
	Then Response should be list of Fields and satisfy the search: "fieldCategory"
	
	
	@getFieldsBySearchCriteria
Scenario: Verify API: getFieldsBySearchCriteria API, search by 'fieldIdList'
	Given "System_Admin" User invoke "getAllFields" 
	When User calls "getAllFields" API with "Get" http Request
	Then Verify response will return List of Fields
	Then Save fieldId of 5 fields in fieldIdList
	Given "System_Admin" User invoke Field->"getFieldsBySearchCriteria" with Parameter: "fieldIdList" 
	When User calls "getFieldsBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Fields
	Then Verify fieldCount result is equal to 5
	
	
	@getFieldsBySearchCriteria
Scenario: Verify API: getFieldsBySearchCriteria API, search by 'fieldIndustry'
	Given "System_Admin" User invoke Field->"getFieldsBySearchCriteria" with Parameter: "fieldIndustry" 
	When User calls "getFieldsBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Fields
	Then Field added exist in returned Field List
	Then Response should be list of Fields and satisfy the search: "fieldIndustry"
	
	
	@getFielBySearchCriteria
Scenario: Verify API: getFieldsBySearchCriteria API, search by 'fieldName'
	Given "System_Admin" User invoke Field->"getFieldsBySearchCriteria" with Parameter: "fieldName" 
	When User calls "getFieldsBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Fields
	Then Field added exist in returned Field List
	Then Response should be list of Fields and satisfy the search: "fieldName"
	
		
	@getFieldsBySearchCriteria
Scenario: Verify API: getFieldsBySearchCriteria API, search by 'fieldSector'
	Given "System_Admin" User invoke Field->"getFieldsBySearchCriteria" with Parameter: "fieldSector" 
	When User calls "getFieldsBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Fields
	Then Field added exist in returned Field List
	Then Response should be list of Fields and satisfy the search: "fieldSector"
		
	
	@getFieldsBySearchCriteria
Scenario: Verify API: getFieldsBySearchCriteria API, search by 'fieldTemplateName'
	Given "System_Admin" User invoke Field->"getFieldsBySearchCriteria" with Parameter: "fieldTemplateName" 
	When User calls "getFieldsBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Fields
	Then Field added exist in returned Field List
		Then Response should be list of Fields and satisfy the search: "fieldTemplateName"
	
	@getFieldsBySearchCriteria
Scenario: Verify API: getFieldsBySearchCriteria API, search by 'fieldVersion'
	Given "System_Admin" User invoke Field->"getFieldsBySearchCriteria" with Parameter: "fieldVersion" 
	When User calls "getFieldsBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Fields
	Then Field added exist in returned Field List
	Then Response should be list of Fields and satisfy the search: "fieldVersion"
		
	
@updateField
Scenario: Verify API: updateField API add Field paylod 
	Given "System_Admin" Get Field Payload ready for "Update" operation
	When User calls "updateField" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify responseBody is instance of Field
	Then Verify field->responseBody is same as that of field->requestBody except:"fieldUpdatedAt,fieldUpdatedBy"

@updateFieldByRuleId
Scenario: Verify API: updateFieldByRuleId API return 'ok' [need clarification on its functionality]
	Given User create new Rule to associate with Field
	Given "System_Admin" Get query Field-> "updateFieldByRuleId" ->Parameters ready for "fieldId,ruleParentId"
	When User calls "updateFieldByRuleId" API with Put http Request
	Then The API call is success with StatusCode 200
	Then Verify Response is string instance and value="ok"
	
	@deleteField
Scenario: Verify API: deleteField API, update Field status as Passive 
	Given "System_Admin" User invoke Field->"deleteField" with Parameter: "fieldId" 
	When User calls "deleteField" API with "Delete" http Request 
	Then The API call is success with StatusCode 200
	Then Verify responseBody is instance of Field
	Then "fieldStatus" in response body is "Passive"	