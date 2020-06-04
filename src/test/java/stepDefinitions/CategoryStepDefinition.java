package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entity.Category;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;



public class CategoryStepDefinition extends Utils {
	
	static Category respCategory,reqCategory;
	Category[] respAllCategory;
	static int category_count;
	CommonStepDefinition cmnSteDef;
	static String  parameter="";
	
	public CategoryStepDefinition() throws IOException {
		cmnSteDef = new CommonStepDefinition();
	}
	
	@Given("{string} {string} Category Payload")
	public void category_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqCategory = data.addCategory();
		else if (payloadReq.equalsIgnoreCase("Update"))
		{	System.out.println("inside Update"+respCategory.toString());
			reqCategory = data.updateCategory(respCategory);}
			//System.out.println("inside Update"+respCategory.toString());
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
	public void category_Count_increased(int i) {
		int old_count=category_count;
		System.out.println("old count: "+category_count);
		cmnSteDef.user_calls_API_with_http_Request("getCategoryCount","Get");
		assertEquals(old_count+1, get_category_count());
	}	
	
/*	@Then("verify response will return Category instance")
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
		cmnSteDef.user_calls_API_with_http_Request("getCategoryCount", "Get");
		category_count = get_category_count();
		System.out.println("Total count: "+category_count);
		assertTrue("Total Category retrieved is not correct", respAllCategory.length == category_count);
		
		System.out.println("Total count: "+category_count);
		
	}
	
	@Then("Verify response should be list all Categories=getAllCategories")
	public void verify_Category_with_NoSearchCriteria() {
		cmnSteDef.user_calls_API_with_http_Request("getCategoryBySearchCriteria", "Get");
		Category[] actCategoryList = response.getBody().as(Category[].class);
		System.out.println("Actual category count:"+actCategoryList.length);
		
		cmnSteDef.user_calls_API_with_http_Request("getAllCategories", "Get");
		Category[] expCategoryList = response.getBody().as(Category[].class);
		System.out.println("Expected category count:"+expCategoryList.length);
		assertArrayEquals("All Categories not searched in case of no Search Criteria", expCategoryList, actCategoryList);
	}
	
	@Then("Verify response will return List of Categories")
	public void verify_response_will_return_List_of_Categories() {
		respAllCategory = response.getBody().as(Category[].class);		
	}
	
	@Given("{string} User invoke CategoryAPI {string} with Parameter: {string}")
	public void user_invoke_category_with_Parameter(String userRole,String apiNm,String param) throws IOException {
	if (param.equalsIgnoreCase("categoryId")) {
			
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respCategory.getCategoryId());
	}
	else if (param.equalsIgnoreCase("categoryName")){
		reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respCategory.getCategoryName());
	}

	}
	
	@Then("Response should be list of Categories and satisfy the search: {string}")
	public void response_should_be_list_of_Category_and_satisfy_the_search(String srchCriteria) {
		
		respAllCategory=response.getBody().as(Category[].class);
		if (srchCriteria.equalsIgnoreCase("categoryName")) {
		for(Category cat:respAllCategory)
		
			assertTrue("Wrong list of category searched back",respCategory.getCategoryName().equalsIgnoreCase(cat.getCategoryName()));
		}
		else if (srchCriteria.equalsIgnoreCase("categoryStatus")) 
		{
			   for(Category cat:respAllCategory)
			   assertTrue("Wrong list of category searched back",respCategory.getCategoryStatus().equalsIgnoreCase(cat.getCategoryStatus()));
		}
		
		  
	}
	@Then("Verify Response should not contain Value passed in Invalid Parameter")
	public void verify_Response_should_not_contain_Value_passed_in_Invalid_Parameter() {
		respAllCategory=response.getBody().as(Category[].class);
		String srchCriteria="-9";
		for(Category cat:respAllCategory)
		
			assertFalse("Response not satisfying the getCategoryNotinList Criteria",cat.getCategoryParentId().equalsIgnoreCase(srchCriteria));
		
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
	   // assertEquals(updatedCategory.getCategoryUpdatedBy(), respCategory.getCategoryUpdatedBy());
	    //assertEquals(updatedCategory.getCategoryUpdatedAt(), respCategory.getCategoryUpdatedAt());
	    assertEquals(updatedCategory.getCategoryStatus(), respCategory.getCategoryStatus());
	 	   
	  }	
	
	@Given("{string} User invoke CategoryAPI getCategoryNotinList with Parameter: {string}")
	public void user_invoke_CategoryAPI_getCategoryNotinList_with_Parameter(String userRole, String params) throws IOException {
	/*	String dataParam=new String("{"+params+"}");
		//cmnSteDef.user_calls_API_with_http_Request("getAllCategories", "Get");
		//String dataParam=params;
					
		String [] arrParam=dataParam.split(",");
		System.out.println(arrParam);
		for(int i=0; i<arrParam.length; i++) {
			
			System.out.println(arrParam[i]);
			//user_invoke_category_with_Parameter(userRole,"getCategoryNotinList",arrParam[i]);
			//reqSpec.queryParam("respCategory.setcategoryParentId()",dataParam);
			reqSpec.queryParam("categoryParentId",arrParam);
			
						
		//}*/
			
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(params,respCategory.getCategoryParentId());;
	}
	
	@Then("Verify Category added exist in returned CategoryList")
	public void Category_added_exist_in_returned_CategoryList() {
		List<Category> CategoryList = Arrays.asList(respAllCategory);
		assertThat(CategoryList,hasItems(respCategory));
		
		
	}
	
	@Then("Response should be list of Category and size should be one")
	public void response_should_be_list_of_Catgoey_and_size_should_be_one() {
		respAllCategory = response.getBody().as(Category[].class);
		assertTrue("Search by CategoryId do not list one category", respAllCategory.length == 1);
	}
	
	@Then("Verify response will return List of Category with zero records")
	public void verify_CategoryList_with_zero_Category() {
		respAllCategory = response.getBody().as(Category[].class);
		assertTrue("Count is not correct", respAllCategory.length == 0);
	}
	
	@Given("{string} User invoke {string} with invalid Category Parameter: {string} = {string}")
	public void user_invoke_api_with_invalid_Category_Parameter(String userRole,String apinum,String param, String var) throws IOException {
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,var);	
	}
	
}