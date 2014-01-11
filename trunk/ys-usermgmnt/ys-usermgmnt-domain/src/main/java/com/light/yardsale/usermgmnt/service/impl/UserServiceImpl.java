package com.light.yardsale.usermgmnt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.light.yardsale.usermgmnt.exceptions.ValidationException;
import com.light.yardsale.usermgmnt.repository.UserRepository;
import com.light.yardsale.usermgmnt.services.UserService;
import com.light.yardsale.usermgmnt.transferobjects.UserSO;
import com.light.yardsale.usermgmnt.transferobjects.UserSessionSO;


/**
 * @author kiranlal
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	


	@Override
	public UserSO registerUser(UserSO userSO) throws ValidationException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserSessionSO loginUser(String userID, String password)
			throws ValidationException {
		// TODO Auto-generated method stub
		return null;
	}

}
