package com.restassuredTests;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;

public class PUT_RESUEST {
	
	public static HashMap map=new HashMap();
	
	String empName=RestUtils.empName();
	String empSalary=RestUtils.empSal();
	String empAge=RestUtils.empAge();
	int emp_id=22154; // this id data will be updated
	
	@BeforeClass
	public void putData() {
		map.put("name", empName);
		map.put("job", "empSalary");
		map.put("age", "empAge");		
	}
	@Test
	public void putTest() {
		given()
		.contentType("application/json")
		.body(map)
		
		.when()
		
		      .put("http://dummy.restapiexample.com/api/v1/update/"+emp_id)
		
		.then()
		
		    .statusCode(200)
		    .log().all();
		 
	}

}
