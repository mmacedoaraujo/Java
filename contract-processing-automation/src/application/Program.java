package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		Integer accountNumber = input.nextInt();
		input.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(input.nextLine());
		System.out.print("Contract value: ");
		Double totalValue = input.nextDouble();

		Contract contract = new Contract(accountNumber, date, totalValue);

		System.out.print("Enter number of installments: ");
		Integer installmentNumber = input.nextInt();
		input.nextLine();

		ContractService contractService = new ContractService(installmentNumber, new PaypalService());
		
		contractService.processInstallment(contract);
		
		for (Installment y : contract.getInstallment()) {
			System.out.println(y);
		}
	}
}
