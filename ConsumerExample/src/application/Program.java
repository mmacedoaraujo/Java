package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD case", 80.00));

		// Interface implementing
		// list.forEach(new PriceUpdate());

		// Reference Method with static method
		// list.forEach(Product::staticPriceUpdate);

		// Reference Method with nonStatic method
		// list.forEach(Product::nonstaticPriceUpdate);

		// Lambda Expression declared
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
		//list.forEach(cons);

		// Lambda inline method
		// list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

		list.forEach(System.out::println);
	}

}
