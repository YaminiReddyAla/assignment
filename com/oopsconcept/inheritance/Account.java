package com.oopsconcept.inheritance;

public class Account {
    private int accountNumber;
    private String accountName;
    private int mobileNumber;
    
    public int minimumBalance()
    {
		return 1;
    	
    }
    
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
