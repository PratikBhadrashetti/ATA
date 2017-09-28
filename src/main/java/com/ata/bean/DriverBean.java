package com.ata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name  = "DRIVER_BEAN")
@Table(name = "DRIVER_TABLE")
public class DriverBean {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DRIVER_ID" , nullable = false , length = 512)
	private String driverID;
	
	@Column(name = "DRIVER_NAME" , nullable = false , length = 512 )
	private String name;
	
	@Column(name = "DRIVER_STREET" , nullable = false , length = 512 )
	private String street;
	
	@Column(name = "DRIVER_LOCATION" , nullable = false , length = 512 )
	private String location;
	
	@Column(name = " DRIVER_CITY" , nullable = false , length = 512 )
	private String city;
	
	@Column(name = "DRIVER_STATE" , nullable = false , length = 512 ) 
	private String state;
	
	@Column(name = "DRIVER_PINCODE" , nullable = false , length = 512 )
	private String pincode;
	
	@Column(name = "DRIVER_MOBILE_NUMBER" , nullable = false , length = 512 )
	private String mobileNo;
	
	@Column(name = " DRIVER_LICENSE_NUMBER" , nullable = false , length = 512 )
	private String licenseNumber;

	public String getDriverID() {
		return driverID;
	}

	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	@Override
	public String toString() {
		return "DriverBean [driverID=" + driverID + ", name=" + name + ", street=" + street + ", location=" + location
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", mobileNo=" + mobileNo
				+ ", licenseNumber=" + licenseNumber + "]";
	}
	
}
