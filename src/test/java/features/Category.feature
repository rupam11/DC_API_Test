@DC-Test-Suite
@Demo
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
  
@createCategory 
#-ve scenario with No body
Scenario: Verify API: createCategory API add without Category paylod 
	Given "System_Admin" User invoke "createCategory" 
	When User calls "createCategory" API with "Post" http Request 
	Then The API call is success with StatusCode 400
	
@getAllCategories 
Scenario: Verify API: getAllCategories API return List of All Categories 
	Given "System_Admin" User invoke "getAllCategories" 
	When User calls "getAllCategories" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Categories
	Then Verify Category added exist in returned CategoryList
#	Then Total number of Category in List is equal to getCategoryCount


@getCategoryListbyName
Scenario: Verify API: getCategoryListbyName API, search by 'categoryName' 
	Given "System_Admin" User invoke CategoryAPI "getCategoryListbyName" with Parameter: "categoryName" 
	When User calls "getCategoryListbyName" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Response should be list of Categories and satisfy the search: "categoryName"  



@getCategoryListbyName
#-Ve Scenario getCategoryListbyName with no 'CategoryName'
Scenario: Verify API: getCategoryListbyName API  with no 'CategoryName'
	Given "System_Admin" User invoke "getCategoryListbyName"
	When User calls "getCategoryListbyName" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Categories


@getCategoryListbyName
#-Ve Scenario getCategoryListbyName with CategoryId
Scenario: Verify API: getCategoryListbyName API, search by 'CategoryId' 
	Given "System_Admin" User invoke CategoryAPI "getCategoryListbyName" with Parameter: "categoryId" 
	When User calls "getCategoryListbyName" API with "Get" http Request 
	Then The API call is success with StatusCode 500 
##---Issue with API	
#It should not return any result with categoryId


@getCategoryBySearchCriteria 
Scenario: Verify API: getCategoryBySearchCriteria API, with no SearchCriteria 
	Given "System_Admin" User invoke "getCategoryBySearchCriteria" 
	When User calls "getCategoryBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200 
	Then Verify response should be list all Categories=getAllCategories
##---Issue with API	
	

	
@getCategoryBySearchCriteria
Scenario: Verify API: getCategoryBySearchCriteria API, search by 'CategoryId' 
	Given "System_Admin" User invoke CategoryAPI "getCategoryBySearchCriteria" with Parameter: "categoryId" 
	When User calls "getCategoryBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Response should be list of Categories and satisfy the search: "categoryId"  
	Then Response should be list of Category and size should be one 

	
@getCategoryBySearchCriteria
Scenario: Verify API: getCategoryBySearchCriteria API, search by 'CategoryName' 
	Given "System_Admin" User invoke CategoryAPI "getCategoryBySearchCriteria" with Parameter: "categoryName"
	When User calls "getCategoryBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Categories


@getCategoryBySearchCriteria
Scenario: Verify API: getCategoryBySearchCriteria API, search by 'CategoryStatus' 
	Given "System_Admin" User invoke CategoryAPI "getCategoryBySearchCriteria" with Parameter: "categoryStatus"
	When User calls "getCategoryBySearchCriteria" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Categories
	
@getCategoryBySearchCriteria
#-Ve Scenario
  Scenario: Verify API: getCategoryBySearchCriteria API, search by invalid 'categoryId'
    Given "System_Admin" User invoke "getCategoryBySearchCriteria" with invalid Category Parameter: "categoryId" = "-9"
    When User calls "getCategoryBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Category with zero records
    	
@getCategoryBySearchCriteria
#-Ve Scenario
  Scenario: Verify API: getCategoryBySearchCriteria API, search by invalid 'categoryName'
    Given "System_Admin" User invoke "getCategoryBySearchCriteria" with invalid Category Parameter: "categoryName" = "InvalidcategoryName"
    When User calls "getCategoryBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Category with zero records
    
	
@getCategoryNotinList
Scenario: Verify API: getCategoryNotinList API, to serach list of categories other than Parameter 
	Given "System_Admin" User invoke CategoryAPI getCategoryNotinList with Parameter: "categoryParentId"
	When User calls "getCategoryNotinList" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
###Not able to send array as parameter	

@getCategoryNotinList
Scenario: Verify API: getCategoryNotinList API, with Invalid CategoryParanetId 
	Given "System_Admin" User invoke "getCategoryNotinList" with invalid Category Parameter: "categoryParentId" = "-9"
	#Given "System_Admin" User invoke CategoryAPI getCategoryNotinList with Parameter: "categoryParentId"
	When User calls "getCategoryNotinList" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify Response should not contain Value passed in Invalid Parameter	
	
@updateCategory 
Scenario: Verify API: updateCategory API add Category payload 
	Given "System_Admin" "Update" Category Payload  
	When User calls "updateCategory" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify Category fields gets updated

@deleteCategory
#-ve scenarion with no CategoryId
Scenario: Verify API: deleteCategory API, no CategoryId
   Given "System_Admin" User invoke "deleteCategory" 
   When User calls "deleteCategory" API with "Delete" http Request
   Then The API call is success with StatusCode 400
   Then "message" in response body is "Required Integer parameter 'categoryId' is not present"	 
   
@deleteCategory   
Scenario: Verify API: deleteCategory API, delete with Invalid categoryId
		Given "System_Admin" User invoke "deleteCategory" with invalid Category Parameter: "categoryId" = "-9" 
    When User calls "deleteCategory" API with "Delete" http Request
    Then The API call is success with StatusCode 500
    
    
@deleteCategory   
Scenario: Verify API: deleteCategory API, update Field status as Passive
		Given "System_Admin" User invoke CategoryAPI "deleteCategory" with Parameter: "categoryId" 
    When User calls "deleteCategory" API with "Delete" http Request
    Then The API call is success with StatusCode 200
    Then Verify responseBody is instance of Category
	  Then "categoryStatus" in response body is "Passive"	



