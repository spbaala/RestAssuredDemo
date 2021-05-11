package GetDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
//Rest Assured Demo Script 11 May 2021
public class GetTest {
	
	@Test
	public void testCityWeather()
	{
		Response res = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London&appid=ea4282bf39c899a68b22093aaf880f90"); 
		int code = res.getStatusCode();
		
		System.out.println("Status code :"+code);
		Assert.assertEquals(code, 200);
	}

}
