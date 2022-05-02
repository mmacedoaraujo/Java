package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxesList = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int numberOfTaxPayers = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= numberOfTaxPayers; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char response = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();

			if (response == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				taxesList.add(new Individual(healthExpenditures, name, anualIncome));
			} else if (response == 'c') {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				sc.nextLine();
				taxesList.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0;

		for (TaxPayer taxPayers : taxesList) {

			System.out.printf("%s: $ %.2f%n", taxPayers.getName(), taxPayers.tax(taxPayers.getAnualIncome()));
			sum += taxPayers.tax(taxPayers.getAnualIncome());
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		sc.close();
	}

}
