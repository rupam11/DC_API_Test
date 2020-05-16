package cucumber.Options;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import pojo.Activity;

public class extractingJSON {

    public static void main(String[] args) throws JSONException {
        // TODO Auto-generated method stub

    	String jsonStr = "{\"swagger\":\"2.0\",\"info\":{\"description\":\"Api Documentation\",\"version\":\"1.0\",\"title\":\"Api Documentation\",\"termsOfService\":\"urn:tos\",\"contact\":{},\"license\":{\"name\":\"Apache 2.0\",\"url\":\"http://www.apache.org/licenses/LICENSE-2.0\"}},\"host\":\"9.51.193.238:10001\",\"basePath\":\"/\",\"tags\":[{\"name\":\"Activity-controller\",\"description\":\"Activity Controller\"}],\"paths\":{\"/createActivity\":{\"post\":{\"tags\":[\"Activity-controller\"],\"summary\":\"Create Activity\",\"operationId\":\"createActivityUsingPOST\",\"consumes\":[\"application/json\"],\"produces\":[\"*/*\"],\"parameters\":[{\"in\":\"body\",\"name\":\"Activity\",\"description\":\"Activity\",\"required\":true,\"schema\":{\"$ref\":\"#/definitions/Activity\"}},{\"name\":\"user\",\"in\":\"header\",\"description\":\"user\",\"required\":true,\"type\":\"string\"}],\"responses\":{\"200\":{\"description\":\"OK\",\"schema\":{\"$ref\":\"#/definitions/Activity\"}},\"201\":{\"description\":\"Created\"},\"401\":{\"description\":\"Unauthorized\"},\"403\":{\"description\":\"Forbidden\"},\"404\":{\"description\":\"Not Found\"}},\"deprecated\":false}},\"/deleteActivity\":{\"delete\":{\"tags\":[\"Activity-controller\"],\"summary\":\"Delete Activity\",\"operationId\":\"deleteActivityUsingDELETE\",\"produces\":[\"*/*\"],\"parameters\":[{\"name\":\"ActivityId\",\"in\":\"query\",\"description\":\"ActivityId\",\"required\":true,\"type\":\"integer\",\"format\":\"int32\"},{\"name\":\"user\",\"in\":\"header\",\"description\":\"user\",\"required\":true,\"type\":\"string\"}],\"responses\":{\"200\":{\"description\":\"OK\",\"schema\":{\"$ref\":\"#/definitions/Activity\"}},\"204\":{\"description\":\"No Content\"},\"401\":{\"description\":\"Unauthorized\"},\"403\":{\"description\":\"Forbidden\"}},\"deprecated\":false}},\"/getActivityBySearchCriteria\":{\"get\":{\"tags\":[\"Activity-controller\"],\"summary\":\"Get Activity By Search Criterial\",\"operationId\":\"getActivityBySearchCriteriaUsingGET\",\"produces\":[\"*/*\"],\"parameters\":[{\"name\":\"ActivityCode\",\"in\":\"query\",\"description\":\"ActivityCode\",\"required\":false,\"type\":\"string\"},{\"name\":\"ActivityId\",\"in\":\"query\",\"description\":\"ActivityId\",\"required\":false,\"type\":\"integer\",\"format\":\"int32\"},{\"name\":\"ActivityStatus\",\"in\":\"query\",\"description\":\"ActivityStatus\",\"required\":false,\"type\":\"string\"},{\"name\":\"ActivityType\",\"in\":\"query\",\"description\":\"ActivityType\",\"required\":false,\"type\":\"string\"},{\"name\":\"user\",\"in\":\"header\",\"description\":\"user\",\"required\":true,\"type\":\"string\"}],\"responses\":{\"200\":{\"description\":\"OK\",\"schema\":{\"type\":\"array\",\"items\":{\"$ref\":\"#/definitions/Activity\"}}},\"401\":{\"description\":\"Unauthorized\"},\"403\":{\"description\":\"Forbidden\"},\"404\":{\"description\":\"Not Found\"}},\"deprecated\":false}},\"/getActivityCount\":{\"get\":{\"tags\":[\"Activity-controller\"],\"summary\":\"Get Activity Count\",\"operationId\":\"getActivityCountUsingGET\",\"produces\":[\"*/*\"],\"parameters\":[{\"name\":\"user\",\"in\":\"header\",\"description\":\"user\",\"required\":true,\"type\":\"string\"}],\"responses\":{\"200\":{\"description\":\"OK\",\"schema\":{\"type\":\"integer\",\"format\":\"int32\"}},\"401\":{\"description\":\"Unauthorized\"},\"403\":{\"description\":\"Forbidden\"},\"404\":{\"description\":\"Not Found\"}},\"deprecated\":false}},\"/getAllActivitys\":{\"get\":{\"tags\":[\"Activity-controller\"],\"summary\":\"Get All Activity\",\"operationId\":\"getAllActivitysUsingGET\",\"produces\":[\"*/*\"],\"parameters\":[{\"name\":\"status\",\"in\":\"query\",\"description\":\"status\",\"required\":false,\"type\":\"string\"},{\"name\":\"user\",\"in\":\"header\",\"description\":\"user\",\"required\":true,\"type\":\"string\"}],\"responses\":{\"200\":{\"description\":\"OK\",\"schema\":{\"type\":\"array\",\"items\":{\"$ref\":\"#/definitions/Activity\"}}},\"401\":{\"description\":\"Unauthorized\"},\"403\":{\"description\":\"Forbidden\"},\"404\":{\"description\":\"Not Found\"}},\"deprecated\":false}},\"/updateActivity\":{\"put\":{\"tags\":[\"Activity-controller\"],\"summary\":\"Update Activity\",\"operationId\":\"updateActivityUsingPUT\",\"consumes\":[\"application/json\"],\"produces\":[\"*/*\"],\"parameters\":[{\"in\":\"body\",\"name\":\"Activity\",\"description\":\"Activity\",\"required\":true,\"schema\":{\"$ref\":\"#/definitions/Activity\"}},{\"name\":\"ActivityId\",\"in\":\"query\",\"description\":\"ActivityId\",\"required\":true,\"type\":\"integer\",\"format\":\"int32\"},{\"name\":\"user\",\"in\":\"header\",\"description\":\"user\",\"required\":true,\"type\":\"string\"}],\"responses\":{\"200\":{\"description\":\"OK\",\"schema\":{\"$ref\":\"#/definitions/Activity\"}},\"201\":{\"description\":\"Created\"},\"401\":{\"description\":\"Unauthorized\"},\"403\":{\"description\":\"Forbidden\"},\"404\":{\"description\":\"Not Found\"}},\"deprecated\":false}}},\"definitions\":{\"Activity\":{\"type\":\"object\",\"properties\":{\"ActivityCode\":{\"type\":\"string\"},\"ActivityCreatedAt\":{\"type\":\"string\"},\"ActivityCreatedBy\":{\"type\":\"string\"},\"ActivityDisplaySequence\":{\"type\":\"integer\",\"format\":\"int32\"},\"ActivityEffort\":{\"type\":\"string\"},\"ActivityId\":{\"type\":\"integer\",\"format\":\"int32\"},\"ActivityName\":{\"type\":\"string\"},\"ActivityOwner\":{\"type\":\"string\"},\"ActivityPercentCompletion\":{\"type\":\"string\"},\"ActivitySequence\":{\"type\":\"integer\",\"format\":\"int32\"},\"ActivityState\":{\"type\":\"string\"},\"ActivityStatus\":{\"type\":\"string\"},\"ActivityTasks\":{\"type\":\"array\",\"items\":{\"$ref\":\"#/definitions/Task\"}},\"ActivityUpdatedAt\":{\"type\":\"string\"},\"ActivityUpdatedBy\":{\"type\":\"string\"}},\"title\":\"Activity\"},\"Task\":{\"type\":\"object\",\"properties\":{\"percentCompletion\":{\"type\":\"string\"},\"taskApplicable\":{\"type\":\"string\"},\"taskCode\":{\"type\":\"string\"},\"taskComments\":{\"type\":\"string\"},\"taskCreatedAt\":{\"type\":\"string\"},\"taskCreatedBy\":{\"type\":\"string\"},\"taskDescription\":{\"type\":\"string\"},\"taskDisplaySequence\":{\"type\":\"integer\",\"format\":\"int32\"},\"taskEffort\":{\"type\":\"string\"},\"taskId\":{\"type\":\"integer\",\"format\":\"int32\"},\"taskOwner\":{\"type\":\"string\"},\"taskProcessName\":{\"type\":\"string\"},\"taskSequence\":{\"type\":\"integer\",\"format\":\"int32\"},\"taskSquadName\":{\"type\":\"string\"},\"taskSquadType\":{\"type\":\"string\"},\"taskState\":{\"type\":\"string\"},\"taskStatus\":{\"type\":\"string\"},\"taskUpdatedAt\":{\"type\":\"string\"},\"taskUpdatedBy\":{\"type\":\"string\"}},\"title\":\"Task\"}}}";
        JSONObject jsonObj = new JSONObject(jsonStr);
        String path = jsonObj.getJSONObject("paths").toString();
       
        System.out.println(path);
        System.out.println("JSON OBJECT LENGTH ==="+jsonObj.length());
        
        JSONObject jsonObj1 = new JSONObject(path);
        int apiCount=jsonObj1.length();
        System.out.println("Number of API === "+apiCount);
         
        for(int i=0;i<apiCount;i++) {
        	
        }
        
       // JSONObject questionMark = jsonObj1.getJSONObject("question_mark");
        Iterator keys = jsonObj1.keys();
        System.out.println("All APIs Name ::::");
        while(keys.hasNext()) {
            // loop to get the dynamic key
            String currentDynamicKey = (String)keys.next();System.out.print(currentDynamicKey+"\t");
            // get the value of the dynamic key
            JSONObject apiDet = jsonObj1.getJSONObject(currentDynamicKey);
            Iterator keys1 = apiDet.keys();
            String methodName=(String)keys1.next();
            System.out.print(methodName+"\t");
            
            JSONObject methodDet = apiDet.getJSONObject(methodName);
            String apiSum=methodDet.getString("summary");
            System.out.print(apiSum+"\t");
            
            JSONArray paramList=methodDet.getJSONArray("parameters");
            int paramCount=paramList.length();
            for(int k=0;k<paramCount;k++) {
            	System.out.print(paramList.getJSONObject(k).getString("name")+"\t");
            }
                       
            System.out.println();
            //System.out.println(methodBody.getString("summary"));
            
            
//            JSONArray paramList=methodName.getJSONArray("parameter");
//            for(int j=0;j<paramList.length();j++) {
//            	
//            }
//            
//            
//           // System.out.println(currentDynamicValue.);
//            // do something here with the value...
//        }
        }}
        
        
    }


