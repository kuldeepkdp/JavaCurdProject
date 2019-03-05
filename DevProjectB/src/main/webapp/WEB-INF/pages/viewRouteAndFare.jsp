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
   <th>Route And Fare ID</th>
   <th>Pickup</th>
   <th>Destinations</th>
   <th>Swift Fare</th>
   <th>Innova Fare</th>
   <th>Suv Fare</th>
   
  </tr>

  <c:forEach items="${msg}" var="v">
   <tr>
    <td><c:out value="${v.routeAndFareID}"/></td>
    <td><c:out value="${v.pickupCity}"/></td>
    <td><c:out value="${v.destinationCity}"/></td>
    <td><c:out value="${v.swiftFare}"/></td>
    <td><c:out value="${v.innovaFare}"/></td>
    <td><c:out value="${v.suvFare}"/></td>
    <td><a href="editRouteAndFare/${v.routeAndFareID}">Edit</a></td>  
    <td><a href="deleteRouteAndFare/${v.routeAndFareID}">Delete</a></td>
    
  
    
  </tr>
  </c:forEach>
 </table>
 
 <br>

</body>
</html>