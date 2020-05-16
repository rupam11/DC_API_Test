package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.Activity;
import pojo.DiagramDetails;
import pojo.Sector;
import pojo.Task;

public class TestDataBuild {
	
	Utils util;

//	public TestDataBuild() {
//	};

	public Activity addActivity() {
		Activity activity = FileReaderManager.getInstance().getJsonReader().getActivityData();
		return activity;
	}

	public Sector addSector() {
		Sector sector = FileReaderManager.getInstance().getJsonReader().getSectorData();
		return sector;
	}

	public Sector updateSector() {
		Sector sector = FileReaderManager.getInstance().getJsonReader().updateSectorData();
		return sector;
	}

	public DiagramDetails addDiagramDetails() {
		DiagramDetails bpmn=FileReaderManager.getInstance().getJsonReader().addBPMN();
		return bpmn;
	}

}
