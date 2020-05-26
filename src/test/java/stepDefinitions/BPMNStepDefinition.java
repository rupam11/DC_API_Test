package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.springframework.core.io.InputStreamResource;

import entity.DiagramDetails;
import entity.ResponseStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import testBase.Utils;

public class BPMNStepDefinition extends Utils {

	static DiagramDetails reqBpmn;
	ResponseStatus respRespStatus;
	InputStreamResource getBpmnDiagramResponse;

	@Given("{string} Add DiagramDetails Payload")
	public void add_DiagramDetails_Payload(String userRole) throws IOException {
		reqBpmn = data.addDiagramDetails();
		reqSpec = given().spec(requestSpecification(userRole)).body(reqBpmn);
	}

	@Then("verify that ResponseStatus instance is returned as response")
	public void verify_that_ResponseStatus_instance_is_returned_as_response() {
		respRespStatus = response.getBody().as(ResponseStatus.class);
		assertThat(respRespStatus, instanceOf(ResponseStatus.class));
	}
	
		
	@Given("{string} User invoke getBpmnDiagram with Parameters: {string}")
	public void user_invoke_getBpmnDiagram_with_Parameters_name(String userRole, String param) {
		reqSpec.queryParam(param, reqBpmn.getName());
	}
	
	@When("user calls getBpmnDiagram API with Get http Request")
	public void user_calls_API_with_http_Request() {
		System.out.println("API Called ::: getBpmnDiagram with Method === Get");
		respSpec = new ResponseSpecBuilder().expectContentType("application.octent").build();	}
	
	@Then("verify response will return InputStreamResource instance")
	public void verify_response_will_return_InputStreamResource_instance() {
		getBpmnDiagramResponse = response.getBody().as(InputStreamResource.class);
		System.out.println("getBpmnDiagramResponse=== "+getBpmnDiagramResponse.toString());
		//assertThat(getBPMNResponse, instanceOf(InputStreamResource.class));
	}

}
