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
import entity.Squad;
import entity.Sector;
import entity.Task;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class SquadStepDefinition extends Utils {

	static Squad reqSquad,respSquad;
	Squad[] respAllSquad;
	static int sectCount;
	CommonStepDefinition cmnStepDef;

	public SquadStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}

/*
	@Given("{string} User {string} Squad Payload")
	public void user_Squad_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqSquad = data.addSquad();
		else if (payloadReq.equalsIgnoreCase("Update"))
			reqSquad = data.updateSquad(respSquad);
		else
			System.out.println("Issue in Payload creation request");
		
		reqSpec = given().spec(requestSpecification(userRole)).body(reqSquad);
	}*/
	
		
	@Then("Verify squad_Count result is greater than 0")
	public int get_squad_count() {
		sectCount = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", sectCount > 0);
		return sectCount;
	}

	@Then("Verify response will return Squad instance")
	public void verify_response_will_return_Squad_instance() {
		respSquad = response.getBody().as(Squad.class);
		System.out.println("squad created === "+respSquad.toString());
	}

	@Then("Verify response will return List of Squads")
	public void Verify_response_will_return_List_of_Squads() {
		respAllSquad = response.getBody().as(Squad[].class);
	}

	@Then("Total number of Squad in List is equal to getSquadCount")
	public void total_number_of_Squad_in_List_is_equal_to_getSquadCount() throws IOException {
		int old_count=sectCount;
		cmnStepDef.user_calls_API_with_http_Request("getSquadCount", "Get");
		assertEquals(old_count, get_squad_count());
	}

	@Then("Squad added exist in returned Squad List")
	public void Squad_added_exist_in_returned_SquadList() {
		List<Squad> squadList = Arrays.asList(respAllSquad);
		assertThat(squadList, hasItem(respSquad));
	}

	@Given("{string} User invoke getSquadBySearchCriteria with Parameter: {string}")
	public void user_invoke_getSquadBySearchCriteria_with_Parameter(String userRole, String param) throws IOException {
		if (param.equalsIgnoreCase("squadId"))
		{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respSquad.getSquadId());		
		}			
		else if (param.equalsIgnoreCase("squadName"))
		{				
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respSquad.getSquadName());
		}
	}

	@Then("Response should be list of Squads and size should be one")
	public void response_should_be_list_of_Squads_and_size_should_be_one() {
		respAllSquad = response.getBody().as(Squad[].class);
		assertTrue("Search by squadId do not list one Squad", respAllSquad.length == 1);
	}

	@Then("Response Squad is same which was added")
	public void response_Squad_is_same_which_was_added() {
		assertEquals("Wrong Squad filtered", respSquad, respAllSquad[0]);
	}
	
	@Then("Verify Squad fields gets updated")
	public void verify_Squad_fields_gets_updated() {
		respSquad = response.getBody().as(Squad.class);
		
		JSONAssert.assertEquals(new JSONObject(reqSquad).toString(), new JSONObject(respSquad).toString(), 
				new CustomComparator(JSONCompareMode.LENIENT, 
						new Customization("squadUpdatedAt", (o1, o2) -> true),
						new Customization("squadUpdatedBy", (o1, o2) -> true)));
	}

	@Then("Verify SquadStatus of particular Squad updated as Passive")
	public void verify_SquadStatus_updated_as_Passive() {
		respSquad = response.getBody().as(Squad.class);
		assertEquals("Squad not Deactivated!!!", "Passive", respSquad.getSquadStatus());
	}

	@Then("Response should be list all Squads=getAllSquads")
	public void response_should_be_list_all_Squads_getAllSquads() {
		Squad[] actAllSquads = response.getBody().as(Squad[].class);
		cmnStepDef.user_calls_API_with_http_Request("getAllSquads", "Get");
		Squad[] expAllSquads = response.getBody().as(Squad[].class);
		assertArrayEquals("All Squads not searched in case of no Search Criteria", expAllSquads, actAllSquads);
	}
	@Then("Verify Total squad_Count increased by 1")
	public void verify_Total_squad_Count_increased_by() {
		int old_count=sectCount;
		cmnStepDef.user_calls_API_with_http_Request("getSquadCount", "Get");
		assertEquals(old_count+1, get_squad_count());
	}

	@Given("{string} User invoke deleteSquad with Parameter: {string}")
	public void user_invoke_deleteSquad_with_Parameter(String userRole, String param) {
		reqSpec.queryParam(param, respSquad.getSquadId());
	}
	
	@Then("All Squads should have Active Status")
	public void all_Squads_should_have_Active_Status() {
	    for(Squad sec:respAllSquad)
	    	assertEquals("Squad with Passive status searched!!!", "Active", sec.getSquadStatus());
	}


	@Given("{string} User {string} Squad Payload  with no Squad Body")
	public void user_squad_Payload_with_no_Squad_Body_and_Param(String userRole, String payloadReq) throws IOException {
	    reqSpec=null;
		reqSpec = given().spec(requestSpecification(userRole));
}
	
	
	@Given("{string} User invoke getSquadBySearchCriteria with Parameter: {string} & {string} & {string}")
	public void user_invoke_getTaskBySearchCriteria_with_Parameter(String userRole, String param1, String param2, String param3) throws IOException {
		 reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param1,respSquad.getSquadId())
																		.queryParam(param2, respSquad.getSquadName())
																		.queryParam(param3, respSquad.getSquadStatus());;
																		
	}
	
	@Then("Verify response will return List of Squads with zero records")
	public void verify_response_will_return_List_of_Squads_with_zero_records() {
	    respAllSquad = response.getBody().as(Squad[].class);
		assertTrue("Count is not zero in case of invalid search criteria.", respAllSquad.length == 0);
	}
	
	@Given("{string} User {string} Squad Payload  with no Param")
	public void user_Squad_Payload_with_no_Param(String userRole, String payloadReq) throws IOException {
			reqSquad = data.updateSquad(respSquad);
			reqSpec=null;
			reqSpec = given().spec(requestSpecification(userRole)).body(reqSquad);
	}
	
	@Given("{string} User {string} Squad Payload with Param = {string}")
	public void user_Squad_Payload(String userRole, String payloadReq,String param) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
		{
			reqSquad = data.addSquad();
			reqSpec = given().spec(requestSpecification(userRole)).body(reqSquad);
		}
		else if (payloadReq.equalsIgnoreCase("Update"))
		{
			reqSquad = data.updateSquad(respSquad);
			reqSpec=null;
			reqSpec = given().spec(requestSpecification(userRole)).body(reqSquad).queryParam(param, respSquad.getSquadId());
			
		}			
		else
			System.out.println("Issue in Payload creation request");
	
	}
	
	@Given("{string} User {string} Squad Payload  with invalid Param = {string} and value=\"{int}\"")
	public void user_Activity_Payload_with_invalid_Param_and_value(String userRole, String payloadReq,String param, int i) throws IOException {
			reqSquad = data.updateSquad(respSquad);
			reqSpec=null;
			reqSpec = given().spec(requestSpecification(userRole)).body(reqSquad).queryParam(param,i);
	}
	
	@Given("{string} User {string} Squad Payload  with no Squad Body and Param = {string}")
	public void user_Squad_Payload_with_no_Squad_Body_and_Param(String userRole, String payloadReq, String param) throws IOException {
			reqSpec=null;
			reqSpec = given().spec(requestSpecification(userRole));
		if (payloadReq.equalsIgnoreCase("Update"))
				reqSpec = reqSpec.queryParam(param, respSquad.getSquadId());
		
	}

}