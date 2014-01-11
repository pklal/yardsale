/**
 * 
 */
package com.light.yardsale.transaction.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.light.yardsale.transaction.entity.PostAttributeValue;
import com.light.yardsale.transaction.entity.PostComment;
import com.light.yardsale.transaction.entity.PostTransaction;
import com.light.yardsale.transaction.exceptions.ValidationException;
import com.light.yardsale.transaction.repository.PostAttributeValueRepository;
import com.light.yardsale.transaction.repository.PostCommentRepository;
import com.light.yardsale.transaction.repository.PostTransactionRepository;
import com.light.yardsale.transaction.services.PostConstants;
import com.light.yardsale.transaction.services.TransactionService;
import com.light.yardsale.transaction.transferobjects.AttributeSO;
import com.light.yardsale.transaction.transferobjects.PostCommentSO;
import com.light.yardsale.transaction.transferobjects.PostItemSO;
import com.light.yardsale.transaction.transferobjects.PostListSO;
import com.light.yardsale.transaction.transferobjects.PostQuerySO;
import com.light.yardsale.transaction.transferobjects.PostSummarySO;
import com.light.yardsale.transaction.transferobjects.PostTransactionSO;
import com.light.yardsale.transaction.transferobjects.SummarySO;

/**
 * @author kiranlal
 *
 */
@Service
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


	public PostTransactionSO submitPost(PostTransactionSO postRequestSO)
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
		if(postQuerySO.getPostType() == null){
			postQuerySO.setPostType(PostConstants.SELL);
		}
		if(postQuerySO.getItemCode() == null || postQuerySO.getItemCode().trim().equals("")){
			throw new ValidationException("invalid Item Code");
		}
		List<PostTransaction> results = postRepository.findTransactions(postQuerySO.getPostType(),postQuerySO.getItemCode());
		PostListSO postSO = new PostListSO();
		List<PostItemSO> itemSOs = new ArrayList();
		for (Iterator<PostTransaction> iterator = results.iterator(); iterator.hasNext();) {
			PostTransaction postTransaction = iterator.next();
			PostItemSO itemSO = new PostItemSO();
			BeanUtils.copyProperties(postTransaction, itemSO);
			itemSOs.add(itemSO);
		}
		postSO.setPosts(itemSOs);
		postSO.setPageNumber(postQuerySO.getPageNumber());
		postSO.setPageSize(postQuerySO.getPageSize());
		return postSO;
	}


	@Override
	public PostSummarySO showSummary() throws ValidationException {
		List<Object[]> results =postRepository.findSummaryDetails();
		System.out.println(results.size()+" Welcome to Post..."+ results);
		PostSummarySO postSummary = new PostSummarySO();
		List<SummarySO> summaries = new ArrayList();
		for (Iterator<Object[]> iterator = results.iterator(); iterator.hasNext();) {
			Object[] type = (Object[]) iterator.next();
			SummarySO summarySO = new SummarySO();
			summarySO.setItemCode((String) type[1]);
			summarySO.setItemCount((Long) type[0]);
			summaries.add(summarySO);
		}
		postSummary.setPostSummaries(summaries);
		return postSummary;
	}

}
