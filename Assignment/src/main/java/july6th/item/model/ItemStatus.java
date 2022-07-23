package july6th.item.model;

public class ItemStatus {
	
	private int statusCode;
	private String message;
	private Item item;
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
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
	public ItemStatus(int statusCode, String message, Item item) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.item = item;
	}
	@Override
	public String toString() {
		return "ItemStatus [statusCode=" + statusCode + ", message=" + message + ", item=" + item + "]";
	}
	
	
	
	

}
