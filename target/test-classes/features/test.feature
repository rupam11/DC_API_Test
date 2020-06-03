@DC-Test-Suite @Test
Feature: Validating Task API's

  @getTaskCount
  Scenario: Verify API: getTaskCount API return Total Task Count
    Given "System_Admin" User invoke "getTaskCount"
    When User calls "getTaskCount" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify task_Count result is greater than 0

  @createTask
  Scenario: Verify API: createTask API add Task paylod
    Given "System_Admin" "Add" Task Payload
    When User calls "createTask" API with "Post" http Request
    Then The API call is success with StatusCode 200
    Then Verify responseBody is instance of Task
    Then Verify Total task_Count increased by 1
    Then Verify taskId, taskequence, taskDisplaySequence is equal to total_task_count
    Then Verify Task_Code is equal to 'TSK_task_count'
    
    @createTask
  Scenario: Verify API: createTask API with no task Body
    Given "System_Admin" User "Add" Task Payload  with no Task Body and Param = "none"
    When User calls "createTask" API with "Post" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.task.entity.Task com.ibm.dc.task.controller.TaskController.createTask(java.lang.String,com.ibm.dc.task.entity.Task)"
    

  @getAllTasks
  Scenario: Verify API: getAllTasks API return List of All Tasks
    Given "System_Admin" User invoke "getAllTasks"
    When User calls "getAllTasks" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Tasks
    Then Total number of Tasks in List is equal to getTaskCount
    #Then Response Task which was added should be filtered

   @getTaskBySearchCriteria
    Scenario: Verify API: getTaskBySearchCriteria API, search no SearchCriteria
    Given "System_Admin" User invoke "getTaskBySearchCriteria"
    When User calls "getTaskBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Tasks
    #Then Response should be list all Tasks=getAllTasks
    Then All Tasks should have Active Status
          
  @getTaskBySearchCriteria
  Scenario: Verify API: getTaskBySearchCriteria API, search by 'taskId' & 'taskDescription' & 'taskApplicable' & 'taskStatus'
    Given "System_Admin" User invoke getTaskBySearchCriteria with Parameter: 'taskId' & 'taskDescription' & 'taskApplicable' & 'taskStatus'
    When User calls "getTaskBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Tasks
    Then Response should be List of Tasks and size should be one
    #Then Response Task which was added should be filtered
    
   @getTaskBySearchCriteria
  Scenario: Verify API: getTaskBySearchCriteria API, search by 'taskId'
    Given "System_Admin" User invoke getTaskBySearchCriteria with Parameter: "taskId"
    When User calls "getTaskBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Tasks
  Then Response should be List of Tasks and size should be one
  
  
  @getTaskBySearchCriteria
  Scenario: Verify API: getTaskBySearchCriteria API, search by 'taskApplicable'
    Given "System_Admin" User invoke getTaskBySearchCriteria with Parameter: "taskApplicable"
    When User calls "getTaskBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Tasks
  Then Each Task of returned TaskList should have same "taskApplicable"
   #Then Response Task which was added should be filtered
  
  @getTaskBySearchCriteria
  Scenario: Verify API: getTaskBySearchCriteria API, search by 'taskDescription'
    Given "System_Admin" User invoke getTaskBySearchCriteria with Parameter: "taskDescription"
    When User calls "getTaskBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
   Then Verify response will return List of Tasks
  Then Each Task of returned TaskList should have same "taskDescription"
#Then Response Task which was added should be filtered
   
   @getTaskBySearchCriteria
  Scenario: Verify API: getTaskBySearchCriteria API, search by 'taskStatus'
    Given "System_Admin" User invoke getTaskBySearchCriteria with Parameter: "taskStatus"
    When User calls "getTaskBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
     Then Verify response will return List of Tasks
  Then Each Task of returned TaskList should have same "taskStatus"
  #Then Response Task which was added should be filtered    
 
  
  
  @getTaskBySearchCriteria
  Scenario: Verify API: getTaskBySearchCriteria API, search by invalid 'taskId'
    Given "System_Admin" User invoke getTaskBySearchCriteria with invalid Parameter: "taskId" = "-9"
    When User calls "getTaskBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities with zero records

  @getTaskBySearchCriteria
  Scenario: Verify API: getTaskBySearchCriteria API, search by invalid 'taskDescription'
    Given "System_Admin" User invoke getTaskBySearchCriteria with invalid Parameter: "taskDescription" = "invalidDescriptionName"
    When User calls "getTaskBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities with zero records

  @getTaskBySearchCriteria
  Scenario: Verify API: getTaskBySearchCriteria API, search by invalid 'taskApplicable'
    Given "System_Admin" User invoke getTaskBySearchCriteria with invalid Parameter: "taskApplicable" = "invalidTaskApplicable"
    When User calls "getTaskBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities with zero records

  @getTaskBySearchCriteria
  Scenario: Verify API: getTaskBySearchCriteria API, search by invalid 'taskStatus'
    Given "System_Admin" User invoke getTaskBySearchCriteria with invalid Parameter: "taskStatus" = "invalidTaskStatus"
    When User calls "getTaskBySearchCriteria" API with "Get" http Request
    Then The API call is success with StatusCode 200
    Then Verify response will return List of Activities with zero records
  
  @deleteTask
  Scenario: Verify API: deleteTask update Task status as Passive
    Given "System_Admin" User invoke deleteTask with Parameter: "taskId"
    When User calls "deleteTask" API with "Delete" http Request
    Then The API call is success with StatusCode 200
    Then Verify responseBody is instance of Task
 
  @deleteTask
  Scenario: Verify API: deleteTask API,  with invalid taskId
    Given "System_Admin" User invoke "deleteTask" with invalid Parameter: "taskId" = "-9"
    When User calls "deleteTask" API with "Delete" http Request
    Then The API call is success with StatusCode 500
    Then "message" in response body is "Task with id - -9 not found"

  @deleteTask
  Scenario: Verify API: deleteTask API, with no Param
    Given "System_Admin" User deleteTask with no Param
    When User calls "deleteTask" API with "Delete" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'taskId' is not present"
   
  @updateTask
  Scenario: Verify API: updateTask API add Task paylod
    Given "System_Admin" "Update" Task Payload with Param = "taskId"
    When User calls "updateTask" API with "Put" http Request
    Then The API call is success with StatusCode 200
    Then Verify Task fields gets updated
    
     @updateTask
  Scenario: Verify API: updateTask API, with invalid taskId
    Given "System_Admin" User "Update" Task Payload  with invalid Param = "taskId" and value="-9"
    When User calls "updateTask" API with "Put" http Request
    Then The API call is success with StatusCode 500
    Then "message" in response body is "Task with id - -9 not found"

  @updateTask
  Scenario: Verify API: updateTask API, with no taskId
    Given "System_Admin" User "Update" Task Payload  with no Param
    When User calls "updateTask" API with "Put" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required Integer parameter 'taskId' is not present"

  @updateTask
  Scenario: Verify API: updateTask API, with no task Body
    Given "System_Admin" User "Update" Task Payload  with no Task Body and Param = "taskId"
    When User calls "updateTask" API with "Put" http Request
    Then The API call is success with StatusCode 400
    Then "message" in response body is "Required request body is missing: public com.ibm.dc.task.entity.Task com.ibm.dc.task.controller.TaskController.updateTask(java.lang.String,java.lang.Integer,com.ibm.dc.task.entity.Task)"
    
 
 