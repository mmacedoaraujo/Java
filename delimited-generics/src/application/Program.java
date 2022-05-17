package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Products;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		String path = "c:\\temp\\products.csv";
		List<Products> productList = new ArrayList<>();

		try (BufferedReader buffRead = new BufferedReader(new FileReader(path))) {

			String lines = buffRead.readLine();

			while (lines != null) {
				String[] fields = lines.split(",");
				productList.add(new Products(fields[0], Double.parseDouble(fields[1])));
				lines = buffRead.readLine();
			}
			
			Products x = CalculationService.max(productList);
			System.out.println("Most expensive: " + x);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
