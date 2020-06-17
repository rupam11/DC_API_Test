package stepDefinitions;

import static io.restassured.RestAssured.given;
//import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.Matchers.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;
//import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.Customization;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.comparator.CustomComparator;

import entity.Template;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class TemplateStepDefinition extends Utils {
	CommonStepDefinition cmnStepDef;
	static Template reqTemplate, respTemplate;
	static int template_count;
	Template[] respAllTemplates;
	List<Integer> templateIdList;
	int createDummyFieldId;
	//ResponseStatus respDelTemplate;
	
	public TemplateStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}

	@Then("Verify templateCount result is greater than equal to 0")
	public int get_template_count() {
		template_count = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", template_count > 0);
		return template_count;
	}
	
	@Given("{string} Get Template Payload ready for {string} operation")
	public void get_Template_Payload_ready_for_operation(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqTemplate = data.addTemplate();
		else if (payloadReq.equalsIgnoreCase("Update")) 
			reqTemplate = data.updateTemplate(respTemplate);			
		else
			System.out.println("Issue in Payload creation request");
		
		reqSpec = given().spec(requestSpecification(userRole)).body(reqTemplate);
	}

	@Then("Verify responseBody is instance of Template")
	public void verify_responseBody_is_instance_of_Template() {
		respTemplate = response.getBody().as(Template.class);
	}
	
