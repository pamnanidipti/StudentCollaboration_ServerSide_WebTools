package com.neu.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.myapp.dao.UniversityDAO;
import com.neu.myapp.pojo.Person;
import com.neu.myapp.pojo.University;

@Controller
@RequestMapping("/addUniversity.htm")
public class AddUniversityController {

	public AddUniversityController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(method = RequestMethod.GET)
	public String handleRequest() throws Exception 
	{
		return "numberOfUniv";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String addUniversity(@ModelAttribute("university") University university,HttpServletRequest request, 
			HttpServletResponse response){
		
		String actionValue = request.getParameter("action");
		if (actionValue != null && actionValue.equals("add")) {
		return "enterDetails";	
		
		}
		else if(actionValue != null && actionValue.equals("store"))
		{
			boolean ifSuccess = false;
		 //System.out.println("In store action of controller");
			int finalcount = Integer.parseInt(request.getParameter("countfinal"));
			for(int i=1;i<=finalcount;i++)
            {
				String univName = request.getParameter("univName"+i);
                String univLocation = request.getParameter("univLocation"+i);
                int greReq = Integer.parseInt(request.getParameter("univGRE"+i));
                int reputation = Integer.parseInt(request.getParameter("reputation"+i));
                int fees = Integer.parseInt(request.getParameter("fees"+i));
                int expense = Integer.parseInt(request.getParameter("expense"+i));
                int weather = Integer.parseInt(request.getParameter("weather"+i));
                
                UniversityDAO universityDAO = new UniversityDAO();
                ifSuccess = universityDAO.add(univName, univLocation, greReq, reputation, fees, expense, weather);
            }
			if(ifSuccess)
			{
				return "univAdded";
			}
			
		}
		return "error";
	}
}
