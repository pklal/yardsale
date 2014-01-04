/**
 * 
 */
package com.light.yardsale.transaction.transferobjects;

import java.io.Serializable;

/**
 * @author kiranlal
 *
 */
public class AttributeSO implements Serializable {

	private String attribCode;

	private String attribVal;

	private Long postAttribId;

	
	private Long postId;


	public String getAttribCode() {
		return attribCode;
	}


	public void setAttribCode(String attribCode) {
		this.attribCode = attribCode;
	}


	public String getAttribVal() {
		return attribVal;
	}


	public void setAttribVal(String attribVal) {
		this.attribVal = attribVal;
	}


	public Long getPostAttribId() {
		return postAttribId;
	}


	public void setPostAttribId(Long postAttribId) {
		this.postAttribId = postAttribId;
	}


	public Long getPostId() {
		return postId;
	}


	public void setPostId(Long postId) {
		this.postId = postId;
	}
	
	
}
