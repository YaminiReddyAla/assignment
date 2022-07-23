package accscenario.model.copy;

public class LoginStatus {
	
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
	public LoginStatus() {
		// TODO Auto-generated constructor stub
	}
	public LoginStatus(int statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
	}
	
	
	
	

}
