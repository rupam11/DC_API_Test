package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import entity.Category;
import entity.Task;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;



public class CategoryStepDefinition extends Utils {
	
	static Category respCategory,reqCategory;
	Category[] respAllCategory;
	static int category_count, categoryId;
	CommonStepDefinition cmnStepDef;
	
	public CategoryStepDefinition() throws IOException {
		super();
		cmnStepDef = new CommonStepDefinition();
	}
	
	@Given("{string} {string} Category Payload")
	public void category_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqCategory = data.addCategory();
		else if (payloadReq.equalsIgnoreCase("Update"))
			//reqCategory = data.updateCategory(respCategory);
			System.out.println("Update category here");
		else
			System.out.println("Issue in Payload creation request");
		reqSpec = given().spec(requestSpecification(userRole)).body(reqCategory);
	}
	
	@Then("Verify category_Count result is greater than 0")
	public int get_category_count() {
		category_count = Integer.parseInt(response.getBody().asString());
		System.out.println("Category Count "+category_count);
		assertTrue("Count is not correct", category_count > 0);
		return category_count;
	}
	
	@Then("Verify Total category_Count increased by {int}")
	public void category_Count_incressed(int i) {
		int old_count=category_count;
		System.out.println("old count: "+category_count);
		cmnStepDef.user_calls_API_with_http_Request("getCategoryCount","Get");
		assertEquals(old_count+1, get_category_count());
	}	
	/*@Then("verify response will return Category instance")
	public void verify_response_will_return_Category_instance() {
		respCategory = response.getBody().as(Category.class);

		cmnSteDef.user_calls_API_with_http_Request("getCategoryCount", "Get");
		int expCatId = cmnSteDef.getcount_from_Response_and_verify_it_is_0();
		int actCatId = respCategory.getCategoryId();
		assertEquals("Category do not get added properly", expCatId, actCatId);
	}*/

	@Then("Verify responseBody is instance of Category")
	public void Verify_responseBody_is_instance_of__Category() {
		
		respCategory = response.getBody().as(Category.class);
			System.out.println("Category created === "+respCategory.toString());
				
	}

	@Then("Total number of Category in List is equal to getCategoryCount")
	public void total_number_of_Category_in_List_is_equal_to_getCategoryCount() throws IOException {
		cmnStepDef.user_calls_API_with_http_Request("getCategoryCount", "Get");
		category_count = get_category_count();
		System.out.println("Total count: "+category_count);
		assertTrue("Total Category retrieved is not correct", respAllCategory.length == category_count);
		
		System.out.println("Total count: "+category_count);
		
	}
	
	@Then("Verify response should be list all Categories=getAllCategories")
	public void verify_Category_with_NoSearchCriteria() {
		Category[] actCategoryList = response.getBody().as(Category[].class);
		cmnStepDef.user_calls_API_with_http_Request("getAllCatgories", "Get");
		Category[] expCategoryList = response.getBody().as(Category[].class);
		assertArrayEquals("All Tasks not searched in case of no Search Criteria", expCategoryList, actCategoryList);
	}
	
	@Then("Verify response will return List of Categories")
	public void verify_response_will_return_List_of_Tasks() {
		respAllCategory = response.getBody().as(Category[].class);		
	}
	
	@Given("{string} User invoke {string} with Parameters: {string}")
	public void user_invoke_category_with_Parameter(String userRole,String apiNm,String param) {
		if (param.equalsIgnoreCase("categoryName"))
			reqSpec.queryParam(param, respCategory.getCategoryName());
		else if (param.equalsIgnoreCase("categoryId"))
			reqSpec.queryParam(param, respCategory.getCategoryId());
		
	}
	@Then("Response should be list of Categories and satisfy the search: {string}")
	public void response_should_be_list_of_Category_and_satisfy_the_search(String srchCriteria) {
		respAllCategory = response.getBody().as(Category[].class);
		for(Category cat:respAllCategory)
			assertTrue("Wrong list of Tasks searched back",respCategory.getCategoryName().equalsIgnoreCase(cat.getCategoryName()));
	}
	
	@Then("Verify Category fields gets updated")
	public void verify_Category_fields_gets_updated() {
	    Category updatedCategory=response.getBody().as(Category.class);
	    assertEquals(updatedCategory.getCategoryId(), respCategory.getCategoryId());
	    assertEquals(updatedCategory.getCategoryParentId(), respCategory.getCategoryParentId());
	    assertEquals(updatedCategory.getCategoryName(), respCategory.getCategoryName());
	    assertEquals(updatedCategory.getCategorySequence(), respCategory.getCategorySequence());
	    assertEquals(updatedCategory.getCategoryCreatedBy(), respCategory.getCategoryCreatedBy());
	    assertEquals(updatedCategory.getCategoryCreatedAt(), respCategory.getCategoryCreatedAt());
	    assertEquals(updatedCategory.getCategoryUpdatedBy(), respCategory.getCategoryUpdatedBy());
	    assertEquals(updatedCategory.getCategoryUpdatedAt(), respCategory.getCategoryUpdatedAt());
	    assertEquals(updatedCategory.getCategoryStatus(), respCategory.getCategoryStatus());
	 	   
	  }	
	


}
