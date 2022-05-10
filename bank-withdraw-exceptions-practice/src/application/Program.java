package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account account = new Account(number, holder, balance, withdrawLimit);

			System.out.print("\nEnter the amout for withdraw: ");
			Double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.printf("New balance: %.2f%n", account.getBalance());

		} catch (DomainExceptions e) {
			System.out.println(e.getMessage());
		}catch (RuntimeException e) {
			System.out.println("Unexpected error!");
		}

		sc.close();
	}

}
