<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Compare Universities</title>

</head>
<body>
<div style='height: 400px; background-color: greenyellow;'>
<center>  
   <h1>Select the University to get the Review:</h1>
   <form id="univForm" method="post" action="compareUniversities.htm" >
            
            
            <select name="universityList" id="universityList" required>
            	<c:forEach var="univ" items="${sessionScope.univList}">
            	<option value="${univ.universityName}">${univ.universityName}</option>
            </c:forEach>
            </select>
            <input type="submit" value="Get Details">
   </form>
       <br/><br/>
       <div id="results">

            </div>       
 </center>
</div>

<script>
// AJAX

var xmlHttp;
xmlHttp = GetXmlHttpObject();

function getResults() {
	
	if (xmlHttp == null)
    {
        alert("Your browser does not support AJAX!");
        return;
    }
	else
		alert("AJAX!");
	
	
	
}


</script>
</body>
</html>