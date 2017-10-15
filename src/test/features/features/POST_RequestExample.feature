Feature: POST API with rest assured 



@api @SmokeTests 
Scenario Outline: 
   When User make POST request with payload "<Payload file>"
	 Then the status code is "<StatusCode>" 
	 
	
	Examples: 
		| Payload file 			| StatusCode |
		| calcJsonBody.json		| 400		 |
		| calcJsonBody2.json		| 400		 |