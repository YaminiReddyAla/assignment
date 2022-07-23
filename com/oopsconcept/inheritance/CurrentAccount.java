package com.oopsconcept.inheritance;

public class CurrentAccount extends Account {

	private String typeOfFirm;

	public String getTypeOfFirm() {
		return typeOfFirm;
	}

	public void setTypeOfFirm(String typeOfFirm) {
		this.typeOfFirm = typeOfFirm;
	}
	public int minimumBalance() {
		// TODO Auto-generated method stub
		return 10000;
	}

}
