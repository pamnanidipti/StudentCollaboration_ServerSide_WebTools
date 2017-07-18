<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Send Email</title>
</head>
<body>
<center>
<div style='height: 100px; background-color: gray;'>
            <br/>
        <h1>Sending e-mail</h1>
        </div>
        <hr>
        <div style='height: 400px; background-color: greenyellow;'>
        <form method="post" action="email.htm">
            <table border="0" width="80%">
                <tr>
                    <td>To:</td>
                    <td><input type="text" name="recipient" size="65" value=${sessionScope.emailTo}></td>
                    
                </tr>
                <tr>
                    <td>Subject:</td>
                    <td><input type="text" name="subject" size="65" /></td>
                </tr>
                <tr>
                    <td>Message:</td>
                    <td><textarea cols="50" rows="10" name="message"></textarea></td>
                </tr> 
                </table>              
                
                  <div style="float:right;margin-right:1000px;">
                       <input type="submit" value="Send E-mail" />
                    </div> 
            
        </form>
        </div>
    </center>
</body>
</html>