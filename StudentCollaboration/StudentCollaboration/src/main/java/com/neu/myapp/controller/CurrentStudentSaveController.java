package com.neu.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.myapp.dao.CurrentStudentDAO;
import com.neu.myapp.dao.UserDAO;
import com.neu.myapp.exception.AdException;
import com.neu.myapp.pojo.ApplicantProfile;
import com.neu.myapp.pojo.CurrentStudentProfile;
import com.neu.myapp.pojo.Person;

@Controller
@RequestMapping("/currentSave.htm")
public class CurrentStudentSaveController {

	//UserDAO userDAO = new UserDAO();
	
	public CurrentStudentSaveController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String saveProfile(@ModelAttribute("current") CurrentStudentProfile current,
			HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		try
		{
		HttpSession session = request.getSession();
		Person person = (Person)session.getAttribute("person");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int age = Integer.parseInt(request.getParameter("age").trim());
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String university = request.getParameter("university");
		String courseApplied = request.getParameter("courseApplied");
		int greScore = Integer.parseInt(request.getParameter("greScore"));
		int toeflScore = Integer.parseInt(request.getParameter("toeflScore"));
		float gpa = Float.parseFloat(request.getParameter("gpa"));
		String review = request.getParameter("review");
		
		int personId = person.getPersonId();
		String username = person.getUsername();
		String password = person.getPassword();
		CurrentStudentDAO currentStudentDAO = new CurrentStudentDAO();
		currentStudentDAO.saveProfile(username, personId, firstName, lastName, age, gender, email, university, courseApplied, greScore, toeflScore, gpa, review);
		//Person updatedPerson = userDAO.get(person.getUsername(),person.getPassword());
		CurrentStudentProfile updatedCurrent = currentStudentDAO.getCurrentStudentProfile(person.getUsername());
		session.setAttribute("person", updatedCurrent);
		return "currentSaveSuccess";
		
		}catch (AdException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return "";
	}

}
