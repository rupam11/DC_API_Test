package stepDefinitions;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import entity.Mail;
import entity.ResponseStatus;
import entity.Task;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class MailStepDefinition extends Utils {

	ResponseStatus respResponseStatus;
	Mail reqMail;
	
	@Given("{string} Add Mail Payload")
	public void add_Mail_Payload(String userRole) throws IOException {
		reqMail = data.addMail();
		reqSpec = given().spec(requestSpecification(userRole)).body(reqMail);

	}

	@Then("Verify responseBody is instance of ResponseStatus")
	public void verify_responseBody_is_instance_of_ResponseStatus() {
		respResponseStatus=response.getBody().as(ResponseStatus.class);
	}
	
}

