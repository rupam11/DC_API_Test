@DC-Test-Suite
@Demo
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
	
@sendMail 
Scenario: Verify API: sendMail fail in case body is not passed
	Given "System_Admin" User invoke "sendMail"
	When User calls "sendMail" API with "Post" http Request 
	Then The API call is failed with StatusCode 400 
		Then "message" in response body is "Required request body is missing: public com.ibm.dc.mail.entity.ResponseStatus com.ibm.dc.mail.controller.MailController.sendMail(java.lang.String,com.ibm.dc.mail.entity.Mail)"
	
	
	