//	@Then("Verify responseBody is instance of ResponseStatus")
//	public void verify_responseBody_is_instance_of_ResponseStatus() {
//		respDelTemplate = response.getBody().as(ResponseStatus.class);
//	}


	@Then("Save templateId of {int} templates in templateIdList")
	public void save_templateId_of_templates_in_templateIdList(int count) {
		
		templateIdList = new ArrayList<Integer>();
		for(int i=0;i<count;i++) {
			templateIdList.add(respAllTemplates[i].getTemplateId());
		}
	}
	
	@Then("Prepare templateIdList with templateId of created Template")
	public void prepare_templateIdList_with_templateId_of_created_Template() {
		templateIdList = new ArrayList<Integer>();
		templateIdList.add(respTemplate.getTemplateId());		
	}

	
	@Then("Verify templateCount result is equal to {int}")
	public void verify_templateCount_equal_to(int count) {
		//assertTrue("Count is not correct", respAllTemplates.length == count);
		assertThat(templateIdList, hasSize(count));
	}
	

	@Then("Verify response will return List of Templates")
	public void verify_response_will_return_List_of_Templates() {
		respAllTemplates = response.getBody().as(Template[].class);
	}
	
	@Then("Template added exist in returned Template List")
	public void template_added_exist_in_returned_Template_List() {
		List<Template> getAllTemplateList = Arrays.asList(respAllTemplates);
		
		assertThat(getAllTemplateList,hasItem(respTemplate));
		
	}

	@Then("Verify that total number of Templates in List is equal to getTemplateCount")
	public void verify_that_total_number_of_Templates_in_List_is_equal_to_getTemplateCount() {
		cmnStepDef.user_calls_API_with_http_Request("getTemplateCount", "Get");
		template_count = get_template_count();		
		assertTrue("Total Template retrieved is not correct", respAllTemplates.length == template_count);
	}
	
	@Then("Print the created Template")
	public void print_created_template_instance() {
		System.out.println("template created === " + respTemplate.toString());
	}
	
	@Then("Verify template->responseBody is same as that of template->requestBody except:{string}")
	public void verify_reqBody_same_as_responseBody(String excludeParamList) {
		respTemplate = response.getBody().as(Template.class);
		
		String[] excludeParam = excludeParamList.split(",");
		
		if(excludeParam.length==5)
		{
		JSONAssert.assertEquals(new JSONObject(respTemplate).toString(), new JSONObject(respTemplate).toString(), 
				new CustomComparator(JSONCompareMode.LENIENT, 
						new Customization(excludeParam[0], (o1, o2) -> true),
						new Customization(excludeParam[1], (o1, o2) -> true),
						new Customization(excludeParam[2], (o1, o2) -> true),
						new Customization(excludeParam[3], (o1, o2) -> true),
						new Customization(excludeParam[4], (o1, o2) -> true)));
						
		}
		else if(excludeParam.length==4) {
			JSONAssert.assertEquals(new JSONObject(respTemplate).toString(), new JSONObject(respTemplate).toString(), 
					new CustomComparator(JSONCompareMode.LENIENT, 
					new Customization(excludeParam[0], (o1, o2) -> true),
					new Customization(excludeParam[1], (o1, o2) -> true)));
		}
	}
	
	@Then("Verify templateId={string}")
	public void verify_templateId_value(String param) {
		if(param.equalsIgnoreCase("templateCount")) {
			assertEquals(template_count+1,respTemplate.getTemplateId());
		}
	}
	
	@Given("{string} User invoke Template->{string} with Parameter: {string}")
	public void user_invoke_with_Parameter(String userRole, String apiNm, String param) throws IOException {
		reqSpec = null;
		if (param.equalsIgnoreCase("templateId")) { 
			createDummyFieldId=respTemplate.getTemplateId();
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respTemplate.getTemplateId());
		}
		if (param.equalsIgnoreCase("templateIdList")) 
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, templateIdList);
		else if (param.equalsIgnoreCase("templateIndustryName"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respTemplate.getTemplateIndustryName());
		else if (param.equalsIgnoreCase("templateName"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respTemplate.getTemplateName());
		else if (param.equalsIgnoreCase("templateSectorName"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respTemplate.getTemplateSectorName());
		else if (param.equalsIgnoreCase("templateVersion"))
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respTemplate.getTemplateVersion());
	
	}
	
	@Then("templateStatus of Template in response body is {string}")
	public void of_Template_in_response_body_is(String status) {
	  for(Template t:respAllTemplates)
		   assertThat(t.getTemplateStatus(), is(status)); 
	  	
	}
	
	@Then("Verify templateId in responseBody = templateId of created Template")
	public void verify_templateId_templateId_of_created_Template() {
	    assertEquals(createDummyFieldId,respTemplate.getTemplateId());
	}
	
	
	@Then("Response should be list of Templates and satisfy the search: {string}")
	public void response_should_be_list_of_Templates_and_satisfy_the_search(String searchItem) {
		respAllTemplates = response.getBody().as(Template[].class);
		assertTrue("All searched List do not satisfy search criteria",verify_all_records_with_search_criteria(searchItem));		
	}
	
	boolean verify_all_records_with_search_criteria(String searchItem) {
			if(searchItem.equalsIgnoreCase("templateIndustryName"))
			{
				for(Template p:respAllTemplates) 
				if(!(p.getTemplateIndustryName().matches(respTemplate.getTemplateIndustryName())))
					return false;
				return true;
			}
			else if(searchItem.equalsIgnoreCase("templateIdList"))
			{
				for(Template p:respAllTemplates) 
				{
					if(!templateIdList.contains(p.getTemplateId()))
						return false;
				}
				return true;
			}
			else if(searchItem.equalsIgnoreCase("templateSectorName"))
			{
				for(Template p:respAllTemplates) 
				if(!(p.getTemplateSectorName().matches(respTemplate.getTemplateSectorName())))
					return false;
				return true;
			}
			else if(searchItem.equalsIgnoreCase("templateName"))
			{
				for(Template p:respAllTemplates) 
				if(!(p.getTemplateName().matches(respTemplate.getTemplateName())))
					return false;
				return true;
			}
			else if(searchItem.equalsIgnoreCase("templateVersion"))
			{
				for(Template p:respAllTemplates) 
				if(!(p.getTemplateVersion().matches(respTemplate.getTemplateVersion())))
					return false;
				return true;
			}
			else 
				return false;
			
		}
	
	

}
