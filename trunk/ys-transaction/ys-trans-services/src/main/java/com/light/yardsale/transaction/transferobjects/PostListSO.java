package com.light.yardsale.transaction.transferobjects;

import java.io.Serializable;
import java.util.List;

public class PostListSO implements Serializable {

	private List<PostItemSO> postListPage;
	private int pageNumber;
	private int pageSize;
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
