package model.entities;

public class LoanTotalCost {

	private Double totalAmount;
	private Long monthDifference;

	public LoanTotalCost() {

	}

	public LoanTotalCost(Double totalAmount, long monthDifference) {
		this.totalAmount = totalAmount;
		this.monthDifference = monthDifference;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getMonthDifference() {
		return monthDifference;
	}

	public void setMonthDifference(Long monthDifference) {
		this.monthDifference = monthDifference;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Payment after " + monthDifference + " months: ");
		sb.append("\n" + String.format("%.2f", getTotalAmount()));
		return sb.toString();
	}
}
