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
	

	createIndustry("industry-service/createIndustry"),
	deleteIndustry("industry-service/deleteIndustry"),
	getIndustryBySearchCriteria("industry-service/getIndustryBySearchCriteria"),
	getIndustryCount("industry-service/getIndustryCount"),
	getAllIndustries("industry-service/getAllIndustries"),
	updateIndustry("industry-service/updateIndustry"),
	
	createCic("cic-service/createCic"),
	deleteCic("cic-service/deleteCic"),
	getCicBySearchCriteria("cic-service/getCicBySearchCriteria"),
	getCicCount("cic-service/getCicCount"),
	getAllCics("cic-service/getAllCics"),
	updateCic("cic-service/updateCic"),
	
	createBpmnDiagram("bpmn-service/createBpmnDiagram"),
	getBpmnDiagram("bpmn-service/getBpmnDiagram"),
	
	sendMail("mail-service/sendMail"),
	
	createField("field-service/createField"),
	deleteField("field-service/deleteField"),
	fields_init("field-service/fields/init"),
	getAllFields("field-service/getAllFields"),
	getFieldCount("field-service/getFieldCount"),
	getFieldsBySearchCriteria("field-service/getFieldsBySearchCriteria"),
	updateField("field-service/updateField"),
	updateFieldByRuleId("field-service/updateFieldByRuleId"),
	
	createProcess("process-service/createProcess"),
	deleteProcess("process-service/deleteProcess"),
	getAllProcess("process-service/getAllProcess"),
	getProcessCount("process-service/getProcessCount"),
	getProcessBySearchCriteria("process-service/getProcessBySearchCriteria"),
	updateProcess("process-service/updateProcess"),
	
	createPattern("pattern-service/createPattern"),
	deletePattern("pattern-service/deletePattern"),
	getAllPatterns("pattern-service/getAllPatterns"),
	getPatternCount("pattern-service/getPatternCount"),
	getPatternBySearchCriteria("pattern-service/getPatternBySearchCriteria"),
	updatePattern("pattern-service/updatePattern"),
	
	getCategoryCount("category-service/getCategoryCount"),
	createCategory("category-service/createCategory"),
	getAllCategories("category-service/getAllCategories"),
	getCategoryListbyName("category-service/getCategoryListbyName"),
	getCategoryBySearchCriteria("category-service/getCategoryBySearchCriteria"),
	deleteCategory("category-service/deleteCategory"),
	updateCategory("category-service/updateCategory"),
	getCategoryNotinList("category-service/getCategoryNotinList"),
	
	
	getClientCount("client-service/getClientCount"),
	createClient("client-service/createClient"),
	getAllClients("client-service/getAllClients"),
	getAllProjectsIds("client-service/getAllProjectsIds"),
	getClientBySearchCriteria("client-service/getClientBySearchCriteria"),
	getClientUsers("client-service/getClientUsers"),
	deleteClient("client-service/deleteClient"),
	addUsersToClient("client-service/addUsersToClient"),
	addProjectToClient("client-service/addProjectToClient"),
	deleteProjectFromClient("client-service/deleteProjectFromClient"),
	deleteUsersFromClient("client-service/deleteUsersFromClient"),
	updateClient("client-service/updateClient"),
	getAllUsers("user-service/getAllUsers"),
	
	getAllProjects("project-service/getAllProjects");
	
	private String resource;	
	
	APIResources(String resource){
		this.resource=resource;
	}
	
	public String getResource() {
		return resource;
	}

}
