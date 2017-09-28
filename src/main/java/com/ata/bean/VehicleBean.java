package com.ata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

@Entity(name = "VEHICLE_BEAN")
@Table(name = "VEHICLE_TABLE")
public class VehicleBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VEHICLE_ID" , nullable = false , length = 512)
	private String vehicleID;
	
	@Column(name = "VEHICLE_NAME" , nullable = false , length = 512 )
	private String name;
	
	@Column(name = "VEHICLE_TYPE" , nullable = false , length = 512 )
	private String type;
	
	@Column(name = "REGISTERATION_NUMBER" , nullable = false , length = 512 )
	private String registrationNumber;
	
	@Column(name = " SEATING_CAPACITY" , nullable = false , length = 512 )
	private int seatingCapacity;
	
	@Column(name = "FARE_PER_KM" , nullable = false , length = 512 ) 
	private double farePerKM;
	
	
	public String getVehicleID() {
		return vehicleID;
	}
	
	
	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getType() {
		return type;
	}
	
	
	public void setType(String type) {
		this.type = type;
	}
	
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	
	
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	
	
	public double getFarePerKM() {
		return farePerKM;
	}
	
	
	public void setFarePerKM(double farePerKM) {
		this.farePerKM = farePerKM;
	}


	@Override
	public String toString() {
		return "VehicleBean [vehicleID=" + vehicleID + ", name=" + name + ", type=" + type + ", registrationNumber="
				+ registrationNumber + ", seatingCapacity=" + seatingCapacity + ", farePerKM=" + farePerKM + "]";
	}
	
}
