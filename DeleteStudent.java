package com.student.CRUD;

import static io.restassured.RestAssured.given;
import org.junit.Before;
import org.junit.Test;
import io.restassured.RestAssured;

public class DeleteStudent {

	@Before
	public void init() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
	}

	@Test
	public void print() {

		given().when().delete("/101");

	}

}
