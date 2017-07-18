package com.neu.myapp.controller;

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
import com.neu.myapp.dao.CurrentStudentDAO;
import com.neu.myapp.dao.UserDAO;
import com.neu.myapp.exception.AdException;
import com.neu.myapp.pojo.Person;
import com.neu.myapp.pojo.User;
@Controller
@RequestMapping("/adduser.htm")
public class AddUserFormController {
	
	@Autowired
	@Qualifier("userValidator")
	UserValidator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	protected String doSubmitAction(@ModelAttribute("person") Person person, BindingResult result) throws Exception {
		validator.validate(person, result);
		
		if (result.hasErrors()) {
			return "addUserForm";
		}
		else
		{
		try {
			//System.out.print("test");
			UserDAO userDao = new UserDAO();
			//System.out.print("test1");
			
			if(userDao.check(person.getUsername(), person.getPassword()) == true)
			return "errorUserExists";
			
			
			// DAO.close();
		} catch (AdException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		if(person.getRole().equalsIgnoreCase("applicant"))
		{
			System.out.println("Creating Applicant...");
			
		ApplicantDAO applicantDAO = new ApplicantDAO();
		applicantDAO.saveProfile(person.getFirstName(), person.getLastName(), person.getAge(), person.getGender(), 
				person.getEmail(),person.getUsername(),person.getPassword(),person.getRole());
		return "addedUser";
		}
		else if(person.getRole().equalsIgnoreCase("current_student"))
		{
			System.out.println("Creating Current student...");
			//code for DAO
			CurrentStudentDAO currentDAO = new CurrentStudentDAO();
			currentDAO.saveProfile(person.getFirstName(), person.getLastName(), person.getAge(), person.getGender(), 
					person.getEmail(),person.getUsername(),person.getPassword(),person.getRole());
			return "addedUser";
		}
		}
		return null;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initializeForm(@ModelAttribute("person") Person person, BindingResult result) {

		return "addUserForm";
	}

}
