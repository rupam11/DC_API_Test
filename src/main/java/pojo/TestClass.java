package pojo;

import java.util.ArrayList;
import java.util.List;

//import io.restassured.specification.RequestSpecification;

public class TestClass {

	public static void main(String[] args) {
	    Task task=new Task("0","No","task_code","...TASK...Comment...",
	    		"2020-04-12 06:11:17","abc","...TASK_DESC...",0,
	    		"...TASK_EFFORT...",111,"rupam_sys","...Process Name...",0,
	    		"Cloud Migration Factory / IBM Support Team","IBM","Not Star","Passive","2020-04-27 14:15:44",
	    		"rupam_sys");
	   	
		List<Task> taskList=new ArrayList<Task>();
		
		taskList.add(task);
		
		Activity1 Activity=new Activity1("act_code","2020-04-22 00:00:00","dchelp",
				0,"...ACTIVITTY_EFFORT...",999,"...ACT_Name...",
				"rupam_sys","0",0,"Not Started",
				"Active",taskList,"0000-00-00 00:00:00","");
		
		System.out.println("TASK  ::: "+task.toString());
		System.out.println("Activity  ::: "+Activity.toString());

	}

}
