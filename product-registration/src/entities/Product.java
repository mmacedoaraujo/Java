package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Product {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
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
		return name + price;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nPRICE TAGS: \n");
		for (Product c : product) {

			if (c instanceof ImportedProduct) {
				sb.append(c.getName() + " $ "
						+ String.format("%.2f", (c.getPrice() + ((ImportedProduct) c).getCustomsFee()))
						+ " (Customs fee: $" + ((ImportedProduct) c).getCustomsFee() + ")\n");
			} else if (c instanceof UsedProduct) {
				sb.append(c.getName() + " (used) $ " + String.format("%.2f", (c.getPrice())) + " (Manufacture date: "
						+ sdf.format(((UsedProduct) c).getManufactureDate()) + ")\n");
			} else {
				sb.append(c.getName() + " $ " + String.format("%.2f", c.getPrice()) + "\n");
			}
		}
		return sb.toString();
	}
}
