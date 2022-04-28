package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= numberProducts; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Commom, used or imported (c/u/i)? ");
			char answer = sc.next().charAt(0);

			while (answer != 'c' && answer != 'u' && answer != 'i') {
				System.out.println("Invalid answer, please try again:");
				System.out.print("Commom, used or imported (c/u/i)?");
				answer = sc.next().charAt(0);
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (answer == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				product.addProduct(new ImportedProduct(name, price, customsFee));
			}
			else if (answer == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.next();
				Date manufactureDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
				product.addProduct(new UsedProduct(name, price, manufactureDate));
			}
			else {
				
				product.addProduct(new Product(name, price));
			}
			
		}
		
		System.out.println(product);
		
		sc.close();
	}

}
