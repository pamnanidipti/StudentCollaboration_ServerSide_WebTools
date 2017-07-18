package com.neu.myapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sampleTest.htm")
public class SampleTestController {

	public SampleTestController() {
		// TODO Auto-generated constructor stub
	}
	
	String que1;
    String que2;
    String que3;
    String que4;
    String que5;
    String que6;
    String que7;
    String que8;
    String que9;
    String que10;
    int correct=0;
    
	@RequestMapping(method = RequestMethod.GET)
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		
		sendQue1(response);
		
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		String page = request.getParameter("page");
        que1 = request.getParameter("que1");
        que2 = request.getParameter("que2");
        que3 = request.getParameter("que3");
        que4 = request.getParameter("que4");
        que5 = request.getParameter("que5");
        que6 = request.getParameter("que6");
        que7 = request.getParameter("que7");
        que8 = request.getParameter("que8");
        que9 = request.getParameter("que9");
        que10 = request.getParameter("que10");
        
        
        if (page == null) {
        sendQue1(response);
        return;
       }
        if (page.equals("1")) {
        sendQue2(response);
        return;
        }
        if (page.equals("2")) {
        sendQue3(response);
        return;
        }
        if (page.equals("3")) {
        sendQue4(response);
        return;
        }
        if (page.equals("4")) {
        sendQue5(response);
        return;
        }
        if (page.equals("5")) {
        sendQue6(response);
        return;
        }
        if (page.equals("6")) {
        sendQue7(response);
        return;
        }
        if (page.equals("7")) {
        sendQue8(response);
        return;
        }
        if (page.equals("8")) {
        sendQue9(response);
        return;
        }
        if (page.equals("9")) {
        sendQue10(response);
        //return;
        }
        else if (page.equals("10")) {
        displayAnswers(response);
}
		
	}
	
	
	
	public void sendQue1(HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Question 1</TITLE></HEAD>");
        out.println("<BODY><br/>");
        
        out.println("<a href='applicantHomePage.htm'>Exit and go back to your Profile </a>");
        out.println("<CENTER><div style='height: 1000px; background-color: greenyellow;'>");
        
//        out.println("<script>");
//        out.println("function preventBackButton(){window.history.forward();}");
//        out.println("setTimeout('preventBackButton()', 0);");
//        out.println("window.onunload=function(){null};");
//        out.println("</script>");
        
        out.println("<H2>Question 1</H2>");
        out.println("<FORM METHOD=POST name='form1'>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=1>");
        out.println("Quantity A: 2x + 1      Quantity B: 2y <BR><BR>");
        out.println("<img src='resources/img/q1.gif' /> <BR><BR>");
        out.println("<table>");
        out.println("<tr><td><input type='radio' name='que1' value='Quantity A is greater'>Quantity A is greater<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que1' value='Quantity B is greater'>Quantity B is greater<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que1' value='Equal'>Equal<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que1' value='Cannot be determined'>Cannot be determined<br/></td></tr>");
        out.println("</table>");
        out.println("<br><br>");
        out.println("<input type='submit' value='Next'>");
        out.println("</FORM>");
        out.println("<div></CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    public void sendQue2(HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Question 2</TITLE></HEAD>");
        out.println("<BODY><br/>");
        out.println("<a href='applicantHomePage.htm'>Exit and go back to your Profile </a>");
        out.println("<CENTER><div style='height: 1000px; background-color: greenyellow;'>");
        out.println("<H2>Question 2</H2>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=2>");
        out.println("<INPUT TYPE=HIDDEN NAME=que1 VALUE=\"" + que1 + "\"></TD>");
        out.println("If the value of the inventory at Business K was $30,000 for April, what was the value of the inventory at Business K for June? <BR><BR>");
        out.println("<table>");
        out.println("<tr><td><input type='radio'  name='que2' value='$22,500'>$22,500<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que2' value='$29,925'>$29,925<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que2' value='$30,000'>$30,000<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que2' value='$33,000'>$33,000<br/></td></tr>");
        out.println("</table>");
        out.println("<br><br>");
        out.println("<input type='submit' value='Next'>");
        out.println("</FORM>");
        out.println("</div></CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    public void sendQue3(HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Question 3</TITLE></HEAD>");
        out.println("<BODY><br/>");
        out.println("<a href='applicantHomePage.htm'>Exit and go back to your Profile </a>");
        out.println("<CENTER><div style='height: 1000px; background-color: greenyellow;'>");
        out.println("<H2>Question 3</H2>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=3>");
        out.println("<INPUT TYPE=HIDDEN NAME=que1 VALUE=\"" + que1 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que2 VALUE=\"" + que2 + "\"></TD>");
        out.println("Approximately how many people are in the production and transportation sector of the workforce? <BR><BR>");
        out.println("<img src='resources/img/q3.gif' /> <BR><BR>");
        out.println("<table>");
        out.println("<tr><td><input type='radio'  name='que3' value='21 million'>21 million<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que3' value='18 million'>18 million<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que3' value='15 million'>15 million<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que3' value='9 million'>9 million<br/></td></tr>");
        out.println("</table>");
        out.println("<br><br>");
        out.println("<input type='submit' value='Next'>");
        out.println("</FORM>");
        out.println("</div></CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    public void sendQue4(HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Question 4</TITLE></HEAD>");
        out.println("<BODY><br/>");
        out.println("<a href='applicantHomePage.htm'>Exit and go back to your Profile </a>");
        out.println("<CENTER><div style='height: 1000px; background-color: greenyellow;'>");
        out.println("<H2>Question 4</H2>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=4>");
        out.println("<INPUT TYPE=HIDDEN NAME=que1 VALUE=\"" + que1 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que2 VALUE=\"" + que2 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que3 VALUE=\"" + que3 + "\"></TD>");
        out.println("Approximately what fraction of the workforce in the food service area of the service sector consists of males? <BR><BR>");
        out.println("<table>");
        out.println("<tr><td><input type='radio'  name='que4' value='1/4'>1/4<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que4' value='1/3'>1/3<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que4' value='3/7'>3/7<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que4' value='4/7'>4/7<br/></td></tr>");
        out.println("</table>");
        out.println("<br><br>");
        out.println("<input type='submit' value='Next'>");
        out.println("</FORM>");
        out.println("</div></CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    public void sendQue5(HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Question 5</TITLE></HEAD>");
        out.println("<BODY><br/>");
        out.println("<a href='applicantHomePage.htm'>Exit and go back to your Profile </a>");
        out.println("<CENTER><div style='height: 1000px; background-color: greenyellow;'>");
        out.println("<H2>Question 5</H2>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=5>");
        out.println("<INPUT TYPE=HIDDEN NAME=que1 VALUE=\"" + que1 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que2 VALUE=\"" + que2 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que3 VALUE=\"" + que3 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que4 VALUE=\"" + que4 + "\"></TD>");
        out.println("Which of the following could be a value of x, in the diagram above? <BR><BR>");
        out.println("<img src='resources/img/q5.gif' /> <BR><BR>");
        out.println("<table>");
        out.println("<tr><td><input type='radio'  name='que5' value='10'>10<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que5' value='20'>20<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que5' value='40'>40<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que5' value='50'>50<br/></td></tr>");
        out.println("</table>");
        out.println("<br><br>");
        out.println("<input type='submit' value='Next'>");
        out.println("</FORM>");
        out.println("</div></CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    public void sendQue6(HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Question 6</TITLE></HEAD>");
        out.println("<BODY><br/>");
        out.println("<a href='applicantHomePage.htm'>Exit and go back to your Profile </a>");
        out.println("<CENTER><div style='height: 1000px; background-color: greenyellow;'>");
        out.println("<H2>Question 6</H2>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=6>");
        out.println("<INPUT TYPE=HIDDEN NAME=que1 VALUE=\"" + que1 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que2 VALUE=\"" + que2 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que3 VALUE=\"" + que3 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que4 VALUE=\"" + que4 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que5 VALUE=\"" + que5 + "\"></TD>");
        out.println("Jo's collection contains US, Indian and British stamps. If the ratio of US to Indian stamps is 5 to 2 and the ratio of Indian to British stamps is 5 to 1, what is the ratio of US to British stamps?<BR><BR>");
        out.println("<table>");
        out.println("<tr><td><input type='radio'  name='que6' value='25 : 2'>25 : 2 <br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que6' value='20 : 2 '>20 : 2  <br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que6' value='15 : 2'>15 : 2 <br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que6' value='5 : 1'>5 : 1 <br/></td></tr>");
        out.println("</table>");
        out.println("<br><br>");
        out.println("<input type='submit' value='Next'>");
        out.println("</FORM>");
        out.println("</div></CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    public void sendQue7(HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Question 7</TITLE></HEAD>");
        out.println("<BODY><br/>");
        out.println("<a href='applicantHomePage.htm'>Exit and go back to your Profile </a>");
        out.println("<CENTER><div style='height: 1000px; background-color: greenyellow;'>");
        out.println("<H2>Question 7</H2>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=7>");
        out.println("<INPUT TYPE=HIDDEN NAME=que1 VALUE=\"" + que1 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que2 VALUE=\"" + que2 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que3 VALUE=\"" + que3 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que4 VALUE=\"" + que4 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que5 VALUE=\"" + que5 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que6 VALUE=\"" + que6 + "\"></TD>");
        out.println("ABCD is a square of side 3, and E and F are the mid points of sides AB and BC respectively. What is the area of the quadrilateral EBFD ? <BR><BR>");
        out.println("<table>");
        out.println("<tr><td><input type='radio'  name='que7' value='2.25'>2.25<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que7' value='3'>3<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que7' value='4'>4<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que7' value='4.5'>4.5<br/></td></tr>");
        out.println("</table>");
        out.println("<br><br>");
        out.println("<input type='submit' value='Next'>");
        out.println("</FORM>");
        out.println("</div></CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    public void sendQue8(HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Question 8</TITLE></HEAD>");
        out.println("<BODY><br/>");
        out.println("<a href='applicantHomePage.htm'>Exit and go back to your Profile </a>");
        out.println("<CENTER><div style='height: 1000px; background-color: greenyellow;'>");
        out.println("<H2>Question 8</H2>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=8>");
        out.println("<INPUT TYPE=HIDDEN NAME=que1 VALUE=\"" + que1 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que2 VALUE=\"" + que2 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que3 VALUE=\"" + que3 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que4 VALUE=\"" + que4 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que5 VALUE=\"" + que5 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que6 VALUE=\"" + que6 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que7 VALUE=\"" + que7 + "\"></TD>");
        out.println("n and p are integers greater than 1 5n is the square of a number 75np is the cube of a number.The smallest value for n + p is <BR><BR>");
        out.println("<table>");
        out.println("<tr><td><input type='radio'  name='que8' value='14'>14<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que8' value='18'>18<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que8' value='20'>20<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que8' value='30'>30<br/></td></tr>");
        out.println("</table>");
        out.println("<br><br>");
        out.println("<input type='submit' value='Next'>");
        out.println("</FORM>");
        out.println("</div></CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    public void sendQue9(HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Question 9</TITLE></HEAD>");
        out.println("<BODY><br/>");
        out.println("<a href='applicantHomePage.htm'>Exit and go back to your Profile </a>");
        out.println("<CENTER><div style='height: 1000px; background-color: greenyellow;'>");
        out.println("<H2>Question 9</H2>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=9>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=8>");
        out.println("<INPUT TYPE=HIDDEN NAME=que1 VALUE=\"" + que1 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que2 VALUE=\"" + que2 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que3 VALUE=\"" + que3 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que4 VALUE=\"" + que4 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que5 VALUE=\"" + que5 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que6 VALUE=\"" + que6 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que7 VALUE=\"" + que7 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que8 VALUE=\"" + que8 + "\"></TD>");
        out.println("If an object travels at five feet per second, how many feet does it travel in one hour? <BR><BR>");
        out.println("<table>");
        out.println("<tr><td><input type='radio'  name='que9' value='18000'>18000 <br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que9' value='1800'>1800<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que9' value='720'>720<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que9' value='300'>300<br/></td></tr>");
        out.println("</table>");
        out.println("<br><br>");
        out.println("<input type='submit' value='Next'>");
        out.println("</FORM>");
        out.println("</div></CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    public void sendQue10(HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Question 10</TITLE></HEAD>");
        out.println("<BODY><br/>");
        out.println("<a href='applicantHomePage.htm'>Exit and go back to your Profile </a>");
        out.println("<CENTER><div style='height: 1000px; background-color: greenyellow;'>");
        out.println("<H2>Question 10</H2>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=HIDDEN NAME=page VALUE=10>");
        out.println("<INPUT TYPE=HIDDEN NAME=que1 VALUE=\"" + que1 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que2 VALUE=\"" + que2 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que3 VALUE=\"" + que3 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que4 VALUE=\"" + que4 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que5 VALUE=\"" + que5 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que6 VALUE=\"" + que6 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que7 VALUE=\"" + que7 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que8 VALUE=\"" + que8 + "\"></TD>");
        out.println("<INPUT TYPE=HIDDEN NAME=que9 VALUE=\"" + que9 + "\"></TD>");
        out.println("What is the average (arithmetic mean) of all the multiples of ten from 10 to 190 inclusive? <BR><BR>");
        out.println("<table>");
        out.println("<tr><td><input type='radio'  name='que10' value='90'>90<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que10' value='95'>95<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que10' value='100'>100<br/></td></tr>");
        out.println("<tr><td><input type='radio'  name='que10' value='105'>105<br/></td></tr>");
        out.println("</table>");
        out.println("<br><br>");
        out.println("<input type='submit' value='Submit Test'>");
        out.println("</FORM>");
        out.println("</div></CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    
    void displayAnswers(HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Answers</TITLE></HEAD>");
        out.println("<BODY><form method='get' action='pdfReport.htm'><br/><br/>");
        out.println("<div align='right'><input type='submit' value='View PDF of Q&A'/></div>");
        out.println("<a href='applicantHomePage.htm'>Exit and go back to your Profile </a>");
        out.println("<CENTER><div style='height: 1000px; background-color: greenyellow;'>");
        out.println("<CENTER>");
        //out.println("<H2>YOU SCORED: "+correct+"</H2>");
        out.println("<H3>Answers</H3>");
        out.println("<h4>Here are the answers you have entered.</h4>");
        out.println("<TABLE>");
        out.println("<INPUT TYPE=HIDDEN NAME=que9 VALUE=\"" + que10 + "\"></TD>");
        out.println("<TR>");
        out.println("<TD><b>1. Quantity A: 2x + 1      Quantity B: 2y? &nbsp;</TD></tr>");
        out.println("<tr><TD><b> Your Answer:" +que1+ "</TD></tr>");
        out.println("<tr><TD><b> Correct Answer:Cannot be determined</TD></tr><tr><td><br></td></tr>");
        if(que1.equalsIgnoreCase("Cannot be determined"))
            ++correct;
        
        out.println("<TR>");
        out.println("<TD><b>2. If the value of the inventory at Business K was $30,000 for April, what was the value of the inventory at Business K for June? &nbsp;</TD></tr>");
        out.println("<tr><TD><b> Your Answer:" +que2+ "</TD></tr>");
        out.println("<tr><TD><b> Correct Answer:$29,925</TD></tr><tr><td><br></td></tr>");
        if(que2.equalsIgnoreCase("$29,925"))
            ++correct;
        
        out.println("<TR>");
        out.println("<TD><b>3. Approximately how many people are in the production and transportation sector of the workforce? &nbsp;</TD></tr>");
        out.println("<tr><TD><b> Your Answer:" +que3+ "</TD></tr>");
        out.println("<tr><TD><b> Correct Answer:21 million</TD></tr><tr><td><br></td></tr>");
        if(que3.equalsIgnoreCase("21 million"))
            ++correct;
              
        out.println("<TR>");
        out.println("<TD><b>4. Approximately what fraction of the workforce in the food service area of the service sector consists of males? &nbsp;</TD></tr>");
        out.println("<tr><TD><b> Your Answer:" +que4+ "</TD></tr>");
        out.println("<tr><TD><b> Correct Answer:3/7</TD></tr><tr><td><br></td></tr>");
        if(que4.equalsIgnoreCase("3/7"))
            ++correct;      
        
        out.println("<TR>");
        out.println("<TD><b>5. Which of the following could be a value of x, in the diagram above?  &nbsp;</TD></tr>");
        out.println("<tr><TD><b> Your Answer:" +que5+ "</TD></tr>");
        out.println("<tr><TD><b> Correct Answer:20</TD></tr><tr><td><br></td></tr>");
        if(que5.equalsIgnoreCase("20"))
            ++correct; 
        
        out.println("<TR>");
        out.println("<TD><b>6. Jo's collection contains US, Indian and British stamps. If the ratio of US to Indian stamps is 5 to 2 and the ratio of Indian to British stamps is 5 to 1, what is the ratio of US to British stamps? &nbsp;</TD></tr>");
        out.println("<tr><TD><b> Your Answer:" +que6+ "</TD></tr>");
        out.println("<tr><TD><b> Correct Answer:25 : 2</TD></tr><tr><td><br></td></tr>");
        if(que6.equalsIgnoreCase("25 : 2"))
            ++correct;
        
        out.println("<TR>");
        out.println("<TD><b>7. ABCD is a square of side 3, and E and F are the mid points of sides AB and BC respectively. What is the area of the quadrilateral EBFD ? &nbsp;</TD></tr>");
        out.println("<tr><TD><b> Your Answer:" +que7+ "</TD></tr>");
        out.println("<tr><TD><b> Correct Answer:4.5</TD></tr><tr><td><br></td></tr>");
        if(que7.equalsIgnoreCase("4.5"))
            ++correct;
        
        out.println("<TR>");
        out.println("<TD><b>8. n and p are integers greater than 1 5n is the square of a number 75np is the cube of a number.The smallest value for n + p is &nbsp;</TD></tr>");
        out.println("<tr><TD><b> Your Answer:" +que8+ "</TD></tr>");
        out.println("<tr><TD><b> Correct Answer:14</TD></tr><tr><td><br></td></tr>");
        if(que8.equalsIgnoreCase("14"))
            ++correct;
        
        out.println("<TR>");
        out.println("<TD><b>9. If an object travels at five feet per second, how many feet does it travel in one hour? &nbsp;</TD></tr>");
        out.println("<tr><TD><b> Your Answer:" +que9+ "</TD></tr>");
        out.println("<tr><TD><b> Correct Answer:18000</TD></tr><tr><td><br></td><td></td></tr>");
        if(que9.equalsIgnoreCase("18000"))
            ++correct;
        
        out.println("<TR>");
        out.println("<TD><b>10. What is the average (arithmetic mean) of all the multiples of ten from 10 to 190 inclusive? &nbsp;</TD></tr>");
        out.println("<tr><TD><b> Your Answer:" +que10+ "</TD></tr>");
        out.println("<tr><TD><b> Correct Answer:100</TD></tr><tr><td><br></td></tr>");
        if(que10.equalsIgnoreCase("100"))
            correct=correct+1;
//        else
//            correct=correct;
        
        //out.println(correct);
        out.println("<H2>YOU SCORED: "+correct+"</H2>");
        out.println("</TABLE></div></CENTER>");
        out.println("</form></BODY></HTML>");
        

    }
}
