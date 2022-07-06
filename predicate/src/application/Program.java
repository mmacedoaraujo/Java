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

		// interface implementation example
		// list.removeIf(new ProductPredicate());

		// static reference method
		// list.removeIf(Product::staticProductPredicate);

		// non static reference method
		// list.removeIf(Product::nonStaticProductPredicate);
		
		// lambda declarated expression
		//Predicate<Product> pred = p -> p.getPrice() >= 100;
		//list.removeIf(pred);
		
		// lambda expression inline
		list.removeIf(p -> p.getPrice() >= 100);
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
