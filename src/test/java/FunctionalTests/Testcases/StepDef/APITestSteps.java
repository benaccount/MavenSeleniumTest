package FunctionalTests.Testcases.StepDef;


import cucumber.api.java.en.When;

import cucumber.api.java.en.Then;
import FunctionalTests.APIs.API_TestUtility;
import cucumber.api.java.en.But;



//Project =  Spring-cucumber-rest-api
public class APITestSteps {
	private API_TestUtility apiMethods = new API_TestUtility();
	
//	@When("^I hit \"([^\"]*)\" with payload \"([^\"]*)\"$")
//	public void i_hit_with_payload(String end_point, String payload_value) throws Throwable {
//
//		apiMethods.hitURLWithPayload(end_point, payload_value);
//		
//	}
//  
  @When("^User make POST request with payload \"([^\"]*)\"$")
  public void user_make_POST_request_with_payload(String payload_value) throws Throwable {
	  apiMethods.postRequestWithPayload(payload_value);
	  
  }

//  @When("^I hit with payload \"([^\"]*)\"$")
//  public void i_hit_with_payload(String arg1) throws Throwable {
//
//		apiMethods.requestAPIWithPayload(arg1);
//		
//	}

  @Then("the status code is \"([^\\\"]*)\\\"$")
	public void verify_status_code_(int statusCode) {
		apiMethods.verifyStatusCode(statusCode);
	}

//
//  @Given("^User sends the following parameters as a registration object as a POST request$")
//  public void user_sends_the_following_parameters_as_a_post_request(DataTable data) throws Throwable {
//      SingletonRestClient client = SingletonRestClient.getInstance();
//     // Registration model = createRegistrationFromDataTable(data);
//      //String postTargetUri = createTargetUri("api.post.uri");
//      //storeResponse(addHeaders(client.getClient().target(postTargetUri).request(), POST).post(Entity.entity(model, "application/json")));
//  }
//  
//  @Given("^User sends the following parameters as a registration object as a PUT request$")
//  public void user_sends_the_following_parameters_as_a_put_request(DataTable data) throws Throwable {
//      SingletonRestClient client = SingletonRestClient.getInstance();
////      Registration model = createRegistrationFromDataTable(data);
////      String putTargetUri = createTargetUri("api.put.uri");
////      storeResponse(addHeaders(client.getClient().target(putTargetUri).request(), PUT).put(Entity.entity(model, "application/json")));
//  }


  @But("^you are in But annotation$")
  public void but() throws Throwable {
  }

}
