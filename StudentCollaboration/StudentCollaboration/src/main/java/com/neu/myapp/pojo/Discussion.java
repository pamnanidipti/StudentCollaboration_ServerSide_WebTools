package com.neu.myapp.pojo;

import java.sql.Date;

public class Discussion {
	
	private int discussionId;
	private int personId;
	private int discussionAboutId;
	private Date datePosted;
	private String description;
	
	public Discussion() {
		// TODO Auto-generated constructor stub
	}

	public int getDiscussionId() {
		return discussionId;
	}

	public void setDiscussionId(int discussionId) {
		this.discussionId = discussionId;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getDiscussionAboutId() {
		return discussionAboutId;
	}

	public void setDiscussionAboutId(int discussionAboutId) {
		this.discussionAboutId = discussionAboutId;
	}

	public Date getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
