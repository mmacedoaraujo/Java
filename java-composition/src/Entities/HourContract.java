package Entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePerHour;
	private Integer hours;

	public HourContract() {
		super();
	}

	public HourContract(Date contractDate, Double valuePerHour, Integer hours) {
		this.date = contractDate;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	

	public Date getDate() {
		return date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}
	public double totalValue() {
		return valuePerHour * hours;
	}

}
