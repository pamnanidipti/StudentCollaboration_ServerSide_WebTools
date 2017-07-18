<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Results</title>
    </head>
    <body>
        <div style='height: 100px; background-color: gray;'>
            <br/>
        <h1><center><font color="white">Search Results</font></center></h1>
        </div>
        <hr>
        <div style='height: 400px; background-color: greenyellow;'>
            <h3>You searched for: <font color="blue"><%= request.getParameter("searchby") %> >> <%= request.getParameter("search") %></font></h3>
        
        <h3>Here are the search Results:</h3>
        <table border="2" cellpadding="5px">
            <tr bgcolor="orange">
                <th>FirstName</th>
                <th>LastName</th>
                <th>Role</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Email</th>
                <th>Profile</th>
                
            </tr>
            
            <c:forEach var="person" items="${sessionScope.personList}">
                <tr>
                    <td><c:out value="${person.firstName}"></c:out></td>
                    <td><c:out value="${person.lastName}"></c:out></td>
                    <td><c:out value="${person.role}"></c:out></td>
                    <td><c:out value="${person.age}"></c:out></td>
                    <td><c:out value="${person.gender}"></c:out></td>
                    <td><c:out value="${person.email}"></c:out></td>
                    <td><a href="viewProfile.htm?of=<c:out value="${person.username}"/>">View Profile</a></td>
                    
                </tr>
            </c:forEach>
        </table>
        <br/>
        </div>
    </body>
</html>