package resources;

public class FileReaderManager {
	 
	 private static FileReaderManager fileReaderManager = new FileReaderManager();
	 //private static ConfigFileReader configFileReader;
	 private static JsonDataReader jsonDataReader;
	 private FileReaderManager() {
	 }
	 
	 public static FileReaderManager getInstance( ) {
	       return fileReaderManager;
	 }
	 

	 public JsonDataReader getJsonReader(){
	 return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
	 }
//	 
//	 public ConfigFileReader getConfigReader() {
//	 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
//	 }
	}