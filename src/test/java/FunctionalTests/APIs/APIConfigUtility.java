package FunctionalTests.APIs;






import com.gts.base.MyPropertiesReaderUtility;

import gherkin.formatter.model.Scenario;

public class APIConfigUtility {
	public static Scenario scenario;
	public String sessionId;

	// public static String exeEnvironment = System.getProperty("environment");
	public static String exeEnvironment = "uat";
	public String exeBrowserName = System.getProperty("browserName");
	public String exePlatfom = System.getProperty("platform");
	public static MyPropertiesReaderUtility readFromPropertiesFile = new MyPropertiesReaderUtility(getExeEnvironment());


	public static Scenario getScenario() {
		return scenario;
	}

	public static String getExeEnvironment() {
		return exeEnvironment;
	}


	public APIConfigUtility() {
		// Empty constructor
	}

	public void prepare(Scenario scenario) throws Exception {


	}


	public void cleanUp(Scenario scenario) throws InterruptedException {
	}
}
