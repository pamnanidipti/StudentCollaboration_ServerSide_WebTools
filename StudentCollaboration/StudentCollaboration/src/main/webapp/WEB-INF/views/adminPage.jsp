<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
<style>
.bar
{
 width:100px;
 height:30px;
}

#right
{
    float:right;
    margin-right:170px;
    background: #CC3366;
}
</style>
</head>
<body>

<center>
<br/><br/>
<div id ="right" class="bar">
<a href="logout.htm" ><strong>Logout</strong></a>
</div>
<br/>
<div id="container" style="width:75%; background-color:#008080;">
<div id="container_body" >
<h1>Admin</h1>
<h2>Hello ${sessionScope.person.firstName} ${sessionScope.person.lastName} </h2>

<br/>

<fieldset>
<legend><strong>Add University Details</strong></legend>
<br/>
<a href="addUniversity.htm"><b>Add University >> </b></a>
</fieldset>

</div>
</div>

<br/>
</center>
</body>
</html>