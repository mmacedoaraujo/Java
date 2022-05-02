package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(Double healthExpenditures, String name, Double anualIncome) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	@Override
	public Double tax(double amount) {

		Double tax = 0.0;
		if (amount < 20.000) {

			tax = amount * 0.15;

		} else if (amount >= 20.000) {

			tax = amount * 0.25;

		}

		if (healthExpenditures > 0) {

			tax -= healthExpenditures * 0.50;

		}

		return tax;
	}

}
