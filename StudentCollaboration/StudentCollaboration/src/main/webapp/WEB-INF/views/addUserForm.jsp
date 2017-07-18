<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<center>
<br/><br/>
<div id="container" style="width:75%; background-color:#008080;">
<div id="container_body" >

<h1>User Registration</h1>

<form:form action="adduser.htm" commandName="person" method="post">
<table>
<tr>
    <td><b>First Name:</b></td>
    <td><form:input path="firstName" size="30" /> <font color="red"><form:errors path="firstName"/></font></td>
</tr>

<tr>
    <td><b>Last Name:</b></td>
    <td><form:input path="lastName" size="30" /> <font color="red"><form:errors path="lastName"/></font></td>
</tr>

<tr>
    <td><b>Age:</b></td>
    <td><form:input type="number" min="19" max="65" path="age"/> <font color="red"><form:errors path="age"/></font></td>
</tr>

<tr>
    <td><b>Gender:</b></td>
    <td>Male: <form:radiobutton path="gender" value="male" />
    Female: <form:radiobutton path="gender" value="female"/> <font color="red"><form:errors path="gender"/></font></td>
</tr>

<tr>
    <td><b>Email:</b></td>
    <td><form:input path="email" size="30" /> <font color="red"><form:errors path="email"/></font></td>
</tr>

<tr>
<td><b>Role:</b></td>
<td><form:select path="role">
<form:option value="applicant" label="Applicant"></form:option>
<form:option value="current_student" label="Current Student"></form:option>
</td>
</form:select>

</tr>

<tr>
    <td><b>Username:</b></td>
    <td><form:input path="username" size="30" /> <font color="red"><form:errors path="username"/></font></td>
</tr>

<tr>
    <td><b>Password:</b></td>
    <td><form:password path="password" size="30" /> <font color="red"><form:errors path="password"/></font></td>
</tr>
</table>
<br/><br/>
 <center><b><input type="submit" value="Create Profile" /></b></center>




</form:form>
<br/><br/>
</div>
</div>
</center>
</body>
</html>