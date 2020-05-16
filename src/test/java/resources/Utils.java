package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils {

	public static RequestSpecification reqSpec;
	public static ResponseSpecification respSpec;
	public static Response response;
	public TestDataBuild data=new TestDataBuild();
	//public Properties prop;
	
//	Utils() throws IOException{
//		
//		
//		
//		
//	}
		
	public RequestSpecification requestSpecification() throws IOException {
		
		if(reqSpec==null)
		{
			PrintStream log=new PrintStream(new FileOutputStream("logging.txt"));
		
			reqSpec=new RequestSpecBuilder().setBaseUri(getPropValue("baseURL")).addHeader("user", "ew0KICAidXNlckFjY291bnRTdGF0dXMiOiBudWxsLA0KICAidXNlckNyZWF0ZWRBdCI6ICIyMDIwLTA0LTA5IDAwOjMzOjQ4IiwNCiAgInVzZXJDcmVhdGVkQnkiOiAiZGNoZWxwIiwNCiAgInVzZXJFbWFpbCI6ICJza3ZhcmdoZUBpbi5pYm0uY29tIiwNCiAgInVzZXJJZCI6IDMsDQogICJ1c2VyTmFtZSI6ICJza3ZhcmdoZSIsDQogICJ1c2VyUm9sZSI6ICJFdmFsIEFkbWluIiwNCiAgInVzZXJTZXNzaW9uVG9rZW4iOiAiSW5hY3RpdmUiLA0KICAidXNlclN0YXR1cyI6ICJBY3RpdmUiLA0KICAidXNlclR5cGUiOiAiSUJNIiwNCiAgInVzZXJVcGRhdGVkQXQiOiAiMjAyMC0wNC0xMyAwNjoxODowOCIsDQogICJ1c2VyVXBkYXRlZEJ5IjogInNrdmFyZ2hlIg0KfQ0K")
					.addFilter(RequestLoggingFilter.logRequestTo(log))
					.addFilter(ResponseLoggingFilter.logResponseTo(log))
					.setContentType(ContentType.JSON).build();
			return reqSpec;
		}
		
		return reqSpec;
	}
	
	public String getPropValue(String key) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\global.properties");
		
		prop.load(ip);return prop.getProperty(key);
		
	}
	
	public String getKeyValueFromJsonResponse(Response response,String key) {
		String responseStr=response.asString();
		JsonPath js=new JsonPath(responseStr);
		return js.get(key).toString();
		
	}
	
	
//	public String getTestDataResourcePath() throws IOException{
//	 String testDataResourcePath = Utils.getPropValue("testDataResourcePath");
//	 if(testDataResourcePath!= null) return testDataResourcePath;
//	 else throw new RuntimeException("Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath"); 
//	}
		
}
