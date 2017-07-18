<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
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
#errorBox{
 color:#FF4500;
 font-weight: bold;
 }
</style>
</head>
<body onload="check()">
<center>
<br/><br/>
<div id ="right" class="bar">
<a href="logout.htm" ><strong>Logout</strong></a>
</div>
<div id="container" style="width:75%; background-color:#008080;">
<div id="container_body" >
<form name="currentProfile" id="currentProfile" commandName="current" method="POST" action="currentSave.htm">
<h1>${sessionScope.person.firstName} ${sessionScope.person.lastName} </h1>

<br/>
<div id="errorBox"></div>
<table>


<tr>
<td>First Name:</td>
<td><input type="text" name="firstName" id="firstName" value="${sessionScope.person.firstName}" required disabled> </td> 
</tr>

<tr>
<td>Last Name:</td>
<td><input type="text" name="lastName" id="lastName" value="${sessionScope.person.lastName}" required disabled> </td> 
</tr>

<tr>
<td>Age:</td>
<td><input type="text" name="age" min="19" max="65" id="age" value="${sessionScope.person.age}" required disabled> </td> 
</tr>

<tr>
<td>Gender:</td>
<td><input type="text" name="gender" id="gender" value="${sessionScope.person.gender}" required disabled></td> 
</tr>

<tr>
<td>Email:</td>
<td><input type="text" name="email" id="email" value="${sessionScope.person.email}" required disabled></td> 
</tr>

<tr>
<td>University:</td>
<td>
<select id="university" name="university" value="${sessionScope.person.university}" required disabled>
<option value="Northeastern University" selected>Northeastern University</option>
    <option value="NYU">NYU</option>
    <option value="UCLA">UCLA</option>
    <option value="Boston University">Boston University</option>
    <option value="ASU">ASU</option>
    <option value="RIT">RIT</option>
    <option value="UTD">UTD</option>
    <option value="Stevens">Stevens</option>
    <option value="UIC">UIC</option>
    <option value="Other">Other</option>
    
</select>
</td>
</tr>
<tr>
<td>Course Applied:</td>
<td> 
<select id="courseApplied" name="courseApplied" value="${sessionScope.person.course}" required disabled>
	
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
<td><input type="number" name="greScore" id="greScore" min="270" max="340" value="${sessionScope.person.greScore}" required disabled></td>
</tr>

<tr>
<td>TOEFL Score:</td>
<td> <input type="number" name="toeflScore" id="toeflScore" min="70" max="120" value="${sessionScope.person.toeflScore}" required disabled></td>
</tr>

<tr>
<td>GPA: </td>
<td><input type="number" name="gpa" id="gpa" min="2.0" max="4.0" step="0.1" value="${sessionScope.person.gpa}" required disabled></td>
</tr>


</table>
<br/><br/>


Enter your Review / Comment <br/>
<textarea rows="3" cols="50" name="review" id="review" required disabled>
${sessionScope.person.review}
</textarea>
<br/><br/>
<input type= "button" name="edit" id="edit" value="Edit Profile" onclick="editPage()"></button>

<input type="submit" id="save" value="Save" onclick="return savePage()" disabled/>
 <br/>
<br/><br/>

</form>
</div>
</div>

<br/>
</center>

<script type="text/javascript">
function check()
{
	var course = document.getElementById("courseApplied").value;
	var university = document.getElementById("university").value;
	var gre = document.getElementById("greScore").value;
	var toefl = document.getElementById("toeflScore").value;
	var gpa = document.getElementById("gpa").value;
	var review = document.getElementById("review").value;
	
	if( (course.length < 1) || (university.length < 1) || (gre == 0) || (toefl == 0) || (review.length < 1) )
		alert("Your Profile is not complete! Please fill in all the Details!")
		return  false;
	
}
	
	
function editPage() {
	
	document.getElementById("edit").disabled = true;
	document.getElementById("firstName").disabled = false;
	document.getElementById("lastName").disabled = false;
	document.getElementById("age").disabled = false;
	document.getElementById("gender").disabled = false;
	document.getElementById("email").disabled = false;
	document.getElementById("university").disabled = false;
	document.getElementById("courseApplied").disabled = false;
	document.getElementById("greScore").disabled = false;
	document.getElementById("toeflScore").disabled = false;
	document.getElementById("gpa").disabled = false;
	document.getElementById("review").disabled = false;
	
	document.getElementById("save").disabled = false;
	
	return true;
}

function savePage()
{
	var stringPattern = /[a-zA-Z]+/;
	var emailRegex = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
	var firstName = document.getElementById("firstName").value;
	var lastName = document.getElementById("lastName").value;
	var gender = document.getElementById("gender").value;
	var review = document.getElementById("review").value;
	
	if(!stringPattern.test(firstName)){
		  document.currentProfile.firstName.focus();
		  document.getElementById("errorBox").innerHTML = "Enter a valid FirstName";
		  return false;
		  }
	
	if(!stringPattern.test(lastName)){
		  document.currentProfile.lastName.focus();
		  document.getElementById("errorBox").innerHTML = "Enter a valid LastName";
		  return false;
		  }
	if(!stringPattern.test(review)){
		  document.currentProfile.review.focus();
		  document.getElementById("errorBox").innerHTML = "Enter a valid review(Only characters)";
		  return false;
		  }
	 if(gender != 'male' && gender != 'Male' && gender != 'female' && gender != 'Female')
	  {
	  document.currentProfile.gender.focus();
	  document.getElementById("errorBox").innerHTML = "Enter a valid gender(Male/Female)";
	  return false;
	  }
	 
	 if(firstName != '' && lastName != '' && gender != '' && review != '')
	  {
	  return true;
	  }
 else 
	  return false;
	
}

</script>
</body>
</html>