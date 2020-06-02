package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.json.JSONObject;

import entity.Activity;
import entity.Pattern;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testBase.Utils;

public class ActivityStepDefinition extends Utils {

	static Activity reqActivity, respActivity;
	Activity[] respAllActivities;
	static int activity_Count;
	CommonStepDefinition cmnStepDef;
	JSONObject jsonObject,actJsonObj,expJsonObj;

	public ActivityStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}

	@Given("{string} User {string} Activity Payload  with invalid Param = {string} and value=\"{int}\"")
	public void user_Activity_Payload_with_invalid_Param_and_value(String userRole, String payloadReq,String param, int i) throws IOException {
			reqActivity = data.updateActivity(respActivity);
			reqSpec=null;
			reqSpec = given().spec(requestSpecification(userRole)).body(reqActivity).queryParam(param,i);
	}

	@Given("{string} User {string} Activity Payload  with no Param")
	public void user_Activity_Payload_with_no_Param(String userRole, String payloadReq) throws IOException {
			reqActivity = data.updateActivity(respActivity);
			reqSpec=null;
			reqSpec = given().spec(requestSpecification(userRole)).body(reqActivity);
	}

	@Given("{string} User {string} Activity Payload with Param = {string}")
	public void user_Activity_Payload_with_Param(String userRole, String payloadReq, String param) throws IOException {
	   if (payloadReq.equalsIgnoreCase("Add"))
			{
				reqActivity = data.addActivity();
				reqSpec = given().spec(requestSpecification(userRole)).body(reqActivity);
			}
			else if (payloadReq.equalsIgnoreCase("Update"))
			{
				reqActivity = data.updateActivity(respActivity);
				reqSpec=null;
				reqSpec = given().spec(requestSpecification(userRole)).body(reqActivity).queryParam(param, respActivity.getActivityId());
				
			}			
			else
				System.out.println("Issue in Payload creation request");
		
	}

	@Given("{string} User {string} Activity Payload  with no Activity Body and Param = {string}")
	public void user_Activity_Payload_with_no_Activity_Body_and_Param(String userRole, String payloadReq, String param) throws IOException {
			reqSpec=null;
			reqSpec = given().spec(requestSpecification(userRole));
		if (payloadReq.equalsIgnoreCase("Update"))
				reqSpec = reqSpec.queryParam(param, respActivity.getActivityId());
		
	}

	@Given("{string} User invoke getActivityBySearchCriteria with Parameter: {string}")
	public void user_invoke_getActivityBySearchCriteria_with_Parameter(String userRole, String param) throws IOException {
		reqSpec = null;
	    
		if (param.equalsIgnoreCase("activityId"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respActivity.getActivityId());	
		else if (param.equalsIgnoreCase("activityCode"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respActivity.getActivityCode());		
		else if (param.equalsIgnoreCase("activityName"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respActivity.getActivityName());
		else if (param.equalsIgnoreCase("activityState"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respActivity.getActivityState());
		else if (param.equalsIgnoreCase("activityStatus"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respActivity.getActivityStatus());	
	}

	@Given("{string} User invoke getActivityBySearchCriteria with Parameter: {string} & {string} & {string} & {string} & {string}")
	public void user_invoke_getActivityBySearchCriteria_with_Parameter(String userRole, String param1, String param2, String param3, String param4, String param5) throws IOException {
	    reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole)).queryParams(param1,respActivity.getActivityId())
																	.queryParam(param2, respActivity.getActivityCode())
																	.queryParam(param3, respActivity.getActivityName())
																	.queryParam(param4, respActivity.getActivityState())
																	.queryParam(param5, respActivity.getActivityStatus());
																	
	}

	@Given("{string} User deleteActivity with no Param")
	public void user_deleteActivity_with_no_Param(String userRole) throws IOException {
		reqSpec=null;
		reqSpec = given().spec(requestSpecification(userRole));		
	}

	@Given("{string} User invoke deleteActivity with Parameter: {string}")
	public void user_invoke_deleteActivity_with_Parameter(String userRole, String param) throws IOException {
	    reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,reqActivity.getActivityId());
		
	}
	
	@Given("{string} User invoke getActivityBySearchCriteria with invalid Parameter: {string} = {string}")
	public void user_invoke_getActivityBySearchCriteria_with_invalid_Parameter(String userRole, String param, String var) throws IOException {
		reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,var);	
	}

	@Then("Verify Activity_Count result is greater than or equal to 0")
	public int get_Activity_count() {
	    activity_Count = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", activity_Count >= 0);
		return activity_Count;
	}

	@Then("Verify response will return Activity instance")
	public void verify_response_will_return_Activity_instance() {
	    respActivity = response.getBody().as(Activity.class);
		System.out.println("Activity created === "+respActivity.toString());
	}

	@Then("Verify Total Activity_Count increased by {int}")
	public void verify_Total_Activity_Count_increased_by(Integer int1) {
	    int old_count=activity_Count;
			System.out.println("OLD COunt = "+old_count);
			cmnStepDef.user_calls_API_with_http_Request("getActivityCount", "Get");
			assertEquals(old_count+1, get_Activity_count());
	}


	@Then("Verify response will return List of Activities")
	public void verify_response_will_return_List_of_Activities() {
	    respAllActivities = response.getBody().as(Activity[].class);
	}

	@Then("Total number of Activities in List is equal to getActivityCount")
	public void total_number_of_Activities_in_List_is_equal_to_getActivityCount() {
	    int old_count=activity_Count;
		cmnStepDef.user_calls_API_with_http_Request("getActivityCount", "Get");
		assertEquals(old_count, get_Activity_count());
	}

	@Then("All Activities should have Active Status")
	public void all_Activities_should_have_Active_Status() {
	    for(Activity sec:respAllActivities)
		    	assertEquals("Activity with Passive status searched!!!", "Active", sec.getActivityStatus());
	}

	@Then("Response should be List of Activities and size should be one")
	public void response_should_be_list_of_Activity_and_size_should_be_one() {
	    respAllActivities = response.getBody().as(Activity[].class);
		assertTrue("Search by ActivityId do not list one Activity", respAllActivities.length == 1);
	}

	@Then("Each Activity of returned ActivityList should have same activity {string}")
	public void each_Activity_of_returned_ActivityList_should_have_same_activity(String searchItem) {
	    assertTrue("All searched List do not satisfy search criteria",verify_all_records_with_search_criteria(searchItem));
	}

	boolean verify_all_records_with_search_criteria(String searchItem) {
			if(searchItem.equalsIgnoreCase("activityCode"))
			{
				for(Activity p:respAllActivities) 
				if(!(p.getActivityCode().matches(respActivity.getActivityCode())))
					return false;
				return true;
			}
			else if(searchItem.equalsIgnoreCase("activityName"))
			{
				for(Activity p:respAllActivities) 
				if(!(p.getActivityName().matches(respActivity.getActivityName())))
					return false;
				return true;
			}
			else if(searchItem.equalsIgnoreCase("activityStatus"))
			{
				for(Activity p:respAllActivities) 
				if(!(p.getActivityStatus().matches(respActivity.getActivityStatus())))
					return false;
				return true;
			}
			else if(searchItem.equalsIgnoreCase("activityState"))
			{
				for(Activity p:respAllActivities) 
				if(!(p.getActivityState().matches(respActivity.getActivityState())))
					return false;
				return true;
			}
			else 
				return false;
			
		}

	@Then("Verify response will return List of Activities with zero records")
	public void verify_response_will_return_List_of_Activities_with_zero_records() {
	    respAllActivities = response.getBody().as(Activity[].class);
		assertTrue("Count is not correct", respAllActivities.length == 0);
	}

	@Then("Verify Activity fields gets updated")
	public void verify_Activity_fields_gets_updated() {
	    respActivity = response.getBody().as(Activity.class);
		assertThat(reqActivity, is(respActivity));
	}

	@Then("Activity added exist in returned ActivityList")
	public void activity_added_exist_in_returned_ActivityList() {
		List<Activity> ActivityList = Arrays.asList(respAllActivities);
		assertThat(ActivityList, hasItem(respActivity));
	}
	
	@Then("Response Activity is same which was added")
	public void response_Activity_is_same_which_was_added() {
		System.out.println("respPattern === "+respActivity.toString());
		System.out.println("respALLPattern[0] === "+respAllActivities[0].toString());
		assertEquals("Wrong Pattern filtered", respActivity.toString(), respAllActivities[0].toString());
	}

	
}