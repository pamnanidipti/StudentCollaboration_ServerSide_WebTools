<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>University Details</title>
</head>
<body>
<div style='height: 400px; background-color: greenyellow;'>
<center>  
   <h1>About the University:</h1>
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
            <tr>
            <td>${sessionScope.university.universityName}</td>
            <td>${sessionScope.university.universityLocation}</td>
            <td>${sessionScope.university.greRequired}</td>
            <td>${sessionScope.university.reputationRating}</td>
            <td>${sessionScope.university.feeRating}</td>
            <td>${sessionScope.university.expenseRating}</td>
            <td>${sessionScope.university.weatherRating}</td>
            </tr>
 </table>
 </center>
 </div>
</body>
</html>