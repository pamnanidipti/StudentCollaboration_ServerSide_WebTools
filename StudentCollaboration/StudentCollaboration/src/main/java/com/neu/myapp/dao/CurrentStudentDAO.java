package com.neu.myapp.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.neu.myapp.exception.AdException;
import com.neu.myapp.pojo.ApplicantProfile;
import com.neu.myapp.pojo.CurrentStudentProfile;


public class CurrentStudentDAO extends DAO {

	public CurrentStudentDAO()  {
		// TODO Auto-generated constructor stub
	}
	
	public CurrentStudentProfile getCurrentStudentProfile(String username){
		Query q = getSession().createQuery("from CurrentStudentProfile where username=:username");
		q.setString("username",username);
		
		CurrentStudentProfile current = (CurrentStudentProfile) q.uniqueResult();
return current;		
	}
	
	public void saveProfile(String username,int personID,String firstName, String lastName,int age, String gender, String email, 
			String university,String course, int greScore, int toeflScore,float gpa, String review)
            throws AdException {
		try {
            begin();
            CurrentStudentProfile current;
//            Query q = getSession().createQuery("from currentStudent where personID = :personID");
//            
//            q.setString("personID", String.valueOf(personID));
//            current = (CurrentStudentProfile) q.uniqueResult();
            current = getCurrentStudentProfile(username);
            current.setFirstName(firstName);
            current.setLastName(lastName);
            current.setAge(age);
            current.setGender(gender);
            current.setEmail(email);
            current.setUniversity(university);
            current.setCourse(course);
            current.setGreScore(greScore);
            current.setToeflScore(toeflScore);
            current.setGpa(gpa);
            current.setReview(review);
            
            
            
            getSession().update(current);
            
            commit();
            
            
		}
		catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while saving Current Student Profile: " + e.getMessage());
        } 
		
		
	}
	
	public void saveProfile(String firstName, String lastName,int age, String gender, String email, String username,
			String password, String role)
            throws AdException {
		try {
			System.out.println("In the function");
            begin();
            CurrentStudentProfile current = new CurrentStudentProfile();
            current.setFirstName(firstName);
            current.setLastName(lastName);
            current.setAge(age);
            current.setGender(gender);
            current.setEmail(email);
            current.setUsername(username);
            current.setPassword(password);
            current.setRole(role);
getSession().save(current);
            
            commit();
            close();
            
		}
		catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while saving Current Student profile: " + e.getMessage());
        } 
	}
}
