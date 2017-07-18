package com.neu.myapp.pojo;

import java.awt.List;

public class Feedback {

	private int feedbackId;
	private List feedbackQuestions;
	
	public Feedback() {
		// TODO Auto-generated constructor stub
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public List getFeedbackQuestions() {
		return feedbackQuestions;
	}

	public void setFeedbackQuestions(List feedbackQuestions) {
		this.feedbackQuestions = feedbackQuestions;
	}
	
}
