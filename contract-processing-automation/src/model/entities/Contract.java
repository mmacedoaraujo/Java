package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer accountNumber;
	private Date date;
	private Double totalValue;

	List<Installment> installment = new ArrayList<>();

	public Contract() {
		
	}

	public Contract(Integer accountNumber, Date date, Double totalValue) {
		this.accountNumber = accountNumber;
		this.date = date;
		this.totalValue = totalValue;
		
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallment() {
		return installment;
	}

	public void setInstallment(Installment installment) {
		this.installment.add(installment);
	}

	
}
