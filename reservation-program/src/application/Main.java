package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainExceptions;

public class Main {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<Reservation> reservationList = new ArrayList<>();

		try {
			System.out.print("Room number: ");
			Integer roomNumber = sc.nextInt();
			sc.nextLine();
			System.out.print("Check-in date (dd/mm/yyyy): ");
			Date checkIn = sdf.parse(sc.nextLine());
			System.out.print("Check-out date (dd/mm/yyyy): ");
			Date checkOut = sdf.parse(sc.nextLine());
			reservationList.add(new Reservation(roomNumber, checkIn, checkOut));

			System.out.printf("Reservation: Room %d, check-in: %s, check-out: %s, %d nights \n",
					reservationList.get(0).getRoomNumber(), sdf.format(reservationList.get(0).getCheckIn()),
					sdf.format(reservationList.get(0).getCheckOut()), reservationList.get(0).duration());

			System.out.println("\nEnter data to update the reservation: ");
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkIn = sdf.parse(sc.nextLine());
			System.out.print("Check-out date (dd/mm/yyyy): ");
			checkOut = sdf.parse(sc.nextLine());
			reservationList.get(0).updateDates(checkIn, checkOut);

			System.out.printf("Reservation: Room %d, check-in: %s, check-out: %s, %d nights",
					reservationList.get(0).getRoomNumber(), sdf.format(reservationList.get(0).getCheckIn()),
					sdf.format(reservationList.get(0).getCheckOut()), reservationList.get(0).duration());

			sc.close();

		} catch (ParseException e) {

			System.out.println("Invalid date format.");
		} catch (DomainExceptions e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error." + e.getLocalizedMessage());
		}
	}

}
