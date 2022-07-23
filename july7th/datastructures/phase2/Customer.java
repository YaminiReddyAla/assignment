package july7th.datastructures.phase2;

public class Customer implements Comparable<Customer>{
	
	private int customerId;
	private int mobileNo;
	private String location;
	private String email;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, int mobileNo, String location, String email) {
		this.customerId = customerId;
		this.mobileNo = mobileNo;
		this.location = location;
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerId != other.customerId)
			return false;
		return true;
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		System.out.println("compareto function of customer");
		return this.customerId - o.customerId;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", mobileNo=" + mobileNo + ", location=" + location + ", email="
				+ email + "]";
	}
	
	

}
