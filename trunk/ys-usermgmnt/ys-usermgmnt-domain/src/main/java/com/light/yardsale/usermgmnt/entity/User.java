/**
 * 
 */
package com.light.yardsale.usermgmnt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
 * @author kiranlal
 *
 */
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="InvTab")
	@TableGenerator(name="InvTab", table="seq_gen",
     pkColumnName="ID_NAME", valueColumnName="ID_VAL",
     pkColumnValue="usr_id")
	@Column(name="usr_id")
	private Long userID;
	
	@Column(name="usr_code")
	private String userCode;
	
	@Column(name="usr_name")
	private String userName;
	
	@Column(name="email_id")
	private String emailID;
	
	@Column(name="phone_num")
	private String phoneNumber;
	
	@Column(name="password")
	private String password;
	
	@Column(name="location_code")
	private String locationCode;
	
	@Column(name="created_date")
	private Date createdDate;

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
