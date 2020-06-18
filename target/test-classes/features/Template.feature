@DC-Test-Suite
@Demo
@Template

Feature: Validating Template API's

@getTemplateCount
Scenario: Verify API:getTemplateCount, Get Number of Template
 Given "System_Admin" User invoke "getTemplateCount"
    When User calls "getTemplateCount" API with "Get" http Request 
    Then The API call is success with StatusCode 200
    Then Verify templateCount result is greater than equal to 0
    
    @createTemplate
  Scenario: Verify API: createTemplate API, add Template paylod
    Given "System_Admin" Get Template Payload ready for "Add" operation
    When User calls "createTemplate" API with "Post" http Request
    Then The API call is success with StatusCode 200
    Then Verify responseBody is instance of Template
    Then Print the created Template 
    Then Verify template->responseBody is same as that of template->requestBody except:"templateId,templateCreatedAt,templateCreatedBy,templateUpdatedAt,templateUpdatedBy"
   	Then Verify templateId="templateCount"  
    Then "templateUpdatedAt" in response body is "0000-00-00 00:00:00"
    Then "templateUpdatedBy" in response body is "NA"
    
    
@getAllTemplates
Scenario: Verify API:getAllTemplates, Get All Templates
Given "System_Admin" User invoke "getAllTemplates" 
	When User calls "getAllTemplates" API with "Get" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify response will return List of Templates
	Then Template added exist in returned Template List
	Then Verify that total number of Templates in List is equal to getTemplateCount
		
@getTemplateBySearchCriteria
Scenario: Verify API:getTemplateBySearchCriteria->search by templateIdList, Get list of Templates satisfying search criteria
Given "System_Admin" User invoke "getAllTemplates" 
	When User calls "getAllTemplates" API with "Get" http Request
	Then Verify response will return List of Templates
	Then Save templateId of 5 templates in templateIdList	
Given "System_Admin" User invoke Template->"getTemplateBySearchCriteria" with Parameter: "templateIdList" 
	When User calls "getTemplateBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Templates
	Then Verify templateCount result is equal to 5
	
@getTemplateBySearchCriteria
Scenario: Verify API:getTemplateBySearchCriteria->templateIndustryName, Get list of Templates satisfying search criteria
Given "System_Admin" User invoke Template->"getTemplateBySearchCriteria" with Parameter: "templateIndustryName" 
	When User calls "getTemplateBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Templates
	Then Response should be list of Templates and satisfy the search: "templateIndustryName"
	Then Template added exist in returned Template List
	
	
@getTemplateBySearchCriteria
Scenario: Verify API:getTemplateBySearchCriteria->templateName, Get list of Templates satisfying search criteria
Given "System_Admin" User invoke Template->"getTemplateBySearchCriteria" with Parameter: "templateName" 
	When User calls "getTemplateBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Templates
	Then Response should be list of Templates and satisfy the search: "templateName"
	Then Template added exist in returned Template List
	
	
@getTemplateBySearchCriteria
Scenario: Verify API:getTemplateBySearchCriteria->templateSectorName, Get list of Templates satisfying search criteria
Given "System_Admin" User invoke Template->"getTemplateBySearchCriteria" with Parameter: "templateSectorName" 
	When User calls "getTemplateBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Templates
	Then Response should be list of Templates and satisfy the search: "templateSectorName"
	Then Template added exist in returned Template List
	
	
@getTemplateBySearchCriteria
Scenario: Verify API:getTemplateBySearchCriteria->templateVersion, Get list of Templates satisfying search criteria
Given "System_Admin" User invoke Template->"getTemplateBySearchCriteria" with Parameter: "templateVersion" 
	When User calls "getTemplateBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Templates
	Then Response should be list of Templates and satisfy the search: "templateVersion"
	Then Template added exist in returned Template List
	


@createDummyField
Scenario: Verify API:createDummyField, Create Dummy Fields In Template :: purpose?? creating field with null values??only once it is getting cretaing dummy field	
Given "System_Admin" User invoke Template->"createDummyField" with Parameter: "templateId" 
	When User calls "createDummyField" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify responseBody is instance of Template
	Then Verify templateId in responseBody = templateId of created Template  	

@deleteTemplate
Scenario: Verify API:deleteTemplate, Delete Template
Given "System_Admin" User invoke Template->"deleteTemplate" with Parameter: "templateId" 
	When User calls "deleteTemplate" API with "Delete" http Request 
	Then The API call is success with StatusCode 200
	Then Verify responseBody is instance of ResponseStatus
	Then "message" in response body is "Template Deleted"	
	Then "displayMessage" in response body is "Template has been deleted successfully"
	Then Prepare templateIdList with templateId of created Template	
	Given "System_Admin" User invoke Template->"getTemplateBySearchCriteria" with Parameter: "templateIdList" 
	When User calls "getTemplateBySearchCriteria" API with "Get" http Request
	Then The API call is success with StatusCode 200
	Then Verify response will return List of Templates
	Then Verify templateCount result is equal to 1
	Then templateStatus of Template in response body is "Passive"

	
@updateTemplate
Scenario: Verify API:	updateTemplate, Update Template ?? what is parentId
Given "System_Admin" Get Template Payload ready for "Update" operation
	When User calls "updateTemplate" API with "Put" http Request 
	Then The API call is success with StatusCode 200 
	Then Verify responseBody is instance of Template
 Then Verify template->responseBody is same as that of template->requestBody except:"templateUpdatedAt,templateUpdatedBy"  
	