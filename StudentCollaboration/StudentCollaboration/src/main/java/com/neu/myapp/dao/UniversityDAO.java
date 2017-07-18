package com.neu.myapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.neu.myapp.exception.AdException;
import com.neu.myapp.pojo.University;

public class UniversityDAO extends DAO {

	public UniversityDAO()  {
		// TODO Auto-generated constructor stub
	}
	public List<University> getUniversities() throws Exception
	{
		 List univList = new ArrayList<University>();
		try
		{
			//List univList;
			begin();
			
			Query q = getSession().createQuery("from University");
			
			univList = q.list();
            commit();
            
            return univList;
		}catch (HibernateException e) {
            rollback();
            e.printStackTrace();
            
        }
		return univList;
	}

	public University getUniversity(String universityName)
	{
		begin();
		University university = new University();
		Query q = getSession().createQuery("from University where universityName = :universityName");
		q.setString("universityName", universityName);
		university = (University) q.uniqueResult();
		commit();
		
		return university;
	}
	
	public boolean add(String univName, String univLocation, int greReq, int reputation, int fees, int expense,
			int weather)
	{
		try {
			begin();
			University university = new University();
			university.setUniversityName(univName);
			university.setUniversityLocation(univLocation);
			university.setGreRequired(greReq);
			university.setReputationRating(reputation);
			university.setFeeRating(fees);
			university.setExpenseRating(expense);
			university.setWeatherRating(weather);
			
			getSession().save(university);
            
            commit();
            return true;
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
		}
		return true;
	}
}
