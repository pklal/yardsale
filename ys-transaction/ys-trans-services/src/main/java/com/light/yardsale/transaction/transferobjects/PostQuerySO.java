package com.light.yardsale.transaction.transferobjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PostQuerySO implements Serializable {

	private String itemCode;
	private String postType;
	private int pageSize;
	private int pageNumber;
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	private List<SubItemQuerySO> subItemCodes;
	
	public String getPostType() {
		return postType;
	}
	public void setPostType(String postType) {
		this.postType = postType;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public List<SubItemQuerySO> getSubItemCodes() {
		return subItemCodes;
	}
	public void setSubItemCodes(List<SubItemQuerySO> subItemCodes) {
		this.subItemCodes = subItemCodes;
	}
	public void addSubItemCode(String code,String value){
		if(subItemCodes == null){
			subItemCodes = new ArrayList();
		}
		subItemCodes.add(new SubItemQuerySO(code,value));
	}
	
}
