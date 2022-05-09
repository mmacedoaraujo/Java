package model.entities;

import model.exceptions.DomainExceptions;

public class Account {

	private Integer accountNumber;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {

	}

	public Account(Integer accountNumber, String holder, Double balance, Double withdrawLimit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(Double amount) {
		this.balance += amount;
	}

	public void withdraw(Double amount) {
		if (amount > this.withdrawLimit) {
			throw new DomainExceptions("Withdraw error: The amount exceeds withdraw limit.");
		}
		if (amount > this.balance) {
			throw new DomainExceptions("Withdraw error: Not enough balance in your account.");
		}

		this.balance -= amount;
	}
}
