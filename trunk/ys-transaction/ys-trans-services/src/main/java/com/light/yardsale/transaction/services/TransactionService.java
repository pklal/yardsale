/**
 * 
 */
package com.light.yardsale.transaction.services;

import com.light.yardsale.transaction.exceptions.ValidationException;
import com.light.yardsale.transaction.transferobjects.PostCommentSO;
import com.light.yardsale.transaction.transferobjects.PostListSO;
import com.light.yardsale.transaction.transferobjects.PostQuerySO;
import com.light.yardsale.transaction.transferobjects.PostTransactionSO;
import com.light.yardsale.transaction.transferobjects.PostSummarySO;

/**
 * @author kiranlal
 *
 */
public interface TransactionService {

	public PostTransactionSO submitPost(PostTransactionSO postRequestSO) throws ValidationException;
	public PostCommentSO submitComment(PostCommentSO postCommentSO) throws ValidationException;
	public PostListSO listTransactions(PostQuerySO postQuerySO) throws ValidationException;
	public PostSummarySO showSummary() throws ValidationException;
}
