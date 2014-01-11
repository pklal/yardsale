package com.light.yardsale.transaction.entity;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ys_trn_post database table.
 * 
 */
@Entity
@Table(name="ys_trn_post")
@NamedQuery(name="PostTransaction.findAll", query="SELECT t FROM PostTransaction t")
public class PostTransaction  {

    
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="dtl_desc")
	private String detailedDesc;

	@Column(name="item_code")
	private String itemCode;

	@Column(name="location_code")
	private String locationCode;

	@Column(name="location_desc")
	private String locationDesc;

	@Column(name="modified_date")
	private String modifiedDate;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="InvTab")
	@TableGenerator(name="InvTab", table="seq_gen",
     pkColumnName="ID_NAME", valueColumnName="ID_VAL",
     pkColumnValue="postId")
	@Column(name="post_id")
	private Long postId;

	@Column(name="post_title")
	private String postTitle;

	@Column(name="post_type")
	private String postType;

	@Column(name="subitem_code")
	private String subitemCode;

	@Column(name="usr_code")
	private String userCode;

	
	public PostTransaction() {
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