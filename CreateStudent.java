package com.student.CRUD;

import static io.restassured.RestAssured.given;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class CreateStudent {

	@Before
	public void init() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
	}

	@Test
	public void print() {

		ArrayList<String> stud = new ArrayList<String>();
		stud.add("C");
		stud.add("C#");
		StudentDetails sd = new StudentDetails();
		sd.setFirstName("Arun");
		sd.setLastName("varun");
		sd.setEmail("vvdd@gmail.com");
		sd.setProgramme("Chemical Engineering");
		sd.setCourses(stud);

		given().contentType(ContentType.JSON).when().body(sd).post();

	}

}
