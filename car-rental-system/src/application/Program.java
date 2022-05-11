package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Invoice;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;
import model.services.USATaxServices;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter rental data: ");
		System.out.print("Car model: ");
		String model = input.nextLine();
		System.out.print("Pickup date (dd/mm/yyyy hh:mm): ");
		Date start = sdf.parse(input.nextLine());
		System.out.print("Return date (dd/mm/yyyy hh:mm): ");
		Date finish = sdf.parse(input.nextLine());

		CarRental carRental = new CarRental(start, finish, new Vehicle(model));

		System.out.print("Enter price per hour: ");
		Double pricePerHour = input.nextDouble();
		System.out.print("Enter price per day: ");
		Double pricePerDay = input.nextDouble();
																		//this BrazilTaxService continues the same, doing upcasting
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new USATaxServices());

		rentalService.processInvoice(carRental);

		System.out.println("INVOICE:");
		System.out.println("Basic payment: $" + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Tax: $" + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Total payment: $" + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

		input.close();
	}

}
