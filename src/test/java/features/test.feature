@DC-Test-Suite @Test
Feature: Validating Field API's

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

  @getFieldCount
  Scenario: Verify API: getFieldCount API, Get Number of Fields
    Given "System_Admin" User invoke "getFieldCount"
    When User calls "getFieldCount" API with "Get" http Request
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
    