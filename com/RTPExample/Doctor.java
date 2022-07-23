package com.RTPExample;

public class Doctor {
 private String specialisation;
 private int salary;
public String getSpecialisation() {
	return specialisation;
}
public void setSpecialisation(String specialisation) {
	this.specialisation = specialisation;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void treatment() {
	// TODO Auto-generated method stub
	System.out.println("Treat patients who are not well");
}
}
