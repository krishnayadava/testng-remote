package com.restassuredTests;

import org.testng.annotations.Test;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GET_REQUEST {
	
	@Test
	public void getWheatherDetails() {
		
		given()
		
		.when()
		
		      .get("http://www.restapi.demoqa.com/utilities/weatherfull/city/Hyderabad")
		      
		.then()
		      
		       //Validation 
		      .statusCode(200)
		      .statusLine("HTTP/1.1 200 OK")
              .assertThat().body("City", equalTo("Hyderabad"))
              .header("content-type" , "application/json");
	}

}
