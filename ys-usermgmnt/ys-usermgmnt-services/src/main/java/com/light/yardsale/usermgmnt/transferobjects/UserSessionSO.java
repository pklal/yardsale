/**
 * 
 */
package com.light.yardsale.usermgmnt.transferobjects;

import java.util.Date;

/**
 * @author kiranlal
 *
 */
public class UserSessionSO {

	private String userID;
	private String sessionID;
	private Date loggedInTime;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getSessionID() {
		return sessionID;
	}
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	public Date getLoggedInTime() {
		return loggedInTime;
	}
	public void setLoggedInTime(Date loggedInTime) {
		this.loggedInTime = loggedInTime;
	}
	
	
}
