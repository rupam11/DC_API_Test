package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import resources.APIResources;
import resources.Utils;

public class CommonStepDefinition extends Utils {

	@Given("User invoke {string}")
	public void user_invoke_getActivityCount(String apiNm) throws IOException {
		reqSpec = given().spec(requestSpecification());
	}

	@When("user calls {string} API with {string} http Request")
	public void user_calls_API_with_http_Request(String apiNm, String method) {
		APIResources resourceAPI = APIResources.valueOf(apiNm);
		System.out.println("API Called ::: " + apiNm + " with Method === " + method);
		respSpec = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();

		if (method.equalsIgnoreCase("Post"))
			response = reqSpec.when().post(resourceAPI.getResource()).then().spec(respSpec).extract().response();
		else if (method.equalsIgnoreCase("Get"))
			response = reqSpec.when().get(resourceAPI.getResource()).then().spec(respSpec).extract().response();
		else if (method.equalsIgnoreCase("Delete"))
			response = reqSpec.when().delete(resourceAPI.getResource()).then().spec(respSpec).extract().response();
		else if (method.equalsIgnoreCase("Put"))
			response = reqSpec.when().put(resourceAPI.getResource()).then().spec(respSpec).extract().response();
	}

	@Then("the API call is success with StatusCode {int}")
	public void the_API_call_is_success_with_StatusCode(int expStatusCode) {
		assertEquals(expStatusCode, response.getStatusCode());
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyName, String keyValue) {
		assertEquals(getKeyValueFromJsonResponse(response, keyName), keyValue);
	}

	@Then("verify responseBody return int value")
	public int verify_responseBody_return_int_value() {
		int count = Integer.parseInt(response.getBody().asString());
		return count;

	}

	@Then("getCount from Response and verify it is >=0")
	public int getcount_from_Response_and_verify_it_is_0() {
		int count = Integer.parseInt(response.getBody().asString());
		assertTrue("Sector Count is not correct", count > 0);
		return count;
	}

}
