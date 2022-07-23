package july18th.devicescenari.model;

public class DeviceStatus {
private int statusCode;
private String message;
private Device device;
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
public Device getDevice() {
	return device;
}
public void setDevice(Device device) {
	this.device = device;
}
public DeviceStatus(int statusCode, String message, Device device) {
	super();
	this.statusCode = statusCode;
	this.message = message;
	this.device = device;
}
public DeviceStatus() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "DeviceStatus [statusCode=" + statusCode + ", message=" + message + ", device=" + device + "]";
}

}
