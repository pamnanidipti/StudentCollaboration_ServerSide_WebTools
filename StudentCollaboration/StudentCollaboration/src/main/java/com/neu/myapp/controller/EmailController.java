package com.neu.myapp.controller;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/email.htm")
public class EmailController {

	public EmailController() {
		// TODO Auto-generated constructor stub
	}
	
	String rec;
	@RequestMapping(method = RequestMethod.GET)
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		rec= request.getParameter("emailTo");
		HttpSession session = request.getSession();
		session.setAttribute("emailTo", rec);
		return "emailForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String sendEmail(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String to = request.getParameter("recipient");
		String from = "youremail";
		String subject = request.getParameter("subject");
		String mailMessage = request.getParameter("message");
		
		final String username = "youremail";
	      final String password = "yourpassword";
	      
	      String host ="smtp.gmail.com";
	      
	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "587");
	      
	      Session session = Session.getInstance(props,
	    	         new javax.mail.Authenticator() {
	    	            protected PasswordAuthentication getPasswordAuthentication() {
	    	               return new PasswordAuthentication(username, password);
	    		   }
	    	         });
	      try
	      {
	    	  Message message = new MimeMessage(session);
	    	  message.setFrom(new InternetAddress(from));
	    	  message.setRecipients(Message.RecipientType.TO,
	                  InternetAddress.parse(to));
	    	  message.setSubject(subject);
	    	  message.setText(mailMessage);
	    	  Transport.send(message);

	   	   System.out.println("Sent message successfully....");
	    	  return "mailSuccess";
	      }
	      catch (MessagingException e) {
	    	  e.printStackTrace();
	          throw new RuntimeException(e);
	          
	       }
	}
	
}
