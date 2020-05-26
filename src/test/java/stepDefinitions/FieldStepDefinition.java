package stepDefinitions;

import entity.Field;
import io.cucumber.java.en.Given;
import testBase.Utils;

public class FieldStepDefinition extends Utils{
	
	CommonStepDefinition cmnStepDef;
	static Field reqField,respField;
	static int field_count;
	Field[] respAllFields;	
	
	@Given("{string}  User invoke {string} with Parameter: {string}")
	public void user_invoke_with_Parameter(String userRole, String apiNm, String param) {
		if (param.equalsIgnoreCase("fieldCategory"))
			reqSpec.queryParam(param, respField.getFieldCategory());
		if (param.equalsIgnoreCase("fieldId"))
			reqSpec.queryParam(param, respField.getFieldId());
		else if (param.equalsIgnoreCase("fieldIndustry"))
			reqSpec.queryParam(param, respField.getFieldIndustry());
		else if (param.equalsIgnoreCase("fieldName"))
			reqSpec.queryParam(param, respField.getFieldName());
		else if (param.equalsIgnoreCase("fieldSector"))
			reqSpec.queryParam(param, respField.getFieldSector());	  
		else if (param.equalsIgnoreCase("fieldTemplateName"))
			reqSpec.queryParam(param, respField.getFieldTemplateName());
		else if (param.equalsIgnoreCase("fieldVersion"))
			reqSpec.queryParam(param, respField.getFieldVersion());		
	}

}
