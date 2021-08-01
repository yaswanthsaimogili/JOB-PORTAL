<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PostJob</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./css/postjob.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
	 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
</head>
<body>

<%

if(session.getAttribute("employeename")!=null)
{%>
	 <%@include file ="employeenavbar.jsp" %>
 <%}
else
{
	%>
	<%@include file ="Navbar.jsp" %>
	<% 
}
%>
<div class="welcome">

    <center>
    <b> Let's make your next great hire. Fast. </b>
	 <h5> We'll help you to find your need . </h5>
  <a href="employerlogin.jsp" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">PostJob</a>
  </center>
  
</div>
 </pre>
  
<center>  
<div class="card-deck" align="center">
  <div class="card p-0" class="rounded-sm">
    <div class="card-body">
      <h4 class="card-title">Step 1 </h4>
      <br>
	  <h5>Craete An Account</h5>
	  <br>
       <h6>-- Create an account by providing required details 
	                 <br>&nbsp &nbsp  of your company and recuter's details.
        </h6>				 
	   <br>
	   <br>
	</div>
  </div>
  <div class="card p-0"class="rounded-sm">
    <div class="card-body" >
      <h4 class="card-title">Step 2</h4>
      <br>
	  <h5>Build Your Post Job</h5>
	  <br>
	<h6> -- complete the postjob form by providing the required details. </h6>
		<br><br>
	</div>
  </div>
 <div class="card p-0" class="rounded-sm">
    <div class="card-body" >
      <h4 class="card-title">Step 3</h4>
      <br>
	  <h5>Post Your  Job</h5>
	  <br>
	  <h6> -- Finally,Your we can post your job without any cost 
	           <br>&nbsp &nbsp by submit the postjob form
	  </h6>
	  <br>
	  <br>
    </div>
  </div>
</div>
</center>
<!---  <img class="quote-mark" src="https://d3fw5vlhllyvee.cloudfront.net/allspark/static/images/quote-mark-e0f392.svg" alt="Quote mark icon" role="presentation"> --->


<section id="footer" class="text-center">
<%@ include file="footer.jsp" %>  

 </section>



 <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>


</body>
</html>