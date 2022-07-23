package com.inheritanceexp;

final public class Admin extends Employee{
private int shiftTiming;

public int getShiftTiming() {
	return shiftTiming;
}

public void setShiftTiming(int shiftTiming) {
	this.shiftTiming = shiftTiming;
}

@Override
public void work() {
	// TODO Auto-generated method stub
	System.out.println("managing facilities");
}

@Override
public int getSalary() {
	// TODO Auto-generated method stub
	return 0;
}


}
