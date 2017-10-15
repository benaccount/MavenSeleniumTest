package com.utility.test;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;






public class PostRequestSteps {
	
	private static final Logger logger = LogManager.getLogger(PostRequestSteps.class);
//	final Logger logger = LoggerFactory.getLogger(ImdbSteps.class);
//	private static Logger _logger;
//	
//	 //Singleton Logger
//    public static Logger log()
//    {
//    	if(_logger == null)
//    		_logger = LogManager.getLogger();
//    	return _logger;
//    }

	
	
	private String imdb_url;
	private JSONObject json_response;

	@Given("^I query movie by \"(.*)?\"$")
	public void I_query_movie_by_title(String key) throws UnsupportedEncodingException {
		imdb_url = "http://imdbapi.org/?title=" + URLEncoder.encode(key, "UTF-8") + "&type=json";
		logger.info("http query = " + imdb_url);
	}

	@When("^I make the rest call$")
	public void I_make_the_rest_call() throws IOException, JSONException {
		json_response = CommonJsonReader_Utility.readJsonFromUrl(imdb_url);
		//logger.info("Response = " + json_response.toString());
	}

	@Then("^response should contain:$")
	public void response_should_contain_JSON(String expected_json_str) throws JSONException {
		logger.info("Comparing reponse with" + expected_json_str);
		JSONObject expected_json = new JSONObject(expected_json_str);
		JSONAssert.assertEquals(expected_json, json_response, JSONCompareMode.LENIENT);
	}
	
	@Then("^response should contain \"(.+)\"")
	public void response_should_contain(String expecgted_json_str) throws JSONException {
		response_should_contain_JSON(expecgted_json_str);
	}
}
