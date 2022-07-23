package july6th.item.model;

public class ItemStatus {
	
	private int statusCode;
	private String message;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ItemStatus() {
		// TODO Auto-generated constructor stub
	}
	public ItemStatus(int statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
	}
	
	
	
	

}
