package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import entity.Activity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testBase.Utils;

public class ActivityStepDefinition extends Utils {

	static Activity reqActivity, respActivity;
	Activity[] respAllActivities;
	static int actId, actSeq, actDisplaySeq, actCount;
	static String actCode;

	CommonStepDefinition cmnStepDef;

	public ActivityStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}

	@Given("{string} Add Activity Payload")
	public void add_Activity_Payload(String userRole) throws IOException {
		reqSpec = given().spec(requestSpecification(userRole));
		reqActivity = data.addActivity();
		System.out.println("REQUEST BODY +=="+reqActivity.toString());
		reqSpec = given().spec(requestSpecification(
				userRole)).body(reqActivity);
	}

	@Then("Verify responseBody is instance of Activity")
	public void verify_responseBody_is_instance_of_Activity() {
		respActivity = response.getBody().as(Activity.class);
		actId = Integer.parseInt(getKeyValueFromJsonResponse(response, "activityId"));
		actSeq = Integer.parseInt(getKeyValueFromJsonResponse(response, "activitySequence"));
		actDisplaySeq = Integer.parseInt(getKeyValueFromJsonResponse(response, "activityDisplaySequence"));
		actCode = getKeyValueFromJsonResponse(response, "activityCode");
	}

	@Then("activityId and activitySequence and activityDisplaySequence in response body is equal to output of {string}")
	public void activityid_and_activitySequence_and_activityDisplaySequence_in_response_body_is_equal_to_output_of(
			String getActCount) {
		cmnStepDef.user_calls_API_with_http_Request(getActCount, "GET");
		int getActivityCount = Integer.parseInt(response.asString());
		assertEquals(getActivityCount, actId);
		assertEquals(getActivityCount, actSeq);
		assertEquals(getActivityCount, actDisplaySeq);
		assertEquals("ACT_" + getActivityCount, actCode);
	}

	@Then("verify response will return List of Activities")
	public void verify_response_will_return_List_of_Activities() {
		respAllActivities = response.getBody().as(Activity[].class);
	}

	@Then("total number of Activity in List is equal to getActivityCount")
	public void total_number_of_Activity_in_List_is_equal_to_getActivityCount() throws IOException {
		cmnStepDef.user_calls_API_with_http_Request("getActivityCount", "Get");
		actCount = Integer.parseInt(response.asString());
		assertTrue("Total Activities retrieved is not correct", respAllActivities.length == actCount);
	}

	@Then("Activity added exist in returned ActivityList")
	public void activity_added_exist_in_returned_ActivityList() {
		List<Activity> actList = Arrays.asList(respAllActivities);
		assertThat(actList, hasItems(respActivity));
	}

	@Given("{string} Update Activty status as Passive using activity Id generated")
	public void update_Activty_status_as_Passive_using_activity_Id_generated(String userRole) throws IOException {
		reqSpec = given().spec(requestSpecification(userRole));
		System.out.println("Inside Delete Given ::: " + actId);
		reqSpec = given().spec(requestSpecification(
				userRole))
				.queryParam("activityId", actId);
	}

	@Given("{string} User invoke getActivityBySearchCriteria with Parameters: activityCode, activityId, activityStatus")
	public void user_invoke_getActivityBySearchCriteria_with_Parameters_activityCode_activityId_activityStatus(String userRole) throws IOException {
		reqSpec = given().spec(requestSpecification(userRole));
		System.out.println("activity Code === " + respActivity.getActivityCode());
		System.out.println("activity Id === " + respActivity.getActivityId());
		System.out.println("activity Status === " + respActivity.getActivityStatus());
	}

	@When("perform {string} by {string}")
	public void perform_by(String apiNm, String searchCriteria) throws IOException {
		if (searchCriteria.equalsIgnoreCase("activityId"))
			reqSpec =reqSpec.queryParam(searchCriteria, respActivity.getActivityId());
		else if (searchCriteria.equalsIgnoreCase("activityCode"))
			reqSpec = reqSpec.queryParam(searchCriteria, respActivity.getActivityCode());
		else if (searchCriteria.equalsIgnoreCase("activityStatus"))
			reqSpec = reqSpec.queryParam(searchCriteria, respActivity.getActivityStatus());
		cmnStepDef.user_calls_API_with_http_Request(apiNm, "Get");
	}

	@Then("{string} for all Activities is {string}")
	public void for_all_Activities_is(String string, String string2) {

	}

	@Then("Activity List should have only one Activity")
	public void activity_List_should_have_only_one_Activity() {

		assertEquals(respActivity.getActivityId(),
				Integer.parseInt(getKeyValueFromJsonResponse(response, "activityId")));
	}

	@Then("Updated Payload and Response Payload should be equal")
	public void updated_Payload_and_Response_Payload_should_be_equal() {

	}
}