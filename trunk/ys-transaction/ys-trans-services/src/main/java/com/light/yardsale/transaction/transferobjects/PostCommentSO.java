/**
 * 
 */
package com.light.yardsale.transaction.transferobjects;

import java.io.Serializable;

import java.util.Date;


/**
 * @author kiranlal
 *
 */
public class PostCommentSO implements Serializable {
	
	private String commentDescription;

	
	private Long postCmntsId;

	
	private Long postId;

	
	private Date postedDate;


	private String userCode;


	public String getCommentDescription() {
		return commentDescription;
	}


	public void setCommentDescription(String commentDescription) {
		this.commentDescription = commentDescription;
	}


	public Long getPostCmntsId() {
		return postCmntsId;
	}


	public void setPostCmntsId(Long postCmntsId) {
		this.postCmntsId = postCmntsId;
	}


	public Long getPostId() {
		return postId;
	}


	public void setPostId(Long postId) {
		this.postId = postId;
	}


	public Date getPostedDate() {
		return postedDate;
	}


	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}


	public String getUserCode() {
		return userCode;
	}


	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	
}
