package dataProvider;

import java.io.IOException;

import entity.Activity;
import entity.Category;
import entity.Cic;
import entity.Client;
import entity.Country;
import entity.DiagramDetails;
import entity.Field;
import entity.Industry;
import entity.Mail;
import entity.Pattern;
import entity.Process;
import entity.Project;
import entity.Sector;
import entity.Task;
import entity.User;
import testBase.Utils;

public class TestDataBuild {
	
	Utils util;
	JsonDataReader jsonReader=FileReaderManager.getInstance().getJsonReader();
	
	
	public Activity addActivity() {
		Activity activity = jsonReader.getActivityData();		
		return activity;
		
	}

	public Activity updateActivity(Activity ipActivity) throws IOException {
		Activity opActivity=jsonReader.updateActivityData(ipActivity);
		return opActivity;	
	}
	
	public Sector addSector() {
		Sector sector = jsonReader.getSectorData();
		return sector;
	}

	public Sector updateSector(Sector ipSector) throws IOException {
		Sector sector = jsonReader.updateSectorData(ipSector);
		return sector;
	}

	public DiagramDetails addDiagramDetails() {
		DiagramDetails bpmn=jsonReader.getBPMNData();
		return bpmn;
	}

	public Task addTask() {
		Task task=jsonReader.getTaskData();
		return task;
	}

	public Task updateTask(Task ipTask) throws IOException {
		Task opTask=jsonReader.updateTaskData(ipTask);
		return opTask;
	}

	public Mail addMail() {
		Mail mail = jsonReader.addMail();
		return mail;
	}

		public Field addField() {
		Field field=jsonReader.getFieldData();
		return field;
	}

	public Field updateField(Field ipField) {
		Field opField=jsonReader.updateFieldData(ipField);
		return opField;
	}

	public Process addProcess() {
		Process process=jsonReader.getProcessData();
		return process;
	}

	public Process updateProcess(Process ipProcess) throws IOException {
		Process opProcess=jsonReader.updateProcessData(ipProcess);
		return opProcess;
		
	}

	public Pattern addPattern() {
		Pattern pattern=jsonReader.getPatternData();
		return pattern;
	}

	public Pattern updatePattern(Pattern ipPattern) throws IOException {
		Pattern opPattern=jsonReader.updatePatternData(ipPattern);
		return opPattern;		
	}
	
	public Client addClient() {
		Client client = jsonReader.getClientData();		
		return client;
	}
	
	public Client updateClient(Client ipClient) throws IOException {
		Client client = jsonReader.updateClientData(ipClient);
		return client;
	}

	
	public Category addCategory() {
		Category category = jsonReader.getCategoryData();
		return category;
	}

	public Category updateCategory(Category ipCategory) throws IOException {
		Category upcategory = jsonReader.updateCategoryData(ipCategory);
		return upcategory;
	}


	public User addUser() {
		User user = jsonReader.getUserData();
		return user;
		
	}
	
	public Project addProject() {
		Project project = jsonReader.getProjectData();
		return project;
		
	}
	public User updateUser(User ipUser) throws IOException {
		User opUser=jsonReader.updateUserData(ipUser);
		return opUser;
	}

	public Industry addIndustry() {
		Industry industry = jsonReader.getIndustryData();
		return industry;
	}

	public Industry updateIndustry(Industry ipIndustry) throws IOException {
		Industry opindustry = jsonReader.updateIndustryData(ipIndustry);
		return opindustry;
	}
	

	public Cic addCic() {
		Cic cic = jsonReader.getCicData();
		return cic;
	}

	public Cic updateCic(Cic ipCic) throws IOException {
		Cic opcic = jsonReader.updateCicData(ipCic);
		return opcic;
	}

	public Country addCountry() {
		Country country = jsonReader.getCountryData();
		return country;
	}

	public Country updateCountry(Country ipCountry) throws IOException {
		Country opCountry = jsonReader.updateCountryData(ipCountry);
		return opCountry;
	}



	
}
