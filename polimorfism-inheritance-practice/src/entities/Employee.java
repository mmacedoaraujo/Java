package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	protected Integer hours;
	protected Double valuePerHour;

	// Instantiated the list that will contain the employees data
	protected List<Employee> employee = new ArrayList<>();

	public Employee() {

	}

	public Employee(String name, Integer hours, Double valuePerHour) {

		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;

	}

	public String getName() {
		return name;
	}

	public Integer getHours() {
		return hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	// Method for implementing new employees in the list
	public void addEmployee(Employee employee) {
		this.employee.add(employee);
	}

	// Method for removing employees from the list
	public void removeEmployee(Employee employee) {
		this.employee.remove(employee);
	}

	public Double payment() {
		return valuePerHour * hours;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nPAYMENTS:");

		// For each employee in Employee list execute:
		for (Employee c : employee) {

			sb.append("\n" + c.getName() + " - $");
			sb.append(String.format("%.2f", c.payment()));
		}
		return sb.toString();
	}
}
