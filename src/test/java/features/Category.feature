@DC-Test-Suite
@Category 
Feature: Validating Category API's 

@getCategoryCount 
Scenario: Verify API: getCategoryCount API return Total Category Count 
	Given "System_Admin" User invoke "getCategoryCount" 
	When User calls "getCategoryCount" API with "Get" http Request
	Then The API call is success with StatusCode 200 
	Then Verify category_Count result is greater than 0
	
@createCategory 
Scenario: Verify API: createCategory API add Category paylod 
	Given "System_Admin" "Add" Category Payload 
	When User calls "createCategory" API with "Post" http Request 
	Then The API call is success with StatusCode 200
	Then Verify responseBody is instance of Category
  Then Verify Total category_Count increased by 1
  #---it will be invalid when multiple user trying to add category at the same time
