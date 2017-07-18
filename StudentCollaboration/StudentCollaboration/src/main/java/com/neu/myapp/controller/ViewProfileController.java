package com.neu.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.myapp.dao.ApplicantDAO;
import com.neu.myapp.dao.CurrentStudentDAO;
import com.neu.myapp.dao.UserDAO;
import com.neu.myapp.pojo.ApplicantProfile;
import com.neu.myapp.pojo.CurrentStudentProfile;
import com.neu.myapp.pojo.Person;

@Controller
@RequestMapping("/viewProfile.htm")
public class ViewProfileController {

	public ViewProfileController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(method = RequestMethod.GET)
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String username = request.getParameter("of");
		
		UserDAO userDAO = new UserDAO();
		ApplicantDAO applicantDAO = new ApplicantDAO();
		CurrentStudentDAO currentStudentDAO = new CurrentStudentDAO();
		
		Person person = userDAO.get(username);
		if(person.getRole().equalsIgnoreCase("applicant"))
		{
			ApplicantProfile applicant = applicantDAO.getApplicantProfile(person.getUsername());
			session.setAttribute("searchPerson", applicant);
			return "viewApplicantProfile";
		}
		else
		{
			CurrentStudentProfile current = currentStudentDAO.getCurrentStudentProfile(person.getUsername());
			session.setAttribute("searchPerson", current);
		return "viewCurrentStudentProfile";
		}
	}
}
