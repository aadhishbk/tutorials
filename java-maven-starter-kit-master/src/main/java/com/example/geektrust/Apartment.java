package com.example.geektrust;

public class Apartment {

	private int occupant;
	private int guest;
	
	public int getOccupant() {
		return occupant;
	}
	public void setOccupant(int occupant) {
		this.occupant = occupant;
	}
	public int getGuest() {
		return guest;
	}
	public void setGuest(int guest) {
		this.guest = guest;
	}
	public void addGuest(int guest) {
		this.guest += guest;
	}
	
}
