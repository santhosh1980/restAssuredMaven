package restAssuredMavenGI.restAssuredMavenAI;

import java.util.Arrays;

import org.apache.juneau.annotation.Beanc;

public class product {
	
	//POJO: Plain Old Java Object
	
	private String name;
	
	private int price;
	
	private String color;
	
	private String[] sellernames;
	
	
	@Beanc(properties="name, price, color, sellernames")
	public product(String name, int price, String color, String[] sellernames) {
		
		this.name = name;
		this.price = price;
		this.color = color;
		this.sellernames = sellernames;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String[] getSellernames() {
		return sellernames;
	}

	public void setSellernames(String[] sellernames) {
		this.sellernames = sellernames;
	}

	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + ", color=" + color + ", sellernames="
				+ Arrays.toString(sellernames) + "]";
	}
	
	

}
