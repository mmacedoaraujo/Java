package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD case", 80.00));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
