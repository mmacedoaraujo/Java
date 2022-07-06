package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD case", 80.00));
		
		//Interface Implementation method
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		//names.forEach(System.out::println);
		
		//Reference Method Static
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		//names.forEach(System.out::println);
		
		//Reference Method nonStatic
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		//names.forEach(System.out::println);
		
		//Declared Lambda Function
		//Function<Product, String> function = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(function).collect(Collectors.toList());
		//names.forEach(System.out::println);
		
		//Inline Lambda Function
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
	}

}
