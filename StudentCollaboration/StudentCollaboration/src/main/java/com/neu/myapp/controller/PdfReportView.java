package com.neu.myapp.controller;

import java.awt.Color;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;





public class PdfReportView extends AbstractPdfView{

	public PdfReportView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document pdfdoc, PdfWriter pdfwriter, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Font font_helvetica_16_normal_blue = new Font(Font.HELVETICA, 16, Font.NORMAL, Color.BLUE); 
		Font font_courier_16_italic_red = new Font(Font.COURIER, 16, Font.ITALIC, Color.RED);
		Font font_times_16_bold_green = new Font(Font.TIMES_ROMAN, 18, Font.BOLD, Color.GREEN);
		
		//Chunk c1 = new Chunk("Your Test Report", font_courier_16_italic_red);
		
		
		//Phrase phr1 = new Phrase("Phrase 1", font_helvetica_16_normal_blue);
		//Phrase phr2 = new Phrase("Phrase 2", font_helvetica_16_normal_blue);
		
		Paragraph prg1 = new Paragraph("Answers:", font_times_16_bold_green);
		PdfPTable table = new PdfPTable(2);
        table.setWidthPercentage(100.0f);
       // table.setWidths(new float[] {3.0f, 2.0f});
        table.setSpacingBefore(10);
     // define font for table header row
        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);
         
        // define table header cell
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.BLUE);
        cell.setPadding(5);
        
     // write table header
        cell.setPhrase(new Phrase("Question", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Correct Answer", font));
        table.addCell(cell);
		
        //table data
        table.addCell("1. Quantity A: 2x + 1      Quantity B: 2y?");
        table.addCell("Cannot be determined");
        
        table.addCell("2. If the value of the inventory at Business K was $30,000 for April, what was the value of the inventory at Business K for June?");
        table.addCell("$29,925");
        
        table.addCell("3. Approximately how many people are in the production and transportation sector of the workforce?");
        table.addCell("21 million");
        
        table.addCell("4. Approximately what fraction of the workforce in the food service area of the service sector consists of males?");
        table.addCell("3/7");
        
        table.addCell("5. Which of the following could be a value of x, in the diagram?");
        table.addCell("20");
        
        table.addCell("6. Jo's collection contains US, Indian and British stamps. If the ratio of US to Indian stamps is 5 to 2 and the ratio of Indian to British stamps is 5 to 1, what is the ratio of US to British stamps?");
        table.addCell("25 : 2");
        
        table.addCell("7. ABCD is a square of side 3, and E and F are the mid points of sides AB and BC respectively. What is the area of the quadrilateral EBFD ?");
        table.addCell("4.5");
        
        table.addCell("8. n and p are integers greater than 1 5n is the square of a number 75np is the cube of a number.The smallest value for n + p is");
        table.addCell("14");
        
        table.addCell("9. If an object travels at five feet per second, how many feet does it travel in one hour?");
        table.addCell("18000");
        
        table.addCell("10. What is the average (arithmetic mean) of all the multiples of ten from 10 to 190 inclusive?");
        table.addCell("100");
        
		pdfdoc.add(prg1);
		pdfdoc.add(table);
		
	}
	
}
