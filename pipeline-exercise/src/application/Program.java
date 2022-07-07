package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner input = null;
		String path = "c:\\temp\\in.csv";
		List<Product> list = new ArrayList<>();

		try (BufferedReader buffRead = new BufferedReader(new FileReader(path))) {

			String line = buffRead.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = buffRead.readLine();
			}
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y / list.size());
			System.out.println("Average price: " + String.format("%.2f", avg));

			List<String> names = list.stream().filter(p -> p.getPrice() < avg).map(p -> p.getName())
					.sorted(comp.reversed()).collect(Collectors.toList());
			names.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
