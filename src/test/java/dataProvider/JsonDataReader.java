package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import entity.Activity;
import entity.Category;
import entity.Cic;
import entity.Client;
import entity.Country;
import entity.DiagramDetails;
import entity.Field;
import entity.FieldRuleId;
import entity.Geography;
import entity.Industry;
import entity.Mail;
import entity.Options;
import entity.Pattern;
import entity.Process;
import entity.Project;
import entity.Rule;
import entity.Sector;
import entity.Squad;
import entity.Task;
import entity.Template;
import entity.User;
import java.text.SimpleDateFormat;


public class JsonDataReader {

	private final String JSONDataFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath();
	private ConfigFileReader configReader = FileReaderManager.getInstance().getConfigReader();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd.HH.mm");
	private Activity activity;
	private Sector sector;
	private DiagramDetails bpmn;
	private Task task;
	private Category category;
	private Mail mail;
	private Field field;
	private Gson gson;
	BufferedReader bufferReader;
	private Process process;
	private Pattern pattern;
	private Client client;
	private Project project;
	private Industry industry;
	private User user;
	private Cic cic;
	private Country country;
	private Squad squad;
	private Geography geography;
	private Options option;
	private Rule rule;
	private Template template;
	

	
	//===================================================Initialize all private variable inside Constructor
	public JsonDataReader() {
		gson = new Gson();
		this.activity = new Activity();
		this.task=new Task();
		this.sector=new Sector();
		this.bpmn=new DiagramDetails();
		this.mail=new Mail();
		this.category=new Category();
		this.process=new Process();
		this.pattern=new Pattern();
		this.client = new Client();
		this.industry = new Industry();
		this.cic=new Cic();
		this.country=new Country();
		this.squad=new Squad();
		this.geography=new Geography();
		this.template=new Template();
	}

