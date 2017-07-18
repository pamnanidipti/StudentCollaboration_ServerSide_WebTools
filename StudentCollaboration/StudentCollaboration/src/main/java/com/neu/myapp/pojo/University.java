package com.neu.myapp.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="university")
public class University {
	
	@Id
	@GeneratedValue
	@Column(name="universityId", unique=true, nullable=false)
	private int universityId;
	
	@Column(name="universityName")
	private String universityName;
	
	@Column(name="universityLocation")
	private String universityLocation;
	
	@Column(name="greRequired")
	private int greRequired;
	
	@Column(name="reputationRating")
	private int reputationRating;
	
	
	@Column(name="feeRating")
	private int feeRating;
	
	@Column(name="expenseRating")
	private int expenseRating;
	
	
	@Column(name="weatherRating")
	private int weatherRating;
	
	public University() {
		// TODO Auto-generated constructor stub
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	
	public int getGreRequired() {
		return greRequired;
	}

	public void setGreRequired(int greRequired) {
		this.greRequired = greRequired;
	}

	public String getUniversityLocation() {
		return universityLocation;
	}

	public void setUniversityLocation(String universityLocation) {
		this.universityLocation = universityLocation;
	}

	public int getReputationRating() {
		return reputationRating;
	}

	public void setReputationRating(int reputationRating) {
		this.reputationRating = reputationRating;
	}

	
	public int getFeeRating() {
		return feeRating;
	}

	public void setFeeRating(int feeRating) {
		this.feeRating = feeRating;
	}

	public int getExpenseRating() {
		return expenseRating;
	}

	public void setExpenseRating(int expenseRating) {
		this.expenseRating = expenseRating;
	}

	

	public int getWeatherRating() {
		return weatherRating;
	}

	public void setWeatherRating(int weatherRating) {
		this.weatherRating = weatherRating;
	}

	
	
	

}
