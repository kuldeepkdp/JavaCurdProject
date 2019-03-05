<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>customer</title>
</head>
<body>
<form action="/DevProjectB/riderEditSave" method="POST">

<a href="/DevProjectB/goToHome">Go back to Home Page</a> <br><br>

<h1>Edit Rider Details</h1>
<table>
<tr><td>
  Phone No:<br></tr></td>
  <tr><td><input type="text" name="phoneNo" value="${msg.phoneNo}" readonly></tr></td>
  <tr><td>Pickup:<br></tr></td>
  <tr><td><input type="text" name="pickupCity" value="${msg.pickupCity}" readonly></tr></td>
  <tr><td>Destination:</tr></td>
  <tr><td><input type="text" name="destinationCity" value="${msg.destinationCity}" readonly></tr></td>
  <tr><td>Fare:</tr></td>
  <tr><td><input type="text" name="fare" value="${msg.fare}" readonly></tr></td>
  <tr><td>Address:</tr></td>
  <tr><td><input type="text" name="address" value="${msg.address}" readonly></tr></td>
  <tr><td>Date:</tr></td>
  <tr><td><input type="text" name="date" value="${msg.date}"readonly></tr></td>
  <tr><td>Status:</tr></td>
  <tr><td><select  name="status"><option value="pending">Pending</option>
  <option value="approve">Approve</option><option value="reject">Reject</option></select><tr><td>
  
  <tr><td><input type="submit" value="Submit"></tr></td>
  </table>
</form>


</body>
</html>