package application;

import java.util.Scanner;

import service.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<>();

		System.out.print("How many values? ");
		Integer numbers = input.nextInt();

		for (int i = 0; i < numbers; i++) {
			Integer newNumber = input.nextInt();
			ps.addValue(newNumber);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);

		PrintService<String> pString = new PrintService<String>();

		System.out.print("How many strings? ");
		Integer strings = input.nextInt();
		input.nextLine();

		for (int i = 0; i < strings; i++) {
			String newString = input.nextLine();
			pString.addValue(newString);
		}
		pString.print();
		System.out.println("First string: " + pString.first());
	}
}
