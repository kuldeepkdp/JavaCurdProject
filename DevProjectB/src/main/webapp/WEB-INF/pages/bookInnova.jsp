<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Crud operation</title>
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
	<spring:url value="/resources/css/custom.css" var="custom" />
	<spring:url value="/resources/css/jquery-ui.min.css" var="jqueryUiCss" />
	<spring:url value="/resources/js/jquery-3.1.1.min.js" var="jqueryJs" />
	<spring:url value="/resources/js/jquery-ui.min.js" var="jqueryUiJs" />
    <spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJs" />
    <spring:url value="/resources/js/custom.js" var="customJs" />
    <link href="${bootstrapCss}" rel="stylesheet" />
	<link href="${bootstrapThemeCss}" rel="stylesheet" />
	<link href="${jqueryUiCss}" rel="stylesheet" />
	<link href="${custom}" rel="stylesheet" />
    <script src="${jqueryJs}"></script>
    <script src="${jqueryUiJs}"></script>
    <script src="${bootstrapJs}"></script>
    <script src="${customJs}"></script>
</head>
<body>
<a href="/DevProjectB/chooseCities">Go back to Home Page</a> <br><br>

<form action="/DevProjectB/book" method="POST">
<h1>Fill booking details</h1>
<table>
<tr>
<td>Your Pickup City:</td></tr>
 <tr><td><input type="text" name="pickupCity"  value= "${pickupCity}"  readonly ></td></tr>
  <tr><td> Your Destination City:</td></tr>
 <tr><td> <input type="text" name="destinationCity"  value= "${destinationCity}" readonly></td></tr>
  <tr><td>Amount:</tr></td>
  <input type="text" name="fare" value= "${innovaFare}" readonly> <br><br>
  <tr><td>Enter your Ph.No:</td></tr>
  <tr><td><input type="text" name="phoneNo"> </td></tr>
  <tr><td>Enter complete pickup address:
  <tr><td><input type="text" name="address"> </td></tr>
  <tr><td>Enter date of booking:
  <tr><td><input type="text" id="datepicker" name="date"></td></tr>
  <tr><td><input type="hidden" name="status" value="pending"></td></tr>
  <tr><td><input type="submit" value="BookNow"></td></tr>
  </table>
 </form>
 
</body>
</html>