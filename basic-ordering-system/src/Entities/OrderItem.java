package Entities;

public class OrderItem {

	private Integer quantity;
	private Double price;

	private Product product;

	public OrderItem() {

	}

	public OrderItem(Integer productQuantity, Double productPrice, Product product) {
		this.quantity = productQuantity;
		this.price = productPrice;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public Double subTotal() {
		return quantity * price;
	}

	public String toString() {
		return product.getName() + ", $" + String.format("%.2f", getPrice()) + ", Quantity: " + getQuantity() + ", Subtotal: $" + subTotal()
				+ "\n";
	}

}
