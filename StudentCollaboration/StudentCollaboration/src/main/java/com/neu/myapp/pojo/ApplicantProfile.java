package com.neu.myapp.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="applicantprofile")
@PrimaryKeyJoinColumn(name="personID")
public class ApplicantProfile extends Person {
	
	
	//private int applicantId;
	
//	@Column(name="photoName")
//	private String photoName;
//	
//	@Column(name="photo")
//	private MultipartFile photo;
	
	@Column(name="courseApplied")
	private String courseApplied;
	
	@Column(name="greScore")
	private int greScore;
	
	@Column(name="toeflScore")
	private int toeflScore;
	
	@Column(name="gpa")
	private float gpa;
	
//	//foreign key
//	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
//	@JoinColumn(name="sampleId")
//	private int sampleId;
//	
//	@Column(name="sampleStatus")
//	private String sampleStatus;
	
	public ApplicantProfile() {
		// TODO Auto-generated constructor stub
	}

//	public int getApplicantId() {
//		return applicantId;
//	}
//
//	public void setApplicantId(int applicantId) {
//		this.applicantId = applicantId;
//	}



//	public String getPhotoName() {
//		return photoName;
//	}
//
//	public void setPhotoName(String photoName) {
//		this.photoName = photoName;
//	}
//
//	public MultipartFile getPhoto() {
//		return photo;
//	}
//
//	public void setPhoto(MultipartFile photo) {
//		this.photo = photo;
//	}

	public String getCourseApplied() {
		return courseApplied;
	}

	public void setCourseApplied(String courseApplied) {
		this.courseApplied = courseApplied;
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

	

//	public int getSampleId() {
//		return sampleId;
//	}
//
//	public void setSampleId(int sampleId) {
//		this.sampleId = sampleId;
//	}
//
//	public String getSampleStatus() {
//		return sampleStatus;
//	}
//
//	public void setSampleStatus(String sampleStatus) {
//		this.sampleStatus = sampleStatus;
//	}
	
	
}
