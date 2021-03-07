package ApiTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class PostRequest {
	
	public static HashMap map=new HashMap();

	@BeforeClass
	public void PostData(){
		
		map.put("name", "morpheus");
		map.put("job", "leader");
		/*map.put("UserName", "Thej2u");
		map.put("Password", "Aadhy2a");
		map.put("Email", "tejaswi2123@gmail.com");*/
		
		RestAssured.baseURI="https://reqres.in/api";
		RestAssured.basePath="/users";
		
		}
	
	@Test
	public void testPost() {
		given()
		     .contentType("application/json")
		     .body(map)
		     
		.when()
		    .post()
		 
		.then()
		    .statusCode(201)
		    .and()
		    .body("name",equalTo("morpheus"))
		    .and()
		    .body("job",equalTo("leader"))
		    .log().all();
		System.out.println("Last Step");
		
	}
}
