package july9th.io;

import java.io.Serializable;

public class Country implements Serializable
{
	
	private int pincode;
	private String areaName;
	private transient String cityName;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Country() {
		// TODO Auto-generated constructor stub
	}
	public Country(int pincode, String areaName, String cityName) {
		this.pincode = pincode;
		this.areaName = areaName;
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Country [pincode=" + pincode + ", areaName=" + areaName + ", cityName=" + cityName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pincode;
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
		Country other = (Country) obj;
		if (pincode != other.pincode)
			return false;
		return true;
	}
	
	

}
