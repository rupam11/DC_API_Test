package stepDefinitions;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import entity.Mail;
import io.cucumber.java.en.Given;
import testBase.Utils;

public class MailStepDefinition extends Utils {

	public MailStepDefinition() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	Mail reqMail;

	@Given("{string} Add Mail Payload")
	public void add_Mail_Payload(String userRole) throws IOException {
		reqMail = data.addMail();
		reqSpec = given().spec(requestSpecification(userRole)).body(reqMail);

	}

}
