package july1st.accscenario.model;

//bosses of the project.
public class Account {
	
	private int accountNo;
	private String accountHolderName;
	private int  balance;
	private boolean blocked;
	private int pin;
	private String email;
	
	
	
	
	public Account(int accountNo, String accountHolderName, int balance, boolean blocked, int pin, String email) {
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.blocked = blocked;
		this.pin = pin;
		this.email = email;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public Account(int accountNo) {
		super();
		this.accountNo = accountNo;
	}


	public  Account(int accountNo, String accountHolderName, int balance, boolean blocked) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.blocked = blocked;
	}


	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public boolean isBlocked() {
		return blocked;
	}


	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	
	
	

}
