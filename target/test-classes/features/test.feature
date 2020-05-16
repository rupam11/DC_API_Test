@DC-Test-Suite 
@Test 
Feature: Validating BPMN API's 

@createBpmnDiagram 
  Scenario: Verify API: createBpmnDiagram API create BPMN Diagram 
    Given Add DiagramDetails Payload
     When user calls "createBpmnDiagram" API with "Post" http Request 
     Then the API call is success with StatusCode 200 
     Then verify that ResponseStatus instance is returned as response
     Then "messageCode" in response body is 0
     Then "message" in response body is "Diagram created"
     Then "displayMessage" in response body is "BPMN Diagram successfully created"
         
  
  @getBpmnDiagram 
  Scenario: Verify API: getBpmnDiagram API get BpmnDiagram using 'name' parameter
    Given User invoke getBpmnDiagram with Parameters: name
     When user calls "getBpmnDiagram" API with "Get" http Request 
     Then the API call is success with StatusCode 200 
     Then verify response will return InputStreamResource instance 
     
 