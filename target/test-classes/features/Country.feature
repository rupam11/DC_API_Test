@DC-Test-Suite
@Demo
@Country

Feature: Validating Country-Service APIs

@getCountryCount 
Scenario: Verify API: getCountryCount API return Total Country Count 
	Given "System_Admin" User invoke "getCountryCount"
	When User calls "getCountryCount" API with "Get" http Request 
	Then Verify country_Count result is greater than 0
	Then The API call is success with StatusCode 200 
		
@createCountry 
Scenario: Verify API: createCountry API add Country payload 
	Given "System_Admin" User "Add" Country Payload 
	When User calls "createCountry" API with "Post" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return Country instance 
	Then Verify Total country_Count increased by 1
	
	
 @createCountry
  Scenario: Verify API: createCountry API with no country Body
    Given "System_Admin" User "Add" Country Payload  with no Country Body
    When User calls "createCountry" API with "Post" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.country.entity.Country com.ibm.dc.country.controller.CountryController.createCountry(java.lang.String,com.ibm.dc.country.entity.Country)"
    
    @getAllIndusties 
Scenario: Verify API: getAllCountries API return List of All Countries 
	Given "System_Admin" User invoke "getAllCountries"
	When User calls "getAllCountries" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Countries
	Then Total number of Country in List is equal to getCountryCount 
	Then Country added exist in returned Country List 
    
    @getCountryBySearchCriteria 
Scenario: Verify API: getCountryBySearchCriteria API, search no SearchCriteria 
	Given "System_Admin" User invoke "getCountryBySearchCriteria" 
	When User calls "getCountryBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Countries 
	Then Response should be list all Countries=getAllCountries
#	Then All Countries should have Active Status
	
	@getCountryBySearchCriteria 
Scenario: Verify API: getCountryBySearchCriteria API, search by 'countryId' 
	Given "System_Admin" User invoke getCountryBySearchCriteria with Parameter: "countryId" 
	When User calls "getCountryBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Countries 
	Then Response should be list of Countries and size should be one 
	Then Country added exist in returned Country List
	
	@getCountryBySearchCriteria 
Scenario: Verify API: getCountryBySearchCriteria API, search by 'countryName' 
	Given "System_Admin" User invoke getCountryBySearchCriteria with Parameter: "countryName" 
	When User calls "getCountryBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Countries 
		Then Country added exist in returned Country List
		
		@getCountryBySearchCriteria 
Scenario: Verify API: getCountryBySearchCriteria API, search by 'countrySectorName' 
	Given "System_Admin" User invoke getCountryBySearchCriteria with Parameter: "countrySectorName" 
	When User calls "getCountryBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200
		Then Verify response will return List of Countries
		Then Country added exist in returned Country List
  
  @getCountryBySearchCriteria
  Scenario: Verify API: getCountryBySearchCriteria API, search by 'countryId' & 'countryName' & 'countrySectorName'
    Given "System_Admin" User invoke getCountryBySearchCriteria with Parameter: 'countryId' & 'countryName' & 'countrySectorName'
    When User calls "getCountryBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Countries
    Then Response should be list of Countries and size should be one 
   Then Country added exist in returned Country List
 
  @getCountryBySearchCriteria
  Scenario: Verify API: getCountryBySearchCriteria API, search by invalid 'countryId'
    Given "System_Admin" User invoke "getCountryBySearchCriteria" with invalid Parameter: "countryId" = "-9"
    When User calls "getCountryBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Countries with zero records

  @getCountryBySearchCriteria
  Scenario: Verify API: getCountryBySearchCriteria API, search by invalid 'countryName'
    Given "System_Admin" User invoke "getCountryBySearchCriteria" with invalid Parameter: "countryName" = "invalidCountryName"
    When User calls "getCountryBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Countries with zero records
    
    @getCountryBySearchCriteria
  Scenario: Verify API: getCountryBySearchCriteria API, search by invalid 'countryGeographyName'
    Given "System_Admin" User invoke "getCountryBySearchCriteria" with invalid Parameter: "countryGeographyName" = "invalidCountryGeographyName"
    When User calls "getCountryBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Countries with zero records
 
 @deleteCountry 
Scenario: Verify API: deleteCountry update Country status as Passive 
	Given "System_Admin" User invoke deleteCountry with Parameter: "countryId" 
	When User calls "deleteCountry" API with "Delete" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify CountryStatus of particular Country updated as Passive
	
	
  @deleteCountry
  Scenario: Verify API: deleteCountry API,  with invalid countryId
    Given "System_Admin" User invoke "deleteCountry" with invalid Parameter: "countryId" = "-9"
    When User calls "deleteCountry" API with "Delete" http Request
    Then The API call is failed with StatusCode 500
    Then "message" in response body is "Country with id - -9 not found"

  @deleteCountry
  Scenario: Verify API: deleteCountry API, with no Param
    Given "System_Admin" User "deleteCountry" with no Param
    When User calls "deleteCountry" API with "Delete" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'countryId' is not present"	
 
 @updateCountry 
Scenario: Verify API: updateCountry API add Country paylod 
	Given  "System_Admin" User "Update" Country Payload 
	When User calls "updateCountry" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify Country fields gets updated

  @updateCountry
  Scenario: Verify API: updateCountry API, with no Country Body
    Given "System_Admin" User "Update" Country Payload  with no Country Body
    When User calls "updateCountry" API with "Put" http Request
    Then The API call is failed with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.country.entity.Country com.ibm.dc.country.controller.CountryController.updateCountry(java.lang.String,com.ibm.dc.country.entity.Country)"
    

  