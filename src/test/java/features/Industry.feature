@DC-Test-Suite
@Demo
@Industry

Feature: Validating Industry-Service APIs

@getIndustryCount 
Scenario: Verify API: getIndustryCount API return Total Industry Count 
	Given "System_Admin" User invoke "getIndustryCount"
	When User calls "getIndustryCount" API with "Get" http Request 
	Then Verify industry_Count result is greater than 0
	Then The API call is success with StatusCode 200 
		
@createIndustry 
Scenario: Verify API: createIndustry API add Industry payload 
	Given "System_Admin" User "Add" Industry Payload 
	When User calls "createIndustry" API with "Post" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return Industry instance 
	Then Verify Total industry_Count increased by 1
	
	
 @createIndustry
  Scenario: Verify API: createIndustry API with no industry Body
    Given "System_Admin" User "Add" Industry Payload  with no Industry Body
    When User calls "createIndustry" API with "Post" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.industry.entity.Industry com.ibm.dc.industry.controller.IndustryController.createIndustry(java.lang.String,com.ibm.dc.industry.entity.Industry)"
    
    @getAllIndusties 
Scenario: Verify API: getAllIndustries API return List of All Industries 
	Given "System_Admin" User invoke "getAllIndustries"
	When User calls "getAllIndustries" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Industries
	Then Total number of Industry in List is equal to getIndustryCount 
	Then Industry added exist in returned Industry List 
    
    @getIndustryBySearchCriteria 
Scenario: Verify API: getIndustryBySearchCriteria API, search no SearchCriteria 
	Given "System_Admin" User invoke "getIndustryBySearchCriteria" 
	When User calls "getIndustryBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Industries 
	#Then Response should be list all Industries=getAllIndustries
	Then All Industries should have Active Status
	
	@getIndustryBySearchCriteria 
Scenario: Verify API: getIndustryBySearchCriteria API, search by 'industryId' 
	Given "System_Admin" User invoke getIndustryBySearchCriteria with Parameter: "industryId" 
	When User calls "getIndustryBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Industries 
	Then Response should be list of Industries and size should be one 
	Then Industry added exist in returned Industry List
	
	@getIndustryBySearchCriteria 
Scenario: Verify API: getIndustryBySearchCriteria API, search by 'industryName' 
	Given "System_Admin" User invoke getIndustryBySearchCriteria with Parameter: "industryName" 
	When User calls "getIndustryBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Industries 
		Then Industry added exist in returned Industry List
		
		@getIndustryBySearchCriteria 
Scenario: Verify API: getIndustryBySearchCriteria API, search by 'industrySectorName' 
	Given "System_Admin" User invoke getIndustryBySearchCriteria with Parameter: "industrySectorName" 
	When User calls "getIndustryBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Industries
		Then Industry added exist in returned Industry List
  
  @getIndustryBySearchCriteria
  Scenario: Verify API: getIndustryBySearchCriteria API, search by 'industryId' & 'industryName' & 'industrySectorName'
    Given "System_Admin" User invoke getIndustryBySearchCriteria with Parameter: 'industryId' & 'industryName' & 'industrySectorName'
    When User calls "getIndustryBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Industries
    Then Response should be list of Industries and size should be one 
   Then Industry added exist in returned Industry List
 
  @getIndustryBySearchCriteria
  Scenario: Verify API: getIndustryBySearchCriteria API, search by invalid 'industryId'
    Given "System_Admin" User invoke "getIndustryBySearchCriteria" with invalid Parameter: "industryId" = "-9"
    When User calls "getIndustryBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Industries with zero records

  @getIndustryBySearchCriteria
  Scenario: Verify API: getIndustryBySearchCriteria API, search by invalid 'industryName'
    Given "System_Admin" User invoke "getIndustryBySearchCriteria" with invalid Parameter: "industryName" = "invalidIndustryName"
    When User calls "getIndustryBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Industries with zero records
    
    @getIndustryBySearchCriteria
  Scenario: Verify API: getIndustryBySearchCriteria API, search by invalid 'industrySectorName'
    Given "System_Admin" User invoke "getIndustryBySearchCriteria" with invalid Parameter: "industrySectorName" = "invalidIndustrySectorName"
    When User calls "getIndustryBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Industries with zero records
 
 @deleteIndustry 
Scenario: Verify API: deleteIndustry update Industry status as Passive 
	Given "System_Admin" User invoke deleteIndustry with Parameter: "industryId" 
	When User calls "deleteIndustry" API with "Delete" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify IndustryStatus of particular Industry updated as Passive
	
	
  @deleteIndustry
  Scenario: Verify API: deleteIndustry API,  with invalid industryId
    Given "System_Admin" User invoke "deleteIndustry" with invalid Parameter: "industryId" = "-9"
    When User calls "deleteIndustry" API with "Delete" http Request
    Then The API call is failed with StatusCode 500
    Then "message" in response body is "Industry with id - -9 not found"

  @deleteIndustry
  Scenario: Verify API: deleteIndustry API, with no Param
    Given "System_Admin" User "deleteIndustry" with no Param
    When User calls "deleteIndustry" API with "Delete" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'industryId' is not present"	
 
 @updateIndustry 
Scenario: Verify API: updateIndustry API add Industry paylod 
	Given  "System_Admin" User "Update" Industry Payload 
	When User calls "updateIndustry" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify Industry fields gets updated

  @updateIndustry
  Scenario: Verify API: updateIndustry API, with no Industry Body
    Given "System_Admin" User "Update" Industry Payload  with no Industry Body
    When User calls "updateIndustry" API with "Put" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.industry.entity.Industry com.ibm.dc.industry.controller.IndustryController.updateIndustry(java.lang.String,com.ibm.dc.industry.entity.Industry)"
    

  