/**
 * 
 */
package com.light.yardsale.transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.light.yardsale.transaction.exceptions.ValidationException;
import com.light.yardsale.transaction.services.TransactionService;
import com.light.yardsale.transaction.transferobjects.PostRequestSO;

/**
 * @author kiranlal
 *
 */
@Component
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	
	/**
	 * 
	 */
	public TransactionServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public PostRequestSO submitPost(PostRequestSO postRequestSO)
			throws ValidationException {
		// TODO Auto-generated method stub
		return null;
	}

}
