package model.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import model.entities.Contract;
import model.entities.Installment;

public class ContractProcessing {
	SimpleDateFormat sdf = new SimpleDateFormat();
	private Integer installmentNumber;

	private TaxService taxService;

	public ContractProcessing() {

	}

	public ContractProcessing(Integer installmentNumber, TaxService taxService) {
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

		double installmentValue = 0;
		for (int i = 1; i <= this.installmentNumber; i++) {
			try {
				Calendar cal = Calendar.getInstance();
				Integer installmentDate = Integer.parseInt(sdf.format(contract.getDate()));
				cal.add(installmentDate, i);
				
				installmentValue = taxService.tax(contract.getTotalValue() / 3) * i;
				contract.addInstallment(new Installment(sdf.parse(Integer.toString(installmentDate)), installmentValue));
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			

		}
	}
}
