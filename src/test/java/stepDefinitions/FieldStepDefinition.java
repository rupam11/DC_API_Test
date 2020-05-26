package stepDefinitions;

import io.cucumber.java.en.Given;
import testBase.Utils;

public class FieldStepDefinition extends Utils{
	
	@Given("{string}  User invoke {string} with Parameter: {string}")
	public void user_invoke_with_Parameter(String string, String string2, String string3) {
	  System.out.println("field Given");
	}

}
