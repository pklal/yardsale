package com.light.yardsale.transaction.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ys_trn_post_comments database table.
 * 
 */
@Entity
@Table(name="ys_trn_post_comments")
@NamedQuery(name="PostComment.findAll", query="SELECT p FROM PostComment p")
public class PostComment  {

	
	
	@Column(name="comment_desc")
	private String commentDescription;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="InvTab")
	@TableGenerator(name="InvTab", table="seq_gen",
    pkColumnName="ID_NAME", valueColumnName="ID_VAL",
    pkColumnValue="post_cmnts_id")
	@Column(name="post_cmnts_id")
	private Long postCmntsId;

	@Column(name="post_id")
	private Long postId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="posted_date")
	private Date postedDate;

	@Column(name="usr_code")
	private String userCode;

	public PostComment() {
	}

	public String getCommentDescription() {
		return this.commentDescription;
	}

	public void setCommentDescription(String commentDescription) {
		this.commentDescription = commentDescription;
	}

	public Long getPostCmntsId() {
		return this.postCmntsId;
	}

	public void setPostCmntsId(Long postCmntsId) {
		this.postCmntsId = postCmntsId;
	}

	public Long getPostId() {
		return this.postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public Date getPostedDate() {
		return this.postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

}