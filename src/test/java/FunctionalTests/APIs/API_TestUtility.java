package FunctionalTests.APIs;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;


import io.restassured.response.Response;

import org.apache.commons.lang3.StringUtils;

import com.jayway.restassured.response.ValidatableResponse;




public class API_TestUtility extends APIConfigUtility {

	private static Response response;
	private ValidatableResponse json;
	private String baseAPIURL = readFromPropertiesFile.readPropertiesFile("APIBaseUrl");
	private String propertyPath = readFromPropertiesFile.readPropertiesFile("pathToProperty");
	private String calcu_EndPoint = readFromPropertiesFile.readPropertiesFile("calculateEndPoint");
	private String contentType = readFromPropertiesFile.readPropertiesFile("calculateEndPoint");
	
	

	public void postRequestWithPayload(String payload_value) throws IOException {

		String jsonBody = generateStringFromResource(
				System.getProperty("user.dir") + propertyPath + payload_value + "");
		response = given().header("content-type", contentType).header("REQUEST_ID", "testApi").body(jsonBody)
				.when().post(baseAPIURL + calcu_EndPoint);
	
		System.out.println("property Path " + propertyPath);
		System.out.println("calculate EndPoint " + calcu_EndPoint);
		System.out.println("arg1 " + calcu_EndPoint);
		System.out.println("arg2 " + payload_value);

	}	
	
	public void getRequest() throws IOException {
		response = given().header("content-type", contentType).header("REQUEST_ID", "testApi").when().get(baseAPIURL);
//		response = given().when().get(baseAPIURL);

	}
	

//	public void requestAPIWithPayload(String arg1) throws IOException {
//
//		String jsonBody = generateStringFromResource(
//				System.getProperty("user.dir") + propertyPath + cal_EndPoint + "");
//		response = given().header("content-type", "application/json").header("REQUEST_ID", "testApi").body(jsonBody)
//				.when().post(baseAPIURL + arg1);
//		
//		System.out.println(jsonBody);
//	}

	public String generateStringFromResource(String path) throws IOException {

		return new String(Files.readAllBytes(Paths.get(path)));

	}

	public void verifyStatusCode(int statusCode) {
		System.out.println("Response Body is : "  + response.getBody());
		System.out.println("Response Code is : " + response.statusCode());
		response.then().statusCode(statusCode);
//		System.out.println(response.statusCode());
		this.checkMatchingValues(response.statusCode(), statusCode);

	}
	
	private boolean checkMatchingValues(Object actualValue, Object expectedValue) {
        String successMessage = "\t* The Expected and Actual Values match. (PASS)\n";
        String failureMessage = "\t* The Expected and Actual Values do not match! (FAIL)\n";

        boolean doValuesMatch = false;

        System.out.println("\t* Expected Value: " + expectedValue);
        System.out.println("\t* Actual Value: " + actualValue);

        if (actualValue.equals(expectedValue)) {
            System.out.println(successMessage);
            doValuesMatch = true;
        } else {
            System.out.println(failureMessage);
            doValuesMatch = false;
        }
        return doValuesMatch;
    }
	
//	public void response_equals(Map<String,String> responseFields){
////		System.out.println("response: " + );
//		for (Map.Entry<String, String> field : responseFields.entrySet()) {
//			System.out.println("field.getValue : " + field.getKey());
//			if(StringUtils.isNumeric(field.getValue())){
//			//	json.body(field.getKey(), equalTo(Integer.parseInt(field.getValue())));
//			}
//			else{
//			//	json.body(field.getKey(), equalTo(field.getValue()));
//			}
//		}
//	}
		
		
	}
	
//	public void response_contains_in_any_order(Map<String,String> responseFields){
//		for (Map.Entry<String, String> field : responseFields.entrySet()) {
//			if(StringUtils.isNumeric(field.getValue())){
//			//	json.body(field.getKey(), containsInAnyOrder(Integer.parseInt(field.getValue())));
//			}
//			else{
//			//	json.body(field.getKey(), containsInAnyOrder(field.getValue()));
//			}
//		}
//	}
//	
//public void useResponseSpecBuilder() {
//		
//		ResponseSpecBuilder rsBuilder = new ResponseSpecBuilder();
//		
//		rsBuilder.
//			expectStatusCode(200).
//				expectContentType(ContentType.JSON);
//		
//		ResponseSpecification respSpec = rsBuilder.build();
//		
////		given().
////		when().
////			get("http://localhost:9876/us/90210").
//		//then().spec(respSpec).
//			//and().
//			//assertThat().
//			//body("country", equalTo("United States"));
//	}
//
//
//public void useOAuth2Authentication() {
//	
////	given().
////		auth().
////		oauth2("aaaaa").
////	when().
////		get("https://api.sandbox.paypal.com/v1/identity/openidconnect/userinfo/?schema=openid").
////	then().
////		assertThat().
////		body("",hasKey("user_id"));
//}
//}
//
//
