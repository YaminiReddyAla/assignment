package june30th.phase1;

//person X
public class Account {
	
	private int accountNumber;
	private int balance;
	private String name;
	private boolean blocked;
	
	
	
	
	//why did i write a constructor.
	//business logic told write it.
	public Account(int accountNumber) {
		 
		this.accountNumber = accountNumber;
	}


	public Account(int accountNumber, int balance, String name, boolean blocked) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.blocked = blocked;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isBlocked() {
		return blocked;
	}


	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}


	public int getAccountNumber() {
		return accountNumber;
	}
	
	
	
	


}
