package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONParser;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import entity.Process;
import entity.Task;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import testBase.Utils;

public class ProcessStepDefinition extends Utils {

	static Process reqProcess,respProcess;
	Process[] respAllProcess;
	static int process_Count;
	CommonStepDefinition cmnStepDef;
	JSONObject jsonObject,actJsonObj,expJsonObj;

	public ProcessStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
		
	}


	@Given("{string} User {string} Process Payload")
	public void user_Process_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqProcess = data.addProcess();
		else if (payloadReq.equalsIgnoreCase("Update"))
			reqProcess = data.updateProcess(respProcess);
		else
			System.out.println("Issue in Payload creation request");
		
		reqSpec = given().spec(requestSpecification(userRole)).body(reqProcess);
	}
	
		
	@Then("Verify Process_Count result is greater than 0")
	public int get_Process_count() {
		process_Count = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", process_Count > 0);
		return process_Count;
	}

	@Then("Verify response will return Process instance")
	public void verify_response_will_return_Process_instance() {
		respProcess = response.getBody().as(Process.class);
		System.out.println("Process created === "+respProcess.toString());
	}

	@Then("Verify response will return List of Process")
		public void verify_response_will_return_List_of_Process() {

		respAllProcess = response.getBody().as(Process[].class);
	}

	@Then("Total number of Process in List is equal to getProcessCount")
	public void total_number_of_Process_in_List_is_equal_to_getProcessCount() throws IOException {
		int old_count=process_Count;
		cmnStepDef.user_calls_API_with_http_Request("getProcessCount", "Get");
		assertEquals(old_count, get_Process_count());
	}

	@Then("Process added exist in returned ProcessList")
	public void Process_added_exist_in_returned_ProcessList() {
		List<Process> ProcessList = Arrays.asList(respAllProcess);
		assertThat(ProcessList, hasItems(respProcess));
	}

	@Given("{string} User invoke getProcessBySearchCriteria with Parameter: {string}")
	public void user_invoke_getProcessBySearchCriteria_with_Parameter(String userRole, String param) throws IOException {
		if (param.equalsIgnoreCase("ProcessId"))
		{
			reqSpec = null;
			System.out.println("Response process porcess id"+respProcess.getProcessId());
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respProcess.getProcessId());		
		}			
		else if (param.equalsIgnoreCase("ProcessName"))
		{				
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respProcess.getProcessName());
		}
	}

	@Then("Response should be list of Process and size should be one")
	public void response_should_be_list_of_Process_and_size_should_be_one() {
		respAllProcess = response.getBody().as(Process[].class);
		assertTrue("Search by ProcessId do not list one Process", respAllProcess.length == 1);
	}

	@Then("Response Process is same which was added")
	public void response_Process_is_same_which_was_added() {
		assertEquals("Wrong Process filtered", respProcess, respAllProcess[0]);
	}

		@Then("Verify Process fields gets updated")
		public void verify_Processfields_gets_updated() {
//		    Process updatedProcess=response.getBody().as(Process.class);
		reqProcess = response.getBody().as(Process.class);
		assertEquals("Process name not updated", reqProcess.getProcessName(), reqProcess.getProcessName());
		assertEquals("Process Processtatus not updated", reqProcess.getProcessStatus(), reqProcess.getProcessStatus());
		assertEquals("Process ProcessCreatedBy not updated", reqProcess.getProcessCreatedBy(),
				reqProcess.getProcessCreatedBy());
		assertEquals("Process ProcessCreatedAt not updated", reqProcess.getProcessCreatedAt(),
				reqProcess.getProcessCreatedAt());
	}

	@Then("Response should be list all Process=getAllProcess")
	public void response_should_be_list_all_Process_getAllProcess() {
		Process[] actAllProcess = response.getBody().as(Process[].class);
		cmnStepDef.user_calls_API_with_http_Request("getAllProcess", "Get");
		Process[] expAllProcess = response.getBody().as(Process[].class);
		assertArrayEquals("All Process not searched in case of no Search Criteria", expAllProcess, actAllProcess);
	}
	
	@Then("Verify Total Process_Count increased by 1")
	public void verify_Total_Process_Count_increased_by() {
		int old_count=process_Count;
		System.out.println("OLD COunt = "+old_count);
		cmnStepDef.user_calls_API_with_http_Request("getProcessCount", "Get");
		assertEquals(old_count+1, get_Process_count());
	}

	@Given("{string} User invoke deleteProcess with Parameter: {string}")
	public void user_invoke_deleteProcess_with_Parameter(String userRole, String param) throws IOException {
		reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,reqProcess.getProcessId());
	}
	
	@Then("All Process should have Active Status")
	public void all_Process_should_have_Active_Status() {
	    for(Process sec:respAllProcess)
	    	assertEquals("Process with Passive status searched!!!", "Active", sec.getProcessStatus());
	}

	@Then("Created Process should exist in the List of Process")
	public void created_Process_should_exist_in_the_List_of_Process() {
		List<Process> ProcessList = Arrays.asList(respAllProcess);
		assertThat(ProcessList, hasItems(respProcess));
	}
	
	/*@Then("Verify responseProcess is same as that of requestProcess")
	public void verify_responseProcess_is_same_as_that_of_requestProcess() {
		expJsonObj=updateJson(new JSONObject(reqProcess),"process");
		actJsonObj=updateJson(new JSONObject(respProcess),"process");
		System.out.println("Request:::"+expJsonObj.toString());
		System.out.println("Response:::"+actJsonObj.toString());
		assertEquals("Response is not created correctly",expJsonObj,actJsonObj);
	}*/
	
	@Then("processId in response body is equal to output of {string}")
	public void processid_in_response_body_is_equal_to_output_of(String string) {
		assertEquals(process_Count+1, respProcess.getProcessId());
	}

	@Then("processCode in response body is equal to output of {string}")
	public void processcode_in_response_body_is_equal_to_output_of(String string) {
		assertEquals("PRS_"+respProcess.getProcessId(), respProcess.getProcessCode());
	}

}