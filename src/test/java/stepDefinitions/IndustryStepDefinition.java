package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.json.JSONObject;
import org.skyscreamer.jsonassert.Customization;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.comparator.CustomComparator;

import com.google.gson.Gson;

import entity.Activity;
import entity.Industry;
import entity.Sector;
import entity.Task;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class IndustryStepDefinition extends Utils {

	static Industry reqIndustry,respIndustry;
	Industry[] respAllIndustry;
	static int sectCount;
	CommonStepDefinition cmnStepDef;

	public IndustryStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}


	@Given("{string} User {string} Industry Payload")
	public void user_Industry_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqIndustry = data.addIndustry();
		else if (payloadReq.equalsIgnoreCase("Update"))
			reqIndustry = data.updateIndustry(respIndustry);
		else
			System.out.println("Issue in Payload creation request");
		
		reqSpec = given().spec(requestSpecification(userRole)).body(reqIndustry);
	}
	
		
	@Then("Verify industry_Count result is greater than 0")
	public int get_industry_count() {
		sectCount = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", sectCount > 0);
		return sectCount;
	}

	@Then("Verify response will return Industry instance")
	public void verify_response_will_return_Industry_instance() {
		respIndustry = response.getBody().as(Industry.class);
		System.out.println("industry created === "+respIndustry.toString());
	}

	@Then("Verify response will return List of Industries")
	public void Verify_response_will_return_List_of_Industries() {
		respAllIndustry = response.getBody().as(Industry[].class);
	}

	@Then("Total number of Industry in List is equal to getIndustryCount")
	public void total_number_of_Industry_in_List_is_equal_to_getIndustryCount() throws IOException {
		int old_count=sectCount;
		cmnStepDef.user_calls_API_with_http_Request("getIndustryCount", "Get");
		assertEquals(old_count, get_industry_count());
	}

	@Then("Industry added exist in returned Industry List")
	public void Industry_added_exist_in_returned_IndustryList() {
		List<Industry> industryList = Arrays.asList(respAllIndustry);
		assertThat(industryList, hasItem(respIndustry));
	}

	@Given("{string} User invoke getIndustryBySearchCriteria with Parameter: {string}")
	public void user_invoke_getIndustryBySearchCriteria_with_Parameter(String userRole, String param) throws IOException {
		if (param.equalsIgnoreCase("industryId"))
		{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respIndustry.getIndustryId());		
		}			
		else if (param.equalsIgnoreCase("industryName"))
		{				
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respIndustry.getIndustryName());
		}
	}

	@Then("Response should be list of Industries and size should be one")
	public void response_should_be_list_of_Industries_and_size_should_be_one() {
		respAllIndustry = response.getBody().as(Industry[].class);
		assertTrue("Search by industryId do not list one Industry", respAllIndustry.length == 1);
	}

	@Then("Response Industry is same which was added")
	public void response_Industry_is_same_which_was_added() {
		assertEquals("Wrong Industry filtered", respIndustry, respAllIndustry[0]);
	}
	
	@Then("Verify Industry fields gets updated")
	public void verify_Industry_fields_gets_updated() {
		respIndustry = response.getBody().as(Industry.class);
		
		JSONAssert.assertEquals(new JSONObject(reqIndustry).toString(), new JSONObject(respIndustry).toString(), 
				new CustomComparator(JSONCompareMode.LENIENT, 
						new Customization("industryUpdatedAt", (o1, o2) -> true),
						new Customization("industryUpdatedBy", (o1, o2) -> true)));
	}

	@Then("Verify IndustryStatus of particular Industry updated as Passive")
	public void verify_IndustryStatus_updated_as_Passive() {
		respIndustry = response.getBody().as(Industry.class);
		assertEquals("Industry not Deactivated!!!", "Passive", respIndustry.getIndustryStatus());
	}

	@Then("Response should be list all Industries=getAllIndustries")
	public void response_should_be_list_all_Industries_getAllIndustries() {
		Industry[] actAllIndustries = response.getBody().as(Industry[].class);
		cmnStepDef.user_calls_API_with_http_Request("getAllIndustries", "Get");
		Industry[] expAllIndustries = response.getBody().as(Industry[].class);
		assertArrayEquals("All Industries not searched in case of no Search Criteria", expAllIndustries, actAllIndustries);
	}
	@Then("Verify Total industry_Count increased by 1")
	public void verify_Total_industry_Count_increased_by() {
		int old_count=sectCount;
		cmnStepDef.user_calls_API_with_http_Request("getIndustryCount", "Get");
		assertEquals(old_count+1, get_industry_count());
	}

	@Given("{string} User invoke deleteIndustry with Parameter: {string}")
	public void user_invoke_deleteIndustry_with_Parameter(String userRole, String param) {
		reqSpec.queryParam(param, respIndustry.getIndustryId());
	}
	
	@Then("All Industries should have Active Status")
	public void all_Industries_should_have_Active_Status() {
	    for(Industry sec:respAllIndustry)
	    	assertEquals("Industry with Passive status searched!!!", "Active", sec.getIndustryStatus());
	}


	@Given("{string} User {string} Industry Payload  with no Industry Body")
	public void user_industry_Payload_with_no_Industry_Body_and_Param(String userRole, String payloadReq) throws IOException {
	    reqSpec=null;
		reqSpec = given().spec(requestSpecification(userRole));
}
	
	
	@Given("{string} User invoke getIndustryBySearchCriteria with Parameter: {string} & {string} & {string}")
	public void user_invoke_getTaskBySearchCriteria_with_Parameter(String userRole, String param1, String param2, String param3) throws IOException {
		 reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param1,respIndustry.getIndustryId())
																		.queryParam(param2, respIndustry.getIndustryName())
																		.queryParam(param3, respIndustry.getIndustrySectorName());;
																		
	}
	
	@Then("Verify response will return List of Industries with zero records")
	public void verify_response_will_return_List_of_Industries_with_zero_records() {
	    respAllIndustry = response.getBody().as(Industry[].class);
		assertTrue("Count is not zero in case of invalid search criteria.", respAllIndustry.length == 0);
	}
	
	@Given("{string} User {string} Industry Payload  with no Param")
	public void user_Industry_Payload_with_no_Param(String userRole, String payloadReq) throws IOException {
			reqIndustry = data.updateIndustry(respIndustry);
			reqSpec=null;
			reqSpec = given().spec(requestSpecification(userRole)).body(reqIndustry);
	}
	
	

}