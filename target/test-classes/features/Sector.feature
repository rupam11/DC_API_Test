@DC-Test-Suite
@Demo
@Sector

Feature: Validating Sector-Service APIs 

@getSectorCount 
Scenario: Verify API: getSectorCount API return Total Sector Count 
	Given "System_Admin" User invoke "getSectorCount"
	When User calls "getSectorCount" API with "Get" http Request 
	Then Verify sector_Count result is greater than 0
	Then The API call is success with StatusCode 200 
		
@createSector 
Scenario: Verify API: createSector API add Sector paylod 
	Given "System_Admin" User "Add" Sector Payload 
	When User calls "createSector" API with "Post" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return Sector instance 
	Then Verify Total sector_Count increased by 1

 @createSector
  Scenario: Verify API: createSector API with no sector Body
    Given "System_Admin" User "Add" Sector Payload  with no Sector Body and Param = "none"
    When User calls "createSector" API with "Post" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.sector.entity.Sector com.ibm.dc.sector.controller.SectorController.createSector(java.lang.String,com.ibm.dc.sector.entity.Sector)"    

@getAllSectors 
Scenario: Verify API: getAllSectors API return List of All Sectors 
	Given "System_Admin" User invoke "getAllSectors"
	When User calls "getAllSectors" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Sectors 
	Then Total number of Sector in List is equal to getSectorCount 
	Then Sector added exist in returned SectorList 
			
@getSectorBySearchCriteria 
Scenario: Verify API: getSectorBySearchCriteria API, search no SearchCriteria 
	Given "System_Admin" User invoke "getSectorBySearchCriteria" 
	When User calls "getSectorBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Sectors 
	#Then Response should be list all Sectors=getAllSectors
	Then All Sectors should have Active Status
	
	@getSectorBySearchCriteria 
Scenario: Verify API: getSectorBySearchCriteria API, search by 'searchId' 
	Given "System_Admin" User invoke getSectorBySearchCriteria with Parameter: "sectorId" 
	When User calls "getSectorBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Sectors 
	Then Response should be list of Sectors and size should be one 
	Then Sector added exist in returned SectorList
	
	@getSectorBySearchCriteria 
Scenario: Verify API: getSectorBySearchCriteria API, search by 'sectorName' 
	Given "System_Admin" User invoke getSectorBySearchCriteria with Parameter: "sectorName" 
	When User calls "getSectorBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Sectors 
		Then Sector added exist in returned SectorList
		
		@getSectorBySearchCriteria
  Scenario: Verify API: getSectorBySearchCriteria API, search by 'sectorId' & 'sectorName'
    Given "System_Admin" User invoke getSectorBySearchCriteria with Parameter: 'sectorId' & 'sectorName'
    When User calls "getSectorBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Sectors
    Then Response should be list of Sectors and size should be one 
   Then Sector added exist in returned SectorList
    
     @getSectorBySearchCriteria
  Scenario: Verify API: getSectorBySearchCriteria API, search by invalid 'sectorId'
    Given "System_Admin" User invoke "getSectorBySearchCriteria" with invalid Parameter: "sectorId" = "-9"
    When User calls "getSectorBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Sectors with zero records

  @getSectorBySearchCriteria
  Scenario: Verify API: getSectorBySearchCriteria API, search by invalid 'sectorName'
    Given "System_Admin" User invoke "getSectorBySearchCriteria" with invalid Parameter: "sectorName" = "invalidSectorName"
    When User calls "getSectorBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Sectors with zero records
		
		@deleteSector 
Scenario: Verify API: deleteSector update Sector status as Passive 
	Given "System_Admin" User invoke deleteSector with Parameter: "sectorId" 
	When User calls "deleteSector" API with "Delete" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify SectorStatus of particular Sector updated as Passive
	
	
  @deleteSector
  Scenario: Verify API: deleteSector API,  with invalid sectorId
    Given "System_Admin" User invoke "deleteSector" with invalid Parameter: "sectorId" = "-9"
    When User calls "deleteSector" API with "Delete" http Request
    Then The API call is failed with StatusCode 500
    Then "message" in response body is "Sector with id - -9 not found"

  @deleteSector
  Scenario: Verify API: deleteSector API, with no Param
    Given "System_Admin" User "deleteSector" with no Param
    When User calls "deleteSector" API with "Delete" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'sectorId' is not present"	
	
	@updateSector 
Scenario: Verify API: updateSector API add Sector paylod 
	Given  "System_Admin" User "Update" Sector Payload 
	When User calls "updateSector" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify 'sectorName','sectorStatus','sectorCreatedBy','sectorCreatedAt' gets updated for given Sector

  @updateSector
  Scenario: Verify API: updateSector API, with no sector Body
    Given "System_Admin" User "Update" Sector Payload  with no Sector Body and Param = "sectorId"
    When User calls "updateSector" API with "Put" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.sector.entity.Sector com.ibm.dc.sector.controller.SectorController.updateSector(java.lang.String,com.ibm.dc.sector.entity.Sector)"
    

  