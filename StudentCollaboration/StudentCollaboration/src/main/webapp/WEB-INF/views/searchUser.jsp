<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search User</title>
</head>
<body>

<div style='height: 100px; background-color: gray;'>
            <br/>
        <h1><center><font color="white">Search User</font></center></h1>
        </div>
        <hr>
        <div style='height: 400px; background-color: greenyellow;'>
            
        <h3><b>Searching User:</b></h3><br/>
        <form method="post" action="search.htm">
            <b>
        Keyword: <input type="text" name="search" required><br/><br/>
        <input type="radio" name="searchby" value="Search by Firstname" checked>Search by Firstname<br/>
        <input type="radio" name="searchby" value="Search by Lastname">Search by Lastname<br/>
        <input type="radio" name="searchby" value="Search by Role">Search by Role (Type: applicant / current_student)<br/><br/>
        <input type="hidden" name="actions" value="search">
        <input type="submit" value="Search User">
        <br/><br/>
        
        
            </b>
        </form></div>

</body>
</html>