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

<a href="/DevProjectB/chooseCities">Go back to Home Page</a> <br><br>



<form action="/DevProjectB/book" method="POST">
<h1>Fill booking details</h1>
  <input type="text" name="pickupCity"  value= "${pickupCity}"  readonly ><br><br>
  <input type="text" name="destinationCity"  value= "${destinationCity}" readonly><br><br>
  <input type="text" name="fare" value= "${swiftFare}" readonly> <br><br>
  <input type="text" name="phoneNo"> <br><br>
  <input type="text" name="address"> <br><br>
  <input type="submit" value="BookNow">
 </form>
 
</body>
</html>