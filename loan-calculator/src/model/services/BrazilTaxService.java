package model.services;

public class BrazilTaxService implements TaxService {

	@Override
	public Double tax(Double amount) {
		return amount * 0.02;
	}

}
