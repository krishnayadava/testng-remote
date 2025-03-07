package com.restassuredTests;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import org.testng.annotations.Test;

public class Basic_Validation_XML {
	
	//verifying single content in XML response
	@Test(priority=1)
	public void SingleTest() {
		given()
	
		.when()
		
		      .put("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		
		.then()
		 
		      .body("CUSTOMER.ID", hasItem(containsString("15")))
		      .log().all();	 
	}


//verifying multiple content in XML response
	@Test(priority=2)
	public void MultipleTest() {
		given()
	
		.when()
		
		      .put("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		
		.then()
		 
		      .body("CUSTOMER.ID", equalTo("15"))
		      .body("CUSTOMER.FIRSTNAME", equalTo("Bill"))
		      .body("CUSTOMER.LASTNAME", equalTo("Clancy"))
		      .body("CUSTOMER.STREET", equalTo("319 Upland Pl."))
		      .log().all();
	}
	
	//verifying multiple content in XML response in one go
	@Test(priority=3)
	public void MultipleTestInOneGo() {
		given()
	
		.when()
		
		      .put("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		
		.then()
		 
		      .body("CUSTOMER.text()", equalTo("15 BillClancy319 Upland Pl."))
		      .log().all();
	}
	
	//Find values using xpath in XML respons
		@Test(priority=4)
		public void Xpath() {
			given()
		
			.when()
			
			      .put("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
			
			.then()
			 
			      .body(hasXPath("/CUSTOMER/FIRSTNAME"), containsString("Bill"))
			      .log().all();
		}

}
	

