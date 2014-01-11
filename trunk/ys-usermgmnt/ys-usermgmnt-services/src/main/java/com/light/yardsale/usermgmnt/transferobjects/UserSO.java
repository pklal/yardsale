package com.light.yardsale.usermgmnt.transferobjects;
import java.util.Date;

/**
 * 
 */

/**
 * @author kiranlal
 *
 */
public class UserSO {
	
	private Long userID;
	

	private String userCode;
	

	private String userName;
	

	private String emailID;
	

	private String phoneNumber;
	

	private String password;
	

	private String locationCode;
	

	private Date createdDate;


	@Override
	public String toString() {
		return "UserSO [userID=" + userID + ", userCode=" + userCode
				+ ", userName=" + userName + ", emailID=" + emailID
				+ ", phoneNumber=" + phoneNumber + ", password=" + password
				+ ", locationCode=" + locationCode + ", createdDate="
				+ createdDate + "]";
	}


	public Long getUserID() {
		return userID;
	}


	public void setUserID(Long userID) {
		this.userID = userID;
	}


	public String getUserCode() {
		return userCode;
	}


	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmailID() {
		return emailID;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getLocationCode() {
		return locationCode;
	}


	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
