package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import entity.Client;
import entity.ClientUser;
import entity.Project;
import entity.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class ClientStepDefinition extends Utils{
	
	@JsonProperty
	static Client respClient,reqClient;
	static User respUser,reqUser;
	static Project respProject,reqProject;
	static String projectIds;
	Project[] respAllProject;
	User[] respAllUser;
	Client[] respAllClient;
	ClientUser[] respAllUsers;
	
	static int client_count;
	CommonStepDefinition cmnSteDef;
	static String  parameter="";
	
	public ClientStepDefinition() throws IOException {
		cmnSteDef = new CommonStepDefinition();
	}
	
	@Then("Verify client_Count result is greater than 0")
	public int get_client_count() {
		client_count = Integer.parseInt(response.getBody().asString());
		System.out.println("Client Count "+client_count);
		assertTrue("Count is not correct", client_count > 0);
		return client_count;
	}
	@Then("Verify response will return List of Clients")
	public void verify_response_will_return_List_of_Clients() {
		respAllClient = response.getBody().as(Client[].class);		
	}
	
	@Then("Verify response will return List of ProjectIds")
	public void verify_response_will_return_List_of_ProjectIds() {
		System.out.println("List of Projects :"+response.getBody().asString());	
	//	respAllClient = response.getBody().
	}
	
	@Then("Verify response will return List of Users")
	public void verify_response_will_return_List_of_Users() {
	
		System.out.println("List of Users :"+response.getBody().as(ClientUser[].class));
	}
	

	@Given("{string} User invoke ClientAPI {string} with Parameter: {string}")
	public void user_invoke_client_with_Parameter(String userRole,String apiNm,String param) throws IOException {
		if (param.equalsIgnoreCase("clientId")) {
				
			reqSpec = null;
			System.out.println("Client Id :"+respClient.getClientId());
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respClient.getClientId());
				
		}
		else if (param.equalsIgnoreCase("clientName")){
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respClient.getClientName());
		}
		else if(param.equalsIgnoreCase("clientStatus"))
		{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respClient.getClientStatus());
		}	
		
		else if(param.equalsIgnoreCase("clientSector"))
		{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respClient.getClientSector());
		}	
		else if(param.equalsIgnoreCase("clientIndustry"))
		{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respClient.getClientIndustry());
		}	
		else if(param.equalsIgnoreCase("clientHappinessIndex"))
		{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respClient.getClientHappinessIndex());
		}
		
		else if(param.equalsIgnoreCase("clientGeography"))
		{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respClient.getClientGeography());
		}
		
		else if(param.equalsIgnoreCase("clientEngagementState"))
		{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respClient.getClientEngagementState());
		}
		
		else if(param.equalsIgnoreCase("clientEngagementHealth"))
		{
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,respClient.getClientEngagementHealth());
		}
	
		
	}
	@Given("{string} {string} client Payload")
	public void client_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqClient = data.addClient();
		else if (payloadReq.equalsIgnoreCase("Update"))
		{	
			reqClient = data.updateClient(respClient);
			System.out.println("inside Update"+respClient.toString());
		}	
		else
			System.out.println("Issue in Payload creation request");
		reqSpec = given().spec(requestSpecification(userRole)).body(reqClient);
	}
	
	@Given("{string} User invoke ClientAPI addUsersToClient with user Payload and Parameter: {string}")
	public void user_Payload(String userRole, String param) throws IOException {
		if (param.equalsIgnoreCase("clientId")) {
			
			List<User> userList=new ArrayList<User>();
	        userList.add(reqUser);
			reqSpec = given().spec(requestSpecification(userRole)).body(userList).queryParams(param,respClient.getClientId());
					
		}
		else if (param.equalsIgnoreCase("clientName")){
			List<User> userList=new ArrayList<User>();
	        userList.add(reqUser);
			reqSpec = given().spec(requestSpecification(userRole)).body(userList).queryParams(param,respClient.getClientName());
		
		}
		
	}
	
	@Given("{string} User invoke ClientAPI addProjectToClient with project Payload and Parameter: {string}")
	public void project_Payload(String userRole, String param) throws IOException {
		
		List<Integer> projectId=new ArrayList<>();
		projectId.add(reqProject.getProjectId());
		
		if (param.equalsIgnoreCase("clientId")){
			
			reqSpec = given().spec(requestSpecification(userRole)).body(projectId).queryParams(param,respClient.getClientId());
					
		}
		else if (param.equalsIgnoreCase("clientName")){
			
			reqSpec = given().spec(requestSpecification(userRole)).body(projectId).queryParams(param,respClient.getClientName());
		
		}
		
	}
	
	@Given("{string} User invoke ClientAPI deleteProjectFromClient with project Payload and Parameter: {string}")
	public void projectIds_Payload(String userRole, String param) throws IOException {
		
		List<Integer> projectId=new ArrayList<>();
		projectId.add(reqProject.getProjectId());
			
		if (param.equalsIgnoreCase("clientId")){
			
			reqSpec = given().spec(requestSpecification(userRole)).body(projectId).queryParams(param,respClient.getClientId());
					
		}
		else if (param.equalsIgnoreCase("clientName")){
			
			reqSpec = given().spec(requestSpecification(userRole)).body(projectId).queryParams(param,respClient.getClientName());
		
		}
		
	}
	
	@Given("{string} User invoke ClientAPI deleteUsersFromClient with user Payload and Parameter: {string}")
	public void user_delete_Payload(String userRole, String param) throws IOException {
		if (param.equalsIgnoreCase("clientId")) {
			
			List<User> userList=new ArrayList<User>();
	        userList.add(reqUser);
			reqSpec = given().spec(requestSpecification(userRole)).body(userList).queryParams(param,respClient.getClientId());
					
		}
		else if (param.equalsIgnoreCase("clientName")){
			List<User> userList=new ArrayList<User>();
	        userList.add(reqUser);
			reqSpec = given().spec(requestSpecification(userRole)).body(userList).queryParams(param,respClient.getClientName());
		
		}
		
	}
	
	@Then("Verify responseBody is instance of Client")
	public void Verify_responseBody_is_instance_of__Client() {
		respClient = response.getBody().as(Client.class);
				System.out.println("Client created === "+respClient.toString());
					
		}	
	@Then("Verify Total client_Count increased by {int}")
	public void client_Count_increased(int i) {
		int old_count=client_count;
		System.out.println("old count: "+client_count);
		cmnSteDef.user_calls_API_with_http_Request("getClientCount","Get");
		assertEquals(old_count+1, get_client_count());
	}	
	
	
	
	@Then("Verify Client added exist in returned ClientList")
	public void verify_Client_added_exist_in_returned_ClientList() {
		List<Client> ClientList = Arrays.asList(respAllClient);
		System.out.println("Expected Client :"+ respClient);
		assertThat(ClientList,hasItems(respClient));
		
		
	}

	
	@Then("Response should be list of Client and size should be one")
	public void response_should_be_list_of_Client_and_size_should_be_one() {
		respAllClient = response.getBody().as(Client[].class);
		
		assertTrue("Search by ClientId do not list one Client", respAllClient.length == 1);
		
		System.out.println("Clients length :"+respAllClient.length);
	}
	
		
	@Then("Response should be list of Client and satisfy the search: {string}")
	public void response_should_be_list_of_Client_and_satisfy_the_search(String srchCriteria) {
		
		respAllClient=response.getBody().as(Client[].class);
		if (srchCriteria.equalsIgnoreCase("clientName")) {
		for(Client cat:respAllClient)
		
			assertTrue("Wrong list of Clients searched back",respClient.getClientName().equalsIgnoreCase(cat.getClientName()));
		}
		else if (srchCriteria.equalsIgnoreCase("ClientStatus")) 
		{
			   for(Client cat:respAllClient)
			   assertTrue("Wrong list of Clients searched back",respClient.getClientStatus().equalsIgnoreCase(cat.getClientStatus()));
		}
		else if (srchCriteria.equalsIgnoreCase("clientSector")) 
		{
			   for(Client cat:respAllClient)
			   assertTrue("Wrong list of Clients searched back",respClient.getClientSector().equalsIgnoreCase(cat.getClientSector()));
		}
		else if (srchCriteria.equalsIgnoreCase("clientIndustry")) 
		{
			   for(Client cat:respAllClient)
			   assertTrue("Wrong list of Clients searched back",respClient.getClientIndustry().equalsIgnoreCase(cat.getClientIndustry()));
		}
		else if (srchCriteria.equalsIgnoreCase("clientHappinessIndex")) 
		{
			   for(Client cat:respAllClient)
			   assertTrue("Wrong list of Clients searched back",respClient.getClientHappinessIndex().equalsIgnoreCase(cat.getClientHappinessIndex()));
		}
		else if (srchCriteria.equalsIgnoreCase("clientGeography")) 
		{
			   for(Client cat:respAllClient)
			   assertTrue("Wrong list of Clients searched back",respClient.getClientGeography().equalsIgnoreCase(cat.getClientGeography()));
		}
		else if (srchCriteria.equalsIgnoreCase("clientEngagementState")) 
		{
			   for(Client cat:respAllClient)
			   assertTrue("Wrong list of Clients searched back",respClient.getClientEngagementState().equalsIgnoreCase(cat.getClientEngagementState()));
		}
		else if (srchCriteria.equalsIgnoreCase("clientEngagementHealth")) 
		{
			   for(Client cat:respAllClient)
			   assertTrue("Wrong list of Clients searched back",respClient.getClientEngagementHealth().equalsIgnoreCase(cat.getClientEngagementHealth()));
		}
		
		  
	}
	@Then("Verify response will return Client instance")
	public void verify_response_will_return_Client_instance() {
		respClient = response.getBody().as(Client.class);
		System.out.println("Verify response will return Client instance:"+ respClient );
	}

	@Then("Verify response should be list all Clients=getAllClients")
	public void verify_Category_with_NoSearchCriteria() {
		cmnSteDef.user_calls_API_with_http_Request("getClientBySearchCriteria", "Get");
		Client[] actClientList = response.getBody().as(Client[].class);
		System.out.println("Actual Client count:"+actClientList.length);
		
		cmnSteDef.user_calls_API_with_http_Request("getAllClients", "Get");
		Client[] expClientList = response.getBody().as(Client[].class);
		System.out.println("Expected Client count:"+expClientList.length);
		assertArrayEquals("All Client not searched in case of no Search Criteria", expClientList, actClientList);
	}
	
	/*@Given("{string} User invoke {string} with invalid Parameter: {string} = {string}")
	public void user_invoke_api_with_invalid_Parameter(String userRole,String apiNm, String param, String var) throws IOException {
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param,var);	
	}*/
	
	@Then("Verify response will return List of Client with zero records")
	public void verify_ClientList_with_zero_records() {
		respAllClient = response.getBody().as(Client[].class);
		assertTrue("Count is not correct", respAllClient.length == 0);
	}
	
	@Then("Save the User Details")
	public void save_the_user_details() {
		
		respAllUser = response.getBody().as(User[].class);
		reqUser=respAllUser[0];
		
	}
	
	@Then("Save the Project Details")
	public void save_the_project_details() {
		
		respAllProject = response.getBody().as(Project[].class);
		reqProject=respAllProject[0];
		
	}

	

}
