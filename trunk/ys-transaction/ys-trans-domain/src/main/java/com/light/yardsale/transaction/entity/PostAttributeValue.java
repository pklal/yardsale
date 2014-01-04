package com.light.yardsale.transaction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


/**
 * The persistent class for the ys_post_attrib_values database table.
 * 
 */
@Entity
@Table(name="ys_post_attrib_values")
@NamedQuery(name="PostAttributeValue.findAll", query="SELECT p FROM PostAttributeValue p")
public class PostAttributeValue  {

	

	@Column(name="attrib_code")
	private String attribCode;

	@Column(name="attrib_val")
	private String attribVal;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="InvTab")
	@TableGenerator(name="InvTab", table="seq_gen",
    pkColumnName="ID_NAME", valueColumnName="ID_VAL",
    pkColumnValue="post_attrib_id")
	@Column(name="post_attrib_id")
	private Long postAttribId;

	@Column(name="post_id")
	private Long postId;

	
	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public PostAttributeValue() {
	}

	public String getAttribCode() {
		return this.attribCode;
	}

	public void setAttribCode(String attribCode) {
		this.attribCode = attribCode;
	}

	public String getAttribVal() {
		return this.attribVal;
	}

	public void setAttribVal(String attribVal) {
		this.attribVal = attribVal;
	}

	public Long getPostAttribId() {
		return this.postAttribId;
	}

	public void setPostAttribId(Long postAttribId) {
		this.postAttribId = postAttribId;
	}

}