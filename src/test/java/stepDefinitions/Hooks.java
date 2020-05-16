package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import io.restassured.RestAssured;

public class Hooks {

	
	@Before("@DC-Test-Suite")
    public void beforeScenario(){
      // System.out.println("This will run before the Scenario");
       RestAssured.useRelaxedHTTPSValidation();
    } 
 
	@After
    public void afterScenario(){
        //System.out.println("This will run after the Scenario");
    }

}
