package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String path = "c:\\temp\\names.txt";
		Employee employee = new Employee();

		try (BufferedReader buffReader = new BufferedReader(new FileReader(path))) {

			String name = buffReader.readLine();

			while (name != null) {
				String[] fields = name.split(",");
				employee.setEmployee(new Employee(fields[0], Double.parseDouble(fields[1])));
				name = buffReader.readLine();

			}
			Collections.sort(employee.getEmployee());
			for (Employee n : employee.getEmployee()) {
				System.out.println(n.getName() + ", " + n.getSalary());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		input.close();
	}

}
