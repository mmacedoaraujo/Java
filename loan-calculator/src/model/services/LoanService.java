package model.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.entities.Loan;
import model.entities.LoanTotalCost;

public class LoanService {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private TaxService taxService;

	public LoanService() {

	}

	public LoanService(TaxService taxService) {
		this.taxService = taxService;
	}

	public void processLoan(Loan loan) {

		Double loanValue = loan.getAmount();
		Long diff = monthDifference(loan.getEndDate(), loan.getStartDate());
		for (int i = 0; i < diff; i++) {
			Double loanTax = taxService.tax(loanValue);
			loanValue += loanTax;
		}
		loan.addLoanTotalCost(new LoanTotalCost(loanValue, diff));

	}

	public Long monthDifference(Date startDate, Date endDate) {
		Long monthDifference = startDate.getTime() - endDate.getTime();
		return monthDifference = TimeUnit.DAYS.convert(monthDifference, TimeUnit.MILLISECONDS) / 30;
	}
}
