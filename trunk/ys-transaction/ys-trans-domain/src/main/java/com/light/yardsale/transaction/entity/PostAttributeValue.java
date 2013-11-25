package com.light.yardsale.transaction.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the ys_post_attrib_values database table.
 * 
 */
@Entity
@Table(name="ys_post_attrib_values")
@NamedQuery(name="PostAttributeValue.findAll", query="SELECT p FROM PostAttributeValue p")
public class PostAttributeValue  {
	private static final long serialVersionUID = 1L;

	@Column(name="attrib_code")
	private String attribCode;

	@Column(name="attrib_val")
	private String attribVal;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="post_attrib_id")
	private Long postAttribId;

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