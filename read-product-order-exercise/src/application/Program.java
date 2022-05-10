package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.enitities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Product> products = new ArrayList<>();

		String strPath = "c:\\temp\\order.csv";

		try (BufferedReader buffRead = new BufferedReader(new FileReader(strPath))) {

			String[] line = buffRead.readLine().split(",");

			while (line != null) {
				products.add(new Product(line[0], Double.parseDouble(line[1]), Integer.parseInt(line[2])));
				line = buffRead.readLine().split(",");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			
		}
		
		boolean success = new File("c:\\temp\\out").mkdir();
		try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter("c:\\temp\\out\\summary.csv"))) {
			for (Product product : products) {
				buffWriter.write(product.getProductName() + ", " + product.getTotal(product));
				buffWriter.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		input.close();
	}
}
