@DC-Test-Suite
@Test 
Feature: Validating Field-Service APIs

 @getFieldCount
  Scenario: Verify API: getFieldCount API, Get Number of Fields
    Given "System_Admin" User invoke "getFieldCount"
    When User calls "getFieldCount" API with "Get" http Request 
    Then The API call is success with StatusCode 200
    Then Verify fieldCount result is greater than equal to 0
    
     @createField
  Scenario: Verify API: createField API, add Field paylod
    Given "System_Admin" Get Field Payload ready for "Add" operation
    When User calls "createField" API with "Post" http Request
    Then The API call is success with StatusCode 200
    Then Verify responseBody is instance of Field
    Then Print the created Field 
    Then Verify responseBody is same as that of requestBody except:"fieldId,fieldCreatedAt,fieldCreatedBy,fieldUpdatedAt,fieldUpdatedBy,fieldDisplaySequence,fieldParentId"
    Then Verify fieldId="fieldCount"
    Then Verify fieldId="fieldDisplaySequence"
    Then Verify fieldId="fieldParentId"    
    Then "fieldUpdatedAt" in response body is "0000-00-00 00:00:00"
    Then "fieldUpdatedBy" in response body is "NA"
    
  @updateFieldByRuleId
Scenario: Verify API: updateFieldByRuleId API return 'ok' [need clarification on its functionality]
	Given User create new Rule to associate with Field
	Given "System_Admin" Get query Field-> "updateFieldByRuleId" ->Parameters ready for "fieldId,ruleParentId"
	When User calls "updateFieldByRuleId" API with Put http Request
	Then The API call is success with StatusCode 200
	Then Verify Response is string instance and value="ok"