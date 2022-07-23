package com.RTPExample;

public class Neurologist extends Doctor {
private String location;
private int fees;
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
public void treatment() {
	// TODO Auto-generated method stub
	System.out.println("Treat patients who are suffering with servous system");
}}
