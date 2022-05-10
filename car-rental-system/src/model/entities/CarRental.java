package model.entities;

import java.util.Date;

public class CarRental {

	private Date start;
	private Date finish;
	
	private Vehicle vechicle;
	private Invoice invoice;

	public CarRental() {

	}

	public CarRental(Date start, Date finish, Vehicle vechicle) {
		this.start = start;
		this.finish = finish;
		this.vechicle = vechicle;
		
	}

	public Date getStart() {
		return start;
	}

	public Date getFinish() {
		return finish;
	}

	public Vehicle getVechicle() {
		return vechicle;
	}
	
	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	

}
