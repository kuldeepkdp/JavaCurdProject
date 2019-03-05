<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Crud operation</title>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>

<a href="/DevProjectB/goToHome">Go back to Home Page</a> <br><br>

<a href="/DevProjectB/customerAdd">Add new customers</a> <br><br>


 <table align="left" border="1">
  <tr>
   <th>Phone No</th>
   <th>Pickup</th>
   <th>Destinations</th>
   <th>Address</th>
   <th>Date</th>
   <th>Fare</th>
   <th>Status</th>
  </tr>

  <c:forEach items="${msg}" var="v">
   <tr>
    <td><c:out value="${v.phoneNo}"/></td>
    <td><c:out value="${v.pickupCity}"/></td>
    <td><c:out value="${v.destinationCity}"/></td>
    <td><c:out value="${v.address}"/></td>
    <td><c:out value="${v.date}"/></td>
    <td><c:out value="${v.fare}"/></td>
    <td><c:out value="${v.status}"/></td>
    <td><a href="editRider/${v.phoneNo}">Edit</a></td>  
    <td><a href="deleteRider/${v.phoneNo}">Delete</a></td>
    
   </tr>
  </c:forEach>
 </table>
 
 <br>

</body>
</html>