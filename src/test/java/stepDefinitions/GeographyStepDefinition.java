package stepDefinitions;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.Customization;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.comparator.CustomComparator;
import entity.Geography;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class GeographyStepDefinition extends Utils {

	static Geography reqGeography, respGeography;
	Geography[] respAllGeography;
	static int geoCount;
	CommonStepDefinition cmnStepDef;

	public GeographyStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}

	@Then("Verify geography_Count result is greater than 0")
	public int get_geography_count() {
		geoCount = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", geoCount > 0);
		return geoCount;
	}

	@Then("Verify response will return Geography instance")
	public void verify_response_will_return_Geography_instance() {
		respGeography = response.getBody().as(Geography.class);
		System.out.println("geography created === " + respGeography.toString());
	}

	@Then("Verify response will return List of Geographies")
	public void Verify_response_will_return_List_of_Geographies() {
		respAllGeography = response.getBody().as(Geography[].class);
	}

	@Then("Total number of Geography in List is equal to getGeographyCount")
	public void total_number_of_Geography_in_List_is_equal_to_getGeographyCount() throws IOException {
		int old_count = geoCount;
		cmnStepDef.user_calls_API_with_http_Request("getGeographyCount", "Get");
		assertEquals(old_count, get_geography_count());
	}

	@Then("Geography added exist in returned Geography List")
	public void geography_added_exist_in_returned_GeographyList() {
		List<Geography> geographyList = Arrays.asList(respAllGeography);
		assertThat(geographyList, hasItem(respGeography));
	}

	@Given("{string} User invoke getGeographyBySearchCriteria with Parameter: {string}")
	public void user_invoke_getGeographyBySearchCriteria_with_Parameter(String userRole, String param) throws IOException {
		if (param.equalsIgnoreCase("geographyId")) {
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respGeography.getGeographyId());
		} else if (param.equalsIgnoreCase("geographyName")) {
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respGeography.getGeographyName());
		}
	}

	@Then("Response should be list of Geographies and size should be one")
	public void response_should_be_list_of_Geographies_and_size_should_be_one() {
		respAllGeography = response.getBody().as(Geography[].class);
		assertTrue("Search by geographyId do not list one Geography", respAllGeography.length == 1);
	}

	@Then("Response Geography is same which was added")
	public void response_Geography_is_same_which_was_added() {
		assertEquals("Wrong Geography filtered", respGeography, respAllGeography[0]);
	}

	@Then("Verify Geography fields gets updated")
	public void verify_Geography_fields_gets_updated() {
		respGeography = response.getBody().as(Geography.class);

		JSONAssert.assertEquals(new JSONObject(reqGeography).toString(), new JSONObject(respGeography).toString(),
				new CustomComparator(JSONCompareMode.LENIENT,
						new Customization("geographyUpdatedAt", (o1, o2) -> true),
						new Customization("geographyUpdatedBy", (o1, o2) -> true)));
	}

	@Then("Verify GeographyStatus of particular Geography updated as Passive")
	public void verify_GeographyStatus_updated_as_Passive() {
		respGeography = response.getBody().as(Geography.class);
		assertEquals("Geography not Deactivated!!!", "Passive", respGeography.getGeographyStatus());
	}

	@Then("Response should be list all Geographies=getAllGeographies")
	public void response_should_be_list_all_Geographies_getAllGeographies() {
		Geography[] actAllGeographies = response.getBody().as(Geography[].class);
		cmnStepDef.user_calls_API_with_http_Request("getAllGeographies", "Get");
		Geography[] expAllGeographies = response.getBody().as(Geography[].class);
		assertTrue("All Geographies not searched in case of no Search Criteria", 
				actAllGeographies.length == expAllGeographies.length && 
				Arrays.asList(actAllGeographies).containsAll(Arrays.asList(expAllGeographies)));		
	}

	@Then("Verify Total geography_Count increased by 1")
	public void verify_Total_geography_Count_increased_by() {
		int old_count = geoCount;
		cmnStepDef.user_calls_API_with_http_Request("getGeographyCount", "Get");
		assertEquals(old_count + 1, get_geography_count());
	}

	@Given("{string} User invoke deleteGeography with Parameter: {string}")
	public void user_invoke_deleteGeography_with_Parameter(String userRole, String param) {
		reqSpec.queryParam(param, respGeography.getGeographyId());
	}

	@Then("All Geographies should have Active Status")	public void all_Geographies_should_have_Active_Status() {
		for (Geography sec : respAllGeography)
			assertEquals("Geography with Passive status searched!!!", "Active", sec.getGeographyStatus());
	}

	@Given("{string} User invoke getGeographyBySearchCriteria with Parameter: {string} & {string}")
	public void user_invoke_getTaskBySearchCriteria_with_Parameter(String userRole, String param1, String param2) throws IOException {
		reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole))
				.queryParams(param1, respGeography.getGeographyId())
				.queryParam(param2, respGeography.getGeographyName());
	}

	@Then("Verify response will return List of Geographies with zero records")
	public void verify_response_will_return_List_of_Geographies_with_zero_records() {
		respAllGeography = response.getBody().as(Geography[].class);
		assertTrue("Count is not zero in case of invalid search criteria.", respAllGeography.length == 0);
	}

	@Given("{string} User {string} Geography Payload")
	public void user_Geography_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqGeography = data.addGeography();
		else if (payloadReq.equalsIgnoreCase("Update"))
			reqGeography = data.updateGeography(respGeography);
		else
			System.out.println("Issue in Payload creation request");

		reqSpec=null;
		reqSpec = given().spec(requestSpecification(userRole)).body(reqGeography);
	}
}