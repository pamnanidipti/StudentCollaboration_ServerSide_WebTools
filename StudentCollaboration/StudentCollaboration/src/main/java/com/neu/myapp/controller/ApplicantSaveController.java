package com.neu.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.myapp.dao.ApplicantDAO;
import com.neu.myapp.exception.AdException;
import com.neu.myapp.pojo.ApplicantProfile;
import com.neu.myapp.pojo.CurrentStudentProfile;
import com.neu.myapp.pojo.Person;
import com.neu.myapp.pojo.User;

@Controller
@RequestMapping("/applicantSave.htm")
public class ApplicantSaveController {

//	@Autowired
//	@Qualifier("applicantValidator")
//	ApplicantValidator applicantValidator;
//	
//	@InitBinder
//	private void initBinder(WebDataBinder binder) {
//		binder.setValidator(applicantValidator);
//	}
	
	public ApplicantSaveController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveProfile(@ModelAttribute("applicant") ApplicantProfile applicant,
			HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//applicantValidator.validate(applicant, result);
//		if (result.hasErrors()) {
//			return "successUser";
//		}
//		else
//		{
			
		
		try
		{
		HttpSession session = request.getSession();
		Person person = (Person)session.getAttribute("person");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int age = Integer.parseInt(request.getParameter("age").trim());
//		//int age=20;
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String courseApplied = request.getParameter("courseApplied");
		int greScore = Integer.parseInt(request.getParameter("greScore"));
		int toeflScore = Integer.parseInt(request.getParameter("toeflScore"));
		float gpa = Float.parseFloat(request.getParameter("gpa"));
		
		int personId = person.getPersonId();
		String username = person.getUsername();
		//System.out.println("Pid: " + personId);
		ApplicantDAO applicantDAO = new ApplicantDAO();
		applicantDAO.saveProfile(username,personId,firstName, lastName, age, gender, email, courseApplied, greScore, toeflScore, gpa);
		
		ApplicantProfile updatedApplicant = applicantDAO.getApplicantProfile(person.getUsername());
		session.setAttribute("person", updatedApplicant);
		return "applicantSaveSuccess";
		}
		catch (AdException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	//}
		return null;
	}
	
	
}

