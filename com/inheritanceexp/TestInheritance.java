package com.inheritanceexp;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee employee=null;
int x=(int)(Math.random()*10);
if(x<5)
employee=new SoftwareEngineer();
else
employee=new Admin();
employee.work();
employee.setEmpno(33);
//the below if statement is called RTTI(RUNTIME TYPE IDENTIFICATION).
if (employee instanceof SoftwareEngineer) {
	SoftwareEngineer softwareEngineer = (SoftwareEngineer) employee;
	softwareEngineer.setProjectId(44);
}
	}

}
