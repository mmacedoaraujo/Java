package model.services;

public class InstallmentMonthlyTaxes implements TaxService {

	@Override
	public Double tax(Double amount) {
		double installmentTax = amount * 0.01;
		installmentTax += amount;
		installmentTax += amount * 0.02;
		
		return installmentTax;
	}

}
