package restAssuredMavenGI.restAssuredMavenAI;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PetstoreTest {
	
	@BeforeTest
	public void setup() {
		
		RestAssured.baseURI="https://petstore.swagger.io";
	}
	
	@Test
	public void PetAPITest() {
		
		
		
		
		PetData petdata = new PetData();
		
		//main
		petdata.setId(20);
		petdata.setName("doggoie");
		petdata.setStatus("available");
		
		//sub1
		PetCategory petcategory = new PetCategory();
		petcategory.setId(100);
		petcategory.setName("mycato");
		petdata.setCategory(petcategory);
		
		//sub2
		PetTags pettag1= new PetTags();
		pettag1.setId(300);
		pettag1.setName("mytago300");
		
		PetTags pettag2= new PetTags();
		pettag1.setId(301);
		pettag1.setName("mytago301");
		
		List<PetTags> lipettags = new ArrayList<PetTags>();
		lipettags.add(pettag1);
		lipettags.add(pettag2);
		
		petdata.setTags(lipettags);
		
		//sub3
		List<String> photo = new ArrayList<String>();
		photo.add("URL1");
		photo.add("URL2");
		
		petdata.setPhotoUrls(photo);
		
		Response resp = RestAssured.given().header("accept","application/json")
				.header("Content-Type","application/json").body(petdata).post("/v2/pet");
		
		System.out.println(resp.asPrettyString());
		

}
}
