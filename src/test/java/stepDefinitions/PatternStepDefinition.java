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

import com.google.gson.Gson;

import entity.Pattern;
import entity.Task;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import testBase.Utils;


public class PatternStepDefinition extends Utils {

	static Pattern reqPattern,respPattern;
	Pattern[] respAllPattern;
	static int Pattern_Count;
	CommonStepDefinition cmnStepDef;
	Gson gson;
   
	public PatternStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
		gson=new Gson();
	}


	@Given("{string} User {string} Pattern Payload")
	public void user_Pattern_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqPattern = data.addPattern();
		else if (payloadReq.equalsIgnoreCase("Update"))
			reqPattern = data.updatePattern(reqPattern);
		else
			System.out.println("Issue in Payload creation request");
		
		reqSpec = given().spec(requestSpecification(userRole)).body(reqPattern);
	}
	
		
	@Then("Verify Pattern_Count result is greater than 0")
	public int get_Pattern_count() {
		Pattern_Count = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", Pattern_Count > 0);
		return Pattern_Count;
	}

	@Then("Verify response will return Pattern instance")
	public void verify_response_will_return_Pattern_instance() {
		reqPattern = response.getBody().as(Pattern.class);
		System.out.println("Pattern created === "+reqPattern.toString());
	}

	@Then("Verify response will return List of Pattern")
		public void verify_response_will_return_List_of_Pattern() {

		respAllPattern = response.getBody().as(Pattern[].class);
	}

	@Then("Total number of Pattern in List is equal to getPatternCount")
	public void total_number_of_Pattern_in_List_is_equal_to_getPatternCount() throws IOException {
		int old_count=Pattern_Count;
		cmnStepDef.user_calls_API_with_http_Request("getPatternCount", "Get");
		assertEquals(old_count, get_Pattern_count());
	}

	@Then("Pattern added exist in returned PatternList")
	public void Pattern_added_exist_in_returned_PatternList() {
		List<Pattern> PatternList = Arrays.asList(respAllPattern);
		assertThat(PatternList, hasItems(reqPattern));
	}

	@Given("{string} User invoke getPatternBySearchCriteria with Parameter: {string}")
	public void user_invoke_getPatternBySearchCriteria_with_Parameter(String userRole, String param) throws IOException {
		if (param.equalsIgnoreCase("PatternId"))
		{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,reqPattern.getPatternId());		
		}			
		else if (param.equalsIgnoreCase("PatternName"))
		{				
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,reqPattern.getPatternName());
		}
	}

	@Then("Response should be list of Pattern and size should be one")
	public void response_should_be_list_of_Pattern_and_size_should_be_one() {
		respAllPattern = response.getBody().as(Pattern[].class);
		assertTrue("Search by PatternId do not list one Pattern", respAllPattern.length == 1);
	}

	@Then("Response Pattern is same which was added")
	public void response_Pattern_is_same_which_was_added() {
		assertEquals("Wrong Pattern filtered", reqPattern, respAllPattern[0]);
	}

		@Then("Verify Pattern fields gets updated")
		public void verify_Patternfields_gets_updated() {
		    Pattern updatedPattern=response.getBody().as(Pattern.class);
		reqPattern = response.getBody().as(Pattern.class);
		assertEquals("Pattern name not updated", reqPattern.getPatternName(), reqPattern.getPatternName());
		assertEquals("Pattern Patterntatus not updated", reqPattern.getPatternStatus(), reqPattern.getPatternStatus());
		assertEquals("Pattern PatternCreatedBy not updated", reqPattern.getPatternCreatedBy(),
				reqPattern.getPatternCreatedBy());
		assertEquals("Pattern PatternCreatedAt not updated", reqPattern.getPatternCreatedAt(),
				reqPattern.getPatternCreatedAt());
	}

//	@Then("Verify {string} of particular {string} updated as Passive")
//	public void verify_of_particular_updated_as_Passive(String string, String string2) {
//		reqPattern = response.getBody().as(Pattern.class);
//		assertEquals("Pattern not Deactivated!!!", "Passive", reqPattern.getPatternStatus());
//	}

	@Then("Response should be list all Pattern=getAllPattern")
	public void response_should_be_list_all_Pattern_getAllPattern() {
		Pattern[] actAllPattern = response.getBody().as(Pattern[].class);
		cmnStepDef.user_calls_API_with_http_Request("getAllPattern", "Get");
		Pattern[] expAllPattern = response.getBody().as(Pattern[].class);
		assertArrayEquals("All Pattern not searched in case of no Search Criteria", expAllPattern, actAllPattern);
	}
	
	@Then("Verify Total Pattern_Count increased by 1")
	public void verify_Total_Pattern_Count_increased_by() {
		int old_count=Pattern_Count;
		System.out.println("OLD COunt = "+old_count);
		cmnStepDef.user_calls_API_with_http_Request("getPatternCount", "Get");
		assertEquals(old_count+1, get_Pattern_count());
	}

	@Given("{string} User invoke deletePattern with Parameter: {string}")
	public void user_invoke_deletePattern_with_Parameter(String userRole, String param) throws IOException {
		reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,reqPattern.getPatternId());
	}
	
	@Then("All Pattern should have Active Status")
	public void all_Pattern_should_have_Active_Status() {
	    for(Pattern sec:respAllPattern)
	    	assertEquals("Pattern with Passive status searched!!!", "Active", sec.getPatternStatus());
	}

	@Then("Created Pattern should exist in the List of Pattern")
	public void created_Pattern_should_exist_in_the_List_of_Pattern() {
		List<Pattern> PatternList = Arrays.asList(respAllPattern);
		assertThat(PatternList, hasItems(reqPattern));
	}

}