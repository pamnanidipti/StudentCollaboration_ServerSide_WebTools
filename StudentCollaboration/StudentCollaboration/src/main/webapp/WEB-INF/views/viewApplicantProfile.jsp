<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile-${sessionScope.searchPerson.firstName} ${sessionScope.searchPerson.lastName} </title>
</head>
<body>
<center>
<div id="container" style="width:75%; background-color:#008080;">
<div id="container_body" >

<h1>${sessionScope.searchPerson.firstName} ${sessionScope.searchPerson.lastName} </h1>



<form method="get" action="email.htm">
<input type="hidden" name="emailTo" value="${searchPerson.email }"/>

<div align="right" style="margin-right:200px;background: #CC3366;"><input type="submit" value="Send Mail"/></div>
<table>


<tr>
<td>First Name:</td>
<td><input type="text" name="firstName" id="firstName" value="${sessionScope.searchPerson.firstName}" disabled> </td> 
</tr>

<tr>
<td>Last Name:</td>
<td><input type="text" name="lastName" id="lastName" value="${sessionScope.searchPerson.lastName}" disabled> </td> 
</tr>

<tr>
<td>Age:</td>
<td><input type="text" name="age" id="age" value="${sessionScope.searchPerson.age}" disabled> </td> 
</tr>

<tr>
<td>Gender:</td>
<td><input type="text" name="gender" id="gender" value="${sessionScope.searchPerson.gender}" disabled></td> 
</tr>

<tr>
<td>Email:</td>
<td><input type="text" name="email" id="email" value="${sessionScope.searchPerson.email}" disabled></td> 
</tr>

<tr>
<td>Course Applied:</td>
<td> 
<select id="courseApplied" name="courseApplied" value="${sessionScope.searchPerson.courseApplied}" disabled>
	
	<option value="MS CS" selected>MS CS</option>
    <option value="MS IS">MS IS</option>
    <option value="MS EE">MS EE</option>
    <option value="MBA">MBA</option>
    <option value="Other">Other</option>
    
</select>
</td>
</tr>

<tr>
<td>GRE Score: </td>
<td><input type="number" name="greScore" id="greScore" min="270" max="340" value="${sessionScope.searchPerson.greScore}" disabled></td>
</tr>

<tr>
<td>TOEFL Score:</td>
<td> <input type="number" name="toeflScore" id="toeflScore" min="70" max="120" value="${sessionScope.searchPerson.toeflScore}" disabled></td>
</tr>

<tr>
<td>GPA: </td>
<td><input type="number" name="gpa" id="gpa" min="2.0" max="4.0" value="${sessionScope.searchPerson.gpa}" disabled></td>
</tr>


</table>
</form>
<br/><br/>

</div>
</div>

<br/>

</center>

</body>
</html>