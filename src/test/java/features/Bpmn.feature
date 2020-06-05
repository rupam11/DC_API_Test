@DC-Test-Suite 
@Demo
@BPMN
Feature: Validating BPMN API's 

@createBpmnDiagram 
  Scenario: Verify API: createBpmnDiagram API create BPMN Diagram 
    Given "System_Admin" Add DiagramDetails Payload
     When User calls "createBpmnDiagram" API with "Post" http Request 
     Then The API call is success with StatusCode 200 
     Then Verify that ResponseStatus instance is returned as response
     Then "messageCode" in response body is 0
     Then "message" in response body is "Diagram created"
     Then "displayMessage" in response body is "BPMN Diagram successfully created"
         
  
  @getBpmnDiagram 
  Scenario: Verify API: getBpmnDiagram API get BpmnDiagram using 'name' parameter
    Given "System_Admin" User invoke getBpmnDiagram with Parameters: "name"
     When User calls "getBpmnDiagram" API with Get http Request
     Then The API call is success with StatusCode 200 
     Then Verify response will return InputStreamResource instance
     Then "Content-Type" in response-header should be "application/octet-stream"
     Then "Content-Disposition" in response-header should be "attachment;filename=tesbpmn_diagam.bpmn" 
     
 