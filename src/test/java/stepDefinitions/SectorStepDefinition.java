package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import entity.Sector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class SectorStepDefinition extends Utils {

	static Sector respSector;
	Sector reqSector;
	Sector[] respAllSectors;
	int sectCount, sectId;
	CommonStepDefinition cmnStepDef;

	public SectorStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}

	@Given("{string} Sector Payload")
	public void sector_Payload(String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqSector = data.addSector();
		else if (payloadReq.equalsIgnoreCase("Update"))
			reqSector = data.updateSector();
		else
			System.out.println("Issue in Payload creation request");
		reqSpec = given().spec(requestSpecification(
				"ew0KICAidXNlckFjY291bnRTdGF0dXMiOiBudWxsLA0KICAidXNlckNyZWF0ZWRBdCI6ICIyMDIwLTA0LTA5IDAwOjMzOjQ4IiwNCiAgInVzZXJDcmVhdGVkQnkiOiAiZGNoZWxwIiwNCiAgInVzZXJFbWFpbCI6ICJza3ZhcmdoZUBpbi5pYm0uY29tIiwNCiAgInVzZXJJZCI6IDMsDQogICJ1c2VyTmFtZSI6ICJza3ZhcmdoZSIsDQogICJ1c2VyUm9sZSI6ICJFdmFsIEFkbWluIiwNCiAgInVzZXJTZXNzaW9uVG9rZW4iOiAiSW5hY3RpdmUiLA0KICAidXNlclN0YXR1cyI6ICJBY3RpdmUiLA0KICAidXNlclR5cGUiOiAiSUJNIiwNCiAgInVzZXJVcGRhdGVkQXQiOiAiMjAyMC0wNC0xMyAwNjoxODowOCIsDQogICJ1c2VyVXBkYXRlZEJ5IjogInNrdmFyZ2hlIg0KfQ0K"))
				.body(reqSector);

	}

	@Then("verify response will return Sector instance")
	public void verify_response_will_return_Sector_instance() {
		respSector = response.getBody().as(Sector.class);
		cmnStepDef.user_calls_API_with_http_Request("getSectorCount", "Get");
		int expSecId = cmnStepDef.getcount_from_Response_and_verify_it_is_0();
		int actSecId = respSector.getSectorId();
		assertEquals("Sector do not get added properly", expSecId, actSecId);
	}

	@Then("verify response will return List of Sectors")
	public void verify_response_will_return_List_of_Sectors() {
		// System.out.println("Response body after getAllSectors ==" +
		// response.getBody().asString());
		respAllSectors = response.getBody().as(Sector[].class);
	}

	@Then("total number of Sector in List is equal to getSectorCount")
	public void total_number_of_Sector_in_List_is_equal_to_getSectorCount() throws IOException {
		cmnStepDef.user_calls_API_with_http_Request("getSectorCount", "Get");
		sectCount = cmnStepDef.getcount_from_Response_and_verify_it_is_0();
		assertTrue("Total Sectors retrieved is not correct", respAllSectors.length == sectCount);
	}

	@Then("Sector added exist in returned SectorList")
	public void Sector_added_exist_in_returned_SectorList() {
		List<Sector> sectorList = Arrays.asList(respAllSectors);
		assertThat(sectorList, hasItems(respSector));
	}

	@Given("User invoke {string} with Parameter: {string}")
	public void user_invoke_getSectorBySearchCriteria_with_Parameter(String apiNm, String param) {
		if (param.equalsIgnoreCase("sectorId"))
			reqSpec.queryParam(param, respSector.getSectorId());
		else if (param.equalsIgnoreCase("sectorName"))
			reqSpec.queryParam(param, respSector.getSectorName());
	}

	@Then("response should be list of Sectors and size should be one")
	public void response_should_be_list_of_Sectors_and_size_should_be_one() {
		respAllSectors = response.getBody().as(Sector[].class);
		assertTrue("Search by sectorId do not list one Sector", respAllSectors.length == 1);
	}

	@Then("response Sector is same which was added")
	public void response_Sector_is_same_which_was_added() {
		assertEquals("Wrong Sector filtered", respSector, respAllSectors[0]);
	}

	@Then("verify {string},{string},{string},{string} gets updated")
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

	@Then("verify {string} of particular {string} updated as Passive")
	public void verify_of_particular_updated_as_Passive(String string, String string2) {
		respSector = response.getBody().as(Sector.class);
		assertEquals("Sector not Deactivated!!!", "Passive", respSector.getSectorStatus());
	}

	@Then("response should be list all Sectors=getAllSectors")
	public void response_should_be_list_all_Sectors_getAllSectors() {
		Sector[] actAllSectors = response.getBody().as(Sector[].class);
		cmnStepDef.user_calls_API_with_http_Request("getAllSectors", "Get");
		Sector[] expAllSectors = response.getBody().as(Sector[].class);
		assertArrayEquals("All Sectors not searched in case of no Search Criteria", expAllSectors, actAllSectors);
	}

}