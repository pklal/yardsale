package com.light.yardsale.transaction.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ys_trn_post_attachments database table.
 * 
 */
@Entity
@Table(name="ys_trn_post_attachments")
@NamedQuery(name="PostAttachment.findAll", query="SELECT p FROM PostAttachment p")
public class PostAttachment  {
	private static final long serialVersionUID = 1L;

	@Column(name="attach_name")
	private String attachmentName;

	@Lob
	@Column(name="attachment_obj")
	private byte[] attachmentObj;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="post_attach_id")
	private Long postAttachId;

	@Column(name="post_id")
	private Long postId;

	public PostAttachment() {
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public byte[] getAttachmentObj() {
		return this.attachmentObj;
	}

	public void setAttachmentObj(byte[] attachmentObj) {
		this.attachmentObj = attachmentObj;
	}

	public Long getPostAttachId() {
		return this.postAttachId;
	}

	public void setPostAttachId(Long postAttachId) {
		this.postAttachId = postAttachId;
	}

	public Long getPostId() {
		return this.postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

}