package com.ashokit.util;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String doorNo;
	
	private String streetName;
	
	private String cityName;

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", cityName=" + cityName + "]";
	}
	

	
	

}
