package com.inheritanceexp;

final public class SoftwareEngineer extends Employee {
private int projectId;

public int getProjectId() {
	return projectId;
}

@Override
public void work() {
	// TODO Auto-generated method stub
	System.out.println("writing code");
}

public void setProjectId(int projectId) {
	this.projectId = projectId;
}

@Override
public int getSalary() {
	// TODO Auto-generated method stub
	return 0;
}

}
