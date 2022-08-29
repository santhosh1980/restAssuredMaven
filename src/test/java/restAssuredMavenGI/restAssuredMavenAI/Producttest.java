package restAssuredMavenGI.restAssuredMavenAI;

import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;

public class Producttest {

	public static void main(String[] args) throws SerializeException, ParseException {
		// TODO Auto-generated method stub
		
		//serialization
		
		String[] mysellernames = {"ABC Soft", "XYZ Solutions", "PQR Company"};
		
		product myproduct = new product("Applebook", 1230, "Neogrey", mysellernames);
		
		
		//pojo to json
		
		JsonSerializer jsonserializer = JsonSerializer.DEFAULT_READABLE;
				
		String json = jsonserializer.serialize(myproduct);
		
		System.out.println(json);
		
		//pojo to xml
		
		XmlSerializer xmlserializer = XmlSerializer.DEFAULT_NS_SQ;
		
		String xml = xmlserializer.serialize(myproduct);
		
		System.out.println(xml);
		
		//pojo to html
		
		HtmlSerializer htmlserializer = HtmlSerializer.DEFAULT_SQ_READABLE;
		
		String html = htmlserializer.serialize(myproduct);
		
		System.out.println(html);
		
		//deserialization
		
		//json to pojo
		
		JsonParser jsonparser = JsonParser.DEFAULT;
		
		String jsonval = "{\r\n" + 
				"	\"color\": \"Neogrey\",\r\n" + 
				"	\"name\": \"Applebook\",\r\n" + 
				"	\"price\": 1230,\r\n" + 
				"	\"sellernames\": [\r\n" + 
				"		\"ABC Soft\",\r\n" + 
				"		\"XYZ Solutions\",\r\n" + 
				"		\"PQR Company\"\r\n" + 
				"	]\r\n" + 
				"}";
		
		product pro = jsonparser.parse(jsonval, product.class);
		
		System.out.println(pro.getColor());
		//System.out.println(pro.getName());
		//System.out.println(pro.getPrice());
		//System.out.println(pro.getSellernames());
		
		System.out.println(pro);
	}

}
