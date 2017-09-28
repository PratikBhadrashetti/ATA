package com.ata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "CREDENTIALS_BEAN")
@Table(name = "CREDENTIALS_TABLE")
public class CredentialsBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID" , nullable = false , length = 512)
    private String userId;
	
	@Column(name = "USER_PASSWORD" , nullable = false , length = 512)
	private String password;
	
	@Column(name = "USER_TYPE" , nullable = false , length = 512)
	private String userType;
	
	@Column(name = "LOGIN_STATUS" , nullable = false)
	private int loginStatus;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}

	@Override
	public String toString() {
		return "CredentialsBean [userId=" + userId + ", password=" + password + ", userType=" + userType
				+ ", loginStatus=" + loginStatus + "]";
	}

}
