package restAssuredMavenGI.restAssuredMavenAI;

import org.apache.tools.ant.taskdefs.Sync.MyCopy;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestRestAssured {
	
		
	String myurl = "https://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
	@Test
	
	public void TestRestAssuredresult(){
		
		
		RestAssured.baseURI=myurl;
		getResponseBody();
		getResponseStatus();
	}
	
	public static void getResponseBody() {
		
		
		
	}
	
	public static void getResponseStatus() {
		
	}

}
