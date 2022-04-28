package entities;

public class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String account, Double balance, Double interestRate) {
		super(number, account, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
}
