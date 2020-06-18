package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.Customization;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.comparator.CustomComparator;
import org.skyscreamer.jsonassert.comparator.JSONComparator;

import entity.Field;
import entity.FieldRuleId;
import entity.Rule;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import resources.APIResources;
import testBase.Utils;

public class FieldStepDefinition extends Utils {

	CommonStepDefinition cmnStepDef;
	static Field reqField, respField;
	static int field_count;
	Field[] respAllFields;
	Rule[] respAllRules;
	Rule rule;
	List<Integer> fieldList;
	FieldRuleId ruleId;
	Map<String,Object> queryParam;

	public FieldStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}
	
	@Given("{string} User invoke Field->{string} with Parameter: {string}")
	public void user_invoke_with_Parameter(String userRole, String apiNm, String param) throws IOException {
		reqSpec = null;
		
		if (param.equalsIgnoreCase("fieldId")) 
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respField.getFieldId());
		else if (param.equalsIgnoreCase("fieldCategory"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respField.getFieldCategory());
		else if (param.equalsIgnoreCase("fieldIdList"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, fieldList);
		else if (param.equalsIgnoreCase("fieldIndustry"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respField.getFieldIndustry());
		else if (param.equalsIgnoreCase("fieldName"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respField.getFieldName());
		else if (param.equalsIgnoreCase("fieldSector"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respField.getFieldSector());
		else if (param.equalsIgnoreCase("fieldTemplateName"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respField.getFieldTemplateName());
		else if (param.equalsIgnoreCase("fieldVersion"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respField.getFieldVersion());
	}
	
	@Then("Save fieldId of {int} fields in fieldIdList")
	public void save_fieldId_of_five_fields_in_fieldIdList(int count) {
		fieldList = new ArrayList<Integer>();
		for(int i=0;i<count;i++) {
			fieldList.add(respAllFields[i].getFieldId());
		}
	}
	
	@Then("Verify fieldCount result is equal to {int}")
	public void verify_fieldCount_equal_to(int count) {
		assertTrue("Count is not correct", respAllFields.length == count);
	}

	@Given("{string} Get Field Payload ready for {string} operation")
	public void user_Field_Payload(String userRole, String payloadReq) throws IOException {
		
		if (payloadReq.equalsIgnoreCase("Add"))
			reqField = data.addField("Add_Field");
		else if (payloadReq.equalsIgnoreCase("Pass_Question"))
			reqField = data.addField("Pass_Question");
		else if (payloadReq.equalsIgnoreCase("Update")) {
			
			ruleId=new FieldRuleId();
			ruleId.setRuleParentId("DUMMY FIELD RULE PARENT ID");
			
			reqField = data.updateField(respField, ruleId);
		}
		else
			System.out.println("Issue in Payload creation request");
		
		reqSpec = given().spec(requestSpecification(userRole)).body(reqField);		
	}

	@Then("Verify fieldCount result is greater than equal to 0")
	public int get_field_count() {
		field_count = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", field_count > 0);
		return field_count;
	}

	@Then("Verify Total field_Count increased by {int}")
	public void task_Count_increaaesed(int i) {
		int old_count = field_count;			
		assertEquals(old_count + 1, get_field_count());
	}

	@Then("Verify responseBody is instance of Field")
	public void verify_responseBody_is_instance_of_Field() {
		respField = response.getBody().as(Field.class);
	}
	
	@Then("Print the created Field")
	public void print_created_field_instance() {
		System.out.println("field created === " + respField.toString());
	}
	

	@Then("Verify response will return List of Fields")
	public void verify_response_will_return_List_of_Fields() {
		respAllFields = response.getBody().as(Field[].class);
	}

	@Then("Verify that total number of Fields in List is equal to getFieldCount")
	public void total_number_of_Fields_in_List_is_equal_to_getFieldCount() {
		cmnStepDef.user_calls_API_with_http_Request("getFieldCount", "Get");
		field_count = get_field_count();
		assertEquals(field_count,respAllFields.length);
		//assertTrue("Total Fields retrieved is not correct", respAllFields.length == field_count);
	}

	@Then("Field added exist in returned Field List")
	public void field_added_exist_in_returned_FieldList() {
		List<Field> getAllFieldList = Arrays.asList(respAllFields);
		assertThat(getAllFieldList,hasItem(respField));
	}	

	@Then("Verify Field fields gets updated")
	public void verify_Field_fields_gets_updated() {
		respField = response.getBody().as(Field.class);
		
		JSONAssert.assertEquals(new JSONObject(reqField).toString(), new JSONObject(respField).toString(), 
				new CustomComparator(JSONCompareMode.LENIENT, 
						new Customization("fieldUpdatedAt", (o1, o2) -> true),
						new Customization("fieldUpdatedBy", (o1, o2) -> true)));
	}
	
	@Then("Verify field->responseBody is same as that of field->requestBody except:{string}")
	public void verify_reqBody_same_as_responseBody(String excludeParamList) {
		respField = response.getBody().as(Field.class);
		
		String[] excludeParam = excludeParamList.split(",");
		
		/*int excludeAttCount=excludeParam.length;
		
		JSONComparator customComp = null;
				
		for(int i=0;i<excludeAttCount;i++)
			customComp=customComp.new CustomComparator(JSONCompareMode.LENIENT, new Customization(excludeParam[i], (o1, o2) -> true));
		
		JSONAssert.assertEquals(new JSONObject(reqField).toString(), new JSONObject(respField).toString(), customComp);*/
			
		
		if(excludeParam.length==7)
		{
		JSONAssert.assertEquals(new JSONObject(reqField).toString(), new JSONObject(respField).toString(), 
				new CustomComparator(JSONCompareMode.LENIENT, 
						new Customization(excludeParam[0], (o1, o2) -> true),
						new Customization(excludeParam[1], (o1, o2) -> true),
						new Customization(excludeParam[2], (o1, o2) -> true),
						new Customization(excludeParam[3], (o1, o2) -> true),
						new Customization(excludeParam[4], (o1, o2) -> true),
						new Customization(excludeParam[5], (o1, o2) -> true),
						new Customization(excludeParam[6], (o1, o2) -> true)));
						
		}
		else if(excludeParam.length==2) {
			JSONAssert.assertEquals(new JSONObject(reqField).toString(), new JSONObject(respField).toString(), 
					new CustomComparator(JSONCompareMode.LENIENT, 
					new Customization(excludeParam[0], (o1, o2) -> true),
					new Customization(excludeParam[1], (o1, o2) -> true)));
		}
	}
	
	@Given("User create new Rule to associate with Field")
	public void user_create_new_Rule_to_associate_with_Field() {
	   rule = data.addRule();
	}

	@Given("{string} Get query Field-> {string} ->Parameters ready for {string}")
	public void user_FieldId_RuleId(String userRole,String apiNm, String paramList) throws IOException {
		queryParam=new HashMap<String,Object>();
		int fieldId=respField.getFieldId();
		String ruleParentId=rule.getRuleParentId();
		
		
		queryParam.put("fieldId", fieldId);
		queryParam.put("ruleParentId", ruleParentId);
		
		reqSpec=null;
		reqSpec = given().spec(requestSpecification(userRole)).queryParams(queryParam);
	}
	
	@When("User calls {string} API with Put http Request")
	public void user_calls_API_with_http_Request(String apiNm) {
		APIResources resourceAPI = APIResources.valueOf(apiNm);
		System.out.println("API Called ::: updateFieldByRuleId with Method === Get");
		respSpec = new ResponseSpecBuilder().build();
		response = reqSpec.when().put(resourceAPI.getResource()).then().spec(respSpec).extract().response();
		
	}
	
	@Then("Verify Response is string instance and value=\"ok\"")
	public void verify_Response_is_string_instance_and_value_ok() {
		assertTrue("Response for this api is not as expected.", response.getBody().asString().equalsIgnoreCase("ok"));
	}
	
	@Then("Verify fieldId={string}")
	public void verify_fieldId_value(String param) {
		if(param.equalsIgnoreCase("fieldDisplaySequence"))
			assertTrue("fieldId didnt matched with "+param, respField.getFieldId()==respField.getFieldDisplaySequence());
		else if(param.equalsIgnoreCase("fieldParentId"))
			assertTrue("fieldId didnt matched with "+param, respField.getFieldId()==Integer.parseInt(respField.getFieldParentId()));
		else if(param.equalsIgnoreCase("fieldCount")) {
			assertTrue("fieldId didnt matched with "+param, respField.getFieldId()==field_count+1);
		}		
	}
		
	@Then("Response should be list of Fields and satisfy the search: {string}")
	public void response_should_be_list_of_Fields_and_satisfy_the_search(String searchItem) {
		respAllFields = response.getBody().as(Field[].class);
		assertTrue("All searched List do not satisfy search criteria",verify_all_records_with_search_criteria(searchItem));		
	}
	
	boolean verify_all_records_with_search_criteria(String searchItem) {
			if(searchItem.equalsIgnoreCase("fieldCategory"))
			{
				for(Field p:respAllFields) 
				if(!(p.getFieldCategory().matches(respField.getFieldCategory())))
					return false;
				return true;
			}
			else if(searchItem.equalsIgnoreCase("fieldIdList"))
			{
				for(Field p:respAllFields) 
				{
					if(!fieldList.contains(p.getFieldId()))
						return false;
				}
				return true;
			}
			else if(searchItem.equalsIgnoreCase("fieldIndustry"))
			{
				for(Field p:respAllFields) 
				if(!(p.getFieldIndustry().matches(respField.getFieldIndustry())))
					return false;
				return true;
			}
			else if(searchItem.equalsIgnoreCase("fieldName"))
			{
				for(Field p:respAllFields) 
				if(!(p.getFieldName().matches(respField.getFieldName())))
					return false;
				return true;
			}
			else if(searchItem.equalsIgnoreCase("fieldSector"))
			{
				for(Field p:respAllFields) 
				if(!(p.getFieldSector().matches(respField.getFieldSector())))
					return false;
				return true;
			}
			else if(searchItem.equalsIgnoreCase("fieldTemplateName"))
			{
				for(Field p:respAllFields) 
				if(!(p.getFieldTemplateName().matches(respField.getFieldTemplateName())))
					return false;
				return true;
			}
			else if(searchItem.equalsIgnoreCase("fieldVersion"))
			{
				for(Field p:respAllFields) 
				if(!(p.getFieldVersion().matches(respField.getFieldVersion())))
					return false;
				return true;
			}
			else 
				return false;
			
		}

}
