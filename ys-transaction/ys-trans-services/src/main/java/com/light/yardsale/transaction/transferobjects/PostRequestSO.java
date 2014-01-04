/**
 * 
 */
package com.light.yardsale.transaction.transferobjects;

import java.util.Date;
import java.util.List;

/**
 * @author kiranlal
 *
 */
public class PostRequestSO {


    

	 
	private Date createdDate;

	private String detailedDesc;

	private String itemCode;

	private String locationCode;

	private String locationDesc;

	private String modifiedDate;

	private Long postId;

	private String postTitle;

	private String postType;

	private String subitemCode;

	private String userCode;
	
	private List<AttributeSO> attributes;
	
	public List<AttributeSO> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<AttributeSO> attributes) {
		this.attributes = attributes;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDetailedDesc() {
		return this.detailedDesc;
	}

	public void setDetailedDesc(String detailedDesc) {
		this.detailedDesc = detailedDesc;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationDesc() {
		return this.locationDesc;
	}

	public void setLocationDesc(String locationDesc) {
		this.locationDesc = locationDesc;
	}

	public String getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getPostId() {
		return this.postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getPostTitle() {
		return this.postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostType() {
		return this.postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getSubitemCode() {
		return this.subitemCode;
	}

	public void setSubitemCode(String subitemCode) {
		this.subitemCode = subitemCode;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}


}
