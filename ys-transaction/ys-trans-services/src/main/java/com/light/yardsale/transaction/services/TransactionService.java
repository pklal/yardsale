/**
 * 
 */
package com.light.yardsale.transaction.services;

import com.light.yardsale.transaction.exceptions.ValidationException;
import com.light.yardsale.transaction.transferobjects.PostRequestSO;

/**
 * @author kiranlal
 *
 */
public interface TransactionService {

	public PostRequestSO submitPost(PostRequestSO postRequestSO) throws ValidationException;

}
