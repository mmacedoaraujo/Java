package model.services;

public class USATaxServices implements TaxService{

	@Override
	public Double tax(Double amount) {
		if (amount <= 100.0) {
			return amount * 0.1;
		} else {
			return amount * 0.05;
		}
	}
	
	

}
