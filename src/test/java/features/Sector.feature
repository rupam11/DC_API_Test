@DC-Test-Suite 
@Sector 
Feature: Validating Sector-Service APIs 

@getSectorCount 
Scenario: Verify API: getSectorCount API return Total Sector Count 
	Given User invoke "getSectorCount" 
	When user calls "getSectorCount" API with "Get" http Request 
	Then getCount from Response and verify it is >=0 
	Then the API call is success with StatusCode 200 
	
	
@createSector 
Scenario: Verify API: createSector API add Sector paylod 
	Given "Add" Sector Payload 
	When user calls "createSector" API with "Post" http Request 
	Then the API call is success with StatusCode 200 
	Then verify response will return Sector instance 
	
@getAllSectors 
Scenario: Verify API: getAllSectors API return List of All Sectors 
	Given User invoke "getAllSectors" 
	When user calls "getAllSectors" API with "Get" http Request 
	Then the API call is success with StatusCode 200 
	Then verify response will return List of Sectors 
	Then total number of Sector in List is equal to getSectorCount 
	Then Sector added exist in returned SectorList 
	
@getSectorBySearchCriteria 
Scenario: Verify API: getSectorBySearchCriteria API, search no SearchCriteria 
	Given User invoke "getSectorBySearchCriteria" 
	When user calls "getSectorBySearchCriteria" API with "Get" http Request 
	Then response should be list all Sectors=getAllSectors 
	
@getSectorBySearchCriteria 
Scenario: Verify API: getSectorBySearchCriteria API, search by 'searchId' 
	Given User invoke "getSectorBySearchCriteria" with Parameter: "sectorId" 
	When user calls "getSectorBySearchCriteria" API with "Get" http Request 
	Then response should be list of Sectors and size should be one 
	Then response Sector is same which was added 
	
@getSectorBySearchCriteria 
Scenario: Verify API: getSectorBySearchCriteria API, search by 'sectorName' 
	Given User invoke "getSectorBySearchCriteria" with Parameter: "sectorName" 
	When user calls "getSectorBySearchCriteria" API with "Get" http Request 
	Then response should be list of Sectors and size should be one 
	Then response Sector is same which was added 
	
@deleteSector 
Scenario: Verify API: deleteSector update Sector status as Passive 
	Given User invoke "deleteSector" with Parameter: "sectorId" 
	When user calls "deleteSector" API with "Delete" http Request 
	Then the API call is success with StatusCode 200 
	Then verify "SectorStatus" of particular "Sector" updated as Passive 
	
@updateSector 
Scenario: Verify API: updateSector API add Sector paylod 
	Given "Update" Sector Payload 
	When user calls "updateSector" API with "Put" http Request 
	Then the API call is success with StatusCode 200 
	Then verify 'sectorName','sectorStatus','sectorCreatedBy','sectorCreatedAt' gets updated 
