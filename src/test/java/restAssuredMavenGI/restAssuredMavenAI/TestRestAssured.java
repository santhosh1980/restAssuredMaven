package restAssuredMavenGI.restAssuredMavenAI;

import static org.testng.Assert.assertEquals;

import org.apache.tools.ant.taskdefs.Sync.MyCopy;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestRestAssured {
	
		
	
	@Test (priority=1)
	
	public void verifysinglecontent(){
		
		
		
		RestAssured.given()
		
			.when()
			.get("https://petstore.swagger.io/v2/pet/4")
			
			.then()
			.log().all();
		
	}
	
	

}
