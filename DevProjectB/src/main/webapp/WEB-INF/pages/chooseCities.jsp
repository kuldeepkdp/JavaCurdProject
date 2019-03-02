<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Choose your cities</title>
    <!-- Bootstrap -->
    
    <spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
	<spring:url value="/resources/css/bootstrap-theme.min.css" var="bootstrapThemeCss" />
	<spring:url value="/resources/css/custom.css" var="custom" />
    <spring:url value="/resources/js/jquery-3.1.1.min.js" var="jqueryJs" />
    <spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJs" />
	<link href="${bootstrapCss}" rel="stylesheet" />
	<link href="${bootstrapThemeCss}" rel="stylesheet" />
	<link href="${custom}" rel="stylesheet" />
    <script src="${jqueryJs}"></script>
    <script src="${bootstrapJs}"></script>
</head>
<body>

<h1> Choose your cities </h1>
<form action="/DevProjectB/fares" method="POST">
  <select name="pickupCity">
    <option value="Bokaro">Bokaro</option>
    <option value="Ranchi">Ranchi</option>
    <option value="Tata">Tata</option>
  </select>
  <br><br>
  <select name="destinationCity">
    <option value="Bokaro">Bokaro</option>
    <option value="Ranchi">Ranchi</option>
    <option value="Tata">Tata</option>
  </select>
  <input type="submit">
</form>

</body>
</html>