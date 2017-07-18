package com.neu.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home.htm")
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
//		String value = request.getParameter("action");
		//System.out.println(value);
//		if(value == null)
//		{
			return "gradRoomFinal";
//		}
//		else
//		{
//		return "trend";
//		}
	}
}
