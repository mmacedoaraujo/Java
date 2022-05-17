package entities;

public class Products implements Comparable<Products> {

	private String name;
	private Double price;

	public Products() {

	}

	public Products(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public String toString() {
		return getName() + ", " + String.format("%.2f", getPrice());
	}
	@Override
	public int compareTo(Products other) {
		return price.compareTo(other.getPrice());
	}
}
