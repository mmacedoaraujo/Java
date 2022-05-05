package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		method2();
		System.out.println("End of program");
	}

	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);

		try {

			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (InputMismatchException e) {

			System.out.println("Input error, use a integer to specify the position");

		} catch (IndexOutOfBoundsException e) {

			System.out.println("The position specified is invalid");
		}
		System.out.println("***METHOD2 END***");
	}
}
