package testBase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import dataProvider.ConfigFileReader;
import dataProvider.FileReaderManager;
import dataProvider.TestDataBuild;
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
	protected TestDataBuild data=new TestDataBuild();
	private ConfigFileReader configReader=FileReaderManager.getInstance().getConfigReader();
	private static PrintStream log;
	

	public Utils() throws FileNotFoundException {
		super();
		log = new PrintStream(new FileOutputStream("logging.txt"));
	}

	public RequestSpecification requestSpecification(String userRole) throws IOException {

		if (reqSpec == null) {
			reqSpec = new RequestSpecBuilder().setBaseUri(configReader.getPropValue("baseURL"))
					.addHeader("user", configReader.getPropValue(userRole.toLowerCase()))
					.addFilter(RequestLoggingFilter.logRequestTo(log))
					.addFilter(ResponseLoggingFilter.logResponseTo(log)).setContentType(ContentType.JSON).build();
			return reqSpec;
		}
		return reqSpec;
	}

	public String getKeyValueFromJsonResponse(Response response, String key) {
		String responseStr = response.asString();
		JsonPath js = new JsonPath(responseStr);
		return js.get(key).toString();

	}
	
	public JSONObject updateJson(JSONObject jsonObject, String service) {
		jsonObject.put(service+"CreatedBy","");
		jsonObject.put(service+"CreatedAt","");
		jsonObject.put(service+"UpdatedBy","");
		jsonObject.put(service+"UpdatedAt","");
		jsonObject.put(service+"Id","");
		jsonObject.put(service+"Code","");
		return jsonObject;
	}
	
	
}
