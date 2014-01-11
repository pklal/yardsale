package com.light.yardsale.transaction.transferobjects;

public class SubItemQuerySO {

	private String subItemCode;
	private String subItemValue;
	
	public SubItemQuerySO(){
		
	}
	
	/**
	 * @param subItemCode
	 * @param subItemValue
	 */
	public SubItemQuerySO(String subItemCode, String subItemValue) {
		super();
		this.subItemCode = subItemCode;
		this.subItemValue = subItemValue;
	}
	@Override
	public String toString() {
		return "SubItemQuerySO [subItemCode=" + subItemCode + ", subItemValue="
				+ subItemValue + "]";
	}
	public String getSubItemCode() {
		return subItemCode;
	}
	public void setSubItemCode(String subItemCode) {
		this.subItemCode = subItemCode;
	}
	public String getSubItemValue() {
		return subItemValue;
	}
	public void setSubItemValue(String subItemValue) {
		this.subItemValue = subItemValue;
	}
	
}
