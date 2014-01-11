/**
 * 
 */
package com.light.yardsale.usermgmnt.services;

import com.light.yardsale.usermgmnt.exceptions.ValidationException;
import com.light.yardsale.usermgmnt.transferobjects.UserSO;
import com.light.yardsale.usermgmnt.transferobjects.UserSessionSO;


/**
 * @author kiranlal
 *
 */
public interface UserService {

	public UserSO registerUser(UserSO userSO) throws ValidationException;
	public UserSessionSO loginUser(String userID, String password) throws ValidationException;

}
