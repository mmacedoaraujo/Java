package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 1000.0);
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Anna", 1000.0, 0.3);
		acc2.withdraw(200.0);
		System.out.println(String.format("%.2f", acc2.getBalance()));
		
		Account acc3 = new BusinessAccount(1003, "John", 1000.0, 5000.0);
		acc3.withdraw(300.0);
		System.out.println(acc3.getBalance());
	}
}
