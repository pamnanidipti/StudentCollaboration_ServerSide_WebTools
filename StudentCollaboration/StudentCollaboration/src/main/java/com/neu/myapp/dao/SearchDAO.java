package com.neu.myapp.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.neu.myapp.exception.AdException;
import com.neu.myapp.pojo.Person;

public class SearchDAO extends DAO{

	public SearchDAO() {
		// TODO Auto-generated constructor stub
	}

	public List searchByFirstname(String keyword)
	{
		try
		{
			begin();
			Query q = getSession().createQuery("from Person where firstName = :firstName");
			q.setString("firstName", keyword);
			List<Person> personList = q.list();
			commit();
		return personList;
		}
		
		catch (HibernateException e) {
            rollback();
            e.printStackTrace();
            
            
        }
		return null;
	}
	
	public List searchByLastname(String keyword)
	{
		try
		{
			begin();
			Query q = getSession().createQuery("from Person where lastName = :lastName");
			q.setString("lastName", keyword);
			List<Person> personList = q.list();
			commit();
		return personList;
		}
		
		catch (HibernateException e) {
            rollback();
            e.printStackTrace();
            
            
        }
		return null;
	}
	
	public List searchByRole(String keyword)
	{
		try
		{
			begin();
			Query q = getSession().createQuery("from Person where role = :role");
			q.setString("role", keyword);
			List<Person> personList = q.list();
			commit();
		return personList;
		}
		
		catch (HibernateException e) {
            rollback();
            e.printStackTrace();
            
            
        }
		return null;
	}
}
