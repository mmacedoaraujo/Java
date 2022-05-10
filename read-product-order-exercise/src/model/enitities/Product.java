package model.enitities;

public class Product {

	private String productName;
	private Double price;
	private Integer quantity;

	public Product() {

	}

	public Product(String productName, Double price, Integer quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getTotal(Product product) {
		return quantity * price;
	}
}
