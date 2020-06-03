package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertArrayEquals;
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import entity.Activity;
import entity.Sector;
import entity.Task;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class TaskStepDefinition extends Utils{
	CommonStepDefinition cmnStepDef;
	static Task reqTask,respTask;
	static int task_count;
	Task[] respAllTasks;	
	

	public TaskStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}
	
	@Given("{string} {string} Task Payload")
	public void task_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqTask = data.addTask();
		else if (payloadReq.equalsIgnoreCase("Update"))
			reqTask = data.updateTask(respTask);
		else
			System.out.println("Issue in Payload creation request");
		
		reqSpec = given().spec(requestSpecification(userRole)).body(reqTask);
	}
	
	
	@Given("{string} {string} Task Payload with Param = {string}")
	public void task_Payload_with_Param(String userRole, String payloadReq, String param) throws IOException {
		 if (payloadReq.equalsIgnoreCase("Add"))
			{
				reqTask = data.addTask();
				reqSpec = given().spec(requestSpecification(userRole)).body(reqTask);
			}
			else if (payloadReq.equalsIgnoreCase("Update"))
			{
				reqTask = data.updateTask(respTask);
				reqSpec=null;
				reqSpec = given().spec(requestSpecification(userRole)).body(reqTask).queryParam(param, respTask.getTaskId());
				
			}			
			else
				System.out.println("Issue in Payload creation request");
	}

	
	@Then("Verify responseBody is instance of Task")
	public void Verify_responseBody_is_instance_of_Task() {
		respTask=response.getBody().as(Task.class);
		System.out.println("task created === "+respTask.toString());
	}
	
	@Then("Verify task_Count result is greater than 0")
	public int get_task_count() {
		task_count = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", task_count > 0);
		return task_count;
	}

	@Then("Verify Total task_Count increased by {int}")
	public void task_Count_incraesed(int i) {
		int old_count=task_count;
		cmnStepDef.user_calls_API_with_http_Request("getTaskCount","Get");
		assertEquals(old_count+1, get_task_count());
	}	
	
	@Then("Verify taskId, taskequence, taskDisplaySequence is equal to total_task_count")
	public void verify_taskAttributes() {
		assertEquals(task_count, respTask.getTaskId());
		assertEquals(task_count, respTask.getTaskSequence());
		assertEquals(task_count,  respTask.getTaskDisplaySequence());				
	}
	
	@Then("Verify Task_Code is equal to 'TSK_task_count'")
	public void verify_taskCode() {
		assertEquals("TSK_"+task_count,respTask.getTaskCode());		
	}
	
	@Then("Verify response will return List of Tasks")
	public void verify_response_will_return_List_of_Tasks() {
		respAllTasks = response.getBody().as(Task[].class);		
	}
	
	
	@Then("Total number of Tasks in List is equal to getTaskCount")
	public void total_number_of_Tasks_in_List_is_equal_to_getTaskCount() {
		cmnStepDef.user_calls_API_with_http_Request("getTaskCount", "Get");
		task_count = get_task_count();
		assertTrue("Total Sectors retrieved is not correct", respAllTasks.length == task_count);
	}

	
	@Then("Verify response should be list all Tasks=getAllTasks")
	public void verify_Task_with_NoSearchCriteria() {
		Task[] actTaskList = response.getBody().as(Task[].class);
		cmnStepDef.user_calls_API_with_http_Request("getAllTasks", "Get");
		Task[] expTaskList = response.getBody().as(Task[].class);
		assertArrayEquals("All Tasks not searched in case of no Search Criteria", expTaskList, actTaskList);
	}
	
	@Given("{string} User invoke {string} with Parameter: {string}")
	public void user_invoke_with_Parameter(String userRole,String apiNm,String parameter) {
		String param=parameter;
		if (param.equalsIgnoreCase("taskApplicable"))
			reqSpec.queryParam(param, respTask.getTaskApplicable());
		else if (param.equalsIgnoreCase("taskDescription"))
			reqSpec.queryParam(param, respTask.getTaskDescription());
		else if (param.equalsIgnoreCase("taskId"))
			reqSpec.queryParam(param, respTask.getTaskId());
		else if (param.equalsIgnoreCase("taskStatus"))
			reqSpec.queryParam(param, respTask.getTaskStatus());
		else if (param.equalsIgnoreCase("file"))
			reqSpec.queryParam(param, respTask.getTaskStatus());
	}

	/*@Then("Response Task is added should be filtered")
		public void response_Task_is_added_should_be_filtered() {
		List<Task> getAllTaskList = Arrays.asList(respAllTasks);
		assertThat(getAllTaskList, hasItem(respTask));		
	}*/
	
	@Then("Response Task which was added should be filtered")
	public void response_Task_is_added_should_be_filtered() {
		List<Task> getAllTaskList = Arrays.asList(respAllTasks);
		assertThat(getAllTaskList, hasItem(respTask));	
	}
	
	@Then("Response should be list all Tasks=getAllTasks")
	public void response_should_be_list_all_Tasks_getAllTasks() {
		List<Task> actTaskList = Arrays.asList(respAllTasks);
		cmnStepDef.user_calls_API_with_http_Request("getAllTasks","Get");
		respAllTasks = response.getBody().as(Task[].class);
		List<Task> expTaskList = Arrays.asList(respAllTasks);
		assertThat(expTaskList, contains(actTaskList));		
	}	
	
	@Then("The size of items in Response should be {int}")
	public void the_size_of_items_in_Response_should_be(Integer int1) {
		respAllTasks = response.getBody().as(Task[].class);
		assertTrue("Search by taskId do not list one Sector", respAllTasks.length == 1);
	}
	
	@Then("Verify Task fields gets updated")
	public void verify_Task_fields_gets_updated() {
	    Task updatedTask=response.getBody().as(Task.class);
	    assertEquals(updatedTask.getTaskCode(), respTask.getTaskCode());
	    assertEquals(updatedTask.getTaskSequence(), respTask.getTaskSequence());
	    assertEquals(updatedTask.getTaskDisplaySequence(), respTask.getTaskDisplaySequence());
	    assertEquals(updatedTask.getTaskStatus(), respTask.getTaskStatus());
	    assertEquals(updatedTask.getTaskComments(), respTask.getTaskComments());
	    assertEquals(updatedTask.getTaskApplicable(), respTask.getTaskApplicable());
	    assertEquals(updatedTask.getPercentCompletion(), respTask.getPercentCompletion());
	    assertEquals(updatedTask.getTaskEffort(), respTask.getTaskEffort());
	    assertEquals(updatedTask.getTaskOwner(), respTask.getTaskOwner());
	    assertEquals(updatedTask.getTaskCreatedBy(), respTask.getTaskCreatedBy());
	    assertEquals(updatedTask.getTaskSquadName(), respTask.getTaskSquadName());
	    assertEquals(updatedTask.getTaskSquadType(), respTask.getTaskSquadType());
	  }	
	
	@Given("{string} User {string} Task Payload  with no Task Body and Param = {string}")
	public void user_Task_Payload_with_no_Task_Body_and_Param(String userRole, String payloadReq, String param) throws IOException {
	    reqSpec=null;
				reqSpec = given().spec(requestSpecification(userRole));
			if (payloadReq.equalsIgnoreCase("Update"))
					reqSpec = reqSpec.queryParam(param, respTask.getTaskId());
	}
	
	@Given("{string} User invoke getTaskBySearchCriteria with Parameter: {string}")
	public void user_invoke_getTaskBySearchCriteria_with_Parameter(String userRole, String param) throws IOException {
		if (param.equalsIgnoreCase("taskId")) {			
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respTask.getTaskId());
		}
		else if (param.equalsIgnoreCase("taskApplicable")) {
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respTask.getTaskApplicable());
		}
		else if (param.equalsIgnoreCase("taskDescription")) {
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respTask.getTaskDescription());
		}
		else if (param.equalsIgnoreCase("taskStatus"))	{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respTask.getTaskStatus());
		}
	}
	
	@Given("{string} User invoke getTaskBySearchCriteria with Parameter: {string} & {string} & {string} & {string}")
	public void user_invoke_getTaskBySearchCriteria_with_Parameter(String userRole, String param1, String param2, String param3, String param4) throws IOException {
		 reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param1,respTask.getTaskId())
																		.queryParam(param2, respTask.getTaskDescription())
																		.queryParam(param3, respTask.getTaskApplicable())
																		.queryParam(param4, respTask.getTaskStatus());
																		
	}
	
	@Then("Response Task is same which was added")
	public void response_Task_is_same_which_was_added() {
	    	System.out.println("respTask === "+respTask.toString());
			System.out.println("respALLTasks[0] === "+respAllTasks[0].toString());
			assertEquals("Wrong Task filtered", respTask.toString(), respAllTasks[0].toString());
	}

	@Given("{string} User invoke getTaskBySearchCriteria with invalid Parameter: {string} = {string}")
	public void user_invoke_getTaskBySearchCriteria_with_invalid_Parameter(String userRole, String param, String var) throws IOException {
	    reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,var);	
	}

	@Given("{string} User deleteTask with no Param")
	public void user_deleteTask_with_no_Param(String userRole) throws IOException {
	   reqSpec=null;
			reqSpec = given().spec(requestSpecification(userRole));	
	}

	@Given("{string} User {string} Task Payload  with invalid Param = {string} and value=\"{int}\"")
	public void user_Task_Payload_with_invalid_Param_and_value(String userRole, String payloadReq, String param, int i) throws IOException {
	    reqTask = data.updateTask(respTask);
				reqSpec=null;
				reqSpec = given().spec(requestSpecification(userRole)).body(reqTask).queryParam(param,i);
	}

	@Given("{string} User {string} Task Payload  with no Param")
	public void user_Task_Payload_with_no_Param(String userRole, String payloadReq) throws IOException {
	    reqTask = data.updateTask(respTask);
				reqSpec=null;
				reqSpec = given().spec(requestSpecification(userRole)).body(reqTask);
	}
	
	@Then("All Tasks should have Active Status")
	public void all_Tasks_should_have_Active_Status() {
	    for(Task task:respAllTasks)
	    	assertEquals("Task with Passive status searched!!!"+task.getTaskId(), "Active", task.getTaskStatus());
	    
	}
	/*
	@Then("Response should be list of Tasks and satisfy the search: {string}")
	public void response_should_be_list_of_Tasks_and_satisfy_the_search(String srchCriteria) {
		respAllTasks = response.getBody().as(Task[].class);
		for(Task t:respAllTasks)
			assertTrue("Wrong list of Tasks searched back",respTask.getTaskApplicable().equalsIgnoreCase(t.getTaskApplicable()));
	}*/
	
	@Then("Response should be List of Tasks and size should be one")
	public void response_should_be_List_of_Tasks_and_size_should_be_one() {
//		List<Task> getAllTaskList = Arrays.asList(respAllTasks);
//		assertThat(getAllTaskList, hasSize(1));
		respAllTasks = response.getBody().as(Task[].class);
		assertTrue("Search by taskId do not list one Task", respAllTasks.length == 1);		
	}
	
	@Then("Each Task of returned TaskList should have same {string}")
	public void each_Task_of_returned_TaskList_should_have_same(String searchItem) {
		
	    assertTrue("All searched List do not satisfy search criteria",verify_all_records_with_search_criteria(searchItem));
	}

	boolean verify_all_records_with_search_criteria(String searchItem) {
			if(searchItem.equalsIgnoreCase("taskID"))
			{
				for(Task p:respAllTasks) 
				if(p.getTaskId()==respTask.getTaskId())
					return true;
				return false;
			}
			else if(searchItem.equalsIgnoreCase("taskApplicable"))
			{
				for(Task p:respAllTasks) 
				if(!(p.getTaskApplicable().matches(respTask.getTaskApplicable())))
					return false;
				return true;
			}
			else if(searchItem.equalsIgnoreCase("taskDescription"))
			{
				for(Task p:respAllTasks)  
				if(!(p.getTaskDescription().matches(respTask.getTaskDescription())))
					return false;
				return true;
			}
			else if(searchItem.equalsIgnoreCase("taskStatus"))
			{
				for(Task p:respAllTasks)  
				if(!(p.getTaskStatus().matches(respTask.getTaskStatus())))
					return false;
				return true;
			}
			else 
				return false;
			
		}

	@Given("{string} User invoke deleteTask with Parameter: {string}")
	public void user_invoke_deleteTask_with_Parameter(String userRole, String param) throws IOException {
		 reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,reqTask.getTaskId());
	}

}
