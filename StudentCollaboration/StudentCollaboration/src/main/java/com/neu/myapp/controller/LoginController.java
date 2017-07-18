package com.neu.myapp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.myapp.dao.ApplicantDAO;
import com.neu.myapp.dao.CurrentStudentDAO;
import com.neu.myapp.dao.UserDAO;
import com.neu.myapp.exception.AdException;
import com.neu.myapp.pojo.ApplicantProfile;
import com.neu.myapp.pojo.CurrentStudentProfile;
import com.neu.myapp.pojo.Person;
import com.neu.myapp.pojo.User;

@Controller
@RequestMapping("/login.htm")
public class LoginController {

	public LoginController() {
		// TODO Auto-generated constructor stub
	}
	
//	@RequestMapping(method = RequestMethod.POST)
//	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException, SQLException
//            {
//		String value = request.getParameter("action");
//		try
//		{
//		if (value.equals("login"))
//		{
//			HttpSession session = request.getSession();
//			if (session.getAttribute("username") != null) {
//                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/UserView.jsp");
//                rd.forward(request, response);
//            }
//			String username = request.getParameter("username");
//            String password = request.getParameter("password");
//			
//            UserDAO userDao = new UserDAO();
//            User user = userDao.get(username);
//            session.setAttribute("username", username);
//            
//            Cookie userCookie = new Cookie("username", request.getParameter("username"));
//            Cookie passwordCookie = new Cookie("password", request.getParameter("password"));
//
//            response.addCookie(userCookie);
//            response.addCookie(passwordCookie);
//
//            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/UserView.jsp");
//            rd.forward(request, response);
//		}
//		else {
//            //for invalid credentials
//            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp?error=true");
//            rd.forward(request, response);
//        }
//		}
//		catch (Exception e) {
//			System.out.println("Exception: " + e.getMessage());
//		}
//   }
//	
	@RequestMapping(method = RequestMethod.POST)
	public String loginCheck(@ModelAttribute("person") Person person,HttpServletRequest request, 
			HttpServletResponse response){
		
		HttpSession session = request.getSession();
//		if (session.getAttribute("person") != null) {
//            if(person.getRole().equalsIgnoreCase("applicant"))
//            	return "successUser";
//            else 
//            	return "currentStudent";
//        }
		
		UserDAO userDao = new UserDAO();
		ApplicantDAO applicantDAO = new ApplicantDAO();
		CurrentStudentDAO currentStudentDAO = new CurrentStudentDAO();
		//User user1;
		try {
			
			person = userDao.get(person.getUsername(),person.getPassword());
			
			if(person != null)
			{
				if(person.getRole().equalsIgnoreCase("Applicant"))
				{
					ApplicantProfile applicant = applicantDAO.getApplicantProfile(person.getUsername());
					session.setAttribute("person", applicant);
				return "successUser";
				}
				else if(person.getRole().equalsIgnoreCase("admin"))
				{
					session.setAttribute("person", person);
					return "adminPage";
				}
				else
				{
					CurrentStudentProfile current = currentStudentDAO.getCurrentStudentProfile(person.getUsername());
					session.setAttribute("person", current);
					return "currentStudent";
				}
			}
			
		} catch (AdException e) {
			// TODO Auto-generated catch block
			System.out.println("error in username");
			//return "error";
		}
		
		return "noSuchUser";
//		if(user != null)
//		return "successUser";
//		
//		else
//			return "error";
		
		
	}

}
