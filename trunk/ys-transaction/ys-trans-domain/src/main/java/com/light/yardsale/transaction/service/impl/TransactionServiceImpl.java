/**
 * 
 */
package com.light.yardsale.transaction.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.light.yardsale.transaction.entity.PostTransaction;
import com.light.yardsale.transaction.exceptions.ValidationException;
import com.light.yardsale.transaction.repository.PostTransactionRepository;
import com.light.yardsale.transaction.services.TransactionService;
import com.light.yardsale.transaction.transferobjects.PostRequestSO;

/**
 * @author kiranlal
 *
 */
@Component
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	PostTransactionRepository postRepository;
	/**
	 * 
	 */
	public TransactionServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public PostRequestSO submitPost(PostRequestSO postRequestSO)
			throws ValidationException {
		PostTransaction trans = new PostTransaction();
		BeanUtils.copyProperties(postRequestSO, trans);
		postRepository.save(trans);
		postRequestSO.setPostId(trans.getPostId());
		return postRequestSO;
	}

}
