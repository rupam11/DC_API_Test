package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertArrayEquals;
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
import entity.Country;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class CountryStepDefinition extends Utils {

	static Country reqCountry, respCountry;
	Country[] respAllCountry;
	static int sectCount;
	CommonStepDefinition cmnStepDef;

	public CountryStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}

	@Given("{string} User {string} Country Payload")
	public void user_Country_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqCountry = data.addCountry();
		else if (payloadReq.equalsIgnoreCase("Update"))
			reqCountry = data.updateCountry(respCountry);
		else
			System.out.println("Issue in Payload creation request");

		reqSpec = given().spec(requestSpecification(userRole)).body(reqCountry);
	}

	@Then("Verify country_Count result is greater than 0")
	public int get_country_count() {
		sectCount = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", sectCount > 0);
		return sectCount;
	}

	@Then("Verify response will return Country instance")
	public void verify_response_will_return_Country_instance() {
		respCountry = response.getBody().as(Country.class);
		System.out.println("country created === " + respCountry.toString());
	}

	@Then("Verify response will return List of Countries")
	public void Verify_response_will_return_List_of_Countries() {
		respAllCountry = response.getBody().as(Country[].class);
	}

	@Then("Total number of Country in List is equal to getCountryCount")
	public void total_number_of_Country_in_List_is_equal_to_getCountryCount() throws IOException {
		int old_count = sectCount;
		cmnStepDef.user_calls_API_with_http_Request("getCountryCount", "Get");
		assertEquals(old_count, get_country_count());
	}

	@Then("Country added exist in returned Country List")
	public void Country_added_exist_in_returned_CountryList() {
		List<Country> countryList = Arrays.asList(respAllCountry);
		assertThat(countryList, hasItem(respCountry));
	}

	@Given("{string} User invoke getCountryBySearchCriteria with Parameter: {string}")
	public void user_invoke_getCountryBySearchCriteria_with_Parameter(String userRole, String param)
			throws IOException {
		if (param.equalsIgnoreCase("countryId")) {
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respCountry.getCountryId());
		} else if (param.equalsIgnoreCase("countryName")) {
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respCountry.getCountryName());
		}
	}

	@Then("Response should be list of Countries and size should be one")
	public void response_should_be_list_of_Countries_and_size_should_be_one() {
		respAllCountry = response.getBody().as(Country[].class);
		assertTrue("Search by countryId do not list one Country", respAllCountry.length == 1);
	}

	@Then("Response Country is same which was added")
	public void response_Country_is_same_which_was_added() {
		assertEquals("Wrong Country filtered", respCountry, respAllCountry[0]);
	}

	@Then("Verify Country fields gets updated")
	public void verify_Country_fields_gets_updated() {
		respCountry = response.getBody().as(Country.class);

		JSONAssert.assertEquals(new JSONObject(reqCountry).toString(), new JSONObject(respCountry).toString(),
				new CustomComparator(JSONCompareMode.LENIENT, new Customization("countryUpdatedAt", (o1, o2) -> true),
						new Customization("countryUpdatedBy", (o1, o2) -> true)));
	}

	@Then("Verify CountryStatus of particular Country updated as Passive")
	public void verify_CountryStatus_updated_as_Passive() {
		respCountry = response.getBody().as(Country.class);
		assertEquals("Country not Deactivated!!!", "Passive", respCountry.getCountryStatus());
	}

	@Then("Response should be list all Countries=getAllCountries")
	public void response_should_be_list_all_Countries_getAllCountries() {
		Country[] actAllCountries = response.getBody().as(Country[].class);
		cmnStepDef.user_calls_API_with_http_Request("getAllCountries", "Get");
		Country[] expAllCountries = response.getBody().as(Country[].class);
		assertArrayEquals("All Countries not searched in case of no Search Criteria", expAllCountries, actAllCountries);
	}

	@Then("Verify Total country_Count increased by 1")
	public void verify_Total_country_Count_increased_by() {
		int old_count = sectCount;
		cmnStepDef.user_calls_API_with_http_Request("getCountryCount", "Get");
		assertEquals(old_count + 1, get_country_count());
	}

	@Given("{string} User invoke deleteCountry with Parameter: {string}")
	public void user_invoke_deleteCountry_with_Parameter(String userRole, String param) {
		reqSpec.queryParam(param, respCountry.getCountryId());
	}

	@Then("All Countries should have Active Status")
	public void all_Countries_should_have_Active_Status() {
		for (Country sec : respAllCountry)
			assertEquals("Country with Passive status searched!!!", "Active", sec.getCountryStatus());
	}

	@Given("{string} User {string} Country Payload  with no Country Body")
	public void user_country_Payload_with_no_Country_Body_and_Param(String userRole, String payloadReq)
			throws IOException {
		reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole));
	}

	@Given("{string} User invoke getCountryBySearchCriteria with Parameter: {string} & {string} & {string}")
	public void user_invoke_getTaskBySearchCriteria_with_Parameter(String userRole, String param1, String param2,
			String param3) throws IOException {
		reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole)).queryParams(param1, respCountry.getCountryId())
				.queryParam(param2, respCountry.getCountryName())
				.queryParam(param3, respCountry.getCountryGeographyName());
		;

	}

	@Then("Verify response will return List of Countries with zero records")
	public void verify_response_will_return_List_of_Countries_with_zero_records() {
		respAllCountry = response.getBody().as(Country[].class);
		assertTrue("Count is not zero in case of invalid search criteria.", respAllCountry.length == 0);
	}

	@Given("{string} User {string} Country Payload  with no Param")
	public void user_Country_Payload_with_no_Param(String userRole, String payloadReq) throws IOException {
		reqCountry = data.updateCountry(respCountry);
		reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole)).body(reqCountry);
	}

}