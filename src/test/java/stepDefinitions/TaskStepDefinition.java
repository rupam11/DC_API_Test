package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

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
	
	
	@Then("Total number of Task in List is equal to getTaskCount")
	public void total_number_of_Task_in_List_is_equal_to_getTaskCount() {
		cmnStepDef.user_calls_API_with_http_Request("getTaskCount", "Get");
		task_count = get_task_count();
		assertTrue("Total Sectors retrieved is not correct", respAllTasks.length == task_count);
	}

	@Then("Task added exist in returned TaskList")
	public void task_added_exist_in_returned_TaskList() {
		List<Task> getAllTaskList = Arrays.asList(respAllTasks);
		assertThat(getAllTaskList, hasItem(respTask));
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

	@Then("Response should be list of Tasks and satisfy the search: {string}")
	public void response_should_be_list_of_Tasks_and_satisfy_the_search(String srchCriteria) {
		respAllTasks = response.getBody().as(Task[].class);
		for(Task t:respAllTasks)
			assertTrue("Wrong list of Tasks searched back",respTask.getTaskApplicable().equalsIgnoreCase(t.getTaskApplicable()));
	}

	@Then("Response Task is added should be filtered")
		public void response_Task_is_added_should_be_filtered() {
		List<Task> getAllTaskList = Arrays.asList(respAllTasks);
		assertThat(getAllTaskList, hasItem(respTask));		
	}
	
	@Then("The size of items in Response should be {int}")
	public void the_size_of_items_in_Response_should_be(Integer int1) {
		respAllTasks = response.getBody().as(Task[].class);
		assertTrue("Search by sectorId do not list one Sector", respAllTasks.length == 1);
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
}
