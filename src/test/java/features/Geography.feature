@DC-Test-Suite
@Demo
@Geography

Feature: Validating Geography-Service APIs

@getGeographyCount 
Scenario: Verify API: getGeographyCount API return Total Geography Count 
	Given "System_Admin" User invoke "getGeographyCount"
	When User calls "getGeographyCount" API with "Get" http Request 
	Then Verify geography_Count result is greater than 0
	Then The API call is success with StatusCode 200 
		
@createGeography 
Scenario: Verify API: createGeography API add Geography payload 
	Given "System_Admin" User "Add" Geography Payload
	When User calls "createGeography" API with "Post" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return Geography instance 
	Then Verify Total geography_Count increased by 1
	
	
 @createGeography
  Scenario: Verify API: createGeography API with no geography Body
    Given "System_Admin" User invoke "createGeography"
    When User calls "createGeography" API with "Post" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.geo.entity.Geography com.ibm.dc.geo.controller.GeographyController.createGeography(java.lang.String,com.ibm.dc.geo.entity.Geography)"
    
    @getAllIndusties 
Scenario: Verify API: getAllGeographies API return List of All Geographies 
	Given "System_Admin" User invoke "getAllGeographies"
	When User calls "getAllGeographies" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Geographies
	Then Total number of Geography in List is equal to getGeographyCount 
	Then Geography added exist in returned Geography List 
    
    @getGeographyBySearchCriteria 
Scenario: Verify API: getGeographyBySearchCriteria API, search no SearchCriteria 
	Given "System_Admin" User invoke "getGeographyBySearchCriteria" 
	When User calls "getGeographyBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Geographies 
	Then Response should be list all Geographies=getAllGeographies
	#Then All Geographies should have Active Status
	
	@getGeographyBySearchCriteria 
Scenario: Verify API: getGeographyBySearchCriteria API, search by 'geographyId' 
	Given "System_Admin" User invoke getGeographyBySearchCriteria with Parameter: "geographyId" 
	When User calls "getGeographyBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Geographies 
	Then Response should be list of Geographies and size should be one 
	Then Geography added exist in returned Geography List
	
	@getGeographyBySearchCriteria 
Scenario: Verify API: getGeographyBySearchCriteria API, search by 'geographyName' 
	Given "System_Admin" User invoke getGeographyBySearchCriteria with Parameter: "geographyName" 
	When User calls "getGeographyBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Geographies 
		Then Geography added exist in returned Geography List
		
	 @getGeographyBySearchCriteria
  Scenario: Verify API: getGeographyBySearchCriteria API, search by 'geographyId' & 'geographyName'
    Given "System_Admin" User invoke getGeographyBySearchCriteria with Parameter: 'geographyId' & 'geographyName'
    When User calls "getGeographyBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Geographies
    Then Response should be list of Geographies and size should be one 
   Then Geography added exist in returned Geography List
 
  @getGeographyBySearchCriteria
  Scenario: Verify API: getGeographyBySearchCriteria API, search by invalid 'geographyId'
    Given "System_Admin" User invoke "getGeographyBySearchCriteria" with invalid Parameter: "geographyId" = "-9"
    When User calls "getGeographyBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Geographies with zero records

  @getGeographyBySearchCriteria
  Scenario: Verify API: getGeographyBySearchCriteria API, search by invalid 'geographyName'
    Given "System_Admin" User invoke "getGeographyBySearchCriteria" with invalid Parameter: "geographyName" = "invalidGeographyName"
    When User calls "getGeographyBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Geographies with zero records
    
 @deleteGeography 
Scenario: Verify API: deleteGeography update Geography status as Passive 
	Given "System_Admin" User invoke deleteGeography with Parameter: "geographyId" 
	When User calls "deleteGeography" API with "Delete" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify GeographyStatus of particular Geography updated as Passive
	
	
  @deleteGeography
  Scenario: Verify API: deleteGeography API,  with invalid geographyId
    Given "System_Admin" User invoke "deleteGeography" with invalid Parameter: "geographyId" = "-9"
    When User calls "deleteGeography" API with "Delete" http Request
    Then The API call is failed with StatusCode 500
    Then "message" in response body is "Geography with id - -9 not found"

  @deleteGeography
  Scenario: Verify API: deleteGeography API, with no Param
    Given "System_Admin" User "deleteGeography" with no Param
    When User calls "deleteGeography" API with "Delete" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'geographyId' is not present"	
 
  @updateGeography
  Scenario: Verify API: updateGeography API add Geography paylod
    Given "System_Admin" User "Update" Geography Payload
    When User calls "updateGeography" API with "Put" http Request
    Then The API call is success with StatusCode 200
    Then Verify Geography fields gets updated

  @updateGeography
  Scenario: Verify API: updateGeography API, with no geography Body
    Given "System_Admin" User invoke "getGeographyCount"
    When User calls "updateGeography" API with "Put" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.geo.entity.Geography com.ibm.dc.geo.controller.GeographyController.updateGeography(java.lang.String,com.ibm.dc.geo.entity.Geography)"
    
  