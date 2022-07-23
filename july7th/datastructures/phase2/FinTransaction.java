package july7th.datastructures.phase2;

public class FinTransaction {
	
	private int accountNumber;
	private int amount;
	private int locationId;
	
	public FinTransaction(int accountNumber, int amount, int locationId) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.locationId = locationId;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public int getAmount() {
		return amount;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FinTransaction other = (FinTransaction) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}


	public int getLocationId() {
		return locationId;
	}
	
	
	

}
