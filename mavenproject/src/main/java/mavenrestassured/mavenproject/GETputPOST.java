package mavenrestassured.mavenproject;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GETputPOST {

	public static void main(String[] args) 
	{
		//given-all input details
		//when-submit the API -resources,http,method
		//then- validate the response
				
		RestAssured.baseURI="https://schema.getpostman.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("").when().post("json/collection/v2.1.0/collection.json")
							.then().log().all().assertThat().statusCode(200);

	}

}
