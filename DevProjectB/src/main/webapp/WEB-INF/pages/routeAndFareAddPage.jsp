<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>customer</title>
</head>
<body>
<form action="/DevProjectB/admin/routeAndFareSuccess" method="POST">
<a href="/DevProjectB/admin/home">Go back to Admin Home Page</a> <br><br>
<h1>  Add Route and Fare Details</h1>
  Route and Fare ID:<br>
  <input type="text" name="routeAndFareID" ><br><br>
  Pickup City:<br>
  <input type="text" name="pickupCity" ><br><br>
  Destination City:<br>
  <input type="text" name="destinationCity" ><br><br>
  Swift Fare:<br>
  <input type="text" name="swiftFare" ><br><br>
  Innova Fare:<br>
  <input type="text" name="innovaFare" ><br><br>
  SUV Fare:<br>
  <input type="text" name="suvFare" ><br><br>
  
  <input type="submit" value="Submit">
  
</form>


</body>
</html>