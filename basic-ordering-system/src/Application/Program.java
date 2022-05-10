package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.OrderStatus;
import Entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Client data
		System.out.println("ENTER CLIENT DATA: ");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		
		// Order data
		System.out.println();
		System.out.println("ENTER ORDER DATA: ");
		System.out.println("Status: ");
		String orderStatus = sc.nextLine();

		// Instantiating and assigning values
		Order order = new Order(date, OrderStatus.valueOf(orderStatus), new Client(clientName, email, birthDate));

		// Number of items in the order
		System.out.println();
		System.out.print("How many items in this order: ");
		int itemNumber = sc.nextInt();

		// Items insertion loop
		for (int i = 1; i <= itemNumber; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();
			order.addItem(new OrderItem(productQuantity, productPrice, new Product(productName, productPrice)));
			
		}
		
		// Order Summary
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}
}
