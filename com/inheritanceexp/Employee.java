package com.inheritanceexp;

abstract public class Employee {
	abstract public int getSalary();
private int empno;
private String location;
public final int getEmpno() {
	return empno;
}
public final void setEmpno(int empno) {
	this.empno = empno;
}
public final String getLocation() {
	return location;
}
public final void setLocation(String location) {
	this.location = location;
}
public void work() {
	// TODO Auto-generated method stub
	System.out.println("walking arount");
}

}