	public Activity getActivityData() {
		String TaskFilePath=JSONDataFilePath+"Activity/task.json";
		String ActivityFilePath=JSONDataFilePath+"Activity/activity.json";
		
		try {
			bufferReader = new BufferedReader(new FileReader(TaskFilePath));
			task=gson.fromJson(bufferReader, Task.class);
			List<Task> taskList=new ArrayList<Task>();
			taskList.add(task);			
			
			bufferReader = new BufferedReader(new FileReader(ActivityFilePath));
			activity=gson.fromJson(bufferReader, Activity.class);
			activity.setActivityTasks(taskList);
						
			return activity;
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : ");
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public Activity updateActivityData(Activity ipActivity) throws IOException {
		String TaskFilePath=JSONDataFilePath+"Activity/newTask.json";
		List<Task> taskList=new ArrayList<Task>();
		
		try {
			bufferReader = new BufferedReader(new FileReader(TaskFilePath));
			task=gson.fromJson(bufferReader, Task.class);
			taskList.add(task);					
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : ");
		}
		
		ipActivity.setActivityCode("New_Code_"+ipActivity.getActivityCode());
		ipActivity.setActivitySequence(10+ipActivity.getActivitySequence());
		ipActivity.setActivityDisplaySequence(10+ipActivity.getActivityDisplaySequence());
		ipActivity.setActivityName("New_actNm_"+ipActivity.getActivityName());
		ipActivity.setActivityPercentCompletion("New_%_"+ipActivity.getActivityPercentCompletion());
		ipActivity.setActivityEffort("New_effort_"+ipActivity.getActivityEffort());
		ipActivity.setActivityOwner("New_owner_"+ipActivity.getActivityOwner());
		ipActivity.setActivityCreatedBy(configReader.getPropValue("update_CreatedBy"));
		ipActivity.setActivityCreatedAt(configReader.getPropValue("update_CreatedAt"));
		
		if(ipActivity.getActivityStatus().equalsIgnoreCase("Active"))
			ipActivity.setActivityStatus("Passive");
		else if(ipActivity.getActivityStatus().equalsIgnoreCase("Passive"))
			ipActivity.setActivityStatus("Active");
		else 
			System.out.println("Please fix process.json data");
		ipActivity.setActivityTasks(taskList);
		
		
		return ipActivity;
	}
	
	
	
	public Sector getSectorData() {
		String SectorFilePath=JSONDataFilePath+"Sector/sector.json";
		try {
			bufferReader = new BufferedReader(new FileReader(SectorFilePath));
			sector = gson.fromJson(bufferReader, Sector.class);
			return sector;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + SectorFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}

	}

	public Sector updateSectorData(Sector ipSector) throws IOException {
		ipSector.setSectorName("New_"+ipSector.getSectorName());
		
		if(ipSector.getSectorStatus().equalsIgnoreCase("Active"))
			ipSector.setSectorStatus("Passive");
		else if(ipSector.getSectorStatus().equalsIgnoreCase("Passive"))
			ipSector.setSectorStatus("Active");
		else 
			System.out.println("Please fix sector.json data");
		
		sector.setSectorCreatedBy(configReader.getPropValue("update_CreatedBy"));
		sector.setSectorCreatedAt(configReader.getPropValue("update_CreatedAt"));
		
			return ipSector;
		}

	public DiagramDetails getBPMNData() {
		String BPMNFilePath=JSONDataFilePath+"DiagramDetails/bpmn.json";
		try {
			bufferReader = new BufferedReader(new FileReader(BPMNFilePath));
			bpmn = gson.fromJson(bufferReader, DiagramDetails.class);
			return bpmn;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + BPMNFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public Task getTaskData() {
		String TaskFilePath=JSONDataFilePath+"Task/task.json";
		try {
			bufferReader = new BufferedReader(new FileReader(TaskFilePath));
			task = gson.fromJson(bufferReader, Task.class);
			return task;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + TaskFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	public Task updateTaskData(Task ipTask) throws IOException {
		ipTask.setTaskCode("New_code_"+ipTask.getTaskCode());
		ipTask.setTaskSequence(10+ipTask.getTaskSequence());
		ipTask.setTaskDisplaySequence(10+ipTask.getTaskDisplaySequence ());
		
		if(ipTask.getTaskStatus().equalsIgnoreCase("Active"))
			ipTask.setTaskStatus("Passive");
		else if(ipTask.getTaskStatus().equalsIgnoreCase("Passive"))
			ipTask.setTaskStatus("Active");
		else 
			System.out.println("Please fix task.json data");
		
		ipTask.setTaskComments("New_comment_"+ipTask.getTaskComments());
		
		if(ipTask.getTaskApplicable().equalsIgnoreCase("No"))
			ipTask.setTaskApplicable("Yes");
		else if(ipTask.getTaskApplicable().equalsIgnoreCase("Yes"))
			ipTask.setTaskApplicable("No");
		else 
			System.out.println("Please fix task.json data");
		
		ipTask.setPercentCompletion("New_percent_"+ipTask.getPercentCompletion());
		ipTask.setTaskDescription("New_description_"+ipTask.getTaskDescription());
		ipTask.setTaskEffort("New_taskeffort_"+ipTask.getTaskEffort());
		ipTask.setTaskOwner("New_owner_"+ipTask.getTaskOwner());
		ipTask.setTaskCreatedBy(configReader.getPropValue("update_CreatedBy"));
		ipTask.setTaskCreatedAt(configReader.getPropValue("update_CreatedAt"));
		ipTask.setTaskProcessName("New_process_nm_"+ipTask.getTaskProcessName());
		ipTask.setTaskSquadName("New_squadNm_"+ipTask.getTaskSquadName());
		ipTask.setTaskSquadType("New_squadType_"+ipTask.getTaskSquadType());
		
		return ipTask;
	}
	
	public Mail addMail() {
		String mailPath=JSONDataFilePath+"Mail/mail.json";
		try {
			bufferReader = new BufferedReader(new FileReader(mailPath));
			mail = gson.fromJson(bufferReader, Mail.class);
			return mail;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + mailPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	
	public Field getFieldData(String fieldPurpose) {
		String FieldFilePath=JSONDataFilePath+"Field/field.json";
		if(fieldPurpose.equalsIgnoreCase("Add_Field"))
			FieldFilePath=JSONDataFilePath+"Field/field.json";
		else if(fieldPurpose.equalsIgnoreCase("Pass_Question"))
			FieldFilePath=JSONDataFilePath+"Field/fieldQues.json";
		
		try {
			bufferReader = new BufferedReader(new FileReader(FieldFilePath));
			field = gson.fromJson(bufferReader, Field.class);
			return field;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + FieldFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public Field updateFieldData(Field ipField,FieldRuleId ruleId) throws IOException {
		String OptionFilePath=JSONDataFilePath+"Field/option.json";
		
		List<Options> optionList=new ArrayList<Options>();
		try {
			bufferReader = new BufferedReader(new FileReader(OptionFilePath));
			option=gson.fromJson(bufferReader, Options.class);
			optionList.add(option);
			ipField.setFieldOptions(optionList);
		}
		catch (FileNotFoundException e) {
			throw new RuntimeException("Option Json file not found at path : "+OptionFilePath);
		}
		ipField.setFieldCategory("New_"+ipField.getFieldCategory());
		ipField.setFieldComment("New_"+ipField.getFieldComment());
		ipField.setFieldConstraints("New_"+ipField.getFieldConstraints());
		ipField.setFieldCreatedBy(configReader.getPropValue("update_CreatedBy"));
		ipField.setFieldCreatedAt(configReader.getPropValue("update_CreatedAt"));
		ipField.setFieldDisplaySequence(10+ipField.getFieldDisplaySequence());
		ipField.setFieldGuidance("New_"+ipField.getFieldGuidance());
		ipField.setFieldIndustry("New_"+ipField.getFieldIndustry());
		ipField.setFieldName("New_"+ipField.getFieldName());
		ipField.setFieldParentId("New_"+ipField.getFieldParentId());
		ipField.setFieldQuestion("New_"+ipField.getFieldQuestion());
		
		List<FieldRuleId> fieldRuleList=ipField.getFieldRuleIds();
		fieldRuleList.add(ruleId);
		ipField.setFieldRuleIds(fieldRuleList);
		
		ipField.setFieldSector("New_"+ipField.getFieldSector());
		if(ipField.getFieldStatus().equalsIgnoreCase("Active"))
			ipField.setFieldStatus("Passive");
		else if(ipField.getFieldStatus().equalsIgnoreCase("Passive"))
			ipField.setFieldStatus("Active");
		ipField.setFieldTemplateName("New_"+ipField.getFieldTemplateName());
		ipField.setFieldType("New_"+ipField.getFieldType());
		ipField.setFieldUsability(10+ipField.getFieldUsability());
		ipField.setFieldValue("New_"+ipField.getFieldValue());
		ipField.setFieldValueSource("New_"+ipField.getFieldValueSource());
		ipField.setFieldVersion((Double.parseDouble(ipField.getFieldVersion())+1.0)+"");
		
		
		return ipField;
		
	}

	public Process getProcessData() {
		String ProcessFilePath=JSONDataFilePath+"Process/process.json";
		try {
			bufferReader = new BufferedReader(new FileReader(ProcessFilePath));
			process = gson.fromJson(bufferReader, Process.class);
			return process;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ProcessFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public Process updateProcessData(Process ipProcess) throws IOException {
		System.out.println("original process === "+ipProcess.toString());
		ipProcess.setProcessCode("New_"+ipProcess.getProcessCode());
		ipProcess.setProcessName("New_"+ipProcess.getProcessName());
		
		if(ipProcess.getProcessStatus().equalsIgnoreCase("Active"))
			ipProcess.setProcessStatus("Passive");
		else if(ipProcess.getProcessStatus().equalsIgnoreCase("Passive"))
			ipProcess.setProcessStatus("Active");
		else 
			System.out.println("Please fix process.json data");
	ipProcess.setProcessCreatedBy(configReader.getPropValue("update_CreatedBy"));
		ipProcess.setProcessCreatedAt(configReader.getPropValue("update_CreatedAt"));
		
		System.out.println("updated process === "+ipProcess.toString());
		return ipProcess;
	}

	public Pattern getPatternData() {
		
		String TaskFilePath=JSONDataFilePath+"Pattern/task.json";
		String ActivityFilePath=JSONDataFilePath+"Pattern/activity.json";
		String PatternFilePath=JSONDataFilePath+"Pattern/pattern.json";
		try {
			bufferReader = new BufferedReader(new FileReader(TaskFilePath));
			task=gson.fromJson(bufferReader, Task.class);
			List<Task> taskList=new ArrayList<Task>();
			taskList.add(task);
			
			
			bufferReader = new BufferedReader(new FileReader(ActivityFilePath));
			activity=gson.fromJson(bufferReader, Activity.class);
			activity.setActivityTasks(taskList);
			List<Activity> activityList=new ArrayList<Activity>();
			activityList.add(activity);
			
			bufferReader = new BufferedReader(new FileReader(PatternFilePath));
			pattern=gson.fromJson(bufferReader, Pattern.class);
			pattern.setPatternActivities(activityList);
			
			return pattern;
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : ");
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public Pattern updatePatternData(Pattern ipPattern) throws IOException {
		
		String TaskFilePath=JSONDataFilePath+"Pattern/newTask.json";
		String ActivityFilePath=JSONDataFilePath+"Pattern/newActivity.json";
		List<Task> taskList=new ArrayList<Task>();
		List<Activity> activityList=new ArrayList<Activity>();
		
		
		try {
			bufferReader = new BufferedReader(new FileReader(TaskFilePath));
			task=gson.fromJson(bufferReader, Task.class);
			taskList.add(task);			
			
			bufferReader = new BufferedReader(new FileReader(ActivityFilePath));
			activity=gson.fromJson(bufferReader, Activity.class);
			activity.setActivityTasks(taskList);
			activityList.add(activity);
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : ");
		}
		
		ipPattern.setPatternCode("New_"+ipPattern.getPatternCode());
		ipPattern.setPatternSequence(ipPattern.getPatternSequence()+10);
		ipPattern.setPatternDisplaySequence(ipPattern.getPatternDisplaySequence()+10);
		ipPattern.setPatternName("New_"+ipPattern.getPatternName());
		ipPattern.setPatternEffort("New_"+ipPattern.getPatternEffort());
		ipPattern.setPatternOwner("New_"+ipPattern.getPatternOwner());
		ipPattern.setPatternCreatedBy(configReader.getPropValue("update_CreatedBy"));
		ipPattern.setPatternCreatedAt(configReader.getPropValue("update_CreatedAt"));
		
		if(ipPattern.getPatternStatus().equalsIgnoreCase("Active"))
			ipPattern.setPatternStatus("Passive");
		else if(ipPattern.getPatternStatus().equalsIgnoreCase("Passive"))
			ipPattern.setPatternStatus("Active");
		else 
			System.out.println("Please fix process.json data");
		ipPattern.setPatternActivities(activityList);
		
		
		
		return ipPattern;
	}
	
	public Project getProjectData() {
		String ProjectFilePath=JSONDataFilePath+"Project/project.json";
		try {
			bufferReader = new BufferedReader(new FileReader(ProjectFilePath));
			activity = gson.fromJson(bufferReader, Activity.class);
			return project;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ProjectFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	public Client getClientData() {
		String ClientFilePath=JSONDataFilePath+"Client/client.json";
		try {
			bufferReader = new BufferedReader(new FileReader(ClientFilePath));
			client = gson.fromJson(bufferReader, Client.class);
			return client;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ClientFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	public Client updateClientData(Client ipClient) throws IOException {
		
		 System.out.println("Entity to update"+ipClient.toString());
			ipClient.setClientName("New_"+ipClient.getClientName());
			
			if(ipClient.getClientStatus().equalsIgnoreCase("Active"))
				ipClient.setClientStatus("Passive");
			else if(ipClient.getClientStatus().equalsIgnoreCase("Passive"))
				ipClient.setClientStatus("Active");
			else 
				System.out.println("Please fix Client.json data");
			
			ipClient.setClientOnboardedBy(configReader.getPropValue("update_CreatedBy"));
			ipClient.setClientOnboardedAt(configReader.getPropValue("update_CreatedAt"));
			
			
		return ipClient;
			}
	
	public Category getCategoryData() {
		String CategoryFilePath=JSONDataFilePath+"Category/category.json";
		try {
			bufferReader = new BufferedReader(new FileReader(CategoryFilePath));
			category = gson.fromJson(bufferReader, Category.class);
			return category;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CategoryFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}

	}

	public Category updateCategoryData(Category ipCategory) throws IOException {
		
	 System.out.println("Entity to update"+ipCategory.toString());
		ipCategory.setCategoryName("New_"+ipCategory.getCategoryName());
		
		if(ipCategory.getCategoryStatus().equalsIgnoreCase("Active"))
			ipCategory.setCategoryStatus("Passive");
		else if(ipCategory.getCategoryStatus().equalsIgnoreCase("Passive"))
			ipCategory.setCategoryStatus("Active");
		else 
			
			System.out.println("Please fix category.json data");
		
		ipCategory.setCategoryCreatedBy(configReader.getPropValue("update_CreatedBy"));
		ipCategory.setCategoryCreatedAt(configReader.getPropValue("update_CreatedAt"));
		
		
	return ipCategory;
		}

	public User getUserData() {
		String UserFilePath=JSONDataFilePath+"User/user.json";
		try {
			bufferReader = new BufferedReader(new FileReader(UserFilePath));
			user = gson.fromJson(bufferReader, User.class);
			return user;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + UserFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}

	}
	
	public User updateUserData(User ipUser) throws IOException {
		
		 System.out.println("Entity to update"+ipUser.toString());
		 ipUser.setUserName("New_"+ipUser.getUserName());
			
			if(ipUser.getUserStatus().equalsIgnoreCase("Active"))
				ipUser.setUserStatus("Passive");
			else if(ipUser.getUserStatus().equalsIgnoreCase("Passive"))
				ipUser.setUserStatus("Active");
			else 
				System.out.println("Please fix category.json data");
			
			category.setCategoryCreatedBy(configReader.getPropValue("update_CreatedBy"));
			category.setCategoryCreatedAt(configReader.getPropValue("update_CreatedAt"));
			
			
		return ipUser;
			}

	public Industry getIndustryData() {
		String IndustryFilePath=JSONDataFilePath+"Industry/industry.json";
		try {
			bufferReader = new BufferedReader(new FileReader(IndustryFilePath));
			industry = gson.fromJson(bufferReader, Industry.class);
			return industry;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + IndustryFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public Industry updateIndustryData(Industry ipIndustry) throws IOException {
		ipIndustry.setIndustryName("New_"+ipIndustry.getIndustryName());
		
		if(ipIndustry.getIndustryStatus().equalsIgnoreCase("Active"))
			ipIndustry.setIndustryStatus("Passive");
		else if(ipIndustry.getIndustryStatus().equalsIgnoreCase("Passive"))
			ipIndustry.setIndustryStatus("Active");
		else 
			System.out.println("Please fix industry.json data");
		
		industry.setIndustryCreatedBy(configReader.getPropValue("update_CreatedBy"));
		industry.setIndustryCreatedAt(configReader.getPropValue("update_CreatedAt"));
		
			return ipIndustry;
	}

	
	public Cic updateCicData(Cic ipCic) throws IOException {
		ipCic.setCicName("New_"+ipCic.getCicName());
		
		if(ipCic.getCicStatus().equalsIgnoreCase("Active"))
			ipCic.setCicStatus("Passive");
		else if(ipCic.getCicStatus().equalsIgnoreCase("Passive"))
			ipCic.setCicStatus("Active");
		else 
			System.out.println("Please fix cic.json data");
		
		ipCic.setCicCreatedBy(configReader.getPropValue("update_CreatedBy"));
		ipCic.setCicCreatedAt(configReader.getPropValue("update_CreatedAt"));
		
			return ipCic;
	}

	public Cic getCicData() {
		String CountryFilePath=JSONDataFilePath+"Country/country.json";
		try {
			bufferReader = new BufferedReader(new FileReader(CountryFilePath));
			cic = gson.fromJson(bufferReader, Cic.class);
			return cic;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CountryFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}


	public Country getCountryData() {
		String CountryFilePath=JSONDataFilePath+"Country/country.json";
		try {
			bufferReader = new BufferedReader(new FileReader(CountryFilePath));
			country = gson.fromJson(bufferReader, Country.class);
			return country;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CountryFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public Country updateCountryData(Country ipCountry) throws IOException {
		ipCountry.setCountryName("New_"+ipCountry.getCountryName());
		
		if(ipCountry.getCountryStatus().equalsIgnoreCase("Active"))
			ipCountry.setCountryStatus("Passive");
		else if(ipCountry.getCountryStatus().equalsIgnoreCase("Passive"))
			ipCountry.setCountryStatus("Active");
		else 
			System.out.println("Please fix country.json data");
		
		ipCountry.setCountryCreatedBy(configReader.getPropValue("update_CreatedBy"));
		ipCountry.setCountryCreatedAt(configReader.getPropValue("update_CreatedAt"));
		
			return ipCountry;
	}

	public Squad getSquadData() {
		String SquadFilePath=JSONDataFilePath+"Squad/squad.json";
		try {
			bufferReader = new BufferedReader(new FileReader(SquadFilePath));
			squad = gson.fromJson(bufferReader, Squad.class);
			return squad;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + SquadFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public Squad updateSquadData(Squad ipSquad) throws IOException {
	ipSquad.setSquadName("New_"+ipSquad.getSquadName());
		
		if(ipSquad.getSquadStatus().equalsIgnoreCase("Active"))
			ipSquad.setSquadStatus("Passive");
		else if(ipSquad.getSquadStatus().equalsIgnoreCase("Passive"))
			ipSquad.setSquadStatus("Active");
		else 
			System.out.println("Please fix squad.json data");
		
		ipSquad.setSquadCreatedBy(configReader.getPropValue("update_CreatedBy"));
		ipSquad.setSquadCreatedAt(configReader.getPropValue("update_CreatedAt"));
		
			return ipSquad;
	}

	public Geography getGeographyData() {
		String GeographyFilePath=JSONDataFilePath+"Geography/geography.json";
		try {
			bufferReader = new BufferedReader(new FileReader(GeographyFilePath));
			geography = gson.fromJson(bufferReader, Geography.class);
			return geography;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + GeographyFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public Geography updateGeographydData(Geography ipGeo) throws IOException {
		ipGeo.setGeographyName("New_"+ipGeo.getGeographyName());
		
		if(ipGeo.getGeographyStatus().equalsIgnoreCase("Active"))
			ipGeo.setGeographyStatus("Passive");
		else if(ipGeo.getGeographyStatus().equalsIgnoreCase("Passive"))
			ipGeo.setGeographyStatus("Active");
		else 
			System.out.println("Please fix geography.json data");
		
		ipGeo.setGeographyCreatedBy(configReader.getPropValue("update_CreatedBy"));
		ipGeo.setGeographyCreatedAt(configReader.getPropValue("update_CreatedAt"));
		
			return ipGeo;
	}

	public Rule getRuleData() {
		String RuleFilePath=JSONDataFilePath+"Field/rule.json";
		try {
			bufferReader = new BufferedReader(new FileReader(RuleFilePath));
			rule = gson.fromJson(bufferReader, Rule.class);
			return rule;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + RuleFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public Template getTemplateData() {
		String TemplateFilePath=JSONDataFilePath+"Template/template.json";        

		try {
			bufferReader = new BufferedReader(new FileReader(TemplateFilePath));
			template = gson.fromJson(bufferReader, Template.class);
			//template.setTemplateName(template.getTemplateName()+sdf.format(new Timestamp(System.currentTimeMillis())));
			return template;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + TemplateFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public Template updateTemplateData(Template ipTemplate) throws IOException {
		
		ipTemplate.setTemplateName("Updated_"+ipTemplate.getTemplateName());
		ipTemplate.setTemplateIndustryName("Updated_"+ipTemplate.getTemplateIndustryName());
		ipTemplate.setTemplateSectorName("Updated_"+ipTemplate.getTemplateSectorName());
	
		if(ipTemplate.getTemplateStatus().equalsIgnoreCase("Active"))
			ipTemplate.setTemplateStatus("Passive");
		else if(ipTemplate.getTemplateStatus().equalsIgnoreCase("Passive"))
			ipTemplate.setTemplateStatus("Active");
		else 
			System.out.println("Please fix template.json data");
		
		return ipTemplate;
	}

	
}
