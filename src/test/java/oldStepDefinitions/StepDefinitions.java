package oldStepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
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
import pojo.Sector;
import pojo.Task;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefinitions extends Utils {

	RequestSpecification reqSpec;
	ResponseSpecification respSpec;
	Response response;
	TestDataBuild data = new TestDataBuild();
	static Activity respActivity;
	Activity reqActivity;
	Activity[] respAllActivities;

	static int actId, actSeq, actDisplaySeq, actCount;
	static String actCode;
	static Sector respSector;
	Sector reqSector;
	static Sector[] respAllSectors;
	int sectCount, sectId;

	// ============Common Steps==================
	@Given("User invoke {string}")
	public void user_invoke_getActivityCount(String apiNm) throws IOException {
		reqSpec = given().spec(requestSpecification());
	}

	@When("user calls {string} API with {string} http Request")
	public void user_calls_API_with_http_Request(String apiNm, String method) {
		APIResources resourceAPI = APIResources.valueOf(apiNm);
		System.out.println("API Called ::: " + apiNm + " with Method === " + method);
		respSpec = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();

		if (method.equalsIgnoreCase("Post"))
			response = reqSpec.when().post(resourceAPI.getResource()).then().spec(respSpec).extract().response();
		else if (method.equalsIgnoreCase("Get"))
			response = reqSpec.when().get(resourceAPI.getResource()).then().spec(respSpec).extract().response();
		else if (method.equalsIgnoreCase("Delete"))
			response = reqSpec.when().delete(resourceAPI.getResource()).then().spec(respSpec).extract().response();
		else if (method.equalsIgnoreCase("Put"))
			response = reqSpec.when().put(resourceAPI.getResource()).then().spec(respSpec).extract().response();
	}

	@Then("the API call is success with StatusCode {int}")
	public void the_API_call_is_success_with_StatusCode(int expStatusCode) {
		assertEquals(expStatusCode, response.getStatusCode());
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyName, String keyValue) {
		assertEquals(getKeyValueFromJsonResponse(response, keyName), keyValue);
	}

	@Then("verify responseBody return int value")
	public int verify_responseBody_return_int_value() {
		int count = Integer.parseInt(response.getBody().asString());
		return count;

	}

	@Then("getCount from Response and verify it is >=0")
	public int getcount_from_Response_and_verify_it_is_0() {
		int count = Integer.parseInt(response.getBody().asString());
		assertTrue("Sector Count is not correct", count > 0);
		return count;

	}
	// =======================================================================================================================

	// ============================================Activity
	// Steps==============================================================
	@Given("Add Activity Payload")
	public void add_Activity_Payload() throws IOException {
		reqActivity = data.addActivity();
		reqSpec = given().spec(requestSpecification()).body(data.addActivity());
	}

	@Then("Then verify responseBody is instance of Activity")
	public void verify_responseBody_is_instance_of_Activity() {
		respActivity = response.getBody().as(Activity.class);
		// assertThat(response.getBody(), instanceOf(Task.class));
		actId = Integer.parseInt(getKeyValueFromJsonResponse(response, "activityId"));
		actSeq = Integer.parseInt(getKeyValueFromJsonResponse(response, "activitySequence"));
		actDisplaySeq = Integer.parseInt(getKeyValueFromJsonResponse(response, "activityDisplaySequence"));
		actCode = getKeyValueFromJsonResponse(response, "activityCode");
	}

	@Then("activityId and activitySequence and activityDisplaySequence in response body is equal to output of {string}")
	public void activityid_and_activitySequence_and_activityDisplaySequence_in_response_body_is_equal_to_output_of(
			String getActCount) {
		user_calls_API_with_http_Request(getActCount, "GET");
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
		user_calls_API_with_http_Request("getActivityCount", "Get");
		actCount = Integer.parseInt(response.asString());
		assertTrue("Total Activities retrieved is not correct", respAllActivities.length == actCount);
	}

	@Then("Activity added exist in returned ActivityList")
	public void activity_added_exist_in_returned_ActivityList() {
		List<Activity> actList = Arrays.asList(respAllActivities);
		assertThat(actList, hasItems(respActivity));
	}

	@Given("Update Activty status as Passive using activity Id generated")
	public void update_Activty_status_as_Passive_using_activity_Id_generated() throws IOException {
		System.out.println("Inside Delete Given ::: " + actId);
		reqSpec = given().spec(requestSpecification()).queryParam("activityId", actId);
	}

	@Given("User invoke getActivityBySearchCriteria with Parameters: activityCode, activityId, activityStatus")
	public void user_invoke_getActivityBySearchCriteria_with_Parameters_activityCode_activityId_activityStatus() {
		System.out.println("activity Code === " + respActivity.getActivityCode());
		System.out.println("activity Id === " + respActivity.getActivityId());
		System.out.println("activity Status === " + respActivity.getActivityStatus());
	}

	@When("perform {string} by {string}")
	public void perform_by(String apiNm, String searchCriteria) throws IOException {
		if (searchCriteria.equalsIgnoreCase("activityId"))
			reqSpec = given().spec(requestSpecification()).queryParam(searchCriteria, respActivity.getActivityId());
		else if (searchCriteria.equalsIgnoreCase("activityCode"))
			reqSpec = given().spec(requestSpecification()).queryParam(searchCriteria, respActivity.getActivityCode());
		else if (searchCriteria.equalsIgnoreCase("activityStatus"))
			reqSpec = given().spec(requestSpecification()).queryParam(searchCriteria, respActivity.getActivityStatus());
		user_calls_API_with_http_Request(apiNm, "Get");
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

	// =======================================================================================================================
	// ============================================Sector
	// Steps==============================================================

//		@Then("Total_Sector_Count>0")
//		public void total_Sector_count_0() {
//		sectCount=Integer.parseInt(response.asString());
//			  assertTrue("Sector Count is not correct", sectCount > 0); }
//			  
	@Given("Add Sector Payload")
	public void add_Sector_Payload() throws IOException {
		reqSector = data.addSector();
		reqSpec = given().spec(requestSpecification()).body(data.addSector());
	}

	@Then("verify response will return Sector instance")
	public void verify_response_will_return_Sector_instance() {
		respSector = response.getBody().as(Sector.class);
		user_calls_API_with_http_Request("getSectorCount", "Get");
		int expSecId=getcount_from_Response_and_verify_it_is_0();
		int actSecId=respSector.getSectorId();
		assertEquals("Sector do not get added properly",expSecId,actSecId);
	}

	@Then("verify response will return List of Sectors")
	public void verify_response_will_return_List_of_Sectors() {
		System.out.println("Response body after getAllSectors =="+response.getBody().asString());
		respAllSectors = response.getBody().as(Sector[].class);		
	}

	@Then("total number of Sector in List is equal to getSectorCount")
	public void total_number_of_Sector_in_List_is_equal_to_getSectorCount() throws IOException {
		user_calls_API_with_http_Request("getSectorCount", "Get");
		sectCount = getcount_from_Response_and_verify_it_is_0();
		assertTrue("Total Sectors retrieved is not correct", respAllSectors.length == sectCount);
	}

	@Then("Sector added exist in returned SectorList")
	public void Sector_added_exist_in_returned_SectorList() {
		List<Sector> sectorList = Arrays.asList(respAllSectors);
		assertThat(sectorList, hasItems(respSector));
	}
	
	@Given("User invoke {string} with Parameters: SectorName, SectorId")
	public void user_invoke_with_Parameters_SectorName_SectorId(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} for all Sectors is {string}")
	public void for_all_Sectors_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Sector List should have only one Sector")
	public void sector_List_should_have_only_one_Sector() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	

//	@Given("Update Activty status as Passive using Sector Id generated")
//	public void update_Activty_status_as_Passive_using_Sector_Id_generated() throws IOException {
//		reqSpec = given().spec(requestSpecification()).queryParam("SectorId", sectId);
//	}
//
//	@Given("User invoke getSectorBySearchCriteria with Parameters: SectorCode, SectorId, SectorStatus")
//	public void user_invoke_getSectorBySearchCriteria_with_Parameters_SectorCode_SectorId_SectorStatus() {
//
//	}

//			  @When("perform {string} by {string}")
//			  public void perform_by(String apiNm,
//			  String searchCriteria) throws IOException {
//			  if(searchCriteria.equalsIgnoreCase("SectorId"))
//			  reqSpec=given().spec(requestSpecification()).queryParam(searchCriteria,
//			  respSector.getSectorId()); else
//			  if(searchCriteria.equalsIgnoreCase("SectorName"))
//			  reqSpec=given().spec(requestSpecification()).queryParam(searchCriteria,
//			  respSector.getSectorName());
//			  
//			  user_calls_API_with_http_Request(apiNm, "Get"); }
//			  
//	@Then("{string} for all Sectors is {string}")
//	public void for_all_Sectors_is(String string, String string2) {
//
//	}
//
//	@Then("Sector List should have only one Sector")
//	public void Sector_List_should_have_only_one_Sector() {
//
//		assertEquals(respSector.getSectorId(), Integer.parseInt(getKeyValueFromJsonResponse(response, "SectorId")));
//	}

	// =======================================================================================================================

}