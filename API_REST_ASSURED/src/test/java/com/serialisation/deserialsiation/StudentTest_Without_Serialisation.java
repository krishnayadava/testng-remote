package com.serialisation.deserialsiation;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import java.util.HashMap;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class StudentTest_Without_Serialisation {
	
	public static HashMap map=new HashMap();
	
	
	//Put request creates new request in student record
	@Test
	public void CreateNewStudent() {
		
		map.put("id", 101);
		map.put("FirstName", "krishna");
		map.put("lastname", "kumar");
		map.put("email", "zxcv@gmail.com");
		map.put("programme" ,"manager");
		
		
		ArrayList<String> courseList= new ArrayList<String>();
		courseList.add("JAVA");
		courseList.add("Selenium");
		map.put("courses" , courseList);
		
		given()
		     .contentType(ContentType.JSON)
		     .body(map)
		
		.when()
		     .post("http://localhost:8080/student/list")
		     
		.then()
		     .statusCode(201)
		     .assertThat().body("msg", equalTo("Student added"));
		
		
		
		
		
		
		
	}

}
