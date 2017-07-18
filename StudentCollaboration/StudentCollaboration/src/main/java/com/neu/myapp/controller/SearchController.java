package com.neu.myapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.myapp.dao.SearchDAO;
import com.neu.myapp.pojo.Person;

@Controller
@RequestMapping("/search.htm")
public class SearchController {

	public SearchController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		
		return "searchUser";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	protected String processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
		
		//System.out.println("In controller post method");
		try  {
            PrintWriter out = response.getWriter();
            HttpSession session = request.getSession();
            
            String searchby=request.getParameter("searchby");
            String keyword=request.getParameter("search");
            keyword=keyword.replace("%", "!%");
            
            if(searchby.equalsIgnoreCase("Search by Firstname"))
            {
            	SearchDAO searchDAO = new SearchDAO();
            	List<Person> personList = searchDAO.searchByFirstname(keyword);
            	if (personList.size() == 0)
            	{
            		return "error";
            	}
            	else
            	{
	            	session.setAttribute("personList",personList);
	            	return "searchResult";
	            	
            	}
            }
            else if(searchby.equalsIgnoreCase("Search by Lastname"))
            {
            	SearchDAO searchDAO = new SearchDAO();
            	
            	List<Person> personList = searchDAO.searchByLastname(keyword);
            	if (personList.size() == 0)
            	{
            		return "error";
            	}
            	else
            	{
	            	session.setAttribute("personList",personList);
	            	return "searchResult";
	            	
            	}
            }
            
            else if(searchby.equalsIgnoreCase("Search by Role"))
            {
            	SearchDAO searchDAO = new SearchDAO();
            	
            	List<Person> personList = searchDAO.searchByRole(keyword);
            	if (personList.size() == 0)
            	{
            		return "error";
            	}
            	else
            	{
	            	session.setAttribute("personList",personList);
	            	return "searchResult";
	            	
            	}
            }
            
		}
		catch(Exception e)
        {
            e.printStackTrace();
        }
		return null;
	}
}
