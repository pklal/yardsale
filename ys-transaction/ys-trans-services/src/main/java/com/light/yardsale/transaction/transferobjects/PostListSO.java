package com.light.yardsale.transaction.transferobjects;

import java.io.Serializable;
import java.util.List;

public class PostListSO implements Serializable {

	private List<PostItemSO> posts;
	private int pageNumber;
	private int pageSize;
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<PostItemSO> getPosts() {
		return posts;
	}
	public void setPosts(List<PostItemSO> posts) {
		this.posts = posts;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	@Override
	public String toString() {
		return "PostListSO [posts=" + posts + ", pageNumber=" + pageNumber
				+ ", pageSize=" + pageSize + "]";
	}
	
}
