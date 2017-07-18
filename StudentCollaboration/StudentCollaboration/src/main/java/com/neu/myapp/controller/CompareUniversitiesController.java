package com.neu.myapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.myapp.dao.UniversityDAO;
import com.neu.myapp.pojo.ApplicantProfile;
import com.neu.myapp.pojo.University;

@Controller
@RequestMapping("/compareUniversities.htm")
public class CompareUniversitiesController {

	public CompareUniversitiesController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(method = RequestMethod.GET)
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		List<University> univList = new ArrayList<University>();
		List<String> univNames = new ArrayList<String>();
		
		UniversityDAO universityDAO = new UniversityDAO();
		univList = universityDAO.getUniversities();
		//System.out.println(univList.size());

		session.setAttribute("univList", univList);
		return "selectUniversity";
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String getDetails(@ModelAttribute("university") University university,
			HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		UniversityDAO universityDAO = new UniversityDAO();
		HttpSession session = request.getSession();
		String universityName = request.getParameter("universityList");
		university = universityDAO.getUniversity(universityName);
		session.setAttribute("university", university);
		return "universityDetails";
	}
}
