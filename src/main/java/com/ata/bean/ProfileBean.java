package com.ata.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "PROFILE_BEAN")
@Table(name = "PROFILE_TABLE")
public class ProfileBean {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID" , nullable = false , length = 512)
	private String userID;
	
	@Column(name = "FIRST_NAME" , nullable = false , length = 512 )
	private String firstName;
	
	@Column(name = "LAST_NAME" , nullable = false , length = 512 )
	private String lastName;
	
	@Column(name = "DATE_OF_BIRTH" , nullable = false )
	private Date dateOfBirth;
	
	@Column(name = " GENDER" , nullable = false , length = 512 )
	private String gender;
	
	@Column(name = "STREET" , nullable = false , length = 512 ) 
	private String street;
	
	@Column(name = "LOCATION" , nullable = false , length = 512 )
	private String location;
	
	@Column(name = "CITY" , nullable = false , length = 512 )
	private String city;
	
	@Column(name = " STATE" , nullable = false , length = 512 )
	private String state;
	
	@Column(name = "PINCODE" , nullable = false , length = 512 ) 
	private String pincode;
	
	@Column(name = "MOBILE_NUMBER" , nullable = false , length = 512 )
	private String mobileNo;
	
	@Column(name = "EMAIL_ID" , nullable = false , length = 512 )
	private String emailID;
	
	@Column(name = " PASSWORD" , nullable = false , length = 512 )
	private String password;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ProfileBean [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", street=" + street + ", location="
				+ location + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", mobileNo=" + mobileNo
				+ ", emailID=" + emailID + ", password=" + password + "]";
	}
	
}
