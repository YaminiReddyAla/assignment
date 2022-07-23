package com.RTPExample;

public class Cardialogist extends Doctor {
private int idNumber;
private int RoomNumber;
public int getIdNumber() {
	return idNumber;
}
public void setIdNumber(int idNumber) {
	this.idNumber = idNumber;
}
public int getRoomNumber() {
	return RoomNumber;
}
public void setRoomNumber(int roomNumber) {
	RoomNumber = roomNumber;
}
public void treatment() {
	// TODO Auto-generated method stub
	System.out.println("Treat patients who are suffering with heart problems");
}
}
