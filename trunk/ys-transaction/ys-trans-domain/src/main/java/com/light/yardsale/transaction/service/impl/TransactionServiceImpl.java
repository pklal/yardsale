/**
 * 
 */
package com.light.yardsale.transaction.service.impl;

import java.util.Iterator;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.light.yardsale.transaction.entity.PostAttributeValue;
import com.light.yardsale.transaction.entity.PostComment;
import com.light.yardsale.transaction.entity.PostTransaction;
import com.light.yardsale.transaction.exceptions.ValidationException;
import com.light.yardsale.transaction.repository.PostAttributeValueRepository;
import com.light.yardsale.transaction.repository.PostCommentRepository;
import com.light.yardsale.transaction.repository.PostTransactionRepository;
import com.light.yardsale.transaction.services.TransactionService;
import com.light.yardsale.transaction.transferobjects.AttributeSO;
import com.light.yardsale.transaction.transferobjects.PostCommentSO;
import com.light.yardsale.transaction.transferobjects.PostListSO;
import com.light.yardsale.transaction.transferobjects.PostQuerySO;
import com.light.yardsale.transaction.transferobjects.PostRequestSO;

/**
 * @author kiranlal
 *
 */
@Component
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	PostTransactionRepository postRepository;
	@Autowired
	PostAttributeValueRepository postAttributeRepository;
	
	@Autowired
	private PostCommentRepository postCommentRepository;
	/**
	 * 
	 */
	public TransactionServiceImpl() {
		// TODO Auto-generated constructor stub
	}


	public PostRequestSO submitPost(PostRequestSO postRequestSO)
			throws ValidationException {
		PostTransaction trans = new PostTransaction();
		BeanUtils.copyProperties(postRequestSO, trans);
		postRepository.save(trans);
		postRequestSO.setPostId(trans.getPostId());
		if(postRequestSO.getAttributes()!=null){
			for (Iterator<AttributeSO> iterator = postRequestSO.getAttributes().iterator(); iterator.hasNext();) {
				AttributeSO aSO =  iterator.next();
				PostAttributeValue pav = new PostAttributeValue();
				BeanUtils.copyProperties(aSO, pav);
				pav.setPostId(trans.getPostId());
				postAttributeRepository.save(pav);
				aSO.setPostAttribId(pav.getPostAttribId());
			}
		}
		return postRequestSO;
	}


	@Override
	public PostCommentSO submitComment(PostCommentSO postCommentSO)
			throws ValidationException {
		PostComment pCmnt =  new PostComment();
		BeanUtils.copyProperties(postCommentSO, pCmnt);
		postCommentRepository.save(pCmnt);
		pCmnt.setPostCmntsId(pCmnt.getPostCmntsId());
		return postCommentSO;
	}


	@Override
	public PostListSO listTransactions(PostQuerySO postQuerySO)
			throws ValidationException {
		// TODO Auto-generated method stub
		return null;
	}

}
