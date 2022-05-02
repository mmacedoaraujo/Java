package entities;

public final class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	@Override
	public Double tax(double amount) {

		Double tax = 0.0;
		if (numberOfEmployees < 10) {
			tax = amount * 0.16;
		} else if (numberOfEmployees >= 10) {
			tax = amount * 0.14;
		}
		return tax;
	}

}
