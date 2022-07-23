package com.inheritance.inbuiltexample;

public class Resource implements Comparable<Resource> {
private int resourceID;
private String resourceName;
private boolean resourcxeStatus;
public int getResourceID() {
	return resourceID;
}
public void setResourceID(int resourceID) {
	this.resourceID = resourceID;
}
public String getResourceName() {
	return resourceName;
}
public void setResourceName(String resourceName) {
	this.resourceName = resourceName;
}
public boolean isResourcxeStatus() {
	return resourcxeStatus;
}
public void setResourcxeStatus(boolean resourcxeStatus) {
	this.resourcxeStatus = resourcxeStatus;
}
public Resource(int resourceID, String resourceName, boolean resourcxeStatus) {
	super();
	this.resourceID = resourceID;
	this.resourceName = resourceName;
	this.resourcxeStatus = resourcxeStatus;
}
public Resource() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Resource [resourceID=" + resourceID + ", resourceName=" + resourceName + ", resourcxeStatus="
			+ resourcxeStatus + "]";
}
@Override
public int compareTo(Resource argO) {
	// TODO Auto-generated method stub
	System.out.println("compare to function of comparable");
	return this.resourceID-argO.resourceID;
}

}
