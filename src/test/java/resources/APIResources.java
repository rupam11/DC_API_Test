package resources;

public enum APIResources {
	
	
	
	createActivity("activity-service/createActivity"),
	deleteActivity("activity-service/deleteActivity"),
	getActivityBySearchCriteria("activity-service/getActivityBySearchCriteria"),
	getActivityCount("activity-service/getActivityCount"),
	getAllActivities("activity-service/getAllActivities"),
	updateActivity("activity-service/updateActivity"),	
	
	createSector("https://9.51.192.136:9080/sector-service/createSector"),
	deleteSector("sector-service/deleteSector"),
	getSectorBySearchCriteria("sector-service/getSectorBySearchCriteria"),
	getSectorCount("sector-service/getSectorCount"),
	getAllSectors("sector-service/getAllSectors"),
	updateSector("sector-service/updateSector"),
	
	createBpmnDiagram("sector-service/createBpmnDiagram"),
	getBpmnDiagram("sector-service/getBpmnDiagram");
	
	private String resource;	
	
	APIResources(String resource){
		this.resource=resource;
	}
	
	public String getResource() {
		return resource;
	}

}
