<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Details</title>
</head>
<body>

<div style='height: 100px; background-color: gray;'>
            <br/>
            
            <h2><center>Enter the details of <font color="green">${param.count} University</center></font></h2>
        </div>
        <br/>
        <div style='height: 450px; background-color: rosybrown;'>
            <br/>
        <form method="post" action ='addUniversity.htm' commandName="university">
            <table border="2" cellpadding="5px" align='center'>
            <tr bgcolor="yellow">
                <th>University Name</th>
                <th>University Location</th>
                <th>GRE Requirement</th>
                <th>Reputation</th>
                <th>Fees</th>
                <th>Expense</th>
                <th>Weather</th>
            </tr>
           
            <c:forEach var="i" begin="1" end="${param.count}">
                <tr>
                    <td><input type='text' name="univName${i}" required></td>
                    <td><input type='text' name="univLocation${i}" required></td>
                    <td><input type='number' name="univGRE${i}" required></td>
                    <td><input type='number' name="reputation${i}" min="1" max="10" required></td>
                    <td><input type='number' name="fees${i}" min="1" max="10" required></td>
                    <td><input type='number' name="expense${i}" min="1" max="10" required></td>
                    <td><input type='number' name="weather${i}" min="1" max="10" required></td>
                </tr>
            </c:forEach>
                <tr>
                    
                </tr>
                <tr>
                    <input type="hidden" name="action" value="store">
            <input type="hidden" name="countfinal" value="${param.count}">
                    <td colspan="7"><center><input type="submit" value='Store'></center></td>
                </tr>
        
            </table>
            
        </form>
        </div>
    </body>

</body>
</html>