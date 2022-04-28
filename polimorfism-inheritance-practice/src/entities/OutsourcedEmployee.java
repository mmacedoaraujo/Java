package entities;

public final class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsourcedEmployee() {

	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	// Method with different rules for the calculation of the additional charge
	@Override
	public Double payment() {
		return (valuePerHour * hours) + 1.1 * additionalCharge;
	}
}
