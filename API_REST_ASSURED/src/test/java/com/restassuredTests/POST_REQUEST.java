package com.restassuredTests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
public class POST_REQUEST {
	
	
		
		public static HashMap map= new HashMap();
		
		@BeforeClass
		public void postdata() throws UnknownHostException, IOException {
			
			map.put("FirstName", RestUtils.getFirstName());
			map.put("LastName", RestUtils.getLastName());
			map.put("UserName", RestUtils.getUserName());
			map.put("Password", RestUtils.getPassword());
			map.put("Email", RestUtils.emailId());
			
			//RestAssured.baseURI="https://reqres.in";  issue hai is case me
		    //RestAssured.basePath="api/users/2";
		  
		}
		
		@Test
		public void testData() {
			given()
			    .contentType("application/json")
			    .body(map)
			
			.when()
			    .post("https://reqres.in/api/users/2")
			    
			.then()
			    .statusCode(201)
			    .body("SuccessCode", equalTo("OPERATION_SUCCESS"))
			     .body("Message", equalTo("Operation completed successfully")); 
	}
}
