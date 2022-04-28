package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	protected Integer hours;
	protected Double valuePerHour;

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

	public void addEmployee(Employee employee) {
		this.employee.add(employee);
	}

	public void removeEmployee(Employee employee) {
		this.employee.remove(employee);
	}

	public Double payment() {
		return valuePerHour * hours;
	}
	 public String toString() {
		 StringBuilder sb = new StringBuilder();
		 sb.append("\nPAYMENTS:");
		 for (Employee c : employee) {
			 
			 sb.append("\n" + c.getName() + " - $");
			 sb.append(String.format("%.2f", c.payment()));
		 }
		 return sb.toString();
	 }
}
