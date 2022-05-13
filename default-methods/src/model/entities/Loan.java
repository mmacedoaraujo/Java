package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Loan {

	private Double amount;
	private Date startDate;
	private Date endDate;

	List<LoanTotalCost> loanTotalCost = new ArrayList<>();

	public Loan() {

	}

	public Loan(Double amount, Date startDate, Date endDate) {
		this.amount = amount;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<LoanTotalCost> getLoanTotalCost() {
		return loanTotalCost;
	}

	public void addLoanTotalCost(LoanTotalCost loanTotalCost) {
		this.loanTotalCost.add(loanTotalCost);
	}

}
