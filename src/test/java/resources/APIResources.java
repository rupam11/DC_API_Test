package resources;

public enum APIResources {
	
	
	
	createActivity("activity-service/createActivity"),
	deleteActivity("activity-service/deleteActivity"),
	getActivityBySearchCriteria("activity-service/getActivityBySearchCriteria"),
	getActivityCount("activity-service/getActivityCount"),
	getAllActivities("activity-service/getAllActivities"),
	updateActivity("activity-service/updateActivity"),	
	
	createTask("task-service/createTask"),
	deleteTask("task-service/deleteTask"),
	getTaskBySearchCriteria("task-service/getTaskBySearchCriteria"),
	getTaskCount("task-service/getTaskCount"),
	getAllTasks("task-service/getAllTasks"),
	updateTask("task-service/updateTask"),
	
	createSector("sector-service/createSector"),
	deleteSector("sector-service/deleteSector"),
	getSectorBySearchCriteria("sector-service/getSectorBySearchCriteria"),
	getSectorCount("sector-service/getSectorCount"),
	getAllSectors("sector-service/getAllSectors"),
	updateSector("sector-service/updateSector"),
	
	createBpmnDiagram("bpmn-service/createBpmnDiagram"),
	getBpmnDiagram("bpmn-service/getBpmnDiagram"),
	
	sendMail("mail-service/sendMail"),
	
	createField("field-service/createSector"),
	deleteField("field-service/deleteSector"),
	fields_init("field-service/fields/init"),
	getAllFields("field-service/getAllFields"),
	getFieldCount("field-service/getFieldCount"),
	getFieldsBySearchCriteria("field-service/getFieldsBySearchCriteria"),
	updateField("field-service/updateField"),
	updateFieldByRuleId("field-service/updateFieldByRuleId"),
	
	createCategory("category-service/createCategory"),
	deleteCategory("category-service/deleteCategory"),
	getAllCategories("field-service/getAllCategories"),
	getCategoryCount("category-service/getCategoryCount");
	
		
	
	private String resource;	
	
	APIResources(String resource){
		this.resource=resource;
	}
	
	public String getResource() {
		return resource;
	}

}
