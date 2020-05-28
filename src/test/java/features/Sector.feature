@DC-Test-Suite 
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
	Then Response Sector is same which was added
	
	@getSectorBySearchCriteria 
Scenario: Verify API: getSectorBySearchCriteria API, search by 'sectorName' 
	Given "System_Admin" User invoke getSectorBySearchCriteria with Parameter: "sectorName" 
	When User calls "getSectorBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Sectors 
		Then Created Sector should exist in the List of Sectors
		
		@deleteSector 
Scenario: Verify API: deleteSector update Sector status as Passive 
	Given "System_Admin" User invoke deleteSector with Parameter: "sectorId" 
	When User calls "deleteSector" API with "Delete" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify "SectorStatus" of particular "Sector" updated as Passive
	
	@updateSector 
Scenario: Verify API: updateSector API add Sector paylod 
	Given  "System_Admin" User "Update" Sector Payload 
	When User calls "updateSector" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify 'sectorName','sectorStatus','sectorCreatedBy','sectorCreatedAt' gets updated 
 