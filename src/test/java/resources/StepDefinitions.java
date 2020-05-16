package resources;

import static  io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.Activity;
import pojo.Task;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefinitions extends Utils{
	
	RequestSpecification reqSpec;
	ResponseSpecification respSpec;
	Response response;
	TestDataBuild data=new TestDataBuild();
	static Activity respActivity;
	Activity reqActivity;
	Activity[] respAllActivities;
	
	static int actId,actSeq,actDisplaySeq,actCount;
	static String actCode;
	
	
	@Given("User invoke {string}")
	public void user_invoke_getActivityCount(String apiNm) throws IOException {
		reqSpec=given().spec(requestSpecification());		
	}

	@Then("Total_Activity_Count>0")
	public void total_activity_count_0() {
		actCount=Integer.parseInt(response.asString());
		assertTrue("Activity Count is not correct", actCount > 0);
	}
	
	@Given("Add Activity Payload")
	public void add_Activity_Payload() throws IOException {
		reqActivity =data.addActivity();
		reqSpec=given().spec(requestSpecification()).body(data.addActivity());
	}

	@When("user calls {string} API with {string} http Request")
	public void user_calls_API_with_http_Request(String apiNm, String method) {
		APIResources resourceAPI=APIResources.valueOf(apiNm);
		System.out.println("API Called ::: "+apiNm+" with Method === "+method);
		respSpec=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		if(method.equalsIgnoreCase("Post"))
			response=reqSpec.when().post(resourceAPI.getResource()).then().spec(respSpec).extract().response();			
		else if (method.equalsIgnoreCase("Get"))
			response=reqSpec.when().get(resourceAPI.getResource()).then().spec(respSpec).extract().response();
		else if (method.equalsIgnoreCase("Delete")) 
			response=reqSpec.when().delete(resourceAPI.getResource()).then().spec(respSpec).extract().response();
		else if (method.equalsIgnoreCase("Put"))
			response=reqSpec.when().put(resourceAPI.getResource()).then().spec(respSpec).extract().response();
	}

	
	@Then("verify responseBody is same as requestBody")
	public void verify_responseBody_is_same_as_requestBody() {
	   	respActivity=response.getBody().as(Activity.class);
	   	//assertThat(response.getBody(), instanceOf(Task.class));
	   	actId=Integer.parseInt(getKeyValueFromJsonResponse(response,"activityId"));
		actSeq=Integer.parseInt(getKeyValueFromJsonResponse(response,"activitySequence"));
		actDisplaySeq=Integer.parseInt(getKeyValueFromJsonResponse(response,"activityDisplaySequence"));
		actCode=getKeyValueFromJsonResponse(response,"activityCode");
	}

	
	@Then("the API call is success with StatusCode {int}")
	public void the_API_call_is_success_with_StatusCode(int expStatusCode) {
			assertEquals(expStatusCode,response.getStatusCode());			
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyName, String keyValue) {
		assertEquals(getKeyValueFromJsonResponse(response,keyName),keyValue);
	}

	@Then("activityId and activitySequence and activityDisplaySequence in response body is equal to output of {string}")
	public void activityid_and_activitySequence_and_activityDisplaySequence_in_response_body_is_equal_to_output_of(String getActCount) {
		user_calls_API_with_http_Request(getActCount,"GET");		
		int getActivityCount=Integer.parseInt(response.asString());
		assertEquals(getActivityCount,actId);
		assertEquals(getActivityCount,actSeq);
		assertEquals(getActivityCount,actDisplaySeq);		
		assertEquals("ACT_"+getActivityCount,actCode);
	}
	
	@Then("verify response will return List of Activities")
	public void verify_response_will_return_List_of_Activities() {
		respAllActivities=response.getBody().as(Activity[].class);		
	}

	@Then("total number of Activity in List is equal to getActivityCount")
	public void total_number_of_Activity_in_List_is_equal_to_getActivityCount() throws IOException {
		user_calls_API_with_http_Request("getActivityCount","Get");
		actCount=Integer.parseInt(response.asString());
		assertTrue("Total Activities retrieved is not correct", respAllActivities.length==actCount);
	}

	@Then("Activity added exist in returned ActivityList")
	public void activity_added_exist_in_returned_ActivityList() {
		List<Activity> actList=Arrays.asList(respAllActivities);
		assertThat(actList,hasItems(respActivity));
	}
	
	@Given("Update Activty status as Passive using activity Id generated")
	public void update_Activty_status_as_Passive_using_activity_Id_generated() throws IOException {
		System.out.println("Inside Delete Given ::: "+actId);
		reqSpec=given().spec(requestSpecification()).queryParam("activityId", actId);		
	}
	
	@Given("User invoke getActivityBySearchCriteria with Parameters: activityCode, activityId, activityStatus")
	public void user_invoke_getActivityBySearchCriteria_with_Parameters_activityCode_activityId_activityStatus() {
	    System.out.println("activity Code === "+respActivity.getActivityCode());
	    System.out.println("activity Id === "+respActivity.getActivityId());
	    System.out.println("activity Status === "+respActivity.getActivityStatus());
	}

	@When("perform {string} by {string}")
	public void perform_by(String apiNm, String searchCriteria) throws IOException {
		if(searchCriteria.equalsIgnoreCase("activityId"))
			reqSpec=given().spec(requestSpecification()).queryParam(searchCriteria, respActivity.getActivityId());
		else if(searchCriteria.equalsIgnoreCase("activityCode"))
			reqSpec=given().spec(requestSpecification()).queryParam(searchCriteria, respActivity.getActivityCode());
		else if(searchCriteria.equalsIgnoreCase("activityStatus"))
			reqSpec=given().spec(requestSpecification()).queryParam(searchCriteria, respActivity.getActivityStatus());
		user_calls_API_with_http_Request(apiNm, "Get");		
	}

	@Then("{string} for all Activities is {string}")
	public void for_all_Activities_is(String string, String string2) {
	   
	}

	@Then("Activity List should have only one Activity")
	public void activity_List_should_have_only_one_Activity() {
		
		assertEquals(respActivity.getActivityId(),Integer.parseInt(getKeyValueFromJsonResponse(response,"activityId")));
	}

	@Then("Updated Payload and Response Payload should be equal")
	public void updated_Payload_and_Response_Payload_should_be_equal() {
	    
	}
	
	
	
}