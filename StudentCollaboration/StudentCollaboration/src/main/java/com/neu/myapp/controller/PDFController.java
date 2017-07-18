package com.neu.myapp.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.neu.myapp.controller.PdfReportView;

@Controller
@RequestMapping("/pdfReport.htm")
public class PDFController {

	public PDFController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value = "/report.pdf", method = RequestMethod.GET)
	public ModelAndView createReport()
	{
		System.out.println("inside pdf controller");
		View view =  (View)new PdfReportView();
		return new ModelAndView(view);
	
		
	}
	
}
