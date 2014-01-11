package com.light.yardsale.transaction.transferobjects;

public class SummarySO {

	private String itemCode;
	private String itemDescription;
	private Long itemCount;
	
	public SummarySO(){
		
	}
	/**
	 * @param itemCode
	 * @param itemDescription
	 * @param itemCount
	 */
	public SummarySO(String itemCode, String itemDescription, Long itemCount) {
		super();
		this.itemCode = itemCode;
		this.itemDescription = itemDescription;
		this.itemCount = itemCount;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public Long getItemCount() {
		return itemCount;
	}
	public void setItemCount(Long itemCount) {
		this.itemCount = itemCount;
	}
	@Override
	public String toString() {
		return "SummarySO [itemCode=" + itemCode + ", itemDescription="
				+ itemDescription + ", itemCount=" + itemCount + "]";
	}
	
	
}
