package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = input.nextLine();
		System.out.print("Enter salary: ");
		double salary = Double.valueOf(input.nextLine());

		List<Employee> empList = new ArrayList<>();

		try (BufferedReader buffRead = new BufferedReader(new FileReader(path))) {
			String line = buffRead.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				empList.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = buffRead.readLine();
			}
			Comparator<String> comp = (e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase());

			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ": ");
			List<String> emails = empList.stream().filter(p -> p.getSalary() > 2000.00).map(p -> p.getEmail())
					.sorted(comp).collect(Collectors.toList());
			emails.forEach(System.out::println);

			Double salarySum = empList.stream().filter(p -> p.getName().charAt(0) == 'M').map(p -> p.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			System.out
					.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", salarySum));
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
