package stepDefinitions;

import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.hasItems;
//import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;
//import static org.junit.Assert.assertTrue;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.Customization;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.comparator.CustomComparator;
import org.springframework.util.Assert;

import com.google.gson.Gson;

import entity.Industry;
import entity.Pattern;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class PatternStepDefinition extends Utils {

	static Pattern reqPattern,respPattern;
	Pattern[] respAllPattern;
	static int pattern_Count;
	CommonStepDefinition cmnStepDef;
	JSONObject jsonObject,actJsonObj,expJsonObj;

	public PatternStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
		
	}

	@Given("{string} User {string} Pattern Payload with Param = {string}")
	public void user_Pattern_Payload(String userRole, String payloadReq,String param) throws IOException {
		
		if (payloadReq.equalsIgnoreCase("Add"))
		{
			reqPattern = data.addPattern();
			reqSpec = given().spec(requestSpecification(userRole)).body(reqPattern);
		}
		else if (payloadReq.equalsIgnoreCase("Update"))
		{
			reqPattern = data.updatePattern(respPattern);
			reqSpec=null;
			reqSpec = given().spec(requestSpecification(userRole)).body(reqPattern).queryParam(param, respPattern.getPatternId());
			
		}			
		else
			System.out.println("Issue in Payload creation request");
	
	}
	
	@Given("{string} User {string} Pattern Payload  with invalid Param = {string} and value=\"{int}\"")
	public void user_Pattern_Payload_with_invalid_Param(String userRole, String payloadReq,String param, int i) throws IOException {

		reqPattern = data.updatePattern(respPattern);
		reqSpec=null;
		reqSpec = given().spec(requestSpecification(userRole)).body(reqPattern).queryParam(param,i);
	}
	
		
	@Then("Verify Pattern_Count result is greater than or equal to 0")
	public int get_Pattern_count() {
		pattern_Count = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", pattern_Count >= 0);
		return pattern_Count;
	}

	@Then("Verify response will return Pattern instance")
	public void verify_response_will_return_Pattern_instance() {
		respPattern = response.getBody().as(Pattern.class);
		System.out.println("Pattern created === "+respPattern.toString());
	}

	@Then("Verify response will return List of Pattern")
	public void verify_response_will_return_List_of_Pattern() {
		respAllPattern = response.getBody().as(Pattern[].class);
	}
	
	@Then("Verify response will return List of Pattern with zero records")
	public void verify_PatternList_with_zero_Pattern() {
		respAllPattern = response.getBody().as(Pattern[].class);
		assertTrue("Count is not correct", respAllPattern.length == 0);
	}
	

	@Then("Total number of Pattern in List is equal to getPatternCount")
	public void total_number_of_Pattern_in_List_is_equal_to_getPatternCount() throws IOException {
		int old_count=pattern_Count;
		cmnStepDef.user_calls_API_with_http_Request("getPatternCount", "Get");
		assertEquals(old_count, get_Pattern_count());
	}

	@Then("Pattern added exist in returned PatternList")
	public void pattern_added_exist_in_returned_PatternList() {
		List<Pattern> PatternList = Arrays.asList(respAllPattern);
		assertThat(PatternList, hasItems(respPattern));
	}

	@Given("{string} User invoke getPatternBySearchCriteria with Parameter: {string}")
	public void user_invoke_getPatternBySearchCriteria_with_Parameter(String userRole, String param) throws IOException {
		if (param.equalsIgnoreCase("PatternId"))
		{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respPattern.getPatternId());		
		}			
		else if (param.equalsIgnoreCase("PatternName"))
		{				
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respPattern.getPatternName());
		}
		else if (param.equalsIgnoreCase("PatternState"))
		{				
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respPattern.getPatternState());
		}
		else if (param.equalsIgnoreCase("PatternStatus"))
		{				
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respPattern.getPatternStatus());
		}
	}

	@Given("{string} User invoke getPatternBySearchCriteria with Parameter: {string} & {string} & {string} & {string}")
	public void user_invoke_getPatternBySearchCriteria_with_all_Parameter(String userRole, String param1, String param2,String param3,String param4) throws IOException {
		reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole)).queryParams(param1,respPattern.getPatternId())
																.queryParam(param2, respPattern.getPatternName())
																.queryParam(param3, respPattern.getPatternState())
																.queryParam(param4, respPattern.getPatternStatus());
	}
		
	@Then("Response should be list of Pattern and size should be one")
	public void response_should_be_list_of_Pattern_and_size_should_be_one() {
		respAllPattern = response.getBody().as(Pattern[].class);
		assertTrue("Search by PatternId do not list one Pattern", respAllPattern.length == 1);
	}

	@Then("Response Pattern is same which was added")
	public void response_Pattern_is_same_which_was_added() {
		System.out.println("respPattern === "+respPattern.toString());
		System.out.println("respALLPattern[0] === "+respAllPattern[0].toString());
		assertEquals("Wrong Pattern filtered", respPattern, respAllPattern[0]);
	}

	@Then("Verify Pattern fields gets updated")
	public void verify_Patternfields_gets_updated() {
		respPattern = response.getBody().as(Pattern.class);
		//assertThat(reqPattern, is(respPattern));
		//respIndustry = response.getBody().as(Industry.class);
		
		JSONAssert.assertEquals(new JSONObject(reqPattern).toString(), new JSONObject(respPattern).toString(), 
				new CustomComparator(JSONCompareMode.LENIENT, 
						new Customization("patternUpdatedAt", (o1, o2) -> true),
						new Customization("patternUpdatedBy", (o1, o2) -> true)));
//						new Customization("activityUpdatedAt", (o1, o2) -> true)),
//						new Customization("activityUpdatedBy", (o1, o2) -> true)),
//						new Customization("taskUpdatedAt", (o1, o2) -> true)),
//						new Customization("taskUpdatedBy", (o1, o2) -> true)));
	}

	@Then("Response should be list all Pattern=getAllPattern")
	public void response_should_be_list_all_Pattern_getAllPattern() {
		Pattern[] actAllPattern = response.getBody().as(Pattern[].class);
		cmnStepDef.user_calls_API_with_http_Request("getAllPatterns", "Get");
		Pattern[] expAllPattern = response.getBody().as(Pattern[].class);
		assertArrayEquals("All Pattern not searched in case of no Search Criteria", expAllPattern, actAllPattern);
	}
	
	@Then("Verify Total Pattern_Count increased by 1")
	public void verify_Total_Pattern_Count_increased_by() {
		int old_count=pattern_Count;
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
		assertThat(PatternList, hasItems(respPattern));
	}
	
	
	@Then("PatternId in response body is equal to output of {string}")
	public void Patternid_in_response_body_is_equal_to_output_of(String string) {
		assertEquals(pattern_Count+1, respPattern.getPatternId());
	}

	@Then("PatternCode in response body is equal to output of {string}")
	public void Patterncode_in_response_body_is_equal_to_output_of(String string) {
		assertEquals("PAT_"+respPattern.getPatternId(), respPattern.getPatternCode());
	}
	
	@Then("Each Pattern of returned PatternList should have same pattern {string}")
	public void each_Pattern_of_returned_PatternList_should_have_same_pattern(String searchItem) {
		assertTrue("All searched List do not satisfy search criteria",verify_all_records_with_search_criteria(searchItem));		
	}	
	
	boolean verify_all_records_with_search_criteria(String searchItem) {
		if(searchItem.equalsIgnoreCase("patternName"))
		{
			for(Pattern p:respAllPattern) 
			if(!(p.getPatternName().matches(respPattern.getPatternName())))
				return false;
			return true;
		}
		else if(searchItem.equalsIgnoreCase("patternStatus"))
		{
			for(Pattern p:respAllPattern) 
			if(!(p.getPatternStatus().matches(respPattern.getPatternStatus())))
				return false;
			return true;
		}
		else if(searchItem.equalsIgnoreCase("patternState"))
		{
			for(Pattern p:respAllPattern) 
			if(!(p.getPatternState().matches(respPattern.getPatternState())))
				return false;
			return true;
		}
		else 
			return false;
		
	}
	
	@Given("{string} User {string} Pattern Payload  with no Param")
	public void user_Pattern_Payload_with_no_Param(String userRole, String payloadReq) throws IOException {
		reqPattern = data.updatePattern(respPattern);
		reqSpec=null;
		reqSpec = given().spec(requestSpecification(userRole)).body(reqPattern);
		
	}

	@Given("{string} User {string} Pattern Payload  with no Pattern Body and Param = {string}")
	public void user_Pattern_Payload_with_no_Pattern_Body(String userRole, String payloadReq, String param) throws IOException {
		reqSpec=null;
		reqSpec = given().spec(requestSpecification(userRole));
		
		if (payloadReq.equalsIgnoreCase("Update"))
			reqSpec = reqSpec.queryParam(param, respPattern.getPatternId());
	
	}	  

}