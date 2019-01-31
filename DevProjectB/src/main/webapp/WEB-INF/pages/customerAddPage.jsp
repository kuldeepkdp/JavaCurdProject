<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>customer</title>
</head>
<body>
<form action="/DevProjectB/customerSuccess" method="POST">
<a href="/DevProjectB/goToHome">Go back to Home Page</a> <br><br>
<h1>  Add Customer Details</h1>
  Customer ID:<br>
  <input type="text" name="customerID" ><br><br>
  Customer Name:<br>
  <input type="text" name="customerName" ><br><br>
  Phone Number:<br>
  <input type="text" name="phoneNumber" ><br><br>
  Address:<br>
  <input type="text" name="customerAdress" ><br><br>
  
  <input type="submit" value="Submit">
  
</form>


</body>
</html>