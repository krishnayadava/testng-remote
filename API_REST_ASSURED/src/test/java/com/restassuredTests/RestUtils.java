package com.restassuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	
	public static String getFirstName() {
		 String generatedString=RandomStringUtils.randomAlphabetic(5);
		 return generatedString;
	}
	
	public static String getLastName() {
		 String generatedString=RandomStringUtils.randomAlphabetic(4);
		 return generatedString;
	}
	
	public static String getUserName() {
		 String generatedString=RandomStringUtils.randomAlphabetic(3);
		 return generatedString;
	}
	
	public static String emailId() {
		 String generatedString=RandomStringUtils.randomAlphabetic(4);
		 return generatedString;
	}
	
	public static String getPassword() {
		 String generatedString=RandomStringUtils.randomAlphabetic(9);
		 return generatedString;
	}
	
	public static String empName() {
		 String generatedString=RandomStringUtils.randomAlphabetic(9);
		 return generatedString;
	}
	
	public static String empSal() {
		 String generatedString=RandomStringUtils.randomAlphabetic(9);
		 return generatedString;
	}
	
	public static String empAge() {
		 String generatedString=RandomStringUtils.randomAlphabetic(9);
		 return generatedString;
	}
	
	
	
	

}
