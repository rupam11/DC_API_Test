package dataProvider;

import java.io.IOException;

import entity.Activity;
import entity.Category;
import entity.DiagramDetails;
import entity.Mail;
import entity.Sector;
import entity.Task;
import testBase.Utils;

public class TestDataBuild {
	
	Utils util;
	JsonDataReader jsonReader=FileReaderManager.getInstance().getJsonReader();
	
	
	public Activity addActivity() {
		Activity activity = jsonReader.getActivityData();		
		return activity;
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

	public Category addCategory() {
		Category category=jsonReader.getCategoryData();
		return category;
	}

}
