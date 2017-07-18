package com.neu.myapp.pojo;

import java.awt.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="currentstudent")
@PrimaryKeyJoinColumn(name="personID")
public class CurrentStudentProfile extends Person {
	
	@Column(name="university")
	private String university;
	
	@Column(name="course")
	private String course;
	
	@Column(name="greScore")
	private int greScore;
	
	@Column(name="toeflScore")
	private int toeflScore;
	
	@Column(name="gpa")
	private float gpa;
	
	@Column(name="review")
	private String review;
	
//	private int feedbackId;
//	private String feedbackStatus;
	
	public CurrentStudentProfile() {
		// TODO Auto-generated constructor stub
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getGreScore() {
		return greScore;
	}

	public void setGreScore(int greScore) {
		this.greScore = greScore;
	}

	public int getToeflScore() {
		return toeflScore;
	}

	public void setToeflScore(int toeflScore) {
		this.toeflScore = toeflScore;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	

	
	

}
