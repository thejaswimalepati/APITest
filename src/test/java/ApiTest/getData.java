package ApiTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class getData {
	@Test
	public void testResponseCode(){
		
		Response resp=RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=a6453bdcc39f3e18295ebabebb5f3fe9");
		
		int code=resp.getStatusCode();
		
		System.out.println("Status Code"+code);
		
		Assert.assertEquals(200, code);	
		
	}
	@Test
	public void testBody() {
		
		Response resp=RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=a6453bdcc39f3e18295ebabebb5f3fe9");

		String data=resp.asString();
		
		System.out.println("Data is"+data);
		
		System.out.println("Response time"+resp.getTime());
		
	}

}
