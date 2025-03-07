package com.restassuredTests;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Basic_Validation_JSON {
	
	//validation of status code and log response
	@Test(priority=1)
	public void statusCode() {
		
		when()
		         .get("https://jsonplaceholder.typicode.com/posts/2")
		
		.then()
		         .statusCode(200)
		         .log().all();
	}
	
	//validating single content from response body
	@Test(priority=2)
	public void SingleContent() {
		
		when()
		         .get("http://services.groupkt.com/country/get/iso2code/IN")
		
		.then()
		         .statusCode(200)
		         .body("RestResponse.result.name", equalTo("India"));
	}
	
	//validating mulitple content from response body
		@Test(priority=2)
		public void MultipleContent() {
			
			when()
			         .get("http://services.groupkt.com/country/get/all")
			
			.then()
			         .statusCode(200)
			         .body("RestResponse.result.name", hasItems("India" , "Australia", "United States of America"));
		}
	
	//Sending parameter and header along with the request
		@Test(priority=3)
		public void Param_And_heade() {
			given()
			         .param("myname", "krishna")
			         .header("myname", "tommy")
			
			.when()
			         .get("http://services.groupkt.com/country/get/iso2code/IN")
			
			.then()
			         .statusCode(200)
			        .log().all();
		}
	
	

	
}
