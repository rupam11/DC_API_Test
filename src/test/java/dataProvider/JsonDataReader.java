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
import entity.Client;
import entity.DiagramDetails;
import entity.Field;
import entity.Mail;
import entity.Pattern;
import entity.Process;
import entity.Project;
import entity.Sector;
import entity.Task;
import entity.User;

public class JsonDataReader {

	private final String JSONDataFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath();
	private ConfigFileReader configReader = FileReaderManager.getInstance().getConfigReader();
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
	private User user;
	

	
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
		
		ipActivity.setActivityCode("New_"+ipActivity.getActivityCode());
		ipActivity.setActivitySequence(ipActivity.getActivitySequence()+10);
		ipActivity.setActivityDisplaySequence(ipActivity.getActivityDisplaySequence()+10);
		ipActivity.setActivityName("New_"+ipActivity.getActivityName());
		ipActivity.setActivityPercentCompletion("New_"+ipActivity.getActivityPercentCompletion());
		ipActivity.setActivityEffort("New_"+ipActivity.getActivityEffort());
		ipActivity.setActivityOwner("New_"+ipActivity.getActivityOwner());
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
			System.out.println("Please fix task.json data");
		
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
		ipTask.setTaskCode("New_"+ipTask.getTaskCode());
		ipTask.setTaskSequence(ipTask.getTaskSequence()+1);
		ipTask.setTaskDisplaySequence(ipTask.getTaskDisplaySequence ()+1);
		
		if(ipTask.getTaskStatus().equalsIgnoreCase("Active"))
			ipTask.setTaskStatus("Passive");
		else if(ipTask.getTaskStatus().equalsIgnoreCase("Passive"))
			ipTask.setTaskStatus("Active");
		else 
			System.out.println("Please fix task.json data");
		
		ipTask.setTaskComments(ipTask.getTaskComments()+"_new_comment");
		
		if(ipTask.getTaskApplicable().equalsIgnoreCase("No"))
			ipTask.setTaskApplicable("Yes");
		else if(ipTask.getTaskApplicable().equalsIgnoreCase("Yes"))
			ipTask.setTaskApplicable("No");
		else 
			System.out.println("Please fix task.json data");
		
		ipTask.setPercentCompletion(ipTask.getPercentCompletion()+10);
		ipTask.setTaskEffort("New_"+ipTask.getTaskEffort());
		ipTask.setTaskOwner("New_"+ipTask.getTaskOwner());
		ipTask.setTaskCreatedBy(configReader.getPropValue("update_CreatedBy"));
		ipTask.setTaskCreatedAt(configReader.getPropValue("update_CreatedAt"));
		ipTask.setTaskProcessName("New_"+ipTask.getTaskProcessName());
		ipTask.setTaskSquadName("New_"+ipTask.getTaskSquadName());
		ipTask.setTaskSquadType("New_"+ipTask.getTaskSquadType());
		
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

	
	public Field getFieldData() {
		String FieldFilePath=JSONDataFilePath+"Field/field.json";
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

	public Field updateFieldData(Field ipField) {
		// TODO Auto-generated method stub
		return null;
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
		//ipPattern.setPatternCompletion("New_"+ipPattern.getPatternCompletion());
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
			
			client.setClientOnboardedBy(configReader.getPropValue("update_CreatedBy"));
			client.setClientOnboardedAt(configReader.getPropValue("update_CreatedAt"));
			
			
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
		
		category.setCategoryCreatedBy(configReader.getPropValue("update_CreatedBy"));
		category.setCategoryCreatedAt(configReader.getPropValue("update_CreatedAt"));
		
		
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

	
}
