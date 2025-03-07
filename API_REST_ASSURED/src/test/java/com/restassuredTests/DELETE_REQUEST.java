package com.restassuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;
import junit.framework.Assert;



public class DELETE_REQUEST {
	
	@Test
	public void deleteEmployeeRecord() {
		
		//response will hold response in string format
		Response response=
				
				given()
				
				.when()
				
				      .delete("http://dummy.restapiexample.com/api/v1/delete/11254")
				
				.then()
				 
				      .statusCode(200)
				      .statusLine("HTTP/1.1 200 OK")
				      .log().all()
				      .extract().response();
		
		        String JsonAsString=response.asString();//converted string to json format
		        Assert.assertEquals(JsonAsString.contains("successfully! deleted Records"), true);
		 		
				
				
				
		
	}

}
