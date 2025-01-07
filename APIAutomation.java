package apiAutomation;

import org.junit.Test;

public class APIAutomation {
	
	@Test
	public void getRequest{
		
		given().
		when().
		get("api.coindesk.com/v1/bpi/currentprice.json")
		.then()
		.statusCode(200);
		
	}

}
