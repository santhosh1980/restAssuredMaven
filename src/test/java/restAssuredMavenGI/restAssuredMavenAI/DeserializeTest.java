package restAssuredMavenGI.restAssuredMavenAI;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeserializeTest {
	
	@Test
	public void DeserTest(){
		
		
			
			RestAssured.baseURI="https://reqres.in/api/users?page=2";
			
			ListUsersPOJO lipojo = RestAssured.given().when().get().as(ListUsersPOJO.class);
			
					
			//System.out.println(lipojo.toString());
			
			System.out.println("List"+lipojo.getData());
			
			List<DataPOJO> list = lipojo.getData();
			
			for(int i=0;i<list.size();i++) {
				System.out.println("This is my"+i+"element:"+list.get(i));
			}
			
			
	}

}
