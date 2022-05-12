package model.services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	SimpleDateFormat sdf = new SimpleDateFormat();
	private Integer installmentNumber;

	private OnlinePaymentService taxService;

	public ContractService() {

	}

	public ContractService(Integer installmentNumber, OnlinePaymentService taxService) {
		this.installmentNumber = installmentNumber;
		this.taxService = taxService;
	}

	public Integer getInstallmentNumber() {
		return installmentNumber;
	}

	public void setInstallmentNumber(Integer installmentNumber) {
		this.installmentNumber = installmentNumber;
	}

	public void processInstallment(Contract contract) {

		for (int i = 1; i <= this.installmentNumber; i++) {

			Double interest = taxService.interest(contract.getTotalValue() / this.installmentNumber, i)
					+ contract.getTotalValue() / this.installmentNumber;
			Double paypalTax = taxService.paymentFee(interest);
			Double installmentValue = interest + paypalTax;
			contract.setInstallment(new Installment(addMonth(contract.getDate(), i), installmentValue));
		}

	}

	public Date addMonth(Date date, Integer n) {
		Calendar myDate = Calendar.getInstance();
		myDate.setTime(date);
		myDate.add(Calendar.MONTH, n);
		return myDate.getTime();
	}

}
