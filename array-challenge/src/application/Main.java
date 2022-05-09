package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter how many grades you want to evaluate: ");
		int numberGrades = sc.nextInt();
		sc.nextLine();
		double sum = 0;

		Double[] gradesArray = new Double[numberGrades];

		for (int i = 0; i < gradesArray.length; i++) {

			System.out.print("Please enter the grade #" + (i + 1) + ": ");
			gradesArray[i] = sc.nextDouble();

		}

		for (Double grades : gradesArray) {
			sum += grades;
		}

		System.out.printf("%nThe average is: %.1f", sum / gradesArray.length);
		
		sc.close();
	}
}
