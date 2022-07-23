package com.oopsconcept.association;

public class Mobilr {
private int imeNumber;
private String make;
public int getImeNumber() {
	return imeNumber;
}
public void setImeNumber(int imeNumber) {
	this.imeNumber = imeNumber;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public Mobilr(int imeNumber, String make) {
	super();
	this.imeNumber = imeNumber;
	this.make = make;
}
public Mobilr() {
	super();
	// TODO Auto-generated constructor stub
}

}
