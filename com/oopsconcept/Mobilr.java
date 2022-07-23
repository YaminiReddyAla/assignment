package com.oopsconcept;

public class Mobilr {
private int imeNumber;
private String make;
private Sim sim;
private Batery b;
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
public Mobilr(Sim s) {
	// TODO Auto-generated constructor stub
	b=new Batery(5000);
	this.sim=s;
}
public void makeCall() {
	// TODO Auto-generated method stub
	System.out.println(sim.getSimno()+"maqking calls"+b.getMah());

}
public void sendSms() {
	// TODO Auto-generated method stub
	System.out.println(sim.getSimno()+"sending sms"+b.getMah());
	
}

}
