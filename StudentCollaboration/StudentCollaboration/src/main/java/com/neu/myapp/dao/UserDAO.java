package com.neu.myapp.dao;



import java.sql.ResultSet;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;


import com.neu.myapp.exception.AdException;
import com.neu.myapp.pojo.Person;
import com.neu.myapp.pojo.User;

public class UserDAO extends DAO{

	public UserDAO() {
    }

	public Person get(String username) throws AdException 
	{
		try
		{
			begin();
			Query q = getSession().createQuery("from Person where username = :username");
            q.setString("username", username);
            Person person = (Person) q.uniqueResult();
            commit();
            return person;
			
		}
		catch (HibernateException e) {
            rollback();
            System.out.println("User not Found");
            e.printStackTrace();
            throw new AdException("Could not get user " + username, e);
            
        }
	}
	
	public Person get(String username, String password)
            throws AdException {
        try {
            begin();
            Query q = getSession().createQuery("from Person where username = :username and password = :password");
            q.setString("username", username);
            q.setString("password", password);
            Person person = (Person) q.uniqueResult();
            commit();
//            System.out.println("user found");
            return person;
        } catch (HibernateException e) {
            rollback();
            System.out.println("User not Found");
            throw new AdException("Could not get user " + username, e);
            
        }
    }
	
	public boolean check(String username, String password)
            throws AdException {
        try {
            begin();
            System.out.println("inside DAO");
            
            //this code to check uniqness of uname
            boolean usernameExists = false;
            Query q = getSession().createQuery("from Person order by username desc");
            List<Person> persons = (List<Person>)q.list(); //check imports
            String usernameCounter;
            for(Person person1: persons)
            {
            	usernameCounter = person1.getUsername();
            	if(usernameCounter.equals(username))
            	{
            		System.out.println("It already exists");
                    usernameExists = true;
            	}
            }
//            if(!usernameExists)
//            {
//            //this code works below
////            User user= new User(username,password,role);
////            
////            user.setFirstName(firstName);
////            user.setLastName(lastName);
////            user.setAge(age);
////            user.setGender(gender);
////            user.setEmail(email);
//            	
//            	Person person= new Person();
//              
//            	person.setFirstName(firstName);
//            	person.setLastName(lastName);
//            	person.setAge(age);
//            	person.setGender(gender);
//            	person.setEmail(email);
//            	person.setUsername(username);
//            	person.setPassword(password);
//            	person.setRole(role);
//            
//            getSession().save(person);
//            
//            commit();
//          //  return user;
//        } 
            return usernameExists;
        }catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while creating user: " + e.getMessage());
        }
    }

//    public void delete(User user)
//            throws AdException {
//        try {
//            begin();
//            getSession().delete(user);
//            commit();
//        } catch (HibernateException e) {
//            rollback();
//            throw new AdException("Could not delete user " + user.getUsername(), e);
//        }
//    }
	

}
