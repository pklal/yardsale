package com.light.yardsale.transaction.transferobjects;

import java.io.Serializable;
import java.util.Date;

public class PostItemSO implements Serializable {
	
	private Long postId;
	private String postTitle;
	private String userCode;
	private Date createdDate;
	private String locationCode;
	private String locationDesc;
	

	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	public String getLocationDesc() {
		return locationDesc;
	}
	public void setLocationDesc(String locationDesc) {
		this.locationDesc = locationDesc;
	}
	@Override
	public String toString() {
		return "PostItemSO [postId=" + postId + ", postTitle=" + postTitle
				+ ", userCode=" + userCode + ", createdDate=" + createdDate
				+ ", locationCode=" + locationCode + ", locationDesc="
				+ locationDesc + "]";
	}
	
	
}
