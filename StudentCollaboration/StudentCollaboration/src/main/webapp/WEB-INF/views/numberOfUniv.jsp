<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
</head>
<body>
<div style='height: 100px; background-color: gray;'>
            <h1><center><font color="white">Welcome!</font></center></h1></div>
        <div style='height: 400px; background-color: greenyellow;'>
              <center>  <h1>How Many Universities do you want to Add??</h1>
        
        <form method="post" action="addUniversity.htm">
            <input type="number" name="count" style="width: 220px !important;" min="1" max="10" required>
            <input type="hidden" name="action" value="add">
            <input type="hidden" name="count" >
            <input type="submit" value="Submit">
        </form>
             </center>  
        </div>
        </body>
</html>