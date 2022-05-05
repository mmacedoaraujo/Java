package model.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainExceptions;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	public Reservation() {

	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		Date now = new Date();
		
		if (checkIn.before(now)) {
			throw new DomainExceptions("Please enter a valid date for reservation.");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainExceptions("Please enter a valid date for reservation.");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {

		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

	}

	public void updateDates(Date checkIn, Date checkOut) {

		Date now = new Date();
		if (checkIn.before(now)) {
			throw new DomainExceptions("Reservation date for update must be future dates.");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainExceptions("Checkout date must be after the date of the Check-in.");
		}

		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

}
