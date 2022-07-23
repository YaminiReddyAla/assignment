package com.oopsconcept.inheritance;

public class TestInheritance {
public static void main(String[] args) {
	Account c=null;
	int x=(int)(Math.random()*10);
	System.out.println("rn" + x);
	if(x<5)
		c=new SavingsAccount();
	else
		c=new CurrentAccount();
	//above what ur seeing substitutability.I dont know
	x=c.minimumBalance();
	System.out.println(x);
}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
    Account account;
    SavingsAccount savingsAccount=new SavingsAccount();
    CurrentAccount currentAccount=new CurrentAccount();
    savingsAccount.setAccountName("abc");//superclass function
    savingsAccount.setRateOfInterest(4);//subclass function
    savingsAccount.setMobileNumber(832);//this is what we call
    //maintanance during inheritance--Advantage 1
	}

}
