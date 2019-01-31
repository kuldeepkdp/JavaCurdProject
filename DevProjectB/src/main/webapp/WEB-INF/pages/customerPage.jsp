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
   <th>Customer ID</th>
   <th>Customer Name</th>
   <th>Customer Address</th>
   <th>Customer Phone</th>
  </tr>

  <c:forEach items="${msg}" var="v">
   <tr>
    <td><c:out value="${v.customerID}"/></td>
    <td><c:out value="${v.customerName}"/></td>
    <td><c:out value="${v.phoneNumber}"/></td>
    <td><c:out value="${v.customerAdress}"/></td>
    <td><a href="editCustomer/${v.customerID}">Edit</a></td>  
    <td><a href="deleteCustomer/${v.customerID}">Delete</a></td>
   </tr>
  </c:forEach>
 </table>
 
 <br>

</body>
</html>