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
import entity.Sector;
import entity.Task;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class SectorStepDefinition extends Utils {

	static Sector reqSector,respSector;
	Sector[] respAllSectors;
	static int sectCount;
	CommonStepDefinition cmnStepDef;

	public SectorStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}


	@Given("{string} User {string} Sector Payload")
	public void user_Sector_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqSector = data.addSector();
		else if (payloadReq.equalsIgnoreCase("Update"))
			reqSector = data.updateSector(respSector);
		else
			System.out.println("Issue in Payload creation request");
		
		reqSpec = given().spec(requestSpecification(userRole)).body(reqSector);
	}
	
		
	@Then("Verify sector_Count result is greater than 0")
	public int get_sector_count() {
		sectCount = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", sectCount > 0);
		return sectCount;
	}

	@Then("Verify response will return Sector instance")
	public void verify_response_will_return_Sector_instance() {
		respSector = response.getBody().as(Sector.class);
		System.out.println("sector created === "+respSector.toString());
	}

	@Then("Verify response will return List of Sectors")
	public void Verify_response_will_return_List_of_Sectors() {
		respAllSectors = response.getBody().as(Sector[].class);
	}

	@Then("Total number of Sector in List is equal to getSectorCount")
	public void total_number_of_Sector_in_List_is_equal_to_getSectorCount() throws IOException {
		int old_count=sectCount;
		cmnStepDef.user_calls_API_with_http_Request("getSectorCount", "Get");
		assertEquals(old_count, get_sector_count());
	}

	@Then("Sector added exist in returned SectorList")
	public void Sector_added_exist_in_returned_SectorList() {
		List<Sector> sectorList = Arrays.asList(respAllSectors);
		assertThat(sectorList, hasItem(respSector));
	}

	@Given("{string} User invoke getSectorBySearchCriteria with Parameter: {string}")
	public void user_invoke_getSectorBySearchCriteria_with_Parameter(String userRole, String param) throws IOException {
		if (param.equalsIgnoreCase("sectorId"))
		{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respSector.getSectorId());		
		}			
		else if (param.equalsIgnoreCase("sectorName"))
		{				
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respSector.getSectorName());
		}
	}

	@Then("Response should be list of Sectors and size should be one")
	public void response_should_be_list_of_Sectors_and_size_should_be_one() {
		respAllSectors = response.getBody().as(Sector[].class);
		assertTrue("Search by sectorId do not list one Sector", respAllSectors.length == 1);
	}

	@Then("Response Sector is same which was added")
	public void response_Sector_is_same_which_was_added() {
		assertEquals("Wrong Sector filtered", respSector, respAllSectors[0]);
	}

	@Then("Verify {string},{string},{string},{string} gets updated for given Sector")
	public void verify_gets_updated(String sectorName, String sectorStatus, String sectorCreatedBy,
			String sectorCreatedAt) {
		respSector = response.getBody().as(Sector.class);
		assertEquals("Sector name not updated", reqSector.getSectorName(), respSector.getSectorName());
		assertEquals("Sector sectorStatus not updated", reqSector.getSectorStatus(), respSector.getSectorStatus());
		assertEquals("Sector sectorCreatedBy not updated", reqSector.getSectorCreatedBy(),
				respSector.getSectorCreatedBy());
		assertEquals("Sector sectorCreatedAt not updated", reqSector.getSectorCreatedAt(),
				respSector.getSectorCreatedAt());
	}

	@Then("Verify SectorStatus of particular Sector updated as Passive")
	public void verify_SectorStatus_updated_as_Passive() {
		respSector = response.getBody().as(Sector.class);
		assertEquals("Sector not Deactivated!!!", "Passive", respSector.getSectorStatus());
	}

	@Then("Response should be list all Sectors=getAllSectors")
	public void response_should_be_list_all_Sectors_getAllSectors() {
		Sector[] actAllSectors = response.getBody().as(Sector[].class);
		cmnStepDef.user_calls_API_with_http_Request("getAllSectors", "Get");
		Sector[] expAllSectors = response.getBody().as(Sector[].class);
		assertArrayEquals("All Sectors not searched in case of no Search Criteria", expAllSectors, actAllSectors);
	}
	@Then("Verify Total sector_Count increased by 1")
	public void verify_Total_sector_Count_increased_by() {
		int old_count=sectCount;
		cmnStepDef.user_calls_API_with_http_Request("getSectorCount", "Get");
		assertEquals(old_count+1, get_sector_count());
	}

	@Given("{string} User invoke deleteSector with Parameter: {string}")
	public void user_invoke_deleteSector_with_Parameter(String userRole, String param) {
		reqSpec.queryParam(param, respSector.getSectorId());
	}
	
	@Then("All Sectors should have Active Status")
	public void all_Sectors_should_have_Active_Status() {
	    for(Sector sec:respAllSectors)
	    	assertEquals("Sector with Passive status searched!!!", "Active", sec.getSectorStatus());
	}


	@Given("{string} User {string} Sector Payload  with no Sector Body and Param = {string}")
	public void user_sector_Payload_with_no_Sector_Body_and_Param(String userRole, String payloadReq, String param) throws IOException {
	    reqSpec=null;
				reqSpec = given().spec(requestSpecification(userRole));
			if (payloadReq.equalsIgnoreCase("Update"))
					reqSpec = reqSpec.queryParam(param, respSector.getSectorId());
	}
	
	@Given("{string} User invoke getSectorBySearchCriteria with Parameter: {string} & {string}")
	public void user_invoke_getTaskBySearchCriteria_with_Parameter(String userRole, String param1, String param2) throws IOException {
		 reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param1,respSector.getSectorId())
																		.queryParam(param2, respSector.getSectorName());
																		
	}
	
	@Then("Verify response will return List of Sectors with zero records")
	public void verify_response_will_return_List_of_Sectors_with_zero_records() {
	    respAllSectors = response.getBody().as(Sector[].class);
		assertTrue("Count is not zero in case of invalid search criteria.", respAllSectors.length == 0);
	}

	/*@Given("{string} User {string} Sector Payload  with invalid Param = {string} and value=\"{int}\"")
	public void user_Sector_Payload_with_invalid_Param_and_value(String userRole, String param, String payloadReq, int i) throws IOException {
		reqSector = data.updateSector(respSector);
		reqSpec=null;
		reqSpec = given().spec(requestSpecification(userRole)).body(reqSector).queryParam(param,i);
	}
	*/
	@Given("{string} User {string} Sector Payload  with no Param")
	public void user_Sector_Payload_with_no_Param(String userRole, String payloadReq) throws IOException {
			reqSector = data.updateSector(respSector);
			reqSpec=null;
			reqSpec = given().spec(requestSpecification(userRole)).body(reqSector);
	}
	
	

}