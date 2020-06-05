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

import entity.Cic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class CicStepDefinition extends Utils {

	static Cic reqCic,respCic;
	Cic[] respAllCic;
	static int sectCount;
	CommonStepDefinition cmnStepDef;

	public CicStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}


	@Given("{string} User {string} Cic Payload")
	public void user_Cic_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqCic = data.addCic();
		else if (payloadReq.equalsIgnoreCase("Update"))
			reqCic = data.updateCic(respCic);
		else
			System.out.println("Issue in Payload creation request");
		
		reqSpec = given().spec(requestSpecification(userRole)).body(reqCic);
	}
	
		
	@Then("Verify cic_Count result is greater than 0")
	public int get_cic_count() {
		sectCount = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", sectCount > 0);
		return sectCount;
	}

	@Then("Verify response will return Cic instance")
	public void verify_response_will_return_Cic_instance() {
		respCic = response.getBody().as(Cic.class);
		System.out.println("cic created === "+respCic.toString());
	}

	@Then("Verify response will return List of Cics")
	public void Verify_response_will_return_List_of_Cics() {
		respAllCic = response.getBody().as(Cic[].class);
	}

	@Then("Total number of Cic in List is equal to getCicCount")
	public void total_number_of_Cic_in_List_is_equal_to_getCicCount() throws IOException {
		int old_count=sectCount;
		cmnStepDef.user_calls_API_with_http_Request("getCicCount", "Get");
		assertEquals(old_count, get_cic_count());
	}

	@Then("Cic added exist in returned Cic List")
	public void Cic_added_exist_in_returned_CicList() {
		List<Cic> cicList = Arrays.asList(respAllCic);
		assertThat(cicList, hasItem(respCic));
	}

	@Given("{string} User invoke getCicBySearchCriteria with Parameter: {string}")
	public void user_invoke_getCicBySearchCriteria_with_Parameter(String userRole, String param) throws IOException {
		if (param.equalsIgnoreCase("cicId"))
		{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respCic.getCicId());		
		}			
		else if (param.equalsIgnoreCase("cicName"))
		{				
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respCic.getCicName());
		}
	}

	@Then("Response should be list of Cics and size should be one")
	public void response_should_be_list_of_Cics_and_size_should_be_one() {
		respAllCic = response.getBody().as(Cic[].class);
		assertTrue("Search by cicId do not list one Cic", respAllCic.length == 1);
	}

	@Then("Response Cic is same which was added")
	public void response_Cic_is_same_which_was_added() {
		assertEquals("Wrong Cic filtered", respCic, respAllCic[0]);
	}
	
	@Then("Verify Cic fields gets updated")
	public void verify_Cic_fields_gets_updated() {
		respCic = response.getBody().as(Cic.class);
		
		JSONAssert.assertEquals(new JSONObject(reqCic).toString(), new JSONObject(respCic).toString(), 
				new CustomComparator(JSONCompareMode.LENIENT, 
						new Customization("cicUpdatedAt", (o1, o2) -> true),
						new Customization("cicUpdatedBy", (o1, o2) -> true)));
	}

	@Then("Verify CicStatus of particular Cic updated as Passive")
	public void verify_CicStatus_updated_as_Passive() {
		respCic = response.getBody().as(Cic.class);
		assertEquals("Cic not Deactivated!!!", "Passive", respCic.getCicStatus());
	}

	@Then("Response should be list all Cics=getAllCics")
	public void response_should_be_list_all_Cics_getAllCics() {
		Cic[] actAllCics = response.getBody().as(Cic[].class);
		cmnStepDef.user_calls_API_with_http_Request("getAllCics", "Get");
		Cic[] expAllCics = response.getBody().as(Cic[].class);
		assertArrayEquals("All Cics not searched in case of no Search Criteria", expAllCics, actAllCics);
	}
	@Then("Verify Total cic_Count increased by 1")
	public void verify_Total_cic_Count_increased_by() {
		int old_count=sectCount;
		cmnStepDef.user_calls_API_with_http_Request("getCicCount", "Get");
		assertEquals(old_count+1, get_cic_count());
	}

	@Given("{string} User invoke deleteCic with Parameter: {string}")
	public void user_invoke_deleteCic_with_Parameter(String userRole, String param) {
		reqSpec.queryParam(param, respCic.getCicId());
	}
	
	@Then("All Cics should have Active Status")
	public void all_Cics_should_have_Active_Status() {
	    for(Cic sec:respAllCic)
	    	assertEquals("Cic with Passive status searched!!!", "Active", sec.getCicStatus());
	}


	@Given("{string} User {string} Cic Payload  with no Cic Body")
	public void user_cic_Payload_with_no_Cic_Body_and_Param(String userRole, String payloadReq) throws IOException {
	    reqSpec=null;
		reqSpec = given().spec(requestSpecification(userRole));
}
	
	
	@Given("{string} User invoke getCicBySearchCriteria with Parameter: {string} & {string}")
	public void user_invoke_getTaskBySearchCriteria_with_Parameter(String userRole, String param1, String param2) throws IOException {
		 reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param1,respCic.getCicId())
																		.queryParam(param2, respCic.getCicName());
																		
	}
	
	@Then("Verify response will return List of Cics with zero records")
	public void verify_response_will_return_List_of_Cics_with_zero_records() {
	    respAllCic = response.getBody().as(Cic[].class);
		assertTrue("Count is not zero in case of invalid search criteria.", respAllCic.length == 0);
	}
	
	@Given("{string} User {string} Cic Payload  with no Param")
	public void user_Cic_Payload_with_no_Param(String userRole, String payloadReq) throws IOException {
			reqCic = data.updateCic(respCic);
			reqSpec=null;
			reqSpec = given().spec(requestSpecification(userRole)).body(reqCic);
	}
	
	

}