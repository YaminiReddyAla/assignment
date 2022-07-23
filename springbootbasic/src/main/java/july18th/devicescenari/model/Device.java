package july18th.devicescenari.model;

public class Device {
private int deviceId;
private String  deviceName;
private int  deviceStatus;
private String deviceManufacturer;
public int getDeviceId() {
	return deviceId;
}
public void setDeviceId(int deviceId) {
	this.deviceId = deviceId;
}
public String getDeviceName() {
	return deviceName;
}
public void setDeviceName(String deviceName) {
	this.deviceName = deviceName;
}
public int getDeviceStatus() {
	return deviceStatus;
}
public void setDeviceStatus(int deviceStatus) {
	this.deviceStatus = deviceStatus;
}
public String getDeviceManufacturer() {
	return deviceManufacturer;
}
public void setDeviceManufacturer(String deviceManufacturer) {
	this.deviceManufacturer = deviceManufacturer;
}
public Device() {
	super();
	// TODO Auto-generated constructor stub
}
public Device(int deviceId, String deviceName, int deviceStatus, String deviceManufacturer) {
	super();
	this.deviceId = deviceId;
	this.deviceName = deviceName;
	this.deviceStatus = deviceStatus;
	this.deviceManufacturer = deviceManufacturer;
}

}
