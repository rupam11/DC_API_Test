package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.skyscreamer.jsonassert.Customization;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.comparator.CustomComparator;

import entity.Field;
import entity.Task;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class FieldStepDefinition extends Utils{
	
	CommonStepDefinition cmnStepDef;
	static Field reqField,respField;
	static int field_count;
	Field[] respAllFields;	
	
	public FieldStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}
	
	@Given("{string}  User invoke {string} with Parameter: {string}")
	public void user_invoke_with_Parameter(String userRole, String apiNm, String param) {
		if (param.equalsIgnoreCase("fieldCategory"))
			reqSpec.queryParam(param, respField.getFieldCategory());
		if (param.equalsIgnoreCase("fieldId"))
			reqSpec.queryParam(param, respField.getFieldId());
		else if (param.equalsIgnoreCase("fieldIndustry"))
			reqSpec.queryParam(param, respField.getFieldIndustry());
		else if (param.equalsIgnoreCase("fieldName"))
			reqSpec.queryParam(param, respField.getFieldName());
		else if (param.equalsIgnoreCase("fieldSector"))
			reqSpec.queryParam(param, respField.getFieldSector());	  
		else if (param.equalsIgnoreCase("fieldTemplateName"))
			reqSpec.queryParam(param, respField.getFieldTemplateName());
		else if (param.equalsIgnoreCase("fieldVersion"))
			reqSpec.queryParam(param, respField.getFieldVersion());		
	}
	
	@Given("{string} User {string} Field Payload")
	public void user_Field_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqField = data.addField();
		else if (payloadReq.equalsIgnoreCase("Update"))
			reqField = data.updateField(respField);
		else
			System.out.println("Issue in Payload creation request");
		
		reqSpec = given().spec(requestSpecification(userRole)).body(reqField);
	}

	@Then("Verify field_Count result is greater than 0")
	public int get_field_count() {
		field_count = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", field_count > 0);
		return field_count;
	}
	
	@Then("Verify Total field_Count increased by {int}")
	public void task_Count_incraesed(int i) {
		int old_count=field_count;
		
		cmnStepDef.user_calls_API_with_http_Request("getFieldCount","Get");
		assertEquals(old_count+1, get_field_count());
	}
	
	@Then("Verify responseBody is instance of Field")
	public void verify_responseBody_is_instance_of_Field() {
		respField=response.getBody().as(Field.class);
		System.out.println("field created === "+respField.toString());
	}

	/*@Then("Compare requestBody and ResponseBody")
	public void compare_reqBody_respBody() {
		JSONAssert.assertEquals(reqField, respField, 
				new CustomComparator(JSONCompareMode.LENIENT, 
						new Customization("timestamp", (o1, o2) -> true)));
		
	}*/
	
	@Then("Verify response will return List of Fields")
	public void verify_response_will_return_List_of_Fields() {
		respAllFields = response.getBody().as(Field[].class);		
	}

	@Then("Verify that total number of Fields in List is equal to getFieldCount")
	public void total_number_of_Fields_in_List_is_equal_to_getFieldCount() {
		cmnStepDef.user_calls_API_with_http_Request("getFieldCount", "Get");
		field_count = get_field_count();
		assertTrue("Total Fields retrieved is not correct", respAllFields.length == field_count);
	}
	
	@Then("Field added exist in returned FieldList")
	public void field_added_exist_in_returned_FieldList() {
		List<Field> getAllFieldList = Arrays.asList(respAllFields);
		assertThat(getAllFieldList, hasItem(respField));
	}
	
	@Then("Response should be list of Fields and satisfy the search: {string}")
	public void response_should_be_list_of_Fields_and_satisfy_the_search(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
		
	
	
}
