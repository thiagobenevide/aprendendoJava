package model;

import java.util.Date;

public class Reservation {
	private int roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation(int roomNumber, Date checkIn, Date checkOut) {
		super();
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Reservation: Room of number "+getRoomNumber()+" date check-in "+getCheckIn()+" date check-out "+ getCheckOut();
	}
	
	
	
}
