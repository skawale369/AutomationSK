package session02;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethod {
	
	
	//https://reqres.in/api/users?page=2
	// print response code, response header, response time
	
	
	//https://reqres.in/api/users/2
		@Test
		void testcase01()
		{
			
			Response res=RestAssured.get("https://reqres.in/api/users/2");
			System.out.println(res.asString());
			System.out.println("status code:" +res.getStatusCode());
			
			
		}

}
