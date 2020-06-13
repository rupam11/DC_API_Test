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
	
	createGeography("geography-service/createGeography"),
	deleteGeography("geography-service/deleteGeography"),
	getGeographyBySearchCriteria("geography-service/getGeographyBySearchCriteria"),
	getGeographyCount("geography-service/getGeographyCount"),
	getAllGeographies("geography-service/getAllGeographies"),
	updateGeography("geography-service/updateGeography"),
	
	createSquad("squad-service/createSquad"),
	deleteSquad("squad-service/deleteSquad"),
	getSquadBySearchCriteria("squad-service/getSquadBySearchCriteria"),
	getSquadCount("squad-service/getSquadCount"),
	getAllSquads("squad-service/getAllSquads"),
	updateSquad("squad-service/updateSquad"),
	
	
	createCic("cic-service/createCic"),
	deleteCic("cic-service/deleteCic"),
	getCicBySearchCriteria("cic-service/getCicBySearchCriteria"),
	getCicCount("cic-service/getCicCount"),
	getAllCics("cic-service/getAllCics"),
	updateCic("cic-service/updateCic"),
	
	createCountry("country-service/createCountry"),
	deleteCountry("country-service/deleteCountry"),
	getCountryBySearchCriteria("country-service/getCountryBySearchCriteria"),
	getCountryCount("country-service/getCountryCount"),
	getAllCountries("country-service/getAllCountries"),
	updateCountry("country-service/updateCountry"),
	
	createBpmnDiagram("bpmn-service/createBpmnDiagram"),
	getBpmnDiagram("bpmn-service/getBpmnDiagram"),
	
	sendMail("mail-service/sendMail"),
	
	createField("field-service/createField"),
	createQuestion("field-service/createQuestion"),
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
	
	addCategoryToTemplate("template-service/addCategoryToTemplate"),
	addFieldToTemplate("template-service/addFieldToTemplate"),
	configureTemplatee("template-service/configureTemplate"),
	copyCategoriesToTemplate("template-service/copyCategoriesToTemplate"),
	copyFieldsToTemplate("template-service/copyFieldsToTemplate"),
	createDummyField("template-service/createDummyField"),
	createTemplate("template-service/createTemplate"),
	deleteCategoryFromTemplate("template-service/deleteCategoryFromTemplate"),
	deleteFieldFromTemplate("template-service/deleteFieldFromTemplate"),
	deleteTemplate("template-service/deleteTemplate"),
	getAllTemplates("template-service/getAllTemplates"),
	getTemplateBySearchCriteria("template-service/getTemplateBySearchCriteria"),
	getTemplateCount("template-service/getTemplateCount"),
	getTemplateNotinList("template-service/getTemplateNotinList"),
	manageCategory("template-service/manageCategory"),
	manageFields("template-service/manageFields"),
	updateCategoryToTemplate("template-service/updateCategoryToTemplate"),
	updateFieldsOfTemplateForRule("template-service/updateFieldsOfTemplateForRule"),
	updateFieldToTemplate("template-service/updateFieldToTemplate"),
	updateTemplate("template-service/updateTemplate"),
	
	
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
	
	getAllProjects("project-service/getAllProjects"),
	
	addCategoryToTemplatesToBook("book-service/addCategoryToTemplatesToBook"),
	addFieldToTemplatesToBook("book-service/addFieldToTemplatesToBook"),
	addTemplateToBook("book-service/addTemplateToBook"),
	addUsersToBook("book-service/addUsersToBook"),
	changeCategorySequence("book-service/changeCategorySequence"),
	changeFieldSequence("book-service/changeFieldSequence"),
	changeIds("book-service/changeIds"),
	changeTemplateSequence("book-service/changeTemplateSequence"),
	cloneBook("book-service/cloneBook"),
	cloneBookList("book-service/cloneBookList"),
	configureBook("book-service/configureBook"),
	copyCategoryToTemplateToBook("book-service/copyCategoryToTemplateToBook"),
	copyFieldsToTemplateToBook("book-service/copyFieldsToTemplateToBook"),
	copyRulesToBooks("book-service/copyRulesToBooks"),
	copyTemplateToBook("book- service/copyTemplateToBook"),
	createBook("book-service/createBook"),
	createDummyBook("book-service/createDummyBook"),
	createBookDummyField("book-service/createDummyField"),
	createEstimationBook("book-service/createEstimationBook"),
	createProjectBook("book-service/createProjectBook"),
	deleteBook("book-service/deleteBook"),
	deleteCategoryFromTemplatesToBook("book-service/deleteCategoryFromTemplatesToBook"),
	deleteFieldFromTemplatesToBook("book-service/deleteFieldFromTemplatesToBook"),
	deleteTemplateFromBook("book-service/deleteTemplateFromBook"),
	downloadStaffingPlan("book-service/downloadStaffingPlan"),
	getAllBooks("book-service,getAllBooks"),
	getAllBooksOfProject("book-service,getAllBooksOfProject"),
	getBookById("book-service,getBookById"),
	getBookBySearchCriteria("book-service,getBookBySearchCriteria"),
	getBookCount("book-service,getBookCount"),
	getStaffingPlan("book-service,getStaffingPlan"),
	getTranformationAdvisoryReport("book-service,getTranformationAdvisoryReport"),
	getVersionForEstimation("book-service,getVersionForEstimation"),
	importProjectBook("book-service,importProjectBook"),
	manageCategoriesToTemplateToBook("book-service,manageCategoriesToTemplateToBook"),
	manageTemplates("book-service,manageTemplates"),
	registerBook("book-service,registerBook"),
	updateBook("book-service,updateBook"),
	updateCategoryToTemplatesToBook("book-service,updateCategoryToTemplatesToBook"),
	updateFieldToTemplatesToBook("book-service,updateFieldToTemplatesToBook"),
	updateTemplateToBook("book-service,updateTemplateToBook"),
	
	getAllRules("rule-service,getAllRules");
	
	String resource;	
	
	APIResources(String resource){
		this.resource=resource;
	}
	
	public String getResource() {
		return resource;
	}

}
