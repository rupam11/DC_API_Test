@DC-Test-Suite
@Demo
@Pattern
Feature: Validating Pattern-Service APIs

  @getPatternCount
  Scenario: Verify API: getPatternCount API return Total Pattern Count
    Given "System_Admin" User invoke "getPatternCount"
    When User calls "getPatternCount" API with "Get" http Request
    Then Verify Pattern_Count result is greater than or equal to 0
    Then The API call is success with StatusCode 200

  @createPattern
  Scenario: Verify API: createPattern API add Pattern paylod
    Given "System_Admin" User "Add" Pattern Payload with Param = "none"
    When User calls "createPattern" API with "Post" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return Pattern instance
    Then Verify Total Pattern_Count increased by 1

  @createPattern
  Scenario: Verify API: createPattern API with no pattern Body
    Given "System_Admin" User "Add" Pattern Payload  with no Pattern Body and Param = "none"
    When User calls "createPattern" API with "Post" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.pattern.entity.Pattern com.ibm.dc.pattern.controller.PatternController.createPattern(java.lang.String,com.ibm.dc.pattern.entity.Pattern)"

  @getAllPatterns
  Scenario: Verify API: getAllPatterns API return List of All Pattern
    Given "System_Admin" User invoke "getAllPatterns"
    When User calls "getAllPatterns" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Pattern
    Then Total number of Pattern in List is equal to getPatternCount

  #Then Pattern added exist in returned PatternList
  @getPatternBySearchCriteria
  Scenario: Verify API: getPatternBySearchCriteria API, search no SearchCriteria
    Given "System_Admin" User invoke "getPatternBySearchCriteria"
    When User calls "getPatternBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Pattern
    #Then Response should be list all Pattern=getAllPattern
    Then All Pattern should have Active Status

  @getPatternBySearchCriteria
  Scenario: Verify API: getPatternBySearchCriteria API, search by 'patternId'
    Given "System_Admin" User invoke getPatternBySearchCriteria with Parameter: "patternId"
    When User calls "getPatternBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Pattern
    Then Response should be list of Pattern and size should be one

  #Then Response Pattern is same which was added
  #Then Pattern added exist in returned PatternList
  @getPatternBySearchCriteria
  Scenario: Verify API: getPatternBySearchCriteria API, search by 'patternName'
    Given "System_Admin" User invoke getPatternBySearchCriteria with Parameter: "patternName"
    When User calls "getPatternBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Pattern
    Then Each Pattern of returned PatternList should have same pattern "PatternName"

  #Then Pattern added exist in returned PatternList
  @getPatternBySearchCriteria
  Scenario: Verify API: getPatternBySearchCriteria API, search by 'patternState'
    Given "System_Admin" User invoke getPatternBySearchCriteria with Parameter: "patternState"
    When User calls "getPatternBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Pattern
    Then Each Pattern of returned PatternList should have same pattern "patternState"
  #Then Pattern added exist in returned PatternList
  
  @getPatternBySearchCriteria
  Scenario: Verify API: getPatternBySearchCriteria API, search by 'patternStatus'
    Given "System_Admin" User invoke getPatternBySearchCriteria with Parameter: "patternStatus"
    When User calls "getPatternBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Pattern
    Then Each Pattern of returned PatternList should have same pattern "patternStatus"
  # Then Pattern added exist in returned PatternList
  
  @getPatternBySearchCriteria
  Scenario: Verify API: getPatternBySearchCriteria API, search by 'patternId' & 'patternName' & 'patternState' & 'patternStatus'
    Given "System_Admin" User invoke getPatternBySearchCriteria with Parameter: 'patternId' & 'patternName' & 'patternState' & 'patternStatus'
    When User calls "getPatternBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Response should be list of Pattern and size should be one
  # Then Response Pattern is same which was added
  #Then Pattern added exist in returned PatternList
  
  @getPatternBySearchCriteria
  Scenario: Verify API: getPatternBySearchCriteria API, search by invalid 'patternId'
    Given "System_Admin" User invoke "getPatternBySearchCriteria" with invalid Parameter: "patternId" = "-9"
    When User calls "getPatternBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Pattern with zero records

  @getPatternBySearchCriteria
  Scenario: Verify API: getPatternBySearchCriteria API, search by invalid 'patternName'
    Given "System_Admin" User invoke "getPatternBySearchCriteria" with invalid Parameter: "patternName" = "invalidPatternName"
    When User calls "getPatternBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Pattern with zero records

  @getPatternBySearchCriteria
  Scenario: Verify API: getPatternBySearchCriteria API, search by invalid 'patternState'
    Given "System_Admin" User invoke "getPatternBySearchCriteria" with invalid Parameter: "patternState" = "invalidPatternState"
    When User calls "getPatternBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Pattern with zero records

  @getPatternBySearchCriteria
  Scenario: Verify API: getPatternBySearchCriteria API, search by invalid 'patternStatus'
    Given "System_Admin" User invoke "getPatternBySearchCriteria" with invalid Parameter: "patternStatus" = "invalidPatternStatus"
    When User calls "getPatternBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Pattern with zero records

  @deletePattern
  Scenario: Verify API: deletePattern update Pattern status as Passive
    Given "System_Admin" User invoke deletePattern with Parameter: "patternId"
    When User calls "deletePattern" API with "Delete" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return Pattern instance
    Then "patternStatus" in response body is "Passive"

  @deletePattern
  Scenario: Verify API: deletePattern API,  with invalid patternId
    Given "System_Admin" User invoke "deletePattern" with invalid Parameter: "patternId" = "-9"
    When User calls "deletePattern" API with "Delete" http Request
    Then The API call is success with StatusCode 500
    Then "message" in response body is "Pattern with id - -9 not found"

  @deletePattern
  Scenario: Verify API: deletePattern API, with no Param
    Given "System_Admin" User "deletePattern" with no Param
    When User calls "deletePattern" API with "Delete" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'patternId' is not present"

  @updatePattern
  Scenario: Verify API: updatePattern API add Pattern paylod
    Given "System_Admin" User "Update" Pattern Payload with Param = "patternId"
    When User calls "updatePattern" API with "Put" http Request
    Then The API call is success with StatusCode 200
    Then Verify Pattern fields gets updated

  @updatePattern
  Scenario: Verify API: updatePattern API, with invalid patternId
    Given "System_Admin" User "Update" Pattern Payload  with invalid Param = "patternId" and value="-9"
    When User calls "updatePattern" API with "Put" http Request
    Then The API call is success with StatusCode 500
    Then "message" in response body is "Pattern with id - -9 not found"    

  @updatePattern
  Scenario: Verify API: updatePattern API, with no patternId
    Given "System_Admin" User "Update" Pattern Payload  with no Param
    When User calls "updatePattern" API with "Put" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'patternId' is not present"

  @updatePattern
  Scenario: Verify API: updatePattern API, with no pattern Body
    Given "System_Admin" User "Update" Pattern Payload  with no Pattern Body and Param = "patternId"
    When User calls "updatePattern" API with "Put" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.pattern.entity.Pattern com.ibm.dc.pattern.controller.PatternController.updatePattern(java.lang.String,java.lang.Integer,com.ibm.dc.pattern.entity.Pattern)"
