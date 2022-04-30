package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Product {

	protected static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	protected String name;
	protected Double price;
	private List<Product> product = new ArrayList<>();

	// Default constructor
	public Product() {

	}

	// Custom constructor
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public void addProduct(Product product) {
		this.product.add(product);
	}

	public void removeProduct(Product product) {
		this.product.add(product);
	}

	// Method for price tag
	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nPRICE TAGS:");
		for (Product c : product) {

			sb.append("\n" + c.priceTag());
		}
		return sb.toString();
	}
}
