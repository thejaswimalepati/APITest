package apidemotestbdd;

import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.runtime.atn.SemanticContext.AND;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class GetRequest {
	@Test
	public void getWeatherDetails() {
		
	
	 given()	
	.when()
		.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=a6453bdcc39f3e18295ebabebb5f3fe9")	
	.then()
	    .assertThat().statusCode(200)
	    .and()
	    .assertThat().body("name", equalTo("London"))
	    .header("Content-Type","application/json; charset=utf-8");
	   
		
		
	}
	

}
