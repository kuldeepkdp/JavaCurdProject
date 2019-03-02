<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
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

<div class="bgcolorB">
<h1 class="colorA">Sign In</h1>
<form action="/DevProjectB/admin/home" method="POST"> 
  <h1>${msg}</h1>
  User ID:<br>
  <input type="text" name="userId" ><br>
  Password:<br>
  <input type="text" name="password" ><br><br>
  <input type="submit" value="Submit">
</form>
</div>

<footer class="container-fluid bgcolorA">
			
			<div class="container">
				<div class="row">
					<div class="col-md-9">
					    <h2>Contact Us</h2><br>
					    <p>A2z Info Solutions Pvt. Ltd.<br>
						   Lower Chutia, Near Shiv Mandir<br>
						   Ranchi-834001<br>
						   Jharkhand, India<br>
						   Contact No: +91-8460063820<br>
						   Email Id: kuldeep.kdp@gmail.com</p>
					</div>
					<div class="col-md-3">
					    <h2>Our Services</h2><br>
					    <p class="colorD"><a href="softwareDevelopment.html">Software development</a><br>
						   <a href="websiteDesiging.html">Website desiging</a><br>
						   <a href="softwareTesting.html">Software testing</a><br>
						   <a href="dataEntry.html">Data entry</a>
						   </p>
					</div>
				</div>
				
				<div class="row">
				    <div class="col-md-12 text-center">
					<h6>© A2z Info Solutions Pvt. Ltd.</h6>
					</div>
					
				</div>
			</div>
			
		</footer>
</body>
</html>