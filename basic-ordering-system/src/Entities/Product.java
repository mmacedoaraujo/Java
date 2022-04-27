package Entities;

public class Product {

	private String name;
	private Double price;

	public Product() {

	}

	public Product(String productName, Double productPrice) {
		this.name = productName;
		this.price = productPrice;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}
	

}
