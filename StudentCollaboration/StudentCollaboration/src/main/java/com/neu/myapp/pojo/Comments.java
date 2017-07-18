package com.neu.myapp.pojo;

import java.sql.Date;

public class Comments {
	
	private int commentId;
	private int personId;
	private int discussionId;
	private Date dateCommented;
	private String comment;
	
	public Comments() {
		// TODO Auto-generated constructor stub
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getDiscussionId() {
		return discussionId;
	}

	public void setDiscussionId(int discussionId) {
		this.discussionId = discussionId;
	}

	public Date getDateCommented() {
		return dateCommented;
	}

	public void setDateCommented(Date dateCommented) {
		this.dateCommented = dateCommented;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	

}
