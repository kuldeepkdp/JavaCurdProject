<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>customer</title>
</head>
<body>
<form action="/DevProjectB/routeAndFareEditSave" method="POST">

<a href="/DevProjectB/goToHome">Go back to Home Page</a> <br><br>

<h1>Edit Route and Fare Details</h1>
<table>
<tr><td>
  Route and Fare ID:<br></tr></td>
  <tr><td><input type="text" name="routeAndFareID" value="${msg.routeAndFareID}" readonly></tr></td>
  <tr><td>Pickup City:<br></tr></td>
  <tr><td><input type="text" name="pickupCity" value="${msg.pickupCity}" ></tr></td>
  <tr><td>Destination City</tr></td>
  <tr><td><input type="text" name="destinationCity" value="${msg.destinationCity}" ></tr></td>
  <tr><td>Swift Fare:</tr></td>
  <tr><td><input type="text" name="swiftFare" value="${msg.swiftFare}" ></tr></td>
  <tr><td>Swift Fare:</tr></td>
  <tr><td><input type="text" name=innovaFare value="${msg.innovaFare}" ></tr></td>
  <tr><td>SUV Fare:</tr></td>
  <tr><td><input type="text" name="suvFare" value="${msg.suvFare}"></tr></td>
  
  <tr><td><input type="submit" value="Submit"></tr></td>
  </table>
</form>


</body>
</html>