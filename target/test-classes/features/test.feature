@DC-Test-Suite
@Test 
Feature: Validating Cic-Service APIs

@getCicCount 
Scenario: Verify API: getCicCount API return Total Cic Count 
	Given "System_Admin" User invoke "getCicCount"
	When User calls "getCicCount" API with "Get" http Request 
	Then Verify cic_Count result is greater than 0  