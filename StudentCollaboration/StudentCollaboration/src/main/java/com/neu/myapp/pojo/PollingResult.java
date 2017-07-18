package com.neu.myapp.pojo;

public class PollingResult {
	
	private int pollingResultId;
	private int pollingId;
	private int personId;
	private String pollAnswer;
	
	public PollingResult() {
		// TODO Auto-generated constructor stub
	}

	public int getPollingResultId() {
		return pollingResultId;
	}

	public void setPollingResultId(int pollingResultId) {
		this.pollingResultId = pollingResultId;
	}

	public int getPollingId() {
		return pollingId;
	}

	public void setPollingId(int pollingId) {
		this.pollingId = pollingId;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPollAnswer() {
		return pollAnswer;
	}

	public void setPollAnswer(String pollAnswer) {
		this.pollAnswer = pollAnswer;
	}
	

}
