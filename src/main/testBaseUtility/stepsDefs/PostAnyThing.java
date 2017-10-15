package stepsDefs;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PostAnyThing {
	private static final Logger logger = LogManager.getLogger(PostAnyThing.class);
	
	
	@Given("^Post all data as I pleased$")
	public void post_all_data_as_I_pleased() throws Throwable {

	    System.out.println("BEN Post postTargetUri" );
	    logger.warn("BEN Post postTargetUri" );
	    
	    System.out.println("BEN client" );
	    logger.warn("BEN Post client" );
	}

  

}
