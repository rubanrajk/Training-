package com.ins;

public class Hotels {
	
	private int roomNo;
	private double roomPrice;
	private String roomAddress;
	public Hotels() {
		super();
	
	}
	public Hotels(int roomNo, double roomPrice, String roomAddress) {
		super();
		this.roomNo = roomNo;
		this.roomPrice = roomPrice;
		this.roomAddress = roomAddress;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public double getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}
	public String getRoomAddress() {
		return roomAddress;
	}
	public void setRoomAddress(String roomAddress) {
		this.roomAddress = roomAddress;
	}
	

}
