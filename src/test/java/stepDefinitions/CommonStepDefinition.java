package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import java.io.IOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import resources.APIResources;
import testBase.Utils;

public class CommonStepDefinition extends Utils {
	
	
	@Given("{string} User invoke {string}")
	public void User_invoke(String userRole, String apiNm) throws IOException {
		reqSpec = given().spec(requestSpecification(userRole));
	}

	@When("User calls {string} API with {string} http Request")
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

	@Then("The API call is success with StatusCode {int}")
	public void the_API_call_is_success_with_StatusCode(int expStatusCode) {
		assertEquals(expStatusCode, response.getStatusCode());
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyName, String keyValue) {
		assertEquals(getKeyValueFromJsonResponse(response, keyName), keyValue);
	}
	
	@Then("{string} in response body is {int}")
	public void in_response_body_is(String keyName, int keyValue) {
		assertEquals(Integer.parseInt(getKeyValueFromJsonResponse(response, keyName)), keyValue);
	}
	
	
}
