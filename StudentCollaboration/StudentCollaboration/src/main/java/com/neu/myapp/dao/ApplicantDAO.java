package com.neu.myapp.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.neu.myapp.exception.AdException;
import com.neu.myapp.pojo.ApplicantProfile;

public class ApplicantDAO extends DAO {

	public ApplicantDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public ApplicantProfile getApplicantProfile(String username){
		Query q = getSession().createQuery("from ApplicantProfile where username=:username");
		q.setString("username",username);
		
		ApplicantProfile applicant = (ApplicantProfile) q.uniqueResult();
return applicant;		
	}

	public void saveProfile(String username,int personID,String firstName, String lastName,int age, String gender, String email, 
			String courseApplied, int greScore, int toeflScore,float gpa)
            throws AdException {
		try {
            begin();
            ApplicantProfile applicant;
//            Query q = getSession().createQuery("from ApplicantProfile where applicantprofile.personID = :personID");
//            
//            q.setString("personID", String.valueOf(personID));
//            applicant = (ApplicantProfile) q.uniqueResult();
            

            applicant = getApplicantProfile(username);
            applicant.setFirstName(firstName);
            applicant.setLastName(lastName);
            applicant.setAge(age);
            applicant.setGender(gender);
            applicant.setEmail(email);
            applicant.setCourseApplied(courseApplied);
            applicant.setGreScore(greScore);
            applicant.setToeflScore(toeflScore);
            applicant.setGpa(gpa);
            
            
            
            getSession().update(applicant);
            
            commit();
            
            
		}
		catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while saving Applicant profile: " + e.getMessage());
        } 
		
		
	}
	public void saveProfile(String firstName, String lastName,int age, String gender, String email, String username,
			String password, String role)
            throws AdException {
		try {
			System.out.println("In the function");
            begin();
            ApplicantProfile applicant = new ApplicantProfile();
            applicant.setFirstName(firstName);
            applicant.setLastName(lastName);
            applicant.setAge(age);
            applicant.setGender(gender);
            applicant.setEmail(email);
            applicant.setUsername(username);
            applicant.setPassword(password);
            applicant.setRole(role);
getSession().save(applicant);
            
            commit();
            close();
            
		}
		catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while saving Applicant profile: " + e.getMessage());
        } 
	}
}
