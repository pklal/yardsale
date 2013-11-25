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
	private static final long serialVersionUID = 1L;

	@Column(name="comment_desc")
	private BigDecimal commentDescription;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
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

	public BigDecimal getCommentDescription() {
		return this.commentDescription;
	}

	public void setCommentDescription(BigDecimal commentDescription) {
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