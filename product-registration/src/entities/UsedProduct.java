package entities;

import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactureDate;

	// Default constructor
	public UsedProduct() {

	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public String priceTag() {
		return name + "(used) $ " + price + " (Manufacture Date: " + sdf.format(getManufactureDate()) + ")\n";
	}
}
