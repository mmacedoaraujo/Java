package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Loan;
import model.entities.LoanTotalCost;
import model.services.BrazilTaxService;
import model.services.LoanService;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		LoanService ls = new LoanService(new BrazilTaxService());
		Loan loan = new Loan();
		try {
			System.out.println("Enter the data for the loan: ");
			System.out.print("Enter the amount: ");
			Double amount = input.nextDouble();
			System.out.print("Enter the date for the start (dd/mm/yyyy): ");
			Date startDate = sdf.parse(input.next());
			System.out.print("Enter the date for the finish (dd/mm/yyyy): ");
			Date endDate = sdf.parse(input.next());
			loan = new Loan(amount, startDate, endDate);
			ls.processLoan(loan);
		} catch (ParseException e) {

		}
		
		for (LoanTotalCost x : loan.getLoanTotalCost()) {
			System.out.println(x);
		}
		
		input.close();
	}

}
