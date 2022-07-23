package com.exceptionHandingAssignment;

import java.util.Scanner;

class Employee
{

private int Empid;
private String EmpName;
private int deptId;
public int getEmpid() {
	return Empid;
}
public void setEmpid(int empid) {
	Empid = empid;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public Employee(int empid, String empName, int deptId) {
	super();
	Empid = empid;
	EmpName = empName;
	this.deptId = deptId;
}
public Employee() {
	super();
}
   

}