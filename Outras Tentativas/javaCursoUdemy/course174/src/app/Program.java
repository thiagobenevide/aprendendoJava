package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

import model.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		
		if(!checkOut.after(checkIn)) {
			JOptionPane.showMessageDialog(null, "Error in reservation: Check-out date must be after check-in date!");
		}else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			JOptionPane.showMessageDialog(null, reservation.toString());

			
			Date now = new Date();
			
			System.out.print("Room number: ");
			int number2 = sc.nextInt();
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn2 = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut2 = sdf.parse(sc.next());

			if(checkIn2.before(now)||checkOut2.before(now)) {
				JOptionPane.showMessageDialog(null, "Error in reservation: Reservation dates for update must be future");
			}else if(!checkOut2.after(checkIn)) {
				JOptionPane.showMessageDialog(null, "Error in reservation: Check-out date must be after check-in date!");
			}
			
			
		}
		
		
		sc.close();
	}

}
