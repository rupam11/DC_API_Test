package oldStepDefinitions;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utils;

public abstract class AbstractStepDefinition extends Utils{
	
	static ResponseSpecification respSpec;
	static Response response;
	TestDataBuild data=new TestDataBuild();
}
