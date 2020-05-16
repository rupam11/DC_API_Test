package resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;

import pojo.Activity;
import pojo.DiagramDetails;
import pojo.Sector;
import resources.FileReaderManager;

public class JsonDataReader {

	// private final String ActivityFilePath =
	// "src/test/resources/testDataResources/" + "Activity.json";
	private final String ActivityFilePath = "C:\\Users\\KumariRupam\\eclipse-workspace\\BDD_FW\\src\\test\\java\\testDataResources\\activity.json";
	private final String SectorFilePath = "C:\\Users\\KumariRupam\\eclipse-workspace\\BDD_FW\\src\\test\\java\\testDataResources\\sector.json";
	private final String BPMNFilePath = "C:\\Users\\KumariRupam\\eclipse-workspace\\BDD_FW\\src\\test\\java\\testDataResources\\diagramDetails.json";
	private Activity activity;
	private Sector sector;

	public JsonDataReader() {
		activity = getActivityData();
		sector = getSectorData();
	}

	public Activity getActivityData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ActivityFilePath));
			Activity Activity = gson.fromJson(bufferReader, Activity.class);
			return Activity;
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
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(SectorFilePath));
			Sector sector = gson.fromJson(bufferReader, Sector.class);
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

	public Sector updateSectorData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(SectorFilePath));
			Sector sector = gson.fromJson(bufferReader, Sector.class);
			
			//Update data of sector.json
			sector.setSectorName("New_"+sector.getSectorName());
			
			if(sector.getSectorStatus().equalsIgnoreCase("Active"))
				sector.setSectorStatus("Passive");
			else if(sector.getSectorStatus().equalsIgnoreCase("Passive"))
				sector.setSectorStatus("Active");
			else 
				System.out.println("Please fix sector.json data");
			
			sector.setSectorCreatedBy("rupam_sys");
			
			sector.setSectorCreatedAt("2018-02-27 14:49:08");
			
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

	public DiagramDetails addBPMN() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(BPMNFilePath));
			DiagramDetails bpmn = gson.fromJson(bufferReader, DiagramDetails.class);
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

	
//public final Activity getCustomerByName(String customerName){
//return customerList.stream().filter(x -> x.firstName.equalsIgnoreCase(customerName)).findAny().get();
//}

}