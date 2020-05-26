@DC-Test-Suite
@Mail 
Feature: Validating Activity API's 


@sendMail 
Scenario: Verify API: sendMail sends mail
	Given "System_Admin" Add Mail Payload 
	When User calls "sendMail" API with "Post" http Request 
	Then Verify responseBody is instance of ResponseStatus
	Then The API call is success with StatusCode 200 
	Then "messageCode" in response body is 0
	Then "message" in response body is "Success" 
	Then "displayMessage" in response body is "Mail sent successfully"
	