package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;
import entity.Activity;
import entity.DiagramDetails;
import entity.Mail;
import entity.Sector;
import entity.Task;

public class JsonDataReader {

	private final String JSONDataFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath();
	private ConfigFileReader configReader = FileReaderManager.getInstance().getConfigReader();
	private Activity activity;
	private Sector sector;
	private DiagramDetails bpmn;
	private Task task;
	private Mail mail;
	Gson gson;
	BufferedReader bufferReader;

	
	//===================================================Initialize all private variable inside Constructor
	public JsonDataReader() {
		gson = new Gson();
		this.activity = new Activity();
		this.task=new Task();
		this.sector=new Sector();
		this.bpmn=new DiagramDetails();
		this.mail=new Mail();
	}

	public Activity getActivityData() {
		String ActivityFilePath=JSONDataFilePath+"Activity/activity.json";
		try {
			bufferReader = new BufferedReader(new FileReader(ActivityFilePath));
			activity = gson.fromJson(bufferReader, Activity.class);
			return activity;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ActivityFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
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
	

}
