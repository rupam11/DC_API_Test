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
import pojo.Activity;
import pojo.DiagramDetails;
import resources.APIResources;
import resources.Utils;

public class BPMNStepDefinition extends Utils {

	static DiagramDetails reqBpmn;
	
	@Given("Add DiagramDetails Payload")
	public void add_DiagramDetails_Payload() throws IOException {
		reqBpmn = data.addDiagramDetails();
		reqSpec = given().spec(requestSpecification()).body(reqBpmn);	
		System.out.println("inside Given section....");
	}

	@Then("verify that ResponseStatus instance is returned as response")
	public void verify_that_ResponseStatus_instance_is_returned_as_response() {
	    
	    
	}

	@Then("{string} in response body is {int}")
	public void in_response_body_is(String string, Integer int1) {
	    
	    
	}

	@Given("User invoke getBpmnDiagram with Parameters: name")
	public void user_invoke_getBpmnDiagram_with_Parameters_name() {
	    
	    
	}

	@Then("verify response will return InputStreamResource instance")
	public void verify_response_will_return_InputStreamResource_instance() {
	    
	    
	}



}
